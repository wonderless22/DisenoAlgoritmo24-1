/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import charquitec.Codigo.GestionadorAdministrador;
import charquitec.Codigo.GestionadorProducto;
import charquitec.Codigo.Producto;
import charquitec.Codigo.Vendedor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author csosa
 */
public class Vista_Admi extends javax.swing.JPanel {
    DefaultTableModel modelo = new DefaultTableModel();

    GestionadorAdministrador GestionadorAdministrador = new GestionadorAdministrador();
    

    public Vista_Admi() {
        initComponents();
        Login.setVisible(true);
        VistaAdmin.setVisible(false);
        agregarModeloTabla();
       
        
    }
    private void agregarModeloTabla(){
        modelo.addColumn("Nombre");
        modelo.addColumn("ID");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");

               
        }
     public void llenarTabla(GestionadorProducto unProducto){
         
       
        
        int cantidadDatos = unProducto.cantidadProductos();
        
        for( int i=0; i<cantidadDatos; i++){
            if (unProducto.unProducto[i] != null) {
            String nombre = unProducto.unProducto[i].getNombre();
            String ID = unProducto.unProducto[i].getID();
            
            String precio = String.valueOf(unProducto.unProducto[i].getPrecio());
            String cantidad = String.valueOf(unProducto.unProducto[i].getCantidad());
            String [] listaProductos = {ID,nombre,precio,cantidad};
            modelo.addRow(listaProductos);
        }        
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        VistaAdmin = new javax.swing.JPanel();
        contenedor = new javax.swing.JPanel();
        Tablas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Registrar_Vende = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TNombreVendedor = new javax.swing.JTextField();
        TApellidoVendedor = new javax.swing.JTextField();
        TCodigoVendedor = new javax.swing.JTextField();
        btn_RegistrarVendedor = new javax.swing.JButton();
        Registrar_Prod = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nomProducto = new javax.swing.JTextField();
        precioProducto = new javax.swing.JTextField();
        btn_RegistrarProducto = new javax.swing.JButton();
        codProducto = new javax.swing.JTextField();
        cantProducto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BarraNavegacion = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        Login.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Inciar sesion");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        jButton4.setText("Iniciar Sesion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(61, 61, 61))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(T1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(T2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel6))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        add(Login, "card2");

        VistaAdmin.setLayout(new java.awt.BorderLayout());

        contenedor.setLayout(new java.awt.CardLayout());

        Tablas.setBackground(new java.awt.Color(0, 204, 255));

        TablaEmpleados.setColumns(20);
        TablaEmpleados.setRows(5);
        jScrollPane1.setViewportView(TablaEmpleados);

        tblProductos.setModel(modelo
        );
        jScrollPane3.setViewportView(tblProductos);

        jButton5.setBackground(new java.awt.Color(0, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Eliminar producto");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tabla productos");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tabla empleados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout TablasLayout = new javax.swing.GroupLayout(Tablas);
        Tablas.setLayout(TablasLayout);
        TablasLayout.setHorizontalGroup(
            TablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablasLayout.createSequentialGroup()
                .addGroup(TablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TablasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(TablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TablasLayout.setVerticalGroup(
            TablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(TablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        contenedor.add(Tablas, "card2");

        Registrar_Vende.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setText("Datos del vendedor");

        jLabel9.setText("Nombre");

        jLabel10.setText("Apellido");

        jLabel11.setText("Codigo");

        TNombreVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNombreVendedorActionPerformed(evt);
            }
        });

        btn_RegistrarVendedor.setText("Registrar Vendedor");
        btn_RegistrarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Registrar_VendeLayout = new javax.swing.GroupLayout(Registrar_Vende);
        Registrar_Vende.setLayout(Registrar_VendeLayout);
        Registrar_VendeLayout.setHorizontalGroup(
            Registrar_VendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_VendeLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(Registrar_VendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(Registrar_VendeLayout.createSequentialGroup()
                        .addGroup(Registrar_VendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(53, 53, 53)
                        .addGroup(Registrar_VendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TNombreVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(TApellidoVendedor)
                            .addComponent(TCodigoVendedor))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registrar_VendeLayout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(btn_RegistrarVendedor)
                .addGap(96, 96, 96))
        );
        Registrar_VendeLayout.setVerticalGroup(
            Registrar_VendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_VendeLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(Registrar_VendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(Registrar_VendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TApellidoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(Registrar_VendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(TCodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btn_RegistrarVendedor)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        contenedor.add(Registrar_Vende, "card3");

        Registrar_Prod.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setText("Datos del producto");

        jLabel12.setText("Nombre");

        jLabel13.setText("Codigo");

        nomProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomProductoActionPerformed(evt);
            }
        });

        btn_RegistrarProducto.setText("Registrar Producto");
        btn_RegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarProductoActionPerformed(evt);
            }
        });

        jLabel14.setText("Precio");

        jLabel15.setText("Cantidad");

        javax.swing.GroupLayout Registrar_ProdLayout = new javax.swing.GroupLayout(Registrar_Prod);
        Registrar_Prod.setLayout(Registrar_ProdLayout);
        Registrar_ProdLayout.setHorizontalGroup(
            Registrar_ProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProdLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(Registrar_ProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Registrar_ProdLayout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(278, 278, 278))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Registrar_ProdLayout.createSequentialGroup()
                        .addGroup(Registrar_ProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addGroup(Registrar_ProdLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(Registrar_ProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))))
                        .addGap(43, 43, 43)
                        .addGroup(Registrar_ProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(nomProducto)
                            .addComponent(codProducto)
                            .addComponent(precioProducto))
                        .addContainerGap(173, Short.MAX_VALUE))))
            .addGroup(Registrar_ProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_RegistrarProducto)
                .addGap(116, 116, 116))
        );
        Registrar_ProdLayout.setVerticalGroup(
            Registrar_ProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProdLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addGroup(Registrar_ProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Registrar_ProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Registrar_ProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGroup(Registrar_ProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registrar_ProdLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btn_RegistrarProducto))
                    .addGroup(Registrar_ProdLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(Registrar_ProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        contenedor.add(Registrar_Prod, "card4");

        VistaAdmin.add(contenedor, java.awt.BorderLayout.CENTER);

        BarraNavegacion.setBackground(new java.awt.Color(255, 204, 204));

        jButton1.setText("Tablas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        BarraNavegacion.add(jButton1);

        jButton2.setText("Registrar Vendedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        BarraNavegacion.add(jButton2);

        jButton3.setText("Registrar Producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        BarraNavegacion.add(jButton3);

        VistaAdmin.add(BarraNavegacion, java.awt.BorderLayout.PAGE_START);

        add(VistaAdmin, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Registrar Vendedor
        Registrar_Vende.setVisible(true);
        Tablas.setVisible(false);
        Registrar_Prod.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Iniciar sesion

        String usuario = T1.getText();
        String contra = T2.getText();

        if (GestionadorAdministrador.VerificarUsuario(usuario, contra)) {
            Login.setVisible(false);
            VistaAdmin.setVisible(true);
        } else {
            jLabel6.setText("Usuario o contrasena incorrectos");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Mostrar tablas
        Tablas.setVisible(true);
        Registrar_Prod.setVisible(false);
        Registrar_Vende.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Registrar_Prod.setVisible(true);
        Tablas.setVisible(false);
        Registrar_Vende.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nomProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomProductoActionPerformed

    private void btn_RegistrarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarVendedorActionPerformed
        //Registrar Vendedor
        String nombre = TNombreVendedor.getText();
        String apellido = TApellidoVendedor.getText();
        String codigo = TCodigoVendedor.getText();
        Vendedor unvendedor = new Vendedor(nombre, apellido, codigo);
        GestionadorAdministrador.RegistrarVendedor(unvendedor);

        TablaEmpleados.setText(GestionadorAdministrador.MostrarVendedor());
    }//GEN-LAST:event_btn_RegistrarVendedorActionPerformed

    private void TNombreVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNombreVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNombreVendedorActionPerformed

    private void btn_RegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarProductoActionPerformed
String nombre = nomProducto.getText();
String ID = codProducto.getText();
float precio = Float.parseFloat(precioProducto.getText());
int cantidad = Integer.parseInt(cantProducto.getText());
GestionadorProducto  ges = new GestionadorProducto();
ges.registroProducto(nombre, ID, precio, cantidad);

JOptionPane.showMessageDialog(null, "Producto registrado");
llenarTabla(ges);






// TODO add your handling code here:
    }//GEN-LAST:event_btn_RegistrarProductoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
try{
            int fila = tblProductos.getSelectedRow();
            if(fila==-1){
                JOptionPane.showMessageDialog(null, "seleecione una fila ");
                
            }else{
            String codigo = tblProductos.getValueAt(fila, 2).toString();
                   
                    modelo.removeRow(tblProductos.getSelectedRow());
                    GestionadorProducto ges = new GestionadorProducto();
                ges.eliminarProducto(codigo);
                JOptionPane.showMessageDialog(null,"producto eliminado con exito");
            }
        }catch(Exception e){
            System.out.println("errores");
        }


// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraNavegacion;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Registrar_Prod;
    private javax.swing.JPanel Registrar_Vende;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField TApellidoVendedor;
    private javax.swing.JTextField TCodigoVendedor;
    private javax.swing.JTextField TNombreVendedor;
    private javax.swing.JTextArea TablaEmpleados;
    private javax.swing.JPanel Tablas;
    private javax.swing.JPanel VistaAdmin;
    private javax.swing.JButton btn_RegistrarProducto;
    private javax.swing.JButton btn_RegistrarVendedor;
    private javax.swing.JTextField cantProducto;
    private javax.swing.JTextField codProducto;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nomProducto;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
