//package biasbuster;

import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class BiasBuster {
    String name;
    String resume;

    public BiasBuster(String inputName, String inputResume) {
        name = inputName;
        resume = inputResume;

        // try {
        // Scanner sc = new Scanner(file);
        // while (sc.hasNextLine()) {
        // int i = sc.nextInt();
        // System.out.println(i);
        // }
        // sc.close();
        // }
        // catch (FileNotFoundException e) {
        // e.printStackTrace();
        // }

    }

    public String getName() {
        return name;
    }

    public String getResume() {
        return resume;
    }

    public String replaceName() throws FileNotFoundException {
        if (resume.contains(name)) {
            int firstIdx = resume.indexOf(name);
            int lastIdx = firstIdx + name.length();
            String newName = newName();
            String finalResume = resume.substring(0, firstIdx) + newName + resume.substring(lastIdx);
            return finalResume;
        }
        return resume;

    }

    public String newName() {
        String[] firstNames = { "Avery", "Alex", "Aspen", "Ainsley", "Andie", "Blake", "Bailey", "Bobbie", "Blair",
                "Chase", "Charlie", "Cameron", "Casey", "Dakota", "Devon",
                "Dylan", "Eden", "Hayden", "Harley", "Jordan", "Jo", "Jackie", "Jody", "Jamie", "Jesse", "Jude", "Kai",
                "Leslie", "Morgan", "Nevada", "Royal", "Reese", "Riley", "Rory", "Sasha",
                "Skyler", "Taylor" };
        String[] lastNames = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
                "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris",
                "Martin", "Thompson", "Robinson", "Clark", "Lewis", "Walker", "Hall", "Allen", "Young", "King",
                "Wright", "Hill", "Scott", "Green", "Adams", "Baker", "Nelson", "Carter",
                "Mitchell", "Roberts", "Turner", "Phillips" };
        Random rand = new Random();
        int idxFirst = rand.nextInt(firstNames.length);
        int idxLast = rand.nextInt(lastNames.length);
        return (firstNames[idxFirst] + " " + lastNames[idxLast]);

    }

    public static void main(String[] args) {
        BiasBuster thing = new BiasBuster("Chiku U", "Chiku U is a dog");
        try {
            String toPrint = thing.replaceName();
            System.out.print(toPrint);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // try
        // {
        // System.out.println(rad(medha));
        // }
        // catch (FileNotFoundException e)
        // {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // FileInputStream fis = null;
        //
        // try {
        // fis = new FileInputStream(file);
        // int content;
        // while ((content = fis.read()) != -1) {
        // // convert to char and display it
        // resume += (char) content;
        // }
        //
        // System.out.println("After reading file");
        // System.out.println(resume);
        //
        // } catch (IOException e) {
        // e.printStackTrace();
        // } finally {
        // try {
        // if (fis != null)
        // fis.close();
        // } catch (IOException ex) {
        // ex.printStackTrace();
        // }
        // }
        // System.out.print(resume);
    }
}
