package sn.objis.calcul;

import junit.framework.TestCase;

public class CalculMetierTest extends TestCase{

	private CalculMettier calcul;
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		calcul = new CalculMettier();
	}
	
	public void testSomme()
	{
		assertTrue(calcul.somme(6, 9) == 15);
	}
	
	public void testProduit()
	{
		assertTrue(calcul.produit(6, 9) == 54);
	}
}
