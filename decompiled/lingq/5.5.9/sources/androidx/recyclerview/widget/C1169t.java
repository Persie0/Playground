package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.t */
/* JADX INFO: loaded from: classes.dex */
public class C1169t extends RecyclerView.AbstractC1130w {

    /* JADX INFO: renamed from: k */
    @SuppressLint({"UnknownNullness"})
    public PointF f7465k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f7466l;

    /* JADX INFO: renamed from: n */
    public float f7468n;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f7463i = new LinearInterpolator();

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f7464j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m */
    public boolean f7467m = false;

    /* JADX INFO: renamed from: o */
    public int f7469o = 0;

    /* JADX INFO: renamed from: p */
    public int f7470p = 0;

    @SuppressLint({"UnknownNullness"})
    public C1169t(Context context) {
        this.f7466l = context.getResources().getDisplayMetrics();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static int m4526e(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1130w
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c */
    public void mo4360c(View view, RecyclerView.AbstractC1130w.a aVar) {
        int i10;
        PointF pointF = this.f7465k;
        int i11 = -1;
        int iM4526e = 0;
        if (pointF != null) {
            float f3 = pointF.x;
            if (f3 == 0.0f) {
                i10 = 0;
            } else {
                i10 = f3 > 0.0f ? 1 : -1;
            }
        } else {
            i10 = 0;
        }
        int iMo4527f = mo4527f(view, i10);
        PointF pointF2 = this.f7465k;
        if (pointF2 != null) {
            float f10 = pointF2.y;
            if (f10 == 0.0f) {
                i11 = 0;
            } else if (f10 > 0.0f) {
                i11 = 1;
            }
        } else {
            i11 = 0;
        }
        RecyclerView.AbstractC1120m abstractC1120m = this.f7127c;
        if (abstractC1120m != null && abstractC1120m.mo4139g()) {
            RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
            iM4526e = m4526e((view.getTop() - RecyclerView.AbstractC1120m.m4289N(view)) - ((ViewGroup.MarginLayoutParams) c1121n).topMargin, RecyclerView.AbstractC1120m.m4293w(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) c1121n).bottomMargin, abstractC1120m.m4305I(), abstractC1120m.f7098o - abstractC1120m.m4301F(), i11);
        }
        int iCeil = (int) Math.ceil(((double) mo4425h((int) Math.sqrt((iM4526e * iM4526e) + (iMo4527f * iMo4527f)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f7464j;
            aVar.f7133a = -iMo4527f;
            aVar.f7134b = -iM4526e;
            aVar.f7135c = iCeil;
            aVar.f7137e = decelerateInterpolator;
            aVar.f7138f = true;
        }
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: f */
    public int mo4527f(View view, int i10) {
        RecyclerView.AbstractC1120m abstractC1120m = this.f7127c;
        if (abstractC1120m != null && abstractC1120m.mo4137f()) {
            RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
            return m4526e((view.getLeft() - RecyclerView.AbstractC1120m.m4285E(view)) - ((ViewGroup.MarginLayoutParams) c1121n).leftMargin, RecyclerView.AbstractC1120m.m4288L(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) c1121n).rightMargin, abstractC1120m.m4303G(), abstractC1120m.f7097n - abstractC1120m.m4304H(), i10);
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: g */
    public float mo4424g(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: h */
    public int mo4425h(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.f7467m) {
            this.f7468n = mo4424g(this.f7466l);
            this.f7467m = true;
        }
        return (int) Math.ceil(fAbs * this.f7468n);
    }
}
