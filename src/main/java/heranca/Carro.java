/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

public class Carro extends Veiculo {
    private int qtdePortas;
    private String modeloCambio;
    private String combustivel;

    public Carro(int qtdePortas, CambioEnum modeloCambio, 
            CombustivelEnum combustivel, String descricao,
            int ano, String cor, String modelo, String marca, double valor,
            boolean zeroKm, boolean freioAbs) {
        
        super(descricao, ano, cor, modelo, marca, valor, zeroKm, freioAbs);
        
        this.qtdePortas = qtdePortas;
        this.modeloCambio = modeloCambio.getTipoCambio();
        this.combustivel = combustivel.getTipoCombustivel();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Carro{" + "qtdePortas=" + qtdePortas + ", modeloCambio=" + modeloCambio + ", combustivel=" + combustivel + '}';
    }
    
    
}
