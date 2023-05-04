package com.example.q23;

import androidx.appcompat.app.AppCompatActivity;

public class Money extends AppCompatActivity {
    public static int cash=0;

    public Money() {
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
