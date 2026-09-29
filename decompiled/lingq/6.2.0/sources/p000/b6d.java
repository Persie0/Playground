package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.challenges.R$drawable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b6d {
    /* JADX INFO: renamed from: a */
    public static final void m3381a(e16 e16Var, jr0 jr0Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        e16 e16Var2;
        jr0Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1875499831);
        int i2 = i | 6 | (tj3Var.m22124i(jr0Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128) | (tj3Var.m22124i(vi3Var2) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            b16 b16Var = b16.f7762a;
            r46.m20381f(c99.m4412e(b16Var, 1.0f), null, te1.m22000n(62, 4.0f), null, ci8.m4703P(-1366099405, new ik0(vi3Var2, jr0Var, vi3Var, 2), tj3Var), tj3Var, 24576, 10);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9((Object) e16Var2, (Object) jr0Var, (Object) vi3Var, (Object) vi3Var2, i, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3382b(e16 e16Var, String str, String str2, float f, ye1 ye1Var, int i) {
        e16 e16Var2;
        float f2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(685276578);
        int i2 = i | 6 | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22120g(str2) ? 2048 : 1024) | 24576;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4422o = c99.m4422o(b16Var, 44.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52809d, false);
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
            y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.book_challenge, tj3Var, 0);
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            jj5 jj5Var = hl1.f42565b;
            bq1.m4042R(y27VarM18236U, null, e16VarM4411d, null, jj5Var, 0.0f, null, tj3Var, 25016, 104);
            ss5.m21702b(str, null, pb1.m19046p(pvc.m19529y(c99.m4423p(b16Var, 15.752001f, 18.304f), 0.0f, 6.6000004f, 1)), null, hl1.f42564a, tj3Var, ((i2 >> 3) & 14) | 1572912, 4024);
            tj3Var = tj3Var;
            e16 e16VarM19528x = pvc.m19528x(ci0.f10109a.mo3727a(b16Var, nj0.f52810e), 4.0f, 4.0f);
            ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM19528x);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            e16 e16VarM4422o2 = c99.m4422o(b16Var, 12.0f);
            si8 si8Var = ui8.f63972a;
            bq1.m4042R(AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, str2), tj3Var, 0), null, r46.m20387m(pb1.m19045o(e16VarM4422o2, si8Var), 0.5f, aa1.f404c, si8Var), null, jj5Var, 0.0f, null, tj3Var, 24632, 104);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            f2 = 12.0f;
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            f2 = f;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fs0(e16Var2, str, str2, f2, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3383c(e16 e16Var, String str, hr0 hr0Var, long j, ye1 ye1Var, int i) {
        e16 e16Var2;
        str.getClass();
        hr0Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(902523710);
        int i2 = i | 6 | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22124i(hr0Var) ? 256 : 128) | (tj3Var.m22118f(j) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            e16Var2 = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(e16Var2, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
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
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM4412e2 = c99.m4412e(e16Var2, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            int i3 = i2 >> 3;
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var, i3 & 14, 0, 131070);
            tj3Var = tj3Var;
            thb.m22044c(tj3Var, new as4(1.0f, true));
            m3390j(null, hr0Var, tj3Var, i3 & 112);
            tj3Var.m22139q(true);
            float f = (float) hr0Var.f42817b;
            if (f <= 0.0f) {
                f = 100.0f;
            }
            e16 e16VarM4412e3 = c99.m4412e(e16Var2, 1.0f);
            float f2 = ((fe9) tj3Var.m22128k(zf1Var)).f38955d;
            boolean zM22124i = tj3Var.m22124i(hr0Var) | tj3Var.m22114d(f);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ef9(hr0Var, f, 2);
                tj3Var.m22131l0(objM22097O);
            }
            dn7.m10494c((ui3) objM22097O, e16VarM4412e3, j, 0L, 0, f2, null, tj3Var, (i3 & 896) | 48, 88);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ds0(e16Var2, str, hr0Var, j, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m3384d(e16 e16Var, List list, float f, float f2, o39 o39Var, long j, ye1 ye1Var, int i) {
        e16 e16Var2;
        float f3;
        o39 o39Var2;
        long j2;
        tj3 tj3Var;
        float f4;
        long jM198b;
        float f5;
        float f6;
        o39 o39Var3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-646240989);
        int i2 = i | 6 | (tj3Var2.m22124i(list) ? 32 : 16) | 208256;
        if (tj3Var2.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            tj3Var2.m22104W();
            int i3 = i & 1;
            b16 b16Var = b16.f7762a;
            if (i3 == 0 || tj3Var2.m22084B()) {
                si8 si8VarM22753b = ui8.m22753b(8.0f);
                jM198b = aa1.m198b(0.15f, aa1.f404c);
                f5 = 20.0f;
                f6 = 1.0f;
                o39Var3 = si8VarM22753b;
                e16Var2 = b16Var;
            } else {
                tj3Var2.m22102U();
                e16Var2 = e16Var;
                f6 = f;
                f5 = f2;
                o39Var3 = o39Var;
                jM198b = j;
            }
            tj3Var2.m22140r();
            double d = ((hr0) u91.m22589G0(list)).f42816a;
            List list2 = list;
            Iterator it = list2.iterator();
            float f7 = f6;
            double d2 = 0.0d;
            while (it.hasNext()) {
                d2 += ((hr0) it.next()).f42817b;
            }
            double dMin = Math.min(d, d2);
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            int i4 = 0;
            for (Object obj : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                hr0 hr0Var = (hr0) obj;
                double d3 = i4 == 0 ? 0.0d : ((hr0) list.get(i4 - 1)).f42817b;
                double d4 = hr0Var.f42817b;
                arrayList.add(new Pair(hr0Var, dMin <= d3 ? Float.valueOf(0.0f) : dMin >= d3 + d4 ? Float.valueOf(1.0f) : Double.valueOf((hr0Var.f42816a - d3) / (d4 - d3))));
                dMin = dMin;
                i4 = i5;
            }
            e16 e16VarM4414g = c99.m4414g(c99.m4412e(e16Var2, 1.0f), f5);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var2, 0);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4414g);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            tj3Var2.m22111b0(-656232079);
            ArrayList<Pair> arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                Pair pair = (Pair) obj2;
                hr0 hr0Var2 = (hr0) pair.f47623a;
                Object obj3 = pair.f47624b;
                if (((float) hr0Var2.f42817b) > 0.0d && ((Number) obj3).floatValue() > 0.0d) {
                    arrayList2.add(obj2);
                }
            }
            for (Pair pair2 : arrayList2) {
                hr0 hr0Var3 = (hr0) pair2.f47623a;
                Object obj4 = pair2.f47624b;
                float f8 = (float) hr0Var3.f42817b;
                if (f8 <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                if (f8 > Float.MAX_VALUE) {
                    f8 = Float.MAX_VALUE;
                }
                e16 e16VarM19045o = pb1.m19045o(d32.m10007D(c99.m4410c(new as4(f8, true), 1.0f), jM198b, o39Var3), o39Var3);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM19045o);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var2);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m2);
                oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode2));
                oha.m18000f(tj3Var2, C0352b.f4305h);
                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c2);
                qh0.m19963a(d32.m10007D(c99.m4412e(c99.m4410c(b16Var, 1.0f), ((Number) obj4).floatValue()), d32.m10035e(hr0Var3.f42819d), ss5.f61356d), tj3Var2, 0);
                b16 b16Var2 = b16Var;
                tj3 tj3Var3 = tj3Var2;
                lw9.m16554b(hr0Var3.f42818c, AbstractC3584sr.m21611X(ci0.f10109a.mo3727a(b16Var, nj0.f52813h), 0.0f, 0.0f, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38955d, 0.0f, 11), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71411o, tj3Var3, 0, 0, 131068);
                tj3Var3.m22139q(true);
                thb.m22044c(tj3Var3, c99.m4426s(b16Var2, f7));
                tj3Var2 = tj3Var3;
                f5 = f5;
                o39Var3 = o39Var3;
                jM198b = jM198b;
                b16Var = b16Var2;
                e16Var2 = e16Var2;
            }
            tj3 tj3Var4 = tj3Var2;
            tj3Var4.m22139q(false);
            tj3Var4.m22139q(true);
            tj3Var = tj3Var4;
            f3 = f5;
            o39Var2 = o39Var3;
            j2 = jM198b;
            f4 = f7;
        } else {
            tj3Var2.m22102U();
            e16Var2 = e16Var;
            f3 = f2;
            o39Var2 = o39Var;
            j2 = j;
            tj3Var = tj3Var2;
            f4 = f;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mg0(e16Var2, list, f4, f3, o39Var2, j2, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m3385e(e16 e16Var, List list, int i, ye1 ye1Var, int i2) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(964793182);
        int i3 = i2 | 6 | (tj3Var.m22124i(list) ? 32 : 16) | (tj3Var.m22116e(i) ? 256 : 128);
        int i4 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            r46.m20381f(c99.m4412e(b16Var, 1.0f), null, te1.m22000n(62, 4.0f), null, ci8.m4703P(114484040, new xr0(i, i4, list), tj3Var), tj3Var, 24576, 10);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yr0(e16Var2, list, i, i2, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m3386f(e16 e16Var, List list, int i, ye1 ye1Var, int i2) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-622320813);
        int i3 = i2 | 6 | (tj3Var.m22124i(list) ? 32 : 16) | (tj3Var.m22116e(i) ? 256 : 128);
        int i4 = 0;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            r46.m20381f(c99.m4412e(b16Var, 1.0f), null, te1.m22000n(62, 4.0f), null, ci8.m4703P(375272873, new xr0(i, i4, list), tj3Var), tj3Var, 24576, 10);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yr0(e16Var2, list, i, i2, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m3387g(e16 e16Var, List list, int i, ye1 ye1Var, int i2) {
        e16 e16Var2;
        x18 x18VarM22143u;
        zi3 yr0Var;
        Object next;
        hr0 hr0Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1635572564);
        int i3 = i2 | 6 | (tj3Var.m22124i(list) ? 32 : 16) | (tj3Var.m22116e(i) ? 256 : 128);
        int i4 = 0;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    hr0Var = (hr0) next;
                }
            } while (hr0Var.f42816a > hr0Var.f42817b);
            hr0 hr0Var2 = (hr0) next;
            if (hr0Var2 == null) {
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u == null) {
                    return;
                } else {
                    yr0Var = new zr0(i, i2, list);
                }
            } else {
                e16Var2 = b16.f7762a;
                r46.m20381f(c99.m4412e(e16Var2, 1.0f), null, te1.m22000n(62, 4.0f), null, ci8.m4703P(-725747326, new as0(list, i, i4, hr0Var2), tj3Var), tj3Var, 24576, 10);
            }
            x18VarM22143u.f67642d = yr0Var;
        }
        tj3Var.m22102U();
        e16Var2 = e16Var;
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            yr0Var = new yr0(e16Var2, list, i, i2, 1);
            x18VarM22143u.f67642d = yr0Var;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m3388h(int i, int i2, ye1 ye1Var, e16 e16Var) {
        int i3;
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(785678251);
        int i4 = i2 | 6 | (tj3Var.m22116e(i) ? 32 : 16);
        if (tj3Var.m22099R(i4 & 1, (i4 & 19) != 18)) {
            float f = ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, 0.0f, f, 0.0f, 0.0f, 13);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52790I, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            Locale locale = Locale.US;
            i3 = 1;
            lw9.m16554b(String.format(locale, "%s: ", Arrays.copyOf(new Object[]{vz1.m23620a0(tj3Var, R$string.challenges_rank)}, 1)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
            lw9.m16554b(String.format(locale, "%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), null, 0L, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71401e, tj3Var, 1572864, 0, 131006);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            i3 = 1;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zp0(i, i2, i3, e16Var2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m3389i(int i, ye1 ye1Var, e16 e16Var, String str) {
        String str2;
        int i2;
        e16 e16Var2;
        str.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(963418578);
        int i3 = i | 6 | (tj3Var.m22120g(str) ? 32 : 16) | 384;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
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
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.challenges_rank), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71409m, tj3Var, 0, 0, 131070);
            thb.m22044c(tj3Var, new as4(1.0f, true));
            tj3Var.m22111b0(680164695);
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71409m, tj3Var, (i3 >> 3) & 14, 0, 131070);
            str2 = str;
            tj3Var = tj3Var;
            i2 = 0;
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
            pb1.m19031a(0.0f, 0, 3, p58.m18900f(tj3Var).f55870o, tj3Var, null);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            str2 = str;
            i2 = 0;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gs0(e16Var2, str2, i, i2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m3390j(e16 e16Var, hr0 hr0Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        hr0Var.getClass();
        double d = hr0Var.f42816a;
        double d2 = hr0Var.f42817b;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1877063114);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(hr0Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2;
            e16Var2 = b16.f7762a;
            if (d2 == 0.0d) {
                tj3Var.m22111b0(-886839380);
                lw9.m16554b(nob.m17573b(d), e16Var2, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, (i3 << 3) & 112, 0, 262140);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-886703290);
                C3341mn c3341mn = new C3341mn();
                c3341mn.m16929d(nob.m17573b(d));
                c3341mn.m16929d(" / ");
                int iM16932g = c3341mn.m16932g(new he9(0L, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                try {
                    c3341mn.m16929d(nob.m17573b(d2));
                    c3341mn.m16931f(iM16932g);
                    lw9.m16555c(c3341mn.m16933h(), e16Var2, 0L, null, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, tj3Var, (i3 << 3) & 112, 0, 524284);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } catch (Throwable th) {
                    c3341mn.m16931f(iM16932g);
                    throw th;
                }
            }
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cs0(e16Var2, hr0Var, i);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m3391k(e16 e16Var, hr0 hr0Var, int i, ye1 ye1Var, int i2) {
        hr0Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1856591152);
        int i3 = i2 | 6 | (tj3Var.m22124i(hr0Var) ? 32 : 16) | (tj3Var.m22116e(i) ? 256 : 128);
        int i4 = 0;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            r46.m20381f(c99.m4412e(b16Var, 1.0f), null, te1.m22000n(62, 4.0f), null, ci8.m4703P(-1785198810, new bs0(hr0Var, i, i4), tj3Var), tj3Var, 24576, 10);
            e16Var = b16Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cs0(e16Var, hr0Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static yq9 m3392l(bk8 bk8Var, String str) throws Exception {
        Map mapM15392b;
        SetBuilder setBuilder;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (ik8VarMo2873e0.mo2876a0()) {
                int iM14095i = AbstractC3122is.m14095i(ik8VarMo2873e0, "name");
                int iM14095i2 = AbstractC3122is.m14095i(ik8VarMo2873e0, "type");
                int iM14095i3 = AbstractC3122is.m14095i(ik8VarMo2873e0, "notnull");
                int iM14095i4 = AbstractC3122is.m14095i(ik8VarMo2873e0, "pk");
                int iM14095i5 = AbstractC3122is.m14095i(ik8VarMo2873e0, "dflt_value");
                MapBuilder mapBuilder = new MapBuilder();
                do {
                    String strMo2875L = ik8VarMo2873e0.mo2875L(iM14095i);
                    mapBuilder.put(strMo2875L, new vq9(strMo2875L, ik8VarMo2873e0.mo2875L(iM14095i2), (int) ik8VarMo2873e0.getLong(iM14095i4), ik8VarMo2873e0.getLong(iM14095i3) != 0, 2, ik8VarMo2873e0.isNull(iM14095i5) ? null : ik8VarMo2873e0.mo2875L(iM14095i5)));
                } while (ik8VarMo2873e0.mo2876a0());
                mapM15392b = mapBuilder.m15392b();
                AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            } else {
                mapM15392b = AbstractC3194a.m15360M();
                AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            }
            ik8 ik8VarMo2873e1 = bk8Var.mo2873e0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iM14095i6 = AbstractC3122is.m14095i(ik8VarMo2873e1, "id");
                int iM14095i7 = AbstractC3122is.m14095i(ik8VarMo2873e1, "seq");
                int iM14095i8 = AbstractC3122is.m14095i(ik8VarMo2873e1, "table");
                int iM14095i9 = AbstractC3122is.m14095i(ik8VarMo2873e1, "on_delete");
                int iM14095i10 = AbstractC3122is.m14095i(ik8VarMo2873e1, "on_update");
                List listM23594a = vyc.m23594a(ik8VarMo2873e1);
                ik8VarMo2873e1.reset();
                SetBuilder setBuilder2 = new SetBuilder();
                while (ik8VarMo2873e1.mo2876a0()) {
                    if (ik8VarMo2873e1.getLong(iM14095i7) == j) {
                        int i = (int) ik8VarMo2873e1.getLong(iM14095i6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iM14095i6;
                        ArrayList<ic3> arrayList3 = new ArrayList();
                        for (Object obj : listM23594a) {
                            int i3 = iM14095i7;
                            List list = listM23594a;
                            if (((ic3) obj).f43920a == i) {
                                arrayList3.add(obj);
                            }
                            iM14095i7 = i3;
                            listM23594a = list;
                        }
                        int i4 = iM14095i7;
                        List list2 = listM23594a;
                        for (ic3 ic3Var : arrayList3) {
                            arrayList.add(ic3Var.f43922c);
                            arrayList2.add(ic3Var.f43923d);
                        }
                        setBuilder2.add(new wq9(ik8VarMo2873e1.mo2875L(iM14095i8), ik8VarMo2873e1.mo2875L(iM14095i9), ik8VarMo2873e1.mo2875L(iM14095i10), arrayList, arrayList2));
                        iM14095i6 = i2;
                        iM14095i7 = i4;
                        listM23594a = list2;
                        j = 0;
                    }
                }
                SetBuilder setBuilderM19776f = AbstractC3489q9.m19776f(setBuilder2);
                AbstractC3352my.m17126j(ik8VarMo2873e1, null);
                ik8 ik8VarMo2873e2 = bk8Var.mo2873e0("PRAGMA index_list(`" + str + "`)");
                try {
                    int iM14095i11 = AbstractC3122is.m14095i(ik8VarMo2873e2, "name");
                    int iM14095i12 = AbstractC3122is.m14095i(ik8VarMo2873e2, "origin");
                    int iM14095i13 = AbstractC3122is.m14095i(ik8VarMo2873e2, "unique");
                    if (iM14095i11 == -1 || iM14095i12 == -1 || iM14095i13 == -1) {
                        AbstractC3352my.m17126j(ik8VarMo2873e2, null);
                        setBuilder = null;
                    } else {
                        SetBuilder setBuilder3 = new SetBuilder();
                        while (ik8VarMo2873e2.mo2876a0()) {
                            if ("c".equals(ik8VarMo2873e2.mo2875L(iM14095i12))) {
                                xq9 xq9VarM23595b = vyc.m23595b(bk8Var, ik8VarMo2873e2.mo2875L(iM14095i11), ik8VarMo2873e2.getLong(iM14095i13) == 1);
                                if (xq9VarM23595b == null) {
                                    AbstractC3352my.m17126j(ik8VarMo2873e2, null);
                                    setBuilder = null;
                                } else {
                                    setBuilder3.add(xq9VarM23595b);
                                }
                            }
                        }
                        SetBuilder setBuilderM19776f2 = AbstractC3489q9.m19776f(setBuilder3);
                        AbstractC3352my.m17126j(ik8VarMo2873e2, null);
                        setBuilder = setBuilderM19776f2;
                    }
                    return new yq9(str, mapM15392b, setBuilderM19776f, setBuilder);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3352my.m17126j(ik8VarMo2873e2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC3352my.m17126j(ik8VarMo2873e1, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th5);
                throw th6;
            }
        }
    }
}
