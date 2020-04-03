/**
 * Test classes
 * 
 * @author K. Laurie 
 * @version 3/18/2020
 */
public class Test2
{
	public static void main(String []args)
	{
           Rectangle2 one = new Rectangle2(5, 20);
           Rectangle2 four = new Rectangle2(5, 20);
           
           Box2 two = new Box2(4, 10, 5);
           Box2 five = new Box2(4, 10, 5);
           
	   Cube three = new Cube(3);
	 
	   showEffectBoth(one);
	   showEffectBoth(two);
	   showEffectBoth(three);
	   
	   System.out.println(one.equals(four));
	   System.out.println(two.equals(five));
	   System.out.println(two.equals(three));
	 }
	 
	 public static void showEffectBoth(Rectangle2 r)
	 {
	     System.out.println(r);
	 }
}