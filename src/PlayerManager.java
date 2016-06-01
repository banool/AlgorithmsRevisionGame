/**
 * Created by Brad on 1/06/2016.
 */

import java.io.*;
import java.util.*;

public class PlayerManager {

    Scanner inputStream = new Scanner(System.in);
    Player p = Player.INSTANCE;


    public void outputPlayer () {

        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(new FileOutputStream("src/players.txt"));
            outputStream.println(p.getFirstName());
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output.");
        }
    }


    public void inputPlayer () {

        //Creates a player file if one does not already exist.
        File f = new File("src/players.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (Exception e) {
                System.out.println("Problem with file input.");
            }
        }

        try {
            inputStream = new Scanner(new FileInputStream(f));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        String line = null;
        int count = 0;

        try {
            while (inputStream.hasNextLine()) {
                line = inputStream.nextLine();
                count++;
                p.setFirstName(line);
            }
            inputStream.close();
        } catch (Exception e) {
            System.out.println("Problem reading Players.txt.");
        }
    }
}
