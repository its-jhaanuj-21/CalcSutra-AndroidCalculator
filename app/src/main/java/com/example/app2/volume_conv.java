package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Arrays;

public class volume_conv extends AppCompatActivity {

    TextView btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_00;
    TextView btn_dot, btn_backspace, btn_ca;

    TextView input_conv, output_conv;
    ScrollView from_unit, to_unit;

    String data;
    boolean isOperatorPressed = false;

    String[] units = {"Cubic Meter (m³)", "Cubic Centimeter (cm³)", "Deciliter (dl)", "Centiliter (cl)", "Liter (l)", "Cubic Millimeter (mm³)", "Milliliter (ml)"};

    AutoCompleteTextView list_from;
    AutoCompleteTextView list_to;
    ArrayAdapter<String> adaptersItems;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_conv);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        getSupportActionBar().hide();  // Hides the title of the app

        // To set Status Bar colors same as app Bg
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.my_app_bg));
        }


        input_conv = findViewById(R.id.txt_enter_vol);
        output_conv = findViewById(R.id.txt_converted_vol);


        btn_0 = findViewById(R.id.btn_0);
        btn_00 = findViewById(R.id.btn_00);
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
        btn_backspace = findViewById(R.id.btn_C);
        btn_ca = findViewById(R.id.btn_AC);






        list_from = findViewById(R.id.list_from);
        list_to = findViewById(R.id.list_to);

        adaptersItems = new ArrayAdapter<String>(this, R.layout.unit_items, units);
        list_from.setAdapter(adaptersItems);
        list_to.setAdapter(adaptersItems);

        list_from.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String item = parent.getItemAtPosition(0).toString();
//                Toast.makeText(getApplicationContext(), "Item "+item, Toast.LENGTH_SHORT).show();
            }
        });


        list_to.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String item2 = parent.getItemAtPosition(position).toString();
//                Toast.makeText(getApplicationContext(), "Item "+item, Toast.LENGTH_SHORT).show();
            }
        });



        list_from.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String fromUnit = list_from.getText().toString(); // Get the selected unit from list_from
                String toUnit = list_to.getText().toString(); // Get the selected unit from list_to

                // Get the indices of the selected units in the units array
                int fromIndex = Arrays.asList(units).indexOf(fromUnit);
                int toIndex = Arrays.asList(units).indexOf(toUnit);

                // Perform the conversion between the two units using the indices
                double inputValue = Double.parseDouble(input_conv.getText().toString());
                double outputValue = 0.0;
                if (fromIndex == 0 && toIndex == 0) {
                    outputValue = inputValue;
                } else if (fromIndex == 0 && toIndex == 1) {
                    outputValue = inputValue*1000000;
                } else if (fromIndex == 0 && toIndex == 2) {
                    outputValue = inputValue * 10000;
                } else if (fromIndex == 0 && toIndex == 3) {
                    outputValue = inputValue * 100000;
                } else if (fromIndex == 0 && toIndex == 4) {
                    outputValue = inputValue * 1000;
                } else if (fromIndex == 0 && toIndex == 5) {
                    outputValue = inputValue * 1000000000;
                } else if (fromIndex == 0 && toIndex == 6) {
                    outputValue = inputValue * 1000000;
                }

                if (fromIndex == 1 && toIndex == 0) {
                    outputValue = inputValue*0.000001;
                } else if (fromIndex == 1 && toIndex == 1) {
                    outputValue = inputValue;
                } else if (fromIndex == 1 && toIndex == 2) {
                    outputValue = inputValue * 0.01;
                } else if (fromIndex == 1 && toIndex == 3) {
                    outputValue = inputValue * 0.1;
                } else if (fromIndex == 1 && toIndex == 4) {
                    outputValue = inputValue * 0.001;
                } else if (fromIndex == 1 && toIndex == 5) {
                    outputValue = inputValue * 1000;
                } else if (fromIndex == 1 && toIndex == 6) {
                    outputValue = inputValue * 1;
                }

                if (fromIndex == 2 && toIndex == 0) {
                    outputValue = inputValue*0.0001;
                } else if (fromIndex == 2 && toIndex == 1) {
                    outputValue = inputValue*100;
                } else if (fromIndex == 2 && toIndex == 2) {
                    outputValue = inputValue;
                } else if (fromIndex == 2 && toIndex == 3) {
                    outputValue = inputValue * 10;
                } else if (fromIndex == 2 && toIndex == 4) {
                    outputValue = inputValue * 0.1;
                } else if (fromIndex == 2 && toIndex == 5) {
                    outputValue = inputValue * 100000;
                } else if (fromIndex == 2 && toIndex == 6) {
                    outputValue = inputValue * 100;
                }


                if (fromIndex == 3 && toIndex == 0) {
                    outputValue = inputValue*0.00001;
                } else if (fromIndex == 3 && toIndex == 1) {
                    outputValue = inputValue*10;
                } else if (fromIndex == 3 && toIndex == 2) {
                    outputValue = inputValue * 0.1;
                } else if (fromIndex == 3 && toIndex == 3) {
                    outputValue = inputValue;
                } else if (fromIndex == 3 && toIndex == 4) {
                    outputValue = inputValue * 0.01;
                } else if (fromIndex == 3 && toIndex == 5) {
                    outputValue = inputValue * 10000;
                } else if (fromIndex == 3 && toIndex == 6) {
                    outputValue = inputValue * 10;
                }


                if (fromIndex == 4 && toIndex == 0) {
                    outputValue = inputValue*0.001;
                } else if (fromIndex == 4 && toIndex == 1) {
                    outputValue = inputValue*1000;
                } else if (fromIndex == 4 && toIndex == 2) {
                    outputValue = inputValue * 10;
                } else if (fromIndex == 4 && toIndex == 3) {
                    outputValue = inputValue*100;
                } else if (fromIndex == 4 && toIndex == 4) {
                    outputValue = inputValue;
                } else if (fromIndex == 4 && toIndex == 5) {
                    outputValue = inputValue * 1000000;
                } else if (fromIndex == 4 && toIndex == 6) {
                    outputValue = inputValue * 1000;
                }


                if (fromIndex == 5 && toIndex == 0) {
                    outputValue = inputValue*1e-9;
                } else if (fromIndex == 5 && toIndex == 1) {
                    outputValue = inputValue*0.001;
                } else if (fromIndex == 5 && toIndex == 2) {
                    outputValue = inputValue * 0.00001;
                } else if (fromIndex == 5 && toIndex == 3) {
                    outputValue = inputValue*0.0001;
                } else if (fromIndex == 5 && toIndex == 4) {
                    outputValue = inputValue*0.000001;
                } else if (fromIndex == 5 && toIndex == 5) {
                    outputValue = inputValue;
                } else if (fromIndex == 5 && toIndex == 6) {
                    outputValue = inputValue * 0.001;
                }


                if (fromIndex == 6 && toIndex == 0) {
                    outputValue = inputValue*0.000001;
                } else if (fromIndex == 6 && toIndex == 1) {
                    outputValue = inputValue*1;
                } else if (fromIndex == 6 && toIndex == 2) {
                    outputValue = inputValue * 0.01;
                } else if (fromIndex == 6 && toIndex == 3) {
                    outputValue = inputValue*0.1;
                } else if (fromIndex == 6 && toIndex == 4) {
                    outputValue = inputValue*0.001;
                } else if (fromIndex == 6 && toIndex == 5) {
                    outputValue = inputValue*1000;
                } else if (fromIndex == 6 && toIndex == 6) {
                    outputValue = inputValue;
                }


