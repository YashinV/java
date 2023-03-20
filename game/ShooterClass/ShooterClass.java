
package Game.ShooterClass;

import java.util.ArrayList;

import Game.BaseHero;

/**
 * Стрелки(общий)
 */

public abstract class ShooterClass extends BaseHero {
    protected int arrows;
    protected int maxDamage;

    public ShooterClass(String name, int hp, int speed, int arrows, int damage, int maxDamage, int protection, int x,
            int y) {
        super(name, hp, speed, maxDamage, protection, x, y);
        this.arrows = arrows;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends) {
        if (this.arrows > 0 && this.hp > 0) {

            BaseHero target = enemies.get(0);
            double minDistance = this.position.getPosition(enemies.get(0));

            for (BaseHero hero : enemies) {
                if (this.position.getPosition(hero) < minDistance) {
                    minDistance = this.position.getPosition(hero);
                    target = hero;
                }
            }
            this.attack(target, this.damage, this.maxDamage);
            this.arrows--;
        }

        for (BaseHero hero : friends) {
            if (hero.getInfo().equals("ClassPeasant")) {
                this.arrows++;
                break;
            }
        }

    }

    @Override
    public String toString() {
        return "Осталось стрел: " + String.valueOf(this.arrows);
    }
}

// package Game.ShooterClass;

// import Game.BaseHero;

// /**
// * Стрелки (общий)
// */

// public abstract class ShooterClass extends BaseHero {

// /**
// * энергия
// */
// protected int energy;
// /**
// * ловкость
// */
// protected int dexterity;

// public ShooterClass(String name, int hp, int maxHp, int speed, int energy,
// int dexterity) {
// super(name, hp, maxHp, speed);
// this.energy = energy;
// this.dexterity = dexterity;
// }

// }