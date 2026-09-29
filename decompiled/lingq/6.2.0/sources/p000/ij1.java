package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ij1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f44173a;

    /* JADX INFO: renamed from: b */
    public int f44174b;

    /* JADX INFO: renamed from: c */
    public int f44175c;

    /* JADX INFO: renamed from: d */
    public int f44176d;

    /* JADX INFO: renamed from: e */
    public int f44177e;

    /* JADX INFO: renamed from: f */
    public int f44178f;

    /* JADX INFO: renamed from: g */
    public int f44179g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ConstraintLayout f44180h;

    public ij1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f44180h = constraintLayout;
        this.f44173a = constraintLayout2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13941a(int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: b */
    public final void m13942b(vj1 vj1Var, ua0 ua0Var) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        boolean z;
        int i;
        int childMeasureSpec;
        if (vj1Var == null) {
            return;
        }
        bj1 bj1Var = vj1Var.f65442K;
        bj1 bj1Var2 = vj1Var.f65440I;
        if (vj1Var.f65473h0 == 8) {
            ua0Var.f63630e = 0;
            ua0Var.f63631f = 0;
            ua0Var.f63632g = 0;
            return;
        }
        if (vj1Var.f65452U == null) {
            return;
        }
        h59 h59Var = ConstraintLayout.f5445K;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ua0Var.f63626a;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ua0Var.f63627b;
        int i2 = ua0Var.f63628c;
        int i3 = ua0Var.f63629d;
        int i4 = this.f44174b + this.f44175c;
        int i5 = this.f44176d;
        View view = vj1Var.f65471g0;
        int[] iArr = fj1.f39189a;
        int i6 = iArr[constraintWidget$DimensionBehaviour.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f44178f, i5, -2);
            } else if (i6 == 3) {
                int i7 = this.f44178f;
                int i8 = bj1Var2 != null ? bj1Var2.f8583g : 0;
                if (bj1Var != null) {
                    i8 += bj1Var.f8583g;
                }
                childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
            } else if (i6 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f44178f, i5, -2);
                boolean z2 = vj1Var.f65492r == 1;
                int i9 = ua0Var.f63635j;
                if (i9 == 1 || i9 == 2) {
                    boolean z3 = view.getMeasuredHeight() == vj1Var.m23322l();
                    if (ua0Var.f63635j == 2 || !z2 || ((z2 && z3) || vj1Var.mo12813B())) {
                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(vj1Var.m23326r(), 1073741824);
                    }
                }
            }
            iMakeMeasureSpec = childMeasureSpec;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        int i10 = iArr[constraintWidget$DimensionBehaviour2.ordinal()];
        if (i10 == 1) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        } else if (i10 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f44179g, i4, -2);
        } else if (i10 == 3) {
            int i11 = this.f44179g;
            int i12 = bj1Var2 != null ? vj1Var.f65441J.f8583g : 0;
            if (bj1Var != null) {
                i12 += vj1Var.f65443L.f8583g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, i4 + i12, -1);
        } else if (i10 != 4) {
            iMakeMeasureSpec2 = 0;
        } else {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f44179g, i4, -2);
            boolean z4 = vj1Var.f65494s == 1;
            int i13 = ua0Var.f63635j;
            if (i13 == 1 || i13 == 2) {
                boolean z5 = view.getMeasuredWidth() == vj1Var.m23326r();
                if (ua0Var.f63635j == 2 || !z4 || ((z4 && z5) || vj1Var.mo12814C())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(vj1Var.m23322l(), 1073741824);
                }
            }
        }
        wj1 wj1Var = (wj1) vj1Var.f65452U;
        ConstraintLayout constraintLayout = this.f44180h;
        if (wj1Var != null && AbstractC3423or.m18270o(constraintLayout.f5457i, 256) && view.getMeasuredWidth() == vj1Var.m23326r() && view.getMeasuredWidth() < wj1Var.m23326r() && view.getMeasuredHeight() == vj1Var.m23322l() && view.getMeasuredHeight() < wj1Var.m23322l() && view.getBaseline() == vj1Var.f65461b0 && !vj1Var.m23302A() && m13941a(vj1Var.f65438G, iMakeMeasureSpec, vj1Var.m23326r()) && m13941a(vj1Var.f65439H, iMakeMeasureSpec2, vj1Var.m23322l())) {
            ua0Var.f63630e = vj1Var.m23326r();
            ua0Var.f63631f = vj1Var.m23322l();
            ua0Var.f63632g = vj1Var.f65461b0;
            return;
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z6 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3;
        boolean z7 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
        boolean z8 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour4 || constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z9 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour4 || constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z10 = z6 && vj1Var.f65455X > 0.0f;
        boolean z11 = z7 && vj1Var.f65455X > 0.0f;
        if (view == null) {
            return;
        }
        hj1 hj1Var = (hj1) view.getLayoutParams();
        int i14 = ua0Var.f63635j;
        if (i14 != 1 && i14 != 2 && z6 && vj1Var.f65492r == 0 && z7 && vj1Var.f65494s == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax = 0;
            iMax2 = 0;
        } else {
            if ((view instanceof dwa) && (vj1Var instanceof ewa)) {
                ((dwa) view).mo1933l((ewa) vj1Var, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            vj1Var.f65438G = iMakeMeasureSpec;
            vj1Var.f65439H = iMakeMeasureSpec2;
            vj1Var.f65470g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            int i15 = vj1Var.f65497u;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = vj1Var.f65498v;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = vj1Var.f65500x;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = vj1Var.f65501y;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!AbstractC3423or.m18270o(constraintLayout.f5457i, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * vj1Var.f65455X) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / vj1Var.f65455X) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                i = -1;
                z = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                vj1Var.f65438G = iMakeMeasureSpec;
                vj1Var.f65439H = iMakeMeasureSpec3;
                z = false;
                vj1Var.f65470g = false;
                iMax = view.getMeasuredWidth();
                iMax2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        ua0Var.f63634i = (iMax == ua0Var.f63628c && iMax2 == ua0Var.f63629d) ? z : true;
        if (hj1Var.f42447c0) {
            z12 = true;
        }
        if (z12 && baseline != -1 && vj1Var.f65461b0 != baseline) {
            ua0Var.f63634i = true;
        }
        ua0Var.f63630e = iMax;
        ua0Var.f63631f = iMax2;
        ua0Var.f63633h = z12;
        ua0Var.f63632g = baseline;
    }
}
