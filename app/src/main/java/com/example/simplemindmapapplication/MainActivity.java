package com.example.simplemindmapapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mainNode,node1,line,line3,node2;
    private LinearLayout ll;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = (LinearLayout) findViewById(R.id.ll);
        mainNode = (Button) findViewById(R.id.mainNode);
        node1 = (Button) findViewById(R.id.node1);
        node2 = (Button) findViewById(R.id.node2);
        line = (Button)  findViewById(R.id.line);
        line3 = (Button)  findViewById(R.id.line3);


        mainNode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
                final Button btn = (Button)inflater.inflate(R.layout.btn,null,false);
                btn.setText("Test Test");
                final Button line3btn = (Button)inflater.inflate(R.layout.line,null,true);
                ll.addView(line3btn);
                ll.addView(btn);

            }
        });
    }
}


