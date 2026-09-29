package p107f2;

import p038c2.C1668k;
import p038c2.C1671n;
import p038c2.InterfaceC1670m;
import p128g2.AbstractInterpolatorC5678p;

/* JADX INFO: renamed from: f2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5463b extends AbstractInterpolatorC5678p {

    /* JADX INFO: renamed from: a */
    public final C1671n f34032a;

    /* JADX INFO: renamed from: b */
    public C1668k f34033b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1670m f34034c;

    public C5463b() {
        C1671n c1671n = new C1671n();
        this.f34032a = c1671n;
        this.f34034c = c1671n;
    }

    @Override // p128g2.AbstractInterpolatorC5678p
    /* JADX INFO: renamed from: a */
    public final float mo2810a() {
        return this.f34034c.mo5399a();
    }

    /* JADX INFO: renamed from: b */
    public final void m11703b(float f3, float f10, float f11, float f12, float f13, float f14) {
        C1671n c1671n = this.f34032a;
        this.f34034c = c1671n;
        c1671n.f9368l = f3;
        boolean z10 = f3 > f10;
        c1671n.f9367k = z10;
        if (z10) {
            c1671n.m5402c(-f11, f3 - f10, f13, f14, f12);
        } else {
            c1671n.m5402c(f11, f10 - f3, f13, f14, f12);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        return this.f34034c.getInterpolation(f3);
    }
}
