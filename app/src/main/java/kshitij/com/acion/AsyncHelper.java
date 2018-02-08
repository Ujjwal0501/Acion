package kshitij.com.acion;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by Ujjwal on 06-02-2018.
 */

public class AsyncHelper extends AsyncTask <Void, Void, Void> {

    Context mContext;
    ProgressDialog progressDrawable;

    AsyncHelper(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        if (true) {
            try {
                wait(5500);
            } catch (InterruptedException e) {
                Log.i("error", ""+e);
            }
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        progressDrawable = new ProgressDialog(mContext);
        progressDrawable.setTitle("Starting App");
        progressDrawable.setMax(10);
        progressDrawable.setProgress(0);
        progressDrawable.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDrawable.show();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        progressDrawable.hide();
    }

}