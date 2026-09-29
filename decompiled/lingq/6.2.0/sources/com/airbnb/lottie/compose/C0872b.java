package com.airbnb.lottie.compose;

import androidx.compose.foundation.C0145m;
import androidx.compose.runtime.AbstractC0278f;
import p000.dh9;
import p000.gc2;
import p000.gl5;
import p000.ho2;
import p000.l70;
import p000.t66;
import p000.ui3;
import p000.xc9;

/* JADX INFO: renamed from: com.airbnb.lottie.compose.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0872b implements dh9 {

    /* JADX INFO: renamed from: H */
    public final gc2 f10714H;

    /* JADX INFO: renamed from: I */
    public final C0145m f10715I;

    /* JADX INFO: renamed from: a */
    public final t66 f10716a;

    /* JADX INFO: renamed from: b */
    public final t66 f10717b;

    /* JADX INFO: renamed from: c */
    public final t66 f10718c;

    /* JADX INFO: renamed from: d */
    public final t66 f10719d;

    /* JADX INFO: renamed from: e */
    public final t66 f10720e;

    /* JADX INFO: renamed from: f */
    public final t66 f10721f;

    /* JADX INFO: renamed from: g */
    public final t66 f10722g;

    /* JADX INFO: renamed from: h */
    public final gc2 f10723h;

    /* JADX INFO: renamed from: i */
    public final t66 f10724i;

    /* JADX INFO: renamed from: j */
    public final t66 f10725j;

    /* JADX INFO: renamed from: k */
    public final t66 f10726k;

    /* JADX INFO: renamed from: l */
    public final t66 f10727l;

    public C0872b() {
        Boolean bool = Boolean.FALSE;
        this.f10716a = AbstractC0278f.m1260j(bool);
        this.f10717b = AbstractC0278f.m1260j(1);
        this.f10718c = AbstractC0278f.m1260j(1);
        this.f10719d = AbstractC0278f.m1260j(bool);
        this.f10720e = AbstractC0278f.m1260j(null);
        this.f10721f = AbstractC0278f.m1260j(Float.valueOf(1.0f));
        this.f10722g = AbstractC0278f.m1260j(bool);
        this.f10723h = AbstractC0278f.m1254d(new ui3() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$frameSpeed$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0872b c0872b = this.f10666b;
                t66 t66Var = c0872b.f10721f;
                return Float.valueOf((((Boolean) ((xc9) c0872b.f10719d).getValue()).booleanValue() && c0872b.m5029f() % 2 == 0) ? -((Number) ((xc9) t66Var).getValue()).floatValue() : ((Number) ((xc9) t66Var).getValue()).floatValue());
            }
        });
        this.f10724i = AbstractC0278f.m1260j(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.f10725j = AbstractC0278f.m1260j(fValueOf);
        this.f10726k = AbstractC0278f.m1260j(fValueOf);
        this.f10727l = AbstractC0278f.m1260j(Long.MIN_VALUE);
        this.f10714H = AbstractC0278f.m1254d(new ui3() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$endProgress$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0872b c0872b = this.f10665b;
                float f = 0.0f;
                if (((gl5) ((xc9) c0872b.f10724i).getValue()) != null) {
                    float fFloatValue = ((Number) ((xc9) c0872b.f10721f).getValue()).floatValue();
                    t66 t66Var = c0872b.f10720e;
                    if (fFloatValue < 0.0f) {
                        if (((xc9) t66Var).getValue() != null) {
                            ho2.m13383c();
                            return null;
                        }
                    } else {
                        if (((xc9) t66Var).getValue() != null) {
                            ho2.m13383c();
                            return null;
                        }
                        f = 1.0f;
                    }
                }
                return Float.valueOf(f);
            }
        });
        AbstractC0278f.m1254d(new ui3() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$isAtEnd$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0872b c0872b = this.f10667b;
                return Boolean.valueOf(c0872b.m5029f() == ((Number) ((xc9) c0872b.f10718c).getValue()).intValue() && ((Number) ((xc9) c0872b.f10726k).getValue()).floatValue() == c0872b.m5028e());
            }
        });
        this.f10715I = new C0145m();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m5026c(C0872b c0872b, int i, long j) {
        t66 t66Var = c0872b.f10724i;
        t66 t66Var2 = c0872b.f10725j;
        t66 t66Var3 = c0872b.f10720e;
        gc2 gc2Var = c0872b.f10723h;
        t66 t66Var4 = c0872b.f10727l;
        gl5 gl5Var = (gl5) ((xc9) t66Var).getValue();
        if (gl5Var == null) {
            return true;
        }
        long jLongValue = ((Number) ((xc9) t66Var4).getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) ((xc9) t66Var4).getValue()).longValue();
        ((xc9) t66Var4).setValue(Long.valueOf(j));
        if (((xc9) t66Var3).getValue() != null) {
            ho2.m13383c();
            return false;
        }
        if (((xc9) t66Var3).getValue() != null) {
            ho2.m13383c();
            return false;
        }
        float fFloatValue = ((Number) gc2Var.getValue()).floatValue() * ((jLongValue / 1000000) / gl5Var.m12729c());
        float fFloatValue2 = ((Number) gc2Var.getValue()).floatValue() < 0.0f ? 0.0f - (((Number) ((xc9) t66Var2).getValue()).floatValue() + fFloatValue) : (((Number) ((xc9) t66Var2).getValue()).floatValue() + fFloatValue) - 1.0f;
        if (fFloatValue2 < 0.0f) {
            c0872b.m5031h(l70.m15944g(((Number) ((xc9) t66Var2).getValue()).floatValue(), 0.0f, 1.0f) + fFloatValue);
            return true;
        }
        int i2 = (int) (fFloatValue2 / 1.0f);
        int i3 = i2 + 1;
        if (c0872b.m5029f() + i3 > i) {
            c0872b.m5031h(c0872b.m5028e());
            c0872b.m5030g(i);
            return false;
        }
        c0872b.m5030g(c0872b.m5029f() + i3);
        float f = fFloatValue2 - (i2 * 1.0f);
        c0872b.m5031h(((Number) gc2Var.getValue()).floatValue() < 0.0f ? 1.0f - f : 0.0f + f);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static final void m5027d(C0872b c0872b, boolean z) {
        ((xc9) c0872b.f10716a).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: e */
    public final float m5028e() {
        return ((Number) this.f10714H.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: f */
    public final int m5029f() {
        return ((Number) ((xc9) this.f10717b).getValue()).intValue();
    }

    /* JADX INFO: renamed from: g */
    public final void m5030g(int i) {
        ((xc9) this.f10717b).setValue(Integer.valueOf(i));
    }

    @Override // p000.dh9
    public final Object getValue() {
        return Float.valueOf(((Number) ((xc9) this.f10726k).getValue()).floatValue());
    }

    /* JADX INFO: renamed from: h */
    public final void m5031h(float f) {
        gl5 gl5Var;
        ((xc9) this.f10725j).setValue(Float.valueOf(f));
        if (((Boolean) ((xc9) this.f10722g).getValue()).booleanValue() && (gl5Var = (gl5) ((xc9) this.f10724i).getValue()) != null) {
            f -= f % (1.0f / gl5Var.m12731e());
        }
        ((xc9) this.f10726k).setValue(Float.valueOf(f));
    }
}
