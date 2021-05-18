package sg.edu.rp.c346.id19013886.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Step 1: Declare the field variables
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 2: Link the field variable to UI components in Layout
        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textViewDisplay);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Code for the action
                Log.i("MyActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();

                if (cbEnabled.isChecked()){
                    double pay = calcPay(100, 20);
                    String msg = "The discount is given. You need to pay " + pay;
                    tvShow.setText(msg);
                } else {
                    double pay = calcPay(100, 0);
                    String msg = "The discount is not given. You need to pay " + pay;
                    tvShow.setText(msg);
                }
            }
        });

    }

    private double calcPay(double price, double discount){
        double pay = price * (1-discount/10);
        return pay;
    }

}