//                 Perform other conversion operations for the other unit combinations...
//
//                 Set the converted value in the output_conv TextView
                output_conv.setText(String.valueOf(outputValue));
            }
        });

        list_to.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String fromUnit = list_from.getText().toString(); // Get the selected unit from list_from
                String toUnit = list_to.getText().toString(); // Get the selected unit from list_to

                // Get the indices of the selected units in the units array
                int fromIndex = Arrays.asList(units).indexOf(fromUnit);
                int toIndex = Arrays.asList(units).indexOf(toUnit);

                // Perform the conversion between the two units using the indices
                double inputValue = Double.parseDouble(input_conv.getText().toString());
                double outputValue = 0.0;
                if (fromIndex == 0 && toIndex == 0) {
                    outputValue = inputValue;
                } else if (fromIndex == 0 && toIndex == 1) {
                    outputValue = inputValue*1000000;
                } else if (fromIndex == 0 && toIndex == 2) {
                    outputValue = inputValue * 10000;
                } else if (fromIndex == 0 && toIndex == 3) {
                    outputValue = inputValue * 100000;
                } else if (fromIndex == 0 && toIndex == 4) {
                    outputValue = inputValue * 1000;
                } else if (fromIndex == 0 && toIndex == 5) {
                    outputValue = inputValue * 1000000000;
                } else if (fromIndex == 0 && toIndex == 6) {
                    outputValue = inputValue * 1000000;
                }

                if (fromIndex == 1 && toIndex == 0) {
                    outputValue = inputValue*0.000001;
                } else if (fromIndex == 1 && toIndex == 1) {
                    outputValue = inputValue;
                } else if (fromIndex == 1 && toIndex == 2) {
                    outputValue = inputValue * 0.01;
                } else if (fromIndex == 1 && toIndex == 3) {
                    outputValue = inputValue * 0.1;
                } else if (fromIndex == 1 && toIndex == 4) {
                    outputValue = inputValue * 0.001;
                } else if (fromIndex == 1 && toIndex == 5) {
                    outputValue = inputValue * 1000;
                } else if (fromIndex == 1 && toIndex == 6) {
                    outputValue = inputValue * 1;
                }

                if (fromIndex == 2 && toIndex == 0) {
                    outputValue = inputValue*0.0001;
                } else if (fromIndex == 2 && toIndex == 1) {
                    outputValue = inputValue*100;
                } else if (fromIndex == 2 && toIndex == 2) {
                    outputValue = inputValue;
                } else if (fromIndex == 2 && toIndex == 3) {
                    outputValue = inputValue * 10;
                } else if (fromIndex == 2 && toIndex == 4) {
                    outputValue = inputValue * 0.1;
                } else if (fromIndex == 2 && toIndex == 5) {
                    outputValue = inputValue * 100000;
                } else if (fromIndex == 2 && toIndex == 6) {
                    outputValue = inputValue * 100;
                }


                if (fromIndex == 3 && toIndex == 0) {
                    outputValue = inputValue*0.00001;
                } else if (fromIndex == 3 && toIndex == 1) {
                    outputValue = inputValue*10;
                } else if (fromIndex == 3 && toIndex == 2) {
                    outputValue = inputValue * 0.1;
                } else if (fromIndex == 3 && toIndex == 3) {
                    outputValue = inputValue;
                } else if (fromIndex == 3 && toIndex == 4) {
                    outputValue = inputValue * 0.01;
                } else if (fromIndex == 3 && toIndex == 5) {
                    outputValue = inputValue * 10000;
                } else if (fromIndex == 3 && toIndex == 6) {
                    outputValue = inputValue * 10;
                }


                if (fromIndex == 4 && toIndex == 0) {
                    outputValue = inputValue*0.001;
                } else if (fromIndex == 4 && toIndex == 1) {
                    outputValue = inputValue*1000;
                } else if (fromIndex == 4 && toIndex == 2) {
                    outputValue = inputValue * 10;
                } else if (fromIndex == 4 && toIndex == 3) {
                    outputValue = inputValue*100;
                } else if (fromIndex == 4 && toIndex == 4) {
                    outputValue = inputValue;
                } else if (fromIndex == 4 && toIndex == 5) {
                    outputValue = inputValue * 1000000;
                } else if (fromIndex == 4 && toIndex == 6) {
                    outputValue = inputValue * 1000;
                }


                if (fromIndex == 5 && toIndex == 0) {
                    outputValue = inputValue*1e-9;
                } else if (fromIndex == 5 && toIndex == 1) {
                    outputValue = inputValue*0.001;
                } else if (fromIndex == 5 && toIndex == 2) {
                    outputValue = inputValue * 0.00001;
                } else if (fromIndex == 5 && toIndex == 3) {
                    outputValue = inputValue*0.0001;
                } else if (fromIndex == 5 && toIndex == 4) {
                    outputValue = inputValue*0.000001;
                } else if (fromIndex == 5 && toIndex == 5) {
                    outputValue = inputValue;
                } else if (fromIndex == 5 && toIndex == 6) {
                    outputValue = inputValue * 0.001;
                }


                if (fromIndex == 6 && toIndex == 0) {
                    outputValue = inputValue*0.000001;
                } else if (fromIndex == 6 && toIndex == 1) {
                    outputValue = inputValue*1;
                } else if (fromIndex == 6 && toIndex == 2) {
                    outputValue = inputValue * 0.01;
                } else if (fromIndex == 6 && toIndex == 3) {
                    outputValue = inputValue*0.1;
                } else if (fromIndex == 6 && toIndex == 4) {
                    outputValue = inputValue*0.001;
                } else if (fromIndex == 6 && toIndex == 5) {
                    outputValue = inputValue*1000;
                } else if (fromIndex == 6 && toIndex == 6) {
                    outputValue = inputValue;
                }

                // Perform other conversion operations for the other unit combinations...

                // Set the converted value in the output_conv TextView
                output_conv.setText(String.valueOf(outputValue));
            }
        });













        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                input_conv.setText(data + "0");
            }
        });

        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                input_conv.setText(data + "00");
            }
        });


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                input_conv.setText(data + "1");
            }
        });


        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                input_conv.setText(data + "2");
            }
        });


        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                input_conv.setText(data + "3");
            }
        });


        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                input_conv.setText(data + "4");
            }
        });



        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                input_conv.setText(data + "5");
            }
        });



        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                input_conv.setText(data + "6");
            }
        });


        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                input_conv.setText(data + "7");
            }
        });


        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                input_conv.setText(data + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                input_conv.setText(data + "9");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_conv.getText().toString();
                if(!isOperatorPressed){
                    input_conv.setText(data + ".");
                    isOperatorPressed = true;
                }
            }
        });

        btn_ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_conv.setText("");
                output_conv.setText("");
                isOperatorPressed = false;
            }
        });

        btn_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = input_conv.getText().toString();
                if (currentText.length() > 0) {
                    String newText = currentText.substring(0, currentText.length() - 1);
                    input_conv.setText(newText);
                    isOperatorPressed = false;
                }
            }
        });




    }
}