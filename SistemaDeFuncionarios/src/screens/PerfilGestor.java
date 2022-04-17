/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

import java.time.LocalDate;

/**
 *
 * @author oseia
 */
public class PerfilGestor extends javax.swing.JFrame {

    String path;
    /**
     * Creates new form PerfilGestor
     */
    public PerfilGestor() {
        initComponents();
        setLocationRelativeTo(null);
        
        setLocationRelativeTo(null);
        
        // pega o caminho do diretorio
        this.path = new File("").getAbsolutePath();
        
        // passa os dados do gestor para os campos
        fieldEmail.setText(Main.gestor.getEmail());
        fieldSenha.setText(Main.gestor.getSenha());
        fieldNome.setText(Main.gestor.getNome());
        fieldCPF.setText(Main.gestor.getCpf());
        
        String[] nascimento = Main.gestor.getDataNascimento().toString().split("-");
        fieldNascimento.setText(nascimento[2]+"/"+nascimento[1]+"/"+nascimento[0]);
        
        fieldTelefone.setText(Main.gestor.getTelefone());
        // ativa o radio button do sexo
        if(Main.gestor.getSexo().equals("M")){
            btnMasculino.setSelected(true);
        }else if(Main.gestor.getSexo().equals("F")) {
            btnFeminino.setSelected(true);
        }
        fieldEndereco.setText(Main.gestor.getEnderço());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelEmail = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        fieldSenha = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        labelCPF = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        fieldCPF = new javax.swing.JTextField();
        labelNascimento = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        fieldTelefone = new javax.swing.JTextField();
        labelSexo = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        fieldEndereco = new javax.swing.JTextField();
        fieldNascimento = new javax.swing.JFormattedTextField();
        btnMasculino = new javax.swing.JRadioButton();
        btnFeminino = new javax.swing.JRadioButton();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SGF");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelEmail.setText("Email");

        labelSenha.setText("Senha");

        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        labelNome.setText("Nome");

        labelCPF.setText("CPF");

        fieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCPFActionPerformed(evt);
            }
        });

        labelNascimento.setText("Nascimento");

        labelTelefone.setText("Telefone");

        labelSexo.setText("Sexo (opcional)");

        labelEndereco.setText("Endereço");

        fieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEnderecoActionPerformed(evt);
            }
        });

        try {
            fieldNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fieldNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnMasculino.setText("M");
        btnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasculinoActionPerformed(evt);
            }
        });

        btnFeminino.setText("F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(411, 411, 411))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelefone)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelSexo))
                                .addGap(18, 18, 18)
                                .addComponent(btnMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(btnFeminino)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCPF)
                        .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNascimento)
                        .addComponent(fieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTelefone)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelSexo)
                        .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMasculino)
                        .addComponent(btnFeminino)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTitulo.setText("GESTOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        // pega os dados dos campos
        String email = fieldEmail.getText();
        String senha = fieldSenha.getText();
        String nome = fieldNome.getText();
        String CPF = fieldCPF.getText();
        
        
        String[] data = (fieldNascimento.getText().replace(" ", "")).split("/");
        LocalDate nascimento = LocalDate.parse(data[2]+"-"+data[1]+"-"+data[0]);
        
        String telefone = fieldTelefone.getText();
        // verifica qual radio button referente ao sexo esta ativo
        String sexo;
        if(btnMasculino.isSelected()){
            sexo = "M";
        }else if(btnFeminino.isSelected()){
            sexo = "F";
        }else {
            sexo = " "; // não selecionado
        }
        String endereco = fieldEndereco.getText();

        // verificação
        if(!email.isEmpty() && !senha.isEmpty() && !nome.isEmpty() && !CPF.isEmpty() && !nascimento.toString().isEmpty()
                && !telefone.isEmpty() && !sexo.isEmpty() && !endereco.isEmpty()
            ){
            // edita o gestor
            Main.gestor.setEmail(email);
            Main.gestor.setSenha(senha);
            Main.gestor.setNome(nome);
            Main.gestor.setCpf(CPF);
            Main.gestor.setDataNascimento(nascimento);
            Main.gestor.setTelefone(telefone);
            Main.gestor.setSexo(sexo);
            Main.gestor.setEnderço(endereco);
            
            // edita o arquivo "gestores"
            try {
                // escrever os dados no arquivo
                FileWriter escrever = new FileWriter(path+"/src/data/gestores.txt");
                escrever.write(email+","+senha);
                escrever.close();
                
                // fecha a tela
                dispose();
            } catch (IOException e) {
                // menssage de erro
                JOptionPane.showMessageDialog(null, "Falha ao editar dados do gestor!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void fieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCPFActionPerformed

    private void fieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEnderecoActionPerformed

    private void btnMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasculinoActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PerfilGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilGestor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JRadioButton btnFeminino;
    private javax.swing.JRadioButton btnMasculino;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField fieldCPF;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldEndereco;
    private javax.swing.JFormattedTextField fieldNascimento;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldSenha;
    private javax.swing.JTextField fieldTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
