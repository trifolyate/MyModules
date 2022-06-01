package sg.edu.rp.c346.id21008946.mymodules;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    CardView cv1,cv2,cv3,cv4,cv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        cv1 = findViewById(R.id.cardView);
        cv2 = findViewById(R.id.cardView2);
        cv3 = findViewById(R.id.cardView3);
        cv4 = findViewById(R.id.cardView4);
        cv5 = findViewById(R.id.cardView5);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this,ResultPage.class);
                intent.putExtra("ModuleName","IT Security and Management");
                intent.putExtra("ModuleCode","C235-5D-E65H-A");
                intent.putExtra("AcademicYear","2022");
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","E65H");
                startActivity(intent);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this,ResultPage.class);
                intent.putExtra("ModuleName","Web Appln Development in php");
                intent.putExtra("ModuleCode","C203-4D-W65H-A");
                intent.putExtra("AcademicYear","2022");
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W65H");
                startActivity(intent);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this,ResultPage.class);
                intent.putExtra("ModuleName","UI/UX Design for Apps");
                intent.putExtra("ModuleCode","C218-1D-E66B-A");
                intent.putExtra("AcademicYear","2022");
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","E66B");
                startActivity(intent);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this,ResultPage.class);
                intent.putExtra("ModuleName","Software Development Process");
                intent.putExtra("ModuleCode","C206-2D-E66K-A");
                intent.putExtra("AcademicYear","2022");
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","E66K");
                startActivity(intent);
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this,ResultPage.class);
                intent.putExtra("ModuleName","Mobile App Development");
                intent.putExtra("ModuleCode","C346-3D-E62E-A");
                intent.putExtra("AcademicYear","2022");
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","E62E");
                startActivity(intent);
            }
        });

    }
}