package com.rodriguemouadeu.helpers;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HelperTest {

	// private static Helper helper;

	@Test
	public void testIsNotNull() {
		assertThat(new Helper(), is(notNullValue()));
	}
}
