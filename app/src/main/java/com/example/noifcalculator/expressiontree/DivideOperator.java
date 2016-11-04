package com.example.noifcalculator.expressiontree;

import android.util.Log;

/**
 * Created by seojohann on 11/3/16.
 */

public class DivideOperator extends OperatorMultDivide {
    public DivideOperator() { }

    @Override
    public double evaluate() {
        double left = mLeftOperand.evaluate();
        double right = mRightOperand.evaluate();
        double answer = left / right;
        Log.d("jsbomb", "left(" + left + ") / right("+ right + ") = " + answer);
        return answer;
    }
}
