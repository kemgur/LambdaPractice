package Day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambda03 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(-13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(-12);
		list.add(15);
		
		ciftKareMax(list);

	}
	//Listteki cift sayi olan elemanlarin karelerini aliniz. En buyuk olanlarin karelerini consola yazdirin
	public static void ciftKareMax(List<Integer> list ) {
		
		Optional<Integer> max = list.stream().filter(Lambda01::isCift).map(t->t*t).reduce(Math::max);//reduce(Integer::max) i de kullanabiliriz
		
		System.out.println(max);//Optional[144]
	}

}
