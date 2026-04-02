package com.example.scientificcalculator;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvScreen;
    private TextView tvCalculation;
    private SharedPreferences sharedPreferences;

    TextView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
            btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20,
            btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30,
            btn31, btn32, btn33, btn34, btn35, btn36, btn37, btn38, btn39, btn40,
            btn41, btn42, btn43, btn44, btn45, btn46, btn47, btn48, btn49, btn50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScreen = findViewById(R.id.tv_screen);
        tvCalculation = findViewById(R.id.tv_calculation);
        tvScreen.setText("");
        
        sharedPreferences = getSharedPreferences("CalculatorMemory", MODE_PRIVATE);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);
        btn26 = findViewById(R.id.btn26);
        btn27 = findViewById(R.id.btn27);
        btn28 = findViewById(R.id.btn28);
        btn29 = findViewById(R.id.btn29);
        btn30 = findViewById(R.id.btn30);
        btn31 = findViewById(R.id.btn31);
        btn32 = findViewById(R.id.btn32);
        btn33 = findViewById(R.id.btn33);
        btn34 = findViewById(R.id.btn34);
        btn35 = findViewById(R.id.btn35);
        btn36 = findViewById(R.id.btn36);
        btn37 = findViewById(R.id.btn37);
        btn38 = findViewById(R.id.btn38);
        btn39 = findViewById(R.id.btn39);
        btn40 = findViewById(R.id.btn40);
        btn41 = findViewById(R.id.btn41);
        btn42 = findViewById(R.id.btn42);
        btn43 = findViewById(R.id.btn43);
        btn44 = findViewById(R.id.btn44);
        btn45 = findViewById(R.id.btn45);
        btn46 = findViewById(R.id.btn46);
        btn47 = findViewById(R.id.btn47);
        btn48 = findViewById(R.id.btn48);
        btn49 = findViewById(R.id.btn49);
        btn50 = findViewById(R.id.btn50);

        setupListeners();
    }



    private void setupListeners() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("(");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append(")");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("memory_val", "");
                editor.apply();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double currentValue = Double.parseDouble(tvScreen.getText().toString());
                    String memoryStr = sharedPreferences.getString("memory_val", "0");
                    double memoryValue = memoryStr.isEmpty() ? 0 : Double.parseDouble(memoryStr);
                    memoryValue += currentValue;
                    
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    String newMemoryStr = String.valueOf(memoryValue);
                    if (newMemoryStr.endsWith(".0")) newMemoryStr = newMemoryStr.replace(".0", "");
                    editor.putString("memory_val", newMemoryStr);
                    editor.apply();
                } catch (NumberFormatException e) {
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double currentValue = Double.parseDouble(tvScreen.getText().toString());
                    String memoryStr = sharedPreferences.getString("memory_val", "0");
                    double memoryValue = memoryStr.isEmpty() ? 0 : Double.parseDouble(memoryStr);
                    memoryValue -= currentValue;
                    
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    String newMemoryStr = String.valueOf(memoryValue);
                    if (newMemoryStr.endsWith(".0")) newMemoryStr = newMemoryStr.replace(".0", "");
                    editor.putString("memory_val", newMemoryStr);
                    editor.apply();
                } catch (NumberFormatException e) {
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String memory = sharedPreferences.getString("memory_val", "");
                if (!memory.isEmpty()) {
                    tvScreen.append(memory);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("^2");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("^3");
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("^");
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append(Math.E + "^");
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("10^");
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("1/(");
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("sqrt(");
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("cbrt(");
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("yroot(");
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("ln(");
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("log(");
            }
        });

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("!");
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("sin(");
            }
        });

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("cos(");
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("tan(");
            }
        });

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("e");
            }
        });

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("E");
            }
        });

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append(String.valueOf(Math.random()));
            }
        });

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("sinh(");
            }
        });

        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("cosh(");
            }
        });

        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("tanh(");
            }
        });

        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("π");
            }
        });

        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = tvScreen.getText().toString();
                if (!currentText.isEmpty()) {
                    tvScreen.setText(currentText.substring(0, currentText.length() - 1));
                }
            }
        });

        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.setText("");
                if (tvCalculation != null) tvCalculation.setText("");
            }
        });

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("%");
            }
        });

        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("÷");
            }
        });

        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("7");
            }
        });

        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("8");
            }
        });

        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("9");
            }
        });

        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("×");
            }
        });

        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("4");
            }
        });

        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("5");
            }
        });

        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("6");
            }
        });

        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("−"); // Minus operator
            }
        });

        btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("1");
            }
        });

        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("2");
            }
        });

        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("3");
            }
        });

        btn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("+");
            }
        });

        btn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = tvScreen.getText().toString();
                if (currentText.startsWith("-")) {
                    tvScreen.setText(currentText.substring(1));
                } else {
                    tvScreen.setText("-" + currentText);
                }
            }
        });

        btn48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append("0");
            }
        });

        btn49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.append(".");
            }
        });

        btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String currentText = tvScreen.getText().toString();
                    if (currentText.isEmpty()) return;
                    String expression = currentText
                            .replace("×", "*")
                            .replace("÷", "/")
                            .replace("−", "-")
                            .replace("π", "pi")
                            .replace("log(", "log10(")
                            .replace("ln(", "log(")
                            .replace("sin(", "sind(")
                            .replace("cos(", "cosd(")
                            .replace("tan(", "tand(");
                    
                    // Basic factorial text substitution since exp4j doesn't naturally do postfix
                    expression = expression.replaceAll("(\\d+)!", "fact($1)");

                    net.objecthunter.exp4j.function.Function fact = new net.objecthunter.exp4j.function.Function("fact", 1) {
                        @Override
                        public double apply(double... args) {
                            return org.apache.commons.math3.util.CombinatoricsUtils.factorialDouble((int) args[0]);
                        }
                    };

                    net.objecthunter.exp4j.function.Function sind = new net.objecthunter.exp4j.function.Function("sind", 1) {
                        @Override
                        public double apply(double... args) {
                            return Math.sin(Math.toRadians(args[0]));
                        }
                    };

                    net.objecthunter.exp4j.function.Function cosd = new net.objecthunter.exp4j.function.Function("cosd", 1) {
                        @Override
                        public double apply(double... args) {
                            return Math.cos(Math.toRadians(args[0]));
                        }
                    };

                    net.objecthunter.exp4j.function.Function tand = new net.objecthunter.exp4j.function.Function("tand", 1) {
                        @Override
                        public double apply(double... args) {
                            return Math.tan(Math.toRadians(args[0]));
                        }
                    };

                    net.objecthunter.exp4j.Expression exp = new net.objecthunter.exp4j.ExpressionBuilder(expression)
                            .function(fact)
                            .function(sind)
                            .function(cosd)
                            .function(tand)
                            .build();

                    double result = exp.evaluate();
                    String resultStr = String.valueOf(result);
                    if (resultStr.endsWith(".0")) {
                        resultStr = resultStr.replace(".0", "");
                    }
                    tvCalculation.setText(currentText + " =");
                    tvScreen.setText(resultStr);

                    // Save result to SharedPreferences for Memory
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("last_result", resultStr);
                    editor.apply();

                } catch (Exception e) {
                    tvScreen.setText("Maths error");
                }
            }
        });
    }
}
