package practice;
import java.util.List;

public class ApiPractice {
 /**
  * Finds the hypotenuse of a right triangle given sides a and b.
  * @param a Length of side a.
  * @param b Length of side b.
  * @return Length of hypotenuse.
  */
 public static double hypotenuse(double a, double b) {
     double hyp = Math.pow(a, 2) + Math.pow(b, 2);
     return Math.sqrt(hyp);
 }
 
 /**
  * Returns the greater of two values. If the values are exactly the same,
  * it returns one of them.
  * @param a First value.
  * @param b Second value.
  * @return Largest value.
  */
 public static double max(double a, double b) {
     if(a>b)
     return a;
     else if(b>a)
     return b;
     else
     return a;
 }
 
 /**
  * Returns the smaller of two values. If the values are exactly the same,
  * it returns one of them.
  * @param a First value.
  * @param b Second value.
  * @return Smallest value.
  */
 public static double min(double a, double b) {
     if(a<b)
     return a;
     else if(b<a)
     return b;
     else
     return a;
 }

 /**
  * Returns the lexicographically greater of two strings. If the values are
  * exactly the same, it returns one of them.
  * @param a First string.
  * @param b Second string.
  * @return Lexicographically greatest string.
  */
 public static String max(String a, String b) {
     int compare = a.compareTo(b);
     
     if(compare > 0)
     return a;
     else if(compare < 0)
     return b;
     else
     return a;
 }
 
 /**
  * Returns the lexicographically lesser of two strings. If the values are
  * exactly the same, it returns one of them.
  * @param a First string.
  * @param b Second string.
  * @return Lexicographically lesser string.
  */
 public static String min(String a, String b) {
     int compare = a.compareTo(b);
     
     if(compare < 0)
     return a;
     else if(compare > 0)
     return b;
     else
     return a;
 }
 
 /**
  * Compares two strings to see if they contain the same text.
  * @param a First string.
  * @param b Second string.
  * @return <code>true</code> if the strings contain the same text,
  * <code>false</code> otherwise.
  */
 public static boolean isSameText(String a, String b) {
     if(a.equals(b))
     return true;
     else
     return false;
 }
 
 /**
  * Returns the longest string (the string with the greatest number of
  * characters) out of three strings. If two or more strings have the same
  * number of characters, it returns the first one.
  * @param a First string.
  * @param b Second string.
  * @param c Third string.
  * @return String with the fewest characters.
  */
 public static String getLongestString(String a, String b, String c) {
  int aL = a.length();
  int bL = b.length();
  int cL = c.length();
  
  if(aL > bL)
  {
    if(aL > cL)
        return c;
    else if(aL < cL)
        return a;
    else
    return a;
  }
  else if(aL > cL)
  {
      if(aL > bL)
      return b;
      else if(aL < bL)
      return a;
      else
      return a;
  }
  else if(bL > cL)
  return c;
  else if(cL > bL)
  return b;
  else
  return a;
 }
 
 /**
  * Returns the shortest string (the string with the lowest number of 
  * characters) from a list of strings. If two or more strings have the
  * same number of characters, it returns the first one.
  * 
  * If the incoming list is <code>null</code> or contains zero strings, 
  * this method returns <code>null</code>.
  * 
  * @param list List of incoming strings.
  * @return String with the fewest characters.
  */
 public static String getShortestString(List<String> list) {
     String min = list.get(0);
     for(int i=1; i<list.size(); i++)
     if(list.get(i).length() < min.length())
     min = list.get(i);
     return min;
 }
 
 /**
  * Returns a substring of the incoming string that contains all of the 
  * characters leading up to, but not including, the comma found
  * in the string.
  * @param s A string with a comma somewhere inside of it.
  * @return The substring leading up to the comma.
  */
 public static String getStringBeforeComma(String s) {
  String sub;
  int comma = s.indexOf(",");
  
  sub = s.substring(0, comma);
  return sub;
 }
 
 /**
  * Returns a substring of the incoming string that contains all of the 
  * characters after the comma found inside the string.
  * @param s A string with a comma somewhere inside of it.
  * @return The substring after the comma.
  */
 public static String getStringAfterComma(String s) {
  int comma = s.indexOf(",");
  return s.substring(comma);
 }
}
