package edu.insightr.gildedrose;

public class Dexterity_Vest  extends Item implements IVisitable{


    public Dexterity_Vest() {
        super();
    }

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}