package edu.algos.problems.stepic;
/*
*
* The biologists group at the Bioinformatics Institute got a turtle.

After training the turtle learned to understand and remember instructions, which look like the following:
North 10
West 20
South 30
East 40
where the first word is a direction, in which the turtle should move, and the number after the word — the positive
*  distance in centimeters, which the turtle should pass.
Nevertheless, issuing commands is fast, but the turtle moves slowly.
* That is why programmers figured out that they could write a program
* that determines to where eventually the biologists will lead the turtle.
*  To do this, programmers ask you to write a program that outputs the point at which
* the turtle will arrive after performing all of the issued commands.
* For simplicity, they have decided to assume that the movement starts at the point (0, 0),
* and the movement to the east increases the first coordinate, to the north – the second one.

The program gets a number of commands 𝑛 as input, which should be performed by the turtle,
*  followed by the 𝑛 lines with the commands themselves. You need to output two numbers in the single line:
*  the first and the second coordinate of the final point for the turtle. All coordinates are integers.
*/

import java.util.Scanner;

public class Turtle {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    int numOfEvents;

    try (Scanner scanner = new Scanner(System.in)) {
      numOfEvents = scanner.nextInt();
      for (int i = 0; i < numOfEvents + 1; i++) {
        String s = scanner.nextLine();
        String[] line = s.split(" ");
        if (s.length() > 0) {
          DIRECTION direction = DIRECTION.valueOf(line[0].trim());
          int cord = Integer.parseInt(line[1].trim());

          switch (direction) {
            case East:
              x = x + cord;
              break;
            case West:
              x = x - cord;
              break;
            case North:
              y = y + cord;
              break;
            case South:
              y = y - cord;
              break;
          }
        }

      }
    }
    System.out.println(x + " " + y);
  }

  enum DIRECTION {
    North, // second +
    West, // first -
    South, // second -
    East // first +
  }

}
