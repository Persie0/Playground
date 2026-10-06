package p000;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exw {

    /* JADX INFO: renamed from: a */
    public ArrayList f20896a;

    /* JADX INFO: renamed from: b */
    public final eyi f20897b;

    /* JADX INFO: renamed from: c */
    public long f20898c;

    /* JADX INFO: renamed from: d */
    public eyj f20899d;

    /* JADX INFO: renamed from: e */
    public final Point f20900e;

    /* JADX INFO: renamed from: f */
    public int f20901f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f20902g;

    /* JADX INFO: renamed from: h */
    public boolean f20903h;

    /* JADX INFO: renamed from: i */
    public boolean f20904i;

    public exw(Context context, eyi eyiVar, int i, int i2) {
        this.f20902g = false;
        this.f20903h = false;
        this.f20904i = false;
        try {
            this.f20899d = new eyj();
        } catch (ewy e) {
            e.printStackTrace();
        }
        if (this.f20896a == null) {
            this.f20896a = new ArrayList();
        }
        int[] iArr = {C0100R.drawable.focus_quadrant_4, C0100R.drawable.focus_quadrant_1, C0100R.drawable.focus_quadrant_2, C0100R.drawable.focus_quadrant_3, C0100R.drawable.focus_quadrant_4};
        this.f20896a.clear();
        for (int i3 = 0; i3 < 5; i3++) {
            this.f20896a.add(i3, new exb());
            ((exb) this.f20896a.get(i3)).m7976g(context, iArr[i3], 4.0f);
            ((exb) this.f20896a.get(i3)).f20701e = this.f20899d;
        }
        this.f20897b = eyiVar;
        this.f20900e = new Point((i / 2) - (((exb) this.f20896a.get(0)).f20712g.x / 2), (i2 / 2) - (((exb) this.f20896a.get(0)).f20712g.y / 2));
        this.f20903h = false;
        this.f20902g = false;
        this.f20904i = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m8028a() {
        this.f20901f = 0;
        if (this.f20902g) {
            eyi eyiVar = this.f20897b;
            int i = eyiVar.f20972i;
            float[] fArrM8045e = eyiVar.m8045e();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - this.f20898c;
            Object obj = exh.f20734a;
            double d = jElapsedRealtimeNanos;
            Double.isNaN(d);
            LightCycleNative.EndGyroCalibration(fArrM8045e, i, (int) (d / 1000000.0d));
            this.f20902g = false;
        }
    }
}
