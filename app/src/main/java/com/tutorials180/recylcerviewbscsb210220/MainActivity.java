package com.tutorials180.recylcerviewbscsb210220;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Layout;
import android.widget.Toast;

import com.tutorials180.recylcerviewbscsb210220.ModelClasses.SocialMediaPostModel;
import com.tutorials180.recylcerviewbscsb210220.RVAdapter.OurAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView objectRecyclerView;
    private ArrayList<SocialMediaPostModel> objectArrayList;

    private OurAdapter objectOurAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeObjects();
    }

    private void initializeObjects()
    {
        try
        {
            objectRecyclerView=findViewById(R.id.RV);
            objectArrayList=new ArrayList<>();

            createAndAddObjectsToArrayList();
        }
        catch (Exception e)
        {
            Toast.makeText(this, "initializeObjects:"
                    +e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void createAndAddObjectsToArrayList()
    {
        try
        {
            objectArrayList.add(new SocialMediaPostModel("Ali"
            ,R.drawable.pic_one));

            objectArrayList.add(new SocialMediaPostModel("Fajar"
                    ,R.drawable.pic_two));

            objectArrayList.add(new SocialMediaPostModel("Nova"
                    ,R.drawable.pic_three));

            objectArrayList.add(new SocialMediaPostModel("Kumar"
                    ,R.drawable.pic_four));

            objectArrayList.add(new SocialMediaPostModel("Rumi"
                    ,R.drawable.pic_five));

            objectArrayList.add(new SocialMediaPostModel("Raza Ali"
                    ,R.drawable.pic_six));

            objectArrayList.add(new SocialMediaPostModel("M. Yousaf"
                    ,R.drawable.pic_seven));

            objectOurAdapter=new OurAdapter(objectArrayList,this);
            addValuesRV();

        }
        catch (Exception e)
        {
            Toast.makeText(this, "createAndAddObjectsToArrayList:"
                    +e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void addValuesRV()
    {
        try
        {
           LinearLayoutManager objectLinearLayoutManager=new LinearLayoutManager(this);
           objectRecyclerView.setLayoutManager(objectLinearLayoutManager);

           objectRecyclerView.setAdapter(objectOurAdapter);

        }
        catch (Exception e)
        {
            Toast.makeText(this, "addValuesRV:"+
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
