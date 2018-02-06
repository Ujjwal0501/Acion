package kshitij.com.acion;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class IngredientSearch extends AppCompatActivity {
    Button addIngredient;
    TextInputEditText ingredient;
    ImageView search;
    LinearLayout layout;
    List<String> ingredients = new ArrayList<String>();
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Find to Cook");
        setContentView(R.layout.ingredient_search);
        addIngredient = findViewById(R.id.add);
        ingredient = findViewById(R.id.dishText);
        search = findViewById(R.id.findButton);
        layout= (LinearLayout)findViewById(R.id.layout);

        addIngredient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingredients.add(count, ingredient.getText().toString());
                if (ingredients.get(count).length() == 0) {
                    Toast.makeText(IngredientSearch.this, "No value was entered.", Toast.LENGTH_SHORT).show();
                    return ;
                }
                addIngredient(ingredients.get(count));
                ingredient.setText("");
                count++;
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 0) {
                    Toast.makeText(IngredientSearch.this, "No Search value was found.", Toast.LENGTH_SHORT).show();
                    return ;
                }
                else {
                    Log.i("check", ""+ingredients);
                }
            }
        });
    }

    public void addIngredient(String str) {
         LayoutInflater layoutInflater =
                 (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         final View addView = layoutInflater.inflate(R.layout.ingredient_row, null);
         final TextView textOut = (TextView)addView.findViewById(R.id.textout);
         textOut.setText(str);
         Button buttonRemove = (Button)addView.findViewById(R.id.remove);
         buttonRemove.setOnClickListener(new View.OnClickListener(){

             @Override
             public void onClick(View v) {
                 ((LinearLayout)addView.getParent()).removeView(addView);
                 for (int i= 0; i < ingredients.size(); i++) {
                     if (ingredients.get(i) == textOut.getText().toString())
                         ingredients.remove(i);
                 }
                 count--;
                 Log.i("id","");
             }});
         layout.addView(addView);
    }
}