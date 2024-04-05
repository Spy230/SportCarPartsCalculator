package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class TicketDisplayActivity extends AppCompatActivity {
    private TextView outputPrice;
    private Button newTicketButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        outputPrice = findViewById(R.id.outputPrice);
        newTicketButton = findViewById(R.id.newTicketButton);


        Intent intent = getIntent();
        BusTicket ticket = (BusTicket) intent.getSerializableExtra("ticket");

        String ticketData = "id пользователя: " + ticket.getUserId() +
                "\nместо отправки: " + ticket.getDeparture() +
                "\nвремя отправления: " + ticket.getDepartureTime() +
                "\nвремя прибытия: " + ticket.getArrivalTime() +
                "\nЦена: " + ticket.getPrice();

        outputPrice.setText(ticketData);

        newTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent newTicketIntent = new Intent(TicketDisplayActivity.this, TicketInputActivity.class);
                startActivity(newTicketIntent);
            }
        });
    }
}