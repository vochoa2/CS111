public class PlayThatTune {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            //int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();
            double hz = StdIn.readDouble();
            double[] a = PlayThatNote.tone(hz, duration);
            StdAudio.play(a);
        }
    }
    
}
