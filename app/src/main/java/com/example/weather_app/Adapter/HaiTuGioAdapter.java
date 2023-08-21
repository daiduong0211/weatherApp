package com.example.weather_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather_app.Model.HaiTuGio;
import com.example.weather_app.R;
import com.example.weather_app.TwelfthHour.TwelfthHour;

import java.util.List;

public class HaiTuGioAdapter extends RecyclerView.Adapter<HaiTuGioAdapter.HaiTuGioViewHolder>{

    private List<TwelfthHour> haiTuGioList;

    public HaiTuGioAdapter(List<TwelfthHour> haiTuGioList) {
        this.haiTuGioList = haiTuGioList;
    }

    public void setData(List<TwelfthHour> list){
        this.haiTuGioList= list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    // tạo ra view
    public HaiTuGioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_24h,parent,false);
        return new HaiTuGioViewHolder(view);
    }

    @Override
    //lấy các giá trị theo vị trí
    public void onBindViewHolder(@NonNull HaiTuGioViewHolder holder, int position) {
        TwelfthHour  twelfthHour = haiTuGioList.get(position);
        if (twelfthHour==null) return;
        switch ( twelfthHour.getWeatherIcon()) {
            case  1 : holder.anhthoitiet.setImageResource(R.drawable.icon1); break;
            case  2 : holder.anhthoitiet.setImageResource(R.drawable.icon2);break;
            case  3 : holder.anhthoitiet.setImageResource(R.drawable.icon3);break;
            case  4 : holder.anhthoitiet.setImageResource(R.drawable.icon4);break;
            case  5 : holder.anhthoitiet.setImageResource(R.drawable.icon5);break;
            case  6 : holder.anhthoitiet.setImageResource(R.drawable.icon6);break;
            case  7 : holder.anhthoitiet.setImageResource(R.drawable.icon7);break;
            case  8 : holder.anhthoitiet.setImageResource(R.drawable.icon8);break;
            case  11 : holder.anhthoitiet.setImageResource(R.drawable.icon11);break;
            case  12 : holder.anhthoitiet.setImageResource(R.drawable.icon12);break;
            case  13 : holder.anhthoitiet.setImageResource(R.drawable.icon13);break;
            case  14 : holder.anhthoitiet.setImageResource(R.drawable.icon14);break;
            case  15 : holder.anhthoitiet.setImageResource(R.drawable.icon15);break;
            case  16 : holder.anhthoitiet.setImageResource(R.drawable.icon16);break;
            case  17 : holder.anhthoitiet.setImageResource(R.drawable.icon17);break;
            case  18 : holder.anhthoitiet.setImageResource(R.drawable.icon18);break;
            case  19 : holder.anhthoitiet.setImageResource(R.drawable.icon19);break;
            case  20 : holder.anhthoitiet.setImageResource(R.drawable.icon20);break;
            case  21 : holder.anhthoitiet.setImageResource(R.drawable.icon21);break;
            case  22 : holder.anhthoitiet.setImageResource(R.drawable.icon22);break;
            case  23 : holder.anhthoitiet.setImageResource(R.drawable.icon23);break;
            case  24 : holder.anhthoitiet.setImageResource(R.drawable.icon24);break;
            case  25 : holder.anhthoitiet.setImageResource(R.drawable.icon25);break;
            case  26 : holder.anhthoitiet.setImageResource(R.drawable.icon26);break;
            case  29 : holder.anhthoitiet.setImageResource(R.drawable.icon29);break;
            case  30 : holder.anhthoitiet.setImageResource(R.drawable.icon30);break;
            case  31 : holder.anhthoitiet.setImageResource(R.drawable.icon31);break;
            case  32 : holder.anhthoitiet.setImageResource(R.drawable.icon32);break;
            case  33 : holder.anhthoitiet.setImageResource(R.drawable.icon33);break;
            case  34 : holder.anhthoitiet.setImageResource(R.drawable.icon34);break;
            case  35 : holder.anhthoitiet.setImageResource(R.drawable.icon35);break;
            case  37 : holder.anhthoitiet.setImageResource(R.drawable.icon37);break;
            case  38 : holder.anhthoitiet.setImageResource(R.drawable.icon38);break;
            case  39 : holder.anhthoitiet.setImageResource(R.drawable.icon39);break;
            case  40 : holder.anhthoitiet.setImageResource(R.drawable.icon40);break;
            case  41 : holder.anhthoitiet.setImageResource(R.drawable.icon41);break;
            case  42 : holder.anhthoitiet.setImageResource(R.drawable.icon42);break;
            case  43 : holder.anhthoitiet.setImageResource(R.drawable.icon43);break;
            case  44 : holder.anhthoitiet.setImageResource(R.drawable.icon44);break;
        }
        holder.gio.setText(twelfthHour.getDateTime().substring(11,16));
        holder.nhietdo.setText(String.valueOf(fahrenheitToCelsius(twelfthHour.getTemperature().getValue()))+ "°C");
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return (double) Math.round(celsius * 10) / 10;
    }

    @Override
    // lấy số lượng item trong list
    public int getItemCount() {
        if (haiTuGioList!= null) return haiTuGioList.size();
        return 0;
    }

    public class HaiTuGioViewHolder extends RecyclerView.ViewHolder{
        private ImageView anhthoitiet;
        private TextView gio,nhietdo;

        public HaiTuGioViewHolder(@NonNull View itemView) {
            super(itemView);
            anhthoitiet = itemView.findViewById(R.id.anhthoitiet);
            gio = itemView.findViewById(R.id.gio);
            nhietdo = itemView.findViewById(R.id.nhietdo);
        }
    }
}
