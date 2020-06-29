package ex;

import java.util.ArrayList;

import FourUI.Connect;

public class practice1 {
	public static void main(String[] args) {
		Connect conn = new Connect();
		ArrayList<String> arr = conn.select("select * from departments", "hr", "hr", 4);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}

}
