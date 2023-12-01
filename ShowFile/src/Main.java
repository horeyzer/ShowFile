import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis;
        int bajt;

        try
        {
            fis = new FileInputStream("C:\\Users\\vchup\\IdeaProjects\\USING-IO_1\\src\\test123.txt");
            //open the file
            //fis = new FileInputStream("C:\\path...
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
            return;
        }

        //read bytes until EOF is encountered
        try
        {
            do
            {
                bajt = fis.read(); //read from the file
                if (bajt != -1) System.out.print((char) bajt);
            }
            while (bajt != -1); //when i equates -1, the end of the file has been reached
        }
        catch (IOException e)
        {
            System.out.println("Error reading file");
        }

        try
        {
            fis.close();
        }
        catch (IOException e)
        {
            System.out.println("Error closing file.");
        }
    }
}

/*

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis = null;
        int bajt;

        try
        {
            fis = new FileInputStream("C:\\Users\\vchup\\IdeaProjects\\USING-IO_1\\src\\test123.txt");

            // read bytes until EOF is encountered
            do
            {
                bajt = fis.read(); // read from the file
                if (bajt != -1) System.out.print((char) bajt);
            }
            while (bajt != -1); // when i equates -1, the end of the file has been reached

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch (IOException e)
        {
            System.out.println("Error reading file");
        }
        finally
        {
            // close the file in the finally block
            if (fis != null)
            {
                try
                {
                    fis.close();
                }
                catch (IOException e)
                {
                    System.out.println("Error closing file.");
                }
            }
        }
    }
}

*/