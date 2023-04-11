import java.util.Random;
import java.util.Scanner;

public class Shot {
    public static void TryShot(boolean[][] playerShooted, char[][] enemyMap) //(Dąbkowski Marek)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("————————————————————————————————————————\nTry to shot enemy's ship: ");
        String wybor;
        boolean shooted = false;
        int y,z=0;
        char x, y1;
        do{
            do{
                do{
                    System.out.println("Enter the coordinates: [A-H][1-8]: ");
                    wybor = scan.next();
                }while(wybor.length() < 2);
                x = Character.toUpperCase(wybor.charAt(0));
                y1 = wybor.charAt(1);
            }while((byte)x<65||(byte)x>72||(byte)y1<49||(byte)y1>56);

            y = Integer.parseInt(String.valueOf(y1));

            if(x=='A')z=1;
            if(x=='B')z=2;
            if(x=='C')z=3;
            if(x=='D')z=4;
            if(x=='E')z=5;
            if(x=='F')z=6;
            if(x=='G')z=7;
            if(x=='H')z=8;

            if(playerShooted[y-1][z-1]) System.out.println("Choose other position!!!");
        }while(playerShooted[y-1][z-1]);

        System.out.println("\n————————————————————————————————————————");


        char temp = enemyMap[y-1][z-1];
        if(enemyMap[y-1][z-1]=='A'){
            //enemyMapforPlayer[y-1][z-1] = 'X';
            enemyMap[y-1][z-1] = 'X';
            shooted = true;
            System.out.println("Player HIT at: " + x + "-" + (y) );

        }
        else if(enemyMap[y-1][z-1]=='B'){
            //enemyMapforPlayer[y-1][z-1] = 'X';
            enemyMap[y-1][z-1] = 'X';
            shooted = true;
            System.out.println("Player HIT at: " + x + "-" + (y) );
        }
        else if(enemyMap[y-1][z-1]=='C'){
            //enemyMapforPlayer[y-1][z-1] = 'X';
            enemyMap[y-1][z-1] = 'X';
            shooted = true;
            System.out.println("Player HIT at: " + x + "-" + (y) );
        }
        else if(enemyMap[y-1][z-1]=='D'){
            //enemyMapforPlayer[y-1][z-1] = 'X';
            enemyMap[y-1][z-1] = 'X';
            shooted = true;
            System.out.println("Player HIT at: " + x + "-" + (y) );
        }
        else if(enemyMap[y-1][z-1]=='E'){
            //enemyMapforPlayer[y-1][z-1] = 'X';
            enemyMap[y-1][z-1] = 'X';
            shooted = true;
            System.out.println("Player HIT at: " + x + "-" + (y) );
        }
        else if(enemyMap[y-1][z-1]=='F'){
            //enemyMapforPlayer[y-1][z-1] = 'X';
            enemyMap[y-1][z-1] = 'X';
            shooted = true;
            System.out.println("Player HIT at: " + x + "-" + (y) );
        }
        else{
            enemyMap[y-1][z-1] = 'O';
            System.out.println("Player MISS at: " + x + "-" + (y) );
        }
        playerShooted[y-1][z-1] = true;
        isShipSunk(temp,enemyMap);

        System.out.println("————————————————————————————————————————");

        Map.EnemyMapDraw(Game.enemyMap);

