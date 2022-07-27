package com.muhammet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public class Runner_IO {
	static String fileName = "C:\\LogDosyasi\\hata.log";
	static String mesaj= null;
	
	public static void main(String[] args) {

		try {
			int i=0;
			int t = 0;
			int sonuc = t/i;
		}catch(Exception ex) {
			try {
				FileOutputStream fl = new FileOutputStream(fileName);
				ObjectOutputStream oj = new ObjectOutputStream(fl);
				oj.writeObject(new Log(ex.toString(),System.currentTimeMillis(),
						"RunnerIO","main"));
				oj.close();
				/*
				File file = new File(fileName);
				BufferedWriter bf = new BufferedWriter(new FileWriter(file,true));
				bf.append(ex.toString()+" : "+System.currentTimeMillis()
				+" : RunnerIO : main : ");
				bf.newLine();
				bf.close();
				*/
			}catch (Exception e) {
				System.out.println("Beklenmeyen sorun.");
			}
		}


	}

}
