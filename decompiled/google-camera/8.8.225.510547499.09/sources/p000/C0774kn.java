package p000;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: renamed from: kn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0774kn extends C0167es {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0776kp f36579a;

    public C0774kn(C0776kp c0776kp) {
        this.f36579a = c0776kp;
    }

    @Override // p000.C0167es
    /* JADX INFO: renamed from: c */
    public final void mo2034c(RecyclerView recyclerView, int i, int i2) {
        C0776kp c0776kp = this.f36579a;
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = c0776kp.f36744l.computeVerticalScrollRange();
        int i3 = c0776kp.f36743k;
        c0776kp.f36745m = iComputeVerticalScrollRange - i3 > 0 && i3 >= c0776kp.f36733a;
        int iComputeHorizontalScrollRange = c0776kp.f36744l.computeHorizontalScrollRange();
        int i4 = c0776kp.f36742j;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= c0776kp.f36733a;
        c0776kp.f36746n = z;
        if (c0776kp.f36745m) {
            float f = i3;
            c0776kp.f36737e = (int) ((f * (iComputeVerticalScrollOffset + (f / 2.0f))) / iComputeVerticalScrollRange);
            c0776kp.f36736d = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        } else if (!z) {
            if (c0776kp.f36747o != 0) {
                c0776kp.m14655u(0);
                return;
            }
            return;
        }
        if (c0776kp.f36746n) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i4;
            c0776kp.f36740h = (int) ((f3 * (f2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            c0776kp.f36739g = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = c0776kp.f36747o;
        if (i5 == 0 || i5 == 1) {
            c0776kp.m14655u(1);
        }
    }
}
