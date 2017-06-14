package com.mobilecomputing.kha.suggest2u;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {
    ImageView enter;
    TextView textBox;
    TextView chatBox;
    List<butt> buttonList = new ArrayList<>();
    List<Button> ButtonList = new ArrayList<>();
    private Button del;
    private Button space;
    //Button first = (Button) findViewById(R.id.b1st);
    //Button second = (Button) findViewById(R.id.b2nd);
    //Button third = (Button) findViewById(R.id.b3rd);
    //Button fourth = (Button) findViewById(R.id.b4th);
    private Button shift;
    private int resFile = 0;
    private Button symbol;
    boolean symBool = Boolean.FALSE;
    int shiftVal;
    private butt a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,comma;
    private Button bba,bbb,bbc,bbd,bbe,bbf,bbg,bbh,bbi,bbj,bbk,bbl,bbm,bbn,bbo,bbp,bbq,bbr,bbs,bbt,bbu,bbv,bbx,bby,bbz,bbw,bbcomma;
    private void init() {

        shiftVal = 1;

        a = new butt("a","-");
        b = new butt("b","!");
        c = new butt("c","...");
        d = new butt("d",":");
        e = new butt("e","3");
        f = new butt("f",";");
        g = new butt("g","(");
        h = new butt("h",")");
        i = new butt("i","8");
        j = new butt("j","#");
        k = new butt("k","$");
        l = new butt("l","@");
        m = new butt("m","'");
        n = new butt("n","\"");
        o = new butt("o","9");
        p = new butt("p","0");
        q = new butt("q","1");
        r = new butt("r","4");
        s = new butt("s","/");
        t = new butt("t","5");
        u = new butt("u","7");
        v = new butt("v","?");
        w = new butt("w","2");
        x = new butt("x",",");
        y = new butt("y","6");
        z = new butt("z",".");
        buttonList.add(a);
        buttonList.add(b);
        buttonList.add(c);
        buttonList.add(d);
        buttonList.add(e);
        buttonList.add(f);
        buttonList.add(g);
        buttonList.add(h);
        buttonList.add(i);
        buttonList.add(j);
        buttonList.add(k);
        buttonList.add(l);
        buttonList.add(m);
        buttonList.add(n);
        buttonList.add(o);
        buttonList.add(p);
        buttonList.add(q);
        buttonList.add(r);
        buttonList.add(s);
        buttonList.add(t);
        buttonList.add(u);
        buttonList.add(v);
        buttonList.add(w);
        buttonList.add(x);
        buttonList.add(y);
        buttonList.add(z);
        ButtonList.add(bba);
        ButtonList.add(bbb);
        ButtonList.add(bbc);
        ButtonList.add(bbd);
        ButtonList.add(bbe);
        ButtonList.add(bbf);
        ButtonList.add(bbg);
        ButtonList.add(bbh);
        ButtonList.add(bbi);
        ButtonList.add(bbj);
        ButtonList.add(bbk);
        ButtonList.add(bbl);
        ButtonList.add(bbm);
        ButtonList.add(bbn);
        ButtonList.add(bbo);
        ButtonList.add(bbp);
        ButtonList.add(bbq);
        ButtonList.add(bbr);
        ButtonList.add(bbs);
        ButtonList.add(bbt);
        ButtonList.add(bbu);
        ButtonList.add(bbv);
        ButtonList.add(bbw);
        ButtonList.add(bbx);
        ButtonList.add(bby);
        ButtonList.add(bbz);
        toUpper();

    }
    public void press(butt bb,Button baa){
        String x = (String) textBox.getText();
        textBox.setText((x.concat((String) baa.getText())));
        if (shiftVal == 1){
            shiftVal = 0;
            toUpper();
        }
    }
    public void toSym() {
        for (int ii = 0; ii < buttonList.size(); ii++) {
            ButtonList.get(ii).setText(buttonList.get(ii).getSym(symBool));
        }
    }
    public void toUpper(){

        for (int ii = 0; ii < buttonList.size(); ii++) {
            if (shiftVal == 0){
                ButtonList.get(ii).setText(buttonList.get(ii).getCur().toLowerCase());
            }
            if (shiftVal == 1){
                ButtonList.get(ii).setText(buttonList.get(ii).getCur().toUpperCase());
            }

            if (shiftVal == 0){
                // grey = #ff616161
                // white = #ffffff
                // blue = #0000FF
                shift.setBackgroundColor(Color.parseColor("#ff616161"));
                shift.setTextColor(Color.parseColor("#ffffff"));
            }
            else if (shiftVal == 1){
                shift.setBackgroundColor(Color.parseColor("#ff616161"));
                shift.setTextColor(Color.parseColor("#0000ff"));
            }
            else {
                shift.setBackgroundColor(Color.parseColor("#0000ff"));
                shift.setTextColor(Color.parseColor("#ff616161"));
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        setContentView(R.layout.activity_main);

        enter = (ImageView) findViewById(R.id.bent);
        textBox = (TextView) findViewById(R.id.write);
        chatBox = (TextView) findViewById(R.id.chat);

        bba = (Button) findViewById(R.id.ba);
        bbb = (Button) findViewById(R.id.bb);
        bbc = (Button) findViewById(R.id.bc);
        bbd = (Button) findViewById(R.id.bd);
        bbe = (Button) findViewById(R.id.be);
        bbf = (Button) findViewById(R.id.bf);
        bbg = (Button) findViewById(R.id.bg);
        bbh = (Button) findViewById(R.id.bh);
        bbi = (Button) findViewById(R.id.bi);
        bbj = (Button) findViewById(R.id.bj);
        bbk = (Button) findViewById(R.id.bk);
        bbl = (Button) findViewById(R.id.bl);
        bbm = (Button) findViewById(R.id.bm);
        bbn = (Button) findViewById(R.id.bn);
        bbo = (Button) findViewById(R.id.bo);
        bbp = (Button) findViewById(R.id.bp);
        bbq = (Button) findViewById(R.id.bq);
        bbr = (Button) findViewById(R.id.br);
        bbs = (Button) findViewById(R.id.bs);
        bbt = (Button) findViewById(R.id.bt);
        bbu = (Button) findViewById(R.id.bu);
        bbv = (Button) findViewById(R.id.bv);
        bbw = (Button) findViewById(R.id.bw);
        bbx = (Button) findViewById(R.id.bx);
        bby = (Button) findViewById(R.id.by);
        bbz = (Button) findViewById(R.id.bz);
        bbcomma = (Button) findViewById(R.id.bcomma);
        del = (Button) findViewById(R.id.bdel);
        space = (Button) findViewById(R.id.bspace);
        symbol = (Button) findViewById(R.id.bsym);
        //Button first = (Button) findViewById(R.id.b1st);
        //Button second = (Button) findViewById(R.id.b2nd);
        //Button third = (Button) findViewById(R.id.b3rd);
        //Button fourth = (Button) findViewById(R.id.b4th);
        shift = (Button) findViewById(R.id.bshift);
        //textBox.setMovementMethod(new ScrollingMovementMethod());
        //chatBox.setMovementMethod(new ScrollingMovementMethod());

        init();

        symbol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                symBool = !symBool;
                toSym();
                if (symBool == Boolean.FALSE){
                    shiftVal = 0;
                    toUpper();
                }
            }
        });
        shift.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if (symBool){
                    return;
                }
                shiftVal = shiftVal + 1;
                if (shiftVal == 3){
                    shiftVal =0;
                }
                toUpper();
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String text = (String) textBox.getText();
                String chat = (String) chatBox.getText();
                //String test1 = "$test1";
                //String test2 = "$test2";
                shiftVal = 1;
                String end   = "$reset";
                /*
                if (chat.toLowerCase().contains(test1.toLowerCase())){
                    resFile = 1;
                }
                if (chat.toLowerCase().contains(test2.toLowerCase())){
                    resFile = 2;
                }

                if (resFile!=0){
                    writeToFile(chat,getBaseContext(),resFile);
                }
                */
                if (text != null && text.length() > 0) {
                    textBox.setText("");
                    chatBox.setText(chat.concat(text.concat("\n")));
                }

                if (chat.toLowerCase().contains(end.toLowerCase())){
                    textBox.setText("");
                    chatBox.setText("");

                }
            }
        });

        del.setOnTouchListener(new RepeatListener(400, 100, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // the code to execute repeatedly
                String text = (String) textBox.getText();
                if (text != null && text.length() > 0 ) {
                    //text = text.substring(0, text.length()-1);
                    textBox.setText(text.substring(0, text.length()-1));
                }
            }
        }));

        space.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat(" ")));
            }
        });
        bbcomma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat(", ")));
            }
        });
        bba.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(a,bba);
            }
        });

        bbb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(b,bbb);
            }
        });
        bbc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(c,bbc);
            }
        });
        bbd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(d,bbd);
            }
        });
        bbe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(e,bbe);
            }
        });
        bbf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(f,bbf);
            }
        });
        bbg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(g,bbg);
            }
        });
        bbh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(h,bbh);
            }
        });
        bbi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(i,bbi);
            }
        });
        bbj.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(j,bbj);
            }
        });
        bbk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(k,bbk);
            }
        });
        bbl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(l,bbl);
            }
        });
        bbm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(m,bbm);
            }
        });
        bbn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(n,bbn);
            }
        });
        bbo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(o,bbo);
            }
        });

        bbp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(p,bbp);
            }
        });

        bbq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(q,bbq);
            }
        });
        bbr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(r,bbr);
            }
        });
        bbs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(s,bbs);
            }
        });
        bbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(t,bbt);
            }
        });
        bbu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(u,bbu);
            }
        });
        bbv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View y) {
                // Perform action on click
                press(v,bbv);
            }
        });
        bbw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(w,bbw);
            }
        });
        bbx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(x,bbx);
            }
        });

        bby.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(y,bby);
            }
        });
        bbz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                press(z,bbz);
            }
        });




    }
}



