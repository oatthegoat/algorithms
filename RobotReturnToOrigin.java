public class RobotReturnToOrigin {

  public static void main(String cheese[]) {
    System.out.println(judgeCircle("UD"));
  }

  public static boolean judgeCircle(String moves) {
    int x_coordinate = 0;
    int y_coordinate = 0;
    for (int i = 0; i < moves.length(); i++) {
      if (moves.charAt(i) == 'U')
        y_coordinate++;
      if (moves.charAt(i) == 'D')
        y_coordinate--;
      if (moves.charAt(i) == 'R')
        x_coordinate++;
      if (moves.charAt(i) == 'L')
        x_coordinate--;
    }
    if (x_coordinate == 0 && y_coordinate == 0) {
      return true;
    }
    return false;
  }
}
