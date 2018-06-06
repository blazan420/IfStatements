package com.example.kjobrien.ifstatements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create Objects
        final TextView txtResult = (TextView) findViewById(R.id.txtResult);
        final EditText edtNumber = (EditText) findViewById(R.id.edtNumber);
        Button btnResult = (Button) findViewById(R.id.btnResult);


        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFieldValue = edtNumber.getText() + "";

                String result = "";

                /*if (textFieldValue.contains("420")) {
                    //  txtResult.setText(textFieldValue + " Blaze IT!");
                    result = " Blaze IT!";

                } else {

                    // txtResult.setText("The value is not 420, and the value is " + textFieldValue);
                    result = "The value is not 420, and the value is " + textFieldValue;

                }*/

                if (textFieldValue.contains("90")) {
                    result = "Your Grade is A and your number is: " + textFieldValue;
                } else if (textFieldValue.contains("80")) {
                    result = "Your Grade is B and your number is: " + textFieldValue;
                } else if (textFieldValue.contains("70")) {
                    result = "Your Grade is C and your number is: " + textFieldValue;
                } else if (textFieldValue.contains("60")) {
                    result = "Your Grade is F and your number is: " + textFieldValue;
                } else {
                    result = "you are not sufficient";
                }
            {
                txtResult.setText(result);
            }





                txtResult.setText(result);

        }
    });

}
}
