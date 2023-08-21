package com.example.weather_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather_app.Model.AddCity;
import com.example.weather_app.R;

import java.util.List;

public class AddCityAdapter extends RecyclerView.Adapter<AddCityAdapter.AddCityViewHolder>{
    private List<AddCity> addCityList;

    public AddCityAdapter(List<AddCity> addCityList) {
        this.addCityList = addCityList;
    }

    @NonNull
    @Override
    public AddCityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_add_city,parent,false);
        return new AddCityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddCityViewHolder holder, int position) {
        AddCity addCity = addCityList.get(position);
        if (addCity==null) return;
        holder.tenthanhpho.setText(addCity.getTenthanhpho());
        switch ((int) addCity.getWeatherIcon()) {
            case  1 : holder.hinhanh.setImageResource(R.drawable.icon1); break;
            case  2 : holder.hinhanh.setImageResource(R.drawable.icon2);break;
            case  3 : holder.hinhanh.setImageResource(R.drawable.icon3);break;
            case  4 : holder.hinhanh.setImageResource(R.drawable.icon4);break;
            case  5 : holder.hinhanh.setImageResource(R.drawable.icon5);break;
            case  6 : holder.hinhanh.setImageResource(R.drawable.icon6);break;
            case  7 : holder.hinhanh.setImageResource(R.drawable.icon7);break;
            case  8 : holder.hinhanh.setImageResource(R.drawable.icon8);break;
            case  11 : holder.hinhanh.setImageResource(R.drawable.icon11);break;
            case  12 : holder.hinhanh.setImageResource(R.drawable.icon12);break;
            case  13 : holder.hinhanh.setImageResource(R.drawable.icon13);break;
            case  14 : holder.hinhanh.setImageResource(R.drawable.icon14);break;
            case  15 : holder.hinhanh.setImageResource(R.drawable.icon15);break;
            case  16 : holder.hinhanh.setImageResource(R.drawable.icon16);break;
            case  17 : holder.hinhanh.setImageResource(R.drawable.icon17);break;
            case  18 : holder.hinhanh.setImageResource(R.drawable.icon18);break;
            case  19 : holder.hinhanh.setImageResource(R.drawable.icon19);break;
            case  20 : holder.hinhanh.setImageResource(R.drawable.icon20);break;
            case  21 : holder.hinhanh.setImageResource(R.drawable.icon21);break;
            case  22 : holder.hinhanh.setImageResource(R.drawable.icon22);break;
            case  23 : holder.hinhanh.setImageResource(R.drawable.icon23);break;
            case  24 : holder.hinhanh.setImageResource(R.drawable.icon24);break;
            case  25 : holder.hinhanh.setImageResource(R.drawable.icon25);break;
            case  26 : holder.hinhanh.setImageResource(R.drawable.icon26);break;
            case  29 : holder.hinhanh.setImageResource(R.drawable.icon29);break;
            case  30 : holder.hinhanh.setImageResource(R.drawable.icon30);break;
            case  31 : holder.hinhanh.setImageResource(R.drawable.icon31);break;
            case  32 : holder.hinhanh.setImageResource(R.drawable.icon32);break;
            case  33 : holder.hinhanh.setImageResource(R.drawable.icon33);break;
            case  34 : holder.hinhanh.setImageResource(R.drawable.icon34);break;
            case  35 : holder.hinhanh.setImageResource(R.drawable.icon35);break;
            case  37 : holder.hinhanh.setImageResource(R.drawable.icon37);break;
            case  38 : holder.hinhanh.setImageResource(R.drawable.icon38);break;
            case  39 : holder.hinhanh.setImageResource(R.drawable.icon39);break;
            case  40 : holder.hinhanh.setImageResource(R.drawable.icon40);break;
            case  41 : holder.hinhanh.setImageResource(R.drawable.icon41);break;
            case  42 : holder.hinhanh.setImageResource(R.drawable.icon42);break;
            case  43 : holder.hinhanh.setImageResource(R.drawable.icon43);break;
            case  44 : holder.hinhanh.setImageResource(R.drawable.icon44);break;
        }
        holder.nhietdo.setText(addCity.getNhietdo()+"°C");
    }

    @Override
    public int getItemCount() {
        if (addCityList!=null) return addCityList.size();
        return 0;
    }


    public class AddCityViewHolder extends RecyclerView.ViewHolder{
        private TextView tenthanhpho,nhietdo;
        private ImageView hinhanh;

        public AddCityViewHolder(@NonNull View itemView) {
            super(itemView);
            tenthanhpho = itemView.findViewById(R.id.tenthanhpho);
            hinhanh = itemView.findViewById(R.id.hinhanh);
            nhietdo= itemView.findViewById(R.id.nhietdo);
        }
    }

}
