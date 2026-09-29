package p000;

import com.lingq.feature.playlist.AbstractC2253c;
import com.lingq.feature.reader.rating.p016ui.AbstractC2474a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class be7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8430a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f8431b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xi3 f8432c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8433d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f8434e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f8435f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ xi3 f8436g;

    public /* synthetic */ be7(e16 e16Var, ud7 ud7Var, boolean z, vi3 vi3Var, zi3 zi3Var, int i) {
        this.f8434e = e16Var;
        this.f8435f = ud7Var;
        this.f8431b = z;
        this.f8432c = vi3Var;
        this.f8436g = zi3Var;
        this.f8433d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8430a;
        int i2 = this.f8433d;
        xfa xfaVar = xfa.f68157a;
        xi3 xi3Var = this.f8436g;
        xi3 xi3Var2 = this.f8432c;
        Object obj3 = this.f8435f;
        Object obj4 = this.f8434e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                AbstractC2253c.m9225k((e16) obj4, (ud7) obj3, this.f8431b, (vi3) xi3Var2, (zi3) xi3Var, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                AbstractC2474a.m9383b(this.f8431b, (vi3) xi3Var2, (vi3) obj4, (ui3) obj3, (vi3) xi3Var, (ye1) obj, iM19383z2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(1);
                p9d.m18996b((e16) obj4, (String) obj3, this.f8431b, (ui3) xi3Var2, (ui3) xi3Var, (ye1) obj, iM19383z3, this.f8433d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z4 = pk9.m19383z(i2 | 1);
                fbd.m11755e((sxa) obj4, this.f8431b, (ui3) obj3, (vi3) xi3Var2, (vi3) xi3Var, (ye1) obj, iM19383z4);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ be7(e16 e16Var, String str, boolean z, ui3 ui3Var, ui3 ui3Var2, int i, int i2) {
        this.f8434e = e16Var;
        this.f8435f = str;
        this.f8431b = z;
        this.f8432c = ui3Var;
        this.f8436g = ui3Var2;
        this.f8433d = i2;
    }

    public /* synthetic */ be7(sxa sxaVar, boolean z, ui3 ui3Var, vi3 vi3Var, vi3 vi3Var2, int i) {
        this.f8434e = sxaVar;
        this.f8431b = z;
        this.f8435f = ui3Var;
        this.f8432c = vi3Var;
        this.f8436g = vi3Var2;
        this.f8433d = i;
    }

    public /* synthetic */ be7(boolean z, vi3 vi3Var, vi3 vi3Var2, ui3 ui3Var, vi3 vi3Var3, int i) {
        this.f8431b = z;
        this.f8432c = vi3Var;
        this.f8434e = vi3Var2;
        this.f8435f = ui3Var;
        this.f8436g = vi3Var3;
        this.f8433d = i;
    }
}
