package Game.ShooterClass;

/**
 * Арбалетчик
 */



public class Crossbowman extends ShooterClass {

    public Crossbowman(String name) {
        super(name, 90, 90, 11, 120, 12);
    }

    @Override
    public void step() {
        System.out.println("Выстрел арбалетчика!");
    }

    @Override
    public String getInfo() {
        return "Crossbowman";
    }
    
}