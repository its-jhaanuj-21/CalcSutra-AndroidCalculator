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
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class Scientific_calc extends AppCompatActivity{

    TextView btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0;
    TextView btn_dot, btn_equal, btn_ac, btn_C, btn_module, btn_add, btn_minus, btn_divide, btn_multiplication, btn_bracket, btn_back;
    TextView btn_sin, btn_cos, btn_tan, btn_ln, btn_log, btn_e, btn_sqrt, btn_cbrt, btn_square, btn_cube, btn_fact, btn_mod, btn_pi, btn_inverse;


    TextView inputTxt, outputTxt;


    String data;

    boolean isOperatorPressed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calc);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        getSupportActionBar().hide();  // Hides the title of the app

        // To set Status Bar colors same as app Bg
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.my_app_bg));
        }

        outputTxt = findViewById(R.id.result_tv);
        inputTxt = findViewById(R.id.solution_tv);

        btn_0 = findViewById(R.id.btn_0);
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

        btn_add = findViewById(R.id.btn_add);
        btn_minus = findViewById(R.id.btn_minus);
        btn_divide = findViewById(R.id.btn_divide);
        btn_multiplication = findViewById(R.id.btn_multiply);

        btn_bracket = findViewById(R.id.btn_bracket);
        btn_ac = findViewById(R.id.btn_AC);
        btn_C = findViewById(R.id.btn_C);
        btn_cbrt = findViewById(R.id.btn_cbrt);
        btn_sqrt = findViewById(R.id.btn_sqrt);
        btn_cos = findViewById(R.id.btn_cos);
        btn_sin = findViewById(R.id.btn_sin);
        btn_square = findViewById(R.id.btn_square);
        btn_pi = findViewById(R.id.btn_pi);
        btn_tan = findViewById(R.id.btn_tan);
        btn_ln = findViewById(R.id.btn_ln);
        btn_log = findViewById(R.id.btn_log);
        btn_e = findViewById(R.id.btn_e);
        btn_cube = findViewById(R.id.btn_cube);
        btn_fact = findViewById(R.id.btn_fact);
        btn_mod = findViewById(R.id.btn_mod);
        btn_module = findViewById(R.id.btn_modulo);
        btn_inverse = findViewById(R.id.btn_Inverse);
        btn_back = findViewById(R.id.btn_back);




        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scientific_calc.this, MainActivity.class);
                startActivity(intent);
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
                if (!isOperatorPressed) {
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

        btn_inverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!isOperatorPressed) {
                    inputTxt.setText(data + "1÷");
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



        btn_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputString = inputTxt.getText().toString();
                if (!inputString.isEmpty()) {
                    double inputValue = Double.parseDouble(inputString);
                    double result = inputValue * inputValue;
                    inputTxt.setText(String.format("%.0f", result));
                    outputTxt.setText(Integer.parseInt(inputString)+"^(2)");
                }
            }
        });

        btn_cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputString = inputTxt.getText().toString();
                if (!inputString.isEmpty()) {
                    double inputValue = Double.parseDouble(inputString);
                    double result = inputValue * inputValue * inputValue;
                    inputTxt.setText(String.format("%.0f", result));
                    outputTxt.setText(Integer.parseInt(inputString)+"^(3)");
                }
            }
        });

        btn_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputString = inputTxt.getText().toString();
                if (!inputString.isEmpty()) {
                    double inputValue = Double.parseDouble(inputString);
                    double result = Math.sqrt(inputValue);
                    if (result % 1 == 0) { // check if the result is a whole number
                        inputTxt.setText(String.format("%.0f", result)); // format as integer
                    } else {
                        inputTxt.setText(String.format("%.3f", result)); // format as floating-point number
                    }
                }
            }
        });


        btn_cbrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputString = inputTxt.getText().toString();
                if (!inputString.isEmpty()) {
                    double inputValue = Double.parseDouble(inputString);
                    double result = Math.cbrt(inputValue);
                    if (result % 1 == 0) { // check if the result is a whole number
                        inputTxt.setText(String.format("%.0f", result)); // format as integer
                    } else {
                        inputTxt.setText(String.format("%.3f", result)); // format as floating-point number
                    }
                }
            }
        });




        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!isOperatorPressed) {
                    inputTxt.setText(data + "sin(");
                    isOperatorPressed = true;
                }
            }
        });
