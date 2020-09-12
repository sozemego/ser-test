package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		createCharacter("name", "Rogue");
		Player player = loadPlayer("name");
		System.out.println(player);
	}

	public static void createCharacter(String name, String heroClass) {
		try {
			Player player = new Player(name, heroClass);
			System.out.println(player);

			FileOutputStream fos = new FileOutputStream("saves/heroes/" + name + ".ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(player);
			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Player loadPlayer(String name) {
		try {
			FileInputStream fis = new FileInputStream("saves/heroes/" + name + ".ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Player result = (Player) ois.readObject();
			ois.close();

			return (result);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (null);
	}

}
