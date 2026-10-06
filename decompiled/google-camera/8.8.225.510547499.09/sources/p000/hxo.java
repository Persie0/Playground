package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hxo implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Vibrator f29824a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ BottomBarController f29825b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ hxp f29826c;

    public hxo(hxp hxpVar, Vibrator vibrator, BottomBarController bottomBarController) {
        this.f29826c = hxpVar;
        this.f29824a = vibrator;
        this.f29825b = bottomBarController;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f29826c.f29828b.mo8155aC();
        if (this.f29824a.hasVibrator()) {
            this.f29824a.vibrate(hxp.f29827a, -1);
        }
        this.f29825b.switchCamera();
    }
}
