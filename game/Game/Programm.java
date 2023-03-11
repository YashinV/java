package Game;


import Game.InfantryClass.*;
import Game.MagClass.*;
//import Game.ShooterClass.*;

import java.util.ArrayList;
import java.util.Random;
//import Game.Interface;


public class Programm {
    public static void main(String[] args) {
        
        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                switch(new Random().nextInt(3)){
                    case 0:
                        team1.add(new Outlaw(getName()));
                        break;
                    case 1:
                        team1.add(new Spearman(getName()));
                        break;
                    default:
                        team1.add(new Magician(getName()));
                        break;
                }
                switch(new Random().nextInt(3)){
                    case 0:
                        team2.add(new Outlaw(getName()));
                        break;
                    case 1:
                        team2.add(new Spearman(getName()));
                        break;
                    default:
                        team2.add(new Magician(getName()));
                        break;
                }
            }

            for (BaseHero hero : team1) {
                System.out.println("Команда 1 " + hero.getInfo());
                hero.getNAME();
            }

            for (BaseHero hero : team2) {
                System.out.println("Команда 2 " + hero.getInfo());
                hero.getNAME();
            }

        }

        private static String getName(){
            return Names.values()[new Random().nextInt(Names.values().length)].toString();
        }

}
