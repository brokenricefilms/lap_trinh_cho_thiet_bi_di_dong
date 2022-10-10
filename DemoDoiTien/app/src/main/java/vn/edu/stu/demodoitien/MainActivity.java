package vn.edu.stu.demodoitien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText etSoTien;
    RadioGroup groupDoiTien;
    Button btnDoi;
    TextView tvThanhTien;

    double tiGia = 24100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        etSoTien = findViewById(R.id.etSoTien);
        groupDoiTien = findViewById(R.id.groupDoiTien);
        btnDoi = findViewById(R.id.btnDoi);
        tvThanhTien = findViewById(R.id.tvThanhTien);
    }

    private void addEvents() {
        btnDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyDoi();
            }
        });
    }

    private void xuLyDoi() {
        double soTien = Double.parseDouble(etSoTien.getText().toString());
        double thanhTien = 0;
        if (groupDoiTien.getCheckedRadioButtonId() == R.id.radUSD2VND) {
            thanhTien = soTien * tiGia;
        } else {
            thanhTien = soTien / tiGia;
        }
        DecimalFormat df = new DecimalFormat("#,##0.0");
        tvThanhTien.setText(df.format(thanhTien));
    }
}