package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button clr;
    private Button equal;
    private TextView task;
    private TextView result;

    private final char addition ='+';
    private final char subtraction = '-';
    private final char multi='*';
    private final char division = '/';
    private final char equals=0;

    private char opr;

    private double val1 = Double.NaN;
    private double val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButton();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                task.setText(task.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                task.setText(task.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                task.setText(task.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                task.setText(task.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                task.setText(task.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                task.setText(task.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                task.setText(task.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                task.setText(task.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                task.setText(task.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                task.setText(task.getText().toString() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation();
                opr=addition;
                result.setText(String.valueOf(val1) + "+");
                task.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation();
                opr=subtraction;
                result.setText(String.valueOf(val1) + "-");
                task.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation();
                opr=multi;
                result.setText(String.valueOf(val1) + "-");
                task.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation();
                opr=division;
                result.setText(String.valueOf(val1) + "/");
                task.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation();
                opr=equals;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                task.setText(null);
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(task.getText().length()>0)
                {
                    CharSequence name=task.getText().toString();
                    task.setText(name.subSequence(0,name.length()-1));
                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;

                    task.setText(null);
                    result.setText(null);
                }





            }
        });






    }

    private void setButton()
    {
        one=(Button)findViewById(R.id.btn1);
        two=(Button)findViewById(R.id.btn2);
        three=(Button)findViewById(R.id.btn3);
        four=(Button)findViewById(R.id.btn4);
        five=(Button)findViewById(R.id.btn5);
        six=(Button)findViewById(R.id.btn6);
        seven=(Button)findViewById(R.id.btn7);
        eight=(Button)findViewById(R.id.btn8);
        nine=(Button)findViewById(R.id.btn9);
        zero=(Button)findViewById(R.id.btn0);
        add=(Button)findViewById(R.id.btnadd);
        sub=(Button)findViewById(R.id.btnsub);
        mul=(Button)findViewById(R.id.btnmul);
        div=(Button)findViewById(R.id.btndiv);
        equal=(Button)findViewById(R.id.btneq);
        clr=(Button)findViewById(R.id.btnclear);
        task=(TextView)findViewById(R.id.tvtask);
        result=(TextView)findViewById(R.id.tvresult);
    }

    private void operation()
    {
        if(!Double.isNaN(val1))
        {
            val2=Double.parseDouble(task.getText().toString());

            switch (opr)
            {
                case addition:
                    val1+=val2;
                    break;

                case subtraction:
                    val1=val1-val2;
                    break;

                case multi:
                    val1=val1*val2;
                    break;

                case division:
                    val1=val1/val2;
                    break;


            }
        }
        else
        {
            val1=Double.parseDouble(task.getText().toString());
        }
    }
}
