package com.jsbomb.noifcalculator.expressiontree.node;

/**
 * Created by seojohann on 11/3/16.
 * any input on calculator expression tree. it could be a number/operand or operator(+,-,*,/)
 */
public abstract class CalcTreeNode {
    protected CalcTreeNode mLeftOperand;
    protected CalcTreeNode mRightOperand;

    public abstract double evaluate();

    public void setLeftOperand(CalcTreeNode leftOperand) {
        mLeftOperand = leftOperand;
    }
    public void setRightOperand(CalcTreeNode rightOperand) {
        mRightOperand = rightOperand;
    }
    public CalcTreeNode getLeftOperand() {
        return mLeftOperand;
    }
    public CalcTreeNode getRightOperand() {
        return mRightOperand;
    }

    /**
     * string representation for the expression, operator, and operand
     * @return
     */
    public abstract String printToString();
}
