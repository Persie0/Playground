package p000;

import androidx.compose.runtime.internal.C0282a;
import coil.compose.C0858a;

/* JADX INFO: renamed from: iw */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3125iw implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44690a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f44691b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f44692c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f44693d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f44694e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f44695f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f44696g;

    public /* synthetic */ C3125iw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.f44690a = i2;
        this.f44692c = obj;
        this.f44693d = obj2;
        this.f44694e = obj3;
        this.f44695f = obj4;
        this.f44696g = obj5;
        this.f44691b = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f44690a;
        Object obj3 = this.f44695f;
        Object obj4 = this.f44694e;
        Object obj5 = this.f44696g;
        Object obj6 = this.f44693d;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f44691b;
        Object obj7 = this.f44692c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC3695vr.m23492b((e16) obj7, (C0858a) obj6, (String) obj4, (InterfaceC3571se) obj3, (jl1) obj5, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2) | 1;
                ((C0282a) obj7).m1295m(this.f44693d, this.f44694e, this.f44695f, this.f44696g, (ye1) obj, iM19383z);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ps5.m19471b((pa1) obj7, (q36) obj6, (v49) obj4, (zda) obj3, (C0282a) obj5, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                kaa.m15039a((faa) obj7, (baa) obj6, this.f44694e, this.f44695f, (l43) obj5, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }
}
