package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    Spinner spinner;
    EditText editText;
    TextView txt;
    int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        spinner= findViewById(R.id.spinner);
        editText=findViewById(R.id.editText);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Toast.makeText(MainActivity.this, "0 selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "1 selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "2 selected", Toast.LENGTH_SHORT).show();
                        break;
                    default: break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        
        button.setOnClickListener((View view)->{
            Toast.makeText(this, "btn clicked", Toast.LENGTH_SHORT).show();

            try{
                int editTextval = Integer.parseInt(editText.getText().toString());

                switch(spinner.getSelectedItem().toString()){
                    case "Option1": sum=editTextval*10; break;
                    case "Option2": sum=editTextval*20; break;
                    case "Option3": sum=editTextval*20; break;
                    default:break;
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("INTKEY", sum);
                bundle.putString("STRINGKEY", spinner.getSelectedItem().toString());
                intent.putExtras(bundle);
                startActivity(intent);


            //testupdate
                //update from local

            }catch (Exception e){

            }
        });
    }
}
