package Game.MagClass;
import Game.BaseHero;

/**
 * Кастеры(общий)
 */

 public abstract class MagClass extends BaseHero {

    protected int mana;
    protected int intellect;

    public MagClass(String name, int hp, int maxHp, int speed, int mana, int intellect) {
        super(name, hp, maxHp, speed);
        this.mana = mana;
        this.intellect = intellect;
    }
 
    
}