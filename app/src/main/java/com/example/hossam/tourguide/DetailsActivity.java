package com.example.hossam.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imageView = findViewById(R.id.detail_image);
        imageView.setImageResource(getIntent().getExtras().getInt("image_resource_id"));

        TextView name = findViewById(R.id.name);
        name.setText(getIntent().getExtras().getInt("name_resource_id"));

        TextView description = findViewById(R.id.description);
        description.setText(getIntent().getExtras().getInt("description_resource_id"));
    }
}
