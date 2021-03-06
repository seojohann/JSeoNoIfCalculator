package com.jsbomb.noifcalculator.expressiontree.node;

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
        return answer;
    }

    @Override
    public String toString() {
        return printToString();
    }

    @Override
    public String printToString() {
        return mLeftOperand.printToString() + " / " + mRightOperand.printToString();
    }

    @Override
    public String getOperatorSign() {
        return " / ";
    }
}
