package com.cat.math1.objects;

import com.cat.math1.services.DoubleFormatter;

public class AnswerPair {
    public double x;
    public double y;

    public AnswerPair(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + DoubleFormatter.format(x) + "; y = " + DoubleFormatter.format(y);
    }
}
