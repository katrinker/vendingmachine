package ru.gb.vending.market;

import ru.gb.vending.actor.Actor;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actorList);

    void releaseFromMarket(Actor actor);

    void update();
}
