import java.util.Random;

public class Ships
{
    public static char[][] randomShipsOnMap(char[][] map) {//(Stankowski Marcin)

        int[] shipSizes = {4, 3, 3, 2, 2, 2};

        char[] shipTypes = {'A', 'B', 'C', 'D', 'E', 'F'};

        Random rand = new Random();

        int shipCount = 0;

        for (int i = 0; i < shipSizes.length; i++) {

            boolean placed = false;

            while (!placed) {

                int row = rand.nextInt(8);
                int col = rand.nextInt(8);

                boolean isHorizontal = rand.nextBoolean();


                if (isHorizontal) {
                    if (col + shipSizes[i] <= 8) {
                        boolean canPlace = true;

                        for (int j = col; j < col + shipSizes[i]; j++) {
                            if (map[row][j] != '\u0000') {
                                canPlace = false;
                                break;
                            }
                        }

                        if (canPlace) {
                            for (int j = col; j < col + shipSizes[i]; j++) {
                                map[row][j] = shipTypes[shipCount];
                            }
                            placed = true;
                            shipCount++;
                        }
                    }
                } else {
                    if (row + shipSizes[i] <= 8) {
                        boolean canPlace = true;

                        for (int j = row; j < row + shipSizes[i]; j++) {
                            if (map[j][col] != '\u0000') {

                                canPlace = false;
                                break;
                            }
                        }

                        if (canPlace) {
                            for (int j = row; j < row + shipSizes[i]; j++) {
                                map[j][col] = shipTypes[shipCount];
                            }
                            placed = true;
                            shipCount++;
                        }
                    }
                }
            }
        }


        System.out.print("\tA\tB\tC\tD\tE\tF\tG\tH\n");
        System.out.print("\t——————————————————————————————\n");
        for (int i = 0; i < map.length; i++) {
            System.out.print((i+1)+"|\t");
            for (int j = 0; j < map.length; j++) {
                if(map[i][j] == 'A'){
                    System.out.print("\uD83D\uDC9A\t");
                }else if(map[i][j] == 'B' || map[i][j] == 'C'){
                    System.out.print("\uD83D\uDC99\t");
                }else if(map[i][j] == 'D' || map[i][j] == 'E' || map[i][j] == 'F'){
                    System.out.print("\uD83E\uDDE1\t");
                }else{
                    System.out.print("✕\t");
                }
            }
            System.out.print("|"+ (i+1));
            System.out.println();
        }
        System.out.print("\t——————————————————————————————\n");
        System.out.print("\tA\tB\tC\tD\tE\tF\tG\tH\n\n");

        return map;
    }

    public static boolean AnyShipExist(char[][] tablica) //(Stankowski Marcin)
    {
        for (int i = 0; i < tablica.length; i++)
        {
            for (int j = 0; j < tablica[i].length; j++) {
                if(tablica[i][j]=='A' || tablica[i][j]=='B' || tablica[i][j]=='C' || tablica[i][j]=='D' || tablica[i][j]=='E' || tablica[i][j]=='F'){
                    return true;
                }
            }
        }
        return false;
    }

}
