package Game;

/**
 * базовый герой
 */

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements Interface {

    protected Random rnd = new Random();

    // private String name;
    public int hp;
    private int maxHp;
    private int speed;
    private final String NAME;
    public int damage; // урон
    public Positions position;
    private int protection; // защита

    public void getNAME() {
        System.out.println(NAME);
    }

    public BaseHero(String name, int hp, int speed, int damage, int protection, int x, int y) {
        NAME = name;
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.damage = damage;
        this.protection = protection;
        position = new Positions(x, y);

    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else
            this.hp = 0;
    }

    public void attack(BaseHero target, int damage, int maxDamage) {
        int causedDamage;
        if (damage < target.protection)
            causedDamage = damage;
        else {
            switch (new Random().nextInt(4)) {
                case 0:
                    causedDamage = maxDamage;
                    break;
                default:
                    causedDamage = damage;
                    break;
            }
        }
        target.getDamage(causedDamage);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
    };

    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\t⚔️ %-3d\t\uD83D\uDEE1 %-3d\t♥️%-3d%%\t☠️%-3d\t        ", 0, 0,
                protection, (int) hp * 100 / maxHp, damage);
        return outStr;
    }

    public int getSpeed() {
        return this.speed;
    }

    public Positions getPosition() {
        return position;
    }

    public static String generateName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    public String getName() {
        return "base";
    }
}

// package Game;

// /**
// * базовый герой
// */

// public abstract class BaseHero implements Interface {

// private String name;
// private int hp;
// private int maxHp;
// private int speed;
// protected final String NAME;

// public void getNAME() {
// System.out.println(NAME);
// }

// public BaseHero(String name, int hp, int maxHp, int speed) {
// NAME = name;
// this.hp = hp;
// this.maxHp = maxHp;
// this.speed = speed;

// }

// @Override
// public String toString() {
// return "BaseHero [name=" + name + ", hp=" + hp + ", maxHp=" + maxHp + ",
// speed=" + speed + "]";
// }

// @Override
// public void step(){};

// @Override
// public String getInfo(){
// return "";
// };

// }