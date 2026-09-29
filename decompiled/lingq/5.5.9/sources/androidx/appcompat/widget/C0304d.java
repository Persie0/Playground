package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p058d.C4999a;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.appcompat.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0304d {

    /* JADX INFO: renamed from: a */
    public final View f1142a;

    /* JADX INFO: renamed from: d */
    public C0355z0 f1145d;

    /* JADX INFO: renamed from: e */
    public C0355z0 f1146e;

    /* JADX INFO: renamed from: f */
    public C0355z0 f1147f;

    /* JADX INFO: renamed from: c */
    public int f1144c = -1;

    /* JADX INFO: renamed from: b */
    public final C0319i f1143b = C0319i.m1201a();

    public C0304d(View view) {
        this.f1142a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m1125a() {
        View view = this.f1142a;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z10 = false;
            if (this.f1145d != null) {
                if (this.f1147f == null) {
                    this.f1147f = new C0355z0();
                }
                C0355z0 c0355z0 = this.f1147f;
                c0355z0.f1407a = null;
                c0355z0.f1410d = false;
                c0355z0.f1408b = null;
                c0355z0.f1409c = false;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                ColorStateList colorStateListM18713g = C10029b0.i.m18713g(view);
                if (colorStateListM18713g != null) {
                    c0355z0.f1410d = true;
                    c0355z0.f1407a = colorStateListM18713g;
                }
                PorterDuff.Mode modeM18714h = C10029b0.i.m18714h(view);
                if (modeM18714h != null) {
                    c0355z0.f1409c = true;
                    c0355z0.f1408b = modeM18714h;
                }
                if (c0355z0.f1410d || c0355z0.f1409c) {
                    C0319i.m1204e(background, c0355z0, view.getDrawableState());
                    z10 = true;
                }
                if (z10) {
                    return;
                }
            }
            C0355z0 c0355z1 = this.f1146e;
            if (c0355z1 != null) {
                C0319i.m1204e(background, c0355z1, view.getDrawableState());
            } else {
                C0355z0 c0355z2 = this.f1145d;
                if (c0355z2 != null) {
                    C0319i.m1204e(background, c0355z2, view.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m1126b() {
        C0355z0 c0355z0 = this.f1146e;
        if (c0355z0 != null) {
            return c0355z0.f1407a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m1127c() {
        C0355z0 c0355z0 = this.f1146e;
        if (c0355z0 != null) {
            return c0355z0.f1408b;
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m1128d(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListM1263h;
        View view = this.f1142a;
        Context context = view.getContext();
        int[] iArr = C4999a.f32585A;
        C0300b1 c0300b1M1111m = C0300b1.m1111m(context, attributeSet, iArr, i10);
        View view2 = this.f1142a;
        C10029b0.m18657m(view2, view2.getContext(), iArr, attributeSet, c0300b1M1111m.f1134b, i10);
        try {
            if (c0300b1M1111m.m1123l(0)) {
                this.f1144c = c0300b1M1111m.m1120i(0, -1);
                C0319i c0319i = this.f1143b;
                Context context2 = view.getContext();
                int i11 = this.f1144c;
                synchronized (c0319i) {
                    try {
                        colorStateListM1263h = c0319i.f1219a.m1263h(i11, context2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (colorStateListM1263h != null) {
                    m1131g(colorStateListM1263h);
                }
            }
            if (c0300b1M1111m.m1123l(1)) {
                C10029b0.i.m18723q(view, c0300b1M1111m.m1113b(1));
            }
            if (c0300b1M1111m.m1123l(2)) {
                C10029b0.i.m18724r(view, C0311f0.m1188c(c0300b1M1111m.m1119h(2, -1), null));
            }
            c0300b1M1111m.m1124n();
        } catch (Throwable th3) {
            c0300b1M1111m.m1124n();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1129e() {
        this.f1144c = -1;
        m1131g(null);
        m1125a();
    }

    /* JADX INFO: renamed from: f */
    public final void m1130f(int i10) {
        ColorStateList colorStateListM1263h;
        this.f1144c = i10;
        C0319i c0319i = this.f1143b;
        if (c0319i != null) {
            Context context = this.f1142a.getContext();
            synchronized (c0319i) {
                colorStateListM1263h = c0319i.f1219a.m1263h(i10, context);
            }
        } else {
            colorStateListM1263h = null;
        }
        m1131g(colorStateListM1263h);
        m1125a();
    }

    /* JADX INFO: renamed from: g */
    public final void m1131g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1145d == null) {
                this.f1145d = new C0355z0();
            }
            C0355z0 c0355z0 = this.f1145d;
            c0355z0.f1407a = colorStateList;
            c0355z0.f1410d = true;
        } else {
            this.f1145d = null;
        }
        m1125a();
    }

    /* JADX INFO: renamed from: h */
    public final void m1132h(ColorStateList colorStateList) {
        if (this.f1146e == null) {
            this.f1146e = new C0355z0();
        }
        C0355z0 c0355z0 = this.f1146e;
        c0355z0.f1407a = colorStateList;
        c0355z0.f1410d = true;
        m1125a();
    }

    /* JADX INFO: renamed from: i */
    public final void m1133i(PorterDuff.Mode mode) {
        if (this.f1146e == null) {
            this.f1146e = new C0355z0();
        }
        C0355z0 c0355z0 = this.f1146e;
        c0355z0.f1408b = mode;
        c0355z0.f1409c = true;
        m1125a();
    }
}
