package my.edu.utar.trynavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstTimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time);

        //        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//        boolean isFirstTime = sharedPreferences.getBoolean("isFirstTime", true);
//
//        if (isFirstTime) {
//            // Display your page
//            setContentView(R.layout.activity_main);
//
//            // Set the value of isFirstTime to false
//            SharedPreferences.Editor editor = sharedPreferences.edit();
//            editor.putBoolean("isFirstTime", false);
//            editor.apply();
//        } else {
//            // Display your main activity
//            Intent intent = new Intent(this, CalendarActivity.class);
//            startActivity(intent);
//            finish();
//        }

        Button btn = findViewById(R.id.RegisterButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstTimeActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    public void clickToView(View view) {
        Intent intent = new Intent(this, LogInActivity.class);
        startActivity(intent);
    }
}