package ec.epn.detri.awm.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class BatteryReceiver extends BroadcastReceiver {
    TextView message;
    public BatteryReceiver(TextView levelIn) {
        message = levelIn;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        int p = intent.getIntExtra("level", 0);
        if (p != 0){
            message.setText(p+"%");
        }
    }

}
