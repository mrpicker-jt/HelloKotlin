package course2.unit2;

public class LambdaMain {
    /**
     * java 中的lambda
     * @param args
     */
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {

        });
        thread.start();
    }
}
