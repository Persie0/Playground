package p000;

import android.content.Context;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.feature.edit.components.AbstractC2079b;
import com.lingq.feature.search.filter.components.AbstractC2771a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tp8 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62700a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f62701b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f62702c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f62703d;

    public /* synthetic */ tp8(List list, vi3 vi3Var, Context context, int i) {
        this.f62700a = i;
        this.f62701b = list;
        this.f62702c = vi3Var;
        this.f62703d = context;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        tj3 tj3Var;
        int i5 = this.f62700a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        Context context = this.f62703d;
        List list = this.f62701b;
        vi3 vi3Var = this.f62702c;
        p84 p84Var = we1.f66679a;
        switch (i5) {
            case 0:
                ft4 ft4Var = (ft4) obj;
                int iIntValue = ((Number) obj2).intValue();
                ye1 ye1Var = (ye1) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                }
                tj3 tj3Var2 = (tj3) ye1Var;
                if (tj3Var2.m22099R(i & 1, (i & 147) != 146)) {
                    g29 g29Var = (g29) list.get(iIntValue);
                    tj3Var2.m22111b0(117934494);
                    if (g29Var instanceof v19) {
                        tj3Var2.m22111b0(117942119);
                        v19 v19Var = (v19) g29Var;
                        C0282a c0282aM4703P = ci8.m4703P(-192970469, new gj8(1, v19Var, context), tj3Var2);
                        boolean zM22120g = tj3Var2.m22120g(vi3Var);
                        Object objM22097O = tj3Var2.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new ro1(vi3Var, 3);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        AbstractC2771a.m9692b(null, v19Var, c0282aM4703P, (zi3) objM22097O, tj3Var2, 384);
                        tj3Var2.m22139q(false);
                    } else if (g29Var instanceof c29) {
                        tj3Var2.m22111b0(119365546);
                        zf1 zf1Var = ge9.f40637a;
                        AbstractC2771a.m9695e(AbstractC3584sr.m21611X(b16.f7762a, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a, ((fe9) tj3Var2.m22128k(zf1Var)).f38957f, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38955d, 4), (c29) g29Var, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else if (g29Var instanceof u19) {
                        tj3Var2.m22111b0(119673934);
                        u19 u19Var = (u19) g29Var;
                        boolean zM22120g2 = tj3Var2.m22120g(vi3Var);
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O2 == p84Var) {
                            objM22097O2 = new qo1(vi3Var, 3);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        h0d.m12995a(u19Var, (vi3) objM22097O2, null, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else if (g29Var instanceof y19) {
                        tj3Var2.m22111b0(120010439);
                        y19 y19Var = (y19) g29Var;
                        boolean zM22120g3 = tj3Var2.m22120g(g29Var) | tj3Var2.m22120g(vi3Var);
                        Object objM22097O3 = tj3Var2.m22097O();
                        if (zM22120g3 || objM22097O3 == p84Var) {
                            objM22097O3 = new we0(y19Var, vi3Var, 10);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        AbstractC2771a.m9694d(null, y19Var, (ui3) objM22097O3, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else {
                        if (!(g29Var instanceof s19)) {
                            throw ux5.m23001x(tj3Var2, -1520216315, false);
                        }
                        tj3Var2.m22111b0(120358662);
                        s19 s19Var = (s19) g29Var;
                        boolean zM22120g4 = tj3Var2.m22120g(g29Var) | tj3Var2.m22120g(vi3Var);
                        Object objM22097O4 = tj3Var2.m22097O();
                        if (zM22120g4 || objM22097O4 == p84Var) {
                            objM22097O4 = new we0(s19Var, vi3Var, 11);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        AbstractC2771a.m9691a(null, s19Var, (ui3) objM22097O4, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    }
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 1:
                ft4 ft4Var2 = (ft4) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ye1 ye1Var2 = (ye1) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (((tj3) ye1Var2).m22120g(ft4Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= ((tj3) ye1Var2).m22116e(iIntValue3) ? 32 : 16;
                }
                tj3 tj3Var3 = (tj3) ye1Var2;
                if (tj3Var3.m22099R(i2 & 1, (i2 & 147) != 146)) {
                    zaa zaaVar = (zaa) list.get(iIntValue3);
                    tj3Var3.m22111b0(1496714901);
                    String str = zaaVar.f71295b;
                    boolean zM22120g5 = tj3Var3.m22120g(vi3Var) | tj3Var3.m22120g(zaaVar);
                    Object objM22097O5 = tj3Var3.m22097O();
                    if (zM22120g5 || objM22097O5 == p84Var) {
                        objM22097O5 = new sw8(vi3Var, zaaVar, 1);
                        tj3Var3.m22131l0(objM22097O5);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O5;
                    String strM17093L = AbstractC3352my.m17093L(context, zaaVar.f71294a);
                    boolean zM22120g6 = tj3Var3.m22120g(vi3Var) | tj3Var3.m22120g(zaaVar);
                    Object objM22097O6 = tj3Var3.m22097O();
                    if (zM22120g6 || objM22097O6 == p84Var) {
                        objM22097O6 = new tw8(vi3Var, zaaVar, 1);
                        tj3Var3.m22131l0(objM22097O6);
                    }
                    AbstractC2079b.m8993a(str, vi3Var2, null, strM17093L, (ui3) objM22097O6, tj3Var3, 0, 20);
                    ux5.m23003z(b16Var, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38957f, tj3Var3, false);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 2:
                ft4 ft4Var3 = (ft4) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ye1 ye1Var3 = (ye1) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (((tj3) ye1Var3).m22120g(ft4Var3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= ((tj3) ye1Var3).m22116e(iIntValue5) ? 32 : 16;
                }
                tj3 tj3Var4 = (tj3) ye1Var3;
                if (tj3Var4.m22099R(i3 & 1, (i3 & 147) != 146)) {
                    zaa zaaVar2 = (zaa) list.get(iIntValue5);
                    tj3Var4.m22111b0(912528727);
                    String str2 = zaaVar2.f71295b;
                    boolean zM22120g7 = tj3Var4.m22120g(vi3Var) | tj3Var4.m22120g(zaaVar2);
                    Object objM22097O7 = tj3Var4.m22097O();
                    if (zM22120g7 || objM22097O7 == p84Var) {
                        objM22097O7 = new sw8(vi3Var, zaaVar2, 0);
                        tj3Var4.m22131l0(objM22097O7);
                    }
                    vi3 vi3Var3 = (vi3) objM22097O7;
                    String strM17093L2 = AbstractC3352my.m17093L(context, zaaVar2.f71294a);
                    boolean zM22120g8 = tj3Var4.m22120g(vi3Var) | tj3Var4.m22120g(zaaVar2);
                    Object objM22097O8 = tj3Var4.m22097O();
                    if (zM22120g8 || objM22097O8 == p84Var) {
                        objM22097O8 = new tw8(vi3Var, zaaVar2, 0);
                        tj3Var4.m22131l0(objM22097O8);
                    }
                    AbstractC2079b.m8993a(str2, vi3Var3, null, strM17093L2, (ui3) objM22097O8, tj3Var4, 0, 20);
                    ux5.m23003z(b16Var, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38957f, tj3Var4, false);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            default:
                ft4 ft4Var4 = (ft4) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                ye1 ye1Var4 = (ye1) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (((tj3) ye1Var4).m22120g(ft4Var4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= ((tj3) ye1Var4).m22116e(iIntValue7) ? 32 : 16;
                }
                tj3 tj3Var5 = (tj3) ye1Var4;
                if (tj3Var5.m22099R(i4 & 1, (i4 & 147) != 146)) {
                    h29 h29Var = (h29) list.get(iIntValue7);
                    tj3Var5.m22111b0(527816767);
                    if (h29Var instanceof w19) {
                        tj3Var5.m22111b0(848311742);
                        w19 w19Var = (w19) h29Var;
                        C0282a c0282aM4703P2 = ci8.m4703P(-1291676610, new xya(context, w19Var), tj3Var5);
                        boolean zM22120g9 = tj3Var5.m22120g(vi3Var);
                        Object objM22097O9 = tj3Var5.m22097O();
                        if (zM22120g9 || objM22097O9 == p84Var) {
                            objM22097O9 = new ro1(vi3Var, 5);
                            tj3Var5.m22131l0(objM22097O9);
                        }
                        AbstractC1858a.m8598n(null, w19Var, c0282aM4703P2, (zi3) objM22097O9, tj3Var5, 384);
                        tj3Var = tj3Var5;
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var = tj3Var5;
                        if (h29Var instanceof x19) {
                            tj3Var.m22111b0(848325778);
                            x19 x19Var = (x19) h29Var;
                            boolean zM22124i = tj3Var.m22124i(h29Var) | tj3Var.m22120g(vi3Var);
                            Object objM22097O10 = tj3Var.m22097O();
                            if (zM22124i || objM22097O10 == p84Var) {
                                objM22097O10 = new qz7(x19Var, vi3Var, 3);
                                tj3Var.m22131l0(objM22097O10);
                            }
                            AbstractC1858a.m8599o(null, x19Var, (ui3) objM22097O10, tj3Var, 0);
                            tj3Var.m22139q(false);
                        } else if (h29Var instanceof d29) {
                            tj3Var.m22111b0(848335251);
                            AbstractC1858a.m8603s(AbstractC3584sr.m21611X(b16.f7762a, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, 0.0f, 0.0f, 0.0f, 14), (d29) h29Var, null, tj3Var, 0);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(848341078);
                            tj3Var.m22139q(false);
                        }
                    }
                    tj3Var.m22139q(false);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
        }
    }
}
