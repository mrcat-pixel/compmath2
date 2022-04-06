package com.cat.math1.methods;

import com.cat.math1.objects.Func;
import com.cat.math1.services.DoubleFormatter;

public class SecantMethod {

    public double calculate(Func function, double precision, double begin, double end, int iterationCount) {
        double newBegin = begin - (function.calcFunc(begin)/(function.calcFunc(end) - function.calcFunc(begin)) *
                (end - begin));
        double diff = Math.abs(function.calcFunc(newBegin));

        System.out.println("Iteration #" + iterationCount + "; x = " + DoubleFormatter.format(newBegin)
                + "; f(x) = " + DoubleFormatter.format(diff));

        if ( diff < precision ) return newBegin;
        if ( iterationCount > 50 ) {
            System.out.println("Exceeded the iteration limit.");
            return newBegin;
        }
        return calculate(function, precision, newBegin, end, iterationCount + 1);
    }
}
