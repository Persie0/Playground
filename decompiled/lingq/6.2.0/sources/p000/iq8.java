package p000;

import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.animation.core.C0059a;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.material3.C0228e0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.achievements.StreakChallengeType;
import com.lingq.core.common.R$string;
import com.lingq.core.designsystem.R$color;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.imports.data.UserImportSourceType;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import p000.C0817bn;
import p000.d32;
import p000.dh9;
import p000.e16;
import p000.eo4;
import p000.gq6;
import p000.gv8;
import p000.p84;
import p000.tj3;
import p000.ui3;
import p000.we1;
import p000.xfa;
import p000.ye1;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iq8 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f44430b;

    public /* synthetic */ iq8(Object obj, int i) {
        this.f44429a = i;
        this.f44430b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:196:0x09f6  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        int i3 = this.f44429a;
        float f = 18.0f;
        p84 p84Var = we1.f66679a;
        int i4 = 3;
        int i5 = 2;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f44430b;
        switch (i3) {
            case 0:
                y19 y19Var = (y19) obj4;
                tj8 tj8Var = (tj8) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tj8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(tj8Var) ? 4 : 2;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e16 e16VarM4422o = c99.m4422o(b16Var, 30.0f);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52816k, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4422o);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    String str = y19Var.f69098b;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    if (vk9.m23391n0(str2)) {
                        tj3Var.m22111b0(1280972406);
                        bq1.m4042R(AbstractC3423or.m18236U(R$drawable.im_lingq_logo, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.app_name), AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(c99.m4411d(b16Var, 1.0f), ui8.f63972a), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55874r, ss5.f61356d), 4.0f), null, null, 0.0f, null, tj3Var, 8, 120);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1281404918);
                        ss5.m21702b(str2, null, pb1.m19045o(c99.m4411d(b16Var, 1.0f), ui8.f63972a), null, null, tj3Var, 48, 4088);
                        tj3Var.m22139q(false);
                    }
                    String str3 = y19Var.f69099c;
                    if (str3 == null) {
                        tj3Var.m22111b0(1281660543);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1281660544);
                        e16 e16VarM19528x = pvc.m19528x(c99.m4422o(b16Var, 20.0f), 5.0f, 5.0f);
                        int iHashCode2 = str3.hashCode();
                        if (iHashCode2 != -1307827859) {
                            if (iHashCode2 != 94630981) {
                                if (iHashCode2 == 812757528 && str3.equals("librarian")) {
                                    i = R$drawable.ic_profile_librarian;
                                } else {
                                    i = R$drawable.im_lingq_logo;
                                }
                            } else if (str3.equals("chief")) {
                                i = R$drawable.ic_profile_chief_librarian;
                            } else {
                                i = R$drawable.im_lingq_logo;
                            }
                        } else if (str3.equals("editor")) {
                            i = R$drawable.ic_profile_editor;
                        } else {
                            i = R$drawable.im_lingq_logo;
                        }
                        bq1.m4042R(AbstractC3423or.m18236U(i, tj3Var, 0), null, e16VarM19528x, null, null, 0.0f, null, tj3Var, 440, 120);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(true);
                    e16 e16VarMo12420a = tj8Var.mo12420a(1.0f, b16Var, true);
                    String strM23620a0 = y19Var.f69097a;
                    if (strM23620a0 == null) {
                        tj3Var.m22111b0(-648576233);
                        strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.search_all);
                    } else {
                        tj3Var.m22111b0(-648576760);
                    }
                    tj3Var.m22139q(false);
                    lw9.m16554b(strM23620a0, e16VarMo12420a, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, 0, 24576, 114684);
                    ty3.m22351a(n7d.m17276b(), null, null, 0L, tj3Var, 48, 12);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                LibraryTab libraryTab = (LibraryTab) obj4;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String str4 = libraryTab.f19501a;
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(str4, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71407k, 0L, 0L, libraryTab.f19504d ? bc3.f8324j : bc3.f8321g, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var2, 0, 0, 131066);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                C0228e0 c0228e0 = (C0228e0) obj4;
                jt5 jt5Var = (jt5) obj;
                l87 l87VarMo1514r = ((ct5) obj2).mo1514r(((bk1) obj3).f8631a);
                return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15364Q(new Pair(AbstractC0226d0.f3394f, Integer.valueOf(xj2.m24560b(Float.NaN, Float.NaN) ? c0228e0.f3412m == Orientation.Vertical ? l87VarMo1514r.f49301a / 2 : l87VarMo1514r.f49302b / 2 : jt5Var.mo916w0(Float.NaN)))), new a80(l87VarMo1514r, 3));
            case 3:
                la9.f49371a.m16046b((oq7) obj, null, (fa9) obj4, null, null, 0.0f, 0.0f, (ye1) obj2, (((Integer) obj3).intValue() & 14) | 100663296);
                return xfaVar;
            case 4:
                StreakChallengeType streakChallengeType = (StreakChallengeType) obj4;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var3.m22128k(ge9.f40637a)).f38952a, true, new C3487q7(nj0.f52792K, i4)), nj0.f52789H, tj3Var3, 48);
                    int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m2 = tj3Var3.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var2);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
                    int i6 = ij9.f44195a[streakChallengeType.ordinal()];
                    if (i6 != 1) {
                        if (i6 == 2) {
                            f = 20.0f;
                        } else if (i6 == 3) {
                            f = 24.0f;
                        } else {
                            if (i6 != 4) {
                                gm5.m12750e();
                                return null;
                            }
                            f = 28.0f;
                        }
                    }
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_fire_red, tj3Var3, 0), null, c99.m4422o(b16Var, f), null, null, 0.0f, new qd0(5, j8d.m14343a(tj3Var3, R$color.orange_activity_7)), tj3Var3, 56, 56);
                    String strM23618Z = vz1.m23618Z(com.lingq.core.achievements.R$string.streak_n_days, new Object[]{Integer.valueOf(streakChallengeType.getDays())}, tj3Var3);
                    vh9 vh9Var2 = ps5.f56764b;
                    lw9.m16554b(strM23618Z, null, ((ms5) tj3Var3.m22128k(vh9Var2)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(vh9Var2)).f51800b.f71409m, tj3Var3, 0, 0, 131066);
                    tj3Var3.m22139q(true);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 5:
                C0205f c0205f = (C0205f) obj4;
                e16 e16Var = (e16) obj;
                ((Integer) obj3).getClass();
                tj3 tj3Var4 = (tj3) ((ye1) obj2);
                tj3Var4.m22111b0(1980580247);
                fb2 fb2Var = (fb2) tj3Var4.m22128k(AbstractC0402n.f4816h);
                Object objM22097O = tj3Var4.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j(new n84(0L));
                    tj3Var4.m22131l0(objM22097O);
                }
                t66 t66Var = (t66) objM22097O;
                boolean zM22124i = tj3Var4.m22124i(c0205f);
                Object objM22097O2 = tj3Var4.m22097O();
                if (zM22124i || objM22097O2 == p84Var) {
                    objM22097O2 = new qk9(i5, c0205f, t66Var);
                    tj3Var4.m22131l0(objM22097O2);
                }
                final ui3 ui3Var3 = (ui3) objM22097O2;
                boolean zM22120g = tj3Var4.m22120g(fb2Var);
                Object objM22097O3 = tj3Var4.m22097O();
                if (zM22120g || objM22097O3 == p84Var) {
                    objM22097O3 = new no1(fb2Var, t66Var, i5);
                    tj3Var4.m22131l0(objM22097O3);
                }
                final vi3 vi3Var = (vi3) objM22097O3;
                C2970en c2970en = gv8.f41396a;
                e16 e16VarM1320a = AbstractC0287b.m1320a(e16Var, new aj3() { // from class: androidx.compose.foundation.text.selection.d
                    @Override // p000.aj3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        tj3 tj3Var5 = (tj3) ((ye1) obj6);
                        tj3Var5.m22111b0(759876635);
                        Object objM22097O4 = tj3Var5.m22097O();
                        p84 p84Var2 = we1.f66679a;
                        if (objM22097O4 == p84Var2) {
                            objM22097O4 = AbstractC0278f.m1254d(ui3Var3);
                            tj3Var5.m22131l0(objM22097O4);
                        }
                        dh9 dh9Var = (dh9) objM22097O4;
                        Object objM22097O5 = tj3Var5.m22097O();
                        if (objM22097O5 == p84Var2) {
                            objM22097O5 = new C0059a(new gq6(((gq6) dh9Var.getValue()).f41189a), gv8.f41397b, new gq6(gv8.f41398c), 8);
                            tj3Var5.m22131l0(objM22097O5);
                        }
                        C0059a c0059a = (C0059a) objM22097O5;
                        boolean zM22124i2 = tj3Var5.m22124i(c0059a);
                        Object objM22097O6 = tj3Var5.m22097O();
                        if (zM22124i2 || objM22097O6 == p84Var2) {
                            objM22097O6 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(dh9Var, c0059a, null);
                            tj3Var5.m22131l0(objM22097O6);
                        }
                        d32.m10047k(tj3Var5, (zi3) objM22097O6, xfa.f68157a);
                        C0817bn c0817bn = c0059a.f1540c;
                        boolean zM22120g2 = tj3Var5.m22120g(c0817bn);
                        Object objM22097O7 = tj3Var5.m22097O();
                        if (zM22120g2 || objM22097O7 == p84Var2) {
                            objM22097O7 = new eo4(c0817bn, 4);
                            tj3Var5.m22131l0(objM22097O7);
                        }
                        e16 e16Var2 = (e16) vi3Var.invoke((ui3) objM22097O7);
                        tj3Var5.m22139q(false);
                        return e16Var2;
                    }
                });
                tj3Var4.m22139q(false);
                return e16VarM1320a;
            case 6:
                final C0127b c0127b = (C0127b) obj4;
                e16 e16Var2 = (e16) obj;
                ((Integer) obj3).getClass();
                e16Var2.getClass();
                tj3 tj3Var5 = (tj3) ((ye1) obj2);
                tj3Var5.m22111b0(1952057962);
                final long j = ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51799a.f55822G;
                final float f2 = ((fe9) tj3Var5.m22128k(ge9.f40637a)).f38956e;
                e16 e16VarM1407b = AbstractC0309d.m1407b(e16Var2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 983039);
                boolean zM22120g2 = tj3Var5.m22120g(c0127b) | tj3Var5.m22114d(f2) | tj3Var5.m22118f(j);
                Object objM22097O4 = tj3Var5.m22097O();
                if (zM22120g2 || objM22097O4 == p84Var) {
                    objM22097O4 = new vi3() { // from class: bz9
                        @Override // p000.vi3
                        public final Object invoke(Object obj5) {
                            C0358h c0358h;
                            long j2;
                            C0358h c0358h2 = (C0358h) obj5;
                            c0358h2.getClass();
                            an0 an0Var = c0358h2.f4358a;
                            c0358h2.m1614b();
                            C0127b c0127b2 = c0127b;
                            boolean zMo974b = c0127b2.mo974b();
                            boolean zMo975d = c0127b2.mo975d();
                            float fMo912g0 = c0358h2.mo912g0(f2);
                            long j3 = j;
                            if (zMo974b) {
                                c0358h = c0358h2;
                                j2 = j3;
                                InterfaceC0310a.m1418s0(c0358h, ui0.m22745a(vi0.Companion, vz1.m23605K(new aa1(j3), new aa1(aa1.f411j)), 0.0f, fMo912g0, 8), 0L, 0L, 0.0f, null, null, 8, 62);
                            } else {
                                c0358h = c0358h2;
                                j2 = j3;
                            }
                            if (zMo975d) {
                                InterfaceC0310a.m1418s0(c0358h, ui0.m22745a(vi0.Companion, vz1.m23605K(new aa1(aa1.f411j), new aa1(j2)), Float.intBitsToFloat((int) (an0Var.mo1422h() >> 32)) - fMo912g0, Float.intBitsToFloat((int) (an0Var.mo1422h() >> 32)), 8), 0L, 0L, 0.0f, null, null, 8, 62);
                            }
                            return xfa.f68157a;
                        }
                    };
                    tj3Var5.m22131l0(objM22097O4);
                }
                e16 e16VarM23656z = vz1.m23656z(e16VarM1407b, (vi3) objM22097O4);
                tj3Var5.m22139q(false);
                return e16VarM23656z;
            case 7:
                C3419on c3419on = (C3419on) obj4;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var6 = (tj3) ye1Var4;
                if (tj3Var6.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    vh9 vh9Var3 = ps5.f56764b;
                    lw9.m16555c(c3419on, AbstractC3584sr.m21611X(c99.m4428u(b16Var, 0.0f, 600.0f, 1), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var6.m22128k(ge9.f40637a)).f38957f, 7), ((ms5) tj3Var6.m22128k(vh9Var3)).f51799a.f55873q, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, vx9.m23584b(((ms5) tj3Var6.m22128k(vh9Var3)).f51800b.f71402f, 0L, 0L, bc3.f8324j, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var6, 0, 0, 261112);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 8:
                UserImportSourceType userImportSourceType = (UserImportSourceType) obj4;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var5;
                if (tj3Var7.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var7.m22128k(ge9.f40637a)).f38952a, false, new gm5(29)), nj0.f52792K, tj3Var7, 48);
                    int iHashCode4 = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m3 = tj3Var7.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var7, e16VarM4411d);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var4);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    oha.m18001g(tj3Var7, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var7, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var7, C0352b.f4304g, Integer.valueOf(iHashCode4));
                    oha.m18000f(tj3Var7, C0352b.f4305h);
                    oha.m18001g(tj3Var7, C0352b.f4301d, e16VarM1322c3);
                    e16 e16VarM4422o2 = c99.m4422o(b16Var, 60.0f);
                    userImportSourceType.getClass();
                    int i7 = lka.f49781a[userImportSourceType.ordinal()];
                    if (i7 == 1) {
                        i2 = com.lingq.feature.imports.R$drawable.ic_import_url;
                    } else if (i7 == 2) {
                        i2 = com.lingq.feature.imports.R$drawable.ic_import_scan;
                    } else if (i7 == 3) {
                        i2 = com.lingq.feature.imports.R$drawable.ic_import_text;
                    } else {
                        if (i7 != 4) {
                            gm5.m12750e();
                            return null;
                        }
                        i2 = com.lingq.feature.imports.R$drawable.ic_import_file;
                    }
                    bq1.m4042R(AbstractC3423or.m18236U(i2, tj3Var7, 0), null, e16VarM4422o2, null, null, 0.0f, null, tj3Var7, 440, 120);
                    lw9.m16554b(vz1.m23620a0(tj3Var7, z9d.m25518g(userImportSourceType)), c99.m4412e(b16Var, 1.0f), ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51799a.f55858i, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, null, tj3Var7, 48, 0, 261112);
                    tj3Var7.m22139q(true);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 9:
                g24 g24Var = (g24) obj4;
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var6;
                if (tj3Var8.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    e24 e24Var = (e24) g24Var;
                    if (e24Var.f36614a.f44244h == null) {
                        tj3Var8.m22111b0(-1658365941);
                        lw9.m16554b(vz1.m23620a0(tj3Var8, com.lingq.feature.imports.R$string.import_choose_file), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var8, 0, 0, 262142);
                        tj3Var8.m22139q(false);
                    } else {
                        tj3Var8.m22111b0(-1658191721);
                        sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(((fe9) tj3Var8.m22128k(ge9.f40637a)).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var8, 48);
                        int iHashCode5 = Long.hashCode(tj3Var8.f62385T);
                        l77 l77VarM22132m4 = tj3Var8.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var8, b16Var);
                        se1.f60731q.getClass();
                        ui3 ui3Var5 = C0352b.f4299b;
                        tj3Var8.m22119f0();
                        if (tj3Var8.f62384S) {
                            tj3Var8.m22130l(ui3Var5);
                        } else {
                            tj3Var8.m22137o0();
                        }
                        oha.m18001g(tj3Var8, C0352b.f4303f, sj8VarM20003a2);
                        oha.m18001g(tj3Var8, C0352b.f4302e, l77VarM22132m4);
                        oha.m18001g(tj3Var8, C0352b.f4304g, Integer.valueOf(iHashCode5));
                        oha.m18000f(tj3Var8, C0352b.f4305h);
                        oha.m18001g(tj3Var8, C0352b.f4301d, e16VarM1322c4);
                        p04 p04VarM17721b = v9d.f65086a;
                        if (p04VarM17721b == null) {
                            o04 o04Var = new o04("Rounded.UploadFile", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i8 = soa.f61116a;
                            pd9 pd9Var = new pd9(aa1.f403b);
                            f57 f57Var = new f57();
                            f57Var.m11553h(19.41f, 7.41f);
                            f57Var.m11552g(-4.83f, -4.83f);
                            f57Var.m11547b(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f);
                            f57Var.m11549d(6.0f);
                            f57Var.m11547b(4.9f, 2.0f, 4.01f, 2.9f, 4.01f, 4.0f);
                            f57Var.m11551f(4.0f, 20.0f);
                            f57Var.m11548c(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
                            f57Var.m11549d(18.0f);
                            f57Var.m11548c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            f57Var.m11556k(8.83f);
                            f57Var.m11547b(20.0f, 8.3f, 19.79f, 7.79f, 19.41f, 7.41f);
                            f57Var.m11546a();
                            f57Var.m11553h(14.8f, 15.0f);
                            f57Var.m11549d(13.0f);
                            f57Var.m11557l(3.0f);
                            f57Var.m11548c(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                            f57Var.m11555j(-1.0f, -0.45f, -1.0f, -1.0f);
                            f57Var.m11557l(-3.0f);
                            f57Var.m11549d(9.21f);
                            f57Var.m11548c(-0.45f, 0.0f, -0.67f, -0.54f, -0.35f, -0.85f);
                            f57Var.m11552g(2.8f, -2.79f);
                            f57Var.m11548c(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.0f);
                            f57Var.m11552g(2.79f, 2.79f);
                            f57Var.m11547b(15.46f, 14.46f, 15.24f, 15.0f, 14.8f, 15.0f);
                            f57Var.m11546a();
                            f57Var.m11553h(14.0f, 9.0f);
                            f57Var.m11548c(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                            f57Var.m11556k(3.5f);
                            f57Var.m11551f(18.5f, 9.0f);
                            f57Var.m11549d(14.0f);
                            f57Var.m11546a();
                            o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
                            p04VarM17721b = o04Var.m17721b();
                            v9d.f65086a = p04VarM17721b;
                        }
                        ty3.m22351a(p04VarM17721b, vz1.m23620a0(tj3Var8, com.lingq.core.p012ui.R$string.ui_upload), null, 0L, tj3Var8, 0, 12);
                        String strM23620a1 = e24Var.f36614a.f44244h;
                        if (strM23620a1 == null) {
                            tj3Var8.m22111b0(1216263826);
                            strM23620a1 = vz1.m23620a0(tj3Var8, com.lingq.feature.imports.R$string.import_choose_file);
                        } else {
                            tj3Var8.m22111b0(1216260943);
                        }
                        tj3Var8.m22139q(false);
                        lw9.m16554b(strM23620a1, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var8, 0, 0, 262142);
                        tj3Var8.m22139q(true);
                        tj3Var8.m22139q(false);
                    }
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 10:
                ArrayList<String> arrayList = (ArrayList) obj4;
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((g93) obj).getClass();
                tj3 tj3Var9 = (tj3) ye1Var7;
                if (tj3Var9.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    for (String str5 : arrayList) {
                        vh9 vh9Var4 = ps5.f56764b;
                        vx9 vx9Var = ((ms5) tj3Var9.m22128k(vh9Var4)).f51800b.f71411o;
                        e16 e16VarM10007D = d32.m10007D(b16Var, ((ms5) tj3Var9.m22128k(vh9Var4)).f51799a.f55874r, ((ms5) tj3Var9.m22128k(vh9Var4)).f51801c.f64856b);
                        zf1 zf1Var = ge9.f40637a;
                        lw9.m16554b(str5, AbstractC3584sr.m21608U(e16VarM10007D, ((fe9) tj3Var9.m22128k(zf1Var)).f38952a, ((fe9) tj3Var9.m22128k(zf1Var)).f38955d), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var9, 0, 0, 131068);
                    }
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 11:
                vxa vxaVar = (vxa) obj4;
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var10 = (tj3) ye1Var8;
                if (tj3Var10.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    fbd.m11752b(vxaVar, tj3Var10, 0);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            default:
                sc9 sc9Var = (sc9) obj4;
                ((Integer) obj3).getClass();
                ((InterfaceC0067f) obj).getClass();
                tj3 tj3Var11 = (tj3) ((ye1) obj2);
                long j2 = ((aa1) ((xc9) ((bx2) tj3Var11.m22128k(cx2.f34676a)).f9120h).getValue()).f414a;
                e16 e16VarM4414g = c99.m4414g(b16Var, 8.0f);
                Object objM22097O5 = tj3Var11.m22097O();
                if (objM22097O5 == p84Var) {
                    objM22097O5 = new br8(sc9Var, 22);
                    tj3Var11.m22131l0(objM22097O5);
                }
                dn7.m10494c((ui3) objM22097O5, e16VarM4414g, j2, 0L, 0, 2.0f, null, tj3Var11, 196662, 88);
                return xfaVar;
        }
    }
}
