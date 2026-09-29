package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.glance.layout.AbstractC0686a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ph0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56205a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f56206b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f56207c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f56208d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f56209e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xi3 f56210f;

    public /* synthetic */ ph0(on3 on3Var, C3532re c3532re, zi3 zi3Var, int i, int i2) {
        this.f56208d = on3Var;
        this.f56209e = c3532re;
        this.f56210f = zi3Var;
        this.f56206b = i;
        this.f56207c = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f56205a;
        Object obj3 = this.f56208d;
        xfa xfaVar = xfa.f68157a;
        xi3 xi3Var = this.f56210f;
        Object obj4 = this.f56209e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0686a.m2485a((on3) obj3, (C3532re) obj4, (zi3) xi3Var, (ye1) obj, pk9.m19383z(this.f56206b | 1), this.f56207c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(this.f56207c | 1);
                bna.m3938a(this.f56208d, this.f56206b, (iu4) obj4, (C0282a) xi3Var, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(7);
                AbstractC3352my.m17116e((e16) obj3, this.f56206b, this.f56207c, (ui3) obj4, (ui3) xi3Var, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ph0(e16 e16Var, int i, int i2, ui3 ui3Var, ui3 ui3Var2, int i3) {
        this.f56208d = e16Var;
        this.f56206b = i;
        this.f56207c = i2;
        this.f56209e = ui3Var;
        this.f56210f = ui3Var2;
    }

    public /* synthetic */ ph0(Object obj, int i, iu4 iu4Var, C0282a c0282a, int i2) {
        this.f56208d = obj;
        this.f56206b = i;
        this.f56209e = iu4Var;
        this.f56210f = c0282a;
        this.f56207c = i2;
    }
}
