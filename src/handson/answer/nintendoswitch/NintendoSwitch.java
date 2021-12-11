package handson.answer.nintendoswitch;

import java.util.ArrayList;
import java.util.List;

public class NintendoSwitch {

	List<Gamesoft> gameSofts = new ArrayList<>();

	public void install(Gamesoft soft) {
		gameSofts.add(soft);
	}

	public List<Gamesoft> getGameSofts() {
		return gameSofts;
	}
}
