package androidx.compose.runtime;

import p000.AbstractC3517r;
import p000.InterfaceC3510qt;
import p000.cf1;
import p000.h66;
import p000.lda;
import p000.oe1;
import p000.s56;
import p000.v48;
import p000.x66;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.runtime.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0283j implements InterfaceC3510qt {

    /* JADX INFO: renamed from: a */
    public final s56 f3785a = new s56();

    /* JADX INFO: renamed from: b */
    public final h66 f3786b = new h66();

    /* JADX INFO: renamed from: c */
    public final Object f3787c;

    public C0283j(Object obj) {
        this.f3787c = obj;
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: a */
    public final void mo1298a(int i, Object obj) {
        s56 s56Var = this.f3785a;
        s56Var.m21101a(5);
        s56Var.m21101a(i);
        this.f3786b.m13090g(obj);
    }

    /* JADX INFO: renamed from: b */
    public final void m1299b(AbstractC3517r abstractC3517r, v48 v48Var) {
        Exception exc;
        int i;
        s56 s56Var = this.f3785a;
        int i2 = s56Var.f60382b;
        h66 h66Var = new h66();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            h66 h66Var2 = this.f3786b;
            if (i3 >= i2) {
                if (i4 != h66Var2.f1294b) {
                    cf1.m4605a("Applier operation size mismatch");
                }
                h66Var2.m13093j();
                s56Var.f60382b = 0;
                abstractC3517r.mo4607m();
                return;
            }
            int i5 = i3 + 1;
            try {
                try {
                    switch (s56Var.m21103c(i3)) {
                        case 0:
                            abstractC3517r.mo1305k();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            abstractC3517r.mo1300c(h66Var2.m717b(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            abstractC3517r.mo1304h(s56Var.m21103c(i5), s56Var.m21103c(i7));
                            break;
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    abstractC3517r.mo1302f(s56Var.m21103c(i5), s56Var.m21103c(i8), s56Var.m21103c(i9));
                                } catch (Exception e) {
                                    exc = e;
                                    i3 = i9;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i8;
                            }
                            break;
                        case 4:
                            abstractC3517r.m20226b();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            abstractC3517r.mo1298a(s56Var.m21103c(i5), h66Var2.m717b(i4));
                            i4 = i;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                abstractC3517r.mo1306l(s56Var.m21103c(i5), h66Var2.m717b(i4));
                                i4 = i;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i10 = i4 + 1;
                            Object objM717b = h66Var2.m717b(i4);
                            objM717b.getClass();
                            lda.m16119e(2, objM717b);
                            i4 += 2;
                            abstractC3517r.mo1303g(h66Var2.m717b(i10), (zi3) objM717b);
                            i3 = i5;
                            break;
                        case 8:
                            Object obj = abstractC3517r.f58433b;
                            if (obj instanceof oe1) {
                                oe1 oe1Var = (oe1) obj;
                                if (((x66) v48Var.f64849f).m24313k(oe1Var)) {
                                    oe1Var.mo1497b();
                                }
                            }
                            h66Var.m13090g(obj);
                            abstractC3517r.mo1301e();
                            i3 = i5;
                            break;
                        default:
                            i3 = i5;
                            break;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i3 = i5;
                }
            } catch (Throwable th) {
                abstractC3517r.mo4607m();
                throw th;
            }
            exc = e3;
            throw new ComposePausableCompositionException(h66Var2, h66Var, s56Var, i3 - 1, exc);
        }
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: c */
    public final void mo1300c(Object obj) {
        this.f3785a.m21101a(1);
        this.f3786b.m13090g(obj);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: e */
    public final void mo1301e() {
        this.f3785a.m21101a(8);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: f */
    public final void mo1302f(int i, int i2, int i3) {
        s56 s56Var = this.f3785a;
        s56Var.m21101a(3);
        s56Var.m21101a(i);
        s56Var.m21101a(i2);
        s56Var.m21101a(i3);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: g */
    public final void mo1303g(Object obj, zi3 zi3Var) {
        this.f3785a.m21101a(7);
        h66 h66Var = this.f3786b;
        h66Var.m13090g(zi3Var);
        h66Var.m13090g(obj);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: h */
    public final void mo1304h(int i, int i2) {
        s56 s56Var = this.f3785a;
        s56Var.m21101a(2);
        s56Var.m21101a(i);
        s56Var.m21101a(i2);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: k */
    public final void mo1305k() {
        this.f3785a.m21101a(0);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: l */
    public final void mo1306l(int i, Object obj) {
        s56 s56Var = this.f3785a;
        s56Var.m21101a(6);
        s56Var.m21101a(i);
        this.f3786b.m13090g(obj);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: n */
    public final Object mo1307n() {
        return this.f3787c;
    }
}
