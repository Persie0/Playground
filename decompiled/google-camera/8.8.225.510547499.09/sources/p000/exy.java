package p000;

import android.content.Context;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import com.google.android.apps.lightcycle.panorama.NewTarget;
import java.util.Map;
import java.util.TreeMap;
import p021j$.util.DesugarCollections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exy {

    /* JADX INFO: renamed from: a */
    public static final float f20907a = m8030f(22.0f);

    /* JADX INFO: renamed from: b */
    public static final float f20908b = m8030f(12.0f);

    /* JADX INFO: renamed from: c */
    public final Context f20909c;

    /* JADX INFO: renamed from: e */
    public exb f20911e;

    /* JADX INFO: renamed from: f */
    public exb f20912f;

    /* JADX INFO: renamed from: g */
    public eyk f20913g;

    /* JADX INFO: renamed from: h */
    public eyj f20914h;

    /* JADX INFO: renamed from: m */
    public float f20919m;

    /* JADX INFO: renamed from: n */
    public float f20920n;

    /* JADX INFO: renamed from: x */
    public exw f20930x;

    /* JADX INFO: renamed from: d */
    public final Map f20910d = DesugarCollections.synchronizedMap(new TreeMap());

    /* JADX INFO: renamed from: i */
    public final float[] f20915i = {0.0f, 0.0f, -1.0f, 1.0f};

    /* JADX INFO: renamed from: j */
    public final float[] f20916j = new float[4];

    /* JADX INFO: renamed from: k */
    public final float[] f20917k = new float[16];

    /* JADX INFO: renamed from: l */
    public float[] f20918l = null;

    /* JADX INFO: renamed from: o */
    public float f20921o = 0.0f;

    /* JADX INFO: renamed from: p */
    public boolean f20922p = false;

    /* JADX INFO: renamed from: q */
    public eyi f20923q = null;

    /* JADX INFO: renamed from: r */
    public final exx f20924r = new exx();

    /* JADX INFO: renamed from: s */
    public boolean f20925s = true;

    /* JADX INFO: renamed from: t */
    public boolean f20926t = true;

    /* JADX INFO: renamed from: u */
    public float f20927u = 0.1f;

    /* JADX INFO: renamed from: v */
    public long f20928v = 0;

    /* JADX INFO: renamed from: w */
    public final float[] f20929w = new float[16];

    public exy(Context context) {
        this.f20909c = context;
    }

    /* JADX INFO: renamed from: c */
    public static void m8029c(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        fArr[0] = f / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 1.0f;
    }

    /* JADX INFO: renamed from: f */
    private static float m8030f(float f) {
        return f * 0.017453292f;
    }

    /* JADX INFO: renamed from: g */
    private static void m8031g(float[] fArr, float[] fArr2) {
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = 0.0f;
        fArr2[4] = fArr[3];
        fArr2[5] = fArr[4];
        fArr2[6] = fArr[5];
        fArr2[7] = 0.0f;
        fArr2[8] = fArr[6];
        fArr2[9] = fArr[7];
        fArr2[10] = fArr[8];
        fArr2[11] = 0.0f;
        fArr2[12] = 0.0f;
        fArr2[13] = 0.0f;
        fArr2[14] = 0.0f;
        fArr2[15] = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m8032a() {
        NewTarget[] newTargetArrGetTargets;
        synchronized (exh.f20734a) {
            if (!exh.f20735b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            newTargetArrGetTargets = LightCycleNative.GetTargets();
        }
        float[] fArr = new float[16];
        this.f20910d.clear();
        if (newTargetArrGetTargets != null) {
            for (NewTarget newTarget : newTargetArrGetTargets) {
                m8031g(newTarget.orientation, fArr);
                this.f20910d.put(Integer.valueOf(newTarget.key), (float[]) fArr.clone());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8033b(float[] fArr) {
        NewTarget[] newTargetArrInitTargets;
        m8034d();
        synchronized (exh.f20734a) {
            if (!exh.f20735b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            newTargetArrInitTargets = LightCycleNative.InitTargets(fArr);
        }
        if (newTargetArrInitTargets != null) {
            for (int i = 0; i < newTargetArrInitTargets.length; i++) {
                float[] fArr2 = new float[16];
                m8031g(newTargetArrInitTargets[i].orientation, fArr2);
                this.f20910d.put(Integer.valueOf(newTargetArrInitTargets[i].key), fArr2);
            }
        }
        this.f20925s = true;
        this.f20926t = true;
        this.f20927u = 0.1f;
        this.f20928v = 0L;
    }

    /* JADX INFO: renamed from: d */
    public final void m8034d() {
        this.f20910d.clear();
        Object obj = exh.f20734a;
        LightCycleNative.ResetTargets();
    }

    /* JADX INFO: renamed from: e */
    public final void m8035e(int i) {
        boolean z = true;
        if (i != 3 && i != 4) {
            z = false;
        }
        this.f20922p = z;
    }
}
