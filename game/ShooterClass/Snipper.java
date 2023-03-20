
package Game.ShooterClass;

/**
 * Снайпер
 */

public class Snipper extends ShooterClass {

    public Snipper(String name, int x, int y) {
        super(name, 15, 9, 10, 8, 10, 10, x, y);
    }

    @Override
    public String getName() {
        return "Snipper";
    }
}

// package Game.ShooterClass;

// /**
// * Снайпер
// */

// public class Snipper extends ShooterClass {

// public Snipper(String name) {
// super(name, 80,80,10,75,8);
// }

// @Override
// public void step() {
// System.out.println("Выстрел снайпера!");
// }

// @Override
// public String getInfo() {
// return "Snipper";
// }

// }
