/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan44.hukumohm;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class IF110118008Latihan44HukumOhm {

	/**
	 * @param args the command line arguments
	 *
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Baterai a = new Baterai();
		Baterai bt = new Baterai(3,12);
		System.out.println("Kuat Arus : "+ bt.getKuatArus());
		System.out.println("Hambatan : "+ bt.getHambatan());
		System.out.println("Hasil Tegangan : "+ bt.hitungTegangan());	
		
	}
	
}
