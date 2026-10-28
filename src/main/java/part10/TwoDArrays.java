package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6651s
//        starts at 1:50:51 — stop at about 1:57:41, at "so that is the basics of 2D arrays"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 10 — 2D arrays (an array of arrays: rows and columns)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrays.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// This creates TwoDArrays class that holds my program
public class TwoDArrays {
    //This is where my program starts running.
    public static void main(String[] args) {
        // This creates a 2D array to organize my cars into rows and columns.
        String[][] cars = {
                {"Camero", "Corvette", "Sliverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}
        };
        // This loop goes through each row of cars in my 2D array
        for (int i = 0; i < cars.length; i++) {
            // This moves the next row of cars to a new line.
            System.out.println();
            // This loop goes through each car in the current row
            for (int j = 0; j < cars[1].length; j++) {
                // This prints each car name with a space between them.
                System.out.print(cars[i][j] + " ");
            }
        }

    }
}
