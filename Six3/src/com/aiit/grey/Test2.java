package com.aiit.grey;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Computer> complistArrayList = new ArrayList<Computer>();
		complistArrayList.add(new Computer(CPU.Intel, GPU.NVIDIA, "����", 8600, "������"));
		complistArrayList.add(new Computer(CPU.AMD, GPU.INTEL, "ƻ��", 6488, "MacBook"));
		complistArrayList.add(new Computer(CPU.Intel, GPU.ATI, "����", 5699, "MacBook"));
		for (Computer computer : complistArrayList) {
			System.out.println(computer);
			

		}
	}

}
