public class ToLowerCase {

  public static void main(String cheese[]) {
    System.out.println(toLowerCase("LOVELY"));
  }

  public static String toLowerCase(String str) {
  int i;
  char a;
  String result = "";
  for (i = 0; i < str.length(); i++) {
    a = str.charAt(i);
    if (65 <= a && a <= 90) {
      a = (char) (a + 32);
    }
    result = result + String.valueOf(a);
  }
  return result;
  }
}
