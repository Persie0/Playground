package p000;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: mi */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0823mi {

    /* JADX INFO: renamed from: a */
    public int f40571a = -1;

    /* JADX INFO: renamed from: f */
    private boolean f40576f = false;

    /* JADX INFO: renamed from: g */
    private int f40577g = 0;

    /* JADX INFO: renamed from: b */
    private int f40572b = 0;

    /* JADX INFO: renamed from: c */
    private int f40573c = 0;

    /* JADX INFO: renamed from: d */
    private int f40574d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    private Interpolator f40575e = null;

    /* JADX INFO: renamed from: a */
    final void m16398a(RecyclerView recyclerView) {
        int i = this.f40571a;
        if (i >= 0) {
            this.f40571a = -1;
            recyclerView.m1210I(i);
            this.f40576f = false;
            return;
        }
        if (!this.f40576f) {
            this.f40577g = 0;
            return;
        }
        Interpolator interpolator = this.f40575e;
        if (interpolator != null && this.f40574d <= 0) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f40574d;
        if (i2 <= 0) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1072J.m16650c(this.f40572b, this.f40573c, i2, interpolator);
        int i3 = this.f40577g + 1;
        this.f40577g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f40576f = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m16399b(int i, int i2, int i3, Interpolator interpolator) {
        this.f40572b = i;
        this.f40573c = i2;
        this.f40574d = i3;
        this.f40575e = interpolator;
        this.f40576f = true;
    }
}
