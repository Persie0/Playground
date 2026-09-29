package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gv0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41363a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f41364b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f41365c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f41366d;

    public /* synthetic */ gv0(long j, sb9 sb9Var, String str) {
        this.f41364b = j;
        this.f41365c = sb9Var;
        this.f41366d = str;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f41363a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f41366d;
        Object obj4 = this.f41365c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                t6d.m21879a((e16) obj4, (ArrayList) obj3, this.f41364b, (ye1) obj, pk9.m19383z(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                of5.m17961c(this.f41364b, (TypographyKeyTokens) obj4, (zi3) obj3, (ye1) obj, pk9.m19383z(49));
                break;
            default:
                sb9 sb9Var = (sb9) obj4;
                String str = (String) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    x17 x17Var = wj0.f66899a;
                    long j = aa1.f412k;
                    vj0 vj0VarM23297a = wj0.m24000e(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a).m23297a(j, this.f41364b, j, j);
                    boolean zM22120g = tj3Var.m22120g(sb9Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == we1.f66679a) {
                        objM22097O = new tb9(sb9Var, 1);
                        tj3Var.m22131l0(objM22097O);
                    }
                    AbstractC0231g.m1153f(805306368, 494, vj0VarM23297a, tj3Var, (ui3) objM22097O, ci8.m4703P(521110564, new iq0(str, 15), tj3Var), null, null, null, false);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ gv0(long j, TypographyKeyTokens typographyKeyTokens, zi3 zi3Var, int i) {
        this.f41364b = j;
        this.f41365c = typographyKeyTokens;
        this.f41366d = zi3Var;
    }

    public /* synthetic */ gv0(e16 e16Var, ArrayList arrayList, long j, int i) {
        this.f41365c = e16Var;
        this.f41366d = arrayList;
        this.f41364b = j;
    }
}
