/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa{
    private String ra;

    public Aluno(String ra, String nome, String email, int idade, String cpf) {
        super(nome, email, idade, cpf);
        this.ra = ra;
    }

    @Override
    public boolean verificarMaiorDeIdade() {
        return super.verificarMaiorDeIdade(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" + "Aluno{" + "ra=" + ra + '}';
    }

    public String getRa() {
        return ra;
    }
    
    
}
