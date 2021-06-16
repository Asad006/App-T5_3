package org.example.Ex43.base;

import java.io.File;

public class CreateFolders {
    public void createfolder(String pathFolder) {

        File directory = new File(pathFolder);
        if (!directory.exists()){
            directory.mkdirs();
            System.out.println("Created "+pathFolder);
        }



    }
}
