import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	public void shouldBeAbleToCreateAccount() throws Exception {
		new Account(1);
	}

	@Test
	public void shouldNotBeAbleToCreateWithWrongParameters() throws Exception {
		assertThrows(IllegalArgumentException.class, () ->  {
			new Account(0);
		}); 
	}
	
	
}
