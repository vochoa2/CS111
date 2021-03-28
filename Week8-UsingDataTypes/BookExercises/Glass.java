public class Glass {
    public static void main(String[] args) {
        Picture image1 = new Picture(args[0]);
        int glass = Integer.parseInt(args[1]);

        image1.show();
        int width = image1.width();
        int height = image1.height();

        Picture image2 = new Picture(width, height);

        for(int x = 0; x < width; x++){
            for(int y = 0; y < height; y++){
                int dx = StdRandom.uniform(-glass, glass + 1);
                int dy = StdRandom.uniform(-glass, glass + 1);

                int xx = x + dx;
                int yy = y + dy;

                if(xx < width && xx >= 0 && yy < height && yy >= 0)
                    image2.set(x, y, image1.get(xx, yy));
            }
        }
        image2.show();
    }
    
}
