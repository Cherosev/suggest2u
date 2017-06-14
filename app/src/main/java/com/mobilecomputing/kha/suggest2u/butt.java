package com.mobilecomputing.kha.suggest2u;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Kha on 10/06/2017.
 */
public class butt {
    public String charac;
    public String symbol;
    private String current;

    public butt(String charac, String symbol) {
        this.charac = charac;
        this.symbol = symbol;
        this.current = charac;
    }

    public String getCur() {
        return current;
    }

    public String getSym(boolean sym) {
        if (sym) {
            return symbol;
        } else {
            return charac;
        }
    }
}
