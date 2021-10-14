package com.company;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

    int[] a = {1, 1, 3, 4, 5, 6, 6, 7, 78};

        DoubleFunction<Double> doubleFunction = x->{return x + 10;};




    }



    public static class Man{

    }

}


class MarginCalculator{
    public double calculateMargin(List<Trade> trades){
        return 0;
    }

    private double calculateMargin(Trade trade){
        return 0;
    }

}



class Trade{
    public double notional1;
}


class FxTrade extends Trade{
    public double notional2;
}

class FxSwap extends FxTrade{
    public double a, b;
}

class FxForward extends FxTrade{
    public double c;
}

class IrTrade extends Trade{
}

class IrSwap extends IrTrade{
    public double d;
}

class Option extends Trade{
}

 interface CalculateStrategy {
    double calculateMargin(Trade trade);
}

class CalculateMarginTrade implements CalculateStrategy {

    @Override
    public double calculateMargin(Trade trade){
        return trade.notional1;
    }
}

class CalculateMarginFxTrade implements CalculateStrategy {

    @Override
    public double calculateMargin(FxTrade fxTrade) {
        return fxTrade.notional1 / fxTrade.notional2;
    }
}