package kshitij.com.acion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    private Button searchbyingredients,searchbyname,random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Select your choice!");
        setContentView(R.layout.activity_first);
        searchbyingredients = findViewById(R.id.ingredients);
        searchbyname = findViewById(R.id.name);
        random = findViewById(R.id.random);

        searchbyingredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });




    }
}
