package com.bilisimegitim.utilprj.sayısalloto.test;

import com.bilisimegitim.utilprj.sayısalloto.SayisalLoto;

public class SayisalLotoTest {

	public static void main(String[] args) {
		
         SayisalLoto loto=new SayisalLoto();

int [] sayilar=loto.arrayOlustur();

for (int i = 0; i < sayilar.length; i++) {
	
	System.out.println(sayilar[i]);
	
	
	
}


	}

}
