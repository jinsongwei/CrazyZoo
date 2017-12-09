package com.williamjin.crazyzoo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.williamjin.crazyzoo.model.Catergory;

import java.util.List;

/**
 * Created by william on 12/7/17.
 */

public class CategoryListAdapter extends ArrayAdapter<Catergory>{
    public CategoryListAdapter(@NonNull Context context, int resource, List<Catergory> catergories) {
        super(context, resource, catergories);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.
                    from(parent.getContext()).
                    inflate(R.layout.category_list_item, null);
        }

        //Bind the view in the animal list them
        TextView tvCategoryType = convertView.findViewById(R.id.tv_category_type);
        TextView tvBodyType = convertView.findViewById(R.id.tv_category_body_type);

        // bind teh view items with the data
        Catergory catergory = getItem(position);
        if(catergory != null){
            tvCategoryType.setText(catergory.getType());
            tvBodyType.setText(catergory.getBodyType());
        }
        return convertView;
    }
}
