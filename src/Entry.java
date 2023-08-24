import Utils.promptGenerator;
public class Entry {
    public static int mapWidth = 10;
    public static  int mapHeight = 10;
    public static void main(String[] args){
        String[][] map = new String[mapWidth][mapHeight];
        promptGenerator pg = new promptGenerator();
        int currX = 0;
        int currZ = 0;
        while(true){
            String input = pg.getInput();
            switch (input){
                case "w":
                    currZ -= 1;
                    break;
                case "s":
                    currZ += 1;
                    break;
                case "d":
                    currX += 1;
                    break;
                case "a":
                    currX -= 1;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            String output = "";
            for(int z = -1; z < 2; z++){
                output = output + "|";
                for(int x = -1; x < 2; x++){
                    if(currX + x > mapWidth || currX + x < 0 || currZ + z > mapHeight || currZ + z < 0) {
                        System.out.println("Rendered a wall");
                        output = output + "#" + "|";
                    }
                    else if(map[currX + x][currZ + z] != null){
                        output = output + map[currX + x][currZ + z] + "|";
                    }
                    else{
                        output = output + " " + "|";
                    }
                }
                output = output + "\n";
            }

            System.out.println(output);

        }

    }
}
