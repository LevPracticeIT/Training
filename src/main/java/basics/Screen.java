package basics;

public class Screen {

    private String screenName;
    private int screenId;
    private Boolean screenToTest;
    private double screenVersion;
    private long screenSize;

    public Screen(String screenName, int screenId) {
        this.screenName = screenName;
        this.screenId = screenId;
    }

    public Screen() {

    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public Boolean getScreenToTest() {

        if (screenToTest = true) {
            System.out.println("Test will be executed");
        } else {
            System.out.println("This screen will not be tested");


        }
        return screenToTest;
    }

    public void setScreenToTest(Boolean screenToTest) {
        this.screenToTest = screenToTest;
    }

    public double getScreenVersion() {
        return screenVersion;
    }

    public void setScreenVersion(double screenVersion) {
        this.screenVersion = screenVersion;
    }

    public long getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(long screenSize) {
        this.screenSize = screenSize;
    }

    public void printScreenDetails() {
        System.out.println("Screen name is:" + screenName);
        System.out.println("Screen id is:" + screenId);

    }

    public void pressButton(String buttonName) {

        System.out.println("Button " + buttonName + " will be pressed"  ) ;

    }

}
