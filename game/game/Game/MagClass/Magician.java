
package Game.MagClass;

/**
 * колдун
 */

public class Magician extends MagClass {

    public Magician(String name, int x, int y) {
        super(name, 30, 9, 1, -5, 12, x, y);
    }

    @Override
    public String getName() {
        return "Magician";
    }

}

// package Game.MagClass;

// /**
// * колдун
// */

// public class Magician extends MagClass {

// public Magician(String name) {
// super(name, 80, 80, 6, 200, 14);
// }

// @Override
// public void step() {
// System.out.println("Магическая атака!");
// }

// @Override
// public String getInfo() {
// return "Magician";
// }

// }
