
/**
 *Test terrain classes
 *
 * @author K. Laurie
 * @version 3/13/2020
 */
public class TerrainTester
{
    public static void main(String[] args)
    {
        Forest forest = new Forest(200, 300, 100);
        Mountain mount = new Mountain(400, 200, 30);
        WinterMountain wMount = new WinterMountain(200, 300, 28, 23.2);
        
        //print data
        System.out.printf("Forest %s and %s\n", forest.terrainSize(), forest.getTrees());
        System.out.printf("Mountain %s and %s\n", mount.terrainSize(), mount.getMountains());
        System.out.printf("Winter Mountain %s and %s and %s", wMount.terrainSize(), wMount.getMountains(), wMount.getTemp());
        
    }
}
