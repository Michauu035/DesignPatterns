package Fasade;

public class ResolutionChanger {
    public static Image lowerResolution(Image img) {
        Image result = img;
        result.setResolution(img.getResolution() / 2);
        return result;
    }
}
