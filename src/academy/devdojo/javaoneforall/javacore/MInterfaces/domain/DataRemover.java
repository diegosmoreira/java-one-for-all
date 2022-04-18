package academy.devdojo.javaoneforall.javacore.MInterfaces.domain;

public interface DataRemover {
    public abstract void remove();
    public default void checkPermission() {
        System.out.println("Checking permission general");
    }
}
