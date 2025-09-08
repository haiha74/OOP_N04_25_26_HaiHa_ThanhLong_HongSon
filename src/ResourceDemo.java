// Minh hoa khoi tao & cleanup tai nguyen (AutoCloseable)
public class ResourceDemo implements AutoCloseable {
    private final String name;
    private boolean opened = false;

    // Constructor -> mo tai nguyen
    public ResourceDemo(String name) {
        this.name = name;
        opened = true;
        System.out.println("Mo tai nguyen: " + name);
    }

    public void doWork() {
        if (!opened) throw new IllegalStateException("Tai nguyen chua duoc mo");
        System.out.println("Dang xu ly: " + name);
    }

    // Cleanup -> dong tai nguyen
    @Override
    public void close() {
        if (opened) {
            System.out.println("Dong tai nguyen: " + name);
            opened = false;
        }
    }
}