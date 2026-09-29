package p000;

import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.token.AbstractC1899b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e81 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36831a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f36832b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f36833c;

    public /* synthetic */ e81(int i, boolean z, boolean z2) {
        this.f36832b = z;
        this.f36833c = z2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        long jM4212e;
        int i = this.f36831a;
        xfa xfaVar = xfa.f68157a;
        boolean z = this.f36833c;
        boolean z2 = this.f36832b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else if (!z2) {
                    tj3Var.m22111b0(445277633);
                    y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_download, tj3Var, 0);
                    if (z) {
                        tj3Var.m22111b0(445538560);
                        jM4212e = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(445670372);
                        jM4212e = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q;
                        tj3Var.m22139q(false);
                    }
                    ty3.m22352b(y27VarM18236U, null, null, jM4212e, tj3Var, 56, 4);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(444976127);
                    dn7.m10492a(c99.m4422o(b16.f7762a, 18.0f), 0L, 2.0f, 0L, 0, 0.0f, tj3Var, 390, 58);
                    tj3Var.m22139q(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1899b.m8695d(z2, z, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ e81(boolean z, boolean z2) {
        this.f36832b = z;
        this.f36833c = z2;
    }
}
