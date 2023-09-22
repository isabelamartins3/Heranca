/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;


public class Estacionamento {
    public static void main(String[] args) {
        Carro gol = new Carro(5, CambioEnum.AUTOMATICO, CombustivelEnum.DIESEL, "Gol muito conservado", 2015,
                "Azul", "G2", "Volkswagem", 19999, false, 
                false);
        System.out.println(gol);
        
        System.out.println("----------------------------");
        
        Moto hornet = new Moto("Moto hornet 600 C", 2014, "Preta", "Hornet", "Honda", 40000, true, true, CombustivelEnum.GASOLINA, PartidaEnum.ELETRICA);
        System.out.println(hornet);
        
        System.out.println("----------------------------");
        
        Scooter scooter = new Scooter("Scooter eletrica", 2023, 
                "Cinza", "ELEKTRA", "Honda", 10000, true, false);
        System.out.println(scooter);
    }
}
