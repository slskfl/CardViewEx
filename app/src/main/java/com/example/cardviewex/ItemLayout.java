package com.example.cardviewex;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.jar.Attributes;

public class ItemLayout extends LinearLayout {
    ImageView imgPoster;
    TextView tvTitle, tvContent;
    public ItemLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.item, this, true);

        imgPoster=findViewById(R.id.imgPoster);
        tvTitle=findViewById(R.id.tvTitle);
        tvContent=findViewById(R.id.tvContent);

    }

    public void setImage(int imgID) {
        imgPoster.setImageResource(imgID);
    }

    public void setTvTitle(String title) {
        tvTitle.setText(title);
    }

    public void setTvContent(String content) {
        tvContent.setText(content);
    }
}
