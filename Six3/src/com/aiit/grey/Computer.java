package com.aiit.grey;

enum CPU {
	Intel, AMD

}

enum GPU {
	NVIDIA, ATI, INTEL

}

public class Computer {
	CPU cpu;
	GPU gpu;
	String brand;
	int price;
	String model;

	public Computer(CPU cpu, GPU gpu, String brand, int price, String model) {
		super();
		this.cpu = cpu;
		this.gpu = gpu;
		this.brand = brand;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", gpu=" + gpu + ", brand=" + brand + ", price=" + price + ", model=" + model
				+ "]";
	}

	

}
