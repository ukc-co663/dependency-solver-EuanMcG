public class Package {
    private String name;
    private String version;
    private int size;
    private String deps;

    public void createPackage(String Name, String Version, int Size, String Deps) {
        this.name = Name;
        this.version = Version;
        this.size = Size;
        this.deps = Deps;
    }
}
