package vn.edu.stu.demolistview_simple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnPhatSinhAE;
    ListView lvAE;
    ArrayList<String> dsAE;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        btnPhatSinhAE = findViewById(R.id.btnPhatSinhAE);
        lvAE = findViewById(R.id.lvAE);
        dsAE = new ArrayList<>();
        adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                dsAE
        );
        lvAE.setAdapter(adapter);
    }

    private void addEvents() {
        btnPhatSinhAE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyPhatSinhAE();
            }
        });

        lvAE.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i >= 0 && i < dsAE.size()) {
                    String ae = dsAE.get(i);
                    Toast.makeText(
                            MainActivity.this,
                            "Ta là " + ae,
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
        lvAE.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i >= 0 && i < dsAE.size()) {
                    dsAE.remove(i);
                    adapter.notifyDataSetChanged();
                }
                return true;
            }
        });
    }

    private void xuLyPhatSinhAE() {
        dsAE.clear();
        for (int i = 1; i <= 500; i++) {
            dsAE.add("Anh em thứ " + i);
        }
        adapter.notifyDataSetChanged();
    }
}