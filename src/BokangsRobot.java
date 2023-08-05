import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

/**
 * Movement: I decided to make use of the Walls sample robot movement, since this would allow me to dodge robots or react to robot fire while ensuring my robot is safe
 *
 */
public class BokangsRobot extends Robot {

    public static void main(String[] args){
        // DO NOTHING!
    }

    boolean peek; //To detect if there is a robot in that position
    double amountToMove;

    /**
     * Here we move around the games walls to dodge robot fire and move away from the robots
     */

    public void run(){
        // Setting my robot colour
        setBodyColor(Color.black);
        setGunColor(Color.black);
        setRadarColor(Color.blue);
        setBulletColor(Color.red);
        setScanColor(Color.cyan);

        /**
         * Below we calculate our movement amount by getting battlefield width and height
         * Bokangsrobot will stop once it reaches a wall
         *
         */
        amountToMove = Math.max(getBattleFieldHeight(), getBattleFieldWidth());

        peek = false;

        /**
         *  I make use of the modulous sign to turn the robots head 90 degrees
         *  With using the getHeading();
         */
        turnLeft(getHeading() % 90);
        ahead(amountToMove);

        peek = true;
        turnGunRight(90);
        turnRight(90);




        while(true){
            // Before we turn we look (for other robots)
            peek = true;
            ahead(amountToMove);
            //We dont have to look now
            peek = false;
            turnRight(90);
        }
    }

    /**
     * We move away from a robot
     * @param hitevent tells us if we have currently hit a robot
     * if the robot is in front of us we send a powerful blast
     */
    public void onHitRobot(HitRobotEvent hitevent){
        if(hitevent.getBearing() > -90 && hitevent.getBearing() < 90){
            back(100);
            fire(1);
        } // he is in front  of us
        else{
            ahead(100);

        }

    }

    public void onScannedRobot(ScannedRobotEvent e){
        fire(2);

        if(peek){
            scan();
        }
    }

    /**
     * Here we generate a new robot when hti by bullet
     */

}
