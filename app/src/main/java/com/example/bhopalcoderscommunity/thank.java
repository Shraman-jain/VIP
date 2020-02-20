package com.example.bhopalcoderscommunity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class thank extends AppCompatActivity {
    ArrayList<Submit> submit;
    SubmitAdapter submitAdapter;
    RecyclerView submitRecyclerView;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank);


            submit = new ArrayList<Submit>();
            Submit gf = (Submit) getIntent().getSerializableExtra("RESPONSE");
            submit.add(gf);
            submitAdapter = new SubmitAdapter(thank.this,submit);
            submitRecyclerView = (RecyclerView) findViewById(R.id.subRecyclerView);
            submitRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            submitRecyclerView.setAdapter(submitAdapter);
            submitAdapter.notifyDataSetChanged();
            b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);


        b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent t=new Intent(thank.this,sign.class);
        startActivity(t);
    }
});
b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(thank.this,splash2.class);
    startActivity(i);
    }
});
        }

    }
