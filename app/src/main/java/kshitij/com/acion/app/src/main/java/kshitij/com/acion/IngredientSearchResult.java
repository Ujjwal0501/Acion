package kshitij.com.acion;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Ujjwal on 06-02-2018.
 */

public class IngredientSearchResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Results");
        setContentView(R.layout.list_result);

        //get search value
        Bundle extras = getIntent().getExtras();
        String[] ingredients = null;
        if (extras != null) {
            ingredients = extras.getStringArray("list");
        }

        try {
            Context mContext = getApplicationContext();
            SQLiteDatabase mDatabase = new DBHelper(mContext).getReadableDatabase();

            Cursor mCursor = mDatabase.rawQuery("SELECT * FROM appdb;", null);
            mCursor.moveToFirst();

        } catch (RuntimeException e) {
            Toast.makeText(IngredientSearchResult.this, ""+e, Toast.LENGTH_SHORT).show();
        }
    }
}
