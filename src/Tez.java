public class Tez extends AppDecorator {
    public Tez(Android android) {
        super(android);
    }

    @Override
    public void install() {
        android.install();
        PrintMessage.print("Tez ");
    }
}
