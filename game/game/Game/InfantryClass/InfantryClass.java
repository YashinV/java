
package Game.InfantryClass;

import Game.BaseHero;

/**
 * пехота(общий класс)
 */

public abstract class InfantryClass extends BaseHero {

    // int stamina;

    public InfantryClass(String name, int hp, int speed, int damage, int protection, int x, int y) {
        super(name, hp, speed, damage, protection, x, y);
        // this.stamina = stamina;

    }

    // @Override
    // public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends){

    // }
}

// package Game.InfantryClass;

// import Game.BaseHero;

// /**
// * пехота(общий класс)
// */

// public abstract class InfantryClass extends BaseHero {

// public InfantryClass(String name, int hp, int speed, int damage, int
// protection, int x, int y) {
// super(name, hp, speed, damage, protection, x, y);

// }

// }

// package Game.InfantryClass;

// import Game.BaseHero;

// /**
// * пехота(общий класс)
// */

// public abstract class InfantryClass extends BaseHero {

// protected int energy;
// protected int power;

// public InfantryClass(String name, int hp, int maxHp, int speed, int energy,
// int power) {
// super(name, hp, maxHp, speed);
// this.energy = energy;
// this.power = power;

// }

// }
