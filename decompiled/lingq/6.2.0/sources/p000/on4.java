package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.milestones.Badge;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class on4 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g80 f54614b;

    public /* synthetic */ on4(g80 g80Var, int i) {
        this.f54613a = i;
        this.f54614b = g80Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e16 e16Var;
        boolean z;
        boolean z2;
        int i = this.f54613a;
        xfa xfaVar = xfa.f68157a;
        g80 g80Var = this.f54614b;
        switch (i) {
            case 0:
                t17 t17Var = (t17) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    tj3Var.m22102U();
                } else {
                    zhd.m25664b(t17Var, g80Var, tj3Var, iIntValue & 14);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM4429v = c99.m4429v(b16Var);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM4429v, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e, 1);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                    vi3 vi3Var = C0352b.f4305h;
                    oha.m18000f(tj3Var2, vi3Var);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                    if (g80Var instanceof f80) {
                        tj3Var2.m22111b0(1725896596);
                        List list = ((f80) g80Var).f38606a;
                        e16 e16VarM21609V2 = AbstractC3584sr.m21609V(c99.m4418k(b16Var, 1), 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e, 1);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        u06 u06Var = eh0.f37241g;
                        fc0 fc0Var = nj0.f52817l;
                        sj8 sj8VarM20003a = qj8.m20003a(u06Var, fc0Var, tj3Var2, 6);
                        int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m2 = tj3Var2.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                        if (list.size() == 1) {
                            tj3Var2.m22111b0(-545635974);
                            e16Var = e16VarM21609V2;
                            j4d.m14286a(e16Var, (Badge) list.get(0), tj3Var2, 0);
                            tj3Var2.m22139q(false);
                            z = true;
                        } else {
                            e16Var = e16VarM21609V2;
                            if (list.size() >= 2) {
                                tj3Var2.m22111b0(-545509680);
                                j4d.m14286a(e16Var, (Badge) list.get(0), tj3Var2, 0);
                                z = true;
                                j4d.m14286a(e16Var, (Badge) list.get(1), tj3Var2, 0);
                                tj3Var2.m22139q(false);
                            } else {
                                z = true;
                                tj3Var2.m22111b0(-545345349);
                                tj3Var2.m22139q(false);
                            }
                        }
                        tj3Var2.m22139q(z);
                        if (list.size() >= 3) {
                            tj3Var2.m22111b0(1726643820);
                            e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e, 0.0f, 0.0f, 13);
                            sj8 sj8VarM20003a2 = qj8.m20003a(u06Var, fc0Var, tj3Var2, 6);
                            int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                            l77 l77VarM22132m3 = tj3Var2.m22132m();
                            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
                            tj3Var2.m22119f0();
                            if (tj3Var2.f62384S) {
                                tj3Var2.m22130l(ui3Var);
                            } else {
                                tj3Var2.m22137o0();
                            }
                            oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a2);
                            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m3);
                            AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c3);
                            if (list.size() == 3) {
                                tj3Var2.m22111b0(133909431);
                                z2 = false;
                                j4d.m14286a(e16Var, (Badge) list.get(2), tj3Var2, 0);
                                tj3Var2.m22139q(false);
                            } else {
                                z2 = false;
                                if (list.size() == 4) {
                                    tj3Var2.m22111b0(134043785);
                                    j4d.m14286a(e16Var, (Badge) list.get(2), tj3Var2, 0);
                                    j4d.m14286a(e16Var, (Badge) list.get(3), tj3Var2, 0);
                                    tj3Var2.m22139q(false);
                                } else {
                                    tj3Var2.m22111b0(134219648);
                                    tj3Var2.m22139q(false);
                                }
                            }
                            tj3Var2.m22139q(true);
                            tj3Var2.m22139q(z2);
                        } else {
                            z2 = false;
                            tj3Var2.m22111b0(1727303066);
                            tj3Var2.m22139q(false);
                        }
                        tj3Var2.m22139q(z2);
                    } else {
                        tj3Var2.m22111b0(1727324549);
                        cid.m4761l(tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    }
                    tj3Var2.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }
}
