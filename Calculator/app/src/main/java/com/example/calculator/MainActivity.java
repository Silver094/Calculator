package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    boolean plus=false,minus=false,mult=false,div=false,modul=false,pow=false,check=false;
    Button one,two,three,four,five,six,seven,eight,nine,zero,dot,
            add,mul,sub,divide,cubeRoot,power,clear,back,equal,mod,sqroot;
    float oprand1,oprand2;
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView screen=findViewById(R.id.edit);
        TextView result=findViewById(R.id.textView);


        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        divide=findViewById(R.id.divide);
        cubeRoot=findViewById(R.id.cuberoot);
        power=findViewById(R.id.power);
        clear=findViewById(R.id.clear);
        back=findViewById(R.id.back);
        dot=findViewById(R.id.dot);
        equal=findViewById(R.id.equal);
        sqroot=findViewById(R.id.sqroot);
        mod=findViewById(R.id.mod);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=screen.getText().toString();
                if(str.length()==0);
                else if (check);
                else if(str=="-");
                else {
                    oprand1=Float.parseFloat(screen.getText().toString());
                    screen.setText("");
                    result.setText(str+" "+"+");
                    plus=true;
                    check=true;
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=screen.getText().toString();
                if(str.length()==0)
                screen.setText("-");
                else if (check);
                else if(str=="-");
                else {
                    oprand1=Float.parseFloat(screen.getText().toString());
                    screen.setText("");
                    result.setText(str+" "+"-");
                    minus=true;
                    check=true;
                }

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=screen.getText().toString();
                if(str.length()==0);
                else if (check);
                else if(str=="-");
                else {
                    oprand1=Float.parseFloat(screen.getText().toString());
                    screen.setText("");
                    result.setText(str+" "+"/");
                    div=true;
                    check=true;
                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=screen.getText().toString();
                if(str.length()==0);
                else if (check);
                else if(str=="-");
                else {
                    oprand1=Float.parseFloat(screen.getText().toString());
                    screen.setText("");
                    result.setText(str+" "+"*");
                    mult=true;
                    check=true;
                }
            }
        });


        sqroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=screen.getText().toString();
                if(str.length()==0);
                else if (check);
                else if(str=="-");
                else {
                    oprand1=Float.parseFloat(screen.getText().toString());
                    screen.setText("");
                    result.setText(Math.sqrt(oprand1)+"");
                }
            }
        });

        cubeRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=screen.getText().toString();
                if(str.length()==0);
                else if (check);
                else if(str=="-");
                else {
                    oprand1=Float.parseFloat(screen.getText().toString());
                    screen.setText("");
                    result.setText(Math.cbrt(oprand1)+"");
                }
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=screen.getText().toString();
                if(str.length()==0);
                else if (check);
                else if(str=="-");
                else {
                    oprand1=Float.parseFloat(screen.getText().toString());
                    screen.setText("");
                    result.setText(str+" "+"%");
                    modul=true;
                    check=true;
                }

            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=screen.getText().toString();
                if(str.length()==0);
                else if (check);
                else if(str=="-");
                else {
                    oprand1=Float.parseFloat(screen.getText().toString());
                    screen.setText("");
                    result.setText(str+"^");
                    pow=true;
                    check=true;
                }

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=screen.getText().toString();
                if(str1.length()==0|| str1=="-");
                else if(!check);
                else{
                oprand2 = Float.parseFloat(screen.getText().toString());
                if(plus)
                {
                    result.setText(oprand1+oprand2 +"");
                    plus=false;
                    check=false;
                }
                if(minus)
                {
                    result.setText(oprand1-oprand2 +"");
                    minus=false;
                    check=false;
                }
                if(mult)
                {
                    result.setText(oprand1*oprand2 +"");
                    mult=false;
                    check=false;
                }
                if(div)
                {
                    result.setText(oprand1/oprand2 +"");
                    div=false;
                    check=false;
                }
                if(modul)
                {
                    result.setText(oprand1%oprand2 +"");
                    modul=false;
                    check=false;
                }
                if(pow)
                {
                    result.setText(Math.pow(oprand1,oprand2) +"");
                    pow=false;
                    check=false;
                }
                screen.setText(result.getText().toString());
                result.setText("");

            }}
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String str=screen.getText().toString();
                if(str.length()>=1){
                    str=str.substring(0,str.length()-1);
                    screen.setText(str);}
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("");
                result.setText("");
                plus=false;
                minus=false;
                mult=false;
                div=false;
                check=false;
            }
        });

    }
}