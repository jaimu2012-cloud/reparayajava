package com.reparaya;

/** Ventana editable con la pestaña Design de NetBeans. */
public class Reportes extends javax.swing.JFrame {
    public Reportes() {
        initComponents();
        configurarVista();
        setLocationRelativeTo(null);
    }

    private void configurarVista() {
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        setMinimumSize(new java.awt.Dimension(640, 380));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));
        btnActualizar.setBackground(new java.awt.Color(117, 77, 52));
        btnActualizar.setForeground(java.awt.Color.WHITE);
        btnActualizar.setFocusPainted(false);
        btnVolver.setBackground(new java.awt.Color(117, 77, 52));
        btnVolver.setForeground(java.awt.Color.WHITE);
        btnVolver.setFocusPainted(false);
        actualizarReporte();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblPendientes = new javax.swing.JLabel();
        valTotal = new javax.swing.JLabel();
        valPendientes = new javax.swing.JLabel();
        lblProceso = new javax.swing.JLabel();
        lblTerminadas = new javax.swing.JLabel();
        valProceso = new javax.swing.JLabel();
        valTerminadas = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ReparaYa - Reportes");
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(850, 581));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblTitulo.setForeground(new java.awt.Color(119, 76, 52));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));
        lblSubtitulo.setForeground(new java.awt.Color(52, 48, 44));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblTotal.setForeground(new java.awt.Color(52, 48, 44));
        lblPendientes.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblPendientes.setForeground(new java.awt.Color(52, 48, 44));
        valTotal.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        valTotal.setForeground(new java.awt.Color(52, 48, 44));
        valPendientes.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        valPendientes.setForeground(new java.awt.Color(52, 48, 44));
        lblProceso.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblProceso.setForeground(new java.awt.Color(52, 48, 44));
        lblTerminadas.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        lblTerminadas.setForeground(new java.awt.Color(52, 48, 44));
        valProceso.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        valProceso.setForeground(new java.awt.Color(52, 48, 44));
        valTerminadas.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 15));
        valTerminadas.setForeground(new java.awt.Color(52, 48, 44));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnActualizar.setBackground(new java.awt.Color(119, 76, 52));
        btnActualizar.setForeground(java.awt.Color.WHITE);
        btnActualizar.setOpaque(true);
        btnActualizar.setFocusPainted(false);
        btnVolver.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnVolver.setBackground(new java.awt.Color(144, 110, 88));
        btnVolver.setForeground(java.awt.Color.WHITE);
        btnVolver.setOpaque(true);
        btnVolver.setFocusPainted(false);
        lblTitulo.setText("REPORTE DE SOLICITUDES");
        lblSubtitulo.setText("Resumen general de reparaciones registradas");
        lblTotal.setText("Solicitudes totales:");
        lblPendientes.setText("Pendientes:");
        valTotal.setText("0");
        valPendientes.setText("0");
        lblProceso.setText("En proceso:");
        lblTerminadas.setText("Finalizadas:");
        valProceso.setText("0");
        valTerminadas.setText("0");
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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
                    .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(lblPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(valTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(valPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(lblProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(lblTerminadas, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(valProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(valTerminadas, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTerminadas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valTerminadas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 581, Short.MAX_VALUE));
        pack();
    }//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarReporte();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        irA(new MenuPrincipal());
    }//GEN-LAST:event_btnVolverActionPerformed

    private void irA(javax.swing.JFrame ventana) {
        ventana.setVisible(true);
        dispose();
    }

    private void actualizarReporte() {
        java.util.List<DatosReparaYa.Solicitud> lista = DatosReparaYa.listado();
        int pendientes = 0, proceso = 0, finalizadas = 0;
        for (DatosReparaYa.Solicitud s : lista) {
            if ("PENDIENTE".equals(s.estado)) pendientes++;
            if ("EN PROCESO".equals(s.estado)) proceso++;
            if ("FINALIZADA".equals(s.estado)) finalizadas++;
        }
        valTotal.setText(String.valueOf(lista.size()));
        valPendientes.setText(String.valueOf(pendientes));
        valProceso.setText(String.valueOf(proceso));
        valTerminadas.setText(String.valueOf(finalizadas));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblPendientes;
    private javax.swing.JLabel valTotal;
    private javax.swing.JLabel valPendientes;
    private javax.swing.JLabel lblProceso;
    private javax.swing.JLabel lblTerminadas;
    private javax.swing.JLabel valProceso;
    private javax.swing.JLabel valTerminadas;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables

    /** Permite ejecutar esta ventana individualmente con Run File (Shift + F6). */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new Reportes().setVisible(true));
    }
}
