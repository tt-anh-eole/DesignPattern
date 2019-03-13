public class SingleObject {
    private static SingleObject instance = new SingleObject();

    // make constuctor private so that client can not init this class instance
    private SingleObject() {}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world!");
    }
}
