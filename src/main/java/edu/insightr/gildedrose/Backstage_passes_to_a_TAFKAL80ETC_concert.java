package edu.insightr.gildedrose;

public class Backstage_passes_to_a_TAFKAL80ETC_concert  extends Item implements IVisitable{


    public Backstage_passes_to_a_TAFKAL80ETC_concert() {
        super();
    }

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}

