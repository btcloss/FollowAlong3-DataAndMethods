package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s
//        starts at 1:43:42 — stop at about 1:49:45, at "so that's what an array is"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 10 — arrays (many values in one variable)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayBasics.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

// This creates the ArrayBasics class that holds my program
public class ArrayBasics {
    // This starts my program and runs the code inside it.
    public static void main(String[] args) {
        // This makes an array that can hold 3 car names.
        String[] cars = new String[3];
        // This puts the first car name in spot 0 of my array.
        cars[0] = "Camero";
        // This puts Corvette in the second spot of my array.
        cars[1] = "Corvette";
        // This puts Tesla in the third spot of my array
        cars[2] = "Tesla";
        // This loop goes through each car in my array
        for (int i = 0; i < cars.length; i++) {
            // This prints each car name from my array
            System.out.println(cars[i]);
        }
    }
}

