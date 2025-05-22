package lld.cricbuzz.scoreupdaterobserver;

import lld.cricbuzz.innings.Ball;

public interface ScoreUpdaterObserver {
    void update(Ball ball);
}
