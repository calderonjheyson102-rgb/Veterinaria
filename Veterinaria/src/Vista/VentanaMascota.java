package Vista;

import veterinaria.Cliente;
import veterinaria.Mascota;
import veterinaria.MascotaController;
import veterinaria.Persona;
import veterinaria.PersonaController;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class VentanaMascota extends javax.swing.JInternalFrame {
    // Constantes que identifican cada modo de la ventana
    public static final int REGISTRAR = 1;
    public static final int BUSCAR = 2;
    public static final int LISTA = 3;
    public static final int HISTORIAL = 4;
    
    private PersonaController pc;
    private MascotaController mc;

    
public VentanaMascota(PersonaController pc, MascotaController mc, int modo) {
        initComponents();

        this.pc = pc;
        this.mc = mc;

        // Ocultar el panel de lista inicialmente y de historial
        panelLista.setVisible(false);

        switch (modo) {

            case REGISTRAR:
                setTitle("Registrar Mascota");
                btnBuscar.setVisible(false);
                break;

            case BUSCAR:
                setTitle("Buscar Mascota");
                panelDatos.setVisible(false);
                btnRegistrar.setVisible(false);
                pack();
                break;

            case LISTA:
                setTitle("Lista de Mascotas");

                // Ocultar los componentes de registro y búsqueda
                panelDatos.setVisible(false);
                btnRegistrar.setVisible(false);
                btnBuscar.setVisible(false);
                txtId.setVisible(false);
                jLabel7.setVisible(false);
                lblMensaje.setVisible(false);
                // Mostrar el panel de listar
                panelLista.setVisible(true);
                // Cargar las mascotas en la tabla
                cargarTablaMascotas();

                break;

            case HISTORIAL:
                setTitle("Historial Clínico");
                // Ocultar los otros paneles
                panelDatos.setVisible(false);
                panelLista.setVisible(false);

                // Ocultar los componentes de búsqueda normal
                btnBuscar.setVisible(false);
                btnRegistrar.setVisible(false);
                txtId.setVisible(false);
                jLabel7.setVisible(false);
                lblMensaje.setVisible(false);
                break;
            default:
                btnBuscar.setVisible(false);
                break;
        }
        pack();
    }

    // Cargar las mascotas registradas en la tabla
    private void cargarTablaMascotas() {

        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tablaMascotas.getModel();

        // Limpiar las filas anteriores
        modelo.setRowCount(0);

        // Recorrer las mascotas registradas
        for (Mascota m : mc.getMascotas()) {

            // Obtener el nombre completo del dueño
            String duenio = m.getDuenio().getNombre() + " " + m.getDuenio().getPaterno();
            // Agregar los datos a la tabla
            modelo.addRow(new Object[]{
                m.getId_mascota(),
                m.getNombre(),
                m.getEspecie(),
                m.getRaza(),
                m.getPeso(),
                m.getSexo(),
                duenio,
                m.getDuenio().getNro_documento()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDniDuenio = new javax.swing.JTextField();
        panelLista = new javax.swing.JPanel();
        lblTituloLista = new javax.swing.JLabel();
        scrollLista = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registrar Mascotas");

        jLabel7.setText("ID: ");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        lblMensaje.setText("...");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        jLabel3.setText("Nombre");

        jLabel1.setText("Especie");

        jLabel2.setText("Raza");

        jLabel4.setText("Peso (kg)");

        jLabel5.setText("Sexo (Macho o Hembra)");

        jLabel6.setText("DNI del dueño");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(101, 101, 101)
                        .addComponent(txtDniDuenio))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(49, 49, 49)
                        .addComponent(txtSexo))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(130, 130, 130)
                        .addComponent(txtPeso))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(153, 153, 153)
                        .addComponent(txtRaza))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(139, 139, 139)
                        .addComponent(txtEspecie))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(135, 135, 135)
                        .addComponent(txtNombre)))
                .addGap(91, 91, 91))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtDniDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTituloLista.setText("MASCOTAS REGISTRADAS");

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Especie", "Raza", "Peso", "Sexo", "Dueño", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaMascotas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        scrollLista.setViewportView(tablaMascotas);
        if (tablaMascotas.getColumnModel().getColumnCount() > 0) {
            tablaMascotas.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListaLayout.createSequentialGroup()
                        .addComponent(lblTituloLista)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrollLista, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)))
        );
        panelListaLayout.setVerticalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            // Busca en la lista de personas al dueño por su documento
            Persona p = pc.buscarPorDocumento(txtDniDuenio.getText().trim());
            if (p == null) {
                lblMensaje.setText("No existe ninguna persona con ese documento");
                return;
            }
            // La lista tiene Clientes y Personal (herencia): el dueño debe ser Cliente
            if (!(p instanceof Cliente)) {
                lblMensaje.setText("Ese documento pertenece a personal, no a un cliente");
                return;
            }
            // Crea la mascota; (Cliente) p es un casting: convierte la Persona en Cliente
            Mascota m = new Mascota(Integer.parseInt(txtId.getText().trim()),
                    txtNombre.getText(), txtEspecie.getText(), txtRaza.getText(),
                    Double.parseDouble(txtPeso.getText().trim()),
                    txtSexo.getText(), (Cliente) p);
            // La guarda en la lista (valida que el ID no se repita)
            mc.registrarMascota(m);
            lblMensaje.setText("Mascota registrada correctamente");
        } catch (NumberFormatException e) {
            // El ID o el peso no son números
            lblMensaje.setText("El ID y el peso deben ser numeros");
        } catch (IllegalArgumentException e) {
            // Error de validación de algún setter o ID repetido
            lblMensaje.setText(e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            // Busca la mascota por su ID en la lista
            Mascota m = mc.buscarPorId(Integer.parseInt(txtId.getText().trim()));
            if (m == null) {
                // No existe: se ocultan los datos
                lblMensaje.setText("No existe ninguna mascota con ese ID");
                panelDatos.setVisible(false);
                pack();
                return;
            }
            // Muestra los datos de la mascota en los campos
            txtNombre.setText(m.getNombre());
            txtEspecie.setText(m.getEspecie());
            txtRaza.setText(m.getRaza());
            txtPeso.setText(String.valueOf(m.getPeso()));
            txtSexo.setText(m.getSexo());
            txtDniDuenio.setText(m.getDuenio().getNro_documento());
            panelDatos.setVisible(true);  // muestra el panel con los datos
            lblMensaje.setText("Mascota encontrada");
            pack();
        } catch (NumberFormatException e) {
            // El ID no es un número
            lblMensaje.setText("El ID debe ser un numero");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTituloLista;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelLista;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JTable tablaMascotas;
    private javax.swing.JTextField txtDniDuenio;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
