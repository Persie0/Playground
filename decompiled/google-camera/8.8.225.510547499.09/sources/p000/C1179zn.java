package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: zn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1179zn {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f48442a;

    /* JADX INFO: renamed from: b */
    public int f48443b;

    /* JADX INFO: renamed from: c */
    public int f48444c;

    /* JADX INFO: renamed from: d */
    public int f48445d;

    /* JADX INFO: renamed from: e */
    public int f48446e;

    /* JADX INFO: renamed from: f */
    public int f48447f;

    /* JADX INFO: renamed from: g */
    public int f48448g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ ConstraintLayout f48449h;

    public C1179zn(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f48449h = constraintLayout;
        this.f48442a = constraintLayout2;
    }

    /* JADX INFO: renamed from: b */
    private static final boolean m19798b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m19799a(C1152yn c1152yn, C1160yv c1160yv) {
        long jNanoTime;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int i;
        boolean z;
        int baseline;
        int iMax;
        int iMax2;
        int i2;
        int iMakeMeasureSpec3;
        int i3;
        if (c1152yn == null) {
            return;
        }
        if (c1152yn.f48220ai == 8) {
            c1160yv.f48287c = 0;
            c1160yv.f48288d = 0;
            c1160yv.f48289e = 0;
            return;
        }
        if (c1152yn.f48206V == null) {
            return;
        }
        if (this.f48449h.mMetrics != null) {
            this.f48449h.mMetrics.f48085E++;
            jNanoTime = System.nanoTime();
        } else {
            jNanoTime = 0;
        }
        int i4 = c1160yv.f48293i;
        int i5 = c1160yv.f48294j;
        int i6 = c1160yv.f48285a;
        int i7 = c1160yv.f48286b;
        int i8 = this.f48443b + this.f48444c;
        int i9 = this.f48445d;
        Object obj = c1152yn.f48219ah;
        int i10 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        switch (i10) {
            case 0:
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                break;
            case 1:
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f48447f, i9, -2);
                break;
            case 2:
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f48447f, i9, -2);
                int i11 = c1152yn.f48246t;
                int i12 = c1160yv.f48292h;
                if (i12 == 1 || i12 == 2) {
                    int measuredHeight = ((View) obj).getMeasuredHeight();
                    int iM19687h = c1152yn.m19687h();
                    if (c1160yv.f48292h == 2 || i11 != 1 || measuredHeight == iM19687h || (obj instanceof aab) || c1152yn.mo19648e()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c1152yn.m19689j(), 1073741824);
                    }
                }
                break;
            case 3:
                int i13 = this.f48447f;
                C1151ym c1151ym = c1152yn.f48195K;
                int i14 = c1151ym != null ? c1151ym.f48182g : 0;
                C1151ym c1151ym2 = c1152yn.f48197M;
                if (c1151ym2 != null) {
                    i14 += c1151ym2.f48182g;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i9 + i14, -1);
                break;
            default:
                iMakeMeasureSpec = 0;
                break;
        }
        int i15 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        switch (i15) {
            case 0:
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                break;
            case 1:
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f48448g, i8, -2);
                break;
            case 2:
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f48448g, i8, -2);
                int i16 = c1152yn.f48247u;
                int i17 = c1160yv.f48292h;
                if (i17 == 1 || i17 == 2) {
                    int measuredWidth = ((View) obj).getMeasuredWidth();
                    int iM19689j = c1152yn.m19689j();
                    if (c1160yv.f48292h == 2 || i16 != 1 || measuredWidth == iM19689j || (obj instanceof aab) || c1152yn.mo19649f()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c1152yn.m19687h(), 1073741824);
                    }
                }
                break;
            case 3:
                int i18 = this.f48448g;
                int i19 = c1152yn.f48195K != null ? c1152yn.f48196L.f48182g : 0;
                if (c1152yn.f48197M != null) {
                    i19 += c1152yn.f48198N.f48182g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i8 + i19, -1);
                break;
            default:
                iMakeMeasureSpec2 = 0;
                break;
        }
        C1152yn c1152yn2 = c1152yn.f48206V;
        if (c1152yn2 != null && C1157ys.m19721b(this.f48449h.mOptimizationLevel, 256)) {
            View view = (View) obj;
            if (view.getMeasuredWidth() == c1152yn.m19689j() && view.getMeasuredWidth() < c1152yn2.m19689j() && view.getMeasuredHeight() == c1152yn.m19687h() && view.getMeasuredHeight() < c1152yn2.m19687h() && view.getBaseline() == c1152yn.f48214ac && !c1152yn.m19678M() && m19798b(c1152yn.f48193I, iMakeMeasureSpec, c1152yn.m19689j()) && m19798b(c1152yn.f48194J, iMakeMeasureSpec2, c1152yn.m19687h())) {
                c1160yv.f48287c = c1152yn.m19689j();
                c1160yv.f48288d = c1152yn.m19687h();
                c1160yv.f48289e = c1152yn.f48214ac;
                return;
            }
        }
        boolean z2 = i4 == 3;
        boolean z3 = i5 == 3;
        if (i5 != 4) {
            i = 1;
            z = i5 == 1;
        } else {
            i = 1;
            z = true;
        }
        boolean z4 = i4 == 4 || i4 == i;
        boolean z5 = z2 && c1152yn.f48209Y > 0.0f;
        boolean z6 = z3 && c1152yn.f48209Y > 0.0f;
        if (obj == null) {
            return;
        }
        View view2 = (View) obj;
        C1178zm c1178zm = (C1178zm) view2.getLayoutParams();
        long j = jNanoTime;
        int i20 = c1160yv.f48292h;
        if (i20 != 1 && i20 != 2 && z2 && c1152yn.f48246t == 0 && z3 && c1152yn.f48247u == 0) {
            baseline = 0;
            iMax = 0;
            iMax2 = 0;
        } else {
            if ((obj instanceof aaf) && (c1152yn instanceof C1158yt)) {
                throw null;
            }
            view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            c1152yn.m19668C(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth2 = view2.getMeasuredWidth();
            int measuredHeight2 = view2.getMeasuredHeight();
            baseline = view2.getBaseline();
            int i21 = c1152yn.f48249w;
            iMax = i21 > 0 ? Math.max(i21, measuredWidth2) : measuredWidth2;
            int i22 = c1152yn.f48250x;
            if (i22 > 0) {
                iMax = Math.min(i22, iMax);
            }
            int i23 = c1152yn.f48252z;
            iMax2 = i23 > 0 ? Math.max(i23, measuredHeight2) : measuredHeight2;
            int i24 = iMakeMeasureSpec;
            int i25 = c1152yn.f48185A;
            if (i25 > 0) {
                iMax2 = Math.min(i25, iMax2);
            }
            int i26 = iMakeMeasureSpec2;
            if (!C1157ys.m19721b(this.f48449h.mOptimizationLevel, 1)) {
                if (z5 && z) {
                    iMax = (int) ((iMax2 * c1152yn.f48209Y) + 0.5f);
                } else if (z6 && z4) {
                    iMax2 = (int) ((iMax / c1152yn.f48209Y) + 0.5f);
                }
            }
            if (measuredWidth2 != iMax || measuredHeight2 != iMax2) {
                if (measuredWidth2 != iMax) {
                    i2 = 1073741824;
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                } else {
                    i2 = 1073741824;
                    iMakeMeasureSpec3 = i24;
                }
                int iMakeMeasureSpec4 = measuredHeight2 != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, i2) : i26;
                view2.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                c1152yn.m19668C(iMakeMeasureSpec3, iMakeMeasureSpec4);
                iMax = view2.getMeasuredWidth();
                iMax2 = view2.getMeasuredHeight();
                baseline = view2.getBaseline();
            }
        }
        boolean z7 = baseline != -1;
        boolean z8 = (iMax == c1160yv.f48285a && iMax2 == c1160yv.f48286b) ? false : true;
        c1160yv.f48291g = z8;
        boolean z9 = c1178zm.f48400ag | z7;
        if (!z9) {
            i3 = baseline;
        } else if (baseline != -1) {
            if (c1152yn.f48214ac != baseline) {
                c1160yv.f48291g = true;
            }
            i3 = baseline;
        } else {
            i3 = -1;
        }
        c1160yv.f48287c = iMax;
        c1160yv.f48288d = iMax2;
        c1160yv.f48290f = z9;
        c1160yv.f48289e = i3;
        if (this.f48449h.mMetrics != null) {
            long jNanoTime2 = System.nanoTime();
            this.f48449h.mMetrics.f48091a += jNanoTime2 - j;
        }
    }
}
