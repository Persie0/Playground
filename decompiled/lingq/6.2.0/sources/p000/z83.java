package p000;

import androidx.compose.material3.C0233h;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z83 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71064a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f71065b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f71066c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f71067d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f71068e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f71069f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f71070g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ aj3 f71071h;

    public /* synthetic */ z83(e16 e16Var, InterfaceC3624tu interfaceC3624tu, InterfaceC3735wu interfaceC3735wu, int i, f93 f93Var, C0282a c0282a, int i2) {
        this.f71065b = e16Var;
        this.f71068e = interfaceC3624tu;
        this.f71069f = interfaceC3735wu;
        this.f71066c = i;
        this.f71070g = f93Var;
        this.f71071h = c0282a;
        this.f71067d = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f71064a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f71070g;
        Object obj4 = this.f71069f;
        Object obj5 = this.f71068e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(this.f71067d | 1);
                AbstractC3423or.m18242a(this.f71065b, (InterfaceC3624tu) obj5, (InterfaceC3735wu) obj4, this.f71066c, (f93) obj3, (C0282a) this.f71071h, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(this.f71066c | 1);
                r46.m20381f(this.f71065b, (o39) obj5, (C0233h) obj4, (mn0) obj3, this.f71071h, (ye1) obj, iM19383z2, this.f71067d);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ z83(e16 e16Var, o39 o39Var, C0233h c0233h, mn0 mn0Var, aj3 aj3Var, int i, int i2) {
        this.f71065b = e16Var;
        this.f71068e = o39Var;
        this.f71069f = c0233h;
        this.f71070g = mn0Var;
        this.f71071h = aj3Var;
        this.f71066c = i;
        this.f71067d = i2;
    }
}
