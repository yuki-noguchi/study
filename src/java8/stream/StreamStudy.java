package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamStudy {

	private List<String> fruits = new ArrayList<>();

	public StreamStudy() {
		fruits.add("りんご");
		fruits.add("ばなな");
		fruits.add("パイナップル");
	}

	public List<String> getFruits() {
		return fruits;
	}
}
