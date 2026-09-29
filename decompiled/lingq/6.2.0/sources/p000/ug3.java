package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ug3 {

    /* JADX INFO: renamed from: e */
    public static final C3723wi f63881e = C3723wi.m23970d();

    /* JADX INFO: renamed from: a */
    public final Activity f63882a;

    /* JADX INFO: renamed from: b */
    public final qn3 f63883b;

    /* JADX INFO: renamed from: c */
    public final HashMap f63884c;

    /* JADX INFO: renamed from: d */
    public boolean f63885d;

    public ug3(Activity activity) {
        qn3 qn3Var = new qn3(29);
        HashMap map = new HashMap();
        this.f63885d = false;
        this.f63882a = activity;
        this.f63883b = qn3Var;
        this.f63884c = map;
    }

    /* JADX INFO: renamed from: a */
    public final mz6 m22725a() {
        boolean z = this.f63885d;
        C3723wi c3723wi = f63881e;
        if (!z) {
            c3723wi.m23971a("No recording has been started.");
            return new mz6();
        }
        SparseIntArray sparseIntArray = ((SparseIntArray[]) ((sg3) this.f63883b.f57974a).f60817c)[0];
        if (sparseIntArray == null) {
            c3723wi.m23971a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new mz6();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            int iValueAt = sparseIntArray.valueAt(i4);
            i += iValueAt;
            if (iKeyAt > 700) {
                i3 += iValueAt;
            }
            if (iKeyAt > 16) {
                i2 += iValueAt;
            }
        }
        return new mz6(new tg3(i, i2, i3));
    }

    /* JADX INFO: renamed from: b */
    public final void m22726b() {
        boolean z = this.f63885d;
        Activity activity = this.f63882a;
        if (z) {
            f63881e.m23972b("FrameMetricsAggregator is already recording %s", activity.getClass().getSimpleName());
            return;
        }
        sg3 sg3Var = (sg3) this.f63883b.f57974a;
        sg3Var.getClass();
        if (sg3.f60813f == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            sg3.f60813f = handlerThread;
            handlerThread.start();
            sg3.f60814g = new Handler(sg3.f60813f.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) sg3Var.f60817c;
            if (sparseIntArrayArr[i] == null) {
                if (((1 << i) & sg3Var.f60816b) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((rg3) sg3Var.f60819e, sg3.f60814g);
        ((ArrayList) sg3Var.f60818d).add(new WeakReference(activity));
        this.f63885d = true;
    }
}
