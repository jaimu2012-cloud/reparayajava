package com.reparaya;

/** Ventana editable con la pestaña Design de NetBeans. */
public class InicioSesion extends javax.swing.JFrame {
    public InicioSesion() {
        initComponents();
        configurarVista();
        setLocationRelativeTo(null);
    }

    private void configurarVista() {
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        setMinimumSize(new java.awt.Dimension(640, 380));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        btnIngresar.setBackground(new java.awt.Color(117, 77, 52));
        btnIngresar.setForeground(java.awt.Color.WHITE);
        btnIngresar.setFocusPainted(false);
        btnRegistrar.setBackground(new java.awt.Color(117, 77, 52));
        btnRegistrar.setForeground(java.awt.Color.WHITE);
        btnRegistrar.setFocusPainted(false);
        btnVolver.setBackground(new java.awt.Color(117, 77, 52));
        btnVolver.setForeground(java.awt.Color.WHITE);
        btnVolver.setFocusPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ReparaYa - Inicio de sesión");
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(850, 487));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblTitulo.setForeground(new java.awt.Color(119, 76, 52));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblUsuario.setForeground(new java.awt.Color(52, 48, 44));
        lblClave.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblClave.setForeground(new java.awt.Color(52, 48, 44));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        txtUsuario.setBackground(java.awt.Color.WHITE);
        txtUsuario.setForeground(new java.awt.Color(52, 48, 44));
        txtClave.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        txtClave.setBackground(java.awt.Color.WHITE);
        txtClave.setForeground(new java.awt.Color(52, 48, 44));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnIngresar.setBackground(new java.awt.Color(119, 76, 52));
        btnIngresar.setForeground(java.awt.Color.WHITE);
        btnIngresar.setOpaque(true);
        btnIngresar.setFocusPainted(false);
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnRegistrar.setBackground(new java.awt.Color(119, 76, 52));
        btnRegistrar.setForeground(java.awt.Color.WHITE);
        btnRegistrar.setOpaque(true);
        btnRegistrar.setFocusPainted(false);
        btnVolver.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnVolver.setBackground(new java.awt.Color(144, 110, 88));
        btnVolver.setForeground(java.awt.Color.WHITE);
        btnVolver.setOpaque(true);
        btnVolver.setFocusPainted(false);
        lblTitulo.setText("INICIO DE SESIÓN");
        lblUsuario.setText("Usuario");
        lblClave.setText("Contraseña");
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnRegistrar.setText("REGISTRAR USUARIO");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
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
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(lblClave, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
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
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 487, Short.MAX_VALUE));
        pack();
    }//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuario = txtUsuario.getText().trim();
        String clave = new String(txtClave.getPassword());
        if (DatosReparaYa.validarUsuario(usuario, clave)) {
            irA(new MenuPrincipal());
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario o clave incorrectos. Prueba demo / 1234, o regístrate.");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        irA(new RegistroUsuario());
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        irA(new Inicio());
    }//GEN-LAST:event_btnVolverActionPerformed

    private void irA(javax.swing.JFrame ventana) {
        ventana.setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblClave;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables

    /** Permite ejecutar esta ventana individualmente con Run File (Shift + F6). */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new InicioSesion().setVisible(true));
    }
}
