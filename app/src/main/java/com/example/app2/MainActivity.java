package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity {

    TextView btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0;
    TextView btn_dot, btn_equal, btn_ac, btn_C, btn_module, btn_add, btn_minus, btn_divide, btn_multiplication, btn_bracket;


    TextView inputTxt, outputTxt;


    String data;

    boolean isOperatorPressed = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // To set Status Bar colors same as app Bg
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.my_app_bg));
        }

        getSupportActionBar().hide();  // Hides the title of the app

        outputTxt = findViewById(R.id.result_tv);
        inputTxt = findViewById(R.id.solution_tv);

        btn_0 = findViewById(R.id.btn_zero);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_dot = findViewById(R.id.btn_dot);
        btn_equal = findViewById(R.id.btn_equals);
        btn_ac = findViewById(R.id.btn_AC);
        btn_C = findViewById(R.id.btn_C);
        btn_add = findViewById(R.id.btn_add);
        btn_module = findViewById(R.id.btn_modulo);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiplication = findViewById(R.id.btn_multiply);
        btn_divide = findViewById(R.id.btn_divide);
        btn_bracket = findViewById(R.id.btn_bracket);


        ImageView scc = findViewById(R.id.Sc_logo);
        scc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Scientific_calc.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateZoom(MainActivity.this);
            }
        });


        ImageView uni_conv = findViewById(R.id.btn_unit_conv);
        uni_conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, unit_conv.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateZoom(MainActivity.this);
            }
        });

        ImageView formula = findViewById(R.id.btn_formula);
        formula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, formulae_page.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateZoom(MainActivity.this);
            }
        });

        ImageView info = findViewById(R.id.btn_info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, about.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateZoom(MainActivity.this);
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "0");
                isOperatorPressed = false;
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "1");
                isOperatorPressed = false;
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "2");
                isOperatorPressed = false;
            }
        });


        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "3");
                isOperatorPressed = false;
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "4");
                isOperatorPressed = false;
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "5");
                isOperatorPressed = false;
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "6");
                isOperatorPressed = false;
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "7");
                isOperatorPressed = false;
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "8");
                isOperatorPressed = false;
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText(data + "9");
                isOperatorPressed = false;
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if(!isOperatorPressed){
                    inputTxt.setText(data + ".");
                    isOperatorPressed = true;
                }
            }
        });




        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!isOperatorPressed) {
                    inputTxt.setText(data + "+");
                    isOperatorPressed = true;
                }
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!isOperatorPressed) {
                    inputTxt.setText(data + "-");
                    isOperatorPressed = true;
                }
            }
        });

        btn_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!isOperatorPressed) {
                    inputTxt.setText(data + "%");
                    isOperatorPressed = false;
                }
            }
        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!isOperatorPressed) {
                    inputTxt.setText(data + "×");
                    isOperatorPressed = true;
                }
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!isOperatorPressed) {
                    inputTxt.setText(data + "÷");
                    isOperatorPressed = true;
                }
            }
        });


        btn_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = inputTxt.getText().toString();
                int len = data.length();
                if (len == 0 || data.charAt(len - 1) == '(') {
                    inputTxt.setText(data + "(");
                } else if (data.charAt(len - 1) == ')') {
                    inputTxt.setText(data + ")");
                } else {
                    inputTxt.setText(data + ")");
                }
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText("");
                outputTxt.setText("");
                isOperatorPressed = false;
            }
        });

        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputTxt.getText().toString();
                if (currentText.length() > 0) {
                    String newText = currentText.substring(0, currentText.length() - 1);
                    inputTxt.setText(newText);
                    isOperatorPressed = false;
                }
            }
        });


        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();

                data = data.replaceAll("×", "*");
                data = data.replaceAll("%", "/100");
                data = data.replaceAll("÷", "/");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                Scriptable scriptable= rhino.initStandardObjects();
                finalResult= rhino.evaluateString(scriptable, data, "Javascript", 1, null).toString();

                double result = Double.parseDouble(finalResult);

                if (result % 1 == 0) { // check if the result is a whole number
                    outputTxt.setText(String.format("%.0f", result)); // format as integer
                } else {
                    outputTxt.setText(String.format("%.2f", result)); // format as floating-point number
                }
            }
        });



//        btn_equal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                data = inputTxt.getText().toString();
//
//                data = data.replaceAll("×", "*");
//                data = data.replaceAll("%", "/100");
//                data = data.replaceAll("÷", "/");
//
//                Context rhino = Context.enter();
//                rhino.setOptimizationLevel(-1);
//
//                String finalResult = "";
//
//                Scriptable scriptable= rhino.initStandardObjects();
//                finalResult= rhino.evaluateString(scriptable, data, "Javascript", 1, null).toString();
//
//                outputTxt.setText(finalResult);
//            }
//        });



    }
}