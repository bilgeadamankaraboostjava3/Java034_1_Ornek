package com.muhammet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Runner {

	static String[] gunler;
	static int sayi;
	
	public static void main(String[] args) {
		/**
		 * Bir De�i�keni ba�latmak kullan�ma haz�r hale getirme.
		 */		
		biseylerYap();
		try {
			
			File file = new File("ornek.yml");			
			if(file.exists()) {
				BufferedWriter bf = new BufferedWriter(new FileWriter(file,true));
			bf.append("deneme");
			bf.newLine();
			bf.close();
			}else {
				throw new FileNotFoundException();
			}			
			
			int gun = Integer.parseInt("Sal�");
			System.out.println("1. g�n....: "+ gunler[10]);
		}catch (NullPointerException e) {
			System.out.println("G�nler dizisi Bo� olarak kullan�lmaktad�r.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ge�ersiz de�er girdiniz. [1-7] aras� bir de�er giriniz");
		}catch (NumberFormatException e) {
			System.out.println("Say� de�eri beklenirken s�zel bir ifade girilmi�tir. l�tfen say�sal de�er giriniz.");
		}catch (FileNotFoundException e) {
			System.out.println("��lem yap�lan dosya bulunamad�");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}//
	
	public static void biseylerYap() {
		gunler = new String[7];
	}
}//
