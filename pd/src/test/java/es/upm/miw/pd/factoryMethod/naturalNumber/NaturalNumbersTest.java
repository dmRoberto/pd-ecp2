package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumbersTest {

	private NaturalNumberManager manager;

	@Before
	public void init() {
		manager = new NaturalNumberManager();
	}

	@Test
	public void naturalManagerCreateNumberTest() {
		NaturalNumberCreator creator = new NaturalNumberCreatorEs();
		manager.setNumberCreator(creator);
		manager.createNumber(1);

		assertEquals(1, manager.getNaturalNumber().getValue());
		assertEquals("uno", manager.getNaturalNumber().getTextValue());

		manager.getNaturalNumber().setValue(2);
		assertEquals("dos", manager.getNaturalNumber().getTextValue());

		manager.getNaturalNumber().add(2);
		assertEquals("cuatro", manager.getNaturalNumber().getTextValue());

		creator = new NaturalNumberCreatorEn();
		manager.setNumberCreator(creator);
		manager.createNumber(1);

		assertEquals("one", manager.getNaturalNumber().getTextValue());
	}
}
