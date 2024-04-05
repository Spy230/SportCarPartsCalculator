package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TicketInputActivity extends AppCompatActivity {
    private EditText userIdEditText,departureEditText,arrivalEditText,arrivalTimeEditText,priceEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userIdEditText = findViewById(R.id.userIdEditText);
        departureEditText = findViewById(R.id.departureEditText);
        arrivalEditText = findViewById(R.id.arrivalEditText);
        arrivalTimeEditText = findViewById(R.id.arrivalEditText2); // Изменено на arrivalTimeEditText
        priceEditText = findViewById(R.id.priceEditText);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int userId = Integer.parseInt(userIdEditText.getText().toString());
                String departure = departureEditText.getText().toString();
                String arrival = arrivalEditText.getText().toString();
                String arrivalTime = arrivalTimeEditText.getText().toString();
                double price = Double.parseDouble(priceEditText.getText().toString());


                BusTicket ticket = new BusTicket(userId, departure, arrival, arrivalTime, price);


                Intent intent = new Intent(TicketInputActivity.this, TicketDisplayActivity.class);
                intent.putExtra("ticket", ticket);
                startActivity(intent);
            }
        });
    }
}