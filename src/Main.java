import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_3b.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String s = br.readLine();

        int horisontalPositionSanta = 0;
        int verticalPositionSanta = 0;

        int horisontalPositionRobot = 0;
        int verticalPositionRobot = 0;

        List<String> listOfPositions = new ArrayList<>();
        Set<String> setOfPositions = new HashSet<>();

        listOfPositions.add( horisontalPositionSanta + " " + verticalPositionSanta);
        setOfPositions.add( horisontalPositionSanta + " " + verticalPositionSanta);

        listOfPositions.add( horisontalPositionRobot + " " + verticalPositionRobot);
        setOfPositions.add( horisontalPositionRobot + " " + verticalPositionRobot);

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(i % 2 == 0){
                if(ch == '<'){
                    horisontalPositionSanta -= 1;
                    listOfPositions.add( horisontalPositionSanta + " " + verticalPositionSanta);
                    setOfPositions.add( horisontalPositionSanta + " " + verticalPositionSanta);
                }
                else if(ch == '>'){
                    horisontalPositionSanta += 1;
                    listOfPositions.add( horisontalPositionSanta + " " + verticalPositionSanta);
                    setOfPositions.add( horisontalPositionSanta + " " + verticalPositionSanta);
                }
                else if (ch == 'v'){
                    verticalPositionSanta -= 1;
                    listOfPositions.add( horisontalPositionSanta + " " + verticalPositionSanta);
                    setOfPositions.add( horisontalPositionSanta + " " + verticalPositionSanta);
                }
                else if(ch == '^'){
                    verticalPositionSanta += 1;
                    listOfPositions.add( horisontalPositionSanta + " " + verticalPositionSanta);
                    setOfPositions.add( horisontalPositionSanta + " " + verticalPositionSanta);
                }
            }
            else {
                if(ch == '<'){
                    horisontalPositionRobot -= 1;
                    listOfPositions.add( horisontalPositionRobot + " " + verticalPositionRobot);
                    setOfPositions.add( horisontalPositionRobot + " " + verticalPositionRobot);
                }
                else if(ch == '>'){
                    horisontalPositionRobot += 1;
                    listOfPositions.add( horisontalPositionRobot + " " + verticalPositionRobot);
                    setOfPositions.add( horisontalPositionRobot + " " + verticalPositionRobot);
                }
                else if (ch == 'v'){
                    verticalPositionRobot -= 1;
                    listOfPositions.add( horisontalPositionRobot + " " + verticalPositionRobot);
                    setOfPositions.add( horisontalPositionRobot + " " + verticalPositionRobot);
                }
                else if(ch == '^'){
                    verticalPositionRobot += 1;
                    listOfPositions.add( horisontalPositionRobot + " " + verticalPositionRobot);
                    setOfPositions.add( horisontalPositionRobot + " " + verticalPositionRobot);
                }
            }

        }

//        for(String g : listOfPositions){
//            System.out.println(g);
//        }

        System.out.println("Number of visiting: " + listOfPositions.size());

        System.out.println("Number of visited houses: " + setOfPositions.size());

//        for(String g : setOfPositions){
//            System.out.println(g);
//        }
    }
}