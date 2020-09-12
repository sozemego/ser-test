package com;

import java.io.Serializable;

public class Player implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private String heroClass;
	private int health;

	private int level;

	private int attack;

	private int weapon;

	private int defense;

	private int armor;

	private int experience;

	public Player(String name, String heroClass) {
		this.name = name;
		this.heroClass = heroClass;

		if (heroClass.equals("Warrior")) {
			this.attack = 5;
			this.defense = 5;
			this.health = 5;
		} else if (heroClass.equals("Rogue")) {
			this.attack = 8;
			this.defense = 3;
			this.health = 4;
		} else if (heroClass.equals("Knight")) {
			this.attack = 3;
			this.defense = 6;
			this.health = 6;
		}
	}

	public Player() {
	}

	@Override
	public String toString() {
		return "\n\nYOUR HERO:\nName: " + name + "\nClass: " + heroClass + "\n\nSTATS: " + "\nAttack: " + attack
				+ "\nDefense: " + defense + "\nHit Points: " + health + "\n\nEquipment:\n" + "Armor: " + armor + "\nWeapon: "
				+ weapon + "\nLevel: " + level + "\nExperience: " + this.experience;
	}
}