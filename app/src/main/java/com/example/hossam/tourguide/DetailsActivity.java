package com.example.hossam.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity
{
    private String geoLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imageView = findViewById(R.id.detail_image);
        imageView.setImageResource(getIntent().getExtras().getInt("image_resource_id"));

        TextView name = findViewById(R.id.name);
        String placeName = getString(getIntent().getExtras().getInt("name_resource_id"));
        name.setText(placeName);

        TextView description = findViewById(R.id.description);
        description.setText(getIntent().getExtras().getInt("description_resource_id"));

        Location location = new Location(getIntent().getExtras().getDouble("latitude"),
                getIntent().getExtras().getDouble("longitude"));

        geoLocation = "geo:0,0?q=" + location.getLatitude() + "," + location.getLongitude() + "(" + placeName + ")";

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(geoLocation));

                if (intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
            }
        });
    }
}
