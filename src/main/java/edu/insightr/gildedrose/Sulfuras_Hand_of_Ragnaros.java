package edu.insightr.gildedrose;

public class Sulfuras_Hand_of_Ragnaros  extends Item implements IVisitable{


    public Sulfuras_Hand_of_Ragnaros() {
        super();
    }

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}