package com.example.weather_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather_app.FiveDay.DailyForecasts;
import com.example.weather_app.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class FiveDayAdapter extends RecyclerView.Adapter<FiveDayAdapter.FiveDay2ViewHolder>{
    private List<DailyForecasts> list;

    public FiveDayAdapter(List<DailyForecasts> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public FiveDay2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_5day2,parent,false);
        return new FiveDayAdapter.FiveDay2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FiveDay2ViewHolder holder, int position) {
        DailyForecasts dailyForecasts = list.get(position);
        if (dailyForecasts == null) {
            return;
        }
        holder.homnay.setText(getDayOfWeek(dailyForecasts.getDate().substring(0,10)));
        holder.day.setText(DataCoverter(dailyForecasts.getDate().substring(6,10)));
        holder.nhietdocao.setText(String.valueOf(fahrenheitToCelsius(dailyForecasts.getTemperature().getMaximum().getValue()))+ "°C");
        holder.nhietdothap.setText(String.valueOf(fahrenheitToCelsius(dailyForecasts.getTemperature().getMinimum().getValue()))+ "°C");
        switch ( dailyForecasts.getDay().getIcon()) {
            case  1 : holder.anh1.setImageResource(R.drawable.icon1); break;
            case  2 : holder.anh1.setImageResource(R.drawable.icon2);break;
            case  3 : holder.anh1.setImageResource(R.drawable.icon3);break;
            case  4 : holder.anh1.setImageResource(R.drawable.icon4);break;
            case  5 : holder.anh1.setImageResource(R.drawable.icon5);break;
            case  6 : holder.anh1.setImageResource(R.drawable.icon6);break;
            case  7 : holder.anh1.setImageResource(R.drawable.icon7);break;
            case  8 : holder.anh1.setImageResource(R.drawable.icon8);break;
            case  11 : holder.anh1.setImageResource(R.drawable.icon11);break;
            case  12 : holder.anh1.setImageResource(R.drawable.icon12);break;
            case  13 : holder.anh1.setImageResource(R.drawable.icon13);break;
            case  14 : holder.anh1.setImageResource(R.drawable.icon14);break;
            case  15 : holder.anh1.setImageResource(R.drawable.icon15);break;
            case  16 : holder.anh1.setImageResource(R.drawable.icon16);break;
            case  17 : holder.anh1.setImageResource(R.drawable.icon17);break;
            case  18 : holder.anh1.setImageResource(R.drawable.icon18);break;
            case  19 : holder.anh1.setImageResource(R.drawable.icon19);break;
            case  20 : holder.anh1.setImageResource(R.drawable.icon20);break;
            case  21 : holder.anh1.setImageResource(R.drawable.icon21);break;
            case  22 : holder.anh1.setImageResource(R.drawable.icon22);break;
            case  23 : holder.anh1.setImageResource(R.drawable.icon23);break;
            case  24 : holder.anh1.setImageResource(R.drawable.icon24);break;
            case  25 : holder.anh1.setImageResource(R.drawable.icon25);break;
            case  26 : holder.anh1.setImageResource(R.drawable.icon26);break;
            case  29 : holder.anh1.setImageResource(R.drawable.icon29);break;
            case  30 : holder.anh1.setImageResource(R.drawable.icon30);break;
            case  31 : holder.anh1.setImageResource(R.drawable.icon31);break;
            case  32 : holder.anh1.setImageResource(R.drawable.icon32);break;
            case  33 : holder.anh1.setImageResource(R.drawable.icon33);break;
            case  34 : holder.anh1.setImageResource(R.drawable.icon34);break;
            case  35 : holder.anh1.setImageResource(R.drawable.icon35);break;
            case  37 : holder.anh1.setImageResource(R.drawable.icon37);break;
            case  38 : holder.anh1.setImageResource(R.drawable.icon38);break;
            case  39 : holder.anh1.setImageResource(R.drawable.icon39);break;
            case  40 : holder.anh1.setImageResource(R.drawable.icon40);break;
            case  41 : holder.anh1.setImageResource(R.drawable.icon41);break;
            case  42 : holder.anh1.setImageResource(R.drawable.icon42);break;
            case  43 : holder.anh1.setImageResource(R.drawable.icon43);break;
            case  44 : holder.anh1.setImageResource(R.drawable.icon44);break;
        }
        switch ((int) dailyForecasts.getNight().getIcon()) {
            case  1 : holder.anh2.setImageResource(R.drawable.icon1);break;
            case  2 : holder.anh2.setImageResource(R.drawable.icon2);break;
            case  3 : holder.anh2.setImageResource(R.drawable.icon3);break;
            case  4 : holder.anh2.setImageResource(R.drawable.icon4);break;
            case  5 : holder.anh2.setImageResource(R.drawable.icon5);break;
            case  6 : holder.anh2.setImageResource(R.drawable.icon6);break;
            case  7 : holder.anh2.setImageResource(R.drawable.icon7);break;
            case  8 : holder.anh2.setImageResource(R.drawable.icon8);break;
            case  11 : holder.anh2.setImageResource(R.drawable.icon11);break;
            case  12 : holder.anh2.setImageResource(R.drawable.icon12);break;
            case  13 : holder.anh2.setImageResource(R.drawable.icon13);break;
            case  14 : holder.anh2.setImageResource(R.drawable.icon14);break;
            case  15 : holder.anh2.setImageResource(R.drawable.icon15);break;
            case  16 : holder.anh2.setImageResource(R.drawable.icon16);break;
            case  17 : holder.anh2.setImageResource(R.drawable.icon17);break;
            case  18 : holder.anh2.setImageResource(R.drawable.icon18);break;
            case  19 : holder.anh2.setImageResource(R.drawable.icon19);break;
            case  20 : holder.anh2.setImageResource(R.drawable.icon20);break;
            case  21 : holder.anh2.setImageResource(R.drawable.icon21);break;
            case  22 : holder.anh2.setImageResource(R.drawable.icon22);break;
            case  23 : holder.anh2.setImageResource(R.drawable.icon23);break;
            case  24 : holder.anh2.setImageResource(R.drawable.icon24);break;
            case  25 : holder.anh2.setImageResource(R.drawable.icon25);break;
            case  26 : holder.anh2.setImageResource(R.drawable.icon26);break;
            case  29 : holder.anh2.setImageResource(R.drawable.icon29);break;
            case  30 : holder.anh2.setImageResource(R.drawable.icon30);break;
            case  31 : holder.anh2.setImageResource(R.drawable.icon31);break;
            case  32 : holder.anh2.setImageResource(R.drawable.icon32);break;
            case  33 : holder.anh2.setImageResource(R.drawable.icon33);break;
            case  34 : holder.anh2.setImageResource(R.drawable.icon34);break;
            case  35 : holder.anh2.setImageResource(R.drawable.icon35);break;
            case  37 : holder.anh2.setImageResource(R.drawable.icon37);break;
            case  38 : holder.anh2.setImageResource(R.drawable.icon38);break;
            case  39 : holder.anh2.setImageResource(R.drawable.icon39);break;
            case  40 : holder.anh2.setImageResource(R.drawable.icon40);break;
            case  41 : holder.anh2.setImageResource(R.drawable.icon41);break;
            case  42 : holder.anh2.setImageResource(R.drawable.icon42);break;
            case  43 : holder.anh2.setImageResource(R.drawable.icon43);break;
            case  44 : holder.anh2.setImageResource(R.drawable.icon44);break;
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return (double) Math.round(celsius * 10) / 10;
    }
    private String DataCoverter(String s){
        DateFormat inputFormat = new SimpleDateFormat("dd-MM");
        DateFormat outputFormat = new SimpleDateFormat("MM-dd");

        Date date = null;
        try {
            date = inputFormat.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String outputDate = outputFormat.format(date);
        return  outputDate;
    }
    public static String getDayOfWeek(String inputDate) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(inputDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            return days[dayOfWeek - 1];
        } catch (Exception e) {
            e.printStackTrace();
            return "Invalid date";
        }
    }

    @Override
    public int getItemCount() {
        if (list!=null) return list.size();
        return 0;
    }

    public class FiveDay2ViewHolder extends RecyclerView.ViewHolder{
        private TextView homnay,day,nhietdocao,nhietdothap,tocdogio;
        private ImageView anh1,anh2;
        public FiveDay2ViewHolder(@NonNull View itemView) {
            super(itemView);
            homnay = itemView.findViewById(R.id.homnay);
            day = itemView.findViewById(R.id.day);
            nhietdocao = itemView.findViewById(R.id.nhietdocao);
            anh1 = itemView.findViewById(R.id.anh1);
            nhietdothap = itemView.findViewById(R.id.nhietdothap);
            tocdogio = itemView.findViewById(R.id.tocdogio);
            anh2= itemView.findViewById(R.id.anh2);
        }
    }
}
