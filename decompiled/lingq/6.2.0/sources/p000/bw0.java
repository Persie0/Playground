package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.premium.AbstractC1839a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bw0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9080a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f9081b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f9082c;

    public /* synthetic */ bw0(ui3 ui3Var, ui3 ui3Var2, int i) {
        this.f9080a = i;
        this.f9081b = ui3Var;
        this.f9082c = ui3Var2;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f9080a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f9082c;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var, zi3Var3, numValueOf);
                    vi3 vi3Var = C0352b.f4305h;
                    oha.m18000f(tj3Var, vi3Var);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
                    e16 e16VarM3912B0 = bna.m3912B0(c99.m4412e(b16Var, 1.0f), bna.m3972r0(tj3Var), false, 14);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(e16VarM3912B0, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, ((fe9) tj3Var.m22128k(zf1Var)).f38958g);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                    qnb.m20084a(0, 2, tj3Var, ui3Var, null);
                    tj3Var.m22139q(true);
                    omd.m18139b(this.f9081b, AbstractC3584sr.m21607T(ci0.f10109a.mo3727a(b16Var, nj0.f52810e), ((fe9) tj3Var.m22128k(zf1Var)).f38952a), false, null, null, snb.f61076e, tj3Var, 1572864);
                    tj3Var.m22139q(true);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    AbstractC1839a.m8525c(this.f9081b, ui3Var, tj3Var2, 0);
                }
                break;
        }
        return xfaVar;
    }
}
