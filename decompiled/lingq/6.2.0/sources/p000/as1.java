package p000;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class as1 {

    /* JADX INFO: renamed from: a */
    public final PointF f7414a;

    /* JADX INFO: renamed from: b */
    public final PointF f7415b;

    /* JADX INFO: renamed from: c */
    public final PointF f7416c;

    public as1() {
        this.f7414a = new PointF();
        this.f7415b = new PointF();
        this.f7416c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f7416c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f7414a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f7415b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public as1(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f7414a = pointF;
        this.f7415b = pointF2;
        this.f7416c = pointF3;
    }
}
