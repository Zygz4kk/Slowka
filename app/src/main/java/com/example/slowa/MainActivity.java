package com.example.slowa;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected static ArrayList<Integer> Lista;
    private Button buttonLosuj, button2, button3, button4, button5;
    private int ktorePytanie = 0;
    private TextView textView;

    public class Pytanie {
        private String pytanie;
        private String odpowiedź;

        public Pytanie(String pytanie, String odpowiedź){
            this.pytanie = pytanie;
            this.odpowiedź = odpowiedź;
        }

        public String getPytanie(){
            return pytanie;
        }

        public String getOdpowiedź(){
            return odpowiedź;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buttonLosuj = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
    }
    private void pokazPytanie (int ktorePytanie){

    }
    private void setKtorePytanie(){
        Pytanie p1 = new Pytanie("Ile to 2 + 2", "4");
        Pytanie p2 = new Pytanie("Ile to 2 + 3", "5");
        Pytanie p3 = new Pytanie("Ile to 2 + 4", "6");
        Pytanie p4 = new Pytanie("Ile to 2 + 5", "7");
    }
}