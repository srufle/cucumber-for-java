package com.example.rufle.cucumber_fun.nicebank;

public class Money {

    private int dollars = 0;
    private int cents = 0;

    public Money() {
        super();
    }

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money add(Money amount) {
        this.dollars += amount.getDollars();
        this.cents += amount.getCents();
        return new Money(this.dollars, this.cents);
    }

    public Money subtract(Money amount) {
        // TODO Auto-generated method stub
        return null;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cents;
        result = prime * result + dollars;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Money other = (Money) obj;
        if (cents != other.cents)
            return false;
        if (dollars != other.dollars)
            return false;
        return true;
    }

}
