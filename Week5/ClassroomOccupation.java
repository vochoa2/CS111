public class ClassroomOccupation {
    public static void main(String[] args) {
        //1, Create 2D array to hold weird classroom 
        // row index 0 has 3 seats
        // row index 1 has 4 seats
        // row index 2 has 2 seats
        // row index 3 has 3 seats
        // use booleans to determine whether someone is sitting there or not

        // boolean[][] classroom = {{false, false, false},
        //                          {false, false, false, false},
        //                          {false, false},
        //                          {false, false, false},
        //                         };

        boolean[][] classroom = new boolean[4][]; // allocate room for "rows", note this is the same 
        //as allocating space for a 1D array, where the elements aren't specified yet

        // for (int i = 0; i < classroom.length; i++) {
        //     //for (int j = 0; j < classroom[i].length; j++) {
        //         System.out.println(classroom[i]);
        //         //all these are just null
        //     }

        //providing lengths for each array in array, these will all be null as well
        // just allocating memory for em.
        classroom[0] = new boolean[3];
        classroom[1] = new boolean[4]; 
        classroom[2] = new boolean[2];
        classroom[3] = new boolean[3];

        //2. populate 2D array with occupants, Use a random value
        for(int i = 0; i < classroom.length; i++){
            for( int j = 0; j < classroom[i].length; j++){
                double r = Math.random();
                if(r < 0.5) classroom[i][j] = true;
                else classroom[i][j] = false;
            }
        }

        int count = 0;

        //3. Traverse array to determine number of occupants
        for(int i = 0; i < classroom.length; i++){
            for( int j = 0; j < classroom[i].length; j++){
                if(classroom[i][j]) count++;
            }
        }
        System.out.println(count);

        int row2Count = 0;
        //4. Traverse only row 2 (third row) to determine number of occupants
        for(int i = 0; i < classroom[2].length; i++){
            if(classroom[2][i]) row2Count++;
        }
        System.out.println(row2Count);

        int column4count = 0;
        //5. traverse only column index 3 to determine number of occupants
        for(int i = 0; i < classroom.length; i++){
            if(classroom[i].length < 4) continue;
            if(classroom[i][3]) column4count++;
        }
        System.out.println(column4count);

    }
    
}
