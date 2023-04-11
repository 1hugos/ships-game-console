import java.util.Scanner;

public class Start {

    public static void Menu() {//(Wszyscy razem)
     Scanner scan = new Scanner(System.in);
     char wybor;
     int wybor1 = 0;
     Game game = new Game();
     System.out.println("\t\t\t░██████╗████████╗░█████╗░████████╗██╗░░██╗██╗");
     System.out.println("\t\t\t██╔════╝╚══██╔══╝██╔══██╗╚══██╔══╝██║░██╔╝██║");
     System.out.println("\t\t\t╚█████╗░░░░██║░░░███████║░░░██║░░░█████═╝░██║");
     System.out.println("\t\t\t░╚═══██╗░░░██║░░░██╔══██║░░░██║░░░██╔═██╗░██║");
     System.out.println("\t\t\t██████╔╝░░░██║░░░██║░░██║░░░██║░░░██║░╚██╗██║");
     System.out.println("\t\t\t╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝");

     System.out.println("\033[0;32m");
     System.out.println("\t\t\t\t  ⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ");
     System.out.println("\t\t\t\t  ⠸⡇⠀⠿⡀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ");
     System.out.println("\t\t\t\t⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀");
     System.out.println("\t\t\t\t⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀ ");
     System.out.println("\t\t\t\t⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆ ");
     System.out.println("\t\t\t\t⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿ ");
     System.out.println("\t\t\t\t⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀ ");
     System.out.println("\t\t\t\t⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ ");
     System.out.println("\t\t\t\t⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ ");
     System.out.println("\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ ");
     System.out.println("\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀ ");
     System.out.println("\t\t\t\t⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀");
     System.out.println("\t\t\t\t⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀");
     System.out.println("\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
     System.out.println("\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉");
     System.out.println("\n\t\tby Alexandra Speera, MarÜnio && Stanky ®2023");
     System.out.println("\033[0m");

     System.out.println("\nMENU: ");
     System.out.println("1. Play Game");
     System.out.println("2. Stats");

     do {
      System.out.print("Choice: ");
      wybor = scan.next().charAt(0);
     }while((byte)wybor < 49 || (byte)wybor > 50);
     wybor1 = Integer.parseInt(String.valueOf(wybor));
     if (wybor1 == 1) game.PlayGame();
     else if (wybor1 == 2) Statystyki.Show();

    }
}