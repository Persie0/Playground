package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.layout.AbstractC0337d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.achievements.StreakChallengeType;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.core.premium.C1853l;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.core.settings.theme.AbstractC1881a;
import com.lingq.core.settings.theme.ThemeSettingsTab;
import com.lingq.feature.imports.AbstractC2105b;
import com.lingq.feature.imports.R$string;
import com.lingq.feature.imports.data.UserImportSourceType;
import com.lingq.feature.vocabulary.AbstractC2823a;
import com.lingq.feature.vocabulary.filter.AbstractC2849a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g39 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40131a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f40132b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f40133c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f40134d;

    public /* synthetic */ g39(l1b l1bVar, vi3 vi3Var, e16 e16Var, int i) {
        this.f40131a = 20;
        this.f40133c = l1bVar;
        this.f40134d = vi3Var;
        this.f40132b = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        t66 t66Var;
        int i = this.f40131a;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f40134d;
        Object obj4 = this.f40133c;
        Object obj5 = this.f40132b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8596l((e16) obj5, (ui3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8593i((e16) obj5, (n19) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8605u((e16) obj5, (f29) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8597m((t19) obj3, (e16) obj5, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8603s((e16) obj5, (d29) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8604t((e16) obj5, (e29) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8600p((e16) obj5, (z19) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                u4d.m22467b((e16) obj5, (StreakChallengeType) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 8:
                C0282a c0282a = (C0282a) obj5;
                zi3 zi3Var = (zi3) obj4;
                aj3 aj3Var = (aj3) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.DefaultSpatial, tj3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = new tq9(l43VarM21705c0);
                        tj3Var.m22131l0(objM22097O);
                    }
                    tq9 tq9Var = (tq9) objM22097O;
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    List listM23605K = vz1.m23605K(c0282a, zi3Var, ci8.m4703P(-1333331860, new eq8(17, aj3Var, tq9Var), tj3Var));
                    Object objM22097O2 = tj3Var.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new sq9(tq9Var);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    p46 p46Var = (p46) objM22097O2;
                    C0282a c0282aM1488c = AbstractC0337d.m1488c(listM23605K);
                    Object objM22097O3 = tj3Var.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new q46(p46Var);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    ht5 ht5Var = (ht5) objM22097O3;
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5Var);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    wq1.m24128x(0, c0282aM1488c, tj3Var, true);
                } else {
                    tj3Var.m22102U();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC1881a.m8675n((List) obj5, (String) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC1881a.m8678q((List) obj5, (yz7) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC1881a.m8669h((List) obj5, (vs3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 12:
                List<ThemeSettingsTab> list = (List) obj5;
                ThemeSettingsTab themeSettingsTab = (ThemeSettingsTab) obj4;
                vi3 vi3Var = (vi3) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    for (ThemeSettingsTab themeSettingsTab2 : list) {
                        boolean z = themeSettingsTab == themeSettingsTab2;
                        boolean zM22120g = tj3Var2.m22120g(vi3Var) | tj3Var2.m22116e(themeSettingsTab2.ordinal());
                        Object objM22097O4 = tj3Var2.m22097O();
                        if (zM22120g || objM22097O4 == p84Var) {
                            objM22097O4 = new qk9(5, vi3Var, themeSettingsTab2);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        iq9.m14077b(z, (ui3) objM22097O4, null, false, ci8.m4703P(-2067956942, new dl9(themeSettingsTab2, 3), tj3Var2), 0L, 0L, tj3Var2, 24576);
                    }
                } else {
                    tj3Var2.m22102U();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC1839a.m8515A((ud6) obj5, (C1853l) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 14:
                vi3 vi3Var2 = (vi3) obj5;
                vi3 vi3Var3 = (vi3) obj4;
                t66 t66Var2 = (t66) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4411d, ((fe9) tj3Var3.m22128k(zf1Var)).f38960i);
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var3.m22128k(zf1Var)).f38957f, true, new gm5(28)), nj0.f52791J, tj3Var3, 48);
                    int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m2 = tj3Var3.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM21607T);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var2);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    zi3 zi3Var2 = C0352b.f4303f;
                    oha.m18001g(tj3Var3, zi3Var2, bb1VarM230a);
                    zi3 zi3Var3 = C0352b.f4302e;
                    oha.m18001g(tj3Var3, zi3Var3, l77VarM22132m2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    zi3 zi3Var4 = C0352b.f4304g;
                    oha.m18001g(tj3Var3, zi3Var4, numValueOf);
                    vi3 vi3Var4 = C0352b.f4305h;
                    oha.m18000f(tj3Var3, vi3Var4);
                    zi3 zi3Var5 = C0352b.f4301d;
                    oha.m18001g(tj3Var3, zi3Var5, e16VarM1322c2);
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var3, 6);
                    int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m3 = tj3Var3.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e2);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var2);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var2, sj8VarM20003a);
                    oha.m18001g(tj3Var3, zi3Var3, l77VarM22132m3);
                    AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var4, tj3Var3, vi3Var4);
                    oha.m18001g(tj3Var3, zi3Var5, e16VarM1322c3);
                    boolean zM22120g2 = tj3Var3.m22120g(vi3Var2);
                    Object objM22097O5 = tj3Var3.m22097O();
                    if (zM22120g2 || objM22097O5 == p84Var) {
                        objM22097O5 = new x4a(vi3Var2, 5);
                        tj3Var3.m22131l0(objM22097O5);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var3, (ui3) objM22097O5, hrc.f42850a, null, null, null, false);
                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var3) | tj3Var3.m22120g(vi3Var2);
                    Object objM22097O6 = tj3Var3.m22097O();
                    if (zM22120g3 || objM22097O6 == p84Var) {
                        t66Var = t66Var2;
                        objM22097O6 = new zh3(vi3Var3, vi3Var2, t66Var, 2);
                        tj3Var3.m22131l0(objM22097O6);
                    } else {
                        t66Var = t66Var2;
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var3, (ui3) objM22097O6, hrc.f42851b, null, null, null, false);
                    tj3Var3.m22139q(true);
                    String strM23620a0 = vz1.m23620a0(tj3Var3, R$string.lingq_new_course);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM23620a0, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(vh9Var)).f51800b.f71404h, tj3Var3, 0, 0, 131070);
                    String str = (String) t66Var.getValue();
                    e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                    vx9 vx9Var = ((ms5) tj3Var3.m22128k(vh9Var)).f51800b.f71406j;
                    hj4 hj4Var = new hj4(1, 3, null, 115);
                    long j = aa1.f411j;
                    eu9 eu9VarM16905h = mkd.m16905h(0L, 0L, j, j, j, tj3Var3, 2147469311);
                    si8 si8Var = ((ms5) tj3Var3.m22128k(vh9Var)).f51801c.f64857c;
                    Object objM22097O7 = tj3Var3.m22097O();
                    if (objM22097O7 == p84Var) {
                        objM22097O7 = new tia(1, t66Var);
                        tj3Var3.m22131l0(objM22097O7);
                    }
                    q6d.m19686c(str, (vi3) objM22097O7, e16VarM4412e3, false, vx9Var, null, hrc.f42852c, null, null, null, false, null, hj4Var, null, true, 1, 0, si8Var, eu9VarM16905h, tj3Var3, 12583344, 113442816, 1671000);
                    tj3Var3.m22139q(true);
                } else {
                    tj3Var3.m22102U();
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                x9d.m24423f((e16) obj5, (UserImportSourceType) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 16:
                k7a k7aVar = (k7a) obj5;
                UserImportSourceType userImportSourceType = (UserImportSourceType) obj4;
                vi3 vi3Var5 = (vi3) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC0218a.m1125e(ci8.m4703P(286308727, new dl9(userImportSourceType, 10), tj3Var4), null, ci8.m4703P(2043935865, new ww8(vi3Var5, 7), tj3Var4), null, 0.0f, null, null, k7aVar, null, tj3Var4, 390, 378);
                } else {
                    tj3Var4.m22102U();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                AbstractC2105b.m9005c((e16) obj5, (ola) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 18:
                zza zzaVar = (zza) obj5;
                t66 t66Var3 = (t66) obj4;
                vi3 vi3Var6 = (vi3) obj3;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    String strM10275c = dbd.m10275c(zzaVar.f72434a, zzaVar.f72436c, true, tj3Var5);
                    Object objM22097O8 = tj3Var5.m22097O();
                    if (objM22097O8 == p84Var) {
                        objM22097O8 = new mya(0, t66Var3);
                        tj3Var5.m22131l0(objM22097O8);
                    }
                    e16 e16VarM4431x = c99.m4431x(AbstractC0080f.m815b(null, false, (ui3) objM22097O8, b16Var, 15));
                    zf1 zf1Var2 = ge9.f40637a;
                    lw9.m16554b(strM10275c, AbstractC3584sr.m21608U(e16VarM4431x, ((fe9) tj3Var5.m22128k(zf1Var2)).f38956e, ((fe9) tj3Var5.m22128k(zf1Var2)).f38952a), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var5, 0, 0, 131068);
                    boolean zBooleanValue = ((Boolean) t66Var3.getValue()).booleanValue();
                    Object objM22097O9 = tj3Var5.m22097O();
                    if (objM22097O9 == p84Var) {
                        objM22097O9 = new mya(1, t66Var3);
                        tj3Var5.m22131l0(objM22097O9);
                    }
                    AbstractC3003fj.m11885a(zBooleanValue, (ui3) objM22097O9, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(133264905, new a05((xi3) vi3Var6, (Object) zzaVar, (Object) t66Var3, 22), tj3Var5), tj3Var5, 48, 2044);
                } else {
                    tj3Var5.m22102U();
                }
                break;
            case 19:
                ((Integer) obj2).getClass();
                AbstractC2849a.m9757c((yza) obj5, (vi3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                AbstractC2849a.m9755a((l1b) obj4, (vi3) obj3, (e16) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                AbstractC2823a.m9736c((kya) obj5, (ui3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC2823a.m9738e((r0b) obj5, (ui3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(49));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ g39(t19 t19Var, e16 e16Var, ui3 ui3Var, int i) {
        this.f40131a = 3;
        this.f40134d = t19Var;
        this.f40132b = e16Var;
        this.f40133c = ui3Var;
    }

    public /* synthetic */ g39(Object obj, Object obj2, ui3 ui3Var, int i, int i2) {
        this.f40131a = i2;
        this.f40132b = obj;
        this.f40134d = obj2;
        this.f40133c = ui3Var;
    }

    public /* synthetic */ g39(Object obj, Object obj2, xi3 xi3Var, int i, int i2) {
        this.f40131a = i2;
        this.f40132b = obj;
        this.f40133c = obj2;
        this.f40134d = xi3Var;
    }

    public /* synthetic */ g39(Object obj, Object obj2, Object obj3, int i) {
        this.f40131a = i;
        this.f40132b = obj;
        this.f40133c = obj2;
        this.f40134d = obj3;
    }
}
