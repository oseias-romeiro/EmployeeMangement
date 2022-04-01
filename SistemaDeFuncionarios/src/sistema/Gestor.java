
package sistema;


public class Gestor extends Pessoa{
    private String senha;
    private boolean admim = true;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

 
}
