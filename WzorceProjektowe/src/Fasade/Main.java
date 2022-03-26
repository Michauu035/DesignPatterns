package Fasade;

public class Main {
    public static void main(String[] args) {
        ImageCompressor compressor = new ImageCompressor();
        Image img = compressor.CompressImage("kot.png", "jpg");
    }
}
