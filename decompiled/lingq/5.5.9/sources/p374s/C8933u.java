package p374s;

import ae.C0062b;
import androidx.compose.animation.core.VectorConvertersKt;
import dm.C5207g;

/* JADX INFO: renamed from: s.u */
/* JADX INFO: loaded from: classes.dex */
public final class C8933u implements InterfaceC8931s {

    /* JADX INFO: renamed from: a */
    public final int f46855a;

    /* JADX INFO: renamed from: b */
    public final int f46856b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8925p f46857c;

    public C8933u(int i10, int i11, InterfaceC8925p interfaceC8925p) {
        C5207g.m11111f(interfaceC8925p, "easing");
        this.f46855a = i10;
        this.f46856b = i11;
        this.f46857c = interfaceC8925p;
    }

    @Override // p374s.InterfaceC8931s
    /* JADX INFO: renamed from: b */
    public final float mo1385b(long j10, float f3, float f10, float f11) {
        long jM365l0 = C0062b.m365l0((j10 / 1000000) - ((long) this.f46856b), 0L, this.f46855a);
        if (jM365l0 < 0) {
            return 0.0f;
        }
        if (jM365l0 == 0) {
            return f11;
        }
        return (mo1388e(jM365l0 * 1000000, f3, f10, f11) - mo1388e((jM365l0 - 1) * 1000000, f3, f10, f11)) * 1000.0f;
    }

    @Override // p374s.InterfaceC8931s
    /* JADX INFO: renamed from: c */
    public final long mo1386c(float f3, float f10, float f11) {
        return ((long) (this.f46856b + this.f46855a)) * 1000000;
    }

    @Override // p374s.InterfaceC8931s
    /* JADX INFO: renamed from: e */
    public final float mo1388e(long j10, float f3, float f10, float f11) {
        long j11 = (j10 / 1000000) - ((long) this.f46856b);
        int i10 = this.f46855a;
        float fMo17150a = this.f46857c.mo17150a(C0062b.m357j0(i10 == 0 ? 1.0f : C0062b.m365l0(j11, 0L, i10) / i10, 0.0f, 1.0f));
        C8908g0 c8908g0 = VectorConvertersKt.f1626a;
        return (f10 * fMo17150a) + ((1 - fMo17150a) * f3);
    }
}
