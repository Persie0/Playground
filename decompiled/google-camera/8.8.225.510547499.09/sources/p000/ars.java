package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ars extends asf {

    /* JADX INFO: renamed from: n */
    private static final String[] f2202n = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: o */
    private static final Property f2203o;

    /* JADX INFO: renamed from: p */
    private static final Property f2204p;

    /* JADX INFO: renamed from: q */
    private static final Property f2205q;

    /* JADX INFO: renamed from: r */
    private static final Property f2206r;

    /* JADX INFO: renamed from: s */
    private static final Property f2207s;

    static {
        new arj(PointF.class);
        f2203o = new ark(PointF.class);
        f2204p = new arl(PointF.class);
        f2205q = new arm(PointF.class);
        f2206r = new arn(PointF.class);
        f2207s = new aro(PointF.class);
    }

    /* JADX INFO: renamed from: e */
    private static final void m1898e(asq asqVar) {
        View view = asqVar.f2261b;
        if (!afe.m462f(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        asqVar.f2260a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        asqVar.f2260a.put("android:changeBounds:parent", asqVar.f2261b.getParent());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0072  */
    /* JADX WARN: Code duplicated, block: B:17:0x0076 A[PHI: r13
      0x0076: PHI (r13v3 int) = (r13v1 int), (r13v0 int) binds: [B:15:0x0070, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    @Override // p000.asf
    /* JADX INFO: renamed from: a */
    public final Animator mo1899a(ViewGroup viewGroup, asq asqVar, asq asqVar2) {
        int i;
        Animator animatorM1926a;
        if (asqVar != null && asqVar2 != null) {
            Map map = asqVar.f2260a;
            Map map2 = asqVar2.f2260a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                View view = asqVar2.f2261b;
                Rect rect = (Rect) asqVar.f2260a.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) asqVar2.f2260a.get("android:changeBounds:bounds");
                int i2 = rect.left;
                int i3 = rect2.left;
                int i4 = rect.top;
                int i5 = rect2.top;
                int i6 = rect.right;
                int i7 = rect2.right;
                int i8 = rect.bottom;
                int i9 = rect2.bottom;
                int i10 = i6 - i2;
                int i11 = i8 - i4;
                int i12 = i7 - i3;
                int i13 = i9 - i5;
                Rect rect3 = (Rect) asqVar.f2260a.get("android:changeBounds:clip");
                Rect rect4 = (Rect) asqVar2.f2260a.get("android:changeBounds:clip");
                if (i10 == 0) {
                    if (i12 != 0) {
                        i = 0;
                    } else if (i13 == 0) {
                        i13 = 0;
                        i = 0;
                    } else {
                        if (i2 == i3 || i4 != i5) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (i6 == i7 || i8 != i9) {
                            i++;
                        }
                    }
                } else if (i11 == 0) {
                    i11 = 0;
                    if (i12 != 0) {
                        i = 0;
                    } else if (i13 == 0) {
                        i13 = 0;
                        i = 0;
                    } else {
                        if (i2 == i3) {
                            i = 1;
                        } else {
                            i = 1;
                        }
                        if (i6 == i7) {
                            i++;
                        } else {
                            i++;
                        }
                    }
                } else {
                    if (i2 == i3) {
                        i = 1;
                    } else {
                        i = 1;
                    }
                    if (i6 == i7) {
                        i++;
                    } else {
                        i++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i++;
                }
                int i14 = i;
                if (i14 <= 0) {
                    return null;
                }
                int i15 = asu.f2264b;
                view.setLeftTopRightBottom(i2, i4, i6, i8);
                if (i14 == 2) {
                    if (i10 == i12 && i11 == i13) {
                        animatorM1926a = asb.m1926a(view, f2207s, ari.m1892d(i2, i4, i3, i5));
                    } else {
                        arr arrVar = new arr(view);
                        ObjectAnimator objectAnimatorM1926a = asb.m1926a(arrVar, f2203o, ari.m1892d(i2, i4, i3, i5));
                        ObjectAnimator objectAnimatorM1926a2 = asb.m1926a(arrVar, f2204p, ari.m1892d(i6, i8, i7, i9));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorM1926a, objectAnimatorM1926a2);
                        animatorSet.addListener(new arp(arrVar));
                        animatorM1926a = animatorSet;
                    }
                } else if (i2 == i3 && i4 == i5) {
                    animatorM1926a = asb.m1926a(view, f2205q, ari.m1892d(i6, i8, i7, i9));
                } else {
                    animatorM1926a = asb.m1926a(view, f2206r, ari.m1892d(i2, i4, i3, i5));
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    asr.m1972b(viewGroup4, true);
                    m1953w(new arq(viewGroup4));
                }
                return animatorM1926a;
            }
            return null;
        }
        return null;
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: b */
    public final void mo1900b(asq asqVar) {
        m1898e(asqVar);
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: c */
    public final void mo1901c(asq asqVar) {
        m1898e(asqVar);
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: d */
    public final String[] mo1902d() {
        return f2202n;
    }
}
