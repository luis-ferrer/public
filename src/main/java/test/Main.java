package test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		System.out.println("hola");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

	}

}
