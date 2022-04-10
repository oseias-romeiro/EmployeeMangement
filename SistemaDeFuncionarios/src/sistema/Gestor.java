
package sistema;

import java.util.ArrayList;

public class Gestor extends Pessoa{
    private String senha;
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(ArrayList<Funcionario> clientes) {
        this.funcionarios = clientes;
    }
    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
}
