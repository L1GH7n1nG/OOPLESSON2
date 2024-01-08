package FirstLessons.HOMEWORK.LESSON1OOP.HOMEWORKoopLESSON2.main;

import java.util.List;

public interface MarketBehaviour {
	void acceptToMarket(Actor actor);

	void releaseFromMarket(List<Actor> actors);

	void update();
}
