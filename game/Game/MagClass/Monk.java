package Game.MagClass;

/**
 *  Монах
 */


public class Monk extends MagClass {

    public Monk(String name) {
        super(name, 110, 110, 10, 125, 9);
    }

    @Override
    public void step() {
        System.out.println("Удар волшебным посохом!");
    }

    @Override
    public String getInfo() {
        return "Monk";
    }

    
}