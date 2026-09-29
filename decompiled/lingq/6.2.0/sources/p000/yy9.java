package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yy9 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f70654b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f70655c;

    public /* synthetic */ yy9(int i, boolean z) {
        this.f70653a = 2;
        this.f70655c = z;
        this.f70654b = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        int i = this.f70653a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f70654b;
        boolean z = this.f70655c;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    String strM23620a0 = vz1.m23620a0(tj3Var, i2);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38955d, ((fe9) tj3Var.m22128k(zf1Var)).f38956e);
                    vh9 vh9Var = ps5.f56764b;
                    vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71408l;
                    if (z) {
                        tj3Var.m22111b0(1910417819);
                        j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55848d;
                    } else {
                        tj3Var.m22111b0(1910419410);
                        j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q;
                    }
                    tj3Var.m22139q(false);
                    lw9.m16554b(strM23620a0, e16VarM21608U, j, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 130040);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    String strM23620a1 = vz1.m23620a0(tj3Var2, i2);
                    zf1 zf1Var2 = ge9.f40637a;
                    e16 e16VarM21608U2 = AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var2.m22128k(zf1Var2)).f38955d, ((fe9) tj3Var2.m22128k(zf1Var2)).f38956e);
                    vh9 vh9Var2 = ps5.f56764b;
                    vx9 vx9Var2 = ((ms5) tj3Var2.m22128k(vh9Var2)).f51800b.f71408l;
                    if (z) {
                        tj3Var2.m22111b0(-2040010781);
                        j2 = ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55848d;
                    } else {
                        tj3Var2.m22111b0(-2040009190);
                        j2 = ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55873q;
                    }
                    tj3Var2.m22139q(false);
                    lw9.m16554b(strM23620a1, e16VarM21608U2, j2, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var2, tj3Var2, 0, 0, 130040);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                q9d.m19834f(z, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ yy9(int i, int i2, boolean z) {
        this.f70653a = i2;
        this.f70654b = i;
        this.f70655c = z;
    }
}
