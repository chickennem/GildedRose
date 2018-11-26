package edu.insightr.gildedrose;


    public class VisitorPatternDemo {
        public static void main(String[] args) {

            Inventory inventory = new Inventory();
            inventory.accept(new UpdateVisitor() {
                @Override
                public void visit(Inventory inventory) {

                }

                @Override
                public void accept(IVisitor v) {

                }
            });
        }
    }

