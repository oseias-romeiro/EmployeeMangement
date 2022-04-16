/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import sistema.Funcionario;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author oseia
 */
public class GerenciaFuncionario extends javax.swing.JFrame {
    
    private Funcionario func = new Funcionario();

    /**
     * Creates new form cadastraFuncionario
     */
    public GerenciaFuncionario(String id) {
        initComponents();
        
        setLocationRelativeTo(null);
        
        if(!id.isEmpty()){
            
            // editar usuario
            btnAdiciona.setEnabled(false);
            
            // pega funcionario
            int id2 = Integer.parseInt(id);
            func = Main.gestor.getFuncionarios().get(id2);
            
            // seta os dados do usuario encontrado nos campos
            fieldNome.setText(func.getNome());
            fieldCPF.setText(func.getCpf());
            fieldTelefone.setText(func.getTelefone());
            fieldSexo.setText(func.getSexo());
            fieldEmail.setText(func.getEmail());
            fieldEndereco.setText(func.getEnderço());
            fieldSenha.setText(func.getSenha());
            fieldCargo.setText(func.getCargo());
            fieldSalario.setText(func.getSalario()+"");
            
            String[] nascimento = func.getDataNascimento().toString().split("-");
            fieldNascimento.setText(nascimento[2]+nascimento[1]+nascimento[0]);
            
        }else{
            // adicionar usuario
            btnEdita.setEnabled(false);
        }
        
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
        jPanel2 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelCPF = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        fieldEndereco = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        fieldTelefone = new javax.swing.JTextField();
        fieldCPF = new javax.swing.JTextField();
        fieldSexo = new javax.swing.JTextField();
        btnAdiciona = new javax.swing.JButton();
        btnEdita = new javax.swing.JButton();
        labelSalario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        fieldSalario = new javax.swing.JTextField();
        fieldSenha = new javax.swing.JTextField();
        btnGerar = new javax.swing.JButton();
        labelCargo = new javax.swing.JLabel();
        fieldCargo = new javax.swing.JTextField();
        fieldNascimento = new javax.swing.JFormattedTextField();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SGF");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelNome.setText("Nome");

        labelCPF.setText("CPF");

        labelTelefone.setText("Telefone");

        labelSexo.setText("Sexo");

        labelEmail.setText("Email");

        labelEndereco.setText("Endereço");

        labelData.setText("Nascimento");

        fieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeActionPerformed(evt);
            }
        });

        btnAdiciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdiciona.setText("Adicionar");
        btnAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaActionPerformed(evt);
            }
        });

        btnEdita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEdita.setText("Editar");
        btnEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaActionPerformed(evt);
            }
        });

        labelSalario.setText("Salario");

        labelSenha.setText("Senha");

        btnGerar.setText("gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        labelCargo.setText("Cargo");

        try {
            fieldNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fieldNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGerar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(fieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(fieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                                    .addComponent(fieldCPF))
                                                .addGap(19, 19, 19)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addComponent(fieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(fieldNascimento))))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(fieldCargo)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(163, 163, 163)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdiciona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fieldSalario))))
                        .addGap(37, 37, 37))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(labelData)
                    .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(labelSexo)
                    .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelEmail)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEndereco)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSenha)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGerar)))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCargo)
                    .addComponent(fieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdita)
                    .addComponent(btnAdiciona))
                .addGap(23, 23, 23))
        );

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTitulo.setText("Gerenciamento de Funcionarios");

        javax.swing.GroupLayout painelMainLayout = new javax.swing.GroupLayout(painelMain);
        painelMain.setLayout(painelMainLayout);
        painelMainLayout.setHorizontalGroup(
            painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMainLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        painelMainLayout.setVerticalGroup(
            painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMainLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelTitulo)
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int geraCodigo(){
        int codigo;
        Random random = new Random();
        codigo = random.nextInt(10000);
        if(Integer.toString(codigo).length() < 2){
            codigo = Integer.parseInt(Integer.toString(codigo)+"000");
        }
        if(Integer.toString(codigo).length() < 3){
            codigo = Integer.parseInt(Integer.toString(codigo)+"00");
        }
        return (int) codigo;
    }
    
    
    private void btnAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaActionPerformed
        
        // entrada de dados
        String nome = fieldNome.getText();
        String CPF = fieldCPF.getText();
        
        String[] dataNasc = (fieldNascimento.getText().replace(" ", "")).split("/");
        LocalDate nascimento = LocalDate.parse(dataNasc[2]+"-"+dataNasc[1]+"-"+dataNasc[0]);
        
        String telefone = fieldTelefone.getText();
        String sexo = fieldSexo.getText();
        String email = fieldEmail.getText();
        String endereco = fieldEndereco.getText();
        String senha = fieldSenha.getText();
        String cargo = fieldCargo.getText();
        String salario = fieldSalario.getText();
        
        if(!nome.isEmpty() && !CPF.isEmpty() && !telefone.isEmpty()
                && !sexo.isEmpty() && !email.isEmpty() && !endereco.isEmpty() && !senha.isEmpty()
                && !cargo.isEmpty() && !salario.isEmpty()){
            // salva dados
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(nome);
            funcionario.setCpf(CPF);
            funcionario.setDataNascimento(nascimento);
            funcionario.setTelefone(telefone);
            funcionario.setSexo(sexo);
            funcionario.setEmail(email);
            funcionario.setEnderço(endereco);
            funcionario.setSenha(senha);
            funcionario.setCargo(cargo);
            funcionario.setSalario(Float.parseFloat(salario));
            
            
            // gerandor de codigo unico
            int codigo;
            while(true){
                boolean jaExiste = false;
                // gera codigo
                codigo = this.geraCodigo();
                
                // verificando se o código já existe
                for(int i=0; i<Main.gestor.getFuncionarios().size(); i++){
                    if(Main.gestor.getFuncionarios().get(i).getCodigo() == codigo){
                        jaExiste = true;
                    }
                }
                // se não existe para o loop
                if(!jaExiste){
                    break;
                }
            }
            funcionario.setCodigo(codigo);
            
            // adciona funcionario ao gestor
            Main.gestor.addFuncionario(funcionario);
            
            // fecha tela
            dispose();
        }else {
            // menssage de erro
            JOptionPane.showMessageDialog(null, "Dados invalidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdicionaActionPerformed

    private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
        // entrada de dados
        String nome = fieldNome.getText();
        String CPF = fieldCPF.getText();
        
        String[] dataNasc = (fieldNascimento.getText().replace(" ", "")).split("/");
        LocalDate nascimento = LocalDate.parse(dataNasc[2]+"-"+dataNasc[1]+"-"+dataNasc[0]);
        
        String telefone = fieldTelefone.getText();
        String sexo = fieldSexo.getText();
        String email = fieldEmail.getText();
        String endereco = fieldEndereco.getText();
        String senha = fieldSenha.getText();
        String cargo = fieldCargo.getText();
        String salario = fieldSalario.getText();
        
        if(!nome.isEmpty() && !CPF.isEmpty() && !telefone.isEmpty() && !sexo.isEmpty() 
                && !email.isEmpty() && !endereco.isEmpty() && !senha.isEmpty()
                && !cargo.isEmpty() && !salario.isEmpty()){
            
            // salva os dados editados do usuario
            this.func.setNome(nome);
            this.func.setCpf(CPF);
            this.func.setDataNascimento(nascimento);
            this.func.setTelefone(telefone);
            this.func.setSexo(sexo);
            this.func.setEmail(email);
            this.func.setEnderço(endereco);
            this.func.setSenha(senha);
            this.func.setCargo(cargo);
            this.func.setSalario(Float.parseFloat(salario));
            
            // fecha tela
            dispose();
        }else {
            // menssage de erro
            JOptionPane.showMessageDialog(null, "Dados invalidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditaActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        
        // gera um senha aleatoria de 10 caracteres
        UUID uuid = UUID.randomUUID();
        String senha = uuid.toString();
        fieldSenha.setText(senha.substring(0, 10));
    }//GEN-LAST:event_btnGerarActionPerformed

    private void fieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaFuncionario("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdiciona;
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnGerar;
    private javax.swing.JTextField fieldCPF;
    private javax.swing.JTextField fieldCargo;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldEndereco;
    private javax.swing.JFormattedTextField fieldNascimento;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldSalario;
    private javax.swing.JTextField fieldSenha;
    private javax.swing.JTextField fieldSexo;
    private javax.swing.JTextField fieldTelefone;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelMain;
    // End of variables declaration//GEN-END:variables
}
