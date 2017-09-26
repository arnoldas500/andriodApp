package com.arnoldas.myfirstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //click me is the name of the id tag of the button created on the xml page
    public void clickMe(View view){

        //edit text is the object or type of the text box then we also cast it from View to EditText
        //findviewbyid means find it somewhere on the screen by id in the resources (R) and the id i gave it is editText
        EditText myTextField = (EditText) findViewById(R.id.editText);

        //Log.i("clickMe","Hello, Arnold");
        //get the text from the text field i created and convert it to a string and send it to the log
        Log.i("TextField Value",myTextField.getText().toString());

        EditText passwordField = (EditText) findViewById(R.id.password);
        Log.i("PasswordField Value", passwordField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
