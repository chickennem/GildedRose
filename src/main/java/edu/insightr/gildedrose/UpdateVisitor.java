package edu.insightr.gildedrose;

public abstract class UpdateVisitor implements IVisitor {

    @Override
    public void visit(Aged_Brie aged_brie) {
        System.out.println("Displaying Aged_Brie.");
    }

    @Override
    public void visit(Backstage_passes_to_a_TAFKAL80ETC_concert backstage_passes_to_a_tafkal80ETC_concert ) {
        System.out.println("Displaying Backstage_passes_to_a_TAFKAL80ETC_concert.");
    }

    @Override
    public void visit(Conjured_Mana_Cake conjured_mana_cake) {
        System.out.println("Displaying Conjured_Mana_Cake.");
    }

    @Override
    public void visit(Dexterity_Vest dexterity_vest ) {
        System.out.println("Displaying Dexterity_Vest.");
    }

    @Override
    public void visit(Elixir_of_the_Mongoose elixir_of_the_mongoose  ) {
        System.out.println("Displaying Elixir_of_the_Mongoose.");
    }

    @Override
    public void visit(Sulfuras_Hand_of_Ragnaros sulfuras_hand_of_ragnaros) {
        System.out.println("Displaying Sulfuras_Hand_of_Ragnaros.");
    }
}
