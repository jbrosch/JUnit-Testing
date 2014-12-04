package main;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Testing {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public final void test() {
		
		Person personA = new Person("John","Doe",UUID.randomUUID());
		Truck truck1 = new Truck("Tahoe","blue",345.67, personA,2);
		Person personB = new Person("Jane","Dorn",UUID.randomUUID());
		truck1.transferOwnership(personB);
		Person owner = truck1.getOwner();
		
		assertEquals("This should pass",personB, owner);
	}

}
