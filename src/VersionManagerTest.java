import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class VersionManagerTest {
    private static VersionManager versionManager;

    @BeforeAll
    static void setUp() {
        versionManager = new VersionManager();
    }

    @BeforeEach
    public void initEach() {
        versionManager.setVersion(0);
    }

    @Test
    @DisplayName("Test majeur")
    void majeur() {
        versionManager.majeur();
        assertEquals(100, versionManager.getVersion());
    }

    @Test
    @DisplayName("Test mineur")
    void mineur() {
        versionManager.mineur();
        assertEquals(10, versionManager.getVersion());
    }

    @Test
    @DisplayName("Test patch")
    void patch() {
        versionManager.patch();
        assertEquals(1, versionManager.getVersion());
    }

    @Test
    @DisplayName("Test getVersion")
    void getVersion() {
        versionManager.setVersion(211);
        assertEquals(211, versionManager.getVersion());
    }

    @Test
    @DisplayName("Test setVersion")
    void setVersion() {
        versionManager.setVersion(100);
        assertEquals(100, versionManager.getVersion());
    }

    @Test
    @DisplayName("Test triple majeur")
    void tripleMajeur() {
        versionManager.majeur();
        versionManager.majeur();
        versionManager.majeur();
        assertEquals(300, versionManager.getVersion());
    }

    @Test
    @DisplayName("Test majeur+mineur+patch")
    void trinity() {
        versionManager.majeur();
        versionManager.mineur();
        versionManager.patch();
        assertEquals(111, versionManager.getVersion());
    }
}