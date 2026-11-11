package Vista;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import veterinaria.Cita;
import veterinaria.CitaController;
import veterinaria.Mascota;
import veterinaria.MascotaController;
import veterinaria.Persona;
import veterinaria.PersonaController;
import veterinaria.Personal;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class VentanaCita extends javax.swing.JInternalFrame {

    public static final int REGISTRAR = 1;
    public static final int LISTA = 2;
    private PersonaController pc;
    private MascotaController mc;
    private CitaController cc;
    

    public VentanaCita(PersonaController pc, MascotaController mc,
        CitaController cc) {
    this(pc, mc, cc, REGISTRAR);
}

public VentanaCita(PersonaController pc, MascotaController mc,
        CitaController cc, int modo) {
        initComponents();
       
        this.pc = pc;
        this.mc = mc;
        this.cc = cc;

        panelListaCitas.setVisible(false);
        switch (modo) {
            case REGISTRAR:
                setTitle("Registrar Cita");
                break;
            case LISTA:
                setTitle("Lista de Citas");
                // Ocultar los componentes de registro
                jLabel1.setVisible(false);
                jLabel2.setVisible(false);
                jLabel3.setVisible(false);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false);
                jLabel6.setVisible(false);
                jLabel7.setVisible(false);

                txtId.setVisible(false);
                txtMotivo.setVisible(false);
                txtEstado.setVisible(false);
                txtIdMascota.setVisible(false);
                txtDniPersonal.setVisible(false);
                txtFecha.setVisible(false);
                txtHora.setVisible(false);

                btnRegistrar.setVisible(false);
                btnEstado.setVisible(false);
                lblMensaje.setVisible(false);

                // Mostrar tabla
                panelListaCitas.setVisible(true);

                cargarTablaCitas();
                break;
        }
        pack();
}

private void cargarTablaCitas() {
        DefaultTableModel modelo =
                (DefaultTableModel) jTable1.getModel();

        modelo.setRowCount(0);

        for (Cita c : cc.getCitas()) {

            modelo.addRow(new Object[]{
                c.getId_cita(),
                c.getMotivo(),
                c.getEstado(),
                c.getFecha(),
                c.getHora(),
                c.getMascota().getNombre(),
                c.getPersonal().getNombre()
            });
        }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtIdMascota = new javax.swing.JTextField();
        txtDniPersonal = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        btnEstado = new javax.swing.JButton();
        panelListaCitas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registrar Cita");

        jLabel1.setText("ID de la cita");

        jLabel2.setText("Motivo");

        jLabel3.setText("Estado (Pendiente, Atendida o Cancelada)");

        jLabel4.setText("ID de la mascota");

        jLabel5.setText("DNI del personal");

        jLabel6.setText("Fecha (AAAA-MM-DD)");

        jLabel7.setText("Hora (HH:mm)");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        lblMensaje.setText("...");

        btnEstado.setText("CAMBIAR ESTADO");
        btnEstado.addActionListener(this::btnEstadoActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Motivo", "Estado", "Fecha", "Hora", "Mascota", "Personal"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelListaCitasLayout = new javax.swing.GroupLayout(panelListaCitas);
        panelListaCitas.setLayout(panelListaCitasLayout);
        panelListaCitasLayout.setHorizontalGroup(
            panelListaCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        panelListaCitasLayout.setVerticalGroup(
            panelListaCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListaCitasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addGap(58, 58, 58)
                                .addComponent(btnEstado))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMotivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDniPersonal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64))
            .addComponent(panelListaCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDniPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEstado))
                .addGap(18, 18, 18)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelListaCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            Mascota m = mc.buscarPorId(Integer.parseInt(txtIdMascota.getText().trim()));
            if (m == null) {
                lblMensaje.setText("No existe ninguna mascota con ese ID");
                return;
            }
            Persona p = pc.buscarPorDocumento(txtDniPersonal.getText().trim());
            if (p == null) {
                lblMensaje.setText("No existe ninguna persona con ese documento");
                return;
            }
            if (!(p instanceof Personal)) {
                lblMensaje.setText("Ese documento pertenece a un cliente, no a personal");
                return;
            }
            Cita c = new Cita(Integer.parseInt(txtId.getText().trim()),
                    txtMotivo.getText(), txtEstado.getText(), m, (Personal) p,
                    LocalDate.parse(txtFecha.getText().trim()),
                    LocalTime.parse(txtHora.getText().trim()));
            cc.registrarCita(c);
            lblMensaje.setText("Cita registrada correctamente");
        } catch (DateTimeParseException e) {
            lblMensaje.setText("Fecha: AAAA-MM-DD  |  Hora: HH:mm (ej. 10:30)");
        } catch (NumberFormatException e) {
            lblMensaje.setText("El ID de la cita y el ID de la mascota deben ser numeros");
        } catch (IllegalArgumentException e) {
            lblMensaje.setText(e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoActionPerformed
        try {
            int id = Integer.parseInt(txtId.getText().trim());
            if (cc.buscarPorId(id) == null) {
                lblMensaje.setText("No existe ninguna cita con ese ID");
                return;
            }
            cc.cambiarEstado(id, txtEstado.getText());
            lblMensaje.setText("Estado actualizado correctamente");
        } catch (NumberFormatException e) {
            lblMensaje.setText("El ID de la cita debe ser un numero");
        } catch (IllegalArgumentException e) {
            lblMensaje.setText(e.getMessage());
        }
    }//GEN-LAST:event_btnEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstado;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel panelListaCitas;
    private javax.swing.JTextField txtDniPersonal;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdMascota;
    private javax.swing.JTextField txtMotivo;
    // End of variables declaration//GEN-END:variables
}
