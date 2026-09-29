package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import androidx.constraintlayout.widget.Barrier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class g36 {

    /* JADX INFO: renamed from: a */
    public wj1 f40113a = new wj1();

    /* JADX INFO: renamed from: b */
    public wj1 f40114b = new wj1();

    /* JADX INFO: renamed from: c */
    public sj1 f40115c = null;

    /* JADX INFO: renamed from: d */
    public sj1 f40116d = null;

    /* JADX INFO: renamed from: e */
    public int f40117e;

    /* JADX INFO: renamed from: f */
    public int f40118f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC0475b f40119g;

    public g36(AbstractC0475b abstractC0475b) {
        this.f40119g = abstractC0475b;
    }

    /* JADX INFO: renamed from: c */
    public static void m12322c(wj1 wj1Var, wj1 wj1Var2) {
        vj1 os3Var;
        ArrayList<vj1> arrayList = wj1Var.f66917t0;
        HashMap map = new HashMap();
        map.put(wj1Var, wj1Var2);
        wj1Var2.f66917t0.clear();
        wj1Var2.mo10150g(wj1Var, map);
        for (vj1 vj1Var : arrayList) {
            if (vj1Var instanceof l80) {
                os3Var = new l80();
            } else if (vj1Var instanceof gq3) {
                os3Var = new gq3();
            } else if (vj1Var instanceof d83) {
                os3Var = new d83();
            } else if (vj1Var instanceof o87) {
                os3Var = new o87();
            } else {
                os3Var = vj1Var instanceof os3 ? new os3() : new vj1();
            }
            wj1Var2.f66917t0.add(os3Var);
            vj1 vj1Var2 = os3Var.f65452U;
            if (vj1Var2 != null) {
                ((wj1) vj1Var2).f66917t0.remove(os3Var);
                os3Var.mo23303D();
            }
            os3Var.f65452U = wj1Var2;
            map.put(vj1Var, os3Var);
        }
        for (vj1 vj1Var3 : arrayList) {
            ((vj1) map.get(vj1Var3)).mo10150g(vj1Var3, map);
        }
    }

    /* JADX INFO: renamed from: d */
    public static vj1 m12323d(wj1 wj1Var, View view) {
        if (wj1Var.f65471g0 == view) {
            return wj1Var;
        }
        ArrayList arrayList = wj1Var.f66917t0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vj1 vj1Var = (vj1) arrayList.get(i);
            if (vj1Var.f65471g0 == view) {
                return vj1Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m12324a() {
        int i;
        HashMap map;
        SparseArray sparseArray;
        int[] iArr;
        int i2;
        Rect rect;
        Rect rect2;
        Interpolator interpolatorLoadInterpolator;
        AbstractC0475b abstractC0475b = this.f40119g;
        int childCount = abstractC0475b.getChildCount();
        HashMap map2 = abstractC0475b.f5395V;
        map2.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = abstractC0475b.getChildAt(i3);
            y26 y26Var = new y26(childAt);
            int id = childAt.getId();
            iArr2[i3] = id;
            sparseArray2.put(id, y26Var);
            map2.put(childAt, y26Var);
        }
        int i4 = 0;
        while (i4 < childCount) {
            View childAt2 = abstractC0475b.getChildAt(i4);
            y26 y26Var2 = (y26) map2.get(childAt2);
            if (y26Var2 == null) {
                i = childCount;
                map = map2;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i2 = i4;
            } else {
                Rect rect3 = y26Var2.f69141a;
                if (this.f40115c != null) {
                    vj1 vj1VarM12323d = m12323d(this.f40113a, childAt2);
                    if (vj1VarM12323d != null) {
                        Rect rectM1935o = AbstractC0475b.m1935o(abstractC0475b, vj1VarM12323d);
                        sj1 sj1Var = this.f40115c;
                        map = map2;
                        int width = abstractC0475b.getWidth();
                        iArr = iArr2;
                        int height = abstractC0475b.getHeight();
                        i2 = i4;
                        i36 i36Var = y26Var2.f69146f;
                        sparseArray = sparseArray2;
                        int i5 = sj1Var.f60919d;
                        if (i5 != 0) {
                            y26.m24864f(rectM1935o, rect3, i5, width, height);
                        }
                        i36Var.f43415c = 0.0f;
                        i36Var.f43416d = 0.0f;
                        y26Var2.m24869e(i36Var);
                        i = childCount;
                        rect = rect3;
                        i36Var.m13641d(rectM1935o.left, rectM1935o.top, rectM1935o.width(), rectM1935o.height());
                        nj1 nj1VarM21411h = sj1Var.m21411h(y26Var2.f69143c);
                        i36Var.m13639a(nj1VarM21411h);
                        pj1 pj1Var = nj1VarM21411h.f52822d;
                        y26Var2.f69152l = pj1Var.f56303g;
                        y26Var2.f69148h.m23690c(rectM1935o, sj1Var, i5, y26Var2.f69143c);
                        y26Var2.f69135C = nj1VarM21411h.f52824f.f59395i;
                        y26Var2.f69137E = pj1Var.f56306j;
                        y26Var2.f69138F = pj1Var.f56305i;
                        Context context = y26Var2.f69142b.getContext();
                        int i6 = pj1Var.f56308l;
                        String str = pj1Var.f56307k;
                        int i7 = pj1Var.f56309m;
                        if (i6 == -2) {
                            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i7);
                        } else if (i6 == -1) {
                            interpolatorLoadInterpolator = new x26(fo2.m11964d(str), 0);
                        } else if (i6 == 0) {
                            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                        } else if (i6 == 1) {
                            interpolatorLoadInterpolator = new AccelerateInterpolator();
                        } else if (i6 == 2) {
                            interpolatorLoadInterpolator = new DecelerateInterpolator();
                        } else if (i6 != 4) {
                            interpolatorLoadInterpolator = i6 != 5 ? null : new OvershootInterpolator();
                        } else {
                            interpolatorLoadInterpolator = new BounceInterpolator();
                        }
                        y26Var2.f69139G = interpolatorLoadInterpolator;
                    } else {
                        i = childCount;
                        map = map2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                        rect = rect3;
                        if (abstractC0475b.f5404h0 != 0) {
                            Log.e("MotionLayout", qad.m19840b() + "no widget for  " + qad.m19842d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                } else {
                    i = childCount;
                    map = map2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i2 = i4;
                    rect = rect3;
                }
                if (this.f40116d != null) {
                    vj1 vj1VarM12323d2 = m12323d(this.f40114b, childAt2);
                    if (vj1VarM12323d2 != null) {
                        Rect rectM1935o2 = AbstractC0475b.m1935o(abstractC0475b, vj1VarM12323d2);
                        sj1 sj1Var2 = this.f40116d;
                        int width2 = abstractC0475b.getWidth();
                        int height2 = abstractC0475b.getHeight();
                        i36 i36Var2 = y26Var2.f69147g;
                        int i8 = sj1Var2.f60919d;
                        if (i8 != 0) {
                            Rect rect4 = rect;
                            y26.m24864f(rectM1935o2, rect4, i8, width2, height2);
                            rect2 = rect4;
                        } else {
                            rect2 = rectM1935o2;
                        }
                        i36Var2.f43415c = 1.0f;
                        i36Var2.f43416d = 1.0f;
                        y26Var2.m24869e(i36Var2);
                        i36Var2.m13641d(rect2.left, rect2.top, rect2.width(), rect2.height());
                        i36Var2.m13639a(sj1Var2.m21411h(y26Var2.f69143c));
                        y26Var2.f69149i.m23690c(rect2, sj1Var2, i8, y26Var2.f69143c);
                    } else if (abstractC0475b.f5404h0 != 0) {
                        Log.e("MotionLayout", qad.m19840b() + "no widget for  " + qad.m19842d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                    }
                }
            }
            i4 = i2 + 1;
            map2 = map;
            iArr2 = iArr;
            sparseArray2 = sparseArray;
            childCount = i;
        }
        SparseArray sparseArray3 = sparseArray2;
        int[] iArr3 = iArr2;
        int i9 = childCount;
        int i10 = 0;
        while (i10 < i9) {
            SparseArray sparseArray4 = sparseArray3;
            y26 y26Var3 = (y26) sparseArray4.get(iArr3[i10]);
            int i11 = y26Var3.f69146f.f43423k;
            if (i11 != -1) {
                y26 y26Var4 = (y26) sparseArray4.get(i11);
                y26Var3.f69146f.m13642f(y26Var4, y26Var4.f69146f);
                y26Var3.f69147g.m13642f(y26Var4, y26Var4.f69147g);
            }
            i10++;
            sparseArray3 = sparseArray4;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12325b(int i, int i2) {
        AbstractC0475b abstractC0475b = this.f40119g;
        int optimizationLevel = abstractC0475b.getOptimizationLevel();
        if (abstractC0475b.f5388Q == abstractC0475b.getStartState()) {
            wj1 wj1Var = this.f40114b;
            sj1 sj1Var = this.f40116d;
            abstractC0475b.m1970m(wj1Var, optimizationLevel, (sj1Var == null || sj1Var.f60919d == 0) ? i : i2, (sj1Var == null || sj1Var.f60919d == 0) ? i2 : i);
            sj1 sj1Var2 = this.f40115c;
            if (sj1Var2 != null) {
                wj1 wj1Var2 = this.f40113a;
                int i3 = sj1Var2.f60919d;
                int i4 = i3 == 0 ? i : i2;
                if (i3 == 0) {
                    i = i2;
                }
                abstractC0475b.m1970m(wj1Var2, optimizationLevel, i4, i);
                return;
            }
            return;
        }
        sj1 sj1Var3 = this.f40115c;
        if (sj1Var3 != null) {
            wj1 wj1Var3 = this.f40113a;
            int i5 = sj1Var3.f60919d;
            abstractC0475b.m1970m(wj1Var3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
        }
        wj1 wj1Var4 = this.f40114b;
        sj1 sj1Var4 = this.f40116d;
        int i6 = (sj1Var4 == null || sj1Var4.f60919d == 0) ? i : i2;
        if (sj1Var4 == null || sj1Var4.f60919d == 0) {
            i = i2;
        }
        abstractC0475b.m1970m(wj1Var4, optimizationLevel, i6, i);
    }

    /* JADX INFO: renamed from: e */
    public final void m12326e(sj1 sj1Var, sj1 sj1Var2) {
        this.f40115c = sj1Var;
        this.f40116d = sj1Var2;
        this.f40113a = new wj1();
        wj1 wj1Var = new wj1();
        this.f40114b = wj1Var;
        wj1 wj1Var2 = this.f40113a;
        AbstractC0475b abstractC0475b = this.f40119g;
        wj1 wj1Var3 = abstractC0475b.f5451c;
        ij1 ij1Var = wj1Var3.f66921x0;
        wj1Var2.f66921x0 = ij1Var;
        wj1Var2.f66919v0.f60618h = ij1Var;
        ij1 ij1Var2 = wj1Var3.f66921x0;
        wj1Var.f66921x0 = ij1Var2;
        wj1Var.f66919v0.f60618h = ij1Var2;
        wj1Var2.f66917t0.clear();
        this.f40114b.f66917t0.clear();
        m12322c(wj1Var3, this.f40113a);
        m12322c(wj1Var3, this.f40114b);
        if (abstractC0475b.f5399c0 > 0.5d) {
            if (sj1Var != null) {
                m12328g(this.f40113a, sj1Var);
            }
            m12328g(this.f40114b, sj1Var2);
        } else {
            m12328g(this.f40114b, sj1Var2);
            if (sj1Var != null) {
                m12328g(this.f40113a, sj1Var);
            }
        }
        this.f40113a.f66922y0 = abstractC0475b.m1968j();
        wj1 wj1Var4 = this.f40113a;
        wj1Var4.f66918u0.m16503W(wj1Var4);
        this.f40114b.f66922y0 = abstractC0475b.m1968j();
        wj1 wj1Var5 = this.f40114b;
        wj1Var5.f66918u0.m16503W(wj1Var5);
        ViewGroup.LayoutParams layoutParams = abstractC0475b.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                wj1 wj1Var6 = this.f40113a;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                wj1Var6.m23311N(constraintWidget$DimensionBehaviour);
                this.f40114b.m23311N(constraintWidget$DimensionBehaviour);
            }
            if (layoutParams.height == -2) {
                wj1 wj1Var7 = this.f40113a;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                wj1Var7.m23312O(constraintWidget$DimensionBehaviour2);
                this.f40114b.m23312O(constraintWidget$DimensionBehaviour2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12327f() {
        AbstractC0475b abstractC0475b = this.f40119g;
        int i = abstractC0475b.f5392S;
        int i2 = abstractC0475b.f5393T;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        abstractC0475b.f5370D0 = mode;
        abstractC0475b.f5371E0 = mode2;
        m12325b(i, i2);
        int i3 = 0;
        if (!(abstractC0475b.getParent() instanceof AbstractC0475b) || mode != 1073741824 || mode2 != 1073741824) {
            m12325b(i, i2);
            abstractC0475b.f5422z0 = this.f40113a.m23326r();
            abstractC0475b.f5367A0 = this.f40113a.m23322l();
            abstractC0475b.f5368B0 = this.f40114b.m23326r();
            int iM23322l = this.f40114b.m23322l();
            abstractC0475b.f5369C0 = iM23322l;
            abstractC0475b.f5421y0 = (abstractC0475b.f5422z0 == abstractC0475b.f5368B0 && abstractC0475b.f5367A0 == iM23322l) ? false : true;
        }
        int i4 = abstractC0475b.f5422z0;
        int i5 = abstractC0475b.f5367A0;
        int i6 = abstractC0475b.f5370D0;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((abstractC0475b.f5372F0 * (abstractC0475b.f5368B0 - i4)) + i4);
        }
        int i7 = abstractC0475b.f5371E0;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) ((abstractC0475b.f5372F0 * (abstractC0475b.f5369C0 - i5)) + i5);
        }
        wj1 wj1Var = this.f40113a;
        abstractC0475b.m1969l(i, i2, i4, i5, wj1Var.f66909H0 || this.f40114b.f66909H0, wj1Var.f66910I0 || this.f40114b.f66910I0);
        HashMap map = abstractC0475b.f5395V;
        int childCount = abstractC0475b.getChildCount();
        abstractC0475b.f5383N0.m12324a();
        abstractC0475b.f5403g0 = true;
        SparseArray sparseArray = new SparseArray();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = abstractC0475b.getChildAt(i8);
            sparseArray.put(childAt.getId(), (y26) map.get(childAt));
        }
        int width = abstractC0475b.getWidth();
        int height = abstractC0475b.getHeight();
        n36 n36Var = abstractC0475b.f5378L.f5425c;
        int i9 = n36Var != null ? n36Var.f52285p : -1;
        if (i9 != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                y26 y26Var = (y26) map.get(abstractC0475b.getChildAt(i10));
                if (y26Var != null) {
                    y26Var.f69134B = i9;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[map.size()];
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            y26 y26Var2 = (y26) map.get(abstractC0475b.getChildAt(i12));
            int i13 = y26Var2.f69146f.f43423k;
            if (i13 != -1) {
                sparseBooleanArray.put(i13, true);
                iArr[i11] = y26Var2.f69146f.f43423k;
                i11++;
            }
        }
        for (int i14 = 0; i14 < i11; i14++) {
            y26 y26Var3 = (y26) map.get(abstractC0475b.findViewById(iArr[i14]));
            if (y26Var3 != null) {
                abstractC0475b.f5378L.m1954e(y26Var3);
                y26Var3.m24870g(abstractC0475b.getNanoTime(), width, height);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = abstractC0475b.getChildAt(i15);
            y26 y26Var4 = (y26) map.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && y26Var4 != null) {
                abstractC0475b.f5378L.m1954e(y26Var4);
                y26Var4.m24870g(abstractC0475b.getNanoTime(), width, height);
            }
        }
        n36 n36Var2 = abstractC0475b.f5378L.f5425c;
        float f = n36Var2 != null ? n36Var2.f52278i : 0.0f;
        if (f != 0.0f) {
            boolean z = ((double) f) < 0.0d;
            float fAbs = Math.abs(f);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                y26 y26Var5 = (y26) map.get(abstractC0475b.getChildAt(i16));
                if (!Float.isNaN(y26Var5.f69152l)) {
                    for (int i17 = 0; i17 < childCount; i17++) {
                        y26 y26Var6 = (y26) map.get(abstractC0475b.getChildAt(i17));
                        if (!Float.isNaN(y26Var6.f69152l)) {
                            fMin = Math.min(fMin, y26Var6.f69152l);
                            fMax = Math.max(fMax, y26Var6.f69152l);
                        }
                    }
                    while (i3 < childCount) {
                        y26 y26Var7 = (y26) map.get(abstractC0475b.getChildAt(i3));
                        if (!Float.isNaN(y26Var7.f69152l)) {
                            y26Var7.f69154n = 1.0f / (1.0f - fAbs);
                            float f2 = y26Var7.f69152l;
                            if (z) {
                                y26Var7.f69153m = fAbs - (((fMax - f2) / (fMax - fMin)) * fAbs);
                            } else {
                                y26Var7.f69153m = fAbs - (((f2 - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                i36 i36Var = y26Var5.f69147g;
                float f3 = i36Var.f43417e;
                float f4 = i36Var.f43418f;
                float f5 = z ? f4 - f3 : f4 + f3;
                fMin2 = Math.min(fMin2, f5);
                fMax2 = Math.max(fMax2, f5);
            }
            while (i3 < childCount) {
                y26 y26Var8 = (y26) map.get(abstractC0475b.getChildAt(i3));
                i36 i36Var2 = y26Var8.f69147g;
                float f6 = i36Var2.f43417e;
                float f7 = i36Var2.f43418f;
                float f8 = z ? f7 - f6 : f7 + f6;
                y26Var8.f69154n = 1.0f / (1.0f - fAbs);
                y26Var8.f69153m = fAbs - (((f8 - fMin2) * fAbs) / (fMax2 - fMin2));
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12328g(wj1 wj1Var, sj1 sj1Var) {
        nj1 nj1Var;
        nj1 nj1Var2;
        SparseArray sparseArray = new SparseArray();
        zj1 zj1Var = new zj1();
        sparseArray.clear();
        sparseArray.put(0, wj1Var);
        AbstractC0475b abstractC0475b = this.f40119g;
        sparseArray.put(abstractC0475b.getId(), wj1Var);
        if (sj1Var != null && sj1Var.f60919d != 0) {
            abstractC0475b.m1970m(this.f40114b, abstractC0475b.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(abstractC0475b.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(abstractC0475b.getWidth(), 1073741824));
        }
        for (vj1 vj1Var : wj1Var.f66917t0) {
            vj1Var.f65475i0 = true;
            sparseArray.put(vj1Var.f65471g0.getId(), vj1Var);
        }
        for (vj1 vj1Var2 : wj1Var.f66917t0) {
            View view = vj1Var2.f65471g0;
            int id = view.getId();
            HashMap map = sj1Var.f60922g;
            if (map.containsKey(Integer.valueOf(id)) && (nj1Var2 = (nj1) map.get(Integer.valueOf(id))) != null) {
                nj1Var2.m17457b(zj1Var);
            }
            vj1Var2.m23313P(sj1Var.m21411h(view.getId()).f52823e.f54420c);
            vj1Var2.m23310M(sj1Var.m21411h(view.getId()).f52823e.f54422d);
            if (view instanceof ej1) {
                ej1 ej1Var = (ej1) view;
                int id2 = ej1Var.getId();
                HashMap map2 = sj1Var.f60922g;
                if (map2.containsKey(Integer.valueOf(id2)) && (nj1Var = (nj1) map2.get(Integer.valueOf(id2))) != null && (vj1Var2 instanceof os3)) {
                    ej1Var.mo1931i(nj1Var, (os3) vj1Var2, zj1Var, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).m11172k();
                }
            }
            zj1Var.resolveLayoutDirection(abstractC0475b.getLayoutDirection());
            abstractC0475b.m1965a(false, view, vj1Var2, zj1Var, sparseArray);
            if (sj1Var.m21411h(view.getId()).f52821c.f57845c == 1) {
                vj1Var2.f65473h0 = view.getVisibility();
            } else {
                vj1Var2.f65473h0 = sj1Var.m21411h(view.getId()).f52821c.f57844b;
            }
        }
        for (vj1 vj1Var3 : wj1Var.f66917t0) {
            if (vj1Var3 instanceof ewa) {
                ej1 ej1Var2 = (ej1) vj1Var3.f65471g0;
                os3 os3Var = (os3) vj1Var3;
                ej1Var2.getClass();
                os3Var.f54931u0 = 0;
                Arrays.fill(os3Var.f54930t0, (Object) null);
                for (int i = 0; i < ej1Var2.f37319b; i++) {
                    os3Var.m18460S((vj1) sparseArray.get(ej1Var2.f37318a[i]));
                }
                ewa ewaVar = (ewa) os3Var;
                for (int i2 = 0; i2 < ewaVar.f54931u0; i2++) {
                    vj1 vj1Var4 = ewaVar.f54930t0[i2];
                    if (vj1Var4 != null) {
                        vj1Var4.f65437F = true;
                    }
                }
            }
        }
    }
}
