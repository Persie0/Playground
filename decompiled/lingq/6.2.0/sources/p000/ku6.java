package p000;

import android.util.Patterns;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.onboarding.R$string;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ku6 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48428a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f48429b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f48430c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f48431d;

    public /* synthetic */ ku6(vi3 vi3Var, ui3 ui3Var, t66 t66Var) {
        this.f48429b = vi3Var;
        this.f48430c = ui3Var;
        this.f48431d = t66Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.f48428a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        t66 t66Var = this.f48431d;
        ui3 ui3Var = this.f48430c;
        vi3 vi3Var = this.f48429b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    zf1 zf1Var = ge9.f40637a;
                    float f = ((fe9) tj3Var.m22128k(zf1Var)).f38957f;
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, f);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var, zi3Var3, numValueOf);
                    vi3 vi3Var2 = C0352b.f4305h;
                    oha.m18000f(tj3Var, vi3Var2);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 7);
                    String strM23620a0 = vz1.m23620a0(tj3Var, R$string.welcome_forgot_password);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM23620a0, e16VarM21611X, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 0, 0, 131068);
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64856b;
                    vv9 vv9Var = (vv9) t66Var.getValue();
                    Object objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = new dt6(1, t66Var);
                        tj3Var.m22131l0(objM22097O);
                    }
                    bna.m3940b(vv9Var, (vi3) objM22097O, e16VarM4412e, false, null, thb.f62310f, null, null, null, null, null, true, 0, 0, si8Var, null, tj3Var, 1573296, 12582912, 6160312);
                    e16 e16VarMo3161g = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 0.0f, 0.0f, 13).mo3161g(new gv3(nj0.f52792K));
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var, 6);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var2);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                    boolean zM22120g = tj3Var.m22120g(ui3Var);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (zM22120g || objM22097O2 == p84Var) {
                        objM22097O2 = new xa0(16, ui3Var);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    AbstractC0231g.m1153f(805306416, 508, null, tj3Var, (ui3) objM22097O2, thb.f62311g, b16Var, null, null, false);
                    boolean z = ((vv9) t66Var.getValue()).f65990a.f54604b.length() > 0 && (str = ((vv9) t66Var.getValue()).f65990a.f54604b) != null && Patterns.EMAIL_ADDRESS.matcher(str).matches();
                    boolean zM22120g2 = tj3Var.m22120g(ui3Var) | tj3Var.m22120g(vi3Var);
                    Object objM22097O3 = tj3Var.m22097O();
                    if (zM22120g2 || objM22097O3 == p84Var) {
                        objM22097O3 = new lu6(ui3Var, vi3Var, t66Var);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    AbstractC0231g.m1153f(805306416, 504, null, tj3Var, (ui3) objM22097O3, thb.f62312h, b16Var, null, null, z);
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(true);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    boolean zM22120g3 = tj3Var2.m22120g(vi3Var) | tj3Var2.m22120g(ui3Var);
                    Object objM22097O4 = tj3Var2.m22097O();
                    if (zM22120g3 || objM22097O4 == p84Var) {
                        objM22097O4 = new lu6(vi3Var, ui3Var, t66Var);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var2, (ui3) objM22097O4, spc.f61213a, null, null, null, false);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ku6(t66 t66Var, ui3 ui3Var, vi3 vi3Var) {
        this.f48431d = t66Var;
        this.f48430c = ui3Var;
        this.f48429b = vi3Var;
    }
}
