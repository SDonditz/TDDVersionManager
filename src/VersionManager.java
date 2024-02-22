public class VersionManager {

    private int version;
    private final int initialVersion;

    public VersionManager(int version) {
        this.version = version;
        this.initialVersion = version;
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

    public int getInitialVersion() {
        return this.initialVersion;
    }

    public void reset() {
        this.version = this.getInitialVersion();
    }
}
