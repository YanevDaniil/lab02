package g313.yanev.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText tA;
    EditText tB;
    TextView tR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tA = findViewById(R.id.txtA);
        tB = findViewById(R.id.txtB);
        tR = findViewById(R.id.txtRes);
    }

    public void add_click(View v) {
        String sA = tA.getText().toString();
        String sB = tB.getText().toString();

        if (sA.equals("") || sB.equals("")) {
            tR.setText("Empty values");
            return;
        }

        double a = Double.parseDouble(sA);
        double b = Double.parseDouble(sB);

        double res = a + b;
        tR.setText(String.valueOf(res));
    }
    public void sub_click(View v) {
        String sA = tA.getText().toString();
        String sB = tB.getText().toString();

        if (sA.equals("") || sB.equals("")) {
            tR.setText("Empty values");
            return;
        }

        double a = Double.parseDouble(sA);
        double b = Double.parseDouble(sB);

        double res = a - b;
        tR.setText(String.valueOf(res));
    }
    public void mul_click(View v) {
        String sA = tA.getText().toString();
        String sB = tB.getText().toString();

        if (sA.equals("") || sB.equals("")) {
            tR.setText("Empty values");
            return;
        }

        double a = Double.parseDouble(sA);
        double b = Double.parseDouble(sB);

        double res = a * b;
        tR.setText(String.valueOf(res));
    }
    public void div_click(View v) {
        String sA = tA.getText().toString();
        String sB = tB.getText().toString();

        if (sA.equals("") || sB.equals("")) {
            tR.setText("Empty values");
            return;
        }

        double a = Double.parseDouble(sA);
        double b = Double.parseDouble(sB);

        if (b == 0) {
            tR.setText("На ноль делить нельзя!");
        } else {
            double res = a / (double)b;
            tR.setText(String.valueOf(res));
        }

    }

    public void sin_click(View v) {
        String sA = tA.getText().toString();
        String sB = tB.getText().toString();

        float a = (float) (Float.parseFloat(sA) / 180 * Math.PI);

        double res = (float) Math.sin(a);

        tR.setText(String.valueOf(res));
    }

    public void cos_click(View v) {
        String sA = tA.getText().toString();

        float a = (float) (Float.parseFloat(sA) / 180 * Math.PI);

        double res = (float) Math.cos(a);

        tR.setText(String.valueOf(res));
    }

    public void sqrt_click(View v) {
        String sA = tA.getText().toString();

        double a = Double.parseDouble(sA);

        if (a < 0) {
            tR.setText(String.valueOf("Value below zero"));
        } else {
            double res = Math.sqrt(a);
            tR.setText(String.valueOf(res));
        }
    }

    public void pow_click(View v) {
        String sA = tA.getText().toString();
        String sB = tB.getText().toString();

        double a = Double.parseDouble(sA);
        double b = Double.parseDouble(sB);

        double res = Math.pow(a, b);
        tR.setText(String.valueOf(res));
    }
}