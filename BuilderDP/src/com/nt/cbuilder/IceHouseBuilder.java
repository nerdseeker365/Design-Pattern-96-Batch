package com.nt.cbuilder;

import com.nt.builder.HouseBuilder;
import com.nt.product.ConcreateRoof;
import com.nt.product.ConcreteBasement;
import com.nt.product.ConcreteStructure;
import com.nt.product.House;
import com.nt.product.IceBasement;
import com.nt.product.IceInterior;
import com.nt.product.IceRoof;
import com.nt.product.IceStructure;
import com.nt.product.MarbleInterior;
import com.nt.product.WoodenBasement;
import com.nt.product.WoodenInterior;
import com.nt.product.WoodenRoof;
import com.nt.product.WoodenStructure;

public class IceHouseBuilder implements HouseBuilder {
	private House house;
	
	public IceHouseBuilder(House house) {
		this.house=house;
	}

	@Override
	public void buildBasement() {
	    house.setBasement(new IceBasement());
	}

	@Override
	public void buildStructure() {
		house.setStructure(new IceStructure());
	}

	@Override
	public void buildRoof() {
		house.setRoof(new IceRoof());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new IceInterior());
	}

	@Override
	public House createHouse() {
		return house;
	}

}
