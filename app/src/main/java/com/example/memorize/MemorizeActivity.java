package com.example.memorize;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemorizeActivity extends AppCompatActivity {

    private EditText editTextLanguage1;
    private EditText editTextLanguage2;
    private EditText editTextPronunciation;
    private Button addButton;
    private ListView listViewMemorize;

    private List<MemorizeItem> memorizedItems;
    private MemorizeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorize);

        editTextLanguage1 = findViewById(R.id.edit_text_language1);
        editTextLanguage2 = findViewById(R.id.edit_text_language2);
        editTextPronunciation = findViewById(R.id.edit_text_pronunciation);
        addButton = findViewById(R.id.add_button);
        listViewMemorize = findViewById(R.id.list_view_memorize);

        memorizedItems = new ArrayList<>();
        adapter = new MemorizeAdapter(this, memorizedItems);
        listViewMemorize.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addMemorizeItem();
            }
        });
    }

    private void addMemorizeItem() {
        String language1 = editTextLanguage1.getText().toString().trim();
        String language2 = editTextLanguage2.getText().toString().trim();
        String pronunciation = editTextPronunciation.getText().toString().trim();

        if (!language1.isEmpty() && !language2.isEmpty()) {
            MemorizeItem item = new MemorizeItem(language1, language2, pronunciation, new Date());
            memorizedItems.add(item);
            adapter.notifyDataSetChanged();

            // Clear input fields
            editTextLanguage1.setText("");
            editTextLanguage2.setText("");
            editTextPronunciation.setText("");
        }
    }
}
