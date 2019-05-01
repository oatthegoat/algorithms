public class ValidPalindrome {

  public static void main(String cheese[]) {
    System.out.println(isPalindrome("race a car"));
  }

  public static boolean isPalindrome(String s) {
  String lowercase = s.toLowerCase();
  String alphanumeric = "";
  for (int i = 0; i < lowercase.length(); i++) {
    char a = lowercase.charAt(i);
    if ((97 <= a && 122 >= a) || (48 <= a && 57 >= a)) {
      alphanumeric = alphanumeric + String.valueOf(a);
    }
  }
  int start = 0;
  int end = alphanumeric.length() - 1;
  while (start < end) {
    if (alphanumeric.charAt(start) != alphanumeric.charAt(end)) {
      return false;
    }
    start++;
    end--;
  }
  return true;
}
}
