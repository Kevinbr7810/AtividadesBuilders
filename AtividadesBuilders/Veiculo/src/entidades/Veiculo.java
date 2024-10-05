package entidades;

public class Veiculo {

    private String cor = "";
    private String tipo = "";
    private String  rodas = "";


    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setRodas(String rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Cor: " + this.cor + " \n"+
                "Tipo: " + this.tipo + " \n"+
                "Rodas: " + this.rodas + " ";
    }
}
