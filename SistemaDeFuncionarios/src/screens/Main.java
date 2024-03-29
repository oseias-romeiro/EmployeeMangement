/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import javax.swing.JOptionPane;
import sistema.Gestor;

import java.time.LocalDate;
import java.time.LocalTime;

import sistema.Funcionario;
import sistema.Ponto;

import database.PostgreSQLJDBC;
import java.sql.ResultSet;

/**
 *
 * @author oseia
 */
public class Main extends javax.swing.JFrame {
    
    // gestor
    public static Gestor gestor;
    
    private int id_func = 0;
    
    // banco de dados
    PostgreSQLJDBC psql = new PostgreSQLJDBC();
    ResultSet result = null;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        setLocationRelativeTo(null);
        
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

        painelLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

    
    private boolean carregaGestor(String email, String senha, int id){
        String sql = "";
        ResultSet result2 = null;
        ResultSet result3 = null;
        boolean achou = false;
        
        try {
            // procura gestores no banco de dados
            if(id == 0){
                sql = "SELECT * FROM gestores WHERE (email = '"+email+"' AND senha = '"+senha+"');";
            }else {
                sql = "SELECT * FROM gestores WHERE (id_autor = '"+id+"');";
            }
            
            this.result = psql.queryCon(sql);

            while(result.next()){

                // inicializa os gestor informado
                this.gestor = new Gestor();
                this.gestor.setId(result.getInt("id_autor"));
                this.gestor.setEmail(result.getString("email"));
                this.gestor.setSenha(result.getString("senha"));
                this.gestor.setNome(result.getString("nome"));
                this.gestor.setCpf(result.getString("cpf"));
                this.gestor.setDataNascimento(LocalDate.parse(result.getString("nascimento")));
                this.gestor.setTelefone(result.getString("telefone"));
                this.gestor.setSexo(result.getString("sexo"));
                this.gestor.setEnderço(result.getString("endereco"));

                // adiciona os funcionarios do gestor
                sql = "SELECT * FROM funcionarios WHERE (id_gestor = '"+this.gestor.getId()+"');";
                result2 = psql.queryCon(sql);
                
                int count = 0;
                while(result2.next()){
                    // inicializa o funcionario
                    Funcionario func = new Funcionario();
                    func.setId(result2.getInt("id"));
                    func.setEmail(result2.getString("email"));
                    func.setSenha(result2.getString("senha"));
                    func.setNome(result2.getString("nome"));
                    func.setCpf(result2.getString("cpf"));
                    func.setDataNascimento(LocalDate.parse(result2.getString("nascimento")));
                    func.setTelefone(result2.getString("telefone"));
                    func.setSexo(result2.getString("sexo"));
                    func.setEnderço(result2.getString("endereco"));
                    func.setCargo(result2.getString("cargo"));
                    func.setSalario(Float.parseFloat(result2.getString("salario")));
                    func.setCodigo(result2.getString("codigo"));
                    
                    // pega o id do funcionario que ira logar no array do gestor
                    if(id != 0){
                        if(email.equals(func.getEmail())){
                            this.id_func = count;
                        }
                    }

                    // adiciona o funcionario no gestor
                    this.gestor.addFuncionario(func);
                    
                    if(result2.isLast()){
                        break;
                    }
                    count++;
                }
                int count2 = 0;
                while(count2 <= count){
                    // adiciona os pontos
                    sql = "SELECT * FROM pontos WHERE (id_func = '"+this.gestor.getFuncionarios().get(count2).getId()+"');";
                    result3 = psql.queryCon(sql);
                    
                    while(result3.next()){
                        // inicializa os pontos
                        Ponto ponto = new Ponto();
                        ponto.setId(result3.getInt("id"));
                        ponto.setDate(LocalDate.parse(result3.getString("logdate")));
                        ponto.setLogedIn(LocalTime.parse(result3.getString("logedin")));
                        try {
                            ponto.setLogedOut(LocalTime.parse(result3.getString("logedout")));
                        }
                        catch(Exception e){}
                        
                        // adiciona os pontos ao funcionario
                        this.gestor.getFuncionarios().get(count2).addPonto(ponto);

                        if(result3.isLast()){
                            break;
                        }
                    }
                    count2++;
                }
                achou = true;
                break;
            }
        }catch(Exception e){
            System.out.println("Erro ao carregar gestores!");
            // menssage de erro
            JOptionPane.showMessageDialog(null, "Erro ao carregar gestores!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return achou;
    }
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email = fieldEmail.getText();
        String senha = fieldSenha.getText();
        String sql;
        ResultSet result2;
        
        boolean achou = false;

        // verifica se é Gestor
        if(checkBoxGestor.isSelected()){
            
            try {
                // carrega gestor e seus funcionarios com seus pontos
                achou = this.carregaGestor(email, senha, 0);
                if(achou){
                    psql.closeCon();
                    new MenuAdmin().setVisible(true);
                    setVisible(false);
                }
                
            }catch(Exception e){
                System.out.println("Erro ao logar como gestor: " + e);
                // menssage de erro
                JOptionPane.showMessageDialog(null, "Erro ao logar como gestor!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }else {
            // usuario comum
            try {
                // procura funcionario no banco de dados
                sql = "SELECT * FROM funcionarios WHERE (email = '"+email+"' AND senha = '"+senha+"');";
                result2 = psql.queryCon(sql);
                
                int id_gestor = 0;
                
                while(result2.next()){
                    // id do funcionario
                    id_gestor = result2.getInt("id_gestor");
                    
                    // carrega gestor e seus funcionarios com seus pontos
                    achou = this.carregaGestor(email, senha, id_gestor);

                    break;
                }

                if(achou){
                    psql.closeCon();
                    // abre a tela pra funcionaionarios e passa o id do usuario encontrado
                    new MenuFuncionario(this.id_func+"").setVisible(true);
                    setVisible(false);
                }
            }
            catch(Exception e){
                System.out.println("Erro ao carregar funcionarios: " + e);
                // menssage de erro
                JOptionPane.showMessageDialog(null, "Erro ao carregar funcionarios!", "Erro", JOptionPane.ERROR_MESSAGE);
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
