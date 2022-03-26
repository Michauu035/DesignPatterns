package Fasade;

public class FormatConverter {
    public static Image convert(Image img, String format) {
        String filename = img.getFilename().substring(img.getFilename().length() - 3) + format;
        Image convertedImg = new Image(filename);
        return convertedImg;
    }
}
