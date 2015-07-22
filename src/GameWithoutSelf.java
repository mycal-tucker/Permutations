/**
 * Created by Mycal on 7/22/2015.
 *
 * Exactly like Game object, but has the additional requirement
 * that at no point will a player be assigned to give himself a
 * gift.
 */
public class GameWithoutSelf extends Game {

    public GameWithoutSelf(int numPlayers) {
        super(numPlayers);
    }

    /**
     * Overrides Game.scramble() by not allowing self loops
     */
    @Override
    public void scramble() {

    }
}
