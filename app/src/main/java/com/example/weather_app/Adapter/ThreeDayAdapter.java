package com.example.weather_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather_app.FiveDay.DailyForecasts;
import com.example.weather_app.Model.ThreeDay;
import com.example.weather_app.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ThreeDayAdapter extends RecyclerView.Adapter<ThreeDayAdapter.FiveDayViewHolder>{
    private List<DailyForecasts> mListThreeDay;

    public ThreeDayAdapter(List<DailyForecasts> mListThreeDay) {
        this.mListThreeDay = mListThreeDay;
    }

    @NonNull
    @Override
    public FiveDayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_5days,parent,false);
        return new FiveDayViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FiveDayViewHolder holder, int position) {
        DailyForecasts dailyForecasts = mListThreeDay.get(position);
        if (dailyForecasts ==null) {
            return;
        }
        switch ( dailyForecasts.getDay().getIcon()) {
            case  1 : holder.imageView.setImageResource(R.drawable.icon1); break;
            case  2 : holder.imageView.setImageResource(R.drawable.icon2);break;
            case  3 : holder.imageView.setImageResource(R.drawable.icon3);break;
            case  4 : holder.imageView.setImageResource(R.drawable.icon4);break;
            case  5 : holder.imageView.setImageResource(R.drawable.icon5);break;
            case  6 : holder.imageView.setImageResource(R.drawable.icon6);break;
            case  7 : holder.imageView.setImageResource(R.drawable.icon7);break;
            case  8 : holder.imageView.setImageResource(R.drawable.icon8);break;
            case  11 : holder.imageView.setImageResource(R.drawable.icon11);break;
            case  12 : holder.imageView.setImageResource(R.drawable.icon12);break;
            case  13 : holder.imageView.setImageResource(R.drawable.icon13);break;
            case  14 : holder.imageView.setImageResource(R.drawable.icon14);break;
            case  15 : holder.imageView.setImageResource(R.drawable.icon15);break;
            case  16 : holder.imageView.setImageResource(R.drawable.icon16);break;
            case  17 : holder.imageView.setImageResource(R.drawable.icon17);break;
            case  18 : holder.imageView.setImageResource(R.drawable.icon18);break;
            case  19 : holder.imageView.setImageResource(R.drawable.icon19);break;
            case  20 : holder.imageView.setImageResource(R.drawable.icon20);break;
            case  21 : holder.imageView.setImageResource(R.drawable.icon21);break;
            case  22 : holder.imageView.setImageResource(R.drawable.icon22);break;
            case  23 : holder.imageView.setImageResource(R.drawable.icon23);break;
            case  24 : holder.imageView.setImageResource(R.drawable.icon24);break;
            case  25 : holder.imageView.setImageResource(R.drawable.icon25);break;
            case  26 : holder.imageView.setImageResource(R.drawable.icon26);break;
            case  29 : holder.imageView.setImageResource(R.drawable.icon29);break;
            case  30 : holder.imageView.setImageResource(R.drawable.icon30);break;
            case  31 : holder.imageView.setImageResource(R.drawable.icon31);break;
            case  32 : holder.imageView.setImageResource(R.drawable.icon32);break;
            case  33 : holder.imageView.setImageResource(R.drawable.icon33);break;
            case  34 : holder.imageView.setImageResource(R.drawable.icon34);break;
            case  35 : holder.imageView.setImageResource(R.drawable.icon35);break;
            case  37 : holder.imageView.setImageResource(R.drawable.icon37);break;
            case  38 : holder.imageView.setImageResource(R.drawable.icon38);break;
            case  39 : holder.imageView.setImageResource(R.drawable.icon39);break;
            case  40 : holder.imageView.setImageResource(R.drawable.icon40);break;
            case  41 : holder.imageView.setImageResource(R.drawable.icon41);break;
            case  42 : holder.imageView.setImageResource(R.drawable.icon42);break;
            case  43 : holder.imageView.setImageResource(R.drawable.icon43);break;
            case  44 : holder.imageView.setImageResource(R.drawable.icon44);break;
        }
        holder.day.setText(getDayOfWeek(dailyForecasts.getDate()));
        holder.weather.setText(dailyForecasts.getDay().getIconPhrase());
        holder.couldy.setText(String.valueOf(fahrenheitToCelsius(dailyForecasts.getTemperature().getMaximum().getValue())).substring(0,2)
                + "°/" + String.valueOf(fahrenheitToCelsius(dailyForecasts.getTemperature().getMinimum().getValue())).substring(0,2)+"°"
        );
    }

    @Override
    public int getItemCount() {
        if (mListThreeDay !=null) return mListThreeDay.size()-2;
        return 0;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        int celsius =  (int) (fahrenheit - 32) * 5 / 9;
        return (int ) celsius;
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

    public class FiveDayViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView day,weather,couldy;

        public FiveDayViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            day = itemView.findViewById(R.id.day);
            weather = itemView.findViewById(R.id.weather);
            couldy = itemView.findViewById(R.id.cloudy);
        }
    }
}
