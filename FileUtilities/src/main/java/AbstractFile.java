import Exceptions.SearchFileError;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class AbstractFile{

    private String fullFilePath = null;
    private String fileName = null;
    private FileDefaultTypes fileType = null;
    private File fileE = null;

    // Flaga, która zwraca true kiedy plik został utworzony podczas tworzenia objektu
    private boolean isFileCreated;

    public AbstractFile (String pathToFile , boolean cancelProtectedCreating)
    {
        new AbstractFile(new File(pathToFile) , cancelProtectedCreating);
    }
    public AbstractFile(String pathToFile)
    {
        new AbstractFile(new File(pathToFile) , false);
    }
    public AbstractFile (File f)
    {
        new AbstractFile(f , false);
    }

    public AbstractFile(File file , boolean cancelProtectedCreating) {
            fullFilePath = file.getAbsolutePath();
            fileE = file;
             String[] buffFileName;
             buffFileName = file.getPath().split(System.lineSeparator());
             fileName = buffFileName[buffFileName.length-1];if (!cancelProtectedCreating) {
            if (file == null) {
                throw new NullPointerException("File is a null object");
            }

            if (file.isDirectory()) {
                throw new SearchFileError("File is directory!");
            }

            checkAndCreate(file);
        }


    }

    private void checkAndCreate(File f){
        if (!f.exists())
        {
            try {
                if (f.createNewFile())
                {
                    isFileCreated = true;
                }
                else {
                    isFileCreated = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            isFileCreated = false;
        }

        String[] s = fileName.split("\\.");

        String buff = s[s.length-1];
        System.out.println(buff);
    }

    public boolean deleteFile()
    {
        if (fileE != null)
        {
            return fileE.delete();
        }else {
            return false;
        }
    }



}
