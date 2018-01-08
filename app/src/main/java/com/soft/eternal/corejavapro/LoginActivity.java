package com.soft.eternal.corejavapro;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {
    final Activity activity = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        final EditText userName = (EditText) findViewById(R.id.user);
        final Button next = (Button) findViewById(R.id.next);
        /*userName.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    handled = true;
                }
                return handled;
            }
        });*/
        userName.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_SEND)) {
                    next.performClick();
                }
                return false;
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (userName.getText().toString().trim().equals("")) {

                    userName.setError("Name is required!");

                } else {
                    SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(activity);
                    SharedPreferences.Editor editor = sharedPrefs.edit();
                    editor.putString("userName", userName.getText().toString());
                    editor.commit();
                    Intent i = new Intent(getApplicationContext(), UploadPhoto.class);
                    startActivity(i);
                }
            }
        });
        /**userName.setImeActionLabel("DONE", KeyEvent.KEYCODE_ENTER);
        userName.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    next.performClick();
                    return true;
                }
                return false;
            }
        });**/

    }
}
