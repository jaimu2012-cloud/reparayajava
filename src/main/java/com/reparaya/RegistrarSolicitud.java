package com.reparaya;

/** Ventana editable con la pestaña Design de NetBeans. */
public class RegistrarSolicitud extends javax.swing.JFrame {
    public RegistrarSolicitud() {
        initComponents();
        configurarVista();
        setLocationRelativeTo(null);
    }

    private void configurarVista() {
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        setMinimumSize(new java.awt.Dimension(640, 380));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Seleccione una opción", "Electricidad", "Plomería", "Pintura", "Cerrajería", "Mantenimiento general"}));
        btnGuardar.setBackground(new java.awt.Color(117, 77, 52));
        btnGuardar.setForeground(java.awt.Color.WHITE);
        btnGuardar.setFocusPainted(false);
        btnLimpiar.setBackground(new java.awt.Color(117, 77, 52));
        btnLimpiar.setForeground(java.awt.Color.WHITE);
        btnLimpiar.setFocusPainted(false);
        btnVolver.setBackground(new java.awt.Color(117, 77, 52));
        btnVolver.setForeground(java.awt.Color.WHITE);
        btnVolver.setFocusPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox();
        txtDescripcion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ReparaYa - Registrar solicitud");
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(850, 660));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblTitulo.setForeground(new java.awt.Color(119, 76, 52));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblNombre.setForeground(new java.awt.Color(52, 48, 44));
        lblDocumento.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblDocumento.setForeground(new java.awt.Color(52, 48, 44));
        txtNombre.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        txtNombre.setBackground(java.awt.Color.WHITE);
        txtNombre.setForeground(new java.awt.Color(52, 48, 44));
        txtDocumento.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        txtDocumento.setBackground(java.awt.Color.WHITE);
        txtDocumento.setForeground(new java.awt.Color(52, 48, 44));
        lblTelefono.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblTelefono.setForeground(new java.awt.Color(52, 48, 44));
        lblDireccion.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblDireccion.setForeground(new java.awt.Color(52, 48, 44));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        txtTelefono.setBackground(java.awt.Color.WHITE);
        txtTelefono.setForeground(new java.awt.Color(52, 48, 44));
        txtDireccion.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        txtDireccion.setBackground(java.awt.Color.WHITE);
        txtDireccion.setForeground(new java.awt.Color(52, 48, 44));
        lblTipo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblTipo.setForeground(new java.awt.Color(52, 48, 44));
        lblDescripcion.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblDescripcion.setForeground(new java.awt.Color(52, 48, 44));
        cboTipo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        cboTipo.setBackground(java.awt.Color.WHITE);
        cboTipo.setForeground(new java.awt.Color(52, 48, 44));
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        txtDescripcion.setBackground(java.awt.Color.WHITE);
        txtDescripcion.setForeground(new java.awt.Color(52, 48, 44));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnGuardar.setBackground(new java.awt.Color(119, 76, 52));
        btnGuardar.setForeground(java.awt.Color.WHITE);
        btnGuardar.setOpaque(true);
        btnGuardar.setFocusPainted(false);
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnLimpiar.setBackground(new java.awt.Color(119, 76, 52));
        btnLimpiar.setForeground(java.awt.Color.WHITE);
        btnLimpiar.setOpaque(true);
        btnLimpiar.setFocusPainted(false);
        btnVolver.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnVolver.setBackground(new java.awt.Color(144, 110, 88));
        btnVolver.setForeground(java.awt.Color.WHITE);
        btnVolver.setOpaque(true);
        btnVolver.setFocusPainted(false);
        lblTitulo.setText("REGISTRAR SOLICITUD DE REPARACIÓN");
        lblNombre.setText("Nombre del solicitante");
        lblDocumento.setText("Documento");
        lblTelefono.setText("Teléfono");
        lblDireccion.setText("Dirección de la reparación");
        lblTipo.setText("Tipo de reparación");
        lblDescripcion.setText("Descripción del problema");
        btnGuardar.setText("REGISTRAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(lblDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addContainerGap(32, Short.MAX_VALUE)
                )
        );
        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(frameLayout);
        frameLayout.setHorizontalGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 850, Short.MAX_VALUE));
        frameLayout.setVerticalGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 660, Short.MAX_VALUE));
        pack();
    }//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText().trim();
        String documento = txtDocumento.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String tipo = (String)cboTipo.getSelectedItem();
        String descripcion = txtDescripcion.getText().trim();
        if (nombre.isEmpty() || documento.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || descripcion.isEmpty() || cboTipo.getSelectedIndex() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Complete todos los campos para registrar la solicitud.");
            return;
        }
        DatosReparaYa.Solicitud s = DatosReparaYa.registrarSolicitud(nombre, documento, telefono, direccion, tipo, descripcion);
        javax.swing.JOptionPane.showMessageDialog(this, "Solicitud " + s.codigo + " guardada con estado PENDIENTE.");
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        irA(new MenuPrincipal());
    }//GEN-LAST:event_btnVolverActionPerformed

    private void irA(javax.swing.JFrame ventana) {
        ventana.setVisible(true);
        dispose();
    }

    private void limpiar() {
        txtNombre.setText("");
        txtDocumento.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtDescripcion.setText("");
        cboTipo.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables

    /** Permite ejecutar esta ventana individualmente con Run File (Shift + F6). */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new RegistrarSolicitud().setVisible(true));
    }
}
