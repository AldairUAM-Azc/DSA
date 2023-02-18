package com.dsa.app;

public class Racional {
    int num;
    int den;
    
    public Racional(){
        this.num = 1;
        this.den = 1;
    }

    public  Racional(int num, int den){
        int divisor = gcd(num, den);
        this.num = num/divisor;
        this.den = den/divisor;
    }

    public Racional suma(Racional a){
        return new Racional(this.num*a.den + this.den*a.num, this.den*a.den).simplify();
    }
    
    public static Racional resta(Racional a, Racional b){
        return new Racional(a.num*b.den - a.den * b.num, a.den * b.den).simplify();
    }

    @Override
    public String toString() {
        return num + " / " + den;
    }

    private static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }

    private Racional simplify(){
        int divisor = gcd(this.num, this.den);
        this.num /= divisor;
        this.den /= divisor;
        return this;
    }
}