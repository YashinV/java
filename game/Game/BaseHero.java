package Game;

/**
 * базовый герой
 */

public abstract class BaseHero implements Interface {

    private String name;
    private int hp;
    private int maxHp;
    private int speed;
     protected final String NAME;

    public void getNAME() {
        System.out.println(NAME);
    }

    public BaseHero(String name, int hp, int maxHp, int speed) {
        NAME = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        
    }

    @Override
    public String toString() {
        return "BaseHero [name=" + name + ", hp=" + hp + ", maxHp=" + maxHp + ", speed=" + speed + "]";
    }

    @Override
    public void step(){};

    @Override
    public String getInfo(){
        return "";
    };

}