package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.library.Accent;
import com.lingq.core.settings.AbstractC1858a;
import java.util.List;

/* JADX INFO: renamed from: s2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3558s2 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f60167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f60168c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f60169d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f60170e;

    public C3558s2(List list, Context context, vi3 vi3Var, ui3 ui3Var) {
        this.f60166a = 1;
        this.f60167b = list;
        this.f60169d = context;
        this.f60168c = vi3Var;
        this.f60170e = ui3Var;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String value;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f60166a;
        xfa xfaVar = xfa.f68157a;
        List list = this.f60167b;
        p84 p84Var = we1.f66679a;
        vi3 vi3Var = this.f60168c;
        Object obj5 = this.f60169d;
        Object obj6 = this.f60170e;
        int i9 = 1;
        int i10 = 2;
        switch (i8) {
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
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(i & 1, (i & 147) != 146)) {
                    Accent accent = (Accent) list.get(iIntValue);
                    tj3Var.m22111b0(-96042472);
                    int iM18253f0 = AbstractC3423or.m18253f0(accent, (String) obj5);
                    if (iM18253f0 != -1) {
                        tj3Var.m22111b0(-95956448);
                        value = vz1.m23620a0(tj3Var, iM18253f0);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-95885458);
                        tj3Var.m22139q(false);
                        value = accent.getValue();
                    }
                    String str = value;
                    boolean zM11650l = fa4.m11650l((String) obj6, accent.getValue());
                    boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22116e(accent.ordinal());
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new C3482q2(vi3Var, accent, 0);
                        tj3Var.m22131l0(objM22097O);
                    }
                    txb.m22336b(str, zM11650l, (ui3) objM22097O, AbstractC3423or.m18236U(czc.m9948d(accent), tj3Var, 0), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64856b, hl1.f42565b, null, tj3Var, 200704, 64);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                ft4 ft4Var2 = (ft4) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ye1 ye1Var2 = (ye1) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                ui3 ui3Var = (ui3) obj6;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (((tj3) ye1Var2).m22120g(ft4Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= ((tj3) ye1Var2).m22116e(iIntValue3) ? 32 : 16;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
                    DictionaryLocale dictionaryLocale = (DictionaryLocale) list.get(iIntValue3);
                    tj3Var2.m22111b0(-958658539);
                    String strM17093L = AbstractC3352my.m17093L((Context) obj5, dictionaryLocale.f19021a);
                    e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var) | tj3Var2.m22124i(dictionaryLocale) | tj3Var2.m22120g(ui3Var);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new C3030g9(vi3Var, dictionaryLocale, ui3Var, 0);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    lw9.m16554b(strM17093L, AbstractC3584sr.m21609V(AbstractC0080f.m815b(null, false, (ui3) objM22097O2, e16VarM4412e, 15), 0.0f, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38956e, 1), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var2, 0, 0, 131068);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                ft4 ft4Var3 = (ft4) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ye1 ye1Var3 = (ye1) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                vi3 vi3Var2 = (vi3) obj5;
                if ((iIntValue6 & 6) == 0) {
                    i3 = (((tj3) ye1Var3).m22120g(ft4Var3) ? 4 : 2) | iIntValue6;
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= ((tj3) ye1Var3).m22116e(iIntValue5) ? 32 : 16;
                }
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(i3 & 1, (i3 & 147) != 146)) {
                    rr0 rr0Var = (rr0) list.get(iIntValue5);
                    tj3Var3.m22111b0(1207743366);
                    if (rr0Var instanceof qr0) {
                        tj3Var3.m22111b0(1840076581);
                        qr0 qr0Var = (qr0) rr0Var;
                        Challenge challenge = qr0Var.f58098a;
                        boolean zM22120g3 = tj3Var3.m22120g(vi3Var) | tj3Var3.m22124i(rr0Var);
                        Object objM22097O3 = tj3Var3.m22097O();
                        if (zM22120g3 || objM22097O3 == p84Var) {
                            objM22097O3 = new ue0(i10, vi3Var, qr0Var);
                            tj3Var3.m22131l0(objM22097O3);
                        }
                        vi3 vi3Var3 = (vi3) objM22097O3;
                        boolean zM22124i = tj3Var3.m22124i(rr0Var) | tj3Var3.m22120g(vi3Var2);
                        Object objM22097O4 = tj3Var3.m22097O();
                        if (zM22124i || objM22097O4 == p84Var) {
                            objM22097O4 = new we0(vi3Var2, qr0Var, i9);
                            tj3Var3.m22131l0(objM22097O4);
                        }
                        t5d.m21852a(challenge, vi3Var3, (ui3) objM22097O4, tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    } else {
                        if (!(rr0Var instanceof pr0)) {
                            throw ux5.m23001x(tj3Var3, 1840074781, false);
                        }
                        tj3Var3.m22111b0(1840086012);
                        wt1.m24152a(((pr0) rr0Var).f56711a, (ui3) obj6, null, tj3Var3, 0);
                        tj3Var3.m22139q(false);
                    }
                    tj3Var3.m22139q(false);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                ft4 ft4Var4 = (ft4) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                ye1 ye1Var4 = (ye1) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                Context context = (Context) obj6;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (((tj3) ye1Var4).m22120g(ft4Var4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= ((tj3) ye1Var4).m22116e(iIntValue7) ? 32 : 16;
                }
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(i4 & 1, (i4 & 147) != 146)) {
                    DictionaryLocale dictionaryLocale2 = (DictionaryLocale) list.get(iIntValue7);
                    tj3Var4.m22111b0(-242591498);
                    String str2 = dictionaryLocale2.f19021a;
                    String strM17093L2 = AbstractC3352my.m17093L(context, str2);
                    boolean zM11650l2 = fa4.m11650l((String) obj5, str2);
                    boolean zM22120g4 = tj3Var4.m22120g(vi3Var) | tj3Var4.m22124i(dictionaryLocale2);
                    Object objM22097O5 = tj3Var4.m22097O();
                    if (zM22120g4 || objM22097O5 == p84Var) {
                        objM22097O5 = new we0(vi3Var, dictionaryLocale2, i10);
                        tj3Var4.m22131l0(objM22097O5);
                    }
                    txb.m22336b(strM17093L2, zM11650l2, (ui3) objM22097O5, AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, str2), tj3Var4, 0), null, null, null, tj3Var4, 4096, 112);
                    tj3Var4.m22139q(false);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 4:
                ft4 ft4Var5 = (ft4) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                ye1 ye1Var5 = (ye1) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                rc2 rc2Var = (rc2) obj5;
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (((tj3) ye1Var5).m22120g(ft4Var5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= ((tj3) ye1Var5).m22116e(iIntValue9) ? 32 : 16;
                }
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(i5 & 1, (i5 & 147) != 146)) {
                    h29 h29Var = (h29) list.get(iIntValue9);
                    tj3Var5.m22111b0(-1376096978);
                    if (h29Var instanceof e29) {
                        tj3Var5.m22111b0(-1984053595);
                        e29 e29Var = (e29) h29Var;
                        boolean zM22120g5 = tj3Var5.m22120g(h29Var) | tj3Var5.m22120g(vi3Var);
                        Object objM22097O6 = tj3Var5.m22097O();
                        if (zM22120g5 || objM22097O6 == p84Var) {
                            objM22097O6 = new mz7(vi3Var, e29Var, 2);
                            tj3Var5.m22131l0(objM22097O6);
                        }
                        AbstractC1858a.m8604t(null, e29Var, (ui3) objM22097O6, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (h29Var instanceof o19) {
                        tj3Var5.m22111b0(-1984047086);
                        AbstractC1858a.m8594j(null, (o19) h29Var, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (h29Var instanceof p19) {
                        tj3Var5.m22111b0(-1984043930);
                        had.m13168c((p19) h29Var, vi3Var, null, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (h29Var instanceof w19) {
                        tj3Var5.m22111b0(-1984038418);
                        w19 w19Var = (w19) h29Var;
                        C0282a c0282aM4703P = ci8.m4703P(-1714915709, new oc8((d39) obj6, i9), tj3Var5);
                        boolean zM22120g6 = tj3Var5.m22120g(vi3Var) | tj3Var5.m22120g(h29Var);
                        Object objM22097O7 = tj3Var5.m22097O();
                        if (zM22120g6 || objM22097O7 == p84Var) {
                            objM22097O7 = new gj8(i10, vi3Var, w19Var);
                            tj3Var5.m22131l0(objM22097O7);
                        }
                        AbstractC1858a.m8598n(null, w19Var, c0282aM4703P, (zi3) objM22097O7, tj3Var5, 384);
                        tj3Var5.m22139q(false);
                    } else if (h29Var instanceof z19) {
                        tj3Var5.m22111b0(-1984028771);
                        z19 z19Var = (z19) h29Var;
                        boolean zM22120g7 = tj3Var5.m22120g(h29Var) | tj3Var5.m22120g(vi3Var);
                        Object objM22097O8 = tj3Var5.m22097O();
                        if (zM22120g7 || objM22097O8 == p84Var) {
                            objM22097O8 = new nz7(vi3Var, z19Var, 2);
                            tj3Var5.m22131l0(objM22097O8);
                        }
                        AbstractC1858a.m8600p(null, z19Var, (vi3) objM22097O8, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (h29Var instanceof a29) {
                        tj3Var5.m22111b0(-1984022091);
                        a29 a29Var = (a29) h29Var;
                        boolean zM22120g8 = tj3Var5.m22120g(vi3Var) | tj3Var5.m22120g(h29Var);
                        Object objM22097O9 = tj3Var5.m22097O();
                        if (zM22120g8 || objM22097O9 == p84Var) {
                            objM22097O9 = new oz7(vi3Var, a29Var, 2);
                            tj3Var5.m22131l0(objM22097O9);
                        }
                        ui3 ui3Var2 = (ui3) objM22097O9;
                        boolean zM22120g9 = tj3Var5.m22120g(h29Var) | tj3Var5.m22120g(vi3Var);
                        Object objM22097O10 = tj3Var5.m22097O();
                        if (zM22120g9 || objM22097O10 == p84Var) {
                            objM22097O10 = new pz7(vi3Var, a29Var, 2);
                            tj3Var5.m22131l0(objM22097O10);
                        }
                        AbstractC1858a.m8601q(null, a29Var, ui3Var2, (vi3) objM22097O10, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (h29Var instanceof q19) {
                        tj3Var5.m22111b0(-1984008360);
                        AbstractC1858a.m8595k(null, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (h29Var instanceof t19) {
                        tj3Var5.m22111b0(-1984005738);
                        t19 t19Var = (t19) h29Var;
                        boolean zM22120g10 = tj3Var5.m22120g(h29Var) | tj3Var5.m22120g(vi3Var);
                        Object objM22097O11 = tj3Var5.m22097O();
                        if (zM22120g10 || objM22097O11 == p84Var) {
                            objM22097O11 = new we0(vi3Var, t19Var, 20);
                            tj3Var5.m22131l0(objM22097O11);
                        }
                        AbstractC1858a.m8597m(t19Var, null, (ui3) objM22097O11, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (h29Var instanceof m19) {
                        tj3Var5.m22111b0(-1374228764);
                        m19 m19Var = (m19) h29Var;
                        boolean zM22120g11 = tj3Var5.m22120g(vi3Var);
                        Object objM22097O12 = tj3Var5.m22097O();
                        if (zM22120g11 || objM22097O12 == p84Var) {
                            objM22097O12 = new w29(vi3Var, 2);
                            tj3Var5.m22131l0(objM22097O12);
                        }
                        ui3 ui3Var3 = (ui3) objM22097O12;
                        boolean zM22120g12 = tj3Var5.m22120g(vi3Var);
                        Object objM22097O13 = tj3Var5.m22097O();
                        if (zM22120g12 || objM22097O13 == p84Var) {
                            objM22097O13 = new w29(vi3Var, 3);
                            tj3Var5.m22131l0(objM22097O13);
                        }
                        ui3 ui3Var4 = (ui3) objM22097O13;
                        boolean zM22120g13 = tj3Var5.m22120g(rc2Var) | tj3Var5.m22120g(vi3Var);
                        Object objM22097O14 = tj3Var5.m22097O();
                        if (zM22120g13 || objM22097O14 == p84Var) {
                            objM22097O14 = new we0(rc2Var, vi3Var, 17);
                            tj3Var5.m22131l0(objM22097O14);
                        }
                        AbstractC1858a.m8592h(null, m19Var, ui3Var3, ui3Var4, (ui3) objM22097O14, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (h29Var instanceof r19) {
                        tj3Var5.m22111b0(-1983977344);
                        boolean zM22120g14 = tj3Var5.m22120g(vi3Var);
                        Object objM22097O15 = tj3Var5.m22097O();
                        if (zM22120g14 || objM22097O15 == p84Var) {
                            objM22097O15 = new w29(vi3Var, 0);
                            tj3Var5.m22131l0(objM22097O15);
                        }
                        ui3 ui3Var5 = (ui3) objM22097O15;
                        boolean zM22120g15 = tj3Var5.m22120g(vi3Var);
                        Object objM22097O16 = tj3Var5.m22097O();
                        if (zM22120g15 || objM22097O16 == p84Var) {
                            objM22097O16 = new w29(vi3Var, 1);
                            tj3Var5.m22131l0(objM22097O16);
                        }
                        AbstractC1858a.m8596l(null, ui3Var5, (ui3) objM22097O16, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (h29Var instanceof f29) {
                        tj3Var5.m22111b0(-1983968013);
                        f29 f29Var = (f29) h29Var;
                        boolean zM22120g16 = tj3Var5.m22120g(h29Var) | tj3Var5.m22120g(vi3Var);
                        Object objM22097O17 = tj3Var5.m22097O();
                        if (zM22120g16 || objM22097O17 == p84Var) {
                            objM22097O17 = new we0(vi3Var, f29Var, 18);
                            tj3Var5.m22131l0(objM22097O17);
                        }
                        AbstractC1858a.m8605u(null, f29Var, (ui3) objM22097O17, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else if (h29Var instanceof n19) {
                        tj3Var5.m22111b0(-1983961683);
                        n19 n19Var = (n19) h29Var;
                        boolean zM22120g17 = tj3Var5.m22120g(h29Var) | tj3Var5.m22120g(vi3Var);
                        Object objM22097O18 = tj3Var5.m22097O();
                        if (zM22120g17 || objM22097O18 == p84Var) {
                            objM22097O18 = new we0(n19Var, vi3Var, 19);
                            tj3Var5.m22131l0(objM22097O18);
                        }
                        AbstractC1858a.m8593i(null, n19Var, (ui3) objM22097O18, tj3Var5, 0);
                        tj3Var5.m22139q(false);
                    } else {
                        tj3Var5.m22111b0(-1372994344);
                        tj3Var5.m22139q(false);
                    }
                    tj3Var5.m22139q(false);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 5:
                ft4 ft4Var6 = (ft4) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                ye1 ye1Var6 = (ye1) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                vi3 vi3Var4 = (vi3) obj5;
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (((tj3) ye1Var6).m22120g(ft4Var6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= ((tj3) ye1Var6).m22116e(iIntValue11) ? 32 : 16;
                }
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(i6 & 1, (i6 & 147) != 146)) {
                    h29 h29Var2 = (h29) list.get(iIntValue11);
                    tj3Var6.m22111b0(-1748132613);
                    if (h29Var2 instanceof w19) {
                        tj3Var6.m22111b0(-1748088222);
                        w19 w19Var2 = (w19) h29Var2;
                        C0282a c0282aM4703P2 = ci8.m4703P(-1574501391, new xya(w19Var2, (Context) obj6), tj3Var6);
                        boolean zM22120g18 = tj3Var6.m22120g(vi3Var);
                        Object objM22097O19 = tj3Var6.m22097O();
                        if (zM22120g18 || objM22097O19 == p84Var) {
                            objM22097O19 = new ro1(vi3Var, 4);
                            tj3Var6.m22131l0(objM22097O19);
                        }
                        AbstractC1858a.m8598n(null, w19Var2, c0282aM4703P2, (zi3) objM22097O19, tj3Var6, 384);
                        tj3Var6.m22139q(false);
                    } else if (h29Var2 instanceof x19) {
                        tj3Var6.m22111b0(-1441817814);
                        x19 x19Var = (x19) h29Var2;
                        boolean zM22124i2 = tj3Var6.m22124i(h29Var2) | tj3Var6.m22120g(vi3Var4);
                        Object objM22097O20 = tj3Var6.m22097O();
                        if (zM22124i2 || objM22097O20 == p84Var) {
                            objM22097O20 = new qz7(x19Var, vi3Var4, 2);
                            tj3Var6.m22131l0(objM22097O20);
                        }
                        AbstractC1858a.m8599o(null, x19Var, (ui3) objM22097O20, tj3Var6, 0);
                        tj3Var6.m22139q(false);
                    } else if (h29Var2 instanceof d29) {
                        tj3Var6.m22111b0(-1441806063);
                        AbstractC1858a.m8603s(AbstractC3584sr.m21611X(b16.f7762a, ((fe9) tj3Var6.m22128k(ge9.f40637a)).f38952a, 0.0f, 0.0f, 0.0f, 14), (d29) h29Var2, null, tj3Var6, 0);
                        tj3Var6.m22139q(false);
                    } else {
                        tj3Var6.m22111b0(-1746119877);
                        tj3Var6.m22139q(false);
                    }
                    tj3Var6.m22139q(false);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            default:
                ft4 ft4Var7 = (ft4) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                ye1 ye1Var7 = (ye1) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                vi3 vi3Var5 = (vi3) obj6;
                zi3 zi3Var = (zi3) obj5;
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (((tj3) ye1Var7).m22120g(ft4Var7) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= ((tj3) ye1Var7).m22116e(iIntValue13) ? 32 : 16;
                }
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(i7 & 1, (i7 & 147) != 146)) {
                    sxa sxaVar = (sxa) list.get(iIntValue13);
                    tj3Var7.m22111b0(709647739);
                    boolean zM22120g19 = tj3Var7.m22120g(vi3Var) | tj3Var7.m22124i(sxaVar);
                    Object objM22097O21 = tj3Var7.m22097O();
                    if (zM22120g19 || objM22097O21 == p84Var) {
                        objM22097O21 = new g0b(vi3Var, sxaVar, 0);
                        tj3Var7.m22131l0(objM22097O21);
                    }
                    ui3 ui3Var6 = (ui3) objM22097O21;
                    boolean zM22120g20 = tj3Var7.m22120g(zi3Var) | tj3Var7.m22124i(sxaVar);
                    Object objM22097O22 = tj3Var7.m22097O();
                    if (zM22120g20 || objM22097O22 == p84Var) {
                        objM22097O22 = new ue0(24, zi3Var, sxaVar);
                        tj3Var7.m22131l0(objM22097O22);
                    }
                    vi3 vi3Var6 = (vi3) objM22097O22;
                    boolean zM22120g21 = tj3Var7.m22120g(vi3Var5) | tj3Var7.m22124i(sxaVar);
                    Object objM22097O23 = tj3Var7.m22097O();
                    if (zM22120g21 || objM22097O23 == p84Var) {
                        objM22097O23 = new g0b(vi3Var5, sxaVar, 1);
                        tj3Var7.m22131l0(objM22097O23);
                    }
                    fbd.m11751a(0, tj3Var7, ui3Var6, (ui3) objM22097O23, vi3Var6, sxaVar);
                    tj3Var7.m22139q(false);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
        }
    }

    public /* synthetic */ C3558s2(List list, vi3 vi3Var, Object obj, Object obj2, int i) {
        this.f60166a = i;
        this.f60167b = list;
        this.f60168c = vi3Var;
        this.f60169d = obj;
        this.f60170e = obj2;
    }

    public C3558s2(List list, Context context, String str, vi3 vi3Var) {
        this.f60166a = 3;
        this.f60167b = list;
        this.f60170e = context;
        this.f60169d = str;
        this.f60168c = vi3Var;
    }

    public C3558s2(List list, String str, String str2, vi3 vi3Var) {
        this.f60166a = 0;
        this.f60167b = list;
        this.f60169d = str;
        this.f60170e = str2;
        this.f60168c = vi3Var;
    }
}
