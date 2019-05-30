package com.sayan.android.sampleeasylistview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.sayan.easylistwidget.EasyListView;
import com.sayan.easylistwidget.adapters.CustomRecyclerAdapter;
import com.sayan.easylistwidget.adapters.SimpleTextAdapter;
import com.sayan.easylistwidget.listtiles.ListTile;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements EasyListView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler);
//        showBasicChild(recyclerView);
        showCustomChild(recyclerView);
    }

    private void showBasicChild(RecyclerView recyclerView) {
        List<ItemsPOJO> listItems = new ArrayList<>();
        addSimpleListItems(listItems);
        showBasicRecyclerView(recyclerView, listItems);
    }

    private void showCustomChild(RecyclerView recyclerView) {
        List<CustomItemsPOJO> listItems = new ArrayList<>();
        addListItems(listItems);
        showCustomRecyclerView(recyclerView, listItems, R.layout.custom_recycler_child);
    }

    private void addSimpleListItems(List<ItemsPOJO> listItems) {
        listItems.add(new ItemsPOJO("Sayan",
                "The Crazy Leader: Lorem Ipsum is just like every other tool in a designer's toolkit. When used intentionally, it can help the design process. Lorem Ipsum is one of those things like ",
                "https://at-cdn-s01.audiotool.com/2010/12/01/documents/5obpzwkq/1/cover256x256-5b9c62a0549047c7800ee7b8fc82b2f3.jpg"));
        listItems.add(new ItemsPOJO("Debayan", "The innovative thinker", "https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/36/85/b8/3685b864-3d02-1b6f-04a5-074d1892d8f6/source/256x256bb.jpg"));
        listItems.add(new ItemsPOJO("Ashutosh", "Knows everything", "https://at-cdn-s01.audiotool.com/2010/12/01/documents/5obpzwkq/1/cover256x256-5b9c62a0549047c7800ee7b8fc82b2f3.jpg"));
        listItems.add(new ItemsPOJO("Mondira", "One woman army", "https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/36/85/b8/3685b864-3d02-1b6f-04a5-074d1892d8f6/source/256x256bb.jpg"));
        listItems.add(new ItemsPOJO("Joy Prakash", "The designer pandit", "https://at-cdn-s01.audiotool.com/2010/12/01/documents/5obpzwkq/1/cover256x256-5b9c62a0549047c7800ee7b8fc82b2f3.jpg"));
        listItems.add(new ItemsPOJO("Arup", "The Java developer", "https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/36/85/b8/3685b864-3d02-1b6f-04a5-074d1892d8f6/source/256x256bb.jpg"));
        listItems.add(new ItemsPOJO("Krishna", "The source coder", "https://at-cdn-s01.audiotool.com/2010/12/01/documents/5obpzwkq/1/cover256x256-5b9c62a0549047c7800ee7b8fc82b2f3.jpg"));
        listItems.add(new ItemsPOJO("Amit", "The code enjoyer", "https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/36/85/b8/3685b864-3d02-1b6f-04a5-074d1892d8f6/source/256x256bb.jpg"));
    }

    private void addListItems(List<CustomItemsPOJO> listItems) {
        listItems.add(new CustomItemsPOJO("Sayan",
                "The Crazy Leader: Lorem Ipsum is just like every other tool in a designer's toolkit. When used intentionally, it can help the design process. Lorem Ipsum is one of those things like ",
                "https://at-cdn-s01.audiotool.com/2010/12/01/documents/5obpzwkq/1/cover256x256-5b9c62a0549047c7800ee7b8fc82b2f3.jpg", "View More"));
        listItems.add(new CustomItemsPOJO("Debayan", "The innovative thinker", "https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/36/85/b8/3685b864-3d02-1b6f-04a5-074d1892d8f6/source/256x256bb.jpg", "Show More"));
        listItems.add(new CustomItemsPOJO("Ashutosh", "Knows everything", "https://at-cdn-s01.audiotool.com/2010/12/01/documents/5obpzwkq/1/cover256x256-5b9c62a0549047c7800ee7b8fc82b2f3.jpg", "Details"));
        listItems.add(new CustomItemsPOJO("Mondira", "One woman army", "https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/36/85/b8/3685b864-3d02-1b6f-04a5-074d1892d8f6/source/256x256bb.jpg", "View More"));
        listItems.add(new CustomItemsPOJO("Joy Prakash", "The designer pandit", "https://at-cdn-s01.audiotool.com/2010/12/01/documents/5obpzwkq/1/cover256x256-5b9c62a0549047c7800ee7b8fc82b2f3.jpg", "Details"));
        listItems.add(new CustomItemsPOJO("Arup", "The Java developer. Lorem Ipsum is just like every other tool in a designer's toolkit.", "https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/36/85/b8/3685b864-3d02-1b6f-04a5-074d1892d8f6/source/256x256bb.jpg", "View More"));
        listItems.add(new CustomItemsPOJO("Krishna", "The source coder", "https://at-cdn-s01.audiotool.com/2010/12/01/documents/5obpzwkq/1/cover256x256-5b9c62a0549047c7800ee7b8fc82b2f3.jpg", "Show More"));
        listItems.add(new CustomItemsPOJO("Amit", "The code enjoyer", "https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/36/85/b8/3685b864-3d02-1b6f-04a5-074d1892d8f6/source/256x256bb.jpg", "Show Details"));
    }

    private void showBasicRecyclerView(RecyclerView recyclerView, List<ItemsPOJO> listItems) {
        try {
            ListTile<ItemsPOJO> listTile = new ListTile<ItemsPOJO>(ItemsPOJO.class)
                    .addTitle("getName")
                    .addDescription("getDesc")
                    .addIcon(EasyListView.IconPosition.LEADING, "getImage");

            new EasyListView.Builder<ItemsPOJO>(this)
                    .addRecyclerView(recyclerView)
                    .addListItems(listItems)
                    .addItemModel(ItemsPOJO.class)
                    .addRow(listTile)
                    .setCount(5)
                    .setOnItemClickListener(this)
                    .setOnBindViewHolderCalledListener(new EasyListView.OnBindViewHolderCalledListener<ItemsPOJO>() {
                        @Override
                        public void onBasicBindViewHolder(@NonNull SimpleTextAdapter.SimpleTextViewHolder<ItemsPOJO> viewHolder, ItemsPOJO itemOnThatPosition, int position) {
                            viewHolder.titleTextView.setText(itemOnThatPosition.getName());
                            viewHolder.descriptionTextView.setText(itemOnThatPosition.getDesc());
                        }

                        @Override
                        public void onCustomBindViewHolder(@NonNull CustomRecyclerAdapter.CustomRecyclerViewHolder<ItemsPOJO> viewHolder, ItemsPOJO itemOnThatPosition, int position) {
                            //not called for basic setup
                        }
                    })
                    .Build();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }

    private void showCustomRecyclerView(RecyclerView recyclerView, List<CustomItemsPOJO> listItems, int childResId) {
        new EasyListView.Builder<CustomItemsPOJO>(this)
                .addRecyclerView(recyclerView)
                .addListItems(listItems)
                .addItemModel(CustomItemsPOJO.class)
                .setCount(5)
                .addRow(childResId)
                .setOnItemClickListener(this)
                .setOnBindViewHolderCalledListener(new EasyListView.OnBindViewHolderCalledListener<CustomItemsPOJO>() {
                    @Override
                    public void onBasicBindViewHolder(@NonNull SimpleTextAdapter.SimpleTextViewHolder<CustomItemsPOJO> viewHolder, CustomItemsPOJO itemOnThatPosition, int position) {
                        //not called for custom setup
                    }

                    @Override
                    public void onCustomBindViewHolder(@NonNull CustomRecyclerAdapter.CustomRecyclerViewHolder<CustomItemsPOJO> viewHolder, CustomItemsPOJO itemOnThatPosition, int position) {
                        TextView titleTextView = viewHolder.itemView.findViewById(R.id.titleTextView);
                        TextView descriptionTextView = viewHolder.itemView.findViewById(R.id.descriptionTextView);
                        Button button = viewHolder.itemView.findViewById(R.id.button);

                        titleTextView.setText(itemOnThatPosition.getName());
                        if (position == 0) {
                            descriptionTextView.setText("Ha Ha Ha");
                            button.setText("sample button");
                        } else {
                            descriptionTextView.setText(itemOnThatPosition.getDesc());
                            button.setText(itemOnThatPosition.getButton());
                        }
                    }
                })
                .Build();
    }

    @Override
    public void onClick(View view, int position) {
        switch (view.getId()){
            case R.id.button:
                Toast.makeText(this, position + " : button clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.titleTextView:
                Toast.makeText(this, position + " : titleTextView clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.descriptionTextView:
                Toast.makeText(this, position + " :descriptionTextView clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.leadingImageView:
                Toast.makeText(this, position + " : leadingImageView clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.trailingImageView:
                Toast.makeText(this, position + " : trailingImageView clicked", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, position + " :clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
