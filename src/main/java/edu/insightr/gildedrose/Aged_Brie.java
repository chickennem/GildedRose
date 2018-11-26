package edu.insightr.gildedrose;

public class Aged_Brie extends Item implements IVisitable{


    public Aged_Brie() {
        super();
    }

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}