import java.util.Optional;

public class Test{

	public static void main(String[] args) {
		var integerValue = Optional.<Integer>empty();


		integerValue	=	Optional.of(5);

//		if(integerValue.isPresent()) {
		integerValue.ifPresentOrElse(
				i -> System.out.println("This is the value:" + i),
				() -> System.out.println("No calculation")
		);
//		}else{
//			System.out.println("No value man");
//		}
	}
}