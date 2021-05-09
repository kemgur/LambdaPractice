package Day01;

import java.util.ArrayList;
import java.util.List;

/*
 1) Lambda "Functional Programing" olarak adlandirilir. Uygun methodu bulup kullanmaktan ibartttir
    Functional: Fonksion demektir. Programlama dillerinde function, programin is yapan kisimlarina denir.
 2) Java function yerine method kullanir.   
 3) "Functional Programing" ise method kullanma programlama dili demektir.
 
 4) "Structured Programing" de "Ne yaparim?"dan cok "Nasil yaparim?"  dusunulur
 	  "Functional Programing" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur
     "Functional Programing" hiz, kod kisaligi, kod okunabilirligi ve hatasiz kode yazma acilarindan faydalidir.
 5) Lambda sadecee collection(list, queue , set)'larda ve array'lerde kullanilir. Map lerde kullanilmaz.
     
 */
public class Lambda01 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		printElStructured(list);//parametreyi oaranteze ekliyoruz
		System.out.println();
		printElFunctional1(list);
		System.out.println();
		printElFunctional2(list);
		System.out.println();
		printElFunctional3(list);//1291346241215
		System.out.println();
		printElStructured1(list);//12 4 6 2 4 12 
		System.out.println();
		printCiftElFunctional1(list);//12 4 6 2 4 12 
		System.out.println();
		printCiftElFunctional2(list);//12 4 6 2 4 12 
		System.out.println();
		printKucukOnTekFunctional(list);//9 
		System.out.println();
		printOndanKucukVeyaTekFunction(list);//12 9 4 6 2 4 12 
		
	}
	
	//"Structured Programing" ile List elemanlarinin tamamini ayni satirda aralarinda bosluk birakarak console yazdirirn
	public static void printElStructured(List<Integer> list) {//List i parametre olarak aliyor
	for(Integer w:list) {
		System.out.print(w+" ");
	}
	
	}
	
	//"Functional Programing" ile List elemanlarinin tamamini ayni satirda aralarinda bosluk birakarak console yazdirirn
	public static void printElFunctional1(List<Integer> list) {
	//Lambda expression ile cozum: Bu cozum cok tavsiye edilmez cunku lambda expressin kullandik.	
		list.stream().forEach(t-> System.out.print(t +" "));// "t" bir variable ismidir.
		//forEach'ten sonraki parantez icersindeki bolume "Lambda expression"(lambda ifadesi) denir.
	}
	//Method Reference kendi olusturdugum method ile ==> Class ismi :: Method ismi 
	//Method Reference ==> Class Ismi :: Method ismi
	public static void printEl(int t) {
		System.out.print(t+" ");
	}

	public static void printElFunctional2(List<Integer> list) {
		list.stream().forEach(Lambda01::printEl);
	}
	
	
   //Method Reference Java'nin olusturdugu method ile..
    public static void printElFunctional3(List<Integer> list) {
	list.stream().forEach(System.out::print);
   }

  //"Structured Programing" ile cift sayi olan List elemanlarinin tamamini 
    //ayni satirda aralarinda bosluk birakarak console yazdirirn
    public static void printElStructured1(List<Integer> list) {//List i parametre olarak aliyor
    	for(Integer w:list) {
    		if(w%2==0) {
    			System.out.print(w+" ");
    		}
    	   }
    	
    	}
  //"Funtional Programing" ile cift sayi olan List elemanlarinin tamamini 
    //ayni satirda aralarinda bosluk birakarak console yazdirin
    //Lambda Expression
    public static void printCiftElFunctional1(List<Integer> list) {
    	list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));//12 4 6 2 4 12 
    	
    }
    
    //Method Reference ile
    public static boolean isCift(int t) {
    	return t%2==0; //return type "Void" den farkli ise "return" keyword unu kullaniriz
    }
    //Ustteki methodu alttaki methotdan cagiracagiz(Method reference)
    public static void printCiftElFunctional2(List<Integer> list) {
    	list.stream().filter(Lambda01::isCift).forEach(Lambda01::printEl);//12 4 6 2 4 12 
    	
    }
    //"Functional Programing" ile 10'dan kucuk ve tek sayi olan list elementlerini tamamini ayni satirda
    //aralarina bosluk birakarak yazdirin
    public static void printKucukOnTekFunctional(List<Integer> list) {
    	list.stream().filter(t->t%2!=0 && t<10).forEach(Lambda01::printEl);
    	
    }
    //"Functional Programing" ile 10'dan kucuk veya cift sayi olan list elementlerini tamamini ayni satirda
    //aralarina bosluk birakarak yazdirin
    public static void printOndanKucukVeyaTekFunction(List<Integer> list) {
    	list.stream().filter(t->t%2==0 || t<10).forEach(Lambda01::printEl);
    }
    
    
}



