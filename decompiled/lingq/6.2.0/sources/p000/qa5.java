package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ja5 f57498b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b85 f57499c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f57500d;

    public /* synthetic */ qa5(ja5 ja5Var, b85 b85Var, Context context, int i) {
        this.f57497a = i;
        this.f57498b = ja5Var;
        this.f57499c = b85Var;
        this.f57500d = context;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        e16 e16VarM815b;
        int i = this.f57497a;
        xfa xfaVar = xfa.f68157a;
        Context context = this.f57500d;
        b85 b85Var = this.f57499c;
        ja5 ja5Var = this.f57498b;
        int i2 = 1;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    AbstractC0218a.m1125e(ci8.m4703P(-1111025946, new qa5(ja5Var, b85Var, context, i2), tj3Var), null, null, ci8.m4703P(-1618836389, new ia5(i2, ja5Var, b85Var), tj3Var), 0.0f, null, h7a.m13119f(tj3Var), null, null, tj3Var, 3078, 438);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    boolean z = ja5Var.f45345j;
                    am4 am4Var = ja5Var.f45336a;
                    b16 b16Var = b16.f7762a;
                    if (z) {
                        tj3Var2.m22111b0(-1555878921);
                        boolean zM22124i = tj3Var2.m22124i(b85Var);
                        Object objM22097O = tj3Var2.m22097O();
                        if (zM22124i || objM22097O == we1.f66679a) {
                            objM22097O = new ma5(b85Var, 15);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(-1555712420);
                        tj3Var2.m22139q(false);
                        e16VarM815b = b16Var;
                    }
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var2, 48);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM815b);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    bq1.m4042R(AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, am4Var.f826a), tj3Var2, 0), null, pb1.m19045o(AbstractC3584sr.m21607T(c99.m4422o(b16Var, 32.0f), 4.0f), ui8.f63972a), null, hl1.f42564a, 0.0f, null, tj3Var2, 24632, 104);
                    thb.m22044c(tj3Var2, c99.m4426s(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a));
                    lw9.m16554b(AbstractC3352my.m17093L(context, am4Var.f826a), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                    if (ja5Var.f45345j) {
                        tj3Var2.m22111b0(1891447646);
                        ty3.m22351a(pvc.m19521q(), vz1.m23620a0(tj3Var2, R$string.ui_back), null, 0L, tj3Var2, 0, 12);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(1891695584);
                        tj3Var2.m22139q(false);
                    }
                    tj3Var2.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }
}
