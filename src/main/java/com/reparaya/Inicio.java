package com.reparaya;

/** Ventana editable con la pestaña Design de NetBeans. */
public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        initComponents();
        configurarVista();
        setLocationRelativeTo(null);
    }

    private void configurarVista() {
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        setMinimumSize(new java.awt.Dimension(640, 380));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));
        btnIngresar.setBackground(new java.awt.Color(117, 77, 52));
        btnIngresar.setForeground(java.awt.Color.WHITE);
        btnIngresar.setFocusPainted(false);
        btnSalir.setBackground(new java.awt.Color(117, 77, 52));
        btnSalir.setForeground(java.awt.Color.WHITE);
        btnSalir.setFocusPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ReparaYa - Inicio");
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(850, 460));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblTitulo.setForeground(new java.awt.Color(119, 76, 52));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));
        lblSubtitulo.setForeground(new java.awt.Color(52, 48, 44));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIngresar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnIngresar.setBackground(new java.awt.Color(119, 76, 52));
        btnIngresar.setForeground(java.awt.Color.WHITE);
        btnIngresar.setOpaque(true);
        btnIngresar.setFocusPainted(false);
        btnSalir.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnSalir.setBackground(new java.awt.Color(144, 110, 88));
        btnSalir.setForeground(java.awt.Color.WHITE);
        btnSalir.setOpaque(true);
        btnSalir.setFocusPainted(false);
        lblTitulo.setText("REPARAYA");
        lblSubtitulo.setText("Sistema de gestión de reparaciones locativas");
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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
                    .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        irA(new InicioSesion());
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void irA(javax.swing.JFrame ventana) {
        ventana.setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables

    /** Permite ejecutar esta ventana individualmente con Run File (Shift + F6). */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new Inicio().setVisible(true));
    }
}
