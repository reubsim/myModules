package sg.edu.rp.c346.id21019352.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;
    TextView tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textViewC346);
        tvC349 = findViewById(R.id.textViewC349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);

                intent.putExtra("code","C346");
                intent.putExtra("name","Android Programming");
                intent.putExtra("year","2020");
                intent.putExtra("semester","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","W66M");

                startActivity(intent);

            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);

                intent.putExtra("code","C349");
                intent.putExtra("name","iPad Programming");
                intent.putExtra("year","2022");
                intent.putExtra("semester","2");
                intent.putExtra("credit","4");
                intent.putExtra("venue","W66H");

                startActivity(intent);

            }
        });

    }
}