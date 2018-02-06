package kshitij.com.acion;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class NameSearchResult extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Results");
        setContentView(R.layout.list_result);
        layout = (LinearLayout) findViewById(R.id.grid_view);

        //get search value
        Bundle extras = getIntent().getExtras();
        String value = "";
        if (extras != null) {
            value = extras.getString("key_dishname");
        }

        try {
            Context mContext = getApplicationContext();
            final SQLiteDatabase mDatabase = new DBHelper(mContext).getReadableDatabase();

            value = "SELECT * FROM appdb WHERE name LIKE \'%"+value+"%\';";
            Cursor mCursor = mDatabase.rawQuery(value, null);
            int count = mCursor.getCount();

            if (count == 0) {
                Log.i("check","Zero results");
                emptyResult();
            }
            else {
                Log.i("check","Non-Zero results");
                mCursor.moveToFirst();
                for (int i = 0; i < count; i++) {
                    addRow(mCursor);
                }
            }
        }   catch (RuntimeException e) {
            Toast.makeText(NameSearchResult.this, e+"", Toast.LENGTH_LONG).show();
        }
    }

    public void emptyResult() {
        LinearLayout addView = new LinearLayout(NameSearchResult.this);
        addView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        layout.addView(addView);
        TextView textView = new TextView(this);
        textView.setText("No Results were found");
        layout.addView(textView);
    }

    public void addRow(Cursor mCursor) {

        LayoutInflater layoutInflater =
                (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View addView = layoutInflater.inflate(R.layout.list_result_row, null);
        TextView recipeName = (TextView) addView.findViewById(R.id.tvRecipeName);
        TextView difficulty = (TextView) addView.findViewById(R.id.tvDifficulty);
        TextView time = (TextView) addView.findViewById(R.id.tvTime);
        TextView serves = (TextView) addView.findViewById(R.id.tvServes);
        recipeName.setText(mCursor.getString(0).toString());
        difficulty.setText("3 / 5");
        time.setText("15 min");
        serves.setText("3 serves");
        layout.addView(addView);

        LinearLayout addView1 = new LinearLayout(NameSearchResult.this);
        addView1.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 25
        ));
        layout.addView(addView1);
    }
}
