/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oseia
 */
public class MenuAdmin extends javax.swing.JFrame {
    
    

    /**
     * Creates new form Controle
     */
    public MenuAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        
        // destiva botões
        btMenu_Editar.setEnabled(false);
        btMenu_Remover.setEnabled(false);
        btMenu_Cancelar.setEnabled(false);
        
        // carrega os funcionarios do gestor
        this.carregarTabela();
    }
    
    // carrega tabela de funcionarios
    public void carregarTabela(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Codigo", "Nome", "Email"}, 0);

        for(int i=0; i<Main.gestor.getFuncionarios().size(); i++){
            Object linha[] = new Object[]{
                Main.gestor.getFuncionarios().get(i).getCodigo(),
                Main.gestor.getFuncionarios().get(i).getNome(),
                Main.gestor.getFuncionarios().get(i).getEmail(),
            };
            modelo.addRow(linha);
        }

        // tabela recebe modelo
        tblMenu_Func.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMain = new javax.swing.JPanel();
        btMenu_Novo = new javax.swing.JButton();
        btMenu_Relatorio = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu_Func = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        btMenu_Pesquisar = new javax.swing.JToggleButton();
        btAtualizar = new javax.swing.JButton();
        btMenu_Editar = new javax.swing.JButton();
        btMenu_Remover = new javax.swing.JButton();
        btMenu_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btMenu_Novo.setText("Novo");
        btMenu_Novo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMenu_Novo.setDoubleBuffered(true);
        btMenu_Novo.setFocusPainted(false);
        btMenu_Novo.setFocusable(false);
        btMenu_Novo.setHideActionText(true);
        btMenu_Novo.setInheritsPopupMenu(true);
        btMenu_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenu_NovoActionPerformed(evt);
            }
        });

        btMenu_Relatorio.setText("Relatorio");

        tblMenu_Func.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenu_Func.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblMenu_Func.setAutoscrolls(false);
        tblMenu_Func.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblMenu_Func.setFocusTraversalPolicyProvider(true);
        tblMenu_Func.setFocusable(false);
        tblMenu_Func.setInheritsPopupMenu(true);
        tblMenu_Func.setOpaque(false);
        tblMenu_Func.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblMenu_Func.setShowGrid(false);
        tblMenu_Func.getTableHeader().setResizingAllowed(false);
        tblMenu_Func.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenu_FuncMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMenu_Func);
        if (tblMenu_Func.getColumnModel().getColumnCount() > 0) {
            tblMenu_Func.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblMenu_Func.getColumnModel().getColumn(1).setResizable(false);
            tblMenu_Func.getColumnModel().getColumn(1).setPreferredWidth(250);
            tblMenu_Func.getColumnModel().getColumn(2).setResizable(false);
            tblMenu_Func.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        jTextField1.setToolTipText("Nome ou código do funcionário");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btMenu_Pesquisar.setText("Pesquisar");
        btMenu_Pesquisar.setFocusCycleRoot(true);
        btMenu_Pesquisar.setRolloverEnabled(false);
        btMenu_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenu_PesquisarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btMenu_Editar.setText("Editar");
        btMenu_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenu_EditarActionPerformed(evt);
            }
        });

        btMenu_Remover.setText("Remover");
        btMenu_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenu_RemoverActionPerformed(evt);
            }
        });

        btMenu_Cancelar.setText("Cancelar");
        btMenu_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenu_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMainLayout = new javax.swing.GroupLayout(painelMain);
        painelMain.setLayout(painelMainLayout);
        painelMainLayout.setHorizontalGroup(
            painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMainLayout.createSequentialGroup()
                .addGroup(painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMainLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btMenu_Pesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelMainLayout.createSequentialGroup()
                        .addGroup(painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelMainLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelMainLayout.createSequentialGroup()
                                        .addComponent(btMenu_Relatorio)
                                        .addGap(261, 261, 261))
                                    .addGroup(painelMainLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btMenu_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btMenu_Editar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btMenu_Remover)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btMenu_Cancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btAtualizar))))
                            .addGroup(painelMainLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelMainLayout.setVerticalGroup(
            painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMainLayout.createSequentialGroup()
                .addGroup(painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMainLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelMainLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMenu_Pesquisar))
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btMenu_Novo)
                            .addComponent(btAtualizar)
                            .addComponent(btMenu_Editar)
                            .addComponent(btMenu_Remover)
                            .addComponent(btMenu_Cancelar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btMenu_Relatorio)
                .addGap(24, 24, 24))
        );

        jTextField1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(painelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenu_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenu_NovoActionPerformed
        
        // abre o gerenciador
        new GerenciaFuncionario("").setVisible(true);
    }//GEN-LAST:event_btMenu_NovoActionPerformed

    private void tblMenu_FuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenu_FuncMouseClicked
        
        // ativa botoes
        btMenu_Editar.setEnabled(true);
        btMenu_Remover.setEnabled(true);
        btMenu_Cancelar.setEnabled(true);
        
        // desativa
        btMenu_Novo.setEnabled(false);
    }//GEN-LAST:event_tblMenu_FuncMouseClicked

    private void btMenu_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenu_PesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMenu_PesquisarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        
        // descelecionar tabela
        tblMenu_Func.clearSelection();
        
        // desativar botoes
        btMenu_Cancelar.setEnabled(false);
        btMenu_Editar.setEnabled(false);
        btMenu_Remover.setEnabled(false);

        // ativa o botão novo
        btMenu_Novo.setEnabled(true);
        
        // atualiza tabela
        this.carregarTabela();
        
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btMenu_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenu_EditarActionPerformed
        // pega o id do usario selecionado
        int id = tblMenu_Func.getSelectedRow();
        
        // passa o id do usuario a ser editado
        new GerenciaFuncionario(id+"").setVisible(true);
        
    }//GEN-LAST:event_btMenu_EditarActionPerformed

    private void btMenu_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenu_RemoverActionPerformed
        // pega o id do usario selecionado
        int id = tblMenu_Func.getSelectedRow();
        
        String nome = Main.gestor.getFuncionarios().get(id).getNome();
        
        int escolha = JOptionPane.showConfirmDialog(null, ("Tem certeza que deseja remover o funcionario '"+nome+"'?"), "Deletar", JOptionPane.YES_NO_OPTION);

        if(escolha == JOptionPane.YES_OPTION){
            // deleta funcionario
            Main.gestor.getFuncionarios().remove(id);
            
            // desativa botoes
            btMenu_Cancelar.setEnabled(false);
            btMenu_Editar.setEnabled(false);
            btMenu_Remover.setEnabled(false);
            
            // descelecionar tabela
            tblMenu_Func.clearSelection();
            
            // ativa o botão novo
            btMenu_Novo.setEnabled(true);
            
            // atualiza tabela
            this.carregarTabela();
        }
    }//GEN-LAST:event_btMenu_RemoverActionPerformed

    private void btMenu_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenu_CancelarActionPerformed
        // desativa botoes
        btMenu_Cancelar.setEnabled(false);
        btMenu_Editar.setEnabled(false);
        btMenu_Remover.setEnabled(false);
        
        // ativa o botão novo
        btMenu_Novo.setEnabled(true);
        
        // descelecionar tabela
        tblMenu_Func.clearSelection();
    }//GEN-LAST:event_btMenu_CancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btMenu_Cancelar;
    private javax.swing.JButton btMenu_Editar;
    private javax.swing.JButton btMenu_Novo;
    private javax.swing.JToggleButton btMenu_Pesquisar;
    private javax.swing.JButton btMenu_Relatorio;
    private javax.swing.JButton btMenu_Remover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel painelMain;
    private javax.swing.JTable tblMenu_Func;
    // End of variables declaration//GEN-END:variables
}
