package p000;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ixz extends ixy {

    /* JADX INFO: renamed from: a */
    private final iya f32621a;

    /* JADX INFO: renamed from: n */
    private final Interpolator f32622n;

    /* JADX INFO: renamed from: o */
    private final mrf f32623o;

    /* JADX INFO: renamed from: p */
    private final msi f32624p;

    public ixz(Context context, float f, float f2, mrf mrfVar, msi msiVar) {
        super(context, f);
        float fMax = Math.max(f2, 0.5f);
        this.f32621a = new iya(fMax + fMax);
        this.f32622n = new DecelerateInterpolator();
        this.f32623o = mrfVar;
        this.f32624p = msiVar;
    }

    /* JADX INFO: renamed from: p */
    private final PointF m11884p() {
        PointF pointFM16481d;
        if (this.f40805k == null && (pointFM16481d = m16481d(this.f40796b)) != null && (pointFM16481d.x != 0.0f || pointFM16481d.y != 0.0f)) {
            m16479o(pointFM16481d);
            this.f40805k = pointFM16481d;
        }
        return this.f40805k;
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: c */
    protected final void mo11885c(View view, C0823mi c0823mi) {
        PointF pointFM11884p = m11884p();
        if (pointFM11884p != null) {
            if (pointFM11884p.x == 0.0f && pointFM11884p.y == 0.0f) {
                return;
            }
            int[] iArr = (int[]) this.f32623o.apply(view);
            int i = iArr[0];
            int i2 = iArr[1];
            int iMo11886j = mo11886j(Math.max(Math.abs(i), Math.abs(i2)));
            if (iMo11886j > 0) {
                c0823mi.m16399b(i, i2, iMo11886j, this.f32622n);
            }
        }
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: j */
    protected final int mo11886j(int i) {
        iya iyaVar = this.f32621a;
        float f = iyaVar.f32631a;
        double d = f;
        double dPow = Math.pow(1.0f - iyaVar.f32632b, f - 1.0f);
        Double.isNaN(d);
        return (int) (i / (((float) (d * dPow)) * 0.5f));
    }

    @Override // p000.C0825mk
    /* JADX INFO: renamed from: m */
    protected final void mo11887m(C0823mi c0823mi) {
        this.f40805k = null;
        PointF pointFM11884p = m11884p();
        if (pointFM11884p == null) {
            c0823mi.f40571a = this.f40796b;
            m16483f();
            return;
        }
        int iIntValue = ((Integer) this.f32624p.mo6051a()).intValue();
        if (iIntValue == 0) {
            iIntValue = 10000;
        }
        float f = iIntValue;
        this.f40806l = (int) (pointFM11884p.x * f);
        this.f40807m = (int) (f * pointFM11884p.y);
        c0823mi.m16399b(this.f40806l, this.f40807m, mo15850b(Math.max(Math.abs(this.f40806l), Math.abs(this.f40807m))), this.f32621a);
    }
}
