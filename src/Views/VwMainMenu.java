/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import Connection.Connect;
import Entities.User;
import Models.CustomTableCellRenderer;
import Views.Manage.VwRepairs;
import Views.Manage.VwVehicles;
import Views.Manage.VwCustomers;
import Views.Register.VwTicketsRegister;
import Views.Register.VwCustomersRegister;
import Views.Register.VwRepairsRegister;
import Views.Register.VwVehiclesRegister;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dehr2
 */
public class VwMainMenu extends javax.swing.JPanel {

    private DefaultTableModel model = new DefaultTableModel();
    private User currentUser;
    public VwMainMenu(User currentUser) {
        this.currentUser = currentUser;
        initComponents();
        setName("MainMenu");
        model.addColumn("ID");
        model.addColumn("ID Cliente");
        model.addColumn("ID Vehiculo");
        model.addColumn("Tipo de Reparación");
        model.addColumn("Fecha de ingreso");
        model.addColumn("Fecha de salida");
        model.addColumn("% de coste");
        model.addColumn("Coste total");
        tbRepairs.setModel(model);
        scpRepairs.setViewportView(tbRepairs);
        loadTable();
        btnTickets.setVisible(false);
        btnIncomes.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnVehicles1 = new javax.swing.JButton();
        btnRepairs = new javax.swing.JButton();
        btnTickets = new javax.swing.JButton();
        btnIncomes = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnVehiclesREG = new javax.swing.JButton();
        btnRepairsREG = new javax.swing.JButton();
        btnTicketsREG = new javax.swing.JButton();
        btnCustomersREG = new javax.swing.JButton();
        scpRepairs = new javax.swing.JScrollPane();
        tbRepairs = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            };
        };
        jPanel6 = new javax.swing.JPanel();
        txtViewPanel = new javax.swing.JLabel();
        labMode = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1920, 885));
        setRequestFocusEnabled(false);

        jPanel5.setBackground(new java.awt.Color(65, 80, 87));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(191, 174, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(247, 150, 64));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administración");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(191, 174, 153));

        btnVehicles1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnVehicles1.setText("<html><center><img src='file:///C:/Users/dehr2/OneDrive/Escritorio/USHHHH/TallerMecanicoCamilo/TallerMecanicoCamilo/src/Images/imgVehicles.png'><br>Vehiculos</center></html>");
        btnVehicles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicles1ActionPerformed(evt);
            }
        });

        btnRepairs.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnRepairs.setText("<html><center><img src='file:///C:/Users/dehr2/OneDrive/Escritorio/USHHHH/TallerMecanicoCamilo/TallerMecanicoCamilo/src/Images/imgRepairs.png'><br>Reparaciones</center></html>");
        btnRepairs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepairsActionPerformed(evt);
            }
        });

        btnTickets.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnTickets.setText("<html><center><img src='file:///C:/Users/dehr2/OneDrive/Escritorio/USHHHH/TallerMecanicoCamilo/TallerMecanicoCamilo/src/Images/imgTickets.png'><br>Tickets</center></html>");
        btnTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketsActionPerformed(evt);
            }
        });

        btnIncomes.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnIncomes.setText("<html><center><img src='file:///C:/Users/dehr2/OneDrive/Escritorio/USHHHH/TallerMecanicoCamilo/TallerMecanicoCamilo/src/Images/imgIncomes.png'><br>Ingresos</center></html>");
        btnIncomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncomesActionPerformed(evt);
            }
        });

        btnCustomers.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnCustomers.setText("<html><center><img src='file:///C:/Users/dehr2/OneDrive/Escritorio/USHHHH/TallerMecanicoCamilo/TallerMecanicoCamilo/src/Images/imgCustomers.png'><br>Clientes</center></html>");
        btnCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVehicles1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncomes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRepairs, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVehicles1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRepairs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnIncomes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(191, 174, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel7.setBackground(new java.awt.Color(247, 150, 64));

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de datos");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(191, 174, 153));

        btnVehiclesREG.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnVehiclesREG.setText("<html><center><img src='file:///C:/Users/dehr2/OneDrive/Escritorio/USHHHH/TallerMecanicoCamilo/TallerMecanicoCamilo/src/Images/imgVehicles.png'><br>Vehiculos</center></html>");
        btnVehiclesREG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiclesREGActionPerformed(evt);
            }
        });

        btnRepairsREG.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnRepairsREG.setText("<html><center><img src='file:///C:/Users/dehr2/OneDrive/Escritorio/USHHHH/TallerMecanicoCamilo/TallerMecanicoCamilo/src/Images/imgRepairs.png'><br>Reparaciones</center></html>");
        btnRepairsREG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepairsREGActionPerformed(evt);
            }
        });

        btnTicketsREG.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnTicketsREG.setText("<html><center><img src='file:///C:/Users/dehr2/OneDrive/Escritorio/USHHHH/TallerMecanicoCamilo/TallerMecanicoCamilo/src/Images/imgTickets.png'><br>Generar Tickets</center></html>");
        btnTicketsREG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketsREGActionPerformed(evt);
            }
        });

        btnCustomersREG.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnCustomersREG.setText("<html><center><img src='file:///C:/Users/dehr2/OneDrive/Escritorio/USHHHH/TallerMecanicoCamilo/TallerMecanicoCamilo/src/Images/imgCustomers.png'><br>Clientes</center></html>");
        btnCustomersREG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersREGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRepairsREG, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnVehiclesREG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCustomersREG, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnTicketsREG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVehiclesREG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomersREG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTicketsREG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRepairsREG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tbRepairs.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbRepairs.getTableHeader().setReorderingAllowed(false);
        tbRepairs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbRepairs.setMaximumSize(new java.awt.Dimension(80, 80));
        scpRepairs.setViewportView(tbRepairs);

        jPanel6.setBackground(new java.awt.Color(191, 174, 153));

        txtViewPanel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        txtViewPanel.setForeground(new java.awt.Color(255, 255, 255));

        labMode.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        labMode.setForeground(new java.awt.Color(255, 255, 255));
        labMode.setText("Reparaciones Pendientes");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labMode)
                .addGap(22, 22, 22)
                .addComponent(txtViewPanel)
                .addGap(71, 71, 71))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtViewPanel)
                    .addComponent(labMode))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scpRepairs, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scpRepairs, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2224, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1076, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVehicles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicles1ActionPerformed
        panelSwitch(new VwVehicles(currentUser));
    }//GEN-LAST:event_btnVehicles1ActionPerformed

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTicketsActionPerformed

    private void btnIncomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncomesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIncomesActionPerformed

    private void btnRepairsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepairsActionPerformed
        panelSwitch(new VwRepairs(currentUser));
    }//GEN-LAST:event_btnRepairsActionPerformed

    private void btnCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersActionPerformed
        panelSwitch(new VwCustomers(currentUser));
    }//GEN-LAST:event_btnCustomersActionPerformed

    private void btnVehiclesREGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiclesREGActionPerformed
        panelSwitch(new VwVehiclesRegister(currentUser));
    }//GEN-LAST:event_btnVehiclesREGActionPerformed

    private void btnRepairsREGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepairsREGActionPerformed
        panelSwitch(new VwRepairsRegister(currentUser));
    }//GEN-LAST:event_btnRepairsREGActionPerformed

    private void btnTicketsREGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsREGActionPerformed
        panelSwitch(new VwTicketsRegister(currentUser));
    }//GEN-LAST:event_btnTicketsREGActionPerformed

    private void btnCustomersREGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersREGActionPerformed
        panelSwitch(new VwCustomersRegister(currentUser));
    }//GEN-LAST:event_btnCustomersREGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnCustomersREG;
    private javax.swing.JButton btnIncomes;
    private javax.swing.JButton btnRepairs;
    private javax.swing.JButton btnRepairsREG;
    private javax.swing.JButton btnTickets;
    private javax.swing.JButton btnTicketsREG;
    private javax.swing.JButton btnVehicles1;
    private javax.swing.JButton btnVehiclesREG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel labMode;
    private javax.swing.JScrollPane scpRepairs;
    private javax.swing.JTable tbRepairs;
    private javax.swing.JLabel txtViewPanel;
    // End of variables declaration//GEN-END:variables
