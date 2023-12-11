
package Vista;

import Controlador.Ctrl_CampoDeportivo;
import Controlador.Ctrl_Cliente;
import Controlador.Ctrl_Campo_Cancha;
import Controlador.Ctrl_Cancha;
import Controlador.Ctrl_GestionarReserva;
import Controlador.Ctrl_Reserva;
import Controlador.VentaPDF;
import Formatos.Mensajes;
import Modelo.CampoDeportivo;
import Modelo.Cliente;
import Modelo.Cancha;
import Modelo.Reserva;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FrmGestionarReserva extends javax.swing.JInternalFrame {

     
    Cliente cli = new Cliente();
     Ctrl_Cliente controlcli = new Ctrl_Cliente();
     
     
     CampoDeportivo cpd = new CampoDeportivo();
     Ctrl_CampoDeportivo controlcpd = new Ctrl_CampoDeportivo();
     
     Cancha depor= new Cancha();
     Ctrl_Cancha controldepor=new Ctrl_Cancha();
     
     
     Ctrl_Campo_Cancha relacion= new Ctrl_Campo_Cancha();
     
      Reserva rsa = new Reserva();
     Ctrl_Reserva controlrsa= new Ctrl_Reserva();
     
     
     FrmReserva frmres= new FrmReserva();
      Ctrl_GestionarReserva controlGesReser= new Ctrl_GestionarReserva();
    public FrmGestionarReserva() {

        initComponents();
         MostrarDatos2();
        txtEstado.setEnabled(false);
        txtIdG.setEnabled(false);
        txtNombreCliente.setEnabled(false);
        txtEstadoG.setEnabled(false);
        this.setTitle("Nueva Reserva");
   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGestionarReserva = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtEstado = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtIdG = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtEstadoG = new javax.swing.JTextField();
        cbxEstadoG = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(76, 61, 49));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblGestionarReserva.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblGestionarReserva);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 1010, 300));

        jPanel1.setBackground(new java.awt.Color(210, 204, 162));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Reserva"));

        txtNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre Cliente"));

        txtIdG.setBorder(javax.swing.BorderFactory.createTitledBorder("Id Reserva"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(txtIdG, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 730, 110));

        jPanel2.setBackground(new java.awt.Color(209, 235, 218));

        txtEstadoG.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre Estado"));

        cbxEstadoG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "3", "4" }));
        cbxEstadoG.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualziar Estado"));
        cbxEstadoG.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEstadoGItemStateChanged(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(cbxEstadoG, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtEstadoG, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstadoG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEstadoG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 730, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed


       
        int id = Mensajes.M2("Ingrese el id de la reserva a buscar...");
        rsa=controlGesReser.ConsultarReserva(id);
        
           if(rsa==null){
               Mensajes.M1("El Id "+id+" no existe en la tabla...");
           }else{
               txtIdG.setText(String.valueOf(id));
               txtEstado.setText(String.valueOf(rsa.getEstado()));
               txtNombreCliente.setText(rsa.getNombreCliente());
           }




    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbxEstadoGItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEstadoGItemStateChanged
        
        if(cbxEstadoG.getSelectedIndex()==0){
            txtEstadoG.setText("");
        }else{
        if(cbxEstadoG.getSelectedItem()=="3"){
            txtEstadoG.setText(" Consumida ");
             
        }else {
            txtEstadoG.setText(" Cancelada ");
        }
        }

    }//GEN-LAST:event_cbxEstadoGItemStateChanged

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
            if(txtEstadoG.getText().equalsIgnoreCase("")){
                Mensajes.M1("ELIGE CORRECTAMENTE");
            }else{
            if(txtEstadoG.getText().equalsIgnoreCase("Consumida")){
            rsa.setEstadoConsumida();
            
        }else {
           rsa.setEstadoCancelada();
        }
          rsa.setIdReserva(Integer.parseInt(txtIdG.getText()));
          controlGesReser.ActualizarReserva(rsa);
            MostrarDatos2();
            }
    }//GEN-LAST:event_btnActualizarActionPerformed

    

    
     public void MostrarDatos2(){
     Connection con = Conexion.conectar();
        Statement st;
        
    
        
     String[] titulos={"Nro","ID Reserva","ID Cliente ","ID Campo","ID Cancha","Fecha","Hora Inicio","Hora Fin","Duración","1° Pago","2° Pago","Pago Total","Estado"};
     DefaultTableModel modelo = new DefaultTableModel(null,titulos);
     tblGestionarReserva.setModel(modelo);
        String sql = "select idReserva,idCliente,idCampo,idCancha,fecha,horaInicio,horaFin,duracion,primerPago,segundoPago,pagototal,estado from tb_reserva where estado in ('1','2');";
     Reserva rsa= new Reserva();
     int cantreg=0;
     try{
         st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             cantreg++;
             rsa.setIdReserva(rs.getInt(1));
             rsa.setIdCliente(rs.getInt(2));
             rsa.setIdCampo(rs.getInt(3));
             rsa.setIdCancha(rs.getInt(4));
             
             rsa.setFechaReserva(rs.getDate(5));
             
             LocalTime horaInicio = rs.getTime(6).toLocalTime();
             rsa.setHoraInicio(horaInicio);
             
             
             LocalTime horaFin = rs.getTime(7).toLocalTime();
             rsa.setHoraFin(horaFin);
            
             rsa.setDuracion(rs.getInt(8));
             rsa.setPrimerPago(rs.getFloat(9));
             rsa.setSegundoPago(rs.getFloat(10));
             rsa.setPagototal(rs.getFloat(11));
             rsa.setEstado(rs.getInt(12));

             
             
             modelo.addRow(rsa.RegistroReserva(cantreg));
         }//fin while
        
        
         con.close();         
     }catch(Exception e){
         Mensajes.M1("ERROR no se pueden mostrar la tabla ...."+e);
     }
 }  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    public javax.swing.JComboBox<String> cbxEstadoG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tblGestionarReserva;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtEstadoG;
    public javax.swing.JTextField txtIdG;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables


  


 
   
}