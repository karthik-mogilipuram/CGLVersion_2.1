import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class ConwaysTest {

	@Test
	public void InitialStateisDead()
	{
		Conways cell = new Conways();
		Assertions.assertEquals(cell.getState(),false);		
	}
}

