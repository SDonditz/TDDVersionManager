import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VersionManagerTest {
    private static VersionManager versionManager;

    @BeforeAll
    static void setUp() {
        versionManager = new VersionManager();
    }

    @Test
    @DisplayName("Test majeur")
    void majeur() {
        versionManager.majeur();
        assertEquals(versionManager.getVersion() + 100, versionManager.getVersion());
    }

    @Test
    @DisplayName("Test mineur")
    void mineur() {
        versionManager.mineur();
        assertEquals(versionManager.getVersion() + 10, versionManager.getVersion());
    }

    @Test
    @DisplayName("Test patch")
    void patch() {
        versionManager.patch();
        assertEquals(versionManager.getVersion() + 1, versionManager.getVersion());
    }

    @Test
    @DisplayName("Test getVersion")
    void getVersion() {
        assertEquals(0, versionManager.getVersion());
    }

    @Test
    @DisplayName("Test setVersion")
    void setVersion() {
        versionManager.setVersion(100);
        assertEquals(100, versionManager.getVersion());
    }
}