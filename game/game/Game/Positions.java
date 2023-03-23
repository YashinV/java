package Game;

public class Positions {
    protected int x;
    protected int y;

    public Positions(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Positions opposit) {
        if (opposit.y == y && opposit.x == x)
            return true;
        return false;
    }

    public double getPosition(BaseHero unit) {
        float dx = x - this.x;
        float dy = y - this.y;
        return Math.sqrt(Math.sqrt(dx * dx + dy * dy));
    };

}
