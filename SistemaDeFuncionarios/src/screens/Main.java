/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import javax.swing.JOptionPane;
import java.util.Arrays;
import sistema.Gestor;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import sistema.Funcionario;
import sistema.Ponto;

import database.PostgreSQLJDBC;

/**
 *
 * @author oseia
 */
public class Main extends javax.swing.JFrame {
    
    // gestor
    public static Gestor gestor;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        // pega o caminho do diretorio
        String path = new File("").getAbsolutePath();
        
        // banco de dados
        PostgreSQLJDBC teste = new PostgreSQLJDBC();
        
        /* carrega dados do gestor*/
        try {
            // ler arquivo de email e senha de gestores
            File gestores = new File(path+"/src/data/Gestores.txt");
            Scanner dados = new Scanner(gestores);
            
            // cada linha segue: email,senha,nome,CPF,nascimento,telefone,sexo,endereco
            while(dados.hasNextLine()){
                String[] gestorInfo = dados.nextLine().split(",");
                
                // inicializando os gestores cadastrados
                this.gestor = new Gestor();
                this.gestor.setEmail(gestorInfo[0]);
                this.gestor.setSenha(gestorInfo[1]);
                this.gestor.setNome(gestorInfo[2]);
                this.gestor.setCpf(gestorInfo[3]);
                this.gestor.setDataNascimento(LocalDate.parse(gestorInfo[4]));
                this.gestor.setTelefone(gestorInfo[5]);
                this.gestor.setSexo(gestorInfo[6]);
                this.gestor.setEnderço(gestorInfo[7]);
            }
            dados.close();
        }
        catch (FileNotFoundException ex){
            // menssage de erro
            JOptionPane.showMessageDialog(null, "Falha ao carregar dados do gestor!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        /* carrega dados dos funcionarios e seus pontos*/
        try {
            // ler arquivo de funcionarios
            File funcionarios = new File(path+"/src/data/Funcionarios.txt");
            Scanner dadosF = new Scanner(funcionarios);
            
            while(dadosF.hasNextLine()){
                // padrao: email,senha,nome,CPF,nascimento,telefone,sexo,endereco,cargo,salario
                String[] funcInfo = dadosF.nextLine().split(",");
                
                Funcionario func = new Funcionario();
                func.setEmail(funcInfo[0]);
                func.setSenha(funcInfo[1]);
                func.setNome(funcInfo[2]);
                func.setCpf(funcInfo[3]);
                func.setDataNascimento(LocalDate.parse(funcInfo[4]));
                func.setTelefone(funcInfo[5]);
                func.setSexo(funcInfo[6]);
                func.setEnderço(funcInfo[7]);
                func.setCargo(funcInfo[8]);
                func.setSalario(Float.parseFloat(funcInfo[9]));
                func.setCodigo(Integer.parseInt(funcInfo[10]));
                
                // carrega os pontos
                File pontos = new File(path+"/src/data/pontos/"+funcInfo[0]+".txt");
                Scanner dadosP = new Scanner(pontos);
                while(dadosP.hasNextLine()){
                    // padrao: data,entrada,saida
                    String[] pontoInfo = dadosP.nextLine().split(",");
                    
                    if(pontoInfo.length == 0){
                        break;
                    }
                    
                    // inicializa os pontos
                    Ponto novoPonto = new Ponto();
                    novoPonto.setDate(LocalDate.parse(pontoInfo[0]));
                    novoPonto.setLogedIn(LocalTime.parse(pontoInfo[1]));
                    novoPonto.setLogedOut(LocalTime.parse(pontoInfo[2]));
                    
                    // adiciona ponto
                    func.addPonto(novoPonto);
                }
                dadosP.close();
                
                this.gestor.addFuncionario(func);
            }
            dadosF.close();
        }
        catch (FileNotFoundException ex){
            // menssage de erro
            JOptionPane.showMessageDialog(null, "Falha ao carregar dados dos funcionarios!", "Erro", JOptionPane.ERROR_MESSAGE);
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
        painelLogin = new javax.swing.JPanel();
        labelEmail = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        fieldSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        checkBoxGestor = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGF");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        setResizable(false);

        painelMain.setBackground(new java.awt.Color(0, 153, 204));

        painelLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        painelLogin.setForeground(new java.awt.Color(255, 255, 255));

        labelEmail.setText("Email");

        labelSenha.setText("Senha");

        btnLogin.setBackground(new java.awt.Color(0, 102, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTitulo.setText("Sistema de Gerenciamento de Funcionarios");

        checkBoxGestor.setText("Gestor");

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxGestor)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(painelLoginLayout.createSequentialGroup()
                            .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(fieldSenha))
                        .addGroup(painelLoginLayout.createSequentialGroup()
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(checkBoxGestor)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout painelMainLayout = new javax.swing.GroupLayout(painelMain);
        painelMain.setLayout(painelMainLayout);
        painelMainLayout.setHorizontalGroup(
            painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMainLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(189, 189, 189))
        );
        painelMainLayout.setVerticalGroup(
            painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMainLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email = fieldEmail.getText();
        char[] senha = fieldSenha.getPassword();
        
        boolean achou = false;

        // verifica se é Gestor
        if(checkBoxGestor.isSelected()){
            if(email.equals(this.gestor.getEmail()) && Arrays.equals((this.gestor.getSenha()).toCharArray(), senha)){
                // gestor correto
                new MenuAdmin().setVisible(true);
                
                achou = true;
            }
        }else {
            // usuario comum
            for(int i=0; i<this.gestor.getFuncionarios().size(); i++){
                if(this.gestor.getFuncionarios().get(i).getEmail().equals(email) && 
                    Arrays.equals((this.gestor.getFuncionarios().get(i).getSenha()).toCharArray(), senha)
                ){
                    // usuario encontrado
                    new MenuFuncionario(i+"").setVisible(true);
                    achou = true;
                }
            }
        }
        
        if(!achou) {
            // menssage de erro
            JOptionPane.showMessageDialog(null, "Usuario não encontrado!", "Falha no login", JOptionPane.ERROR_MESSAGE);
        }
        
        // limpa os campos
        fieldEmail.setText("");
        fieldSenha.setText("");
        checkBoxGestor.setSelected(false);
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkBoxGestor;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPanel painelMain;
    // End of variables declaration//GEN-END:variables
}
