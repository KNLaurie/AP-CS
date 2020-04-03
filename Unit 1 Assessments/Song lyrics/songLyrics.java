
/**
 * Prints the lyrics of twinkle twinkle little star using string variables
 *
 * @Kaitlyn Laurie
 * @10/8/2019
 */
public class songLyrics
{
    public static void main(String [ ] args)
    {
        String title = "Twinkle, Twinkle Little Star";           // string variable with song title
        String authorDate = "      Jane Taylor, 1806      ";
        String verse1 = "Twinkle, twinkle, little star,\n" +
                         "How I wonder what you are. \n" +
                         "Up above the world so high,\n " +
                         "Like a diamond in the sky.";           //string variable with first verse
                        
        String verse2 = "When the blazing sun is gone,\n" +
                        "When he nothing shines upon,\n" +
                        "Then you show your little light,\n" +
                        "Twinkle, twinkle, all the night.";      //string variable of second verse

        String chorus = "   Twinkle, twinkle, little star,\n" +
                        "   How I wonder what you are!";         //string variable of chorus
        
        //print statements of songs
        System.out.println(title);
        System.out.println(authorDate);
        System.out.println("***************************");
        System.out.println(verse1);
        System.out.println(chorus);
        System.out.println(" ");
        System.out.println(verse2);
        System.out.print(chorus);
    }


}
