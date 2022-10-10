package vn.edu.stu.demointent_sendreceiveobject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import vn.edu.stu.demointent_sendreceiveobject.model.Sinhvien;

public class MainActivity extends AppCompatActivity {
    EditText etMa, etTen;
    Button btnGui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        etMa = findViewById(R.id.etMa);
        etTen = findViewById(R.id.etTen);
        btnGui = findViewById(R.id.btnGui);
    }

    private void addEvents() {
        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ma = Integer.parseInt(etMa.getText().toString());
                String ten = etTen.getText().toString();
                Sinhvien sv = new Sinhvien(ma, ten);
                Intent intent = new Intent(
                        MainActivity.this,
                        MainActivity2.class
                );
                intent.putExtra("SINH_VIEN", sv);
                startActivity(intent);
            }
        });
    }
}