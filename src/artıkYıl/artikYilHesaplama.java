package artıkYıl;

import java.util.Scanner;

public class artikYilHesaplama {

	public static void main(String[] args) {
		//  artik yil hesaplama programı 
		
		int yil ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Lütfen Artık Yil Hesaplayacağınız Yılı Giriniz ");
		yil = input.nextInt();
		
		  if (yil>0) {
	            if (yil%4==0) {
	                if (yil%100== 0){
	                    if (yil%400 == 0){
	                        System.out.println(yil+" Artık bir yıl!");
	                    }
	                    else {
	                        System.out.println(yil+" Artık bir yıl değil!");
	                    }
	                } else  {
	                    System.out.println(yil+" Artık bir yıl!");
	                }
	            } else{
	                System.out.println(yil+" Artık bir yıl değil!");
	            }
	        } else {
	            System.out.println("Hatalı bir değer girdiniz.");
	        }
	}

}
