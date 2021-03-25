import java.awt.Color;
public class Tile{
    public static void main(String[] args) {
        String pictureFileName = args[0];
        int m = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);

        Picture pictureToBeUsed = new Picture(pictureFileName);

        int height = pictureToBeUsed.height();
        int width = pictureToBeUsed.width();
        
        int newHeight = m * height;
        int newWidth = n * width;

        Picture tiledPicture = new Picture(newWidth, newHeight);

        for(int i = 0; i < newWidth; i++){
            for(int j = 0; j < newHeight; j++){
                Color colorFromOGPicture = pictureToBeUsed.get(i % width, j % height);
                tiledPicture.set(i, j, colorFromOGPicture);
            }
        }

        tiledPicture.show();
    }
}