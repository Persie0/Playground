package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z08 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70728a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f70729b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f70730c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f70731d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f70732e;

    public /* synthetic */ z08(on3 on3Var, ek9 ek9Var, float f, int i) {
        this.f70731d = on3Var;
        this.f70732e = ek9Var;
        this.f70729b = f;
        this.f70730c = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f70728a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f70732e;
        Object obj4 = this.f70731d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                blc.m3872a((e16) obj4, this.f70730c, (List) obj3, this.f70729b, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(this.f70730c | 1);
                dk9.m10443b((on3) obj4, (ek9) obj3, this.f70729b, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ z08(e16 e16Var, int i, List list, float f, int i2) {
        this.f70731d = e16Var;
        this.f70730c = i;
        this.f70732e = list;
        this.f70729b = f;
    }
}
