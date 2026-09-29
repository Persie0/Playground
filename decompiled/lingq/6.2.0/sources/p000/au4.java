package p000;

import com.lingq.feature.onboarding.auth.login.C2177b;
import com.lingq.feature.onboarding.p014v2.AbstractC2215c;
import com.lingq.feature.onboarding.p014v2.C2216d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class au4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7512a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f7514c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f7515d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f7516e;

    public /* synthetic */ au4(ui3 ui3Var, e16 e16Var, lu4 lu4Var, bu4 bu4Var, int i) {
        this.f7514c = ui3Var;
        this.f7513b = e16Var;
        this.f7515d = lu4Var;
        this.f7516e = bu4Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7512a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f7516e;
        Object obj4 = this.f7515d;
        Object obj5 = this.f7513b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lda.m16115a(this.f7514c, (e16) obj5, (lu4) obj4, (bu4) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC3584sr.m21616b((f95) obj4, (e16) obj5, this.f7514c, (n4b) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC3423or.m18248d((C2177b) obj5, this.f7514c, (ui3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC2215c.m9159c((C2216d) obj5, (String) obj4, this.f7514c, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                h68 h68Var = (h68) obj5;
                ui3 ui3Var = (ui3) obj4;
                ui3 ui3Var2 = (ui3) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    r46.m20381f(AbstractC3584sr.m21607T(c99.m4412e(b16.f7762a, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a), null, te1.m22000n(62, 5.0f), null, ci8.m4703P(-1462304357, new C3357n2((Object) h68Var, (Object) this.f7514c, (Object) ui3Var, (Object) ui3Var2, 14), tj3Var), tj3Var, 24576, 10);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ au4(f95 f95Var, e16 e16Var, ui3 ui3Var, n4b n4bVar, int i) {
        this.f7515d = f95Var;
        this.f7513b = e16Var;
        this.f7514c = ui3Var;
        this.f7516e = n4bVar;
    }

    public /* synthetic */ au4(h68 h68Var, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3) {
        this.f7513b = h68Var;
        this.f7514c = ui3Var;
        this.f7515d = ui3Var2;
        this.f7516e = ui3Var3;
    }

    public /* synthetic */ au4(C2177b c2177b, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, int i) {
        this.f7513b = c2177b;
        this.f7514c = ui3Var;
        this.f7515d = ui3Var2;
        this.f7516e = vi3Var;
    }

    public /* synthetic */ au4(C2216d c2216d, String str, ui3 ui3Var, vi3 vi3Var, int i) {
        this.f7513b = c2216d;
        this.f7515d = str;
        this.f7514c = ui3Var;
        this.f7516e = vi3Var;
    }
}
