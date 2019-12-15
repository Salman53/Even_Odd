package com.example.even_odd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    Button btn,btr,btnf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1=findViewById(R.id.in1);
        e2=findViewById(R.id.in2);
        btn =findViewById(R.id.btnr);
        btr=findViewById(R.id.btns);
        btnf=findViewById(R.id.fac);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ist= e1.getText().toString();
                int num1 = Integer.parseInt(ist);

                String sec= e2.getText().toString();
                int num2 = Integer.parseInt(sec);

                if (num1 <= num2)
                {
                    Toast.makeText(MainActivity.this, "number one is less than num2", Toast.LENGTH_SHORT).show();
                }
                else

                {
                    Toast.makeText(MainActivity.this, "number one is greater than num2", Toast.LENGTH_SHORT).show();
                }
            }
        });



        btr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ist= e1.getText().toString();
                int num = Integer.parseInt(ist);

                if ( num%2==0)
                {
                    Toast.makeText(MainActivity.this, "even", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "odd", Toast.LENGTH_SHORT).show();
                }
            }
        });



        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ist= e1.getText().toString();
                int num = Integer.parseInt(ist);
                int fat = 1;

                for (int i=1;i<=num;i++)
                {
                    fat = fat*i;
                }
                Toast.makeText(MainActivity.this, "factorial "+fat , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
