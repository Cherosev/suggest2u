package com.mobilecomputing.kha.suggest2u;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textBox = (TextView) findViewById(R.id.write);
        final TextView chatBox = (TextView) findViewById(R.id.chat);
        Button del = (Button) findViewById(R.id.bdel);
        Button space = (Button) findViewById(R.id.bspace);
        Button enter = (Button) findViewById(R.id.bent);
        Button fuck = (Button) findViewById(R.id.fuck);
        Button soren = (Button) findViewById(R.id.soren);
        Button a = (Button) findViewById(R.id.ba);
        Button b = (Button) findViewById(R.id.bb);
        Button c = (Button) findViewById(R.id.bc);
        Button d = (Button) findViewById(R.id.bd);
        Button e = (Button) findViewById(R.id.be);
        Button f = (Button) findViewById(R.id.bf);
        Button g = (Button) findViewById(R.id.bg);
        Button h = (Button) findViewById(R.id.bh);
        Button i = (Button) findViewById(R.id.bi);
        Button j = (Button) findViewById(R.id.bj);
        Button k = (Button) findViewById(R.id.bk);
        Button l = (Button) findViewById(R.id.bl);
        Button m = (Button) findViewById(R.id.bm);
        Button n = (Button) findViewById(R.id.bn);
        Button o = (Button) findViewById(R.id.bo);
        Button p = (Button) findViewById(R.id.bp);
        Button q = (Button) findViewById(R.id.bq);
        Button r = (Button) findViewById(R.id.br);
        Button s = (Button) findViewById(R.id.bs);
        Button t = (Button) findViewById(R.id.bt);
        Button u = (Button) findViewById(R.id.bu);
        Button v = (Button) findViewById(R.id.bv);
        Button x = (Button) findViewById(R.id.bx);
        Button y = (Button) findViewById(R.id.by);
        Button z = (Button) findViewById(R.id.bz);

        enter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String text = (String) textBox.getText();
                String chat = (String) chatBox.getText();
                if (text != null && text.length() > 0) {
                    textBox.setText("");
                    chatBox.setText(chat.concat(text.concat("\n")));
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

        a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("a")));
            }
        });

        soren.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("Soren ")));
            }
        });
        fuck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("fuck ")));
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("b")));
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("c")));
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("d")));
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("e")));
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("f")));
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("g")));
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("h")));
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("i")));
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("j")));
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("k")));
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("l")));
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("m")));
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("n")));
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("o")));
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("p")));
            }
        });

        q.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("q")));
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("r")));
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("s")));
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("t")));
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("u")));
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("v")));
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("x")));
            }
        });

        y.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("y")));
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String x = (String) textBox.getText();
                textBox.setText((x.concat("z")));
            }
        });



    }

}
