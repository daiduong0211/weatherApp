package com.example.weather_app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.weather_app.DB.DatabaseHandler;
import com.example.weather_app.Model.AddCity;
import com.example.weather_app.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class MainActivity2 extends AppCompatActivity {

    private ViewPager2 viewPager;
    DatabaseHandler databaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        loadData();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_demo, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_share) {
            // Chụp ảnh màn hình
            View view = getWindow().getDecorView().getRootView();
            view.setDrawingCacheEnabled(true);
            Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
            view.setDrawingCacheEnabled(false);

            // Lưu ảnh vào tệp tạm
            try {
                File tempFile = File.createTempFile("screenshot", ".png", getCacheDir());
                FileOutputStream fos = new FileOutputStream(tempFile);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
                fos.close();

                // Tạo URI bằng FileProvider
                Uri contentUri = FileProvider.getUriForFile(this, getPackageName() + ".fileprovider", tempFile);

                // Tạo Intent chia sẻ với ảnh
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("image/*");
                shareIntent.putExtra(Intent.EXTRA_STREAM, contentUri);
                shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

                // Tạo intent bản xem trước
                Intent previewIntent = createImagePreviewIntent(contentUri);

                // Mở hộp thoại chọn ứng dụng để chia sẻ
                Intent chooserIntent = Intent.createChooser(previewIntent, "Xem trước và chọn ứng dụng để chia sẻ");
                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, new Intent[] { shareIntent });

                startActivity(chooserIntent);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return super.onOptionsItemSelected(item);
    }

    private Intent createImagePreviewIntent(Uri imageUri) {
        Intent previewIntent = new Intent(Intent.ACTION_VIEW);
        previewIntent.setDataAndType(imageUri, "image/*");
        return previewIntent;
    }


    private void loadData() {
        viewPager = findViewById(R.id.viewPager);
        databaseHandler = new DatabaseHandler(getApplicationContext());
        List<AddCity> addCityList = databaseHandler.getAllCityInDB();
        List<Fragment> fragmentList = new ArrayList<>();
        for (int i = 0; i < addCityList.size(); i++) {
            fragmentList.add(new MainFragment(addCityList.get(i).getTenthanhpho()));
        }
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(this, fragmentList);
        viewPager.setAdapter(adapter);
        CircleIndicator3 indicator = findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);
    }
    @Override
    protected void onResume() {
        super.onResume();
        loadData();
    }
}