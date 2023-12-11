
package Vista;
import Controlador.Ctrl_Cancha;
import Formatos.Mensajes;
import Modelo.Cancha;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCancha extends javax.swing.JInternalFrame {
    
    Cancha can = new Cancha();
    Ctrl_Cancha controlcan = new Ctrl_Cancha();

    public FrmCancha() {
        initComponents();
        this.setTitle("Deporte");
        jtxtIdDeporte.setEnabled(false);
        jtxtEstado.setEnabled(false);
        MostrarDatos();
 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnConsultar = new javax.swing.JButton();
        jbtnActualizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jtxtIdDeporte = new javax.swing.JTextField();
        jtxtDescripcionDeporte = new javax.swing.JTextField();
        jtxtPrecioMinuto = new javax.swing.JTextField();
        jtxtEstado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jlblCantidadregistros = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(208, 217, 221));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setText("REGISTRAR");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, 50));

        jbtnConsultar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConsultar.setText("CONSULTAR");
        jbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, 50));

        jbtnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setText("ACTUALIZAR");
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 610));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 230, 630));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO CAMPO DEPORTIVO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtIdDeporte.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jtxtIdDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdDeporteActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtIdDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 50));

        jtxtDescripcionDeporte.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel8.add(jtxtDescripcionDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 330, 70));

        jtxtPrecioMinuto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PRECIO POR MINUTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel8.add(jtxtPrecioMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 180, 70));

        jtxtEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel8.add(jtxtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 90, 60));

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 920, 290));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA DE CAMPOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

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
        jScrollPane2.setViewportView(jtblDatos);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 870, 200));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 27, 910, 200));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 920, 240));

        jlblCantidadregistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblCantidadregistros.setText("Cantidad de Registros :");
        jPanel5.add(jlblCantidadregistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 610));

        jPanel7.setBackground(new java.awt.Color(208, 217, 221));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
            
         if ( jtxtDescripcionDeporte.getText().isEmpty() 
                 || jtxtPrecioMinuto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else {
            //validamos si el usuaro ya esta registrado
            
            
            if (!controlcan.existeCancha(jtxtDescripcionDeporte.getText().trim())) {
                //enviamos datos del usuario
                
                can.setDescripcion(jtxtDescripcionDeporte.getText().trim());
                can.setPrecioMinuto(Float.parseFloat(jtxtPrecioMinuto.getText().trim()));
                
                if (controlcan.registrarCancha(can)) {
                    JOptionPane.showMessageDialog(null, "¡Canchita Registrada!");
                                        this.MostrarDatos();

                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar Deporte!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La descripcion ya está registrada, ingrese otro.");
            }
        }
        Limpiar();



    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jtxtIdDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdDeporteActionPerformed

    }//GEN-LAST:event_jtxtIdDeporteActionPerformed

    private void jbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsultarActionPerformed

        
        jtxtEstado.setEnabled(true);
        int idCan = Mensajes.M2("Ingrese el ID del deporte a buscar...");
        can=controlcan.ConsultarIDCancha(idCan);

        if(can==null){
            Mensajes.M1("El id "+idCan+" no existe en la tabla...");
        }else{
            jtxtIdDeporte.setText(Integer.toString(can.getIdCancha()));
            jtxtDescripcionDeporte.setText(can.getDescripcion());
            jtxtPrecioMinuto.setText(String.valueOf(can.getPrecioMinuto()));
            
        if((can.getEstado())==1){
           jtxtEstado.setText("Disponible");
           }else if(can.getEstado()==2){
           jtxtEstado.setText("Mantenimiento");
           }

            jbtnRegistrar.setEnabled(false);
            jbtnConsultar.setEnabled(false);
            jbtnActualizar.setEnabled(true);
            

           

        }

    }//GEN-LAST:event_jbtnConsultarActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed

        
        
        can.setDescripcion(jtxtDescripcionDeporte.getText().trim());
        can.setPrecioMinuto(Float.parseFloat(jtxtPrecioMinuto.getText().trim()));
        switch (Integer.parseInt((jtxtEstado).getText())) {
            case 1:
                can.setEstadoDisponible();
                break;
            case 2:
                can.setEstadoMantenimiento();
                break;
            default:
                Mensajes.M1("Error en el campo estado");
                break;
        }
        can.setIdCancha(Integer.parseInt(jtxtIdDeporte.getText()));
        controlcan.ActualizarCancha(can);
        MostrarDatos();
        Limpiar();
        jbtnRegistrar.setEnabled(true);
        jbtnConsultar.setEnabled(true);
        jbtnActualizar.setEnabled(false);
        jtxtEstado.setEnabled(false);
    }//GEN-LAST:event_jbtnActualizarActionPerformed

    

        public void MostrarDatos(){
     Connection con = Conexion.conectar();
        Statement st;
     String[] titulos={"Nro","ID ","Descripción","Precio por Minuto","Estado"};
     DefaultTableModel modelo = new DefaultTableModel(null,titulos);
     jtblDatos.setModel(modelo);
     String sql = "select * from tb_cancha where estado in ('1','2');";
     Cancha can =  new Cancha();
     int cantreg=0;
     try{
         st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             
             cantreg++;
             can.setIdCancha(rs.getInt(1));
             can.setDescripcion(rs.getString(2));
             can.setPrecioMinuto(rs.getFloat(3));
             can.setEstado(rs.getInt(4));
            
             modelo.addRow(can.RegistroDeporte(cantreg));
         }//fin while
        
         jlblCantidadregistros.setText("Cantidad de Registros  : "+cantreg);
         con.close();         
     }catch(Exception e){
         Mensajes.M1("ERROR no se pueden mostrar la lista de canchas ...."+e);
     }
 }  
    
    
 public  void Limpiar(){
   jtxtIdDeporte.setText("");
    jtxtDescripcionDeporte.setText("");
    jtxtPrecioMinuto.setText("");
    jtxtEstado.setText("");
    jtxtDescripcionDeporte.requestFocus();
}
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jbtnActualizar;
    public javax.swing.JButton jbtnConsultar;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JLabel jlblCantidadregistros;
    public javax.swing.JTable jtblDatos;
    public javax.swing.JTextField jtxtDescripcionDeporte;
    public javax.swing.JTextField jtxtEstado;
    public javax.swing.JTextField jtxtIdDeporte;
    public javax.swing.JTextField jtxtPrecioMinuto;
    // End of variables declaration//GEN-END:variables
}
