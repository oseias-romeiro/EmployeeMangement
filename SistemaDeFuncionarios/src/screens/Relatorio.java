/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import sistema.Funcionario;

import java.time.*;
import java.util.Date;

/**
 *
 * @author oseia
 */
public class Relatorio extends javax.swing.JFrame {

    int id;
    Funcionario func;
    /**
     * Creates new form Relatorio
     */
    public Relatorio(String id) {
        initComponents();
        
        setLocationRelativeTo(null);
        
        // pega o funcionario
        if(!id.isEmpty()){
            this.func = Main.gestor.getFuncionarios().get(Integer.parseInt(id));
            labelNomeFunc.setText(this.func.getNome());
            
            this.id = Integer.parseInt(id);
        }
        
        // carrega tabela de pontos
        this.carregarTabela();
        
        /* calculo do relatorio */
        
        // media salarial
        fieldMediaSalarial.setText(mediaSalarial());
        // quantidade de funcionarios
        fieldNumFunc.setText(Main.gestor.getFuncionarios().size()+"");
        // porcentagem de funcionarios
        fieldMasculino.setText(MascFemin("M"));
        // porcentagem de funcionarias
        fieldFeminino.setText(MascFemin("F"));
        // pontos registrados
        fieldPontos.setText(diasTrabalhados());
        // media de horas por pontos
        fieldMediaHorasF.setText(mediaHorasFunc(this.func));
        //media de idades dos funcionarios
        fieldMediaSalarial3.setText(mediaIdades());
        // media de horas trabalhadas (baseada na media de horas por ponto)
        fieldMediaHG.setText(mediaHorasGeral());
    }
    public String MascFemin(String sexo){
        int qtd = 0;
        int total = Main.gestor.getFuncionarios().size();// quantidade total de funcionarios
        for(int i=0; i<total; i++){
            if(Main.gestor.getFuncionarios().get(i).getSexo().equals(sexo)){ // conta de acordo com o sexo passado pelo parametro (M ou F)
                qtd++;
            }
        }
        return ((qtd*100)/total)+"%";//porcentagem de funcionarios ou funcionarias
    }
    public String mediaSalarial(){
        int qtd = Main.gestor.getFuncionarios().size(); // quantidade de funcionarios
        float soma = 0;
        
        if(qtd == 0){
            return "0";
        }else {
            for(int i=0; i<qtd; i++){
                soma += Main.gestor.getFuncionarios().get(i).getSalario();
            }
            return (soma/(qtd+1))+""; // media
        }
    }
    public String diasTrabalhados(){
        return this.func.getPontos().size()+"";// retorna a quantidade de pontos registrados
    }
    public String mediaHorasFunc(Funcionario func2){
        int qtd = func2.getPontos().size();
        
        // caso não haja pontos registrados ainda
        if(qtd == 0){
            return "0";
        }
        
        long somaHoras = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        
        for(int i=0; i<qtd; i++){
            String entrada = func2.getPontos().get(i).getLogedIn().toString();
            String saida = func2.getPontos().get(i).getLogedOut().toString();
            
            try {
                Date horaI = sdf.parse(entrada);
                Date horaF = sdf.parse(saida);
                
                long diferenca = horaF.getTime() - horaI.getTime();
                
                somaHoras += diferenca/100/10/60/60; //converte de milisegundos para horas
                
            }catch (Exception e){
                System.out.println("erro ao calcular horas por pontos: "+e);
            }
        }
        
        return somaHoras/qtd+""; // media de horas por ponto
    }
    public String mediaIdades(){
        int qtd = Main.gestor.getFuncionarios().size(); // quantidade de funcionarios
        int soma = 0;
        
        for(int i=0; i<qtd; i++){
            // soma as idades dos funcionarios (forma simples)
            soma += LocalDate.now().getYear() - Main.gestor.getFuncionarios().get(i).getDataNascimento().getYear();
        }
        // retorna a meida de idades
        return (soma/qtd)+"";
    }
    public String mediaHorasGeral(){
        int qtd = Main.gestor.getFuncionarios().size();
        float soma = 0;
        
        for(int i=0; i<qtd; i++){
            // soma as medias de horas de cada funcionario
            soma += Float.parseFloat(mediaHorasFunc(Main.gestor.getFuncionarios().get(i)));
        }
        // retorna a media
        return (soma/qtd)+"";
    }
    // carrega tabela de pontos
    public void carregarTabela(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Data", "Entrada", "Saida"}, 0);

        for(int i=0; i<Main.gestor.getFuncionarios().get(this.id).getPontos().size(); i++){
            String[] data = (Main.gestor.getFuncionarios().get(this.id).getPontos().get(i).getDate().toString()).split("-");
            Object linha[] = new Object[]{
                (data[2]+"/"+data[1]+"/"+data[0]), // converte formato de data
                Main.gestor.getFuncionarios().get(this.id).getPontos().get(i).getLogedIn(),
                Main.gestor.getFuncionarios().get(this.id).getPontos().get(i).getLogedOut(),
            };
            modelo.addRow(linha);
        }

        // tabela recebe modelo
        tblPontos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        painelRelatorio = new javax.swing.JPanel();
        labelMediaIdade = new javax.swing.JLabel();
        fieldMediaSalarial = new javax.swing.JTextField();
        labelMasculino = new javax.swing.JLabel();
        labelFeminino = new javax.swing.JLabel();
        labelMediaSalarial = new javax.swing.JLabel();
        labelNumFunc = new javax.swing.JLabel();
        fieldNumFunc = new javax.swing.JTextField();
        labelMediaHG = new javax.swing.JLabel();
        fieldMediaHG = new javax.swing.JTextField();
        fieldMasculino = new javax.swing.JTextField();
        fieldFeminino = new javax.swing.JTextField();
        fieldMediaSalarial3 = new javax.swing.JTextField();
        labelMediaHF = new javax.swing.JLabel();
        fieldPontos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelPontos = new javax.swing.JLabel();
        fieldMediaHorasF = new javax.swing.JTextField();
        labelGeral = new javax.swing.JLabel();
        labelFunc = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        btnCalcula = new javax.swing.JButton();
        painelPontos = new javax.swing.JPanel();
        labelNomeFunc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPontos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SGF");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        setResizable(false);

        painelRelatorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelMediaIdade.setText("Media de idade");

        fieldMediaSalarial.setEditable(false);
        fieldMediaSalarial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMediaSalarialActionPerformed(evt);
            }
        });

        labelMasculino.setText("Masculino");

        labelFeminino.setText("Feminino");

        labelMediaSalarial.setText("Media salarial");

        labelNumFunc.setText("Numero de funcionarios");

        fieldNumFunc.setEditable(false);
        fieldNumFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNumFuncActionPerformed(evt);
            }
        });

        labelMediaHG.setText("Media de horas trabalhadas");

        fieldMediaHG.setEditable(false);
        fieldMediaHG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMediaHGActionPerformed(evt);
            }
        });

        fieldMasculino.setEditable(false);
        fieldMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMasculinoActionPerformed(evt);
            }
        });

        fieldFeminino.setEditable(false);
        fieldFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFemininoActionPerformed(evt);
            }
        });

        fieldMediaSalarial3.setEditable(false);
        fieldMediaSalarial3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMediaSalarial3ActionPerformed(evt);
            }
        });

        labelMediaHF.setText("Media de horas por ponto");

        fieldPontos.setEditable(false);
        fieldPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPontosActionPerformed(evt);
            }
        });

        labelPontos.setText("Pontos registrados");

        fieldMediaHorasF.setEditable(false);
        fieldMediaHorasF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMediaHorasFActionPerformed(evt);
            }
        });

        labelGeral.setText("GERAL");

        labelFunc.setText("FUNCIONARIO");

        javax.swing.GroupLayout painelRelatorioLayout = new javax.swing.GroupLayout(painelRelatorio);
        painelRelatorio.setLayout(painelRelatorioLayout);
        painelRelatorioLayout.setHorizontalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRelatorioLayout.createSequentialGroup()
                        .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelRelatorioLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldMediaHorasF, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMediaHF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(136, 136, 136))
                            .addGroup(painelRelatorioLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(labelFunc)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(painelRelatorioLayout.createSequentialGroup()
                        .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelRelatorioLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(labelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioLayout.createSequentialGroup()
                                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMediaSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fieldFeminino)
                                    .addComponent(fieldMasculino, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldMediaSalarial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelRelatorioLayout.createSequentialGroup()
                                .addComponent(labelNumFunc)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelMediaHG)
                                .addComponent(labelMediaIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNumFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fieldMediaHG)
                                .addComponent(fieldMediaSalarial3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
        );
        painelRelatorioLayout.setVerticalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGeral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelRelatorioLayout.createSequentialGroup()
                            .addComponent(fieldNumFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fieldMediaHG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelMediaHG))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fieldMediaSalarial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelMediaIdade)))
                        .addComponent(labelNumFunc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioLayout.createSequentialGroup()
                        .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldMediaSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMediaSalarial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMasculino)
                            .addComponent(fieldMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFeminino)
                            .addComponent(fieldFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(labelFunc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMediaHF)
                    .addComponent(labelPontos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldMediaHorasF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTitulo.setText("RELATORIO");

        btnCalcula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnCalcula.setText("Atualizar");
        btnCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaActionPerformed(evt);
            }
        });

        painelPontos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelNomeFunc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNomeFunc.setText("construtor-coloca-nome-do-funcionario-aqui");

        tblPontos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Entrada", "Saida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tblPontos);

        jLabel3.setText("Registros do funcionario: ");

        javax.swing.GroupLayout painelPontosLayout = new javax.swing.GroupLayout(painelPontos);
        painelPontos.setLayout(painelPontosLayout);
        painelPontosLayout.setHorizontalGroup(
            painelPontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPontosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                    .addGroup(painelPontosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelPontosLayout.setVerticalGroup(
            painelPontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPontosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCalcula)
                            .addComponent(painelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(labelTitulo)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelPontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(painelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelPontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCalcula)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldMediaSalarialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMediaSalarialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMediaSalarialActionPerformed

    private void btnCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaActionPerformed
        // media salarial
        fieldMediaSalarial.setText(mediaSalarial());
        // quantidade de funcionarios
        fieldNumFunc.setText(Main.gestor.getFuncionarios().size()+"");
        // porcentagem de funcionarios masculino
        fieldMasculino.setText(MascFemin("M"));
        // porcentagem de funcionarios femininos
        fieldFeminino.setText(MascFemin("F"));
        // pontos registrados
        fieldPontos.setText(diasTrabalhados());
        // media de horas por pontos
        fieldMediaHorasF.setText(mediaHorasFunc(this.func));
        //media de idades dos funcionarios
        fieldMediaSalarial3.setText(mediaIdades());
        // media de horas trabalhadas (baseada na media de horas por ponto)
        fieldMediaHG.setText(mediaHorasGeral());
        
        // atualiza tabela
        this.carregarTabela();
    }//GEN-LAST:event_btnCalculaActionPerformed

    private void fieldNumFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNumFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNumFuncActionPerformed

    private void fieldMediaHGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMediaHGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMediaHGActionPerformed

    private void fieldMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMasculinoActionPerformed

    private void fieldFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldFemininoActionPerformed

    private void fieldMediaSalarial3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMediaSalarial3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMediaSalarial3ActionPerformed

    private void fieldPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPontosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPontosActionPerformed

    private void fieldMediaHorasFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMediaHorasFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMediaHorasFActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcula;
    private javax.swing.JTextField fieldFeminino;
    private javax.swing.JTextField fieldMasculino;
    private javax.swing.JTextField fieldMediaHG;
    private javax.swing.JTextField fieldMediaHorasF;
    private javax.swing.JTextField fieldMediaSalarial;
    private javax.swing.JTextField fieldMediaSalarial3;
    private javax.swing.JTextField fieldNumFunc;
    private javax.swing.JTextField fieldPontos;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelFeminino;
    private javax.swing.JLabel labelFunc;
    private javax.swing.JLabel labelGeral;
    private javax.swing.JLabel labelMasculino;
    private javax.swing.JLabel labelMediaHF;
    private javax.swing.JLabel labelMediaHG;
    private javax.swing.JLabel labelMediaIdade;
    private javax.swing.JLabel labelMediaSalarial;
    private javax.swing.JLabel labelNomeFunc;
    private javax.swing.JLabel labelNumFunc;
    private javax.swing.JLabel labelPontos;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelPontos;
    private javax.swing.JPanel painelRelatorio;
    private javax.swing.JTable tblPontos;
    // End of variables declaration//GEN-END:variables
}
