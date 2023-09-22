/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Escola {
    public static void main(String[] args) {
        Professor p1 = new Professor(true, "Pedro Nobile", "pedro@gmail.com", 30,"ddd");
        System.out.println(p1);
        System.out.println(" email gmail " + p1.verificarDominioEmailGmail(""));
        System.out.println(" email yahoo " + p1.verificarDominioEmailYahoo(""));
        System.out.println("Possui dedicacao exclusiva? "  + p1.isDedicacaoExclusiva());     
   
        Professor p2 = new Professor(true, "Moises", "moises@yahoo.com", 40, "gdhgdhdhhd");
        System.out.println(p2);
        System.out.println("email gmail" + p2.verificarDominioEmailGmail(""));
        System.out.println("email yahoo" + p2.verificarDominioEmailYahoo(""));
        System.out.println("Possui dedicacao exclusiva?"  + p2.isDedicacaoExclusiva());
        
        Aluno a1 = new Aluno("e3a12q", "Isabela", "isabela@gmail.com", 16,"yggtgg");
        System.out.println(a1);
        System.out.println("email gmail" + a1.verificarDominioEmailGmail(""));
        System.out.println("email yahoo" + a1.verificarDominioEmailYahoo(""));
        System.out.println("O ra possui: " + a1.getRa().length());
        
        Aluno a2 = new Aluno("f32454", "Aninha", "aninha@yahoo.com", 16, "345678");
        System.out.println(a2);
        System.out.println("email gmail" + a2.verificarDominioEmailGmail(""));
        System.out.println("email gmail" + a2.verificarDominioEmailYahoo(""));
        System.out.println("O ra possui " + a2.getRa().length());
        
    }
}
