package Fasade;

public class ImageCompressor {
    public Image CompressImage(String filename, String format) {
        Image img = new Image(filename);
        System.out.println("File size before compression: " + img.getFileSize() + " kb");
        System.out.println("Image resolution before compression: " + img.getResolution() + " PPI");

        img = FormatConverter.convert(img, "jpg");
        img = ResolutionChanger.lowerResolution(img);

        System.out.println("File size after compression: " + img.getFileSize() + " kb");
        System.out.println("Image resolution before compression: " + img.getResolution() + " PPI");
        return img;
    }
}
