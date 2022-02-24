package Day2.A2Q16;

public class Criteria {
    private String path;
    private boolean countSubFolder;

    public Criteria(String path, boolean countSubFolder) {
        this.path = path;
        this.countSubFolder = countSubFolder;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isCountSubFolder() {
        return countSubFolder;
    }

    public void setCountSubFolder(boolean countSubFolder) {
        this.countSubFolder = countSubFolder;
    }

}
