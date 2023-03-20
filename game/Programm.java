
package Game;

import Game.InfantryClass.Outlaw;
import Game.InfantryClass.Spearman;
//import Game.InfantryClass.*;
import Game.MagClass.*;
//import Game.ShooterClass.*;
import Game.ShooterClass.Crossbowman;
import Game.ShooterClass.Snipper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
//import Game.Interface;
import java.util.Scanner;

public class Programm {

    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseHero> whiteSide = new ArrayList<>();
    public static ArrayList<BaseHero> darkSide = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Init();

        while (true) {
            step();
            ConsoleView.view();
            scanner.nextLine();
        }

    }

    public static void Init() {

        for (int i = 1; i < GANG_SIZE + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    darkSide.add(new ClassPeasant(BaseHero.generateName(), 10, i));
                    break;
                case 1:
                    darkSide.add(new Snipper(BaseHero.generateName(), 10, i));
                    break;
                default:
                    darkSide.add(new Outlaw(BaseHero.generateName(), 10, i));
                    break;
            }
            switch (new Random().nextInt(4)) {
                case 0:
                    whiteSide.add(new ClassPeasant(BaseHero.generateName(), 1, i));
                    break;
                case 1:
                    whiteSide.add(new Spearman(BaseHero.generateName(), 1, i));
                    break;
                case 2:
                    whiteSide.add(new Monk(BaseHero.generateName(), 1, i));
                    break;
                default:
                    whiteSide.add(new Crossbowman(BaseHero.generateName(), 1, i));
                    break;
            }
        }
    }

    public static void step() {
        ArrayList<BaseHero> result = new ArrayList<>();
        result.addAll(darkSide);
        result.addAll(whiteSide);
        result.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero b1, BaseHero b2) {
                if (b1.getSpeed() == b2.getSpeed())
                    return 0;
                else if (b1.getSpeed() > b2.getSpeed())
                    return 1;
                else
                    return -1;
            }
        });

        for (BaseHero unit : result) {
            if (darkSide.contains(unit)) {
                unit.step(whiteSide, darkSide);
            } else
                unit.step(darkSide, whiteSide);
        }

    }

}

// package Game;

// import Game.InfantryClass.*;
// import Game.MagClass.*;
// //import Game.ShooterClass.*;

// import java.util.ArrayList;
// import java.util.Random;
// //import Game.Interface;

// public class Programm {
// public static void main(String[] args) {

// ArrayList<BaseHero> team1 = new ArrayList<>();
// ArrayList<BaseHero> team2 = new ArrayList<>();

// for (int i = 0; i < 10; i++) {
// switch(new Random().nextInt(3)){
// case 0:
// team1.add(new Outlaw(getName()));
// break;
// case 1:
// team1.add(new Spearman(getName()));
// break;
// default:
// team1.add(new Magician(getName()));
// break;
// }
// switch(new Random().nextInt(3)){
// case 0:
// team2.add(new Outlaw(getName()));
// break;
// case 1:
// team2.add(new Spearman(getName()));
// break;
// default:
// team2.add(new Magician(getName()));
// break;
// }
// }

// for (BaseHero hero : team1) {
// System.out.println("Команда 1 " + hero.getInfo());
// hero.getNAME();
// }

// for (BaseHero hero : team2) {
// System.out.println("Команда 2 " + hero.getInfo());
// hero.getNAME();
// }

// }

// private static String getName(){
// return Names.values()[new
// Random().nextInt(Names.values().length)].toString();
// }

// }
