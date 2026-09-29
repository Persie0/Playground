package p000;

import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.glance.appwidget.lazy.AbstractC0665a;
import androidx.lifecycle.Lifecycle$Event;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.challenge.ChallengeRanking;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.feature.challenges.cup.AbstractC1976c;
import com.lingq.feature.challenges.cup.data.CupPhase;
import com.lingq.feature.dictionary.AbstractC2059d;
import com.lingq.feature.language.AbstractC2119a;
import com.lingq.feature.language.C2120b;
import com.lingq.feature.lessoninfo.AbstractC2131b;
import com.lingq.feature.notifications.AbstractC2167a;
import com.lingq.feature.search.fastsearch.AbstractC2767a;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: zk */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3836zk implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71664a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f71665b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f71666c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f71667d;

    public /* synthetic */ C3836zk(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f71664a = i2;
        this.f71665b = obj;
        this.f71666c = obj2;
        this.f71667d = obj3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i = this.f71664a;
        p84 p84Var = we1.f66679a;
        int i2 = 14;
        int i3 = 6;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        int i4 = 1;
        Object obj4 = this.f71665b;
        Object obj5 = this.f71667d;
        Object obj6 = this.f71666c;
        switch (i) {
            case 0:
                e16 e16Var = (e16) obj4;
                t66 t66Var = (t66) obj6;
                C0282a c0282a = (C0282a) obj5;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    Object objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = new C0023al(false ? 1 : 0, t66Var);
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM24741N = xwc.m24741N(e16Var, (vi3) objM22097O);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, true);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM24741N);
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
                    wq1.m24128x(0, c0282a, tj3Var, true);
                }
                break;
            case 1:
                yx4 yx4Var = (yx4) obj4;
                ui3 ui3Var2 = (ui3) obj6;
                ui3 ui3Var3 = (ui3) obj5;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    bq1.m4039O(AbstractC3423or.m18285y(c99.m4412e(b16Var, 1.0f), IntrinsicSize.Min), ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64858d, null, null, null, ci8.m4703P(-1259444543, new ik0((Object) yx4Var, (Object) ui3Var2, (Object) ui3Var3, false ? 1 : 0), tj3Var2), tj3Var2, 196614, 28);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                q5d.m19668b((e16) obj4, (ChallengeRanking) obj6, (ChallengeType) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                t5d.m21852a((Challenge) obj4, (vi3) obj6, (ui3) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                c7d.m4397b((tx0) obj4, (t17) obj6, (jv0) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                q91 q91Var = (q91) obj4;
                vi3 vi3Var = (vi3) obj6;
                vi3 vi3Var2 = (vi3) obj5;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    AbstractC0218a.m1125e(ci8.m4703P(1612587118, new C3368nd(q91Var, 12), tj3Var3), null, ci8.m4703P(796539888, new dq0(vi3Var, i2), tj3Var3), ci8.m4703P(-2102604967, new qe0(vi3Var2, i3), tj3Var3), 0.0f, null, null, null, null, tj3Var3, 3462, 498);
                }
                break;
            case 6:
                ps2 ps2Var = (ps2) obj4;
                String str = (String) obj6;
                ui3 ui3Var4 = (ui3) obj5;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    C0282a c0282aM4703P = ci8.m4703P(-1231767244, new C3441oz(str, 5), tj3Var4);
                    C0282a c0282aM4703P2 = ci8.m4703P(-683227022, new C0839c9(3, ui3Var4), tj3Var4);
                    x17 x17Var = h7a.f41916a;
                    vh9 vh9Var = ps5.f56764b;
                    AbstractC0218a.m1125e(c0282aM4703P, null, c0282aM4703P2, null, 0.0f, null, h7a.m13120g(aa1.m198b(0.5f, ((ms5) tj3Var4.m22128k(vh9Var)).f51799a.f55872p), aa1.m198b(0.5f, ((ms5) tj3Var4.m22128k(vh9Var)).f51799a.f55872p), ((ms5) tj3Var4.m22128k(vh9Var)).f51799a.f55873q, ((ms5) tj3Var4.m22128k(vh9Var)).f51799a.f55873q, tj3Var4, 48), ps2Var, null, tj3Var4, 390, 314);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                wt1.m24152a((ws1) obj6, (ui3) obj5, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                rv1.m20865j((String) obj6, (C3419on) obj5, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                rv1.m20857b((zt1) obj6, (CupPhase) obj5, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                rv1.m20864i(pk9.m19383z(1), (ye1) obj, (ui3) obj5, (e16) obj4, (List) obj6);
                break;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC1976c.m8837t((tw1) obj6, (vi3) obj5, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC2059d.m8972h((String) obj4, (zf2) obj6, (vi3) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC2767a.m9678b((a13) obj4, (vi3) obj6, (vi3) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            case 14:
                ui3 ui3Var5 = (ui3) obj4;
                ui3 ui3Var6 = (ui3) obj6;
                ui3 ui3Var7 = (ui3) obj5;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    mn0 mn0VarM21999m = te1.m21999m(6, 14, aa1.f406e, 0L, tj3Var5);
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    r46.m20381f(AbstractC3584sr.m21608U(e16VarM4412e, ((fe9) tj3Var5.m22128k(zf1Var)).f38960i, ((fe9) tj3Var5.m22128k(zf1Var)).f38956e), null, null, mn0VarM21999m, ci8.m4703P(27705291, new vh3(ui3Var5, ui3Var6, ui3Var7, i4), tj3Var5), tj3Var5, 24576, 6);
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                vhd.m23289a((jm4) obj4, (ui3) obj6, (vi3) obj5, (ye1) obj, pk9.m19383z(49));
                break;
            case 16:
                ((Integer) obj2).getClass();
                AbstractC2119a.m9038c((C2120b) obj4, (ui3) obj6, (ui3) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            case 17:
                lp4 lp4Var = (lp4) obj4;
                fe9 fe9Var = (fe9) obj6;
                ui3 ui3Var8 = (ui3) obj5;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else if (lp4Var.f49977b.length() <= 0) {
                    tj3Var6.m22111b0(-1600064000);
                    tj3Var6.m22139q(false);
                } else {
                    tj3Var6.m22111b0(-1600793399);
                    e16 e16VarM15962y = l70.m15962y(b16Var);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var6, 0);
                    int iHashCode2 = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m2 = tj3Var6.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var6, e16VarM15962y);
                    se1.f60731q.getClass();
                    ui3 ui3Var9 = C0352b.f4299b;
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var9);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    oha.m18001g(tj3Var6, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var6, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var6, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var6, C0352b.f4305h);
                    oha.m18001g(tj3Var6, C0352b.f4301d, e16VarM1322c2);
                    ss5.m21710f(AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), fe9Var.f38960i, 0.0f, 2), 0.0f, fe9Var.f38960i, 1), null, null, true, ui3Var8, rsb.f59770b, tj3Var6, 199680, 6);
                    WeakHashMap weakHashMap = l6b.f49204w;
                    thb.m22044c(tj3Var6, pvc.m19502J(ho5.m13397r(tj3Var6).f49209e));
                    tj3Var6.m22139q(true);
                    tj3Var6.m22139q(false);
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                AbstractC0665a.m2258c((xp3) obj4, (on3) obj6, (vi3) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            case 19:
                jl6 jl6Var = (jl6) obj4;
                dh9 dh9Var = (dh9) obj6;
                cy4 cy4Var = (cy4) obj5;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else if (!(jl6Var instanceof il6)) {
                    tj3Var7.m22111b0(-504930184);
                    e16 e16VarM22066y = thb.m22066y(c99.m4412e(b16Var, 1.0f));
                    zf1 zf1Var2 = ge9.f40637a;
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM22066y, ((fe9) tj3Var7.m22128k(zf1Var2)).f38960i, 0.0f, ((fe9) tj3Var7.m22128k(zf1Var2)).f38960i, ((fe9) tj3Var7.m22128k(zf1Var2)).f38960i, 2);
                    boolean zM22124i = tj3Var7.m22124i(cy4Var);
                    Object objM22097O2 = tj3Var7.m22097O();
                    if (zM22124i || objM22097O2 == p84Var) {
                        obj3 = objM22097O2;
                        hz4 hz4Var = new hz4(cy4Var, 1);
                        tj3Var7.m22131l0(hz4Var);
                        obj3 = hz4Var;
                    }
                    ss5.m21710f(e16VarM21611X, null, null, false, (ui3) obj3, dtb.f36224d, tj3Var7, 196608, 14);
                    tj3Var7.m22139q(false);
                } else {
                    il6 il6Var = (il6) jl6Var;
                    tj3Var7.m22111b0(-505593336);
                    dh9 dh9VarM750b = AbstractC0060b.m750b(((Boolean) dh9Var.getValue()).booleanValue() ? 0.0f : 1.0f, ss5.m21703b0(300, 0, null, 6), "bottomBarAlpha", null, tj3Var7, 3120, 20);
                    boolean zM22120g = tj3Var7.m22120g(dh9VarM750b);
                    Object objM22097O3 = tj3Var7.m22097O();
                    Object obj7 = objM22097O3;
                    if (zM22120g || objM22097O3 == p84Var) {
                        iy0 iy0Var = new iy0(dh9VarM750b, 1);
                        tj3Var7.m22131l0(iy0Var);
                        obj7 = iy0Var;
                    }
                    e16 e16VarM1406a = AbstractC0309d.m1406a(b16Var, (vi3) obj7);
                    ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode3 = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m3 = tj3Var7.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var7, e16VarM1406a);
                    se1.f60731q.getClass();
                    ui3 ui3Var10 = C0352b.f4299b;
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var10);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    oha.m18001g(tj3Var7, C0352b.f4303f, ht5VarM19966d2);
                    oha.m18001g(tj3Var7, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var7, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var7, C0352b.f4305h);
                    oha.m18001g(tj3Var7, C0352b.f4301d, e16VarM1322c3);
                    el6 el6Var = il6Var.f44261a;
                    boolean zM22124i2 = tj3Var7.m22124i(cy4Var);
                    Object objM22097O4 = tj3Var7.m22097O();
                    Object obj8 = objM22097O4;
                    if (zM22124i2 || objM22097O4 == p84Var) {
                        C3577sk c3577sk = new C3577sk(29, dh9Var, cy4Var);
                        tj3Var7.m22131l0(c3577sk);
                        obj8 = c3577sk;
                    }
                    fsb.m12120a(null, el6Var, (ui3) obj8, tj3Var7, 0);
                    tj3Var7.m22139q(true);
                    tj3Var7.m22139q(false);
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                AbstractC2131b.m9046e((s35) obj4, (a35) obj6, (ui3) obj5, (ye1) obj, pk9.m19383z(49));
                break;
            case 21:
                ((Integer) obj2).getClass();
                yjd.m25162a((x95) obj6, (ui3) obj5, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                AbstractC3352my.m17108a((Lifecycle$Event) obj4, (ub5) obj6, (ui3) obj5, (ye1) obj, pk9.m19383z(7));
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                zi3 zi3Var = (zi3) obj4;
                zi3 zi3Var2 = (zi3) obj6;
                zi3 zi3Var3 = (zi3) obj5;
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tj3Var8.m22102U();
                } else {
                    if (1.0f <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    e16 e16VarM21611X2 = AbstractC3584sr.m21611X(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), zi3Var != null ? 12.0f : 0.0f, 0.0f, zi3Var2 != null ? 12.0f : 0.0f, 0.0f, 10);
                    ht5 ht5VarM19966d3 = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode4 = Long.hashCode(tj3Var8.f62385T);
                    l77 l77VarM22132m4 = tj3Var8.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var8, e16VarM21611X2);
                    se1.f60731q.getClass();
                    ui3 ui3Var11 = C0352b.f4299b;
                    tj3Var8.m22119f0();
                    if (tj3Var8.f62384S) {
                        tj3Var8.m22130l(ui3Var11);
                    } else {
                        tj3Var8.m22137o0();
                    }
                    oha.m18001g(tj3Var8, C0352b.f4303f, ht5VarM19966d3);
                    oha.m18001g(tj3Var8, C0352b.f4302e, l77VarM22132m4);
                    oha.m18001g(tj3Var8, C0352b.f4304g, Integer.valueOf(iHashCode4));
                    oha.m18000f(tj3Var8, C0352b.f4305h);
                    oha.m18001g(tj3Var8, C0352b.f4301d, e16VarM1322c4);
                    zi3Var3.invoke(tj3Var8, 0);
                    tj3Var8.m22139q(true);
                }
                break;
            case 24:
                e16 e16Var2 = (e16) obj4;
                yn8 yn8Var = (yn8) obj6;
                C0282a c0282a2 = (C0282a) obj5;
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tj3Var9.m22102U();
                } else {
                    e16 e16VarM3912B0 = bna.m3912B0(AbstractC3423or.m18279s0(AbstractC3584sr.m21609V(e16Var2, 0.0f, tw5.f63010a, 1), IntrinsicSize.Max), yn8Var, false, 14);
                    bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var9, 0);
                    int iHashCode5 = Long.hashCode(tj3Var9.f62385T);
                    l77 l77VarM22132m5 = tj3Var9.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var9, e16VarM3912B0);
                    se1.f60731q.getClass();
                    ui3 ui3Var12 = C0352b.f4299b;
                    tj3Var9.m22119f0();
                    if (tj3Var9.f62384S) {
                        tj3Var9.m22130l(ui3Var12);
                    } else {
                        tj3Var9.m22137o0();
                    }
                    oha.m18001g(tj3Var9, C0352b.f4303f, bb1VarM230a2);
                    oha.m18001g(tj3Var9, C0352b.f4302e, l77VarM22132m5);
                    oha.m18001g(tj3Var9, C0352b.f4304g, Integer.valueOf(iHashCode5));
                    oha.m18000f(tj3Var9, C0352b.f4305h);
                    oha.m18001g(tj3Var9, C0352b.f4301d, e16VarM1322c5);
                    c0282a2.invoke(db1.f35347a, tj3Var9, 6);
                    tj3Var9.m22139q(true);
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                fsb.m12120a((e16) obj4, (el6) obj6, (ui3) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                gsb.m12858a((e16) obj4, (fl6) obj6, (ui3) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((Integer) obj2).getClass();
                AbstractC2167a.m9097a((e16) obj4, (om6) obj6, (vi3) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                AbstractC2167a.m9100d((fo6) obj4, (vi3) obj6, (vi3) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wsb.m24146a((gn6) obj6, (ui3) obj5, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3836zk(Object obj, Object obj2, e16 e16Var, int i, int i2) {
        this.f71664a = i2;
        this.f71666c = obj;
        this.f71667d = obj2;
        this.f71665b = e16Var;
    }

    public /* synthetic */ C3836zk(Object obj, Object obj2, Object obj3, int i) {
        this.f71664a = i;
        this.f71665b = obj;
        this.f71666c = obj2;
        this.f71667d = obj3;
    }
}
