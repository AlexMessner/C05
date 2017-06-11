package amessner;

import org.junit.*;
import java.awt.*;

public class AutoTest {
	Auto a;
	Auto b;
	@Before
	public void before(){
		a= new Auto("Mercedes",Color.WHITE,150);
		b=new Auto();
	}
	@Test
	public void test01(){
		Assert.assertEquals("Mercedes", a.getType());
	}
	@Test
	public void test02(){
		Assert.assertEquals(Color.WHITE, a.getFarbe());
	}
	@Test
	public void test03(){
		Assert.assertEquals(150, a.getLeistung());
	}
	@Test
	public void test04(){
		b.setFarbe(Color.RED);
		Assert.assertEquals(Color.RED, b.getFarbe());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test05(){
		b.setLeistung(0);
		Assert.assertEquals(0, b.getLeistung());
	}
	@Test
	public void test06(){
		b.setFarbe(Color.GREEN);
		Assert.assertEquals(Color.GREEN, b.getFarbe());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test07(){
		b.setFarbe(null);
	}
	@Test
	public void test08(){
		b.setType("Porsche");
		Assert.assertEquals("Porsche", b.getType());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test09(){
		b.setType("");
	}
	@Test
	public void test10(){
		a.toString();
	}
	@Test
	public void test11(){
		System.out.println(b);
	}
	@After
	public void after(){
		System.out.println("Test abgeschlossen");
	}

}