private void panelSwitch(JPanel newPanel){
    javax.swing.JTabbedPane mainTabbedPane = ((javax.swing.JTabbedPane)this.getParent());
    newPanel.setSize(new java.awt.Dimension(getParent().getWidth(), getParent().getHeight()));
    mainTabbedPane.removeAll();
    mainTabbedPane.add(newPanel);
    mainTabbedPane.setSelectedComponent(newPanel);
}

private void loadTable(){
    Connection cn = Connect.connect(currentUser);
    String query = "SELECT rep_id, cliente_id, vehiculo_id, tipo_reparacion_id, reparacion_fecha_ingreso, reparacion_fecha_salida, reparacion_porcentaje_costo, reparacion_coste_total, rep_notas_adicionales FROM reparacion WHERE reparacion_fecha_salida IS NULL"; //Query para cargar la tabla de autobuses
        try(PreparedStatement st = cn.prepareStatement(query)){ //Prepara la sentencia
            ResultSet rs = st.executeQuery(); //Ejecuta la sentencia
            while(model.getRowCount()>0){ //Elimina todas las filas de la tabla
                model.removeRow(0); //Elimina la fila
            }

            while(rs.next()){ //Recorre el resultado
                Object fila[] = new Object[8]; //Crea un arreglo de objetos
                for(byte i = 0; i < 8; i++){ //Recorre el arreglo
                    if(rs.getObject(i+1) != null)
                        fila[i] = rs.getObject(i+1); //Asigna el valor correspondiente
                    else
                        if(i == 5)
                            fila[i] = "Pendiente";
                }
                model.addRow(fila); //Agrega la fila al modelo
            }
            st.close(); //Cierra la sentencia
            cn.close(); //Cierra la base de datos
        }catch(SQLException e){ //Si hay un error
            System.out.println("Carga de datos fallida " + e); //Imprime un mensaje de error
        }
        for (int i = 0; i < tbRepairs.getColumnCount(); i++) {
            tbRepairs.getColumnModel().getColumn(i).setHeaderRenderer(new CustomTableCellRenderer());
        }
        tbRepairs.setDefaultRenderer(java.lang.Object.class, new CustomTableCellRenderer());
}

}
