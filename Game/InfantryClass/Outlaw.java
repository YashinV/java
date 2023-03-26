
package Game.InfantryClass;

/**
 * Разбойник
 */

public class Outlaw extends InfantryClass {

    public Outlaw(String name, int x, int y) {
        super(name, 10, 6, 4, 3, 3, x, y);
    }

    @Override
    public String getName() {
        return "Разбойник";
    }

}

// package Game.InfantryClass;

// /**
// * Разбойник
// */

// public class Outlaw extends InfantryClass {

// public Outlaw(String name, int x, int y) {
// super(name, 10, 6, 4, 3, x, y);
// }

// @Override
// public String getName() {
// return "Snipper";
// }

// }

// ЮЮЮЮ
// package Game.InfantryClass;

// /**
// * Разбойник
// */

// public class Outlaw extends InfantryClass {

// public Outlaw(String name) {
// super(name, 120,120, 16, 100, 9);
// }

// @Override
// public void step() {
// System.out.println("Разбойник атакует!");
// }

// @Override
// public String getInfo() {
// return "Outlaw";
// }

// }