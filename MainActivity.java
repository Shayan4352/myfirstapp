package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(24, 32, 24, 24);
        layout.setGravity(Gravity.CENTER_HORIZONTAL);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("ABUZAR GHAZI");
        title.setTextSize(28);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Motorcycle Parts & Prices");
        subtitle.setTextSize(18);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setGravity(Gravity.CENTER);
        layout.addView(subtitle);

        addPart(layout, "Motorcycle Chain", "250 AFN");
        addPart(layout, "Spark Plug", "150 AFN");
        addPart(layout, "Brake Shoe", "300 AFN");

        TextView address = new TextView(this);
        address.setText(
            "Shop Address:\n" +
            "Afghanshahi, Tar Sang,\n" +
            "Jalalabad, Nangarhar, Afghanistan"
        );
        address.setTextSize(16);
        address.setTextColor(Color.DKGRAY);
        address.setGravity(Gravity.CENTER);
        address.setPadding(0, 24, 0, 12);
        layout.addView(address);

        TextView developer = new TextView(this);
        developer.setText("Developed by Abubaker Murad");
        developer.setTextSize(14);
        developer.setTextColor(Color.GRAY);
        developer.setGravity(Gravity.CENTER);
        developer.setPadding(0, 12, 0, 12);
        layout.addView(developer);

        TextView message = new TextView(this);
        message.setText("Welcome to our shop!");
        message.setTextSize(16);
        message.setTextColor(Color.BLACK);
        message.setGravity(Gravity.CENTER);
        layout.addView(message);

        Button button = new Button(this);
        button.setText("Contact Shop");
        button.setOnClickListener(v ->
            message.setText("Please visit our shop for orders!")
        );
        layout.addView(button);

        setContentView(layout);
    }

    private void addPart(
            LinearLayout layout,
            String name,
            String price) {

        TextView item = new TextView(this);
        item.setText(name + "  —  " + price);
        item.setTextSize(18);
        item.setTextColor(Color.BLACK);
        item.setPadding(8, 20, 8, 20);
        layout.addView(item);
    }
}
