public class VersionManager {

    private int version = 0;

    public VersionManager() {
    }

    public void majeur() {
        this.version += 100;
    }

    public void mineur() {
        this.version += 10;
    }

    public void patch() {
        this.version += 1;
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
