package Vista;

import veterinaria.CitaController;
import veterinaria.MascotaController;
import veterinaria.PersonaController;

/**
 *
 * @author Anderson
 */
public class Principal extends javax.swing.JFrame {
    private PersonaController pc = new PersonaController();
    private MascotaController mc = new MascotaController();
    private CitaController cc = new CitaController();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());
    
    public Principal() {
        initComponents();
        CitListar.setText("Listar");
        CitListar.addActionListener(this::CitListarActionPerformed);
        jMenu4.add(CitListar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        CliBuscar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        PerRegistrar = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        PerBuscar = new javax.swing.JMenuItem();
        MasRegistrar = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        MasBuscar = new javax.swing.JMenuItem();
        MasListar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        CitRegistrar = new javax.swing.JMenuItem();
        CitEstado = new javax.swing.JMenuItem();
        CitListar = new javax.swing.JMenuItem();
        Cerrar = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veterinaria - Sistema de Gestion");

        escritorio.setBackground(new java.awt.Color(102, 204, 255));
        escritorio.setForeground(new java.awt.Color(0, 51, 255));
        escritorio.setPreferredSize(new java.awt.Dimension(900, 700));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("<html>VETERINARIA<br>HUELLITAS</html>");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Cuidamos a quienes te hacen feliz :\")");

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 204, 255));

        CliBuscar.setForeground(new java.awt.Color(0, 102, 204));
        CliBuscar.setText("Cliente");
        CliBuscar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jMenuItem1.setText("Registrar");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        CliBuscar.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jMenuItem2.setText("Buscar");
        jMenuItem2.addActionListener(this::jMenuItem2ActionPerformed);
        CliBuscar.add(jMenuItem2);

        jMenuBar1.add(CliBuscar);

        PerRegistrar.setForeground(new java.awt.Color(0, 102, 204));
        PerRegistrar.setText("Personal");
        PerRegistrar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jMenuItem3.setText("Registrar");
        jMenuItem3.addActionListener(this::jMenuItem3ActionPerformed);
        PerRegistrar.add(jMenuItem3);

        PerBuscar.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        PerBuscar.setText("Buscar");
        PerBuscar.addActionListener(this::PerBuscarActionPerformed);
        PerRegistrar.add(PerBuscar);

        jMenuBar1.add(PerRegistrar);

        MasRegistrar.setForeground(new java.awt.Color(0, 102, 204));
        MasRegistrar.setText("Mascota");
        MasRegistrar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jMenuItem5.setText("Registrar");
        jMenuItem5.addActionListener(this::jMenuItem5ActionPerformed);
        MasRegistrar.add(jMenuItem5);

        MasBuscar.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        MasBuscar.setText("Buscar");
        MasBuscar.addActionListener(this::MasBuscarActionPerformed);
        MasRegistrar.add(MasBuscar);

        MasListar.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        MasListar.setText("Lista");
        MasListar.addActionListener(this::MasListarActionPerformed);
        MasRegistrar.add(MasListar);

        jMenuBar1.add(MasRegistrar);

        jMenu4.setForeground(new java.awt.Color(0, 102, 204));
        jMenu4.setText("Cita");
        jMenu4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N

        CitRegistrar.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        CitRegistrar.setText("Registrar");
        CitRegistrar.addActionListener(this::CitRegistrarActionPerformed);
        jMenu4.add(CitRegistrar);

        CitEstado.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        CitEstado.setText("Cambiar estado");
        CitEstado.addActionListener(this::CitEstadoActionPerformed);
        jMenu4.add(CitEstado);

        CitListar.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        CitListar.setText("Listar");
        CitListar.addActionListener(this::CitListarActionPerformed);
        jMenu4.add(CitListar);

        jMenuBar1.add(jMenu4);

        Cerrar.setForeground(new java.awt.Color(0, 102, 204));
        Cerrar.setText("Salir");
        Cerrar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jMenuItem11.setText("Cerrar");
        jMenuItem11.addActionListener(this::jMenuItem11ActionPerformed);
        Cerrar.add(jMenuItem11);

        jMenuBar1.add(Cerrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaCliente v = new VentanaCliente(pc, false);
        escritorio.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        VentanaPersonal v = new VentanaPersonal(pc, false);
        escritorio.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void CitRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitRegistrarActionPerformed
        VentanaCita v = new VentanaCita(pc, mc, cc);
        escritorio.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_CitRegistrarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        VentanaMascota v = new VentanaMascota(pc, mc, VentanaMascota.REGISTRAR);
        escritorio.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VentanaCliente v = new VentanaCliente(pc, true);
        escritorio.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void PerBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerBuscarActionPerformed
        VentanaPersonal v = new VentanaPersonal(pc, true);
        escritorio.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_PerBuscarActionPerformed

    private void MasBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasBuscarActionPerformed
        VentanaMascota v = new VentanaMascota(pc, mc, VentanaMascota.BUSCAR);
        escritorio.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_MasBuscarActionPerformed

    private void CitEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitEstadoActionPerformed
        VentanaCita v = new VentanaCita(pc, mc, cc);
        escritorio.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_CitEstadoActionPerformed

    private void MasListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasListarActionPerformed
        // Abrir la ventana de mascotas en modo LISTA
        VentanaMascota v = new VentanaMascota(pc, mc, VentanaMascota.LISTA);
        escritorio.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_MasListarActionPerformed

    private void CitListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitListarActionPerformed
        VentanaCita v = new VentanaCita(pc, mc, cc, VentanaCita.LISTA);
        escritorio.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_CitListarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cerrar;
    private javax.swing.JMenuItem CitEstado;
    private javax.swing.JMenuItem CitListar;
    private javax.swing.JMenuItem CitRegistrar;
    private javax.swing.JMenu CliBuscar;
    private javax.swing.JMenuItem MasBuscar;
    private javax.swing.JMenuItem MasListar;
    private javax.swing.JMenu MasRegistrar;
    private javax.swing.JMenuItem PerBuscar;
    private javax.swing.JMenu PerRegistrar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
