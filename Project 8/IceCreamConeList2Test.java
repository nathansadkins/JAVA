import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**This class tests the IceCreamConeList2 class. */
public class IceCreamConeList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**test for get name method.*/
   @Test public void getNameTest() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[3];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals("IceCreamCone Test List", coneList.getName());
   }
   /**test for get number of cones method.*/
   @Test public void numberOfIceCreamConesTest() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[3];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(3, coneList.numberOfIceCreamCones()); 
   }
   /**test for number of ice cream cones method.*/
   @Test public void numberOfIceCreamConeZeroCase() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[0];
      // coneArray[0] = cone1;
      // coneArray[1] = cone2;
      // coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(0, coneList.numberOfIceCreamCones());
   }
   /**test for total surface area method.*/
   @Test public void totalSurfaceAreaTestZero() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[0];
      // coneArray[0] = cone1;
      // coneArray[1] = cone2;
      // coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(0.0, coneList.numberOfIceCreamCones(), 0.0001);
   }
   /**test for total surface area method.*/
   @Test public void totalSurfaceAreaTestDouble() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[3];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(449905.097, coneList.totalSurfaceArea(), 0.001); 
   }
   /**test for total volume method.*/
   @Test public void totalVolumeZero() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[0];
      // coneArray[0] = cone1;
      // coneArray[1] = cone2;
      // coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(0.0, coneList.totalVolume(), 0.0001);
   }
   /**test for total volume method.*/
   @Test public void totalVolumeTest() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[3];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = 
            new IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(18295116.588, coneList.totalVolume(), 0.001); 
   }
   /**test for average surface area method.*/
   @Test public void averageSurfaceAreaZero() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[0];
      // coneArray[0] = cone1;
      // coneArray[1] = cone2;
      // coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(0, coneList.averageSurfaceArea(), 0.0001);
   }
   /**test for average surface area method.*/
   @Test public void averageSurfaceArea() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[3];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(149968.366, coneList.averageSurfaceArea(), 0.01);
   }
   /**test for average surface area method.*/
   @Test public void averageVolumeZero() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[0];
      // coneArray[0] = cone1;
      // coneArray[1] = cone2;
      // coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(0, coneList.averageVolume(), 0.0001);
   }
/**test for average volume method.*/
   @Test public void averageVolumeT() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[3];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(6098372.196, coneList.averageVolume(), 0.01);
   }
   /**test for get getlist method.*/
   @Test public void getListTest() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[3];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertArrayEquals(coneArray, coneList.getList());
   }
   /**test for readfile method.
   *@throws FileNotFoundException - file not found 
   */
   @Test public void readfileTest() throws FileNotFoundException { 
      // IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      // IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      // IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      // IceCreamCone[] coneArray = new IceCreamCone[3];
      // coneArray[0] = cone1;
      // coneArray[1] = cone2;
      // coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", null, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      Assert.assertEquals("IceCreamCone Test List", coneList.getName());
   }
   /**test for get addIceCreamConeTest method.*/
   @Test public void addIceCreamConeTest() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      IceCreamCone cone = new IceCreamCone("test", 1, 1); 
      coneList.addIceCreamCone("test", 1, 1);
      Assert.assertEquals("test", cone.getLabel());
   }
    /**test for get findIceCreamCone method.*/
   @Test public void findIceCreamConeTest1() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(cone1, coneList.findIceCreamCone("Ex1")); 
   }
    /**test for get findIceCreamCone method.*/
   @Test public void findIceCreamConeTest2() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[3];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(null, coneList.findIceCreamCone("Exk1")); 
   }
    /**test for get deleteIceCreamCone method.*/
   @Test public void deleteIceCreamConeTest1() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[3];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(cone1, coneList.deleteIceCreamCone("Ex1"));
   }
    /**test for get deleteIceCreamCone method.*/
   @Test public void deleteIceCreamConeTest2() { 
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[3]; 
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      IceCreamCone foundNull = coneList.findIceCreamCone("Ex11"); 
      IceCreamCone test = coneList.deleteIceCreamCone("ex11");
      Assert.assertEquals(null, test);
   }
   /**test for get editIceCreamCone method.*/
   @Test public void editIceCreamConeTrue() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(true, coneList.editIceCreamCone("Ex1", 12, 12)); 
   }
   /**test for get editIceCreamCone method.*/ 
   @Test public void editIceCreamConeFalse() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[3]; 
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      IceCreamCone foundNull = coneList.findIceCreamCone("Ex11"); 
      IceCreamCone test = coneList.deleteIceCreamCone("ex11");
      Assert.assertEquals(false, coneList.editIceCreamCone("ex11", 12, 12));
   }
   /**test for get tostring method.*/
   @Test public void toStringTest() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      String coneListString = coneList.toString(); 
      Assert.assertEquals(coneListString, coneList.toString());
   }
   /**test for find ice cream cone smallest radius method.*/
   @Test public void findIceCreamConeWithShortestRadius() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(
         cone1, coneList.findIceCreamConeWithShortestRadius()); 
   }
   /**test for find ice cream cone smallest radius method.*/
   @Test public void findIceCreamConeWithShortestRadius2() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 0);
      Assert.assertEquals(null, coneList.findIceCreamConeWithLongestRadius()); 
   }
   /**test for find ice cream cone largest radius method.*/
   @Test public void findIceCreamConeWithLongestRadius() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(cone3, coneList.findIceCreamConeWithLongestRadius()); 
   }
  /**test for find ice cream cone largest radius method.*/

   @Test public void findIceCreamConeWithLongestRadius2() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 0);
      Assert.assertEquals(null, coneList.findIceCreamConeWithLongestRadius());
   }
   /**test for find ice cream cone smallest volume method.*/
   @Test public void findIceCreamConeWithSmallestVolume() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(cone1, coneList.findIceCreamConeWithSmallestVolume());
   }  
   /**test for find ice cream cone smallest volume method.*/
   @Test public void findIceCreamConeWithSmallestVolume2() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 0);
      Assert.assertEquals(null, coneList.findIceCreamConeWithSmallestVolume());
   }
   /**test for find ice cream cone largest volume method.*/
   @Test public void findIceCreamConeWithLargestVolume() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 3);
      Assert.assertEquals(cone3, coneList.findIceCreamConeWithLargestVolume());
   }  
   /**test for find ice cream cone largest volume method.*/
   @Test public void findIceCreamConeWithLargestVolume2() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 0);
      Assert.assertEquals(null, coneList.findIceCreamConeWithLargestVolume());
   }  
   /**test for summaryinfo method.*/
   @Test public void summaryInfoTest() {
      IceCreamCone cone1 = new IceCreamCone("Ex1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 2", 12.3, 25.5);
      IceCreamCone cone3 = new IceCreamCone("Ex 3", 123.4, 900);
      IceCreamCone[] coneArray = new IceCreamCone[4];
      coneArray[0] = cone1;
      coneArray[1] = cone2;
      coneArray[2] = cone3;
      IceCreamConeList2 coneList = new 
            IceCreamConeList2("IceCreamCone Test List", coneArray, 0);
      String coneListSum = coneList.summaryInfo();
      Assert.assertEquals(coneListSum, coneList.summaryInfo());
   }
}
   

