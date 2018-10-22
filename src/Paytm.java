public class Paytm extends AppDecorator {
    public Paytm(Android android) {
        super(android);
    }

    @Override
    public void install() {
        android.install();
        PrintMessage.print("Paytm ");
    }

}
