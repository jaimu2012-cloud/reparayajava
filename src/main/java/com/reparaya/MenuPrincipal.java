package com.reparaya;

/** Ventana editable con la pestaña Design de NetBeans. */
public class MenuPrincipal extends javax.swing.JFrame {
    public MenuPrincipal() {
        initComponents();
        configurarVista();
        setLocationRelativeTo(null);
    }

    private void configurarVista() {
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        setMinimumSize(new java.awt.Dimension(640, 380));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        btnNueva.setBackground(new java.awt.Color(117, 77, 52));
        btnNueva.setForeground(java.awt.Color.WHITE);
        btnNueva.setFocusPainted(false);
        btnConsultar.setBackground(new java.awt.Color(117, 77, 52));
        btnConsultar.setForeground(java.awt.Color.WHITE);
        btnConsultar.setFocusPainted(false);
        btnSeguimiento.setBackground(new java.awt.Color(117, 77, 52));
        btnSeguimiento.setForeground(java.awt.Color.WHITE);
        btnSeguimiento.setFocusPainted(false);
        btnReportes.setBackground(new java.awt.Color(117, 77, 52));
        btnReportes.setForeground(java.awt.Color.WHITE);
        btnReportes.setFocusPainted(false);
        btnRegistro.setBackground(new java.awt.Color(117, 77, 52));
        btnRegistro.setForeground(java.awt.Color.WHITE);
        btnRegistro.setFocusPainted(false);
        btnCerrar.setBackground(new java.awt.Color(117, 77, 52));
        btnCerrar.setForeground(java.awt.Color.WHITE);
        btnCerrar.setFocusPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnNueva = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnSeguimiento = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ReparaYa - Menú principal");
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(850, 460));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblTitulo.setForeground(new java.awt.Color(119, 76, 52));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNueva.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnNueva.setBackground(new java.awt.Color(119, 76, 52));
        btnNueva.setForeground(java.awt.Color.WHITE);
        btnNueva.setOpaque(true);
        btnNueva.setFocusPainted(false);
        btnConsultar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnConsultar.setBackground(new java.awt.Color(119, 76, 52));
        btnConsultar.setForeground(java.awt.Color.WHITE);
        btnConsultar.setOpaque(true);
        btnConsultar.setFocusPainted(false);
        btnSeguimiento.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnSeguimiento.setBackground(new java.awt.Color(119, 76, 52));
        btnSeguimiento.setForeground(java.awt.Color.WHITE);
        btnSeguimiento.setOpaque(true);
        btnSeguimiento.setFocusPainted(false);
        btnReportes.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnReportes.setBackground(new java.awt.Color(119, 76, 52));
        btnReportes.setForeground(java.awt.Color.WHITE);
        btnReportes.setOpaque(true);
        btnReportes.setFocusPainted(false);
        btnRegistro.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnRegistro.setBackground(new java.awt.Color(119, 76, 52));
        btnRegistro.setForeground(java.awt.Color.WHITE);
        btnRegistro.setOpaque(true);
        btnRegistro.setFocusPainted(false);
        btnCerrar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnCerrar.setBackground(new java.awt.Color(144, 110, 88));
        btnCerrar.setForeground(java.awt.Color.WHITE);
        btnCerrar.setOpaque(true);
        btnCerrar.setFocusPainted(false);
        lblTitulo.setText("REPARAYA - MENÚ PRINCIPAL");
        btnNueva.setText("REGISTRAR SOLICITUD");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });
        btnConsultar.setText("CONSULTAR SOLICITUDES");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        btnSeguimiento.setText("SEGUIMIENTO");
        btnSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguimientoActionPerformed(evt);
            }
        });
        btnReportes.setText("REPORTES");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        btnRegistro.setText("REGISTRO DE USUARIOS");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        btnCerrar.setText("CERRAR SESIÓN");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
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
                    .addComponent(btnNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(btnSeguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
        irA(new RegistrarSolicitud());
    }//GEN-LAST:event_btnNuevaActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        irA(new ConsultarSolicitudes());
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguimientoActionPerformed
        irA(new Seguimiento());
    }//GEN-LAST:event_btnSeguimientoActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        irA(new Reportes());
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        irA(new RegistroUsuario());
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        irA(new InicioSesion());
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void irA(javax.swing.JFrame ventana) {
        ventana.setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSeguimiento;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnCerrar;
    // End of variables declaration//GEN-END:variables

    /** Permite ejecutar esta ventana individualmente con Run File (Shift + F6). */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }
}
