package com.reparaya;

/** Ventana editable con la pestaña Design de NetBeans. */
public class RegistroUsuario extends javax.swing.JFrame {
    public RegistroUsuario() {
        initComponents();
        configurarVista();
        setLocationRelativeTo(null);
    }

    private void configurarVista() {
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        setMinimumSize(new java.awt.Dimension(640, 380));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
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
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso de datos - ReparaYa");
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(850, 460));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblTitulo.setForeground(new java.awt.Color(119, 76, 52));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblCedula.setForeground(new java.awt.Color(52, 48, 44));
        lblNombre.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblNombre.setForeground(new java.awt.Color(52, 48, 44));
        txtCedula.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        txtCedula.setBackground(java.awt.Color.WHITE);
        txtCedula.setForeground(new java.awt.Color(52, 48, 44));
        txtNombre.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        txtNombre.setBackground(java.awt.Color.WHITE);
        txtNombre.setForeground(new java.awt.Color(52, 48, 44));
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
        lblTitulo.setText("INGRESO DE DATOS");
        lblCedula.setText("Ingrese su cédula");
        lblNombre.setText("Ingrese su nombre");
        btnGuardar.setText("GUARDAR");
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
                    .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 460, Short.MAX_VALUE));
        pack();
    }//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String cedula = txtCedula.getText().trim();
        String nombre = txtNombre.getText().trim();
        if (cedula.isEmpty() || nombre.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe la cédula y el nombre.");
            return;
        }
        DatosReparaYa.registrarUsuario(nombre, cedula);
        javax.swing.JOptionPane.showMessageDialog(this, "Usuario guardado. Para iniciar sesión usa tu nombre y la cédula como contraseña.");
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        irA(new InicioSesion());
    }//GEN-LAST:event_btnVolverActionPerformed

    private void irA(javax.swing.JFrame ventana) {
        ventana.setVisible(true);
        dispose();
    }

    private void limpiar() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtCedula.requestFocusInWindow();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables

    /** Permite ejecutar esta ventana individualmente con Run File (Shift + F6). */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new RegistroUsuario().setVisible(true));
    }
}
