
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAESUN
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City a = new City();
        
        Robot A =  new Robot (a, 3, 0, Direction.EAST);
        new Wall (a, 3, 2, Direction.WEST);
        new Wall (a, 3, 2, Direction.NORTH);
        new Wall (a, 2, 3, Direction.WEST);
        new Wall (a, 1, 3, Direction.WEST);
        new Wall (a, 1, 3, Direction.NORTH);
        new Wall (a, 1, 3, Direction.EAST);
        new Wall (a, 2, 4, Direction.NORTH);
        new Wall (a, 2, 4, Direction.EAST);
        new Wall (a, 3, 4, Direction.EAST);
        new Thing (a, 3, 1);
        
        A.move();
        A.pickThing();
        A.turnLeft();
        A.move();
        A.turnLeft();
        A.turnLeft();
        A.turnLeft();
        A.move();
        A.turnLeft();
        A.move();
        A.move();
        A.turnLeft();
        A.turnLeft();
        A.turnLeft();
        A.move();
        A.putThing();
        A.move();
        A.turnLeft();
        A.turnLeft();
        A.turnLeft();
        A.move();
        A.turnLeft();
        A.move();
        A.turnLeft();
        A.turnLeft();
        A.turnLeft();
        A.move();
        A.move();
        A.turnLeft();
        
        
        
        
        
    }
    
}
