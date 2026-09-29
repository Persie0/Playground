package p000;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tva {

    /* JADX INFO: renamed from: a */
    public final int f62957a;

    /* JADX INFO: renamed from: b */
    public final int f62958b;

    /* JADX INFO: renamed from: c */
    public final y26 f62959c;

    /* JADX INFO: renamed from: d */
    public final int f62960d;

    /* JADX INFO: renamed from: f */
    public final a34 f62962f;

    /* JADX INFO: renamed from: g */
    public final Interpolator f62963g;

    /* JADX INFO: renamed from: i */
    public float f62965i;

    /* JADX INFO: renamed from: j */
    public float f62966j;

    /* JADX INFO: renamed from: m */
    public final boolean f62969m;

    /* JADX INFO: renamed from: e */
    public final web f62961e = new web(15);

    /* JADX INFO: renamed from: h */
    public boolean f62964h = false;

    /* JADX INFO: renamed from: l */
    public final Rect f62968l = new Rect();

    /* JADX INFO: renamed from: k */
    public long f62967k = System.nanoTime();

    public tva(a34 a34Var, y26 y26Var, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
        this.f62969m = false;
        this.f62962f = a34Var;
        this.f62959c = y26Var;
        this.f62960d = i2;
        if (((ArrayList) a34Var.f177e) == null) {
            a34Var.f177e = new ArrayList();
        }
        ((ArrayList) a34Var.f177e).add(this);
        this.f62963g = interpolator;
        this.f62957a = i4;
        this.f62958b = i5;
        if (i3 == 3) {
            this.f62969m = true;
        }
        this.f62966j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        m22315a();
    }

    /* JADX INFO: renamed from: a */
    public final void m22315a() {
        boolean z = this.f62964h;
        int i = this.f62958b;
        int i2 = this.f62957a;
        Interpolator interpolator = this.f62963g;
        y26 y26Var = this.f62959c;
        a34 a34Var = this.f62962f;
        if (z) {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.f62967k;
            this.f62967k = jNanoTime;
            float f = this.f62965i - (((float) (j * 1.0E-6d)) * this.f62966j);
            this.f62965i = f;
            if (f < 0.0f) {
                this.f62965i = 0.0f;
            }
            float interpolation = this.f62965i;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            boolean zM24868d = y26Var.m24868d(interpolation, jNanoTime, y26Var.f69142b, this.f62961e);
            if (this.f62965i <= 0.0f) {
                if (i2 != -1) {
                    y26Var.f69142b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    y26Var.f69142b.setTag(i, null);
                }
                ((ArrayList) a34Var.f178f).add(this);
            }
            if (this.f62965i > 0.0f || zM24868d) {
                ((AbstractC0475b) a34Var.f173a).invalidate();
                return;
            }
            return;
        }
        long jNanoTime2 = System.nanoTime();
        long j2 = jNanoTime2 - this.f62967k;
        this.f62967k = jNanoTime2;
        float f2 = (((float) (j2 * 1.0E-6d)) * this.f62966j) + this.f62965i;
        this.f62965i = f2;
        if (f2 >= 1.0f) {
            this.f62965i = 1.0f;
        }
        float interpolation2 = this.f62965i;
        if (interpolator != null) {
            interpolation2 = interpolator.getInterpolation(interpolation2);
        }
        boolean zM24868d2 = y26Var.m24868d(interpolation2, jNanoTime2, y26Var.f69142b, this.f62961e);
        if (this.f62965i >= 1.0f) {
            if (i2 != -1) {
                y26Var.f69142b.setTag(i2, Long.valueOf(System.nanoTime()));
            }
            if (i != -1) {
                y26Var.f69142b.setTag(i, null);
            }
            if (!this.f62969m) {
                ((ArrayList) a34Var.f178f).add(this);
            }
        }
        if (this.f62965i < 1.0f || zM24868d2) {
            ((AbstractC0475b) a34Var.f173a).invalidate();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22316b() {
        this.f62964h = true;
        int i = this.f62960d;
        if (i != -1) {
            this.f62966j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        }
        ((AbstractC0475b) this.f62962f.f173a).invalidate();
        this.f62967k = System.nanoTime();
    }
}
