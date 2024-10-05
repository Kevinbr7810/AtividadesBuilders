import Pizza.PizzaRefatorado;
import PizzaBuilder.PizzaBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        executarRefatorado();
    }

    private static void executarRefatorado() {
        PizzaRefatorado Pizzacalabresa = new PizzaBuilder().setMassa("Fina").setTamanho("grande").setIngredientes("Cenoura").build();

        System.out.println(Pizzacalabresa.toString());
    }




}