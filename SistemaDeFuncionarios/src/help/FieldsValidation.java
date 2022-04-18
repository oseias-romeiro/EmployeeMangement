/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package help;

import screens.Main;

/**
 *
 * @author oseia
 */
public class FieldsValidation {
    
    public void validaNome(String nome) throws Exception{
        // verifica o tamanho do nome
        if(nome.length() <3 || nome.length() > 20){
            throw new Exception("Nome muito curto");
        }
    }
    public void validaEmail(String email, String id) throws Exception{
        // verifica email em branco
        if(email.isEmpty()){
            throw new Exception("Email não pode ficar em branco!");
        }
        
        // esta editando ou criando?
        if(!id.equals("salvando")){
            // verifica se mais alguem exceto ele usa o email
            for(int i=0; i<Main.gestor.getFuncionarios().size(); i++){
                if(Main.gestor.getFuncionarios().get(i).getEmail().equals(email) && !(i == Integer.parseInt(id))){
                    throw new Exception("Este email ja foi usado");
                }
            }
        }else {
            // verifica se o email já foi usado
            for(int i=0; i<Main.gestor.getFuncionarios().size(); i++){
                if(Main.gestor.getFuncionarios().get(i).getEmail().equals(email)){
                    throw new Exception("Este email ja foi usado");
                }
            }
        }
    }
    public void validaSalario(String salaraio) throws Exception{
        // verifica se é possivel passar o vconteudo de salario para o tipo float
        try {
            Float.parseFloat(salaraio);
        }catch (Exception e){
            throw new Exception("Salario incorreto");
        }
    }
}
