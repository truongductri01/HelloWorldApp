package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // User can tap a button to change the text color of the label
        findViewById(R.id.textBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the color of the label
                ((TextView) findViewById(R.id.textLabel)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        //User can tap a button to change the color of the background view.
        findViewById(R.id.backgroundBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.purple_700));
            }
        });

        // User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.changeTextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textLabel)).setText("Android is Awesome!");
            }
        });

        // User can tap on the background view to reset all views to default settings.
        // Reset text to Hello from Tri
        // Reset background and text color
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change the text and its color
                TextView textView = findViewById(R.id.textLabel);
                textView.setText("Hello from Tri Truong");
                textView.setTextColor(getResources().getColor(R.color.text_default));

                // Change the background color
                View view1 = findViewById(R.id.parent);
                view1.setBackgroundColor(getResources().getColor(R.color.background_default));
            }
        });

        /*
        * User can update the label text with custom text entered into the text field.
            * a. User can enter text into a text field using the keyboard.
            * b. User can tap the “Change text string” button to update the label with the text from the text field.
            * c. If the text field is empty, update label with default text string.
        * */
        findViewById(R.id.customTextChangeBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change the textView
                TextView textView = findViewById(R.id.textLabel);
                EditText editText = findViewById(R.id.editText);
                if (editText.getText().toString().isEmpty()){
                    textView.setText("Hello from Tri Truong");
                }
                else{
                    textView.setText(editText.getText().toString());
                }
            }
        });

    }
}