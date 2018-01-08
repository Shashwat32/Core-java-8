package com.soft.eternal.corejavapro;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Instructions extends AppCompatActivity {

    static Long id ;
    static String title ;
    static String category ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_instructions);
        Button submit = (Button)findViewById(R.id.submit);
        this.setTitle("INSTRUCTIONS");
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Bundle extras = getIntent().getExtras();
                id =  extras.getLong(Home.TITLE_ID_EXTRA);
                title = extras.getString(Home.TITLE_TITLE_EXTRA);
                category = extras.getString(Home.TITLE_CATEGORY_EXTRA);



                Intent intent = new Intent(Instructions.this, MockTest.class);

                intent.putExtra(Home.TITLE_ID_EXTRA, id);
                intent.putExtra(Home.TITLE_TITLE_EXTRA, title);
                intent.putExtra(Home.TITLE_CATEGORY_EXTRA, category);

                startActivity(intent);
            }

        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
