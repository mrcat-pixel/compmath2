package com.cat.math1.methods;

import com.cat.math1.objects.AnswerSingle;
import com.cat.math1.objects.Func;

public class TangentMethod {

    public AnswerSingle calculate(Func function, double precision, double approx, int iterationCount) {
        double newApprox = approx - ( function.calcFunc(approx)/function.calcDer(approx) );
        double diff = Math.abs(function.calcFunc(newApprox));

        if ( diff < precision || iterationCount > 50 ) return new AnswerSingle(newApprox, iterationCount);
        return calculate(function, precision, newApprox, iterationCount + 1);
    }

}