        System.out.println("————————————————————————————————————————");
        if(shooted){
            TryShot(Game.playerShooted, Game.enemyMap);
        }
    }

    public static void EnemySmartShot(char[][] map) {//(Stankowski Marcin)
        Random rand = new Random();
        char x = ' ';
        boolean hit = false;
        boolean miss = false;
        int direction = rand.nextInt(4);
        char shipSize;
        boolean shipA = false;
        boolean shipB = false;
        boolean shipC = false;
        boolean shipD = false;
        boolean shipE = false;
        boolean shipF = false;

        while (!hit) {
            int row = rand.nextInt(8);
            int col = rand.nextInt(8);

            if (col == 0) x = 'A';
            if (col == 1) x = 'B';
            if (col == 2) x = 'C';
            if (col == 3) x = 'D';
            if (col == 4) x = 'E';
            if (col == 5) x = 'F';
            if (col == 6) x = 'G';
            if (col == 7) x = 'H';

            if (map[row][col] != 'X' && map[row][col] != 'O') {
                if (map[row][col] != '\u0000') {
                    System.out.println("Enemy HIT at: " + x + "-" + (row + 1));
                    char temp = map[row][col];
                    map[row][col] = 'X';
                    isShipSunk(temp, map);
                    hit = true;
                    shipSize = map[row][col];
                    if (shipSize == 'A') shipA = true;
                    if (shipSize == 'B') shipB = true;
                    if (shipSize == 'C') shipC = true;
                    if (shipSize == 'D') shipD = true;
                    if (shipSize == 'E') shipE = true;
                    if (shipSize == 'F') shipF = true;


                    while (hit && !miss) {
                        if (!shipA && !shipB && !shipC && !shipD && !shipE && !shipF) {
                            if (direction == 0) {
                                if (row > 0) row--;
                                else direction++;
                            }
                            if (direction == 1) {
                                if (row < 7) row++;
                                else direction++;
                            }
                            if (direction == 2) {
                                if (col > 0) col--;
                                else direction++;
                            }
                            if (direction == 3) {
                                if (col < 7) col++;
                                else direction = 0;
                            }

                            if (col == 0) x = 'A';
                            if (col == 1) x = 'B';
                            if (col == 2) x = 'C';
                            if (col == 3) x = 'D';
                            if (col == 4) x = 'E';
                            if (col == 5) x = 'F';
                            if (col == 6) x = 'G';
                            if (col == 7) x = 'H';

                            if (map[row][col] != 'X' && map[row][col] != 'O') {
                                if (map[row][col] != '\u0000') {
                                    System.out.println("Enemy HIT at: " + x + "-" + (row + 1));
                                    char temp1 = map[row][col];
                                    map[row][col] = 'X';
                                    isShipSunk(temp1, map);
                                    shipSize = map[row][col];
                                    if (shipSize == 'A') shipA = true;
                                    if (shipSize == 'B') shipB = true;
                                    if (shipSize == 'C') shipC = true;
                                    if (shipSize == 'D') shipD = true;
                                    if (shipSize == 'E') shipE = true;
                                    if (shipSize == 'F') shipF = true;
                                } else {
                                    System.out.println("Enemy MISS at: " + x + "-" + (row + 1));
                                    map[row][col] = 'O';
                                    miss = true;
                                }
                            }
                        }
                    }

                } else {
                    System.out.println("Enemy MISS at: " + x + "-" + (row + 1));
                    map[row][col] = 'O';
                    hit = true;
                }
            }

        }
        //EnemyMapDraw();

        System.out.println("————————————————————————————————————————");
        Map.PlayerMapDraw(Game.playerMap);
    }

    public static void isShipSunk(char shipSize, char[][] map) //(Dąbkowski Marek)
    {
        boolean isSunk = true;

        for( int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (map[i][j] == shipSize) {
                    isSunk = false;
                    break;
                }
            }
        }

        if (isSunk) {
            if (shipSize == 'A') System.out.println("Ship of size 4 has been sunk!");
            if (shipSize == 'B'||shipSize == 'C') System.out.println("Ship of size 3 has been sunk!");
            if (shipSize == 'D'||shipSize == 'E'||shipSize == 'F') System.out.println("Ship of size 2 has been sunk!");
        }
    }



    public static void SetPlayerMap()   //(nieuzywane) (Dąbkowski Marek)
    {
        Scanner scan = new Scanner(System.in);
        int z=0;
        char x,y;

        //dodawanie poczwornego statku
        System.out.println("DODAWANIE POCZWÓRNEGO STATKU");
        for (int i = 0; i < 4; i++)
        {
            do{
                System.out.println("Podaj współrzędną X[A-H]: ");
                x = scan.next().charAt(0);
            }while((byte)x<65||(byte)x>72);

            do{
                System.out.println("Podaj współrzędną Y[1-8]: ");
                y = scan.next().charAt(0);
            }while((byte)y<49||(byte)y>56);
            if(x=='A')z=1;
            if(x=='B')z=2;
            if(x=='C')z=3;
            if(x=='D')z=4;
            if(x=='E')z=5;
            if(x=='F')z=6;
            if(x=='G')z=7;
            if(x=='H')z=8;
//            if ((x >= 1 || x<=8) && (y>=0 || y<= 8) && playerMap[x][y] == '♥'){
//                playerMap[x][y] = 'A';
//            } else if ((x <= 1 || x>=8) && (y<=0 || y>= 8)) {
//                System.out.println("You can't place a ship here.");
//            }
            Game.playerMap[Integer.parseInt(String.valueOf(y))-1][z-1]='A';
            Map.EnemyMapDraw(Game.enemyMap);
            Map.PlayerMapDraw(Game.playerMap);
        }

        //dodawanie potrojnego statku

        for (int i = 0; i < 2; i++)
        {
            System.out.println("DODAWANIE POTRÓJNEGO STATKU");
            for (int j = 0; j < 3; j++)
            {
                do{
                    System.out.println("Podaj współrzędną X[A-H]: ");
                    x = scan.next().charAt(0);
                }while((byte)x<65||(byte)x>72);

                do{
                    System.out.println("Podaj współrzędną Y[1-8]: ");
                    y = scan.next().charAt(0);
                }while((byte)y<49||(byte)y>56);
                if(x=='A')z=1;
                if(x=='B')z=2;
                if(x=='C')z=3;
                if(x=='D')z=4;
                if(x=='E')z=5;
                if(x=='F')z=6;
                if(x=='G')z=7;
                if(x=='H')z=8;
                Game.playerMap[Integer.parseInt(String.valueOf(y))-1][z-1]='B';
                Map.EnemyMapDraw(Game.enemyMap);
                Map.PlayerMapDraw(Game.playerMap);
            }
        }

        //dodawanie podwojnego statku

        for (int i = 0; i < 3; i++)
        {
            System.out.println("DODAWANIE PODWÓJNEGO STATKU");
            for (int j = 0; j < 2; j++)
            {
                do{
                    System.out.println("Podaj współrzędną X[A-H]: ");
                    x = scan.next().charAt(0);
                }while((byte)x<65||(byte)x>72);

                do{
                    System.out.println("Podaj współrzędną Y[1-8]: ");
                    y = scan.next().charAt(0);
                }while((byte)y<49||(byte)y>56);

                if(x=='A')z=1;
                if(x=='B')z=2;
                if(x=='C')z=3;
                if(x=='D')z=4;
                if(x=='E')z=5;
                if(x=='F')z=6;
                if(x=='G')z=7;
                if(x=='H')z=8;
                Game.playerMap[Integer.parseInt(String.valueOf(y))-1][z-1]='C';
                Map.EnemyMapDraw(Game.enemyMap);
                Map.PlayerMapDraw(Game.playerMap);
            }
        }
    }
}