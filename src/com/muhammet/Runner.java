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
		 * Bir Deðiþkeni baþlatmak kullanýma hazýr hale getirme.
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
			
			int gun = Integer.parseInt("Salý");
			System.out.println("1. gün....: "+ gunler[10]);
		}catch (NullPointerException e) {
			System.out.println("Günler dizisi Boþ olarak kullanýlmaktadýr.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Geçersiz deðer girdiniz. [1-7] arasý bir deðer giriniz");
		}catch (NumberFormatException e) {
			System.out.println("Sayý deðeri beklenirken sözel bir ifade girilmiþtir. lütfen sayýsal deðer giriniz.");
		}catch (FileNotFoundException e) {
			System.out.println("Ýþlem yapýlan dosya bulunamadý");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}//
	
	public static void biseylerYap() {
		gunler = new String[7];
	}
}//
