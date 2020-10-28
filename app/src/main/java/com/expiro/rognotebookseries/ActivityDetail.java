package com.expiro.rognotebookseries;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.expiro.rognotebookseries.model.ROGData;

import org.w3c.dom.Text;


public class ActivityDetail extends AppCompatActivity {
    public static final String EXTRA_IMG = "extra_img";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_SPESIFIKASI = "extra_spesifikasi";
    public static final String EXTRA_DISPLAY = "extra_display";
    public static final String EXTRA_PRICE = "extra_price";
    public static final String EXTRA_DETAIL = "extra_detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String title = "Information Detail";

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);

        ImageView imgROG = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvSpesifikasi = findViewById(R.id.tv_item_spesifikasi);
        TextView tvDisplay = findViewById(R.id.tv_item_display);
        TextView tvPrice = findViewById(R.id.tv_item_price);
        TextView tvDetail = findViewById(R.id.tv_item_detail);

        int img = getIntent().getIntExtra(EXTRA_IMG, 0);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String spesifikasi = getIntent().getStringExtra(EXTRA_SPESIFIKASI);
        String display = getIntent().getStringExtra(EXTRA_DISPLAY);
        String price = getIntent().getStringExtra(EXTRA_PRICE);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);

        imgROG.setImageResource(img);
        tvName.setText(name);
        tvSpesifikasi.setText(spesifikasi);
        tvDetail.setText(detail);
        tvDisplay.setText(display);
        tvPrice.setText(price);
        setActionBar(title);
    }

    private void setActionBar(String title) {
        getSupportActionBar().setTitle(title);
    }


}
