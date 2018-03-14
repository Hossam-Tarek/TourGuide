package com.example.hossam.tourguide;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by hossam on 3/14/18.
 */

public class ClickListener implements ListView.OnItemClickListener
{
    private Context context;

    public ClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Place place = (Place) adapterView.getItemAtPosition(i);
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra("name_resource_id", place.getNameResourceID());
        intent.putExtra("description_resource_id", place.getDescriptionResourceID());
        intent.putExtra("image_resource_id", place.getImageResourceID());
        context.startActivity(intent);
    }
}
