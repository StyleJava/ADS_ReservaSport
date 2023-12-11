
package Vista;

import Controlador.Ctrl_CampoDeportivo;
import Controlador.Ctrl_Campo_Cancha;
import Formatos.Mensajes;
import Modelo.CampoDeportivo;
import Modelo.Campo_Cancha;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCampo_Cancha extends javax.swing.JInternalFrame {
    
      CampoDeportivo cpd = new CampoDeportivo();
     Ctrl_CampoDeportivo controlcpd = new Ctrl_CampoDeportivo();
  
    public FrmCampo_Cancha() {
        initComponents();
        CargarDeporte();
        CargarCampo();
        MostrarDatos();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcbxIdCancha = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jcbxIdCampo = new javax.swing.JComboBox<>();
        jtxtNombreCampo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbxIdCancha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jcbxIdCancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, 55));

        jtblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 191));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jButton1.setText("ENLAZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbxIdCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbxIdCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxIdCampoActionPerformed(evt);
            }
        });
        jPanel3.add(jcbxIdCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 199, 78));

        jtxtNombreCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Id Campo"));
        jPanel3.add(jtxtNombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 165, 61));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 500, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        
            if (jcbxIdCampo.getSelectedItem().equals("-Seleccione-") || jcbxIdCancha.getSelectedItem().equals("-Seleccione-")   ) {
            JOptionPane.showMessageDialog(null, "Slecciona bonito pos mijo");
        } else {
           
                Campo_Cancha relacion = new Campo_Cancha();
                Ctrl_Campo_Cancha controlRelacion = new Ctrl_Campo_Cancha();
            
               
                relacion.setIdCampo(Integer.parseInt(jtxtNombreCampo.getText()));
                relacion.setIdCancha(jcbxIdCancha.getSelectedIndex());
                
                if (controlRelacion.Enlazar(relacion)) {
                    JOptionPane.showMessageDialog(null, "¡Campo Registrado!");
                                        this.MostrarDatos();

                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar Campo!");
                }
                  
            } 
        
                  Limpiar();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbxIdCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxIdCampoActionPerformed

       
           String nombre = (String) jcbxIdCampo.getSelectedItem();
        cpd=controlcpd.ConsultarCampoReserva(nombre);
        
        if(jcbxIdCampo.getSelectedItem()=="---Seleccione el campo---"){
        jtxtNombreCampo.setText("");

        }else if (jcbxIdCampo.getSelectedIndex()>-1){
       
        jtxtNombreCampo.setText(String.valueOf(cpd.getIdCampo()));
        }
    }//GEN-LAST:event_jcbxIdCampoActionPerformed

    
     public  void Limpiar(){
   jcbxIdCancha.setSelectedIndex(0);
   jcbxIdCampo.setSelectedIndex(0);
    
}
    
    
    private void CargarDeporte () {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_cancha where estado='1';";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jcbxIdCancha.removeAllItems();
            jcbxIdCancha.addItem("---Seleccione la cancha---");
            while (rs.next()) {
                jcbxIdCancha.addItem(rs.getString("idCancha" )+ " : "  + rs.getString("descripcion"));
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("¡Error al cargar campos, !" + e);
        }
    }
    
     private void CargarCampo() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_campodeportivo where estado='1';";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jcbxIdCampo.removeAllItems();
            jcbxIdCampo.addItem("---Seleccione el campo---");
            while (rs.next()) {
                jcbxIdCampo.addItem(rs.getString("nombre" ));
                
                
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("¡Error al cargar campos, !" + e);
        }
    }
    
        public void MostrarDatos(){
     Connection con = Conexion.conectar();
        Statement st;
     String[] titulos={"Nro","ID RELACION","ID CAMPO "," ID DEPORTE "};
     DefaultTableModel modelo = new DefaultTableModel(null,titulos);
     jtblDatos.setModel(modelo);
        String sql = "SELECT cdc.idCampoCancha, cdc.idCampo, cdc.idCancha\n" +
                     "FROM tb_campodeportivo_cancha cdc\n" +
                     "JOIN tb_campodeportivo c ON cdc.idCampo = c.idCampo\n" +
                     "JOIN tb_cancha d ON cdc.idCancha = d.idCancha\n" +
                     "WHERE c.estado = 1 AND d.estado = 1;";
     Campo_Cancha relacion =  new Campo_Cancha();
     int cantreg=0;
     try{
         st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             cantreg++;
             relacion.setIdCampoCancha(rs.getInt(1));
             relacion.setIdCampo(rs.getInt(2));
             relacion.setIdCancha(rs.getInt(3));
             
             modelo.addRow(relacion.RegistroRelacion(cantreg));
         }//fin while
        
        
         con.close();         
     }catch(Exception e){
         Mensajes.M1("ERROR no se pueden mostrar las categorias ...."+e);
     }
 }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<String> jcbxIdCampo;
    public javax.swing.JComboBox<String> jcbxIdCancha;
    public javax.swing.JTable jtblDatos;
    private javax.swing.JTextField jtxtNombreCampo;
    // End of variables declaration//GEN-END:variables
}
