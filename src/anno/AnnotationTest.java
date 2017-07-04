package anno;

import java.util.List;

public class AnnotationTest {
	
	
	@SafeVarargs
	public AnnotationTest(List<String>... List) {
		
	}
	@SafeVarargs
	public static String test(List<String>...list) {
		return null;
	}
}
