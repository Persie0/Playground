package p000;

import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.material3.C0228e0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.draw.C0296c;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.challenges.R$string;
import com.lingq.feature.challenges.cup.AbstractC1976c;

/* JADX INFO: renamed from: kk */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3187kk implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47445a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f47446b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f47447c;

    public /* synthetic */ C3187kk(ui3 ui3Var, boolean z) {
        this.f47445a = 0;
        this.f47447c = ui3Var;
        this.f47446b = z;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        bc3 bc3Var;
        int i = this.f47445a;
        p84 p84Var = we1.f66679a;
        b16 b16Var = b16.f7762a;
        final boolean z = this.f47446b;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f47447c;
        switch (i) {
            case 0:
                final ui3 ui3Var = (ui3) obj4;
                e16 e16Var = (e16) obj;
                ((Integer) obj3).getClass();
                tj3 tj3Var = (tj3) ((ye1) obj2);
                tj3Var.m22111b0(-196777734);
                final long j2 = ((mx9) tj3Var.m22128k(nx9.f53367a)).f52001a;
                boolean zM22118f = tj3Var.m22118f(j2) | tj3Var.m22120g(ui3Var) | tj3Var.m22122h(z);
                Object objM22097O = tj3Var.m22097O();
                if (zM22118f || objM22097O == p84Var) {
                    objM22097O = new vi3() { // from class: lk
                        @Override // p000.vi3
                        public final Object invoke(Object obj5) {
                            C0296c c0296c = (C0296c) obj5;
                            return c0296c.m1349c(new C2967ek(0, ui3Var, bq1.m4053c0(c0296c, Float.intBitsToFloat((int) (c0296c.f3864a.mo1347h() >> 32)) / 2.0f), new qd0(5, j2), z));
                        }
                    };
                    tj3Var.m22131l0(objM22097O);
                }
                e16 e16VarM23655y = vz1.m23655y(e16Var, (vi3) objM22097O);
                tj3Var.m22139q(false);
                return e16VarM23655y;
            case 1:
                vi3 vi3Var = (vi3) obj4;
                ei0 ei0Var = (ei0) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ei0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(ei0Var) ? 4 : 2;
                }
                tj3 tj3Var2 = (tj3) ye1Var;
                if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    float fM11159b = ei0Var.m11159b() / 2.0f;
                    boolean z2 = this.f47446b;
                    dh9 dh9VarM749a = AbstractC0060b.m749a(z2 ? fM11159b : 0.0f, ss5.m21698Y(0.75f, 200.0f, null, 4), "cupTabSelectorOffset", tj3Var2, 432, 8);
                    e16 e16VarM4674b = ci0.f10109a.m4674b(b16Var);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4674b);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                    vi3 vi3Var2 = C0352b.f4305h;
                    oha.m18000f(tj3Var2, vi3Var2);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                    e16 e16VarM4410c = c99.m4410c(c99.m4426s(pvc.m19529y(b16Var, ((xj2) dh9VarM749a.getValue()).f68285a, 0.0f, 2), fM11159b), 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    qh0.m19963a(d32.m10007D(vz1.m23616X(e16VarM4410c, ((fe9) tj3Var2.m22128k(zf1Var)).f38954c, ui8.m22753b(((fe9) tj3Var2.m22128k(zf1Var)).f38952a), 0L, 0L, 28), ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55872p, ui8.m22753b(((fe9) tj3Var2.m22128k(zf1Var)).f38952a)), tj3Var2, 0);
                    tj3Var2.m22139q(true);
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var2, 0);
                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var2);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                    String strM23620a0 = vz1.m23620a0(tj3Var2, R$string.cup_tab_teams);
                    boolean z3 = !z2;
                    boolean zM22120g = tj3Var2.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g || objM22097O2 == p84Var) {
                        objM22097O2 = new nw1(vi3Var, 0);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    ui3 ui3Var3 = (ui3) objM22097O2;
                    if (1.0f <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    AbstractC1976c.m8836s(0, tj3Var2, ui3Var3, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), strM23620a0, z3);
                    String strM23620a1 = vz1.m23620a0(tj3Var2, R$string.cup_tab_users);
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O3 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O3 == p84Var) {
                        objM22097O3 = new nw1(vi3Var, 1);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    ui3 ui3Var4 = (ui3) objM22097O3;
                    if (1.0f <= 0.0d) {
                        g54.m12362a("invalid weight; must be greater than zero");
                    }
                    AbstractC1976c.m8836s(0, tj3Var2, ui3Var4, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), strM23620a1, z2);
                    tj3Var2.m22139q(true);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                t66 t66Var = (t66) obj4;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var2;
                if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var3.m22102U();
                } else if (((Boolean) t66Var.getValue()).booleanValue()) {
                    tj3Var3.m22111b0(-753614284);
                    ((fe9) tj3Var3.m22128k(ge9.f40637a)).getClass();
                    do7.m10527c(null, 0L, 24.0f, 0.0f, tj3Var3, 0, 11);
                    tj3Var3.m22139q(false);
                } else {
                    tj3Var3.m22111b0(-753504668);
                    lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.core.p012ui.R$string.ui_delete), null, aa1.m198b(z ? 1.0f : 0.4f, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51799a.f55879w), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262138);
                    tj3Var3.m22139q(false);
                }
                return xfaVar;
            case 3:
                la9.f49371a.m16047c((C0228e0) obj, null, this.f47446b, (fa9) obj4, null, null, 0.0f, 0.0f, (ye1) obj2, (((Integer) obj3).intValue() & 14) | 100663296);
                return xfaVar;
            default:
                aia aiaVar = (aia) obj4;
                String str = aiaVar.f704d;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var3;
                if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var4.m22102U();
                    return xfaVar;
                }
                e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var4).f38957f);
                C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var4).f38952a, true, new gm5(28));
                ec0 ec0Var = nj0.f52791J;
                bb1 bb1VarM230a = ab1.m230a(c3661uu, ec0Var, tj3Var4, 0);
                int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                l77 l77VarM22132m3 = tj3Var4.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM21607T);
                se1.f60731q.getClass();
                ui3 ui3Var5 = C0352b.f4299b;
                tj3Var4.m22119f0();
                if (tj3Var4.f62384S) {
                    tj3Var4.m22130l(ui3Var5);
                } else {
                    tj3Var4.m22137o0();
                }
                zi3 zi3Var5 = C0352b.f4303f;
                oha.m18001g(tj3Var4, zi3Var5, bb1VarM230a);
                zi3 zi3Var6 = C0352b.f4302e;
                oha.m18001g(tj3Var4, zi3Var6, l77VarM22132m3);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                zi3 zi3Var7 = C0352b.f4304g;
                oha.m18001g(tj3Var4, zi3Var7, numValueOf2);
                vi3 vi3Var3 = C0352b.f4305h;
                oha.m18000f(tj3Var4, vi3Var3);
                zi3 zi3Var8 = C0352b.f4301d;
                oha.m18001g(tj3Var4, zi3Var8, e16VarM1322c3);
                e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                fc0 fc0Var = nj0.f52789H;
                jj5 jj5Var = eh0.f37242h;
                sj8 sj8VarM20003a2 = qj8.m20003a(jj5Var, fc0Var, tj3Var4, 54);
                int iHashCode4 = Long.hashCode(tj3Var4.f62385T);
                l77 l77VarM22132m4 = tj3Var4.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var4, e16VarM4412e2);
                tj3Var4.m22119f0();
                if (tj3Var4.f62384S) {
                    tj3Var4.m22130l(ui3Var5);
                } else {
                    tj3Var4.m22137o0();
                }
                oha.m18001g(tj3Var4, zi3Var5, sj8VarM20003a2);
                oha.m18001g(tj3Var4, zi3Var6, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var4, zi3Var7, tj3Var4, vi3Var3);
                oha.m18001g(tj3Var4, zi3Var8, e16VarM1322c4);
                String strM23620a2 = vz1.m23620a0(tj3Var4, z ? com.lingq.core.premium.R$string.upgrade_plus : com.lingq.core.p012ui.R$string.upgrade_premium);
                vx9 vx9Var = p58.m18902j(tj3Var4).f71404h;
                bc3 bc3Var2 = bc3.f8324j;
                vx9 vx9VarM23584b = vx9.m23584b(vx9Var, 0L, 0L, bc3Var2, null, null, 0L, null, null, 0, 0L, null, 16777211);
                if (z) {
                    tj3Var4.m22111b0(327423216);
                    j = p58.m18900f(tj3Var4).f55842a;
                    tj3Var4.m22139q(false);
                } else {
                    tj3Var4.m22111b0(327509582);
                    j = p58.m18900f(tj3Var4).f55873q;
                    tj3Var4.m22139q(false);
                }
                lw9.m16554b(strM23620a2, null, j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9VarM23584b, tj3Var4, 0, 0, 131066);
                tj3 tj3Var5 = tj3Var4;
                if (z) {
                    tj3Var5.m22111b0(327678718);
                    bc3Var = bc3Var2;
                    lw9.m16554b(vz1.m23620a0(tj3Var5, com.lingq.core.premium.R$string.upgrade_best_value), AbstractC3584sr.m21608U(d32.m10007D(pb1.m19045o(b16Var, ui8.m22753b(4.0f)), p58.m18900f(tj3Var5).f55842a, ss5.f61356d), ge9.m12515a(tj3Var5).f38952a, ge9.m12515a(tj3Var5).f38954c), p58.m18900f(tj3Var5).f55844b, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var5).f71411o, 0L, 0L, bc3Var2, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var5, 0, 0, 131064);
                    tj3Var5 = tj3Var5;
                    tj3Var5.m22139q(false);
                } else {
                    bc3Var = bc3Var2;
                    tj3Var5.m22111b0(328345249);
                    tj3Var5.m22139q(false);
                }
                tj3Var5.m22139q(true);
                tj3 tj3Var6 = tj3Var5;
                lw9.m16554b(vz1.m23620a0(tj3Var5, z ? com.lingq.core.premium.R$string.upgrade_onboarding_plus_desc : com.lingq.core.premium.R$string.upgrade_onboarding_premium_desc), null, p58.m18900f(tj3Var5).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var5).f71407k, tj3Var6, 0, 0, 131066);
                tj3 tj3Var7 = tj3Var6;
                e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                sj8 sj8VarM20003a3 = qj8.m20003a(jj5Var, nj0.f52790I, tj3Var7, 54);
                int iHashCode5 = Long.hashCode(tj3Var7.f62385T);
                l77 l77VarM22132m5 = tj3Var7.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var7, e16VarM4412e3);
                tj3Var7.m22119f0();
                if (tj3Var7.f62384S) {
                    tj3Var7.m22130l(ui3Var5);
                } else {
                    tj3Var7.m22137o0();
                }
                oha.m18001g(tj3Var7, zi3Var5, sj8VarM20003a3);
                oha.m18001g(tj3Var7, zi3Var6, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var7, zi3Var7, tj3Var7, vi3Var3);
                as4 as4VarM10871c = e65.m10871c(tj3Var7, e16VarM1322c5, zi3Var8, 1.0f, false);
                bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, ec0Var, tj3Var7, 0);
                int iHashCode6 = Long.hashCode(tj3Var7.f62385T);
                l77 l77VarM22132m6 = tj3Var7.m22132m();
                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var7, as4VarM10871c);
                tj3Var7.m22119f0();
                if (tj3Var7.f62384S) {
                    tj3Var7.m22130l(ui3Var5);
                } else {
                    tj3Var7.m22137o0();
                }
                oha.m18001g(tj3Var7, zi3Var5, bb1VarM230a2);
                oha.m18001g(tj3Var7, zi3Var6, l77VarM22132m6);
                AbstractC3393o1.m17747v(iHashCode6, tj3Var7, zi3Var7, tj3Var7, vi3Var3);
                oha.m18001g(tj3Var7, zi3Var8, e16VarM1322c6);
                String str2 = aiaVar.f703c;
                if (vk9.m23391n0(str) || fa4.m11650l(str, str2)) {
                    tj3Var7.m22111b0(1978976244);
                    tj3Var7.m22139q(false);
                } else {
                    tj3Var7.m22111b0(1978622875);
                    lw9.m16554b(aiaVar.f704d, null, p58.m18900f(tj3Var7).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var7).f71408l, 0L, 0L, null, null, null, 0L, rt9.f59803d, null, 0, 0L, null, 16773119), tj3Var7, 0, 0, 131066);
                    tj3Var7 = tj3Var7;
                    tj3Var7.m22139q(false);
                }
                tj3 tj3Var8 = tj3Var7;
                lw9.m16554b(vz1.m23618Z(com.lingq.core.premium.R$string.upgrade_billed_at, new Object[]{str2}, tj3Var7), null, p58.m18900f(tj3Var7).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var7).f71408l, tj3Var8, 0, 0, 131066);
                tj3Var8.m22139q(true);
                lw9.m16554b(aiaVar.f705e, null, p58.m18900f(tj3Var8).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, vx9.m23584b(p58.m18902j(tj3Var8).f71403g, 0L, 0L, bc3Var, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var8, 0, 27648, 106490);
                tj3Var8.m22139q(true);
                tj3Var8.m22139q(true);
                return xfaVar;
        }
    }

    public /* synthetic */ C3187kk(boolean z, Object obj, int i) {
        this.f47445a = i;
        this.f47446b = z;
        this.f47447c = obj;
    }
}
