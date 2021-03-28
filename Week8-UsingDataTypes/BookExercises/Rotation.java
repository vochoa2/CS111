public class Rotation {
    public static void main(String[] args) {
        String inputImageName = args[0];
        double angle = Math.toRadians(Double.parseDouble(args[1]));

        Picture inputImage = new Picture(inputImageName);

        double centerI = (inputImage.width() - 1) / 2.0;
        double centerJ = (inputImage.height() - 1) / 2.0;

        System.out.println(inputImage.width());
        System.out.println(inputImage.height());

        Picture outputImage = new Picture(inputImage.width(), inputImage.height());
        for(int i = 0; i < inputImage.width(); i ++){
            for(int j = 0; j < inputImage.height(); j++){
                //swirly
                //double swirlAngle = (Math.sqrt(Math.pow(i-centerI, 2) + Math.pow(j - centerJ, 2)) * Math.PI)/256;
                int newI = (int)((i - centerI)*Math.cos(angle) - (j - centerJ)*Math.sin(angle) + centerI);
                int newJ = (int)(((i - centerI) * Math.sin(angle) + (j - centerJ) * Math.cos(angle)) + centerJ);


                /*Image is rotated within width x height of the original image, so we have 
                to skip over those values trying to be rotated and mapped outside of those dimensions*/
                //HAD set(newI, newJ, inputImage.get(i, j)); but it is backwards, as we're looking for the
                //color at that angle from the previous
                if(newI >= 0 && newJ >= 0 && newJ < 396 && newI < 599)
                    outputImage.set(i, j, inputImage.get(newI, newJ));

            }
        }

        outputImage.show();

    }
}
