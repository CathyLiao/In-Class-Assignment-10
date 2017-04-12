package com.example.android.inclassassignment10jingyuanl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toActivity(View view) {
        String option = ((Button) view).getText().toString().toLowerCase();
        switch (option) {
            case "object":
                Intent intent1 = new Intent(this, ObjectActivity.class);
                startActivity(intent1);
                break;

            case "camera":
                Intent intent2 = new Intent(this, CameraActivity.class);
                startActivity(intent2);
                break;

            case "list":
                Intent intent3 = new Intent(this, ListActivity.class);
                startActivity(intent3);
                break;

            case "storage":
                Intent intent4 = new Intent(this, StorageActivity.class);
                startActivity(intent4);
                break;

            default:
                break;
        }

    }
}
