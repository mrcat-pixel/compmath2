package com.cat.math1.methods;

import com.cat.math1.objects.AnswerPair;
import com.cat.math1.objects.EqSystem;
import com.cat.math1.services.DoubleFormatter;

public class IterationMethod {

    public AnswerPair calculate(EqSystem system, double precision, double x, double y, int iterationCount) {
        double newX = system.x1(y);
        double newY = system.y2(x);

        double diffX = Math.abs(newX - x);
        double diffY = Math.abs(newY - y);

        System.out.println("Iteration #" + iterationCount +
                "; x = " + DoubleFormatter.format(newX) + "; y = " + DoubleFormatter.format(newY) +
                "; diffX = " + DoubleFormatter.format(diffX) + "; diffY = " + DoubleFormatter.format(diffY));

        if (iterationCount > 50) {
            System.out.println("Exceeded the iteration limit.");
            return new AnswerPair(newX, newY);
        }

        if (diffX < precision && diffY < precision)
            return new AnswerPair(newX, newY);

        return calculate(system, precision, newX, newY, iterationCount + 1);

    }
}
