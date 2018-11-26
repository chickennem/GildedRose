package edu.insightr.gildedrose;

public class Elixir_of_the_Mongoose  extends Item implements IVisitable{


    public Elixir_of_the_Mongoose() {
        super();
    }

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}