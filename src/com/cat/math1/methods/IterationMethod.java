package com.cat.math1.methods;

import com.cat.math1.objects.AnswerPair;
import com.cat.math1.objects.EqSystem;

public class IterationMethod {

    public AnswerPair calculate(EqSystem system, double precision, double x, double y, int iterationCount) {
        double newX = system.x1(y);
        double newY = system.y2(x);

        double diffX = Math.abs(newX - x);
        double diffY = Math.abs(newY - y);

        if ((diffX < precision && diffY < precision) || iterationCount > 50)
            return new AnswerPair(newX, newY, iterationCount);

        return calculate(system, precision, newX, newY, iterationCount + 1);

    }
}
