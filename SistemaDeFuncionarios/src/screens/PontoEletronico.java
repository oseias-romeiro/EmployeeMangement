/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import sistema.Funcionario;
import sistema.Ponto;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author win
 */
public class PontoEletronico extends javax.swing.JFrame {

    private String id;
    private Funcionario func = new Funcionario();
    private ZoneId zona = ZoneId.of("America/Sao_Paulo");
    /**
     * Creates new form PontoEletronico
     */
    public PontoEletronico(String id) {
        initComponents();
        
        setLocationRelativeTo(null);
        
        // pega funcionario
        if(!id.isEmpty()){
            this.func = Main.gestor.getFuncionarios().get(Integer.parseInt(id));
        }
        
        /* preenche os campos */
        
        //data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyy");
        campoData.setText(LocalDate.now(this.zona).format(formato));
        
        // verifica se tem um ponto pendente
        if(MenuFuncionario.pendente){
            // preenche o horario de entrada do ultimo ponto
            String entrada = (this.func.getPontos().get(this.func.getPontos().size()-1)).getLogedIn().toString();
            String[] entrada2 = entrada.split(":");
            campoHoraEntrada.setText(entrada2[0]+entrada2[1]);
            
            // coloca o horario da saida
            String[] horario = LocalTime.now(this.zona).toString().split(":");
            campoHoraSaida.setText(horario[0]+horario[1]);
        }else {
            // coloca o horario de entrada
            String[] horario = LocalTime.now(this.zona).toString().split(":");
            campoHoraEntrada.setText(horario[0]+horario[1]);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        campoData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoHoraEntrada = new javax.swing.JFormattedTextField();
        campoHoraSaida = new javax.swing.JFormattedTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SGF");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Senha :");

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });

        campoData.setEditable(false);
        try {
            campoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoData.setValue(campoData.getComponentPopupMenu());

        jLabel3.setText("Data :");

        jLabel4.setText("Horário de Entrada :");

        jLabel5.setText("Horáro de Saída :");

        campoHoraEntrada.setEditable(false);
        try {
            campoHoraEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ## : ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoHoraSaida.setEditable(false);
        try {
            campoHoraSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ## : ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoHoraSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraSaidaActionPerformed(evt);
            }
        });

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel6.setText("Obs.: horarios não são editáveis, coloque a senha e confirme o registro do ponto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(campoHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addComponent(campoHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ponto Eletrônico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void campoHoraSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoraSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHoraSaidaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // entrada da data
        String[] data1 = (campoData.getText().replace(" ", "")).split("/");
        LocalDate data = LocalDate.parse(data1[2]+"-"+data1[1]+"-"+data1[0]);
        // horario de entrada
        String in = (campoHoraEntrada.getText().replace(" ", ""))+":00.000000";
        LocalTime entrada = LocalTime.parse(in);
        // entrada da senha
        char[] senha = campoSenha.getPassword();
        
        // verifica senha
        if(Arrays.equals((this.func.getSenha()).toCharArray(), senha)){
            
            // verificação
            boolean correto = true;
            
            // inicializando variaveis
            LocalTime saida = LocalTime.now(this.zona);
            String out = "";

            // caso haja um registro pendente
            if(MenuFuncionario.pendente){
                // pegando saida
                out = (campoHoraSaida.getText().replace(" ", ""))+":00.000000";
                saida = LocalTime.parse(out);
                
                // calcula hora trabalhada
                correto = calculaHora(in, out);
                
                // verificação de horario
                if(correto){
                    // edita o ultimo registro
                    this.func.getPontos().get(this.func.getPontos().size()-1).setLogedIn(entrada);
                    this.func.getPontos().get(this.func.getPontos().size()-1).setLogedOut(saida);
                    
                    // alerta para o MenuFuncionario que não tem ponto pendente
                    MenuFuncionario.pendente = false;
                
                    // sai
                    dispose();
                }else {
                    // menssage de erro
                    JOptionPane.showMessageDialog(null, "Dados invalidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }else { // não é um registro pendente
                
                // incializa o objeto ponto
                Ponto ponto = new Ponto();
                
                // atribui a entrada e a data
                ponto.setDate(data);
                ponto.setLogedIn(entrada);
                
                // salva o registro
                this.func.addPonto(ponto);
                
                // alerta para o MenuFuncionario que agora ha um ponto pendente
                MenuFuncionario.pendente = true;
                
                // sai
                dispose();
            }
        }
        else {
            // menssage de erro
            JOptionPane.showMessageDialog(null, "Senha incorreta!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
   //calcula o total de horas trabalhadas
    public boolean calculaHora(String horaInic, String horaFinal){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        long resultadoFinal;
        
        boolean correto = true;

        try{
            Date horaIni = sdf.parse(horaInic);
        
            Date horaFim = sdf.parse(horaFinal);


            long horaI = horaIni.getTime();
            long horaF = horaFim.getTime(); 

            long diferencaHoras = horaF - horaI;
            
            resultadoFinal = diferencaHoras/100/10/60/60;//converte milisedundos em horas
            
            //muda pra numero positivo
            if(resultadoFinal < 0){
                throw new Exception("Valor calculado foi negativo!");
                //resultadoFinal *= -1;
            }
            JOptionPane.showMessageDialog(null, ("Total de horas: "+resultadoFinal+" horas" ),"Jornada de trablho salva" ,JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao calcular as Horas Trabalhadas!", "Atenção", JOptionPane.ERROR_MESSAGE);
            correto = false;
        }
        return correto;
    }
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
            java.util.logging.Logger.getLogger(PontoEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PontoEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PontoEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PontoEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PontoEletronico("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JFormattedTextField campoHoraEntrada;
    private javax.swing.JFormattedTextField campoHoraSaida;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
