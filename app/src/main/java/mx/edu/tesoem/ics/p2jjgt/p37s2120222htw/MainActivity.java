package mx.edu.tesoem.ics.p2jjgt.p37s2120222htw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtnum1, txtnum2;
    Button btncalcula, btncalcula2, btncalcula3, btncalcula4;
    TextView lblresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        lblresult = findViewById(R.id.lblresult);

        btncalcula= findViewById(R.id.btncalcula);
        btncalcula2= findViewById(R.id.btncalcula2);
        btncalcula3=findViewById(R.id.btncalcula3);
        btncalcula4=findViewById(R.id.btncalcula4);


        btncalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(txtnum1.getText().toString());
                int num2 =Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText(String.valueOf(num1+num2));
            }
        });

        btncalcula2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(txtnum1.getText().toString());
                int num2 =Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText(String.valueOf(num1-num2));
            }
        });
        btncalcula3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(txtnum1.getText().toString());
                int num2 =Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText(String.valueOf(num1*num2));
            }
        });
        btncalcula4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(txtnum1.getText().toString());
                int num2 =Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText(String.valueOf(num1/num2));
            }
        });
    }
}
