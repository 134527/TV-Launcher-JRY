package com.tan.mytvlauncher.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v17.leanback.app.BackgroundManager;
import android.support.v17.leanback.app.BrowseFragment;
import android.view.Menu;
import android.view.View;

import com.tan.mytvlauncher.MainActivity;
import com.tan.mytvlauncher.R;

public class ChangeTheWallpaper extends Activity {
    public static void changeTheWallpaper(Context context) {
        //生成一个设置壁纸的请求
        final Intent pickWallpaper = new Intent(Intent.ACTION_SET_WALLPAPER);
        Intent chooser = Intent.createChooser(pickWallpaper,"chooser_wallpaper");
        //发送设置壁纸的请求
        context.startActivity(chooser);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void onSetWallpaper(BrowseFragment view) {

    }
}
