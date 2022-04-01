
package sistema;


public class Funcionario extends Pessoa{
   private String cargo;
   private float salario;
   private String senha;
   private int codigo;
   private boolean admin = false;

   public Funcionario(){
       
   } 
   public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
   
}
