package com.example.darioalexanderpaz.appnotas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_Cont extends AppCompatActivity {

    private EditText edt1,edt2,edt3,edt21,edt22,edt23,edt31,edt32,edt33;
    private TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__cont);


        //Calculo para Materia 1

        SharedPreferences prefe1=getSharedPreferences("Desarrollo", Context.MODE_PRIVATE);

        edt1=(EditText)findViewById(R.id.edt1);
        edt1.setText(prefe1.getString("p","0"));

        edt2=(EditText)findViewById(R.id.edt2);
        edt2.setText(prefe1.getString("s","0"));

        edt3=(EditText)findViewById(R.id.edt3);
        edt3.setText(prefe1.getString("t","0"));

        txt1=(TextView)findViewById(R.id.txt1);
        txt1.setText(prefe1.getString("resultado","0"));

        edt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("Desarrollo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();

                    String t1=edt1.getText().toString();
                    editor.putString("p", edt1.getText().toString());
                    String t2=edt2.getText().toString();
                    String t3=edt3.getText().toString();

                    double n1=Double.valueOf(t1);
                    double n2=Double.valueOf(t2);
                    double n3=Double.valueOf(t3);

                    if(n1>=0 && n1<=6){
                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul=Double.toString(cal);
                        editor.putString("resultado", resul);

                        editor.commit();
                        txt1.setText(resul);

                    }
                    else{
                        Toast not= Toast.makeText(MainActivity_Cont.this,getString(R.string.error), Toast.LENGTH_LONG);
                        not.show();
                    }

                } catch (Exception e) {

                }}

        });

        edt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("Desarrollo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t1=edt1.getText().toString();
                    String t2=edt2.getText().toString();
                    editor.putString("s", edt2.getText().toString());
                    String t3=edt3.getText().toString();

                    double n1=Double.valueOf(t1);
                    double n2=Double.valueOf(t2);
                    double n3=Double.valueOf(t3);

                    if(n2>=0 && n2<=6) {
                        double cal = (((n1 + n2) / 2) * 0.6) + (n3 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resultado", resul);

                        editor.commit();
                        txt1.setText(resul);
                    }
                    else {
                        Toast not= Toast.makeText(MainActivity_Cont.this,getString(R.string.error), Toast.LENGTH_LONG);
                        not.show();

                    }
                } catch (Exception e) {

                }}

        });

        edt3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("Desarrollo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t1=edt1.getText().toString();
                    String t2=edt2.getText().toString();
                    String t3=edt3.getText().toString();
                    editor.putString("t", edt2.getText().toString());

                    double n1=Double.valueOf(t1);
                    double n2=Double.valueOf(t2);
                    double n3=Double.valueOf(t3);

                    if(n3>=0 && n3<=6) {
                        double cal = (((n1 + n2) / 2) * 0.6) + (n3 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resulado", resul);

                        editor.commit();
                        txt1.setText(resul);
                    }
                    else {
                        Toast not= Toast.makeText(MainActivity_Cont.this,getString(R.string.error), Toast.LENGTH_LONG);
                        not.show();
                    }
                } catch (Exception e) {

                }}

        });

        //Calculo para Materia 2
        SharedPreferences prefe2=getSharedPreferences("Prog. Restrcciones", Context.MODE_PRIVATE);
        edt21=(EditText)findViewById(R.id.edt21);
        edt21.setText(prefe2.getString("p","0"));
        edt22=(EditText)findViewById(R.id.edt22);
        edt22.setText(prefe2.getString("s","0"));
        edt23=(EditText)findViewById(R.id.edt23);
        edt23.setText(prefe2.getString("t","0"));
        txt2=(TextView)findViewById(R.id.txt2);
        txt2.setText(prefe2.getString("resultado","0"));
        edt21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences preferencias=getSharedPreferences("Prog. Restrcciones", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();
                    String t31=edt21.getText().toString();
                    editor.putString("p", edt21.getText().toString());
                    String t32=edt22.getText().toString();
                    editor.putString("s", edt22.getText().toString());
                    String t33=edt23.getText().toString();
                    editor.putString("t", edt23.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    if (n31>=0 && n31<=6){
                        double cal=(((n31+n32)/2)*0.6)+(n33*0.4);
                        String resul=Double.toString(cal);
                        editor.putString("resultado", resul);

                        editor.commit();
                        txt2.setText(resul);
                    }
                    else {
                        Toast not= Toast.makeText(MainActivity_Cont.this,getString(R.string.error), Toast.LENGTH_LONG);
                        not.show();
                    }

                } catch (Exception e) {

                }}

        });
        edt22.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences preferencias=getSharedPreferences("Prog. Restrcciones", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();
                    String t31=edt21.getText().toString();
                    editor.putString("p", edt21.getText().toString());
                    String t32=edt22.getText().toString();
                    editor.putString("s", edt22.getText().toString());
                    String t33=edt23.getText().toString();
                    editor.putString("t", edt23.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    if (n32>=0 && n32<=6) {
                        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resultado", resul);

                        editor.commit();
                        txt2.setText(resul);
                    }
                    else{
                        Toast not= Toast.makeText(MainActivity_Cont.this,getString(R.string.error), Toast.LENGTH_LONG);
                        not.show();
                    }

                } catch (Exception e) {

                }}

        });
        edt23.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences preferencias=getSharedPreferences("Prog. Restrcciones", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();
                    String t31=edt21.getText().toString();
                    editor.putString("p", edt21.getText().toString());
                    String t32=edt22.getText().toString();
                    editor.putString("s", edt22.getText().toString());
                    String t33=edt23.getText().toString();
                    editor.putString("t", edt23.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    if (n33>=0 && n33<=6) {
                        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resultado", resul);

                        editor.commit();
                        txt2.setText(resul);
                    }
                    else{
                        Toast not= Toast.makeText(MainActivity_Cont.this,getString(R.string.error), Toast.LENGTH_LONG);
                        not.show();
                    }

                } catch (Exception e) {

                }}

        });

        //Calculo para Materia 3
        SharedPreferences prefe3=getSharedPreferences("Seguridad", Context.MODE_PRIVATE);
        edt31=(EditText)findViewById(R.id.edt31);
        edt31.setText(prefe3.getString("p","0"));
        edt32=(EditText)findViewById(R.id.edt32);
        edt32.setText(prefe3.getString("s","0"));
        edt33=(EditText)findViewById(R.id.edt33);
        edt33.setText(prefe3.getString("t","0"));
        txt3=(TextView)findViewById(R.id.txt3);
        txt3.setText(prefe3.getString("resultado","0"));

        edt31.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences preferencias=getSharedPreferences("Seguridad", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();

                    String t31=edt31.getText().toString();
                    editor.putString("p", edt31.getText().toString());

                    String t32=edt32.getText().toString();
                    editor.putString("s", edt32.getText().toString());

                    String t33=edt33.getText().toString();
                    editor.putString("t", edt33.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    if (n31>=0 && n31<=6) {
                        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resultado", resul);

                        editor.commit();
                        txt3.setText(resul);
                    }
                    else{
                        Toast not= Toast.makeText(MainActivity_Cont.this,getString(R.string.error), Toast.LENGTH_LONG);
                        not.show();
                    }
                } catch (Exception e) {

                }}

        });
        edt32.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences preferencias=getSharedPreferences("Seguridad", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();

                    String t31=edt31.getText().toString();
                    editor.putString("p", edt31.getText().toString());

                    String t32=edt32.getText().toString();
                    editor.putString("s", edt32.getText().toString());

                    String t33=edt33.getText().toString();
                    editor.putString("t", edt33.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    if (n32>=0 && n32<=6) {
                        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resultado", resul);

                        editor.commit();
                        txt3.setText(resul);
                    }
                    else{
                        Toast not= Toast.makeText(MainActivity_Cont.this,getString(R.string.error), Toast.LENGTH_LONG);
                        not.show();
                    }
                } catch (Exception e) {

                }}

        });

        edt33.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences preferencias=getSharedPreferences("Seguridad", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();

                    String t31=edt31.getText().toString();
                    editor.putString("p", edt31.getText().toString());

                    String t32=edt32.getText().toString();
                    editor.putString("s", edt32.getText().toString());

                    String t33=edt33.getText().toString();
                    editor.putString("t", edt33.getText().toString());

                    double n31=Double.valueOf(t31);
                    double n32=Double.valueOf(t32);
                    double n33=Double.valueOf(t33);

                    if (n33>=0 && n33<=6) {
                        double cal = (((n31 + n32) / 2) * 0.6) + (n33 * 0.4);
                        String resul = Double.toString(cal);
                        editor.putString("resultado", resul);

                        editor.commit();
                        txt3.setText(resul);
                    }
                    else{
                        Toast not= Toast.makeText(MainActivity_Cont.this,getString(R.string.error), Toast.LENGTH_LONG);
                        not.show();
                    }
                } catch (Exception e) {

                }}

        });

    }

    public void total(View v){

        String t1 =txt1.getText().toString();
        String t2 =txt2.getText().toString();
        String t3 =txt3.getText().toString();
        double n1 =0;
        double n2 =0;
        double n3 =0;

        n1 = Double.valueOf(t1);
        n2 = Double.valueOf(t2);
        n3 = Double.valueOf(t3);

        double total = (n1 + n2 + n3) / 3;

        Toast not = Toast.makeText(MainActivity_Cont.this, getString(R.string.aviso)+" "+String.format("%.2f",total), Toast.LENGTH_LONG);
        not.show();

    }

    public void acerca(View v){
        Intent i = new Intent(this, AcercaDe.class );
        startActivity(i);
    }
}