//        btn_sin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String inputString = inputTxt.getText().toString();
//                if (!inputString.isEmpty()) {
//                    double inputValue = Double.parseDouble(inputString);
//                    double result = Math.sin(Math.toDegrees(inputValue));
//                    if (result % 1 == 0) { // check if the result is a whole number
//                        outputTxt.setText(String.format("%.0f", result)); // format as integer
//                    } else {
//                        outputTxt.setText(String.format("%.3f", result)); // format as floating-point number
//                    }
//                }
//            }
//        });


        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!isOperatorPressed) {
                    inputTxt.setText(data + "cos(");
                    isOperatorPressed = true;
                }
            }
        });
//        btn_cos.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String inputString = inputTxt.getText().toString();
//                if (!inputString.isEmpty()) {
//                    double inputValue = Double.parseDouble(inputString);
//                    double result = Math.cos(inputValue);
//                    if (result % 1 == 0) { // check if the result is a whole number
//                        outputTxt.setText(String.format("%.0f", result)); // format as integer
//                    } else {
//                        outputTxt.setText(String.format("%.3f", result)); // format as floating-point number
//                    }
//                }
//            }
//        });




        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!isOperatorPressed) {
                    inputTxt.setText(data + "tan(");
                    isOperatorPressed = true;
                }
            }
        });
//        btn_tan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String inputString = inputTxt.getText().toString();
//                if (!inputString.isEmpty()) {
//                    double inputValue = Double.parseDouble(inputString);
//                    double result = Math.tan(inputValue);
//                    if (result % 1 == 0) { // check if the result is a whole number
//                        outputTxt.setText(String.format("%.0f", result)); // format as integer
//                    } else {
//                        outputTxt.setText(String.format("%.3f", result)); // format as floating-point number
//                    }
//                }
//            }
//        });




        btn_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!isOperatorPressed) {
                    inputTxt.setText(data + "ln(");
                    isOperatorPressed = true;
                }
            }
        });

        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if(!isOperatorPressed){
                    inputTxt.setText(data +"log(");
                    isOperatorPressed = true;
                }
            }
        });

        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if(!isOperatorPressed){
                    inputTxt.setText(data +"e");
                    isOperatorPressed = false;
                }
            }
        });

        btn_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if(!isOperatorPressed){
                    inputTxt.setText(data +"π");
                    isOperatorPressed = false;
                }
            }
        });


        btn_fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(inputTxt.getText().toString());
                int fact = factorial(val);
                inputTxt.setText(String.valueOf(fact));
                outputTxt.setText(val+"!");
            }
        });

        btn_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!isOperatorPressed) {
                    inputTxt.setText(data + "abs(");
                    isOperatorPressed = false;
//                    outputTxt.setText(Math.abs(Integer.getInteger(data)));
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
//                double result = Double.parseDouble(finalResult);
//
//                if (result % 1 == 0) { // check if the result is a whole number
//                    outputTxt.setText(String.format("%.0f", result)); // format as integer
//                } else {
//                    outputTxt.setText(String.format("%.2f", result)); // format as floating-point number
//                }
//            }
//        });


        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = inputTxt.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*').replaceAll("%","/100").replaceAll("e", "2.718281828459045").replaceAll("π", "3.14159265359");
                double result = eval(replacedstr);
//                if(result % 1== 0){
//                    inputTxt.setText(String.format("%.0f",result));
//                } else{
//                    inputTxt.setText(String.format("%.2f",result));
//                }
                inputTxt.setText(String.valueOf(result));
                outputTxt.setText(val);
            }
        });

    }

    int factorial(int n)
    {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }

    double pow (double x, double y){
        return Math.pow(x,y);
    }


    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else if (func.equals("abs")) x = Math.abs(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}