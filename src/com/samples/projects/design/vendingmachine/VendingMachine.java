package com.samples.projects.design.vendingmachine;

public class VendingMachine {

	private int[] slots;

	public static final int SLOTS_PER_ROW = 5;

	public static final int MAX_PRODUCTS_PER_SLOT = 8;

	public VendingMachine(int rowCount) {
		slots = new int[rowCount * SLOTS_PER_ROW];
	}

	public int fill(int testSlot){
		int howManyAdded = MAX_PRODUCTS_PER_SLOT - slots[testSlot];
		slots[testSlot] = MAX_PRODUCTS_PER_SLOT;
		return howManyAdded;

	}

	public int fill(int testSlot, int quantity) {

		if (slots[testSlot] + quantity > MAX_PRODUCTS_PER_SLOT) {
			return 0;
		}
		slots[testSlot] += quantity;
		return quantity;

	}

	public void dispense(int testSlot, int quantity) {
		if (slots[testSlot] == 0) {
			throw new IllegalStateException("Slot is empty");
		}
		slots[testSlot] -= quantity;
	}

	public boolean isEmpty(int slot) {
		return slots[slot] == 0;
	}

	public int topUp(int slot) {
		return MAX_PRODUCTS_PER_SLOT;
	}

	public int getCurrentLevel(){
		return 0;
	}

}
