package p000;

import android.view.View;
import androidx.compose.foundation.C0124k;
import androidx.compose.p002ui.semantics.C0427g;

/* JADX INFO: loaded from: classes.dex */
public final class oo5 extends i16 {

    /* JADX INFO: renamed from: b */
    public final sy0 f54651b;

    /* JADX INFO: renamed from: c */
    public final no1 f54652c;

    /* JADX INFO: renamed from: d */
    public final gz8 f54653d;

    public oo5(sy0 sy0Var, no1 no1Var, gz8 gz8Var) {
        this.f54651b = sy0Var;
        this.f54652c = no1Var;
        this.f54653d = gz8Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0124k(this.f54651b, this.f54652c, this.f54653d);
    }

    public final int hashCode() {
        return this.f54653d.hashCode() + ((this.f54652c.hashCode() + g9a.m12428e(wq1.m24105a(wq1.m24105a(ux5.m22981d(9205357640488583168L, g9a.m12428e(wq1.m24105a(this.f54651b.hashCode() * 961, Float.NaN, 31), 31, true), 31), Float.NaN, 31), Float.NaN, 31), 31, true)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "magnifier";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f54651b, "sourceCenter");
        z91Var.m25511b(null, "magnifierCenter");
        z91Var.m25511b(Float.valueOf(Float.NaN), "zoom");
        z91Var.m25511b(new bk2(9205357640488583168L), "size");
        z91Var.m25511b(new xj2(Float.NaN), "cornerRadius");
        z91Var.m25511b(new xj2(Float.NaN), "elevation");
        z91Var.m25511b(Boolean.TRUE, "clippingEnabled");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0124k c0124k = (C0124k) d16Var;
        c0124k.getClass();
        gz8 gz8Var = c0124k.f2400L;
        View view = c0124k.f2401M;
        fb2 fb2Var = c0124k.f2402N;
        c0124k.f2398J = this.f54651b;
        c0124k.f2399K = this.f54652c;
        gz8 gz8Var2 = this.f54653d;
        c0124k.f2400L = gz8Var2;
        View viewM4067t0 = bq1.m4067t0(c0124k);
        fb2 fb2Var2 = te1.m21979L(c0124k).f4327T;
        if (c0124k.f2403O != null) {
            C0427g c0427g = qo5.f58016a;
            if (Float.isNaN(Float.NaN)) {
                Float.isNaN(Float.NaN);
            }
            if (!xj2.m24560b(Float.NaN, Float.NaN) || !xj2.m24560b(Float.NaN, Float.NaN) || !gz8Var2.equals(gz8Var) || !viewM4067t0.equals(view) || !fa4.m11650l(fb2Var2, fb2Var)) {
                c0124k.m962a1();
            }
        }
        c0124k.m963b1();
    }
}
