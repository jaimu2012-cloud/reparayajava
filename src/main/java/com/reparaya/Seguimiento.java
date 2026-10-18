package com.reparaya;

/** Ventana editable con la pestaña Design de NetBeans. */
public class Seguimiento extends javax.swing.JFrame {
    public Seguimiento() {
        initComponents();
        configurarVista();
        setLocationRelativeTo(null);
    }

    private void configurarVista() {
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        setMinimumSize(new java.awt.Dimension(640, 380));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblAyuda.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"Código", "Solicitante", "Tipo de reparación", "Estado"}) {
            @Override public boolean isCellEditable(int row, int column) { return false; }
        });
        tblTabla.setRowHeight(26);
        tblTabla.setAutoCreateRowSorter(true);
        btnCambiar.setBackground(new java.awt.Color(117, 77, 52));
        btnCambiar.setForeground(java.awt.Color.WHITE);
        btnCambiar.setFocusPainted(false);
        btnActualizar.setBackground(new java.awt.Color(117, 77, 52));
        btnActualizar.setForeground(java.awt.Color.WHITE);
        btnActualizar.setFocusPainted(false);
        btnVolver.setBackground(new java.awt.Color(117, 77, 52));
        btnVolver.setForeground(java.awt.Color.WHITE);
        btnVolver.setFocusPainted(false);
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblAyuda = new javax.swing.JLabel();
        spTabla = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnCambiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ReparaYa - Seguimiento");
        panelPrincipal.setBackground(new java.awt.Color(248, 245, 241));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(922, 646));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblTitulo.setForeground(new java.awt.Color(119, 76, 52));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAyuda.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));
        lblAyuda.setForeground(new java.awt.Color(52, 48, 44));
        lblAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tblTabla.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
        tblTabla.setBackground(java.awt.Color.WHITE);
        tblTabla.setRowHeight(27);
        btnCambiar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btnCambiar.setBackground(new java.awt.Color(119, 76, 52));
        btnCambiar.setForeground(java.awt.Color.WHITE);
        btnCambiar.setOpaque(true);
        btnCambiar.setFocusPainted(false);
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
        lblTitulo.setText("SEGUIMIENTO DE REPARACIONES");
        lblAyuda.setText("Seleccione una fila y pulse CAMBIAR ESTADO");
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Código", "Solicitante", "Tipo de reparación", "Estado"}
        ) {
            @Override public boolean isCellEditable(int row, int col) { return false; }
        });
        spTabla.setViewportView(tblTabla);
        btnCambiar.setText("CAMBIAR ESTADO");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
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
                    .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(spTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
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
                    .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addContainerGap(32, Short.MAX_VALUE)
                )
        );
        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(frameLayout);
        frameLayout.setHorizontalGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 922, Short.MAX_VALUE));
        frameLayout.setVerticalGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 646, Short.MAX_VALUE));
        pack();
    }//GEN-END:initComponents

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        int fila = tblTabla.getSelectedRow();
        if (fila < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecciona una solicitud de la tabla.");
            return;
        }
        int filaModelo = tblTabla.convertRowIndexToModel(fila);
        String codigo = (String) tblTabla.getModel().getValueAt(filaModelo, 0);
        String[] estados = {"PENDIENTE", "EN PROCESO", "FINALIZADA"};
        String elegido = (String) javax.swing.JOptionPane.showInputDialog(this, "Nuevo estado:", "Seguimiento", javax.swing.JOptionPane.QUESTION_MESSAGE, null, estados, estados[0]);
        if (elegido != null) {
            DatosReparaYa.cambiarEstado(codigo, elegido);
            actualizarTabla();
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        irA(new MenuPrincipal());
    }//GEN-LAST:event_btnVolverActionPerformed

    private void irA(javax.swing.JFrame ventana) {
        ventana.setVisible(true);
        dispose();
    }

    private void actualizarTabla() {
        javax.swing.table.DefaultTableModel m = (javax.swing.table.DefaultTableModel) tblTabla.getModel();
        m.setRowCount(0);
        for (DatosReparaYa.Solicitud s : DatosReparaYa.listado()) {
            m.addRow(new Object[]{s.codigo, s.nombre, s.tipo, s.estado});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JScrollPane spTabla;
    private javax.swing.JTable tblTabla;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables

    /** Permite ejecutar esta ventana individualmente con Run File (Shift + F6). */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new Seguimiento().setVisible(true));
    }
}
