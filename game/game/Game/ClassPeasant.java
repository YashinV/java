
package Game;

import java.util.ArrayList;

/**
 * Крестьянин
 */

public class ClassPeasant extends BaseHero {

    public int energy = 6;

    public ClassPeasant(String name, int x, int y) {
        super(name, 1, 3, 1, 1, x, y);

    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {

    }

    @Override
    public String getName() {
        return "Paesant";
    }

}

// package Game;

// import java.util.ArrayList;

// /**
// * Крестьянин
// */

// public class ClassPeasant extends BaseHero {

// public int energy = 6;

// public ClassPeasant(String name, int x, int y) {
// super(name, 1, 3, 1, 1, x, y);

// }

// @Override
// public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
// // System.out.println("Очередь Крестьянина!");
// }

// @Override
// public String getInfo() {
// return "Paesant";
// }

// }

// package Game;

// /**
// * Крестьянин
// */

// public class ClassPeasant extends BaseHero {

// public int energy = 6;

// public ClassPeasant(String name) {
// super(name,60,60,4);

// }

// @Override
// public void step() {
// System.out.println("Очередь Крестьянина!");
// }

// @Override
// public String getInfo() {
// return "Paesant";
// }

// }
