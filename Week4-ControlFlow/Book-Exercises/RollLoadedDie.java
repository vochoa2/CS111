public class RollLoadedDie {
    public static void main(String[] args) {
        //Rolling a die where the probability of 1,2,3,4 or 5 is 1/8
        //Probability of 6 is 3/8

        int face = 0;
        int random = (int)(Math.random()*8);
        
        if(random < 5) {
            face = random + 1;
        }
        else {
            face = 6;
        }

        System.out.println(face);
    }
    
}
