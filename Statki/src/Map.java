public class Map
{
    public static void PlayerMapDraw(char[][] playerMap)//(Spyra Aleksandra)
    {
        System.out.println("\n\t\t\t<PLAYER MAP>");
        System.out.print("\tA\tB\tC\tD\tE\tF\tG\tH\n");
        System.out.print("\t——————————————————————————————\n");
        for (int i = 0; i < playerMap.length; i++)
        {
            System.out.print((i+1)+"|\t");
            for (int j = 0; j < playerMap[i].length; j++) {
                if(playerMap[i][j]=='\u0000') System.out.print("✕\t");
                if(playerMap[i][j]=='A') System.out.print("\uD83D\uDC9A\t");
                if(playerMap[i][j]=='B'||playerMap[i][j]=='C') System.out.print("\uD83D\uDC99\t");
                if(playerMap[i][j]=='D'||playerMap[i][j]=='E'||playerMap[i][j]=='F') System.out.print("\uD83E\uDDE1\t");
                if(playerMap[i][j]=='X') System.out.print("❌\t");
                if(playerMap[i][j]=='O') System.out.print("○\t"); //nietrafiony
            }
            System.out.print("|"+ (i+1));
            System.out.println();
        }
        System.out.print("\t——————————————————————————————\n");
        System.out.print("\tA\tB\tC\tD\tE\tF\tG\tH\n\n");
    }


    public static void EnemyMapDraw(char[][] enemyMap)//(Spyra Aleksandra)
    {
        System.out.println("\n\t\t\t<ENEMY MAP>");
        System.out.print("\tA\tB\tC\tD\tE\tF\tG\tH\n");
        System.out.print("\t——————————————————————————————\n");

        for (int i = 0; i < enemyMap.length; i++)
        {
            System.out.print((i+1)+"|\t");
            for (int j = 0; j < enemyMap[i].length; j++)
            {
                if(enemyMap[i][j]=='\u0000') System.out.print("✕\t");
                if(enemyMap[i][j]=='A'||enemyMap[i][j]=='B'||enemyMap[i][j]=='C'||enemyMap[i][j]=='D'|enemyMap[i][j]=='E'||enemyMap[i][j]=='F') System.out.print("✕\t");
                if(enemyMap[i][j]=='X') System.out.print("❌\t");
                if(enemyMap[i][j]=='O') System.out.print("○\t");
            }
            System.out.print("|"+ (i+1));
            System.out.println();

        }
        System.out.print("\t——————————————————————————————\n");
        System.out.print("\tA\tB\tC\tD\tE\tF\tG\tH\n\n");
    }
}
