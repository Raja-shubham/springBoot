package Random;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;



public class Exam {

	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		Function<String,Integer> f=s->s.length();
		Consumer<String> c=z->System.out.println("yes");
		System.out.println(p.test(5));
		System.out.println(f.apply("dfghkj"));
		c.accept("dfg");;
	}

}
