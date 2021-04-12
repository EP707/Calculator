package org.cgpa.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double value1 = Double.NaN;
    private double value2;
    String ACTION;
    EditText disp;
    TextView result;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnequal,btndot,btnclear,btnBackspace,btnadd,btnminus,btnmul,btndivide,btnmodules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnequal = (Button) findViewById(R.id.btnEqual);
        btndot = (Button) findViewById(R.id.btndot);
        btnclear = (Button) findViewById(R.id.btnClear);
        btnadd = (Button) findViewById(R.id.btnPlus);
        btnminus = (Button) findViewById(R.id.btnSub);
        btnmul = (Button) findViewById(R.id.btnMul);
        btndivide = (Button) findViewById(R.id.btn_divide);
        btnmodules = (Button) findViewById(R.id.btnModules);
        btnBackspace = (Button) findViewById(R.id.btnBack);

        disp = (EditText) findViewById(R.id.calc_display);
        result = (TextView) findViewById(R.id.calc_result);

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Double.NaN;
                disp.setText(null);
                result.setText(null);
            }
        });

        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = disp.getText().toString();
                if(number != null && number.length() > 0) {
                    number = number.substring(0 , number.length() - 1);
                }
                disp.setText(number);
                disp.setSelection(disp.getText().length());
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "+";
                if(!Double.isNaN(value1)){
                    value2 = Double.parseDouble(disp.getText().toString());
                    value1 = value1 + value2;
                } else {
                    value1 = Double.parseDouble(disp.getText().toString());
                }
                result.setText(value1 + "+");
                disp.setText(null);
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "-";
                if(!Double.isNaN(value1)){
                    value2 = Double.parseDouble(disp.getText().toString());
                    value1 = value1 - value2;
                } else {
                    value1 = Double.parseDouble(disp.getText().toString());
                }
                result.setText(value1 + "-");
                disp.setText(null);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "*";
                if(!Double.isNaN(value1)){
                    value2 = Double.parseDouble(disp.getText().toString());
                    value1 = value1 * value2;
                } else {
                    value1 = Double.parseDouble(disp.getText().toString());
                }
                result.setText(value1 + "*");
                disp.setText(null);
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "/";
                if(!Double.isNaN(value1)){
                    value2 = Double.parseDouble(disp.getText().toString());
                    value1 = value1 / value2;
                } else {
                    value1 = Double.parseDouble(disp.getText().toString());
                }
                result.setText(value1 + "/");
                disp.setText(null);
            }
        });

        btnmodules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "%";
                if(!Double.isNaN(value1)){
                    value2 = Double.parseDouble(disp.getText().toString());
                    value1 = value1 % value2;
                } else {
                    value1 = Double.parseDouble(disp.getText().toString());
                }
                result.setText(value1 + "%");
                disp.setText(null);
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ACTION != null && ACTION.equals("+")) {
                    double res = value1 + Double.parseDouble(disp.getText().toString());
                    disp.setText(null);
                    result.setText(String.valueOf(res));
                } else if (ACTION != null && ACTION.equals("-")) {
                    double res = value1 - Double.parseDouble(disp.getText().toString());
                    disp.setText(null);
                    result.setText(String.valueOf(res));
                } else if (ACTION != null && ACTION.equals("*")) {
                    double res = value1 * Double.parseDouble(disp.getText().toString());
                    disp.setText(null);
                    result.setText(String.valueOf(res));
                } else if (ACTION != null && ACTION.equals("/")) {
                    double res = value1 / Double.parseDouble(disp.getText().toString());
                    disp.setText(null);
                    result.setText(String.valueOf(res));
                } else if (ACTION != null && ACTION.equals("%")) {
                    double res = value1 % Double.parseDouble(disp.getText().toString());
                    disp.setText(null);
                    result.setText(String.valueOf(res));
                }


                ACTION = null;
                value1 = Double.NaN;
                disp.setSelection(disp.getText().length());
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "0");
                disp.setSelection(disp.getText().length());
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "1");
                disp.setSelection(disp.getText().length());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "2");
                disp.setSelection(disp.getText().length());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "3");
                disp.setSelection(disp.getText().length());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "4");
                disp.setSelection(disp.getText().length());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "5");
                disp.setSelection(disp.getText().length());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "6");
                disp.setSelection(disp.getText().length());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "7");
                disp.setSelection(disp.getText().length());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "8");
                disp.setSelection(disp.getText().length());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + "9");
                disp.setSelection(disp.getText().length());
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText() + ".");
                disp.setSelection(disp.getText().length());
            }
        });


    }
}