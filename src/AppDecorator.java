public class AppDecorator extends Android {

    Android android;

    public AppDecorator(Android android) {
        this.android = android;
    }

    @Override
    public void upgradeAndroidVersion() {

    }

    @Override
    public void installPlaystoreApp() {

    }

    @Override
    public void showAndroidSpecs() {

    }

    @Override
    public void install() {
        android.install();
    }

    @Override
    public void makeCall() {

    }

    @Override
    public void messaging() {

    }

    @Override
    public void browseInternet() {

    }

    @Override
    public void accessUniqueFeature() {

    }
}
