package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.challenges.R$string;
import com.lingq.feature.challenges.cup.C1975b;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u9d {
    /* JADX INFO: renamed from: a */
    public static final void m22637a(int i, ye1 ye1Var, e16 e16Var, List list) {
        e16 e16Var2;
        b16 b16Var;
        boolean z;
        boolean z2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1414469243);
        int i2 = i | (tj3Var.m22124i(list) ? 4 : 2) | 48;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            si8 si8VarM22753b = ui8.m22753b(ge9.m12515a(tj3Var).f38958g);
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(r46.m20387m(d32.m10007D(pb1.m19045o(c99.m4412e(b16Var2, 1.0f), si8VarM22753b), p58.m18900f(tj3Var).f55825J, ss5.f61356d), 1.0f, p58.m18900f(tj3Var).f55817B, si8VarM22753b), 0.0f, ge9.m12515a(tj3Var).f38955d, 1);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(415738731);
            if (list.isEmpty()) {
                tj3Var.m22111b0(415746201);
                b16Var = b16Var2;
                z = true;
                z2 = false;
                lw9.m16554b(vz1.m23620a0(tj3Var, R$string.cup_no_results), AbstractC3584sr.m21607T(c99.m4412e(b16Var2, 1.0f), ge9.m12515a(tj3Var).f38958g), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 130040);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                b16Var = b16Var2;
                z = true;
                z2 = false;
                tj3Var.m22111b0(416170963);
                tj3Var.m22139q(false);
                x9d.m24422e("", null, false, false, tj3Var, 6, 14);
                long j = p58.m18900f(tj3Var).f55817B;
                tj3Var = tj3Var;
                pb1.m19031a(0.0f, 0, 3, j, tj3Var, null);
                tj3Var.m22111b0(1398902631);
                int i3 = 0;
                for (Object obj : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    s9d.m21183b((et1) obj, false, null, tj3Var, 48);
                    if (i3 != list.size() - 1) {
                        tj3Var.m22111b0(-172680358);
                        pb1.m19031a(0.0f, 0, 3, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55817B, tj3Var, null);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-172585219);
                        tj3Var.m22139q(false);
                    }
                    i3 = i4;
                }
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z2);
            tj3Var.m22139q(z);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fq0(list, e16Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m22638b(String str, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1758264152);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(1688751556);
            C3341mn c3341mn = new C3341mn();
            c3341mn.m16929d(vz1.m23620a0(tj3Var, R$string.cup_contributors_title_lead));
            tj3Var.m22111b0(1688755138);
            int iM16932g = c3341mn.m16932g(new he9(xs1.f68608a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                c3341mn.m16929d(vz1.m23620a0(tj3Var, R$string.cup_contributors_title_accent));
                c3341mn.m16931f(iM16932g);
                tj3Var.m22139q(false);
                C3419on c3419onM16933h = c3341mn.m16933h();
                tj3Var.m22139q(false);
                vh9 vh9Var = ps5.f56764b;
                lw9.m16555c(c3419onM16933h, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, bc3.f8324j, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71399c, tj3Var, 1572864, 0, 261050);
                lw9.m16554b(vz1.m23618Z(R$string.cup_contributors_subtitle, new Object[]{AbstractC3352my.m17093L(context, str == null ? "" : str)}, tj3Var), null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 0, 0, 130042);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
            } catch (Throwable th) {
                c3341mn.m16931f(iM16932g);
                throw th;
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3441oz(str, i, 6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m22639c(C1975b c1975b, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(777081204);
        int i2 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c1975b = (C1975b) pfa.m19114d(y38.m24933a(C1975b.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            } else {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-15);
            tj3Var.m22140r();
            m22640d((it1) AbstractC0711a.m2513c(c1975b.f24683d, tj3Var).getValue(), vi3Var, tj3Var, i3 & 112);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(c1975b, i, 23, vi3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m22640d(it1 it1Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        it1Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1204381486);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(it1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b34.m3232b(null, ci8.m4703P(-1151374870, new dq0(vi3Var, 17), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(1206388159, new ht1(it1Var, i3), tj3Var), tj3Var, 805306416, 509);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(it1Var, i, 8, vi3Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m22641e(final vk8 vk8Var, final e16 e16Var, final long j, final boolean z, ye1 ye1Var, final int i) {
        t66 t66Var;
        vx9 vx9Var;
        gc0 gc0Var;
        C3587su c3587su;
        b16 b16Var;
        zi3 zi3Var;
        zi3 zi3Var2;
        t66 t66Var2;
        vi3 vi3Var;
        zi3 zi3Var3;
        p84 p84Var;
        ui3 ui3Var;
        t66 t66Var3;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        long jM4210c;
        boolean z5;
        long j3;
        boolean z6;
        long jM4210c2;
        boolean z7;
        long j4;
        boolean z8;
        long jM4210c3;
        long j5;
        t66 t66Var4;
        t66 t66Var5;
        long jM4210c4;
        final vk8 vk8Var2 = vk8Var;
        gc0 gc0Var2 = nj0.f52812g;
        C3587su c3587su2 = eh0.f37238d;
        ec0 ec0Var = nj0.f52792K;
        vk8Var2.getClass();
        int i2 = vk8Var2.f65542a;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-465666992);
        int i3 = i | (tj3Var.m22124i(vk8Var2) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        int i4 = i3 | (tj3Var.m22118f(j) ? 256 : 128);
        if (tj3Var.m22099R(i4 & 1, (i4 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            vx9 vx9Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71404h;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (objM22097O == p84Var2) {
                objM22097O = AbstractC0278f.m1260j(new xj2(Float.NaN));
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var6 = (t66) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var2) {
                objM22097O2 = AbstractC0278f.m1260j(new xj2(Float.NaN));
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var7 = (t66) objM22097O2;
            yw9 yw9VarM17106Y = AbstractC3352my.m17106Y(tj3Var);
            boolean zM22120g = tj3Var.m22120g(vx9Var2) | tj3Var.m22120g(yw9VarM17106Y) | tj3Var.m22114d(((xj2) t66Var6.getValue()).f68285a) | tj3Var.m22114d(((xj2) t66Var7.getValue()).f68285a);
            Object objM22097O3 = tj3Var.m22097O();
            int i5 = 10;
            if (zM22120g || objM22097O3 == p84Var2) {
                if (Float.isNaN(((xj2) t66Var6.getValue()).f68285a) || Float.isNaN(((xj2) t66Var7.getValue()).f68285a) || ((xj2) t66Var6.getValue()).f68285a < 0.0f || ((xj2) t66Var7.getValue()).f68285a < 0.0f) {
                    t66Var = t66Var6;
                } else {
                    int i6 = (int) ((xj2) t66Var6.getValue()).f68285a;
                    int i7 = (int) ((xj2) t66Var7.getValue()).f68285a;
                    if (!((i6 >= 0) & (i7 >= 0))) {
                        k54.m14852a("width and height must be >= 0");
                    }
                    long jM10430h = dk1.m10430h(i6, i6, i7, i7);
                    vx9 vx9VarM23584b = vx9Var2;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i5) {
                            vx9Var = vx9VarM23584b;
                            break;
                        }
                        vx9Var = vx9VarM23584b;
                        if (!yw9.m25367a(yw9VarM17106Y, "99", vx9VarM23584b, jM10430h, 968).m20964k(0)) {
                            break;
                        }
                        long j6 = vx9Var.f66065a.f42265b;
                        d32.m10009G(j6);
                        vx9VarM23584b = vx9.m23584b(vx9Var, 0L, d32.m10032c0((float) (((double) zx9.m25848c(j6)) * 0.9d), j6 & 1095216660480L), null, null, null, 0L, null, null, 0, 0L, null, 16777213);
                        i8++;
                        t66Var6 = t66Var6;
                        i5 = 10;
                    }
                    t66Var = t66Var6;
                    vx9Var2 = vx9Var;
                }
                tj3Var.m22131l0(vx9Var2);
                objM22097O3 = vx9Var2;
            } else {
                t66Var = t66Var6;
            }
            vx9 vx9Var3 = (vx9) objM22097O3;
            final float f = ge9.m12515a(tj3Var).f38955d;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16Var, 0.0f, ge9.m12515a(tj3Var).f38955d, 1);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37241g, nj0.f52789H, tj3Var, 54);
            t66 t66Var8 = t66Var;
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var4 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var4, sj8VarM20003a);
            zi3 zi3Var5 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var5, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var6 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var6, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var7 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var7, e16VarM1322c);
            b16 b16Var2 = b16.f7762a;
            vj8 vj8Var = vj8.f65508a;
            if (i2 > 0) {
                tj3Var.m22111b0(-1215306805);
                e16 e16VarMo12420a = vj8Var.mo12420a(1.0f, b16Var2, true);
                bb1 bb1VarM230a = ab1.m230a(c3587su2, ec0Var, tj3Var, 48);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarMo12420a);
                tj3Var.m22119f0();
                c3587su = c3587su2;
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var4, bb1VarM230a);
                oha.m18001g(tj3Var, zi3Var5, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var6, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var7, e16VarM1322c2);
                if (z) {
                    tj3Var.m22111b0(-1327123158);
                    tj3Var.m22139q(false);
                    j5 = j;
                } else {
                    tj3Var.m22111b0(-1327121710);
                    j5 = ((aa1) ((xc9) cx2.m9917a(tj3Var).f9126n).getValue()).f414a;
                    tj3Var.m22139q(false);
                }
                e16 e16VarM20387m = r46.m20387m(b16Var2, 1.0f, j5, p58.m18901i(tj3Var).f64856b);
                boolean zM22114d = tj3Var.m22114d(f);
                Object objM22097O4 = tj3Var.m22097O();
                if (zM22114d || objM22097O4 == p84Var2) {
                    t66Var4 = t66Var7;
                    t66Var5 = t66Var8;
                    objM22097O4 = new b0a(f, t66Var5, t66Var4);
                    tj3Var.m22131l0(objM22097O4);
                } else {
                    t66Var4 = t66Var7;
                    t66Var5 = t66Var8;
                }
                e16 e16VarM24741N = xwc.m24741N(e16VarM20387m, (vi3) objM22097O4);
                t66 t66Var9 = t66Var5;
                ht5 ht5VarM19966d = qh0.m19966d(gc0Var2, false);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM24741N);
                tj3Var.m22119f0();
                t66 t66Var10 = t66Var4;
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var4, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var5, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var6, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var7, e16VarM1322c3);
                e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var2, 1.0f), ge9.m12515a(tj3Var).f38955d);
                String str = i2 < 10 ? "0" : "";
                t66Var3 = t66Var9;
                zi3Var = zi3Var5;
                zi3Var3 = zi3Var6;
                gc0Var = gc0Var2;
                p84Var = p84Var2;
                t66Var2 = t66Var10;
                zi3Var2 = zi3Var7;
                ui3Var = ui3Var2;
                z3 = true;
                b16Var = b16Var2;
                vi3Var = vi3Var2;
                z2 = false;
                lw9.m16554b(str + i2, e16VarM21607T, 0L, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 1, 0, null, vx9Var3, tj3Var, 0, 24576, 113660);
                tj3Var.m22139q(true);
                String strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.premium.R$string.ui_days);
                vx9 vx9Var4 = p58.m18902j(tj3Var).f71408l;
                if (z) {
                    tj3Var.m22111b0(-1327085650);
                    jM4210c4 = p58.m18900f(tj3Var).f55873q;
                } else {
                    tj3Var.m22111b0(-1327084083);
                    jM4210c4 = cx2.m9917a(tj3Var).m4210c();
                }
                tj3Var.m22139q(false);
                lw9.m16554b(strM23620a0, null, jM4210c4, null, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, vx9Var4, tj3Var, 0, 24576, 114682);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
                thb.m22044c(tj3Var, vj8Var.mo12420a(0.5f, b16Var, true));
                tj3Var.m22139q(false);
            } else {
                gc0Var = gc0Var2;
                c3587su = c3587su2;
                b16Var = b16Var2;
                zi3Var = zi3Var5;
                zi3Var2 = zi3Var7;
                t66Var2 = t66Var7;
                vi3Var = vi3Var2;
                zi3Var3 = zi3Var6;
                p84Var = p84Var2;
                ui3Var = ui3Var2;
                t66Var3 = t66Var8;
                z2 = false;
                z3 = true;
                tj3Var.m22111b0(-1213674066);
                tj3Var.m22139q(false);
            }
            e16 e16VarMo12420a2 = vj8Var.mo12420a(1.0f, b16Var, z3);
            C3587su c3587su3 = c3587su;
            bb1 bb1VarM230a2 = ab1.m230a(c3587su3, ec0Var, tj3Var, 48);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarMo12420a2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var4, bb1VarM230a2);
            zi3 zi3Var8 = zi3Var;
            oha.m18001g(tj3Var, zi3Var8, l77VarM22132m4);
            vi3 vi3Var3 = vi3Var;
            zi3 zi3Var9 = zi3Var3;
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var9, tj3Var, vi3Var3);
            zi3 zi3Var10 = zi3Var2;
            oha.m18001g(tj3Var, zi3Var10, e16VarM1322c4);
            if (z) {
                tj3Var.m22111b0(1348427855);
                tj3Var.m22139q(z2);
                j2 = j;
            } else {
                tj3Var.m22111b0(1348429303);
                j2 = ((aa1) ((xc9) cx2.m9917a(tj3Var).f9126n).getValue()).f414a;
                tj3Var.m22139q(z2);
            }
            e16 e16VarM20387m2 = r46.m20387m(b16Var, 1.0f, j2, p58.m18901i(tj3Var).f64856b);
            boolean zM22124i = tj3Var.m22124i(vk8Var) | tj3Var.m22114d(f);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i || objM22097O5 == p84Var) {
                final t66 t66Var11 = t66Var3;
                final t66 t66Var12 = t66Var2;
                objM22097O5 = new vi3() { // from class: jia
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        aq4 aq4Var = (aq4) obj;
                        aq4Var.getClass();
                        if (vk8Var.f65542a <= 0) {
                            t66Var11.setValue(new xj2((((int) (aq4Var.mo1687j() >> 32)) * 0.7f) - (f * 2.0f)));
                            t66Var12.setValue(new xj2((int) (aq4Var.mo1687j() & 4294967295L)));
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O5);
            }
            e16 e16VarM24741N2 = xwc.m24741N(e16VarM20387m2, (vi3) objM22097O5);
            ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m5 = tj3Var.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM24741N2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var4, ht5VarM19966d2);
            oha.m18001g(tj3Var, zi3Var8, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var9, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var10, e16VarM1322c5);
            e16 e16VarM21607T2 = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38955d);
            int i9 = vk8Var.f65543b;
            tj3 tj3Var2 = tj3Var;
            lw9.m16554b((i9 < 10 ? "0" : "") + i9, e16VarM21607T2, 0L, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 1, 0, null, vx9Var3, tj3Var2, 0, 24576, 113660);
            tj3Var2.m22139q(true);
            String strM23620a1 = vz1.m23620a0(tj3Var2, com.lingq.core.premium.R$string.ui_hours);
            vx9 vx9Var5 = p58.m18902j(tj3Var2).f71408l;
            if (z) {
                tj3Var2.m22111b0(1348463667);
                jM4210c = p58.m18900f(tj3Var2).f55873q;
                z4 = false;
            } else {
                z4 = false;
                tj3Var2.m22111b0(1348465234);
                jM4210c = cx2.m9917a(tj3Var2).m4210c();
            }
            tj3Var2.m22139q(z4);
            lw9.m16554b(strM23620a1, null, jM4210c, null, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, vx9Var5, tj3Var2, 0, 24576, 114682);
            tj3Var2.m22139q(true);
            thb.m22044c(tj3Var2, vj8Var.mo12420a(0.5f, b16Var, true));
            e16 e16VarMo12420a3 = vj8Var.mo12420a(1.0f, b16Var, true);
            bb1 bb1VarM230a3 = ab1.m230a(c3587su3, ec0Var, tj3Var2, 48);
            int iHashCode6 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m6 = tj3Var2.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var2, e16VarMo12420a3);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var4, bb1VarM230a3);
            oha.m18001g(tj3Var2, zi3Var8, l77VarM22132m6);
            AbstractC3393o1.m17747v(iHashCode6, tj3Var2, zi3Var9, tj3Var2, vi3Var3);
            oha.m18001g(tj3Var2, zi3Var10, e16VarM1322c6);
            if (z) {
                tj3Var2.m22111b0(-1018577274);
                z5 = false;
                tj3Var2.m22139q(false);
                j3 = j;
            } else {
                z5 = false;
                tj3Var2.m22111b0(-1018575826);
                j3 = ((aa1) ((xc9) cx2.m9917a(tj3Var2).f9126n).getValue()).f414a;
                tj3Var2.m22139q(false);
            }
            e16 e16VarM20387m3 = r46.m20387m(b16Var, 1.0f, j3, p58.m18901i(tj3Var2).f64856b);
            gc0 gc0Var3 = gc0Var;
            ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var3, z5);
            b16 b16Var3 = b16Var;
            int iHashCode7 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m7 = tj3Var2.m22132m();
            e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var2, e16VarM20387m3);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var4, ht5VarM19966d3);
            oha.m18001g(tj3Var2, zi3Var8, l77VarM22132m7);
            AbstractC3393o1.m17747v(iHashCode7, tj3Var2, zi3Var9, tj3Var2, vi3Var3);
            oha.m18001g(tj3Var2, zi3Var10, e16VarM1322c7);
            e16 e16VarM21607T3 = AbstractC3584sr.m21607T(c99.m4412e(b16Var3, 1.0f), ge9.m12515a(tj3Var2).f38955d);
            int i10 = vk8Var.f65544c;
            lw9.m16554b((i10 < 10 ? "0" : "") + i10, e16VarM21607T3, 0L, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 1, 0, null, vx9Var3, tj3Var2, 0, 24576, 113660);
            tj3Var2.m22139q(true);
            String strM23620a2 = vz1.m23620a0(tj3Var2, com.lingq.core.premium.R$string.ui_minutes);
            vx9 vx9Var6 = p58.m18902j(tj3Var2).f71408l;
            if (z) {
                tj3Var2.m22111b0(-1018550326);
                jM4210c2 = p58.m18900f(tj3Var2).f55873q;
                z6 = false;
            } else {
                z6 = false;
                tj3Var2.m22111b0(-1018548759);
                jM4210c2 = cx2.m9917a(tj3Var2).m4210c();
            }
            tj3Var2.m22139q(z6);
            lw9.m16554b(strM23620a2, null, jM4210c2, null, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, vx9Var6, tj3Var2, 0, 24576, 114682);
            tj3Var2.m22139q(true);
            thb.m22044c(tj3Var2, vj8Var.mo12420a(0.5f, b16Var3, true));
            e16 e16VarMo12420a4 = vj8Var.mo12420a(1.0f, b16Var3, true);
            bb1 bb1VarM230a4 = ab1.m230a(c3587su3, ec0Var, tj3Var2, 48);
            int iHashCode8 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m8 = tj3Var2.m22132m();
            e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var2, e16VarMo12420a4);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var4, bb1VarM230a4);
            oha.m18001g(tj3Var2, zi3Var8, l77VarM22132m8);
            AbstractC3393o1.m17747v(iHashCode8, tj3Var2, zi3Var9, tj3Var2, vi3Var3);
            oha.m18001g(tj3Var2, zi3Var10, e16VarM1322c8);
            if (z) {
                tj3Var2.m22111b0(-1426600889);
                z7 = false;
                tj3Var2.m22139q(false);
                j4 = j;
            } else {
                z7 = false;
                tj3Var2.m22111b0(-1426599441);
                j4 = ((aa1) ((xc9) cx2.m9917a(tj3Var2).f9126n).getValue()).f414a;
                tj3Var2.m22139q(false);
            }
            e16 e16VarM20387m4 = r46.m20387m(b16Var3, 1.0f, j4, p58.m18901i(tj3Var2).f64856b);
            ht5 ht5VarM19966d4 = qh0.m19966d(gc0Var3, z7);
            int iHashCode9 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m9 = tj3Var2.m22132m();
            e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var2, e16VarM20387m4);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var4, ht5VarM19966d4);
            oha.m18001g(tj3Var2, zi3Var8, l77VarM22132m9);
            AbstractC3393o1.m17747v(iHashCode9, tj3Var2, zi3Var9, tj3Var2, vi3Var3);
            oha.m18001g(tj3Var2, zi3Var10, e16VarM1322c9);
            e16 e16VarM21607T4 = AbstractC3584sr.m21607T(c99.m4412e(b16Var3, 1.0f), ge9.m12515a(tj3Var2).f38955d);
            vk8Var2 = vk8Var;
            int i11 = vk8Var2.f65545d;
            lw9.m16554b((i11 < 10 ? "0" : "") + i11, e16VarM21607T4, 0L, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 1, 0, null, vx9Var3, tj3Var2, 0, 24576, 113660);
            tj3Var2.m22139q(true);
            String strM23620a3 = vz1.m23620a0(tj3Var2, com.lingq.core.premium.R$string.ui_seconds);
            vx9 vx9Var7 = p58.m18902j(tj3Var2).f71408l;
            if (z) {
                tj3Var2.m22111b0(-1426573909);
                jM4210c3 = p58.m18900f(tj3Var2).f55873q;
                z8 = false;
            } else {
                z8 = false;
                tj3Var2.m22111b0(-1426572342);
                jM4210c3 = cx2.m9917a(tj3Var2).m4210c();
            }
            tj3Var2.m22139q(z8);
            lw9.m16554b(strM23620a3, null, jM4210c3, null, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, vx9Var7, tj3Var2, 0, 24576, 114682);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: kia
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u9d.m22641e(vk8Var2, e16Var, j, z, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m22642f(it1 it1Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-688411601);
        int i2 = i | (tj3Var.m22124i(it1Var) ? 4 : 2) | 48;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            b16 b16Var = b16.f7762a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(r46.m20387m(d32.m10007D(pb1.m19045o(c99.m4412e(b16Var, 1.0f), ui8.m22753b(ge9.m12515a(tj3Var).f38957f)), p58.m18900f(tj3Var).f55825J, ss5.f61356d), 1.0f, p58.m18900f(tj3Var).f55817B, ui8.m22753b(ge9.m12515a(tj3Var).f38957f)), ge9.m12515a(tj3Var).f38959h, ge9.m12515a(tj3Var).f38958g);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38956e, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            int i3 = R$string.cup_your_rank_in_team;
            String str = it1Var.f44520b;
            if (str == null) {
                str = "";
            }
            String strM23618Z = vz1.m23618Z(i3, new Object[]{AbstractC3352my.m17093L(context, str)}, tj3Var);
            Locale locale = Locale.ROOT;
            String upperCase = strM23618Z.toUpperCase(locale);
            upperCase.getClass();
            lw9.m16554b(upperCase, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71410n, tj3Var, 0, 0, 130042);
            Object obj = it1Var.f44521c;
            if (obj == null) {
                obj = "–";
            }
            lw9.m16554b(AbstractC3393o1.m17733h(obj, "#"), null, xs1.f68608a, null, 0L, new wb3(1), null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71398b, tj3Var, 384, 0, 131034);
            int i4 = R$string.cup_of_contributors_coins;
            Integer num = it1Var.f44523e;
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
            Integer num2 = it1Var.f44522d;
            String upperCase2 = vz1.m23618Z(i4, new Object[]{numValueOf, String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(num2 != null ? num2.intValue() : 0)}, 1))}, tj3Var).toUpperCase(locale);
            upperCase2.getClass();
            lw9.m16554b(upperCase2, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71410n, tj3Var, 0, 0, 130042);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(it1Var, e16Var2, i, 24);
        }
    }
}
