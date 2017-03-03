package com.samples.projects.design.vendingmachine;

import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matcher;
import org.junit.Test;

public class VendingMachinTest {
	public int testSlot;

	@Test
	public void should_be_able_to_add_products_to_sell() {
		VendingMachine popMachine = new VendingMachine(4);
		popMachine.fill(1, 3);
	}

	@Test
	public void should_instantiate_with_numberof_rows() {
		VendingMachine vendMachine = new VendingMachine(4);
		assertThat(vendMachine.isEmpty(0), is(true));
	}

	@Test
	public void slot_should_not_be_empty_when_product_is_added(){
		VendingMachine popMachine = new VendingMachine(3);
		popMachine.fill(2, 2);
		assertThat(popMachine.isEmpty(2), is(false));
	}


	@Test
	public void topUp_should_fill_an_empty_tray_to_capacity(){
		VendingMachine popMachine = new VendingMachine(3);
		int stockCount = 10;
		int itemsAddedToMachine = popMachine.topUp(1); // fill slot 1;
		assertThat(stockCount - itemsAddedToMachine, is(2));
	}


}
