import java.util.Arrays;
public class HammingDistance {

  public static void main (String cheese[]) {
    System.out.println(hammingDistance(1, 4));
  }

  public static int hammingDistance(int x, int y) {
    int[] x_binary = new int[32];
    int[] y_binary = new int[32];
    int i;
    for (i = 0; i < 32; i++) {
      x_binary[i] = 0;
      y_binary[i] = 0;
    }
    int total = 0;
    int array_position = 0;
    while (x != 0) {
      int remainder = x % 2;
      x_binary[array_position] = remainder;
      array_position++;
      x = x / 2;
    }
    array_position = 0;
    while (y != 0) {
      int remainder = y % 2;
      y_binary[array_position] = remainder;
      array_position++;
      y = y / 2;
    }
    for (i = 0; i < 32; i++) {
      if (x_binary[i] != y_binary[i])
        total = total + 1;
    }
    return total;
  }
}
