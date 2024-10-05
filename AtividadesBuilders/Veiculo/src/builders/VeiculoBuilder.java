package builders;

import entidades.Veiculo;

public class VeiculoBuilder {
    private Veiculo veiculo
            = new Veiculo();

    public VeiculoBuilder setcor(String cor){
        this.veiculo.setCor(cor);
        return this;
    }

    public VeiculoBuilder setTipo(String tipo){
        this.veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoBuilder setRodas(String rodas){
        this.veiculo.setRodas(rodas);
        return this;
    }

    public  Veiculo build(){
        return this.veiculo;
    }
}
