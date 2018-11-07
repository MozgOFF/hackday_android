package jmeansjustice.hackday_final;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainPageActivity extends Activity {
    static final ArrayList<Users> array = new ArrayList<>();


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        adderToArray();

        mRecyclerView = findViewById(R.id.RecyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new Adapter(array);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.setAdapter(mAdapter);
    }

    private void adderToArray() {
        array.add(new Users("Madi", "Sakhabanov", "asd", "asd", "asd"));
        array.add(new Users("Madi", "Sakhabanov", "asd", "asd", "asd"));
        array.add(new Users("Madi", "Sakhabanov", "asd", "asd", "asd"));
    }
}