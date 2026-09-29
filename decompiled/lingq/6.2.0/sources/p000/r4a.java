package p000;

import androidx.compose.foundation.AbstractC0080f;
import com.lingq.feature.token.R$drawable;
import com.lingq.feature.token.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r4a implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f5a f58713b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f58714c;

    public /* synthetic */ r4a(f5a f5aVar, vi3 vi3Var, int i) {
        this.f58712a = i;
        this.f58713b = f5aVar;
        this.f58714c = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f58712a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        vi3 vi3Var = this.f58714c;
        f5a f5aVar = this.f58713b;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else if (!f5aVar.f38455M) {
                    tj3Var.m22111b0(-568412625);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-569356327);
                    boolean z = f5aVar.f38450H;
                    b16 b16Var = b16.f7762a;
                    if (z) {
                        tj3Var.m22111b0(-569316895);
                        dn7.m10492a(c99.m4422o(b16Var, 16.0f), 0L, 1.5f, 0L, 0, 0.0f, tj3Var, 390, 58);
                        tj3Var = tj3Var;
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-569032439);
                        y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_lynx, tj3Var, 0);
                        String strM23620a0 = vz1.m23620a0(tj3Var, R$string.token_explain);
                        e16 e16VarM4422o = c99.m4422o(b16Var, 24.0f);
                        boolean zM22120g = tj3Var.m22120g(vi3Var);
                        Object objM22097O = tj3Var.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new ex8(vi3Var, 26);
                            tj3Var.m22131l0(objM22097O);
                        }
                        bq1.m4042R(y27VarM18236U, strM23620a0, AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM4422o, 15), null, null, 0.0f, null, tj3Var, 8, 120);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(false);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    List list = f5aVar.f38460R;
                    List list2 = f5aVar.f38483o;
                    boolean z2 = f5aVar.f38451I;
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new x4a(vi3Var, 0);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    ui3 ui3Var = (ui3) objM22097O2;
                    boolean zM22120g3 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O3 = tj3Var2.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new v4a(vi3Var, i3);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O3;
                    boolean zM22120g4 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O4 = tj3Var2.m22097O();
                    if (zM22120g4 || objM22097O4 == p84Var) {
                        objM22097O4 = new v4a(vi3Var, i2);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    g6d.m12390c(list, list2, z2, ui3Var, vi3Var2, (vi3) objM22097O4, tj3Var2, 0);
                }
                break;
        }
        return xfaVar;
    }
}
