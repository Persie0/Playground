package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;

/* JADX INFO: renamed from: qh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3498qh implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57772a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f57773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f57774c;

    public /* synthetic */ C3498qh(long j, e16 e16Var) {
        this.f57773b = j;
        this.f57774c = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f57772a;
        xfa xfaVar = xfa.f68157a;
        long j = this.f57773b;
        Object obj3 = this.f57774c;
        switch (i) {
            case 0:
                e16 e16Var = (e16) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else if (j == 9205357640488583168L) {
                    tj3Var.m22111b0(-1243644858);
                    AbstractC3685vh.m23282b(0, 0, tj3Var, e16Var);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-1244013944);
                    e16 e16VarM4420m = c99.m4420m(e16Var, bk2.m3806b(j), bk2.m3805a(j), 0.0f, 0.0f, 12);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52809d, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4420m);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    AbstractC3685vh.m23282b(0, 1, tj3Var, null);
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                lp7.m16423a((k73) obj3, j, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3498qh(k73 k73Var, long j, int i) {
        this.f57774c = k73Var;
        this.f57773b = j;
    }
}
