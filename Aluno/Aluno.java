package Aluno;
import robocode.*;
import java.awt.Color;
/**
 * aluno - a class by (João vitor Ribeiro)
 */
public class Aluno extends Robot {
 public void run(){
	 setColors(Color.darkGray,Color.magenta,Color.lightGray,Color.gray,Color.darkGray);
    while(true){
     ahead(100);
	  turnRight(90);
	  
	  }
 }
 //tank inimigo detectado
 public void onScannedRobot(ScannedRobotEvent e) {
	 String robotank = e.getName();
	 double distancia = e.getDistance();
	 System.out.println(robotank +" distância " + distancia);
   if (distancia <120){  
     fire(3);
} else{
	fire(1);
	}
  }
 
  //colisão com a parede
  public void onHitWall(HitWallEvent e){
	  back(50);
	  turnRight(80);
  }
}
