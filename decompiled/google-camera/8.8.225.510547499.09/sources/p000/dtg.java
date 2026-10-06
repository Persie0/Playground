package p000;

import java.util.Arrays;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dtg {

    /* JADX INFO: renamed from: a */
    public final float[] f12554a;

    /* JADX INFO: renamed from: b */
    private final dtj f12555b;

    /* JADX INFO: renamed from: c */
    private final long f12556c;

    public dtg(dtj dtjVar, long j, float[] fArr) {
        this.f12555b = dtjVar;
        this.f12556c = j;
        this.f12554a = fArr;
    }

    /* JADX INFO: renamed from: c */
    public static dtg m6721c(dtj dtjVar, long j) {
        return new dtg(dtjVar, j, new float[0]);
    }

    /* JADX INFO: renamed from: d */
    public static dtg m6722d(dtj dtjVar, long j, float[] fArr, int i, int i2) {
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, i, fArr2, 0, i2);
        return new dtg(dtjVar, j, fArr2);
    }

    /* JADX INFO: renamed from: a */
    public final float m6723a() {
        float[] fArr = this.f12554a;
        int length = fArr.length;
        if (length == 1) {
            return fArr[0];
        }
        if (length == 0) {
            return Float.NaN;
        }
        throw new IllegalStateException("Attempting to treat multi-dimensional feature as singular!");
    }

    /* JADX INFO: renamed from: b */
    public final float m6724b(int i) {
        return this.f12554a[i];
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6725e() {
        return this.f12554a.length == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtg)) {
            return false;
        }
        dtg dtgVar = (dtg) obj;
        return this.f12556c == dtgVar.f12556c && this.f12555b.equals(dtgVar.f12555b) && Arrays.equals(this.f12554a, dtgVar.f12554a);
    }

    public final int hashCode() {
        return (Objects.hash(this.f12555b, Long.valueOf(this.f12556c)) * 31) + Arrays.hashCode(this.f12554a);
    }

    public final String toString() {
        return "f(" + this.f12556c + ")=" + Arrays.toString(this.f12554a);
    }
}
