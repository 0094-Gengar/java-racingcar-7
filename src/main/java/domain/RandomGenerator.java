package domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {

    public int randomGenerator() {
        return Randoms.pickNumberInRange(0, 9);
    }
}