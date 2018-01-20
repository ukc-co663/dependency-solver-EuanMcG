import java.io.File;

public class Main {
    public static void main(String[] args) {
        File arg1 = new File(args[0]);
        System.out.println(arg1.getAbsolutePath());
        System.out.println(arg1.getName());
    }
}
