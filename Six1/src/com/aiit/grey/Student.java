package com.aiit.grey;

public class Student {
	Teacher teacher;

	public Student() {

	}

	public Student(Teacher tea) {
		teacher = tea;
	}

	public void show() {
		System.out.println("ÊÚ¿ÎÀÏÊ¦" + teacher.name);
	}
}
