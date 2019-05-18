package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView animateMyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        animateMyTextView =findViewById ( R.id.animateText );
        animateMyTextView.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {


                animateMyTextView.animate ().rotation ( 90f );

                animateMyTextView.setTextColor(getResources().getColor(R.color.indigo));

            }

        } );

    }
}
