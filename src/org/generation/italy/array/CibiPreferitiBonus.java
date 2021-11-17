package org.generation.italy.array;

public class CibiPreferitiBonus {

	public static void main(String[] args) {
		
		String[] cibiPreferiti = {"Pasta al forno" ,"Pizza", "Panino con Hamburger", "Sushi", "Cotoletta", "Scaloppine al limone", "Risotto allo zafferano"};
		
		System.out.println("La mia classifica contiene " + cibiPreferiti.length + " pietanze.");
		System.out.println("Il mio piatto top è: " + cibiPreferiti[0]);
		System.out.println("Il mio piatto preferito, ma non troppo è: " + cibiPreferiti[cibiPreferiti.length - 1]);
		
		System.out.println("Il piatto a metà classifica è: " + cibiPreferiti[(cibiPreferiti.length - 1) / 2]);

	}

}
