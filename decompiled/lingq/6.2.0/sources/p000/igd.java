package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.more.C2160a;
import com.lingq.feature.more.R$drawable;
import com.lingq.feature.more.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class igd {
    /* JADX INFO: renamed from: a */
    public static final void m13902a(ra4 ra4Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-957984363);
        int i2 = (tj3Var.m22124i(ra4Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            e16 e16VarM4430w = c99.m4430w(b16.f7762a, null, 3);
            zf1 zf1Var = ge9.f40637a;
            ho9.m13414a(e16VarM4430w, ui8.m22754c(((fe9) tj3Var.m22128k(zf1Var)).f38956e, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 12), 0L, 0L, 0.0f, 0.0f, null, ci8.m4703P(-64667046, new rw1(vi3Var, ra4Var), tj3Var), tj3Var, 12582918, 124);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(ra4Var, i, 13, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13903b(C2160a c2160a, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1231977633);
        int i2 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c2160a = (C2160a) pfa.m19114d(y38.m24933a(C2160a.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            } else {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-15);
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2160a.f26837f, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2160a.f26838g, tj3Var);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2160a.f26840i, tj3Var);
            t66 t66VarM2513c4 = AbstractC0711a.m2513c(c2160a.f26836e, tj3Var);
            ra4 ra4Var = new ra4(((Number) t66VarM2513c.getValue()).intValue(), ((Number) t66VarM2513c2.getValue()).intValue(), (List) t66VarM2513c3.getValue(), (String) t66VarM2513c4.getValue());
            boolean zM22120g = tj3Var.m22120g(t66VarM2513c4) | ((i3 & 112) == 32);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new ix0(vi3Var, t66VarM2513c4, 8);
                tj3Var.m22131l0(objM22097O);
            }
            m13902a(ra4Var, (vi3) objM22097O, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(c2160a, i, 14, vi3Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m13904c(e16 e16Var, final ArrayList arrayList, final int i, final int i2, ye1 ye1Var, int i3) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1323803146);
        int i4 = i3 | 6 | (tj3Var.m22124i(arrayList) ? 32 : 16) | (tj3Var.m22116e(i) ? 256 : 128) | (tj3Var.m22116e(i2) ? 2048 : 1024);
        if (tj3Var.m22099R(i4 & 1, (i4 & 1171) != 1170)) {
            b16 b16Var = b16.f7762a;
            r46.m20381f(c99.m4412e(b16Var, 1.0f), null, null, null, ci8.m4703P(940122208, new aj3() { // from class: pa4
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b16 b16Var2 = b16.f7762a;
                        e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
                        zf1 zf1Var = ge9.f40637a;
                        e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4412e, ((fe9) tj3Var2.m22128k(zf1Var)).f38957f);
                        bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38958g, true, new gm5(28)), nj0.f52792K, tj3Var2, 48);
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
                        lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.invite_your_referrals), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var2, 0, 0, 131070);
                        tj3 tj3Var3 = tj3Var2;
                        e16 e16VarM4412e2 = c99.m4412e(b16Var2, 1.0f);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37241g, nj0.f52817l, tj3Var3, 6);
                        int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m2 = tj3Var3.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e2);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                        tj3Var3.m22111b0(-738089902);
                        ArrayList arrayList2 = arrayList;
                        Iterator it = u91.m22615g1(arrayList2, 5).iterator();
                        while (true) {
                            f = 42.0f;
                            if (!it.hasNext()) {
                                break;
                            }
                            tj3 tj3Var4 = tj3Var3;
                            ss5.m21700a((String) it.next(), null, pb1.m19045o(c99.m4422o(b16Var2, 42.0f), ui8.f63972a), AbstractC3423or.m18236U(R$drawable.ic_invite_friend_placeholder, tj3Var3, 0), AbstractC3423or.m18236U(R$drawable.ic_invite_friend_placeholder, tj3Var3, 0), null, tj3Var4, 36912, 0, 65504);
                            tj3Var3 = tj3Var4;
                        }
                        tj3Var3.m22139q(false);
                        tj3Var3.m22111b0(-738073343);
                        int size = 5 - u91.m22615g1(arrayList2, 5).size();
                        int i5 = 0;
                        while (i5 < size) {
                            tj3 tj3Var5 = tj3Var3;
                            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_invite_friend_placeholder, tj3Var3, 0), null, pb1.m19045o(c99.m4422o(b16Var2, f), ui8.f63972a), null, null, 0.0f, null, tj3Var5, 56, 120);
                            tj3Var3 = tj3Var5;
                            i5++;
                            f = f;
                        }
                        tj3Var3.m22139q(false);
                        tj3Var3.m22139q(true);
                        fc0 fc0Var = nj0.f52789H;
                        sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var3).f38956e, true, new gm5(28)), fc0Var, tj3Var3, 48);
                        int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m3 = tj3Var3.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, b16Var2);
                        se1.f60731q.getClass();
                        ui3 ui3Var2 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var2);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        zi3 zi3Var5 = C0352b.f4303f;
                        oha.m18001g(tj3Var3, zi3Var5, sj8VarM20003a2);
                        zi3 zi3Var6 = C0352b.f4302e;
                        oha.m18001g(tj3Var3, zi3Var6, l77VarM22132m3);
                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                        zi3 zi3Var7 = C0352b.f4304g;
                        oha.m18001g(tj3Var3, zi3Var7, numValueOf2);
                        vi3 vi3Var2 = C0352b.f4305h;
                        oha.m18000f(tj3Var3, vi3Var2);
                        zi3 zi3Var8 = C0352b.f4301d;
                        oha.m18001g(tj3Var3, zi3Var8, e16VarM1322c3);
                        ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_referred_signups, tj3Var3, 0), null, null, cx2.m9917a(tj3Var3).m4208a(), tj3Var3, 56, 4);
                        if (1.0f <= 0.0d) {
                            g54.m12362a("invalid weight; must be greater than zero");
                        }
                        tj3 tj3Var6 = tj3Var3;
                        lw9.m16554b(vz1.m23620a0(tj3Var3, R$string.invite_referral_signups), new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71406j, tj3Var6, 0, 0, 131068);
                        lw9.m16554b(String.valueOf(i), null, cx2.m9917a(tj3Var6).m4208a(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71404h, tj3Var6, 0, 0, 131066);
                        tj3Var6.m22139q(true);
                        sj8 sj8VarM20003a3 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var6).f38956e, true, new gm5(28)), fc0Var, tj3Var6, 48);
                        int iHashCode4 = Long.hashCode(tj3Var6.f62385T);
                        l77 l77VarM22132m4 = tj3Var6.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var6, b16Var2);
                        tj3Var6.m22119f0();
                        if (tj3Var6.f62384S) {
                            tj3Var6.m22130l(ui3Var2);
                        } else {
                            tj3Var6.m22137o0();
                        }
                        oha.m18001g(tj3Var6, zi3Var5, sj8VarM20003a3);
                        oha.m18001g(tj3Var6, zi3Var6, l77VarM22132m4);
                        AbstractC3393o1.m17747v(iHashCode4, tj3Var6, zi3Var7, tj3Var6, vi3Var2);
                        oha.m18001g(tj3Var6, zi3Var8, e16VarM1322c4);
                        ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_points_earned, tj3Var6, 0), null, null, cx2.m9917a(tj3Var6).m4208a(), tj3Var6, 56, 4);
                        if (1.0f <= 0.0d) {
                            g54.m12362a("invalid weight; must be greater than zero");
                        }
                        lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.invite_points_earned), new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71406j, tj3Var6, 0, 0, 131068);
                        lw9.m16554b(String.valueOf(i2), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var6).f71404h, tj3Var6, 0, 0, 131070);
                        tj3Var6.m22139q(true);
                        tj3Var6.m22139q(true);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 24576, 14);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qa4(e16Var2, arrayList, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m13905d(e16 e16Var, String str, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1492829480);
        int i2 = i | 6 | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | (tj3Var.m22124i(ui3Var2) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            b16 b16Var = b16.f7762a;
            r46.m20381f(c99.m4412e(b16Var, 1.0f), null, null, null, ci8.m4703P(1650291966, new ik0(ui3Var2, (Object) str, (xi3) ui3Var, 23), tj3Var), tj3Var, 24576, 14);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9((Object) e16Var2, (Object) str, (Object) ui3Var, (xi3) ui3Var2, i, 14);
        }
    }
}
