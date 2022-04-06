package com.cat.math1.objects;

import com.cat.math1.services.DoubleFormatter;

public class AnswerPair {
    public double x;
    public double y;
    public int iterations;

    public AnswerPair(double x, double y, int iterations) {
        this.x = x;
        this.y = y;
        this.iterations = iterations;
    }

    @Override
    public String toString() {
        return "x = " + DoubleFormatter.format(x) + "; y = " + DoubleFormatter.format(y) + " in " + iterations + " iterations.";
    }
}
