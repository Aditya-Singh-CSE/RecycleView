package com.example.android.recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem>  recyclerViewItems = new ArrayList<> ();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_email_24,"Email","Icon"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24,"Emoji","Emotion"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_email_24,"Email","Icon"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24,"Emoji","Emotion"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_email_24,"Email","Icon"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24,"Emoji","Emotion"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_email_24,"Email","Icon"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24,"Emoji","Emotion"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_email_24,"Email","Icon"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24,"Emoji","Emotion"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_email_24,"Email","Icon"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24,"Emoji","Emotion"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_email_24,"Email","Icon"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24,"Emoji","Emotion"));

        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        RecyclerView.LayoutManager layoutManager;
        
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(recyclerViewItems);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        
    }
}