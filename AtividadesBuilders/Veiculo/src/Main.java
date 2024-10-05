import builders.VeiculoBuilder;
import entidades.Veiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
        public static void main(String[] args) {
            executarRefatorado();
        }

        private static void executarRefatorado() {
            Veiculo Camaro = new VeiculoBuilder().setcor("Preto").setTipo("Esportivo").setRodas("Aro20").build();

            System.out.println(Camaro.toString());

        }
}