package academy.devdojo.javaoneforall.javacore.MInterfaces.test;

import academy.devdojo.javaoneforall.javacore.MInterfaces.domain.DataLoader;
import academy.devdojo.javaoneforall.javacore.MInterfaces.domain.DatabaseLoader;
import academy.devdojo.javaoneforall.javacore.MInterfaces.domain.Fileloader;

public class DataloaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        Fileloader fileloader = new Fileloader();

        databaseLoader.load();
        fileloader.load();

        databaseLoader.remove();
        fileloader.remove();

        databaseLoader.checkPermission();
        fileloader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
