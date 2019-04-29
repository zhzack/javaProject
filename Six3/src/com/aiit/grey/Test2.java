package com.aiit.grey;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Computer> complistArrayList = new ArrayList<Computer>();
		complistArrayList.add(new Computer(CPU.Intel, GPU.NVIDIA, "联想", 8600, "拯救者"));
		complistArrayList.add(new Computer(CPU.AMD, GPU.INTEL, "苹果", 6488, "MacBook"));
		complistArrayList.add(new Computer(CPU.Intel, GPU.ATI, "联想", 5699, "MacBook"));
		for (Computer computer : complistArrayList) {
			System.out.println(computer);
			

		}
	}

}
