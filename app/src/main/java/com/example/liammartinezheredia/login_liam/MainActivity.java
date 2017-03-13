package com.example.liammartinezheredia.login_liam;

import android.widget.CheckBox;
import android.widget.TextView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    Boolean Ursb , Ctrb, Control, check;


    public void Ingresar (View miView) {
        try {
       /* if (((CheckBox) miView).isChecked()){
            check = true;

        }
        else{
            check= false;
        }*/
            final TextView TextUsr = (TextView) findViewById(R.id.TextUsr);

            final TextView TextContra = (TextView) findViewById(R.id.TextContra);


                if (TextUsr.getText().toString().equals("liam")) {
                    //Ursb = true;
                    if (TextContra.getText().toString().equals("2015090421")) {
                        //Ctrb = true;
                        Control = true;

                    } else {
                        Ctrb = false;
                        Toast.makeText(this, "Boleta Incorrecta", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Ursb = false;
                    Toast.makeText(this, "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
                }

                if (Control == true) {
                    Toast.makeText(this, " Datos Correctos ;v", Toast.LENGTH_SHORT).show();

                    Intent Calculadora = new Intent(getApplicationContext(), Calculadora.class);
                    startActivity(Calculadora);
                }
            else {
                Toast.makeText(this, "Eres un bot prro", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e){
            Toast.makeText(this,"Datos Incorrectos prro", Toast.LENGTH_SHORT).show();
        }



        /*if (TextContra.getText().toString().equals("2015090421")){
            Ctrb = true;

        }

        else{
            Ctrb = false;
            Toast.makeText(this,"Boleta Incorrecta", Toast.LENGTH_SHORT).show();
        }

        if((Ursb = true ) && (Ctrb = true) ){

            Toast.makeText(this," Datos Correctos ;v", Toast.LENGTH_SHORT).show();

            Intent Calculadora = new Intent(getApplicationContext(), Calculadora.class);
            startActivity(Calculadora);
        }*/




    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
