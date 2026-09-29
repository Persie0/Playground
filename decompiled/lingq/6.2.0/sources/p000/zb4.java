package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import com.iterable.iterableapi.C1209e;

/* JADX INFO: loaded from: classes2.dex */
public final class zb4 extends OrientationEventListener {

    /* JADX INFO: renamed from: a */
    public int f71300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1209e f71301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb4(C1209e c1209e, Context context) {
        super(context, 3);
        this.f71301b = c1209e;
        this.f71300a = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        C1209e c1209e = this.f71301b;
        if (!c1209e.f14002N0 || c1209e.f14001M0 == null) {
            return;
        }
        int iFloor = i >= 0 ? ((i + 45) / 90) * 90 : (int) (Math.floor((((double) i) + 45.0d) / 90.0d) * 90.0d);
        int i2 = this.f71300a;
        if (iFloor != i2 && i2 != -1) {
            this.f71300a = iFloor;
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3468pp(this, 9), 1500L);
        } else if (i2 == -1) {
            this.f71300a = iFloor;
        }
    }
}
