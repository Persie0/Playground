package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o48 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53835a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f53836b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f53837c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f53838d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f53839e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f53840f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f53841g;

    public /* synthetic */ o48(e16 e16Var, boolean z, rh8 rh8Var, boolean z2, ui3 ui3Var, C0282a c0282a) {
        this.f53835a = 2;
        this.f53840f = e16Var;
        this.f53836b = z;
        this.f53839e = rh8Var;
        this.f53837c = z2;
        this.f53838d = ui3Var;
        this.f53841g = c0282a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f53835a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f53841g;
        Object obj4 = this.f53839e;
        Object obj5 = this.f53838d;
        Object obj6 = this.f53840f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                bmc.m3883a((e16) obj6, this.f53836b, this.f53837c, (ui3) obj5, (ui3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                n2d.m17196e(this.f53836b, (String) obj3, this.f53837c, (ui3) obj5, (ui3) obj4, (e16) obj6, (ye1) obj, pk9.m19383z(1));
                break;
            case 2:
                e16 e16Var = (e16) obj6;
                w34 w34Var = (w34) obj4;
                ui3 ui3Var = (ui3) obj5;
                C0282a c0282a = (C0282a) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM4412e = c99.m4412e(pvc.m19496D(e16Var, this.f53836b, null, w34Var, this.f53837c, new uh8(4), ui3Var), 1.0f);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37240f, nj0.f52792K, tj3Var, 54);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    c0282a.invoke(db1.f35347a, tj3Var, 6);
                    tj3Var.m22139q(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((mkd) obj6).m16910a(this.f53836b, this.f53837c, (v56) obj5, (eu9) obj4, (o39) obj3, (ye1) obj, pk9.m19383z(114822145));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ o48(Object obj, boolean z, boolean z2, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f53835a = i2;
        this.f53840f = obj;
        this.f53836b = z;
        this.f53837c = z2;
        this.f53838d = obj2;
        this.f53839e = obj3;
        this.f53841g = obj4;
    }

    public /* synthetic */ o48(boolean z, String str, boolean z2, ui3 ui3Var, ui3 ui3Var2, e16 e16Var, int i) {
        this.f53835a = 1;
        this.f53836b = z;
        this.f53841g = str;
        this.f53837c = z2;
        this.f53838d = ui3Var;
        this.f53839e = ui3Var2;
        this.f53840f = e16Var;
    }
}
