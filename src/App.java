public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Goi cac test
        TestUser.test();
        TestTime.testtime();
        TestRecursion.testRe();

        //Demo cleanup
        System.out.println("\n ---Demo Cleanup---");
        try (ResourceDemo r = new ResourceDemo("demo.txt")) {
            r.doWork();
        } //Tu dong goi close()
    }
}
