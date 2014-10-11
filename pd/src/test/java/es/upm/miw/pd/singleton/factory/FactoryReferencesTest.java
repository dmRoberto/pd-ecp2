package es.upm.miw.pd.singleton.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import es.upm.miw.pd.singleton.factory.FactoryReferences;

/**
 * The Class FactoryReferencesTest.
 */
public class FactoryReferencesTest {

	/**
	 * Test factory references is singleton.
	 */
	@Test
	public void testFactoryReferencesIsSingleton() {
		assertSame(FactoryReferences.getFactory(),
				FactoryReferences.getFactory());
	}

	/**
	 * Test factory references singleton not null.
	 */
	@Test
	public void testFactoryReferencesSingletonNotNull() {
		assertNotNull(FactoryReferences.getFactory());
	}

	/**
	 * Test factory references.
	 */
	@Test
	public void testFactoryReferences() {
		assertEquals(0, FactoryReferences.getFactory().getReference("cero"));
		assertEquals(1, FactoryReferences.getFactory().getReference("uno"));
		FactoryReferences.getFactory().removeReference("cero");
		assertEquals(2, FactoryReferences.getFactory().getReference("cero"));
	}
}
