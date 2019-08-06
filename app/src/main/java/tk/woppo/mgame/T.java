package tk.woppo.mgame;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.google.android.gms.ads.AdRequest;

/**
 * @author liwei
 * 2019/7/3 19:58
 * W
 */
public class T extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new AdRequest.Builder().build();
    }
}
