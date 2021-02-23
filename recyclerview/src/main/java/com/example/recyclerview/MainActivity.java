package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1;
    RecycleAdapter adapter;
    int imgID[]={R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,
            R.drawable.mov04, R.drawable.mov05,
            R.drawable.mov06, R.drawable.mov07,R.drawable.mov08,
            R.drawable.mov09, R.drawable.mov10};
    String title[]={"써니", "완득이", "괴물", "라이오스타", "비열한 거리", "왕의 남자",
            "아일랜드", "웰컴 투 동막골", "헬보이", "백 투 더 퓨처"};
    String content[] ={"7공주 프로젝트", "내 인생이 꼬이기 시작했다.", "가족의 사투가 시작되었다.",
            "언제나 나를 최고라고...", "지금 여기 그 남자의...", "질투의 열마아이 부른",
            "이제 거대한 미래가 창조되었다", "1950년 지금은 전쟁 중...",
            "잘생긴 얼굴만 세상을 구하는 건 아니지!", "과거로 여행을..."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView1=findViewById(R.id.recyclerview1);
        adapter=new RecycleAdapter();
        LinearLayoutManager layoutManager=new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView1.setLayoutManager(layoutManager);
        for(int i=0; i<imgID.length; i++){
            adapter.addItem(new ItemData(imgID[i], title[i], content[i]));
        }
        recyclerView1.setAdapter(adapter);
    }
}