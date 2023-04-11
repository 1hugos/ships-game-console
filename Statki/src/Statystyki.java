import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class Statystyki {
    public static void Show()//(Spyra Aleksandra)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Stats:" + "\033[0;36m");
        Read();
        System.out.print("\033[0m");
        System.out.println("\nType '1' and press ENTER to return to main menu");
        scan.next();
        Start.Menu();
    }

    public static void Save(String who)//(Spyra Aleksandra)
    {
        String roundNumber = Integer.toString(Game.RoundNumber());
        try {
            File file = new File("stats.txt");
            // true = append to file, false = overwrite file
            FileWriter writer = new FileWriter(file, true);

            String text = who+ " won after " + roundNumber + " rounds.\n";
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Read()//(Spyra Aleksandra)
    {
        try {
            File file = new File("stats.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;

            while ((st = br.readLine()) != null)
                System.out.println(st);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}