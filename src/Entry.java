import Utils.promptGenerator;
public class Entry {
    public static String[][] map;
    public static void main(String[] args){
        promptGenerator pg = new promptGenerator();
        int currX = 0;
        int currZ = 0;
        while(true){
            currX = Integer.valueOf(pg.getInput("X:"));
            currZ = Integer.valueOf(pg.getInput("Z:"));
            map[currX][currZ] = pg.getInput("What do you set this to be");
            System.out.println(map[currX - 1][currZ + 1] + "|" + map[currX][currZ + 1] + "|" + map[currX + 1][currZ + 1] + "\n" + "--------------------------------------------------------------------\n "
                     + map[currX - 1][currZ ] + "|" + map[currX][currZ] + "|" + map[currX + 1][currZ ] + "\n" + "--------------------------------------------------------------------\n "
                     + map[currX - 1][currZ - 1] + "|" + map[currX][currZ - 1] + "|" + map[currX + 1][currZ - 1]);

        }

    }

    public void runGame(){

    }
}
