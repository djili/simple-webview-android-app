package diop.khadre.abdou.quitrouve.geniustech.sn.quitrouve;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

/**
 * My splash screen ativity
 */
public class FullscreenActivity extends Activity {

    private int time = 3000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(FullscreenActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },time);
    }
}
