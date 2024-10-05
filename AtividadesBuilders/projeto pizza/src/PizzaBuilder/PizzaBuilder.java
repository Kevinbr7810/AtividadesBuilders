package PizzaBuilder;

import Pizza.PizzaRefatorado;

public class PizzaBuilder {

    private PizzaRefatorado pizza = new PizzaRefatorado();


    public PizzaBuilder setMassa(String Massa) {
        this.pizza.setMassa(Massa);
        return this;
    }

    public PizzaBuilder setTamanho(String tamanho) {
        this.pizza.setTamanho(tamanho);
        return this;
    }

    public PizzaBuilder setIngredientes(String ingredientes) {
        this.pizza.setIngredientes(ingredientes);
        return this;
    }

    public  PizzaRefatorado build(){
        return this.pizza;
    }
}