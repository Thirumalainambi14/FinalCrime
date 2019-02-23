package com.example.crimebit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class fileComplaint extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_complaint);
        spinner=(Spinner)findViewById(R.id.Spinnerid);
        String[] stations={"Nerul","Thane","Mulund","Dadar","Bhandup","Belapur"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,stations);
        spinner.setAdapter(adapter);
    }

    public void sendMessage(View view)
    {
        EditText editText=findViewById(R.id.Subject_edit);
        String message = editText.getText().toString();

        Intent intent = new Intent(this,filedComplain.class);
        intent.putExtra("Extra_Message",message);
        startActivity(intent);
    }
}
