public class JewelsAndStones {

  public static void main(String cheese[]) {
    System.out.println(numJewelsInStones("aA", "aAAbbbb"));
  }

  public static int numJewelsInStones(String J, String S) {
  int i, j;
  char jewel, stone;
  int total = 0;
  for (i = 0; i < J.length(); i++) {
    jewel = J.charAt(i);
    for (j = 0; j < S.length(); j++) {
      stone = S.charAt(j);
      if (jewel == stone) {
        total = total + 1;
      }
    }
  }
  return total;
  }
}
