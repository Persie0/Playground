package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.compose.p002ui.node.C0352b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f87 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38622a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f38623b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f38624c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f38625d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f38626e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f38627f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f38628g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f38629h;

    public /* synthetic */ f87(vi3 vi3Var, InterfaceC0300b interfaceC0300b, boolean z, List list, List list2, vi3 vi3Var2, t66 t66Var) {
        this.f38623b = vi3Var;
        this.f38626e = interfaceC0300b;
        this.f38624c = z;
        this.f38627f = list;
        this.f38628g = list2;
        this.f38625d = vi3Var2;
        this.f38629h = t66Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.f38622a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f38629h;
        Object obj4 = this.f38628g;
        Object obj5 = this.f38627f;
        Object obj6 = this.f38626e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                i1c.m13629a((e16) obj6, (vs3) obj5, (w65) obj4, this.f38624c, this.f38623b, (zi3) obj3, this.f38625d, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                InterfaceC0300b interfaceC0300b = (InterfaceC0300b) obj6;
                List list = (List) obj5;
                List list2 = (List) obj4;
                t66 t66Var = (t66) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
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
                    vi3 vi3Var = C0352b.f4305h;
                    oha.m18000f(tj3Var, vi3Var);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
                    String str = (String) t66Var.getValue();
                    hj4 hj4Var = new hj4(0, 7, null, 119);
                    vi3 vi3Var2 = this.f38623b;
                    boolean zM22120g = tj3Var.m22120g(vi3Var2) | tj3Var.m22124i(interfaceC0300b);
                    Object objM22097O = tj3Var.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new ws6(vi3Var2, interfaceC0300b, t66Var, 15);
                        tj3Var.m22131l0(objM22097O);
                    }
                    gj4 gj4Var = new gj4((vi3) objM22097O, null, 62);
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, 7);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new dt6(18, t66Var);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    bna.m3942c(str, (vi3) objM22097O2, e16VarM21611X, false, null, spc.f61215c, null, null, null, null, null, false, null, hj4Var, gj4Var, true, 0, 0, null, null, tj3Var, 1572912, 12779520, 8159160);
                    if (this.f38624c) {
                        tj3Var.m22111b0(856162334);
                        e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16Var, 1.0f), 200.0f);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                        int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                        l77 l77VarM22132m2 = tj3Var.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4414g);
                        tj3Var.m22119f0();
                        if (tj3Var.f62384S) {
                            tj3Var.m22130l(ui3Var);
                        } else {
                            tj3Var.m22137o0();
                        }
                        oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                        oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                        oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                        dn7.m10492a(null, 0L, 0.0f, 0L, 0, 0.0f, tj3Var, 0, 63);
                        z = true;
                        tj3Var.m22139q(true);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(856519113);
                        e16 e16VarM4416i = c99.m4416i(b16Var, 0.0f, 300.0f, 1);
                        boolean zM22124i = tj3Var.m22124i(list) | tj3Var.m22124i(list2);
                        vi3 vi3Var3 = this.f38625d;
                        boolean zM22120g2 = zM22124i | tj3Var.m22120g(vi3Var3);
                        Object objM22097O3 = tj3Var.m22097O();
                        if (zM22120g2 || objM22097O3 == p84Var) {
                            objM22097O3 = new ws6(list, list2, vi3Var3, 14);
                            tj3Var.m22131l0(objM22097O3);
                        }
                        fa4.m11642c(e16VarM4416i, null, null, null, null, null, false, null, (vi3) objM22097O3, tj3Var, 6, 510);
                        tj3Var.m22139q(false);
                        z = true;
                    }
                    tj3Var.m22139q(z);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                fbd.m11754d((sxa) obj6, this.f38624c, (ui3) obj5, (ui3) obj4, (ui3) obj3, this.f38623b, this.f38625d, (ye1) obj, pk9.m19383z(221185));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ f87(e16 e16Var, vs3 vs3Var, w65 w65Var, boolean z, vi3 vi3Var, zi3 zi3Var, vi3 vi3Var2, int i) {
        this.f38626e = e16Var;
        this.f38627f = vs3Var;
        this.f38628g = w65Var;
        this.f38624c = z;
        this.f38623b = vi3Var;
        this.f38629h = zi3Var;
        this.f38625d = vi3Var2;
    }

    public /* synthetic */ f87(sxa sxaVar, boolean z, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, vi3 vi3Var, vi3 vi3Var2, int i) {
        this.f38626e = sxaVar;
        this.f38624c = z;
        this.f38627f = ui3Var;
        this.f38628g = ui3Var2;
        this.f38629h = ui3Var3;
        this.f38623b = vi3Var;
        this.f38625d = vi3Var2;
    }
}
