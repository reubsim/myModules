package sg.edu.rp.c346.id21019352.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSemester;
    TextView tvCredit;
    TextView tvVenue;
    Button btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewModCode);
        tvName = findViewById(R.id.textViewModName);
        tvYear = findViewById(R.id.textViewAcadYear);
        tvSemester = findViewById(R.id.textViewSemester);
        tvCredit = findViewById(R.id.textViewModCred);
        tvVenue = findViewById(R.id.textViewVenue);
        btnList = findViewById(R.id.buttonList);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        String year = intentReceived.getStringExtra("year");
        String semester = intentReceived.getStringExtra("semester");
        String credit = intentReceived.getStringExtra("credit");
        String venue = intentReceived.getStringExtra("venue");

        tvCode.setText("Module Code: " + code);
        tvName.setText("Module Name: " + name);
        tvYear.setText("Academic Year: " + year);
        tvSemester.setText("Semester: " + semester);
        tvCredit.setText("Module Credit: " + credit);
        tvVenue.setText("Venue: " + venue);

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent back = new Intent(ModuleDetailActivity.this, MainActivity.class);
                    startActivity(back);
            }
        });
    }
}