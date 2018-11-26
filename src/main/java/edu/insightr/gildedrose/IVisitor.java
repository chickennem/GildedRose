package edu.insightr.gildedrose;

public interface IVisitor {

    public void visit(Aged_Brie aged_brie);
    public void visit(Backstage_passes_to_a_TAFKAL80ETC_concert backstage_passes_to_a_tafkal80ETC_concert);
    public void visit(Conjured_Mana_Cake conjured_mana_cake);
    public void visit(Dexterity_Vest dexterity_vest);
    public void visit(Elixir_of_the_Mongoose elixir_of_the_mongoose);
    public void visit(Sulfuras_Hand_of_Ragnaros sulfuras_hand_of_ragnaros);

    public void visit(Inventory inventory);

    public void accept(IVisitor v);
}
