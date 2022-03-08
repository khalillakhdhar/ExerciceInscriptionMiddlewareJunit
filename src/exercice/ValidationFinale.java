package exercice;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ValidationFinale {

	ValidateUsers vu;
	@Before
	public void initialiser()
	{
		vu=new ValidateUsers();
	}
	@Test
	public void validateNom()
	{
		assertTrue(vu.verifNom("mon nom"));
	}
	@Test
	public void validateEmailAt()
	{
		assertTrue(vu.testAtEmail("local@gmail.com"));
	}
	@Test
	public void verifPasswordExist()
	{
		assertTrue(vu.VerifExistancePassword("administrateur", "users"));
		
	}
}
