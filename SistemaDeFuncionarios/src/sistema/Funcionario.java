
package sistema;

import java.util.ArrayList;


public class Funcionario extends Pessoa{
   private String cargo;
   private float salario;
   private String senha;
   private String codigo;
   private ArrayList<Ponto> pontos = new ArrayList<Ponto>();

   public Funcionario(){
       
   } 
   public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    public ArrayList<Ponto> getPontos() {
        return pontos;
    }
    public void setPontos(ArrayList<Ponto> pontos) {
        this.pontos = pontos;
    }
    public void addPonto(Ponto ponto) {
        this.pontos.add(ponto);
    }
   
}
