package jmeansjustice.hackday_final;

import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainPageActivity extends Activity implements View.OnClickListener {
    static final ArrayList<Users> array = new ArrayList<>();


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        initUI();

        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        return true;
                    }
                });

    }

    private void initUI() {
        mRecyclerView = findViewById(R.id.RecyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new Adapter(array);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        adderToArray();
    }

    private void adderToArray() {
        array.add(new Users("Madi", "Sakhabanov", "asd", "asd", "asd"));
        array.add(new Users("Tot", "Sakhabanov", "asd", "asd", "asd"));
        array.add(new Users("Ewe", "Sakhabanov", "asd", "asd", "asd"));
        array.add(new Users("Pidor", "Sakhabanov", "asd", "asd", "asd"));
        array.add(new Users("Znaew", "Sakhabanov", "asd", "asd", "asd"));
        array.add(new Users("Li", "Sakhabanov", "asd", "asd", "asd"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.main_filter):

                break;
        }
    }
}