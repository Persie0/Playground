package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.reader.video.components.AbstractC2587a;
import java.time.LocalDate;
import java.util.WeakHashMap;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f6d {
    /* JADX INFO: renamed from: a */
    public static final void m11576a(tpa tpaVar, dsa dsaVar, hqa hqaVar, wz7 wz7Var, e08 e08Var, hx7 hx7Var, nz9 nz9Var, du7 du7Var, qbb qbbVar, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ye1 ye1Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        tpaVar.getClass();
        dsaVar.getClass();
        hqaVar.getClass();
        wz7Var.getClass();
        e08Var.getClass();
        hx7Var.getClass();
        nz9Var.getClass();
        du7Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        vi3Var3.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(855847114);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(tpaVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22120g(dsaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22120g(hqaVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22120g(wz7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22120g(e08Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= tj3Var.m22120g(hx7Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= (i & 2097152) == 0 ? tj3Var.m22120g(nz9Var) : tj3Var.m22124i(nz9Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= (i & 16777216) == 0 ? tj3Var.m22120g(du7Var) : tj3Var.m22124i(du7Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= tj3Var.m22120g(qbbVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (tj3Var.m22124i(vi3Var2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var.m22124i(vi3Var3) ? 32 : 16;
        }
        int i7 = i4;
        if (tj3Var.m22099R(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true)) {
            long jM21440a = skc.m21440a(nz9Var.f53460f, AbstractC3423or.m18217B(tj3Var));
            if (aa1.m199c(jM21440a, aa1.f412k)) {
                z = false;
                tj3Var.m22111b0(1616279399);
                jM21440a = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55872p;
            } else {
                tj3Var.m22111b0(1616242137);
                z = false;
            }
            tj3Var.m22139q(z);
            long j = jM21440a;
            b16 b16Var = b16.f7762a;
            e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var, 1.0f), j, ss5.f61356d);
            WeakHashMap weakHashMap = l6b.f49204w;
            e16 e16VarM23904F = wfb.m23904F(wfb.m23904F(e16VarM10007D, ho5.m13397r(tj3Var).f49210f), ho5.m13397r(tj3Var).f49209e);
            C3587su c3587su = eh0.f37238d;
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM23904F);
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
            vi3 vi3Var4 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var4);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            boolean z3 = du7Var instanceof cu7;
            int i8 = z3 ? ((cu7) du7Var).f34549b : 0;
            int i9 = z3 ? ((cu7) du7Var).f34548a : 0;
            int i10 = z3 ? ((cu7) du7Var).f34550c : 0;
            int i11 = i9 > 0 ? i8 - 1 : 0;
            int i12 = i10;
            boolean z4 = wz7Var.f67572i;
            boolean z5 = tpaVar.f62712g;
            int i13 = i7 & 112;
            boolean z6 = i13 == 32;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z6 || objM22097O == p84Var) {
                objM22097O = new ex8(vi3Var3, 18);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var2 = (ui3) objM22097O;
            boolean z7 = i13 == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z7 || objM22097O2 == p84Var) {
                objM22097O2 = new ex8(vi3Var3, 19);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3 ui3Var3 = (ui3) objM22097O2;
            int i14 = i6 & 1879048192;
            boolean z8 = i14 == 536870912;
            Object objM22097O3 = tj3Var.m22097O();
            if (z8 || objM22097O3 == p84Var) {
                objM22097O3 = new ex8(vi3Var, 20);
                tj3Var.m22131l0(objM22097O3);
            }
            ui3 ui3Var4 = (ui3) objM22097O3;
            boolean z9 = i14 == 536870912;
            Object objM22097O4 = tj3Var.m22097O();
            if (z9 || objM22097O4 == p84Var) {
                objM22097O4 = new ex8(vi3Var, 21);
                tj3Var.m22131l0(objM22097O4);
            }
            ui3 ui3Var5 = (ui3) objM22097O4;
            boolean z10 = i14 == 536870912;
            Object objM22097O5 = tj3Var.m22097O();
            if (z10 || objM22097O5 == p84Var) {
                objM22097O5 = new cx8(vi3Var, 7);
                tj3Var.m22131l0(objM22097O5);
            }
            vi3 vi3Var5 = (vi3) objM22097O5;
            boolean z11 = i14 == 536870912;
            Object objM22097O6 = tj3Var.m22097O();
            if (z11 || objM22097O6 == p84Var) {
                objM22097O6 = new cx8(vi3Var, 8);
                tj3Var.m22131l0(objM22097O6);
            }
            vi3 vi3Var6 = (vi3) objM22097O6;
            boolean z12 = i14 == 536870912;
            Object objM22097O7 = tj3Var.m22097O();
            if (z12 || objM22097O7 == p84Var) {
                objM22097O7 = new ex8(vi3Var, 22);
                tj3Var.m22131l0(objM22097O7);
            }
            xkc.m24603a(i11, i9, i12, i9, z4, z5, true, ui3Var2, ui3Var3, ui3Var4, ui3Var5, vi3Var5, vi3Var6, (ui3) objM22097O7, null, tj3Var, 1572864, 16384);
            if (tpaVar.f62712g && tpaVar.f62706a.isEmpty()) {
                tj3Var.m22111b0(-1469369173);
                boolean z13 = i13 == 32;
                Object objM22097O8 = tj3Var.m22097O();
                if (z13 || objM22097O8 == p84Var) {
                    objM22097O8 = new ex8(vi3Var3, 23);
                    tj3Var.m22131l0(objM22097O8);
                }
                qjc.m20010a(0, tj3Var, (ui3) objM22097O8);
                tj3Var.m22139q(false);
                z2 = true;
                i5 = 14;
            } else {
                tj3Var.m22111b0(-1469206795);
                e16 e16VarM4412e = c99.m4412e(new as4(1.0f, true), 1.0f);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                if (0.4f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                e16 e16VarM4410c = c99.m4410c(new as4(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true), 1.0f);
                zf1 zf1Var = ge9.f40637a;
                e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4410c, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 0.0f, 0.0f, 14);
                bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var, 0);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38952a));
                int i15 = i6 & 14;
                int i16 = i6 >> 18;
                nad.m17305a(tpaVar, hqaVar, qbbVar, vi3Var, null, tj3Var, ((i6 >> 3) & 112) | i15 | (i16 & 896) | (i16 & 7168));
                tj3Var = tj3Var;
                int i17 = i6 >> 6;
                mad.m16719a(hqaVar, vi3Var, null, tj3Var, (i17 & 14) | ((i6 >> 24) & 112));
                tj3Var.m22139q(true);
                if (0.6f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                e16 e16VarM4410c2 = c99.m4410c(new as4(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true), 1.0f);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM4410c2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
                AbstractC2587a.m9515c(tpaVar, wz7Var, e08Var, nz9Var, vi3Var, c99.m4411d(b16Var, 1.0f), tj3Var, (i17 & 896) | i15 | 196608 | (i17 & 112) | 4096 | ((i6 >> 9) & 7168) | ((i6 >> 15) & 57344));
                e16 e16VarM4414g = c99.m4414g(c99.m4412e(ci0.f10109a.mo3727a(b16Var, nj0.f52809d), 1.0f), ((fe9) tj3Var.m22128k(zf1Var)).f38958g);
                i5 = 14;
                qh0.m19963a(d32.m10006C(e16VarM4414g, ui0.m22749e(vi0.Companion, vz1.m23605K(new aa1(j), new aa1(aa1.f411j)), 0.0f, 0.0f, 14)), tj3Var, 0);
                z2 = true;
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z2);
            int i18 = i7 << 12;
            pad.m19011a(dsaVar, nz9Var, hx7Var, vi3Var, vi3Var2, vi3Var3, tj3Var, ((i6 >> 3) & i5) | 64 | ((i6 >> 15) & 112) | ((i6 >> 9) & 896) | ((i6 >> 18) & 7168) | (i18 & 57344) | (i18 & 458752));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gl4(tpaVar, dsaVar, hqaVar, wz7Var, e08Var, hx7Var, nz9Var, du7Var, qbbVar, vi3Var, vi3Var2, vi3Var3, i, i2, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Long m11577b(String str) {
        Object failure;
        try {
            failure = Long.valueOf(LocalDate.parse(vk9.m23375K0(10, str)).toEpochDay());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Long) failure;
    }
}
