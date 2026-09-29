package p000;

import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.window.AbstractC0454b;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ai3 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f689a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ li3 f690b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f691c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f692d;

    public /* synthetic */ ai3(li3 li3Var, vi3 vi3Var, vi3 vi3Var2) {
        this.f690b = li3Var;
        this.f691c = vi3Var;
        this.f692d = vi3Var2;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f689a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                ((InterfaceC0067f) obj).getClass();
                tj3 tj3Var = (tj3) ((ye1) obj2);
                vi3 vi3Var = this.f691c;
                boolean zM22120g = tj3Var.m22120g(vi3Var);
                vi3 vi3Var2 = this.f692d;
                boolean zM22120g2 = zM22120g | tj3Var.m22120g(vi3Var2);
                Object objM22097O = tj3Var.m22097O();
                if (zM22120g2 || objM22097O == p84Var) {
                    objM22097O = new ei3(vi3Var, vi3Var2, 1);
                    tj3Var.m22131l0(objM22097O);
                }
                AbstractC0454b.m1895a((ui3) objM22097O, null, ci8.m4703P(1933429919, new bi3(this.f690b, vi3Var, vi3Var2, 1, (byte) 0), tj3Var), tj3Var, 384, 2);
                break;
            default:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    zf1 zf1Var = ge9.f40637a;
                    float f = ((fe9) tj3Var2.m22128k(zf1Var)).f38960i;
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, f);
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52792K, tj3Var2, 48);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21607T);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    String strM23620a0 = vz1.m23620a0(tj3Var2, R$string.ui_error);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM23620a0, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71405i, tj3Var2, 0, 0, 131070);
                    Integer num = this.f690b.f49705h;
                    lw9.m16554b(vz1.m23620a0(tj3Var2, num != null ? num.intValue() : com.lingq.core.premium.R$string.upgrade_purchase_server_problem), null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71406j, tj3Var2, 0, 0, 130046);
                    vi3 vi3Var3 = this.f691c;
                    boolean zM22120g3 = tj3Var2.m22120g(vi3Var3);
                    vi3 vi3Var4 = this.f692d;
                    boolean zM22120g4 = zM22120g3 | tj3Var2.m22120g(vi3Var4);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g4 || objM22097O2 == p84Var) {
                        objM22097O2 = new ei3(vi3Var3, vi3Var4, 2);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    AbstractC0231g.m1148a((ui3) objM22097O2, c99.m4412e(b16Var, 1.0f), false, null, null, null, null, null, hqb.f42812m, tj3Var2, 805306416, 508);
                    tj3Var2.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ai3(vi3 vi3Var, vi3 vi3Var2, li3 li3Var) {
        this.f691c = vi3Var;
        this.f692d = vi3Var2;
        this.f690b = li3Var;
    }
}
