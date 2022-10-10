package vn.edu.stu.demointent_sendreceivereturn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etNhapX;
    Button btnGui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        etNhapX = findViewById(R.id.etNhapX);
        btnGui = findViewById(R.id.btnGui);
    }

    private void addEvents() {
        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(etNhapX.getText().toString());
                Intent intent = new Intent(
                        MainActivity.this,
                        MainActivity2.class
                );
                intent.putExtra("X", x);
                resultLauncher.launch(intent);
            }
        });
    }

    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        if (result.getData().hasExtra("BINH_PHUONG")) {
                            int binhPhuong = result.getData().getIntExtra("BINH_PHUONG", 0);
                            etNhapX.setText(binhPhuong + "");
                        }
                    }
                }
            }
    );
}