package Game.InfantryClass;

/**
 * Копейщик
 */

public class Spearman extends InfantryClass {

    public Spearman(String name, int x, int y) {
        super(name, 15, 9, 10, 10, 10, x, y);
    }

    @Override
    public String getName() {
        return "Копейщик";
    }
}

// ЖЖЖЖЖ

// package Game.InfantryClass;

// /**
// * Копейщик
// */

// public class Spearman extends InfantryClass {

// public Spearman(String name, int x, int y) {
// super(name, 15, 9, 10, 10, x, y);
// }

// @Override
// public String getName() {
// return "Snipper";
// }
// }

// ЖЖЖЖЖЖЖ

// package Game.InfantryClass;

// /**
// * Копейщик
// */

// public class Spearman extends InfantryClass {

// public Spearman(String name) {
// super(name, 100, 100, 7, 60, 14 );
// }

// @Override
// public void step() {
// System.out.println("Копейщик атакует!");
// }

// @Override
// public String getInfo() {
// return "Spearman";
// }

// }
