package academy.devdojo.javaoneforall.javacore.MInterfaces.domain;

public class Fileloader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data from file...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission from file");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from file...");
    }
}
