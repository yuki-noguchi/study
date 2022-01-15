package handson.piyostream;

import java.util.Optional;

public class Hiyoko {

	private String name;

	private Gender gender;

	private Optional<String> nickName;

	public Hiyoko(String name, Gender gener) {
		this.name = name;
		this.gender = gener;
		this.nickName = Optional.empty();
	}

	public Hiyoko(String name, Gender gener, String nickName) {
		this.name = name;
		this.gender = gener;
		this.nickName = Optional.of(nickName);
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public Optional<String> getNickName() {
		return nickName;
	}
}