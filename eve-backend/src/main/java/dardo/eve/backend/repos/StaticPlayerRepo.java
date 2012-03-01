package dardo.eve.backend.repos;

import org.springframework.stereotype.Repository;

@Repository
public class StaticPlayerRepo implements PlayerRepo {

	public String findPlayer() {
		return " is a player";
	}

}
