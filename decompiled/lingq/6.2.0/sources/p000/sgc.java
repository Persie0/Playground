package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.reader.video.components.AbstractC2587a;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sgc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f60850a = new C0282a(-1475607902, false, new zd1(9));

    /* JADX INFO: renamed from: b */
    public static final C0282a f60851b = new C0282a(-1948843552, false, new zd1(10));

    /* JADX INFO: renamed from: c */
    public static final C0282a f60852c = new C0282a(2109505919, false, new zd1(11));

    /* JADX INFO: renamed from: a */
    public static final void m21368a(tpa tpaVar, dsa dsaVar, hqa hqaVar, wz7 wz7Var, e08 e08Var, hx7 hx7Var, nz9 nz9Var, du7 du7Var, qbb qbbVar, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ye1 ye1Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
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
        tj3Var.m22115d0(1070534856);
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
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (tj3Var.m22124i(vi3Var2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var.m22124i(vi3Var3) ? 32 : 16;
        }
        int i6 = i4;
        if (tj3Var.m22099R(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true)) {
            long jM21440a = skc.m21440a(nz9Var.f53460f, AbstractC3423or.m18217B(tj3Var));
            if (aa1.m199c(jM21440a, aa1.f412k)) {
                z = false;
                tj3Var.m22111b0(-2122476663);
                jM21440a = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55872p;
            } else {
                tj3Var.m22111b0(-2122513925);
                z = false;
            }
            tj3Var.m22139q(z);
            long j = jM21440a;
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            mv3 mv3Var = ss5.f61356d;
            e16 e16VarM10007D = d32.m10007D(e16VarM4411d, j, mv3Var);
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
            boolean z2 = du7Var instanceof cu7;
            int i7 = z2 ? ((cu7) du7Var).f34549b : 0;
            int i8 = z2 ? ((cu7) du7Var).f34548a : 0;
            int i9 = z2 ? ((cu7) du7Var).f34550c : 0;
            int i10 = i8 > 0 ? i7 - 1 : 0;
            int i11 = i9;
            boolean z3 = wz7Var.f67572i;
            boolean z4 = tpaVar.f62712g;
            int i12 = i6 & 112;
            boolean z5 = i12 == 32;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z5 || objM22097O == p84Var) {
                objM22097O = new th7(vi3Var3, 1);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var2 = (ui3) objM22097O;
            boolean z6 = i12 == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z6 || objM22097O2 == p84Var) {
                objM22097O2 = new th7(vi3Var3, 2);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3 ui3Var3 = (ui3) objM22097O2;
            int i13 = i5 & 1879048192;
            boolean z7 = i13 == 536870912;
            Object objM22097O3 = tj3Var.m22097O();
            if (z7 || objM22097O3 == p84Var) {
                objM22097O3 = new th7(vi3Var, 3);
                tj3Var.m22131l0(objM22097O3);
            }
            ui3 ui3Var4 = (ui3) objM22097O3;
            boolean z8 = i13 == 536870912;
            Object objM22097O4 = tj3Var.m22097O();
            if (z8 || objM22097O4 == p84Var) {
                objM22097O4 = new th7(vi3Var, 4);
                tj3Var.m22131l0(objM22097O4);
            }
            ui3 ui3Var5 = (ui3) objM22097O4;
            boolean z9 = i13 == 536870912;
            Object objM22097O5 = tj3Var.m22097O();
            if (z9 || objM22097O5 == p84Var) {
                objM22097O5 = new i75(vi3Var, 28);
                tj3Var.m22131l0(objM22097O5);
            }
            vi3 vi3Var5 = (vi3) objM22097O5;
            boolean z10 = i13 == 536870912;
            Object objM22097O6 = tj3Var.m22097O();
            if (z10 || objM22097O6 == p84Var) {
                objM22097O6 = new i75(vi3Var, 29);
                tj3Var.m22131l0(objM22097O6);
            }
            vi3 vi3Var6 = (vi3) objM22097O6;
            boolean z11 = i13 == 536870912;
            Object objM22097O7 = tj3Var.m22097O();
            if (z11 || objM22097O7 == p84Var) {
                objM22097O7 = new th7(vi3Var, 5);
                tj3Var.m22131l0(objM22097O7);
            }
            xkc.m24603a(i10, i8, i11, i8, z3, z4, true, ui3Var2, ui3Var3, ui3Var4, ui3Var5, vi3Var5, vi3Var6, (ui3) objM22097O7, null, tj3Var, 1572864, 16384);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM10007D2 = d32.m10007D(pb1.m19045o(c99.m4412e(AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 2), 1.0f), ui8.m22753b(12.0f)), aa1.f403b, mv3Var);
            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM10007D2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            int i14 = i5 & 14;
            int i15 = i5 >> 3;
            int i16 = i5 >> 18;
            int i17 = (i15 & 112) | i14 | (i16 & 896);
            int i18 = i16 & 7168;
            boolean z12 = true;
            nad.m17305a(tpaVar, hqaVar, qbbVar, vi3Var, null, tj3Var, i17 | i18);
            tj3Var = tj3Var;
            int i19 = i5 >> 6;
            ngc.m17429a(hqaVar, vi3Var, null, tj3Var, (i19 & 14) | ((i5 >> 24) & 112));
            tj3Var.m22139q(true);
            if (tpaVar.f62712g && tpaVar.f62706a.isEmpty()) {
                tj3Var.m22111b0(1201905805);
                boolean z13 = i12 == 32;
                Object objM22097O8 = tj3Var.m22097O();
                if (z13 || objM22097O8 == p84Var) {
                    objM22097O8 = new th7(vi3Var3, 6);
                    tj3Var.m22131l0(objM22097O8);
                }
                qjc.m20010a(0, tj3Var, (ui3) objM22097O8);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1202034517);
                as4 as4Var = new as4(1.0f, true);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, as4Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                AbstractC2587a.m9515c(tpaVar, wz7Var, e08Var, nz9Var, vi3Var, c99.m4411d(b16Var, 1.0f), tj3Var, (i19 & 896) | i14 | 196608 | (i19 & 112) | 4096 | ((i5 >> 9) & 7168) | ((i5 >> 15) & 57344));
                qh0.m19963a(d32.m10006C(c99.m4414g(c99.m4412e(ci0.f10109a.mo3727a(b16Var, nj0.f52809d), 1.0f), ((fe9) tj3Var.m22128k(zf1Var)).f38958g), ui0.m22749e(vi0.Companion, vz1.m23605K(new aa1(j), new aa1(aa1.f411j)), 0.0f, 0.0f, 14)), tj3Var, 0);
                z12 = true;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z12);
            int i20 = i6 << 12;
            pad.m19011a(dsaVar, nz9Var, hx7Var, vi3Var, vi3Var2, vi3Var3, tj3Var, (i15 & 14) | 64 | ((i5 >> 15) & 112) | ((i5 >> 9) & 896) | i18 | (i20 & 57344) | (i20 & 458752));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gl4(tpaVar, dsaVar, hqaVar, wz7Var, e08Var, hx7Var, nz9Var, du7Var, qbbVar, vi3Var, vi3Var2, vi3Var3, i, i2, 1);
        }
    }
}
