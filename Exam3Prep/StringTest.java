public class StringTest {
    public static void main(String[] args) {
        String[] exams =  {"1;2;3;4;", "5;6;7;8;", "9;10;11;12;"};
        int n = 4;

        double[][] a = convert(exams, n);

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                System.out.println(a[r][c]);
            }
        }
    }

    // public static double[][] convert(String[] exams, int n){
    //     double[][] exams2D = new double[exams.length][n];
    //     String[][] examsString2D = new String[exams.length][n];

    //     for(int r = 0; r < examsString2D.length; r++){
    //             examsString2D[r] = exams[r].split(";"); 
    //     }

    //     for (int r = 0; r < exams2D.length; r++) {
    //         for (int c = 0; c < exams2D[r].length; c++) {
    //             exams2D[r][c] = Double.parseDouble(examsString2D[r][c]);
    //         }
    //     }

    //     return exams2D;
    // }

    public static double[][] convert(String[] exams, int n) {
        double[][] ret = new double[exams.length][n];
        for (int i = 0; i < exams.length; i++) {
            String exam = exams[i];
            int index = exam.indexOf(";");
            int j = 0;
            while (index != -1) {
                double score = Double.parseDouble(exam.substring(0, index));
                ret[i][j] = score;
                j++;
                exam = exam.substring(index + 1);
                index = exam.indexOf(";");
            }
        }
        return ret;
    }
    
}
