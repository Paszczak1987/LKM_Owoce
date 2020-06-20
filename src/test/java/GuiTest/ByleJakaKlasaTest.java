package GuiTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ByleJakaKlasaTest {
	
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


