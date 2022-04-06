package com.cat.math1.methods;

import com.cat.math1.objects.Func;
import com.cat.math1.services.DoubleFormatter;
import org.jetbrains.annotations.NotNull;

public class TangentMethod {

    public double calculate(@NotNull Func function, double precision, double approx, int iterationCount) {
        double newApprox = approx - ( function.calcFunc(approx)/function.calcDer(approx) );
        double diff = Math.abs(function.calcFunc(newApprox));

        System.out.println("Iteration #" + iterationCount + "; x = " + DoubleFormatter.format(newApprox)
                + "; f(x) = " + DoubleFormatter.format(diff));

        if ( diff < precision ) return newApprox;
        if ( iterationCount > 50 ) {
            System.out.println("Exceeded the iteration limit.");
            return newApprox;
        }
        return calculate(function, precision, newApprox, iterationCount + 1);
    }

}
