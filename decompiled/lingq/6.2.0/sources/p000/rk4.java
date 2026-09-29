package p000;

import com.lingq.core.premium.AbstractC1839a;
import com.lingq.feature.onboarding.p014v2.pages.AbstractC2228a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rk4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59428a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f59429b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f59430c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f59431d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f59432e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f59433f;

    public /* synthetic */ rk4(int i, int i2, int i3, ui3 ui3Var, e16 e16Var, int i4) {
        this.f59429b = i;
        this.f59430c = i2;
        this.f59431d = i3;
        this.f59433f = ui3Var;
        this.f59432e = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f59428a;
        int i2 = this.f59430c;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f59433f;
        Object obj4 = this.f59432e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                phd.m19147a((e16) obj4, (a85) obj3, this.f59429b, (ye1) obj, iM19383z, this.f59431d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(1);
                pjd.m19358a(this.f59429b, this.f59430c, this.f59431d, (ui3) obj3, (e16) obj4, (ye1) obj, iM19383z2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(1);
                AbstractC2228a.m9186f(this.f59429b, this.f59430c, (e16) obj4, (String) obj3, (ye1) obj, iM19383z3, this.f59431d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z4 = pk9.m19383z(i2 | 1);
                AbstractC1839a.m8523a(this.f59429b, (String) obj4, (vi3) obj3, (ye1) obj, iM19383z4, this.f59431d);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ rk4(int i, int i2, e16 e16Var, String str, int i3, int i4) {
        this.f59429b = i;
        this.f59430c = i2;
        this.f59432e = e16Var;
        this.f59433f = str;
        this.f59431d = i4;
    }

    public /* synthetic */ rk4(int i, String str, vi3 vi3Var, int i2, int i3) {
        this.f59429b = i;
        this.f59432e = str;
        this.f59433f = vi3Var;
        this.f59430c = i2;
        this.f59431d = i3;
    }

    public /* synthetic */ rk4(e16 e16Var, a85 a85Var, int i, int i2, int i3) {
        this.f59432e = e16Var;
        this.f59433f = a85Var;
        this.f59429b = i;
        this.f59430c = i2;
        this.f59431d = i3;
    }
}
