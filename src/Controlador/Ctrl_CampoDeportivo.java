  
package Controlador;
import Formatos.Mensajes;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.CampoDeportivo;

public class Ctrl_CampoDeportivo {
    
    
        public boolean registrarCampo(CampoDeportivo cpd) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement ps = cn.prepareStatement("insert into tb_campodeportivo(nombre,ubicacion,estado) values (?,?,?);");
            
            ps.setString(1, cpd.getNombre());
            ps.setString(2, cpd.getUbicacion());
            cpd.setEstadoDisponible();
            ps.setInt(3, cpd.getEstado());
            if (ps.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
  

        } catch (SQLException e) {
            System.out.println("Error al guardar campo deportivo: " + e);
        }
            return respuesta;   
    }
        
        
         public boolean existeCampo(String nombre) {
        boolean respuesta = false;
        String sql = "select nombre from tb_campodeportivo where nombre = '" + nombre + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar campo: " + e);
        }
        return respuesta;
    }
        
   //metodo que recupera un registro de la tabla categoria mediante su id
 public CampoDeportivo ConsultarIDCampo(int idcampo){
     CampoDeportivo cpd = null;
     Connection con = Conexion.conectar();
      Statement st;
      String sql = "select idCampo,nombre,ubicacion,"
                 + "estado from tb_campodeportivo WHERE  estado in ('1','2') and idCampo="+idcampo+";";

     try{
           st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         
         if(rs.next()){
             cpd = new CampoDeportivo();
             cpd.setIdCampo(rs.getInt(1));
             cpd.setNombre(rs.getString(2));
             cpd.setUbicacion(rs.getString(3));
             cpd.setEstado(rs.getInt(4));
         }
         rs.close();
     }catch(Exception e){
         Mensajes.M1("ERROR no se puede consultar el registro ..."+e);
     }
     return cpd;
 }
 
 // vista frmcampo_deport y frmreserva
//metodo para que se extraigan datos en la reserva
  public CampoDeportivo ConsultarCampoReserva(String nombre){
     CampoDeportivo cpd = null;
     Connection con = Conexion.conectar();
      Statement st;
      String sql ="select * from tb_campodeportivo where estado='1' and nombre='"+nombre+"';";

     try{
           st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         
         if(rs.next()){
             cpd = new CampoDeportivo();
             cpd.setIdCampo(rs.getInt(1));
             cpd.setNombre(rs.getString(2));
             cpd.setUbicacion(rs.getString(3));
            
            
         }
         rs.close();
     }catch(Exception e){
         Mensajes.M1("ERROR no se puede consultar el registro ..."+e);
     }
     return cpd;
 }
 
 
 //método que actualiza un registro  de la tabla categoria por medio de su id
 public void ActualizarCampo(CampoDeportivo cpd){
     Connection cn = conexion.Conexion.conectar();
     try{
        PreparedStatement ps = cn.prepareStatement("update tb_campodeportivo set nombre=?,ubicacion=?,estado=? where idCampo=?;");

         ps.setString(1,cpd.getNombre());
         ps.setString(2,cpd.getUbicacion());
         ps.setInt(3, cpd.getEstado());
         ps.setInt(4,cpd.getIdCampo());
         ps.executeUpdate();
         Mensajes.M1("Campo actualizado correctamente :3 ...");
         ps.close();
     }catch(Exception  ex){
         Mensajes.M1("ERROR no se puede actualizar el campo :c..."+ex);
     }
 }
    
 
  //método que elimina (inhabilita) un registro de la tabla categorias
 public void EliminarCampo(CampoDeportivo cpd,int idcampo){
     
     Connection cn = conexion.Conexion.conectar();
     try{
         PreparedStatement ps = cn.prepareStatement("update tb_campodeportivo set estado=? where idCampo=?;");
         cpd.setEstadoEliminado();
         ps.setInt(1, cpd.getEstado());
         ps.setInt(2,idcampo);
         ps.executeUpdate();
         Mensajes.M1("Registro eliminado de la tabla ");
         ps.close();
     }catch(Exception ex){
         Mensajes.M1("ERROR no se puede eliminar el registro.."+ex);
     }
 } 
 
 
}
