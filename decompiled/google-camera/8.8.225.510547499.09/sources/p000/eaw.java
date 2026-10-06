package p000;

import android.graphics.Rect;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eaw {

    /* JADX INFO: renamed from: a */
    public static final nbh f13136a = nbh.m17259h("com/google/android/apps/camera/gyro/motionestimator/GyroTransformCalculator");

    /* JADX INFO: renamed from: b */
    public final end f13137b;

    /* JADX INFO: renamed from: c */
    public final int f13138c;

    /* JADX INFO: renamed from: d */
    public final kbc f13139d;

    /* JADX INFO: renamed from: e */
    public final Object f13140e = new Object();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f13141f = new AtomicReference();

    /* JADX INFO: renamed from: g */
    private final enj f13142g;

    /* JADX INFO: renamed from: h */
    private final SizeF f13143h;

    /* JADX INFO: renamed from: i */
    private final kbc f13144i;

    /* JADX INFO: renamed from: j */
    private final float f13145j;

    /* JADX INFO: renamed from: k */
    private final Set f13146k;

    public eaw(SizeF sizeF, kbc kbcVar, kbc kbcVar2, int i, end endVar, enj enjVar, Set set) {
        lku.m15669w(true);
        this.f13143h = sizeF;
        this.f13139d = kbcVar;
        this.f13144i = kbcVar2;
        this.f13138c = i;
        this.f13137b = endVar;
        this.f13142g = enjVar;
        this.f13146k = set;
        float width = sizeF.getWidth() / sizeF.getHeight();
        float f = kbcVar.f35517a / kbcVar.f35518b;
        this.f13145j = ((f / width) - 1.0f) / ((f + f) / width);
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        this.f13141f.set(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static long m7023d(long j, long j2, long j3) {
        return j + ((j2 + j3) / 2);
    }

    /* JADX INFO: renamed from: a */
    public final float m7024a(float f, float f2, float[] fArr) {
        return (((1.0f / ((1.0f / f) - (f2 / 1000.0f))) * this.f13139d.f35517a) / this.f13143h.getWidth()) * (fArr[0] + fArr[1]) * 0.5f;
    }

    /* JADX INFO: renamed from: b */
    public final long m7025b(long j, float[] fArr) {
        float f = this.f13145j;
        return (long) ((j * (1.0f - (f + f))) / fArr[1]);
    }

    /* JADX INFO: renamed from: c */
    public final long m7026c(long j, long j2, float[] fArr) {
        if (j <= 0) {
            return j;
        }
        float f = j2;
        return j + ((long) (this.f13145j * f)) + ((long) ((0.5f - (0.5f / fArr[1])) * f));
    }

    /* JADX INFO: renamed from: e */
    public final float[] m7027e(String str, long j, long j2, long j3, kbc kbcVar, float[] fArr, boolean z) {
        float[] fArrMo7560b = {0.0f, 0.0f};
        if ((str == null || !this.f13146k.contains(str)) && j >= 0) {
            long jM7023d = m7023d(j, j2, j3);
            fArrMo7560b = z ? this.f13142g.mo7560b(jM7023d, j3) : this.f13142g.mo7559a(jM7023d);
        }
        return new float[]{(kbcVar.f35517a - 1) * ((fArrMo7560b[0] * fArr[0]) + 0.5f), (kbcVar.f35518b - 1) * ((fArrMo7560b[1] * fArr[1]) + 0.5f)};
    }

    /* JADX INFO: renamed from: f */
    public final float[] m7028f(Rect rect) {
        float[] fArr = {1.0f, 1.0f};
        if (rect != null) {
            fArr[0] = this.f13144i.f35517a / (rect.right - rect.left);
            fArr[1] = this.f13144i.f35518b / (rect.bottom - rect.top);
        }
        return fArr;
    }

    public final String toString() {
        return "AbsoluteGyroTransformCalculator{imageSize=" + this.f13139d.toString() + ", sensorSize=" + this.f13143h.toString() + ", timeoutMs=0, numOfStrips=" + this.f13138c + "}";
    }
}
