/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SisAereo;

/**
 *
 * @author kelvin
 */
public class Passagem {
    private Voo voo;
    private Passageiro passairo;
    private int poltrona;
    private boolean tipoPassagem;
    private boolean pagamento;
    private double valor;

    public Passagem(Voo voo, Passageiro passairo, int poltrona, boolean tipoPassagem, boolean pagamento, double valor) {
        this.voo = voo;
        this.passairo = passairo;
        this.poltrona = poltrona;
        this.tipoPassagem = tipoPassagem;
        this.pagamento = pagamento;
        this.valor = valor;
    }

    /**
     * @return the voo
     */
    public Voo getVoo() {
        return voo;
    }

    /**
     * @param voo the voo to set
     */
    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    /**
     * @return the passairo
     */
    public Passageiro getPassairo() {
        return passairo;
    }

    /**
     * @param passairo the passairo to set
     */
    public void setPassairo(Passageiro passairo) {
        this.passairo = passairo;
    }

    /**
     * @return the poltrona
     */
    public int getPoltrona() {
        return poltrona;
    }

    /**
     * @param poltrona the poltrona to set
     */
    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    /**
     * @return the tipoPassagem
     */
    public boolean isTipoPassagem() {
        return tipoPassagem;
    }

    /**
     * @param tipoPassagem the tipoPassagem to set
     */
    public void setTipoPassagem(boolean tipoPassagem) {
        this.tipoPassagem = tipoPassagem;
    }

    /**
     * @return the pagamento
     */
    public boolean isPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pagamento to set
     */
    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
