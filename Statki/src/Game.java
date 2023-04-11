public class Game {
    // ✕ -puste
    // A - 💚 -czworka
    // B - 💙 -trojka
    // C - 💙 -trojka
    // D - 🧡 -dwojka
    // E - 🧡 -dwojka
    // F - 🧡 -dwojka
    // ❌ -trafiony
    // ○  -nietrafiony

    public static char[][] playerMap = new char[8][8];
    public static boolean[][] playerShooted = new boolean[8][8];
    public static char[][] enemyMap = new char[8][8];

    public static int roundNumber= 1;

    public static int RoundNumber(){
        return roundNumber-1;
    }

    public void PlayRound()//(Stankowski Marcin)
    {
        System.out.println("\t\t\t\tROUND\033[0;31m\n"+
                "\t\t\t  ▄███▄███▄\n" +
                "\t\t\t  ███\033[0m "+ Game.roundNumber +" \033[0;31m███\n" +
                "\t\t\t   ▀█████▀ \n" +
                "\t\t\t     ▀█▀\033[0m");

        Shot.TryShot(playerShooted, enemyMap);

        Shot.EnemySmartShot(playerMap);


        roundNumber++;
    }

    public void PlayGame()//(Dąbkowski Marek)
    {
        System.out.println("\t\t\t<ENEMY MAP>");
        enemyMap = Ships.randomShipsOnMap(enemyMap);

        System.out.println("\t\t\t<PLAYER MAP>");
        playerMap = Ships.randomShipsOnMap(playerMap);

        while(Ships.AnyShipExist(playerMap) && Ships.AnyShipExist(enemyMap)){
            PlayRound();
        }
        if(!Ships.AnyShipExist(playerMap)){
            Statystyki.Save("Computer");
            System.out.println("Computer won the game!");
        }
        else if(!Ships.AnyShipExist(enemyMap))
        {
            Statystyki.Save("Player");
            System.out.println("Player won the game!");
        }
    }
}
