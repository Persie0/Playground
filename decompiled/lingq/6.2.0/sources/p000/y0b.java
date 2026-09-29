package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.vocabulary.AbstractC2823a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y0b implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69078a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n1b f69079b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f69080c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f69081d;

    public /* synthetic */ y0b(n1b n1bVar, vi3 vi3Var, vi3 vi3Var2) {
        this.f69079b = n1bVar;
        this.f69080c = vi3Var;
        this.f69081d = vi3Var2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f69078a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f69081d;
        vi3 vi3Var2 = this.f69080c;
        n1b n1bVar = this.f69079b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                AbstractC2823a.m9742i(n1bVar, vi3Var2, vi3Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16.f7762a);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    h1b h1bVar = n1bVar.f52191a;
                    boolean zM22120g = tj3Var.m22120g(vi3Var2);
                    Object objM22097O = tj3Var.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new v4a(vi3Var2, 21);
                        tj3Var.m22131l0(objM22097O);
                    }
                    vi3 vi3Var3 = (vi3) objM22097O;
                    boolean zM22120g2 = tj3Var.m22120g(vi3Var2);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new hsa(vi3Var2, 13);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    hbd.m13186a(h1bVar, vi3Var3, (ui3) objM22097O2, null, tj3Var, 0);
                    zza zzaVar = n1bVar.f52192b;
                    boolean zM22120g3 = tj3Var.m22120g(vi3Var2);
                    Object objM22097O3 = tj3Var.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new v4a(vi3Var2, 22);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    vi3 vi3Var4 = (vi3) objM22097O3;
                    boolean zM22120g4 = tj3Var.m22120g(vi3Var);
                    Object objM22097O4 = tj3Var.m22097O();
                    if (zM22120g4 || objM22097O4 == p84Var) {
                        objM22097O4 = new hsa(vi3Var, 14);
                        tj3Var.m22131l0(objM22097O4);
                    }
                    dbd.m10273a(zzaVar, vi3Var4, (ui3) objM22097O4, null, tj3Var, 0);
                    tj3Var.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ y0b(n1b n1bVar, vi3 vi3Var, vi3 vi3Var2, int i) {
        this.f69079b = n1bVar;
        this.f69080c = vi3Var;
        this.f69081d = vi3Var2;
    }
}
