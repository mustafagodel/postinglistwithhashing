
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<String>ll = new LinkedList<String>();

        File file = null;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        HashMap<String, String> map = new HashMap<String, String>();
        File folder = new File("src\\dataset");
        File[] listOfFiles = folder.listFiles();
        String j = "";
        for (int i = 0; i < listOfFiles.length; i++) {
            file = listOfFiles[i];
            try (Scanner sc = new Scanner(file)) {
                while (sc.hasNextLine()) {
                    String a = sc.nextLine();
                    String[] tdata = a.split(" ");
                    map.put(a,file.getName());
                    if (tdata[0].contains(word)){
                        ll.insertLast(file.getName());
                    }
                }
            }
        }
        System.out.println(ll.toString());
    }
}
