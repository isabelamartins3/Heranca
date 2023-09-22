/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

public class Pessoa implements ValidaPessoa {
    private String nome;
    private String email;
    private int idade;
    private String cpf;

    public Pessoa(String nome, String email, int idade, String cpf) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
    }

    

    public  boolean verificarMaiorDeIdade () {
        if (this.idade >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", idade=" + idade + ", cpf=" + cpf + '}';
    }

    @Override
    public boolean verificarDominioEmailGmail(String email) {
        if (this.email.contains("@gmail")) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean verificarDominioEmailYahoo(String email) {
        if (this.email.contains("@yahoo")) {
            return true;
        } else {
            return false;
        }
    }
    
}
