package com.example.notepadmodule4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        public static final int REQUEST_CODE_ADD_NOTE = 1;

        @Override
        protected void onCreate(Bundle savedInstateState) {
                super.onCreate(savedInstateState);
                setContentView(R.layout.activity_main);

                ImageView imageAddNotMain = findViewById(R.id.imageAddNoteMain);
                imageAddNotMain.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                             startActivityForResult(
                                     new Intent(getApplicationContext(), CreateNoteActivity.class),
                                     REQUEST_CODE_ADD_NOTE
                             );
                        }
                });
        }
}