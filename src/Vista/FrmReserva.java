
package Vista;

import Controlador.Ctrl_CampoDeportivo;
import Controlador.Ctrl_Cliente;
import Controlador.Ctrl_Campo_Cancha;
import Controlador.Ctrl_Cancha;
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
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FrmReserva extends javax.swing.JInternalFrame {
    Cliente cli = new Cliente();
     Ctrl_Cliente controlcli = new Ctrl_Cliente();
     
     
     CampoDeportivo cpd = new CampoDeportivo();
     Ctrl_CampoDeportivo controlcpd = new Ctrl_CampoDeportivo();
     
     Cancha depor= new Cancha();
     Ctrl_Cancha controldepor=new Ctrl_Cancha();
     
     
     Ctrl_Campo_Cancha relacion= new Ctrl_Campo_Cancha();
     
      Reserva rsa = new Reserva();
     Ctrl_Reserva controlrsa= new Ctrl_Reserva();
     
     DefaultTableModel modelo;
    ArrayList<Reserva> listaReserva = new ArrayList<>();
       float MontoF= 0f;
    public FrmReserva() {
        
        initComponents();
        setModelo();
        this.setTitle("Nueva Reserva");
        CargarComboCampoDeportivo();
        txtCodigoCliente.setEnabled(false);
        txtNombreCliente.setEnabled(false);
        txtCodigoCampo.setEnabled(false);
        txtCodigoDescripcion.setEnabled(false);
        txtPrecioMinutoCampo.setEnabled(false);
        txtDuracion.setEnabled(false);
        txtPagototal.setEnabled(false);
        txtPorcentajeReserva.setEnabled(false);        
        txtPrimerPago.setEnabled(false);
        txtSegundoPago.setEnabled(false);
        txtIdReserva.setText(String.valueOf(controlrsa.id_reserva_auto()));
        txtEstado.setEnabled(false);        
    }

    private void setModelo(){
        
        String[] cabecera={"Nro","ID Reserva","ID Cliente ","ID Campo","ID Cancha","Fecha","Hora Inicio","Hora Fin","Duración","1° Pago","2° Pago","Pago Total","Estado"};
     modelo = new DefaultTableModel(null,cabecera);
     tblReserva.setModel(modelo);
        
        
        
    }
  
    public void listaTablaProductos() {
        this.modelo.setRowCount((listaReserva.size()));
        
        for (int i = 0; i < (listaReserva.size()); i++) {
            this.modelo.setValueAt(i + 1, i, 0);
            this.modelo.setValueAt(listaReserva.get(i).getIdReserva(), i, 1);
            this.modelo.setValueAt(listaReserva.get(i).getNombreCliente(), i, 2);
            this.modelo.setValueAt(listaReserva.get(i).getNombreCampo(), i, 3);
            this.modelo.setValueAt(listaReserva.get(i).getNombreCancha(), i, 4);
            Date fechaReserva = listaReserva.get(i).getFechaReserva();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = sdf.format(fechaReserva);

            this.modelo.setValueAt(fechaFormateada, i, 5);
            
            this.modelo.setValueAt(listaReserva.get(i).getHoraInicio(), i, 6);
            this.modelo.setValueAt(listaReserva.get(i).getHoraFin(), i, 7);
            this.modelo.setValueAt(listaReserva.get(i).getDuracion(), i, 8);
            this.modelo.setValueAt(listaReserva.get(i).getPrimerPago(), i, 9);
            this.modelo.setValueAt(listaReserva.get(i).getSegundoPago(), i, 10);
            this.modelo.setValueAt(listaReserva.get(i).getPagototal(), i, 11);
            this.modelo.setValueAt(listaReserva.get(i).getNombreEstado(), i, 12);
        }
        //añadir al Jtable
        tblReserva.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtDniCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        jButton_busca_cliente = new javax.swing.JButton();
        txtCodigoCliente = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtPrecioMinutoCampo = new javax.swing.JTextField();
        cbxNombreCampo = new javax.swing.JComboBox<>();
        txtCodigoCampo = new javax.swing.JTextField();
        cbxDeportes = new javax.swing.JComboBox<>();
        txtCodigoDescripcion = new javax.swing.JTextField();
        txtPorcentajeReserva = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtHoraFin = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        txtHoraInicio = new javax.swing.JTextField();
        txtPagototal = new javax.swing.JTextField();
        txtSegundoPago = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtIdReserva = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnImprimir = new javax.swing.JButton();
        txtPrimerPago = new javax.swing.JTextField();
        jdateFecha = new com.toedter.calendar.JDateChooser();
        txtMontoFinal = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JComboBox<>();
        txtEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReserva = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(76, 61, 49));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(169, 152, 119));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(242, 232, 208));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDniCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDniCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        jPanel4.add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 120, 60));

        txtNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel4.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 190, 60));

        jButton_busca_cliente.setBackground(new java.awt.Color(0, 0, 0));
        jButton_busca_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_busca_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jButton_busca_cliente.setText("Buscar");
        jButton_busca_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_busca_clienteActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_busca_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 40));

        txtCodigoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel4.add(txtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 100, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 600, 120));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 620, 170));

        jPanel7.setBackground(new java.awt.Color(169, 152, 119));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Campo Deportivo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(238, 232, 209));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecioMinutoCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio por Minuto"));
        jPanel8.add(txtPrecioMinutoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 130, 60));

        cbxNombreCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxNombreCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        cbxNombreCampo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNombreCampoItemStateChanged(evt);
            }
        });
        cbxNombreCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNombreCampoActionPerformed(evt);
            }
        });
        jPanel8.add(cbxNombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 70));

        txtCodigoCampo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo Campo"));
        jPanel8.add(txtCodigoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, 60));

        cbxDeportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxDeportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion"));
        cbxDeportes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxDeportesItemStateChanged(evt);
            }
        });
        jPanel8.add(cbxDeportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 70));

        txtCodigoDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo Descripcion"));
        jPanel8.add(txtCodigoDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 140, 60));

        txtPorcentajeReserva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorcentajeReserva.setText("40%");
        txtPorcentajeReserva.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porcentaje Reserva", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtPorcentajeReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorcentajeReservaActionPerformed(evt);
            }
        });
        jPanel8.add(txtPorcentajeReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 140, 60));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 590, 200));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 620, 250));

        jPanel5.setBackground(new java.awt.Color(147, 133, 107));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos De Reserva", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(242, 238, 221));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHoraFin.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora Fin"));
        jPanel6.add(txtHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 100, 60));

        txtDuracion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDuracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDuracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Duración Minutos"));
        jPanel6.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 120, 60));

        txtHoraInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora Inicio"));
        jPanel6.add(txtHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 60));

        txtPagototal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPagototal.setBorder(javax.swing.BorderFactory.createTitledBorder("Total "));
        jPanel6.add(txtPagototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 100, 60));

        txtSegundoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo Pago"));
        jPanel6.add(txtSegundoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 110, 60));

        jPanel2.setBackground(new java.awt.Color(147, 133, 107));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 10, 400));

        jPanel9.setBackground(new java.awt.Color(147, 133, 107));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCalcular.setBackground(new java.awt.Color(234, 213, 173));
        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(83, 68, 49));
        btnCalcular.setText("CALCULAR");
        btnCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(234, 213, 173));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(83, 68, 49));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtIdReserva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdReserva.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(234, 213, 173));
        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(83, 68, 49));
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(11, 11, 11)))
                .addGap(30, 30, 30)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 160, 400));

        txtPrimerPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Primer Pago"));
        txtPrimerPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerPagoActionPerformed(evt);
            }
        });
        jPanel6.add(txtPrimerPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 100, 60));

        jdateFecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jdateFecha.setDateFormatString("yyyy-MM-dd");
        jPanel6.add(jdateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 80));

        txtMontoFinal.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto Final "));
        txtMontoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoFinalActionPerformed(evt);
            }
        });
        jPanel6.add(txtMontoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 110, 60));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-S-", "1", "2" }));
        cbxEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEstadoItemStateChanged(evt);
            }
        });
        jPanel6.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 100, 50));
        jPanel6.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 110, 50));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 670, 400));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 700, 450));

        tblReserva.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblReserva);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 1320, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_busca_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_busca_clienteActionPerformed
        
        int DNI =Integer.parseInt(txtDniCliente.getText().trim());
        cli=controlcli.ConsultarCliente(DNI);
        txtNombreCliente.setText(cli.getNombre());
        txtCodigoCliente.setText(String.valueOf(cli.getIdCliente()));
      
    }//GEN-LAST:event_jButton_busca_clienteActionPerformed

    private void txtPorcentajeReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorcentajeReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcentajeReservaActionPerformed

    private void txtPrimerPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerPagoActionPerformed

    private void txtMontoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoFinalActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        VentaPDF pdf= new VentaPDF();
        pdf.DatosCliente(Integer.parseInt(txtCodigoCliente.getText()));
        pdf.generarFacturaPDF();
         Limpiar();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        Reserva rsa = new Reserva();
        Ctrl_Reserva controlrsa= new Ctrl_Reserva();

        //enviamos datos del usuario
        rsa.setIdReserva(Integer.parseInt(txtIdReserva.getText().trim()));
        rsa.setNombreCliente(txtNombreCliente.getText());

        rsa.setNombreCampo(String.valueOf(cbxNombreCampo.getSelectedItem()));

        rsa.setNombreCancha((String )cbxDeportes.getSelectedItem());

        rsa.setFechaReserva(jdateFecha.getDate());
        rsa.setHoraInicio(LocalTime.parse(txtHoraInicio.getText()));
        rsa.setHoraFin(LocalTime.parse(txtHoraFin.getText()));
        rsa.setDuracion(Integer.parseInt(txtDuracion.getText()));
        rsa.setPrimerPago(Float.parseFloat(txtPrimerPago.getText()));
        rsa.setSegundoPago(Float.parseFloat(txtSegundoPago.getText()));
        rsa.setPagototal(Float.parseFloat(txtPagototal.getText().trim()));
        rsa.setNombreEstado(txtEstado.getText().trim());
        
        listaReserva.add(rsa);
        JOptionPane.showMessageDialog(null, "Producto Agregado");

        listaTablaProductos();

        /*
        VentaPDF pdf= new VentaPDF();
        pdf.DatosCliente(Integer.parseInt(txtCodigoCliente.getText()));
        pdf.generarFacturaPDF();
        */

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        Reserva rsa = new Reserva();
        Ctrl_Reserva controlrsa= new Ctrl_Reserva();

        //enviamos datos del usuario
        rsa.setIdReserva(Integer.parseInt(txtIdReserva.getText().trim()));
        rsa.setIdCliente(Integer.parseInt(txtCodigoCliente.getText().trim()));
        rsa.setIdCampo(Integer.parseInt(txtCodigoCampo.getText().trim()));
        rsa.setIdCancha(Integer.parseInt(txtCodigoDescripcion.getText().trim()));
        rsa.setFechaReserva(jdateFecha.getDate());
        rsa.setHoraInicio(LocalTime.parse(txtHoraInicio.getText()));
        rsa.setHoraFin(LocalTime.parse(txtHoraFin.getText()));
        rsa.setDuracion(Integer.parseInt(txtDuracion.getText()));
        rsa.setPrimerPago(Float.parseFloat(txtPrimerPago.getText()));
        rsa.setSegundoPago(Float.parseFloat(txtSegundoPago.getText()));
        rsa.setPagototal(Float.parseFloat(txtPagototal.getText().trim()));
        
         if(cbxEstado.getSelectedItem()=="1"){
           rsa.setEstadoPagoPendiendte();
            
        }else if(cbxEstado.getSelectedItem()=="2") {
           rsa.setEstadoPagoLiquidado();
        }
        
        MontoF=MontoF+(Float.parseFloat(txtPagototal.getText()));
        txtMontoFinal.setText(String.valueOf(MontoF));

        if (controlrsa.Insertar(rsa)) {
            JOptionPane.showMessageDialog(null, "¡Reserva Registrada!");
            txtIdReserva.setText(String.valueOf(controlrsa.id_reserva_auto())); 
            /*
            VentaPDF pdf= new VentaPDF();
            pdf.DatosCliente(Integer.parseInt(txtCodigoCliente.getText()));
            pdf.generarFacturaPDF();
            */
        } else {
            JOptionPane.showMessageDialog(null, "¡Error al registrar cliente!");
        }
       

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        LocalTime horaInicio = LocalTime.parse(txtHoraInicio.getText());
        LocalTime horaFin = LocalTime.parse(txtHoraFin.getText());
        long duracionMinutos = ChronoUnit.MINUTES.between(horaInicio, horaFin);
        float costoTotal = (duracionMinutos * (Float.parseFloat(txtPrecioMinutoCampo.getText())));
        float porcentaje= 0.4f;
        float primerPago = costoTotal * porcentaje;
        float segundoPago = costoTotal - primerPago;

        txtDuracion.setText(String.valueOf(duracionMinutos));
        txtPagototal.setText(String.valueOf(costoTotal));
        txtPrimerPago.setText(String.valueOf(primerPago));
        txtSegundoPago.setText(String.valueOf(segundoPago));

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cbxNombreCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNombreCampoActionPerformed

        String nombre = (String) cbxNombreCampo.getSelectedItem();
        cpd=controlcpd.ConsultarCampoReserva(nombre);

        if(cbxNombreCampo.getSelectedItem()=="---Seleccione el campo---"){
            txtCodigoCampo.setText("");

        }else if (cbxNombreCampo.getSelectedIndex()>-1){

            txtCodigoCampo.setText(String.valueOf(cpd.getIdCampo()));
            cargarDeportes();

        }

    }//GEN-LAST:event_cbxNombreCampoActionPerformed

    private void cbxNombreCampoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNombreCampoItemStateChanged

    }//GEN-LAST:event_cbxNombreCampoItemStateChanged

    private void cbxDeportesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxDeportesItemStateChanged

        String descripcion = (String)cbxDeportes.getSelectedItem();
        depor=controldepor.ConsultarDeporteReserva(descripcion);

        if(cbxDeportes.getSelectedItem()=="---Seleccione---"){
            txtPrecioMinutoCampo.setText("eres sapo ");
            txtCodigoDescripcion.setText("no hay u.u ");
        }else if (cbxDeportes.getSelectedIndex()>-1){

            txtPrecioMinutoCampo.setText(String.valueOf(depor.getPrecioMinuto()));
            txtCodigoDescripcion.setText(String.valueOf(depor.getIdCancha()));
        }
    }//GEN-LAST:event_cbxDeportesItemStateChanged

    private void cbxEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEstadoItemStateChanged


            
        if(cbxEstado.getSelectedItem()=="1"){
            txtEstado.setText("Pago Pendiente ");
            
        }else {
            txtEstado.setText("Pago Liquidado ");
        }


    }//GEN-LAST:event_cbxEstadoItemStateChanged

    
    
 private void CargarComboCampoDeportivo  () {
        Connection cn = Conexion.conectar();
        String sql = "select nombre from tb_campodeportivo where estado='1';";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cbxNombreCampo.removeAllItems();
            cbxNombreCampo.addItem("---Seleccione el campo---");
            while (rs.next()) {
                cbxNombreCampo.addItem(rs.getString("nombre"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al cargar campos, !" + e);
        }
    }
    
    private void cargarDeportes() {
    // Obtener el idCampo desde el JTextField
    String nombreCampo = (String) (cbxNombreCampo.getSelectedItem());

    // Llamar al método para obtener los deportes por campo, no se si ponerlo en control reserva xd (no existe)
    List<Cancha> deportes = relacion.obtenerCanchaPorCampo(nombreCampo);

    
    cbxDeportes.removeAllItems();
     cbxDeportes.addItem("---Seleccione---");
    for (Cancha deporte : deportes) {
        
        cbxDeportes.addItem( deporte.getDescripcion());
        
    }
    }
    
    private void Limpiar(){
    txtDniCliente.setText("");
    txtCodigoCliente.setText("");
    txtNombreCliente.setText("");
    cbxNombreCampo.setSelectedIndex(0);
    txtCodigoCampo.setText("");
    cbxDeportes.setSelectedIndex(0);
    txtCodigoDescripcion.setText("");
    txtPrecioMinutoCampo.setText("");
    txtHoraInicio.setText("");
    txtHoraFin.setText("");
    txtDuracion.setText("");
    txtPrimerPago.setText("");
    txtSegundoPago.setText("");
    txtPagototal.setText("");

    }
    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxDeportes;
    private javax.swing.JComboBox<String> cbxEstado;
    public javax.swing.JComboBox<String> cbxNombreCampo;
    public javax.swing.JButton jButton_busca_cliente;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public com.toedter.calendar.JDateChooser jdateFecha;
    public static javax.swing.JTable tblReserva;
    public javax.swing.JTextField txtCodigoCampo;
    public javax.swing.JTextField txtCodigoCliente;
    public javax.swing.JTextField txtCodigoDescripcion;
    public javax.swing.JTextField txtDniCliente;
    public javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtHoraFin;
    public javax.swing.JTextField txtHoraInicio;
    public javax.swing.JTextField txtIdReserva;
    public static javax.swing.JTextField txtMontoFinal;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtPagototal;
    public javax.swing.JTextField txtPorcentajeReserva;
    public javax.swing.JTextField txtPrecioMinutoCampo;
    public static javax.swing.JTextField txtPrimerPago;
    public javax.swing.JTextField txtSegundoPago;
    // End of variables declaration//GEN-END:variables


  


 
   
}