package Objects;
import java.util.Random;
public class Dice {
    int number;
    boolean beenRolled =false;
    public Dice(int number){
        this.number=number;

    }
    public void Roll(){
        Random rand = new Random();
        number = rand.nextInt(6)+1;
        beenRolled = true;
    }
    public int getValue(){
        if(beenRolled){
            return number;
        }
        else return -1;
    }
    @Override
    public String toString(){

        if(number==0){
          return "zero";
      }
      if(number==1){
          return "one";
      }
      else if(number==2){
          return "two";
      }
      else if(number==3){
          return "three";
      }
      else if(number==4){
          return "four";
      }
      else if(number==5){
          return "five";
      }
      else{
          return "six";
      }
    }
}
