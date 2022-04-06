package com.cat.math1.objects;

import com.cat.math1.services.DoubleFormatter;

public class AnswerSingle {
    public double x;
    public int iterations;

    public AnswerSingle(double x, int iterations) {
        this.x = x;
        this.iterations = iterations;
    }

    @Override
    public String toString() {
        return "x = " + DoubleFormatter.format(x) + " in " + iterations + " iterations.";
    }
}
