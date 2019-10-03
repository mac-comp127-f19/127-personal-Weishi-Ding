package Objects;

public class DiceRoller {
    public static void main(String[] args) {
        Dice newdie = new Dice(1);
        for (int j=0;j<10;j++){
            newdie.Roll();
            System.out.println("Roll "+j+" "+"generated a "+newdie.toString());

        }
        Dice SecondDie = new Dice(1);
        int count=0;
        for (int i=0;i<1000000;i++){
            newdie.Roll();
            SecondDie.Roll();
            if(newdie.getValue()==SecondDie.getValue()){
                count+=1;
            }
        }
        System.out.println("In 1,000,000 rolls, two dice agreed "+count+" times");

    }

    }

