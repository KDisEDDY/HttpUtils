package project.ljy.httputils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import project.ljy.httputils.adapter.ListAdapter;
import project.ljy.httputils.model.ItemBO;

public class EspressoActivity extends AppCompatActivity {

    protected ListView mListView = null;
    private ListAdapter mAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_espresso);
        mListView = (ListView) findViewById(R.id.lv_list);
        mAdapter = new ListAdapter(this,loadData());
        mListView.setAdapter(mAdapter);
    }

    private List<ItemBO> loadData(){
        List<ItemBO> list = new ArrayList<>();
        ItemBO item = new ItemBO();
        item.setName("上证指数");
        item.setRate(-0.44);
        item.setTurnover(9736129);
        list.add(item);

        item = new ItemBO();
        item.setName("深证成指");
        item.setRate(-0.48);
        item.setTurnover(20549747);
        list.add(item);

        item = new ItemBO();
        item.setName("道琼斯");
        item.setRate(0.1);
        item.setTurnover(0);
        list.add(item);
        return list;
    }
}
