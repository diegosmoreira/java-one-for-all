package academy.devdojo.javaoneforall.javacore.MInterfaces.domain;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission() {
        System.out.println("Checking permission general");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Iniside retrieveMaxDataSize in the interface");
    }
}
