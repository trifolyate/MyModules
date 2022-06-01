package sg.edu.rp.c346.id21008946.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultPage extends AppCompatActivity {

    TextView tvResult;
    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        tvResult = findViewById(R.id.finalresultTv);
        btnHome = findViewById(R.id.homeBtn);

        Intent intent = getIntent();
        String result = String.format("Module Name: %s\nModule Code: %s\nAcademic Year: %s\nSemester: %s\nModule Credit: %s\nVenue: %s"
                ,intent.getStringExtra("ModuleName"),
                intent.getStringExtra("ModuleCode"),
                intent.getStringExtra("AcademicYear"),
                intent.getIntExtra("Semester",0),
                intent.getIntExtra("ModuleCredit",0),
                intent.getStringExtra("Venue"));
        tvResult.setText(result);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });

    }
}