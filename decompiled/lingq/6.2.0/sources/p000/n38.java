package p000;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n38 implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f52289a;

    /* JADX INFO: renamed from: b */
    public int f52290b;

    /* JADX INFO: renamed from: c */
    public OverScroller f52291c;

    /* JADX INFO: renamed from: d */
    public Interpolator f52292d;

    /* JADX INFO: renamed from: e */
    public boolean f52293e;

    /* JADX INFO: renamed from: f */
    public boolean f52294f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RecyclerView f52295g;

    public n38(RecyclerView recyclerView) {
        this.f52295g = recyclerView;
        wa4 wa4Var = RecyclerView.f6602e1;
        this.f52292d = wa4Var;
        this.f52293e = false;
        this.f52294f = false;
        this.f52291c = new OverScroller(recyclerView.getContext(), wa4Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m17199a(int i, int i2) {
        RecyclerView recyclerView = this.f52295g;
        recyclerView.setScrollState(2);
        this.f52290b = 0;
        this.f52289a = 0;
        Interpolator interpolator = this.f52292d;
        wa4 wa4Var = RecyclerView.f6602e1;
        if (interpolator != wa4Var) {
            this.f52292d = wa4Var;
            this.f52291c = new OverScroller(recyclerView.getContext(), wa4Var);
        }
        this.f52291c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m17200b();
    }

    /* JADX INFO: renamed from: b */
    public final void m17200b() {
        if (this.f52293e) {
            this.f52294f = true;
            return;
        }
        RecyclerView recyclerView = this.f52295g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = dta.f36217a;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m17201c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.f52295g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f6602e1;
        }
        if (this.f52292d != interpolator) {
            this.f52292d = interpolator;
            this.f52291c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f52290b = 0;
        this.f52289a = 0;
        recyclerView.setScrollState(2);
        this.f52291c.startScroll(0, 0, i, i2, i4);
        m17200b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f52295g;
        int[] iArr = recyclerView.f6626O0;
        if (recyclerView.f6613I == null) {
            recyclerView.removeCallbacks(this);
            this.f52291c.abortAnimation();
            return;
        }
        this.f52294f = false;
        this.f52293e = true;
        recyclerView.m2753p();
        OverScroller overScroller = this.f52291c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f52289a;
            int i7 = currY - this.f52290b;
            this.f52289a = currX;
            this.f52290b = currY;
            int iM2707o = RecyclerView.m2707o(i6, recyclerView.f6656g0, recyclerView.f6660i0, recyclerView.getWidth());
            int iM2707o2 = RecyclerView.m2707o(i7, recyclerView.f6658h0, recyclerView.f6662j0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f6626O0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.m2761v(iM2707o, iM2707o2, 1, iArr2, null)) {
                iM2707o -= iArr[0];
                iM2707o2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m2750n(iM2707o, iM2707o2);
            }
            if (recyclerView.f6611H != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m2740h0(iM2707o, iM2707o2, iArr);
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = iM2707o - i8;
                int i11 = iM2707o2 - i9;
                fd5 fd5Var = recyclerView.f6613I.f69175e;
                if (fd5Var != null && !fd5Var.m11780h() && fd5Var.m11781i()) {
                    int iM14789b = recyclerView.f6606C0.m14789b();
                    if (iM14789b == 0) {
                        fd5Var.m11787o();
                    } else if (fd5Var.m11779g() >= iM14789b) {
                        fd5Var.m11785m(iM14789b - 1);
                        fd5Var.m11782j(i8, i9);
                    } else {
                        fd5Var.m11782j(i8, i9);
                    }
                }
                i = i10;
                i3 = i8;
                i2 = i11;
                i4 = i9;
            } else {
                i = iM2707o;
                i2 = iM2707o2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f6617K.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f6626O0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m2762w(i3, i4, i, i2, null, 1, iArr3);
            int i12 = i - iArr[0];
            int i13 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.m2763x(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            fd5 fd5Var2 = recyclerView.f6613I.f69175e;
            if ((fd5Var2 == null || !fd5Var2.m11780h()) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i12 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i12 > 0 ? currVelocity : 0;
                    }
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.m2765z();
                        if (recyclerView.f6656g0.isFinished()) {
                            recyclerView.f6656g0.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.m2708A();
                        if (recyclerView.f6660i0.isFinished()) {
                            recyclerView.f6660i0.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m2709B();
                        if (recyclerView.f6658h0.isFinished()) {
                            recyclerView.f6658h0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m2764y();
                        if (recyclerView.f6662j0.isFinished()) {
                            recyclerView.f6662j0.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f6600c1) {
                    pj3 pj3Var = recyclerView.f6605B0;
                    int[] iArr4 = (int[]) pj3Var.f56314e;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    pj3Var.f56313d = 0;
                }
            } else {
                m17200b();
                zj3 zj3Var = recyclerView.f6604A0;
                if (zj3Var != null) {
                    zj3Var.m25676a(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                s28.m21010a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        fd5 fd5Var3 = recyclerView.f6613I.f69175e;
        if (fd5Var3 != null && fd5Var3.m11780h()) {
            fd5Var3.m11782j(0, 0);
        }
        this.f52293e = false;
        if (!this.f52294f) {
            recyclerView.setScrollState(0);
            recyclerView.m2754p0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = dta.f36217a;
            recyclerView.postOnAnimation(this);
        }
    }
}
