package GuiTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.*;


public class Test {
	
	List<String> lista = new ArrayList<String>();
	
	
	@Before
	 public void setUp() throws Exception {
        lista.add("Ogorek");
    }
	
	@After
    public void tearDown() throws Exception {
    }
	
	@Test
	public void test() {
		
		for(String owoc : lista) {
			if(owoc.equals("Ogorek")) {
				System.out.println(true);
				return;
			}			
		}
		System.out.println(false);		
	}
}


//@Test
//public void testPrintList() {
//    String expected = "ONE";
//    ArrayList<String> actual = alp.printList(myList);
//    assertEquals("not the correct list", expected, actual);
//}