import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelephoneTest {

	@Test
	void testFormat() {
		
		//A successful use case - the class properly formats an apropriate input
		assertEquals("(123)456-7890", Telephone.format("1234567890"));

		//The class properly returns an inproper input
		assertEquals("4567890", Telephone.format("4567890"));

		//Failed test case - the class does not check for null arguments
		assertNull(Telephone.format(null));
	}

}
