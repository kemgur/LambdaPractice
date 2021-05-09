package Day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambda02 {

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
		
		kareCiftFunction(list);//144 16 36 4 16 144 
		System.out.println();
		tekKupunBirFazlasiFunction(list);//730 2198 3376 
		System.out.println();
		kareKokCiftFunction(list);
		System.out.println();
		maxkElFunction(list);//Optional[15]

	}

	//Cift sayi olan elemanlarin karelerini ayni satirda aralarina bosluk birakarak consola yazdirin
	public static void kareCiftFunction(List<Integer> list) {
		list.stream().filter(Lambda01::isCift).map(t->t*t).forEach(Lambda01::printEl);
		
		//map() methodu elemanlari degistirmek istedigimiz zaman kullanilir.(karesini alma vb)
	}
	//Tek sayi olan elemanlarin kupunun bir fazlasini ayni satirda aralarina bosluk birakarak consola yazdirin
	public static void tekKupunBirFazlasiFunction(List<Integer> list) {
		list.stream().filter(t->t%2!=0).map(t->t*t*t+1).forEach(Lambda01::printEl);
		
	}
	//Cift sayi olan elemanlarin kare kokunu "4 'un kare kokunu consolayazdirin
	public static void kareKokCiftFunction(List<Integer> list) {
		list.stream().filter(Lambda01::isCift).map(Math::sqrt).forEach(System.out::println);
	}
	
	//En buyuk elemani konsola yazdirin
	public static void maxkElFunction(List<Integer> list) {
		Optional<Integer> max =list.stream().reduce(Math::max);
		System.out.println(max);
		
		//reduce() eleman sayisini azaltip sadece bir elemani istedigimiz icin methodun adi boyle olmus
		//Bir cok datayi tek bir dataya donusturmek istedigimizde reduce() methodu kullanilir
		
	}
	
	
	
	
	
	
	
}
