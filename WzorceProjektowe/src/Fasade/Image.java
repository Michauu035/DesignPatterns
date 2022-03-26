package Fasade;

public class Image {
    private String filename;
    private String format;
    private int[] imageSize = new int[2];
    private int fileSize;
    private int resolution;

    public Image(String filename) {
        this.filename = filename;
        this.format = filename.substring(filename.length() - 3);
        this.fileSize = filename.length() * 10 * (this.format.equals("png") ? 10 : 5);
        this.resolution = filename.length() * 86;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public String getFilename() {
        return filename;
    }

    public String getFormat() {
        return format;
    }

    public int[] getImageSize() {
        return imageSize;
    }

    public int getFileSize() {
        return fileSize;
    }
}
