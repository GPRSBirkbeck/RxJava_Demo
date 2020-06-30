package com.example.rxjava_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import io.reactivex.rxjava3.core.Flowable;

public class MainActivity extends AppCompatActivity {
    TextView print_text_spot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView print_text_spot = findViewById(R.id.print_location);

                hello("Gregory", "Peter", "Rory", "Smith");
    }
    public static void hello(String... args) {

        Flowable.fromArray(args).subscribe(s -> System.out.println("Hello " + s + "!"));
    }
}