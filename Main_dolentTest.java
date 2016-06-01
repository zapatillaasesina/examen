import static org.junit.Assert.*;

import org.junit.Test;

public class Main_dolentTest {



	@Test
	public void testNova_lletra() {
		
		Main_dolent.paraules[Main_dolent.index=3]="programació";
		assertTrue("Es true",Main_dolent.nova_lletra('p'));
		
	}

}
