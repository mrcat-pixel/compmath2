package com.cat.math1.methods;

import com.cat.math1.objects.AnswerSingle;
import com.cat.math1.objects.Func;

public class SecantMethod {

    public AnswerSingle calculate(Func function, double precision, double begin, double end, int iterationCount) {
        double newBegin = begin - (function.calcFunc(begin)/(function.calcFunc(end) - function.calcFunc(begin)) *
                (end - begin));
        double diff = Math.abs(function.calcFunc(newBegin));

        if ( diff < precision ||iterationCount > 50 ) return new AnswerSingle(newBegin, iterationCount);
        return calculate(function, precision, newBegin, end, iterationCount + 1);
    }
}
