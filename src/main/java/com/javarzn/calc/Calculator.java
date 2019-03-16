package com.javarzn.calc;

/**
 * Пример приложения "Калькулятор".
 */
public class Calculator {
    /**
     * Сложение.
     *
     * @param n1 слагаемое
     * @param n2 слагаемое
     * @return сумма
     */
    public long summarize(long n1, long n2) {
        return n1 + n2;
    }

    /**
     * Вычитание.
     *
     * @param n1 уменьшаемое
     * @param n2 вычитаемое
     * @return разность
     */
    public long subtract(long n1, long n2) {
        return n1 - n2;
    }

    /**
     * Умножение.
     *
     * @param n1 первый множитель
     * @param n2 второй множитель
     * @return произведение
     */
    public long multiply(long n1, long n2) {
        return n1 * n2;
    }

    /**
     * Деление.
     *
     * @param n1 делимое
     * @param n2 делитель
     * @return частное
     */
    public long divide(long n1, long n2) {
        return n1 / n2;
    }

    public double sqrt(long n){ return Math.sqrt(n);}

    public double pow(long n1, long n2){
        return Math.pow(n1, n2);
    }

    public double sin(long n){
        return Math.sin(n);
    }
    public double cos(long n){
        return Math.cos(n);
    }
    public double tan(long n){
        return Math.tan(n);
    }
}





