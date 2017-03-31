package com.vivien.openwechat;

import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by vivien on 17/3/30.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.click_ll);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWechat();
            }
        });
    }

    private void openWechat() {
        // 将文本内容放到系统剪贴板里
        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        String shareContent = "我们要怀有一种健康而活泼的心情，善待自己的生命！要用自己的热情去呵护，去浇灌自己的生命！要用坚强的信念告慰自己，即使生活的道路困难重重，也要微笑面对，从容走过。";
        cm.setText(shareContent);
        startActivity(App.getInstance().getPackageManager().getLaunchIntentForPackage("com.tencent.mm"));
    }
}
