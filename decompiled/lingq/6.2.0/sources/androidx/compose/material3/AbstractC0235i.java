package androidx.compose.material3;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.core.C0059a;
import androidx.compose.material3.AbstractC0235i;
import androidx.compose.material3.AbstractC0262s;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import p000.AbstractC2942dw;
import p000.AbstractC2979ew;
import p000.AbstractC3393o1;
import p000.C0817bn;
import p000.C3013ft;
import p000.InterfaceC3624tu;
import p000.a02;
import p000.aa1;
import p000.b16;
import p000.cea;
import p000.ci8;
import p000.d11;
import p000.d32;
import p000.e11;
import p000.e16;
import p000.e43;
import p000.f43;
import p000.fs0;
import p000.g11;
import p000.ho9;
import p000.iu8;
import p000.ju8;
import p000.kn9;
import p000.l43;
import p000.lj7;
import p000.lw9;
import p000.ms5;
import p000.nv8;
import p000.o39;
import p000.p84;
import p000.pa1;
import p000.pk9;
import p000.ps5;
import p000.pvc;
import p000.q84;
import p000.q93;
import p000.ra1;
import p000.rv3;
import p000.sk1;
import p000.t17;
import p000.t66;
import p000.tj3;
import p000.u91;
import p000.ui3;
import p000.v56;
import p000.vf0;
import p000.vi3;
import p000.vx9;
import p000.we1;
import p000.x17;
import p000.x18;
import p000.x49;
import p000.xc9;
import p000.xj2;
import p000.xk2;
import p000.ye1;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.material3.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0235i {

    /* JADX INFO: renamed from: a */
    public static final d11 f3440a = new d11(kn9.f47562a);

    /* JADX INFO: renamed from: b */
    public static final float f3441b = 1000.0f;

    /* JADX INFO: renamed from: a */
    public static final void m1158a(final C0282a c0282a, final vx9 vx9Var, final long j, final long j2, final long j3, final float f, final InterfaceC3624tu interfaceC3624tu, final t17 t17Var, final l43 l43Var, final l43 l43Var2, final l43 l43Var3, final l43 l43Var4, ye1 ye1Var, final int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1255048750);
        int i2 = i | (tj3Var.m22124i(c0282a) ? 4 : 2) | (tj3Var.m22120g(vx9Var) ? 32 : 16) | (tj3Var.m22118f(j) ? 256 : 128) | (tj3Var.m22124i(null) ? 2048 : 1024) | (tj3Var.m22124i(null) ? 16384 : 8192) | (tj3Var.m22124i(null) ? 131072 : 65536) | (tj3Var.m22118f(j2) ? 1048576 : 524288) | (tj3Var.m22118f(j3) ? 8388608 : 4194304) | (tj3Var.m22114d(f) ? 67108864 : 33554432) | (tj3Var.m22120g(interfaceC3624tu) ? 536870912 : 268435456);
        if (tj3Var.m22099R(i2 & 1, ((i2 & 306783379) == 306783378 && ((((((tj3Var.m22120g(t17Var) ? (char) 4 : (char) 2) | (tj3Var.m22124i(l43Var) ? ' ' : (char) 16)) | (tj3Var.m22124i(l43Var2) ? 256 : 128)) | (tj3Var.m22124i(l43Var3) ? 2048 : 1024)) | (tj3Var.m22124i(l43Var4) ? (char) 16384 : (char) 8192)) & 9363) == 9362) ? false : true)) {
            pvc.m19508d(new a02[]{AbstractC3393o1.m17727b(j, sk1.f60948a), lw9.f50220a.mo1265a(vx9Var)}, ci8.m4703P(-881676654, new zi3() { // from class: n11
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        float f2 = AbstractC0235i.f3441b;
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4409b(c99.m4428u(b16Var, 0.0f, f2, 1), 0.0f, f, 1), t17Var);
                        fc0 fc0Var = nj0.f52789H;
                        sj8 sj8VarM20003a = qj8.m20003a(interfaceC3624tu, fc0Var, tj3Var2, 48);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21606S);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var2, vi3Var);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                        gc0 gc0Var = nj0.f52808c;
                        ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                        int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m2 = tj3Var2.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, b16Var);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                        ec0 ec0Var = nj0.f52791J;
                        l43 l43Var5 = l43Var3;
                        vs2 vs2VarM767b = AbstractC0070i.m767b(l43Var5, ec0Var, 12);
                        l43 l43Var6 = l43Var;
                        vs2 vs2VarM23531a = vs2VarM767b.m23531a(AbstractC0070i.m772g(l43Var6, 0.0f, 2));
                        l43 l43Var7 = l43Var4;
                        qv2 qv2VarM774i = AbstractC0070i.m774i(l43Var7, ec0Var, 12);
                        l43 l43Var8 = l43Var2;
                        qv2 qv2VarM20180a = qv2VarM774i.m20180a(AbstractC0070i.m773h(l43Var8, 2));
                        final int i3 = 0;
                        final long j4 = j2;
                        AbstractC0054a.m730e(false, null, vs2VarM23531a, qv2VarM20180a, null, ci8.m4703P(-181659180, new aj3() { // from class: q11
                            @Override // p000.aj3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i4 = i3;
                                xfa xfaVar = xfa.f68157a;
                                b16 b16Var2 = b16.f7762a;
                                p84 p84Var = we1.f66679a;
                                long j5 = j4;
                                ye1 ye1Var3 = (ye1) obj4;
                                ((Integer) obj5).getClass();
                                switch (i4) {
                                    case 0:
                                        AbstractC0235i.m1164g(j5, ye1Var3);
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        Object objM22097O = tj3Var3.m22097O();
                                        if (objM22097O == p84Var) {
                                            objM22097O = AbstractC0278f.m1260j(null);
                                            tj3Var3.m22131l0(objM22097O);
                                        }
                                        t66 t66Var = (t66) objM22097O;
                                        ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52812g, false);
                                        int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                                        l77 l77VarM22132m3 = tj3Var3.m22132m();
                                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(ye1Var3, b16Var2);
                                        se1.f60731q.getClass();
                                        ui3 ui3Var2 = C0352b.f4299b;
                                        tj3 tj3Var4 = (tj3) ye1Var3;
                                        tj3Var4.m22119f0();
                                        if (tj3Var4.f62384S) {
                                            tj3Var4.m22130l(ui3Var2);
                                        } else {
                                            tj3Var4.m22137o0();
                                        }
                                        oha.m18001g(ye1Var3, C0352b.f4303f, ht5VarM19966d2);
                                        oha.m18001g(ye1Var3, C0352b.f4302e, l77VarM22132m3);
                                        oha.m18001g(ye1Var3, C0352b.f4304g, Integer.valueOf(iHashCode3));
                                        oha.m18000f(ye1Var3, C0352b.f4305h);
                                        oha.m18001g(ye1Var3, C0352b.f4301d, e16VarM1322c3);
                                        zi3 zi3Var5 = (zi3) t66Var.getValue();
                                        if (zi3Var5 == null) {
                                            tj3Var4.m22111b0(2094511935);
                                        } else {
                                            tj3Var4.m22111b0(1037396226);
                                            zi3Var5.invoke(ye1Var3, 0);
                                        }
                                        tj3Var4.m22139q(false);
                                        tj3Var4.m22139q(true);
                                        break;
                                    default:
                                        AbstractC0235i.m1165h(j5, ye1Var3);
                                        tj3 tj3Var5 = (tj3) ye1Var3;
                                        Object objM22097O2 = tj3Var5.m22097O();
                                        if (objM22097O2 == p84Var) {
                                            objM22097O2 = AbstractC0278f.m1260j(null);
                                            tj3Var5.m22131l0(objM22097O2);
                                        }
                                        t66 t66Var2 = (t66) objM22097O2;
                                        ht5 ht5VarM19966d3 = qh0.m19966d(nj0.f52812g, false);
                                        int iHashCode4 = Long.hashCode(tj3Var5.f62385T);
                                        l77 l77VarM22132m4 = tj3Var5.m22132m();
                                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(ye1Var3, b16Var2);
                                        se1.f60731q.getClass();
                                        ui3 ui3Var3 = C0352b.f4299b;
                                        tj3 tj3Var6 = (tj3) ye1Var3;
                                        tj3Var6.m22119f0();
                                        if (tj3Var6.f62384S) {
                                            tj3Var6.m22130l(ui3Var3);
                                        } else {
                                            tj3Var6.m22137o0();
                                        }
                                        oha.m18001g(ye1Var3, C0352b.f4303f, ht5VarM19966d3);
                                        oha.m18001g(ye1Var3, C0352b.f4302e, l77VarM22132m4);
                                        oha.m18001g(ye1Var3, C0352b.f4304g, Integer.valueOf(iHashCode4));
                                        oha.m18000f(ye1Var3, C0352b.f4305h);
                                        oha.m18001g(ye1Var3, C0352b.f4301d, e16VarM1322c4);
                                        zi3 zi3Var6 = (zi3) t66Var2.getValue();
                                        if (zi3Var6 == null) {
                                            tj3Var6.m22111b0(-657207800);
                                        } else {
                                            tj3Var6.m22111b0(671536409);
                                            zi3Var6.invoke(ye1Var3, 0);
                                        }
                                        tj3Var6.m22139q(false);
                                        tj3Var6.m22139q(true);
                                        break;
                                }
                                return xfaVar;
                            }
                        }, tj3Var2), tj3Var2, 1572870, 18);
                        tj3Var2.m22111b0(-37113233);
                        thb.m22044c(tj3Var2, c99.m4426s(b16Var, 0.0f));
                        tj3Var2.m22139q(false);
                        tj3Var2.m22139q(true);
                        if (1.0f <= 0.0d) {
                            g54.m12362a("invalid weight; must be greater than zero");
                        }
                        as4 as4Var = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                        sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var2, 54);
                        int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m3 = tj3Var2.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, as4Var);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a2);
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m3);
                        AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c3);
                        wq1.m24128x(0, c0282a, tj3Var2, true);
                        ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                        int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m4 = tj3Var2.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, b16Var);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d2);
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m4);
                        AbstractC3393o1.m17747v(iHashCode4, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c4);
                        ec0 ec0Var2 = nj0.f52793L;
                        vs2 vs2VarM23531a2 = AbstractC0070i.m767b(l43Var5, ec0Var2, 12).m23531a(AbstractC0070i.m772g(l43Var6, 0.0f, 2));
                        qv2 qv2VarM20180a2 = AbstractC0070i.m774i(l43Var7, ec0Var2, 12).m20180a(AbstractC0070i.m773h(l43Var8, 2));
                        final long j5 = j3;
                        final int i4 = 1;
                        AbstractC0054a.m730e(false, null, vs2VarM23531a2, qv2VarM20180a2, null, ci8.m4703P(-1090690805, new aj3() { // from class: q11
                            @Override // p000.aj3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i5 = i4;
                                xfa xfaVar = xfa.f68157a;
                                b16 b16Var2 = b16.f7762a;
                                p84 p84Var = we1.f66679a;
                                long j6 = j5;
                                ye1 ye1Var3 = (ye1) obj4;
                                ((Integer) obj5).getClass();
                                switch (i5) {
                                    case 0:
                                        AbstractC0235i.m1164g(j6, ye1Var3);
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        Object objM22097O = tj3Var3.m22097O();
                                        if (objM22097O == p84Var) {
                                            objM22097O = AbstractC0278f.m1260j(null);
                                            tj3Var3.m22131l0(objM22097O);
                                        }
                                        t66 t66Var = (t66) objM22097O;
                                        ht5 ht5VarM19966d3 = qh0.m19966d(nj0.f52812g, false);
                                        int iHashCode5 = Long.hashCode(tj3Var3.f62385T);
                                        l77 l77VarM22132m5 = tj3Var3.m22132m();
                                        e16 e16VarM1322c5 = AbstractC0287b.m1322c(ye1Var3, b16Var2);
                                        se1.f60731q.getClass();
                                        ui3 ui3Var2 = C0352b.f4299b;
                                        tj3 tj3Var4 = (tj3) ye1Var3;
                                        tj3Var4.m22119f0();
                                        if (tj3Var4.f62384S) {
                                            tj3Var4.m22130l(ui3Var2);
                                        } else {
                                            tj3Var4.m22137o0();
                                        }
                                        oha.m18001g(ye1Var3, C0352b.f4303f, ht5VarM19966d3);
                                        oha.m18001g(ye1Var3, C0352b.f4302e, l77VarM22132m5);
                                        oha.m18001g(ye1Var3, C0352b.f4304g, Integer.valueOf(iHashCode5));
                                        oha.m18000f(ye1Var3, C0352b.f4305h);
                                        oha.m18001g(ye1Var3, C0352b.f4301d, e16VarM1322c5);
                                        zi3 zi3Var5 = (zi3) t66Var.getValue();
                                        if (zi3Var5 == null) {
                                            tj3Var4.m22111b0(2094511935);
                                        } else {
                                            tj3Var4.m22111b0(1037396226);
                                            zi3Var5.invoke(ye1Var3, 0);
                                        }
                                        tj3Var4.m22139q(false);
                                        tj3Var4.m22139q(true);
                                        break;
                                    default:
                                        AbstractC0235i.m1165h(j6, ye1Var3);
                                        tj3 tj3Var5 = (tj3) ye1Var3;
                                        Object objM22097O2 = tj3Var5.m22097O();
                                        if (objM22097O2 == p84Var) {
                                            objM22097O2 = AbstractC0278f.m1260j(null);
                                            tj3Var5.m22131l0(objM22097O2);
                                        }
                                        t66 t66Var2 = (t66) objM22097O2;
                                        ht5 ht5VarM19966d4 = qh0.m19966d(nj0.f52812g, false);
                                        int iHashCode6 = Long.hashCode(tj3Var5.f62385T);
                                        l77 l77VarM22132m6 = tj3Var5.m22132m();
                                        e16 e16VarM1322c6 = AbstractC0287b.m1322c(ye1Var3, b16Var2);
                                        se1.f60731q.getClass();
                                        ui3 ui3Var3 = C0352b.f4299b;
                                        tj3 tj3Var6 = (tj3) ye1Var3;
                                        tj3Var6.m22119f0();
                                        if (tj3Var6.f62384S) {
                                            tj3Var6.m22130l(ui3Var3);
                                        } else {
                                            tj3Var6.m22137o0();
                                        }
                                        oha.m18001g(ye1Var3, C0352b.f4303f, ht5VarM19966d4);
                                        oha.m18001g(ye1Var3, C0352b.f4302e, l77VarM22132m6);
                                        oha.m18001g(ye1Var3, C0352b.f4304g, Integer.valueOf(iHashCode6));
                                        oha.m18000f(ye1Var3, C0352b.f4305h);
                                        oha.m18001g(ye1Var3, C0352b.f4301d, e16VarM1322c6);
                                        zi3 zi3Var6 = (zi3) t66Var2.getValue();
                                        if (zi3Var6 == null) {
                                            tj3Var6.m22111b0(-657207800);
                                        } else {
                                            tj3Var6.m22111b0(671536409);
                                            zi3Var6.invoke(ye1Var3, 0);
                                        }
                                        tj3Var6.m22139q(false);
                                        tj3Var6.m22139q(true);
                                        break;
                                }
                                return xfaVar;
                            }
                        }, tj3Var2), tj3Var2, 1572870, 18);
                        tj3Var2.m22111b0(-1514776840);
                        thb.m22044c(tj3Var2, c99.m4426s(b16Var, 0.0f));
                        AbstractC3393o1.m17723A(tj3Var2, false, true, true);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 56);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(vx9Var, j, j2, j3, f, interfaceC3624tu, t17Var, l43Var, l43Var2, l43Var3, l43Var4, i) { // from class: o11

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ vx9 f53570b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f53571c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f53572d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f53573e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ float f53574f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ InterfaceC3624tu f53575g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ t17 f53576h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ l43 f53577i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ l43 f53578j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ l43 f53579k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ l43 f53580l;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC0235i.m1158a(this.f53569a, this.f53570b, this.f53571c, this.f53572d, this.f53573e, this.f53574f, this.f53575g, this.f53576h, this.f53577i, this.f53578j, this.f53579k, this.f53580l, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1159b(final ui3 ui3Var, final C0282a c0282a, e16 e16Var, boolean z, o39 o39Var, e11 e11Var, g11 g11Var, vf0 vf0Var, InterfaceC3624tu interfaceC3624tu, t17 t17Var, ye1 ye1Var, final int i) {
        final e16 e16Var2;
        final boolean z2;
        final o39 o39Var2;
        final e11 e11Var2;
        final g11 g11Var2;
        final vf0 vf0Var2;
        final InterfaceC3624tu interfaceC3624tu2;
        final t17 t17Var2;
        t17 t17Var3;
        vf0 vf0Var3;
        InterfaceC3624tu interfaceC3624tu3;
        int i2;
        g11 g11Var3;
        e16 e16Var3;
        o39 o39Var3;
        boolean z3;
        e11 e11Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-696418916);
        int i3 = i | (tj3Var.m22124i(ui3Var) ? 4 : 2) | 306933120;
        if (tj3Var.m22099R(i3 & 1, (306783379 & i3) != 306783378)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                float f = AbstractC2942dw.f36283a;
                o39 o39VarM24271b = x49.m24271b(AbstractC2979ew.f37961a, tj3Var);
                pa1 pa1Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a;
                e11 e11Var4 = pa1Var.f55845b0;
                if (e11Var4 == null) {
                    long j = aa1.f411j;
                    long jM20491d = ra1.m20491d(pa1Var, AbstractC2979ew.f37969i);
                    ColorSchemeKeyTokens colorSchemeKeyTokens = AbstractC2979ew.f37973m;
                    long jM20491d2 = ra1.m20491d(pa1Var, colorSchemeKeyTokens);
                    long jM20491d3 = ra1.m20491d(pa1Var, colorSchemeKeyTokens);
                    long jM198b = aa1.m198b(AbstractC2979ew.f37963c, ra1.m20491d(pa1Var, AbstractC2979ew.f37962b));
                    ColorSchemeKeyTokens colorSchemeKeyTokens2 = AbstractC2979ew.f37971k;
                    long jM20491d4 = ra1.m20491d(pa1Var, colorSchemeKeyTokens2);
                    float f2 = AbstractC2979ew.f37972l;
                    e11 e11Var5 = new e11(j, jM20491d, jM20491d2, jM20491d3, j, jM198b, aa1.m198b(f2, jM20491d4), aa1.m198b(f2, ra1.m20491d(pa1Var, colorSchemeKeyTokens2)));
                    pa1Var.f55845b0 = e11Var5;
                    e11Var4 = e11Var5;
                }
                g11 g11Var4 = new g11(AbstractC2979ew.f37964d);
                long jM20492e = ra1.m20492e(AbstractC2979ew.f37967g, tj3Var);
                aa1.m198b(AbstractC2979ew.f37966f, ra1.m20492e(AbstractC2979ew.f37965e, tj3Var));
                vf0 vf0VarM4714a = ci8.m4714a(AbstractC2979ew.f37968h, jM20492e);
                x17 x17Var = AbstractC2942dw.f36284b;
                b16 b16Var = b16.f7762a;
                t17Var3 = x17Var;
                vf0Var3 = vf0VarM4714a;
                interfaceC3624tu3 = f3440a;
                i2 = i3 & (-2146959361);
                g11Var3 = g11Var4;
                e16Var3 = b16Var;
                o39Var3 = o39VarM24271b;
                z3 = true;
                e11Var3 = e11Var4;
            } else {
                tj3Var.m22102U();
                z3 = z;
                o39Var3 = o39Var;
                e11Var3 = e11Var;
                g11Var3 = g11Var;
                vf0Var3 = vf0Var;
                interfaceC3624tu3 = interfaceC3624tu;
                t17Var3 = t17Var;
                i2 = i3 & (-2146959361);
                e16Var3 = e16Var;
            }
            tj3Var.m22140r();
            m1160c(e16Var3, ui3Var, z3, c0282a, cea.m4600a(AbstractC2979ew.f37970j, tj3Var), z3 ? e11Var3.f36557b : e11Var3.f36561f, o39Var3, e11Var3, g11Var3, vf0Var3, AbstractC2942dw.f36283a, interfaceC3624tu3, t17Var3, tj3Var, 14159238 | ((i2 << 3) & 112), 221568);
            e16Var2 = e16Var3;
            z2 = z3;
            o39Var2 = o39Var3;
            e11Var2 = e11Var3;
            g11Var2 = g11Var3;
            vf0Var2 = vf0Var3;
            interfaceC3624tu2 = interfaceC3624tu3;
            t17Var2 = t17Var3;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z2 = z;
            o39Var2 = o39Var;
            e11Var2 = e11Var;
            g11Var2 = g11Var;
            vf0Var2 = vf0Var;
            interfaceC3624tu2 = interfaceC3624tu;
            t17Var2 = t17Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(c0282a, e16Var2, z2, o39Var2, e11Var2, g11Var2, vf0Var2, interfaceC3624tu2, t17Var2, i) { // from class: p11

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0282a f55415b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ e16 f55416c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f55417d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ o39 f55418e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ e11 f55419f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ g11 f55420g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ vf0 f55421h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ InterfaceC3624tu f55422i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ t17 f55423j;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(49);
                    AbstractC0235i.m1159b(this.f55414a, this.f55415b, this.f55416c, this.f55417d, this.f55418e, this.f55419f, this.f55420g, this.f55421h, this.f55422i, this.f55423j, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m1160c(final e16 e16Var, final ui3 ui3Var, final boolean z, final C0282a c0282a, final vx9 vx9Var, final long j, final o39 o39Var, final e11 e11Var, final g11 g11Var, final vf0 vf0Var, final float f, final InterfaceC3624tu interfaceC3624tu, final t17 t17Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        int i4;
        C0059a c0059a;
        boolean z2;
        C0817bn c0817bn;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1954811544);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22122h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22124i(c0282a) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22120g(vx9Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= tj3Var.m22118f(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= tj3Var.m22124i(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= tj3Var.m22124i(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= tj3Var.m22120g(o39Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tj3Var.m22120g(e11Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (tj3Var.m22120g(g11Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var.m22120g(vf0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= tj3Var.m22114d(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= tj3Var.m22120g(interfaceC3624tu) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i2 & 24576) == 0) {
            i4 |= tj3Var.m22120g(t17Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= tj3Var.m22120g(null) ? 131072 : 65536;
        }
        boolean z3 = true;
        if (tj3Var.m22099R(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
            tj3Var.m22111b0(329822563);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC3393o1.m17729d(tj3Var);
            }
            v56 v56Var = (v56) objM22097O;
            tj3Var.m22139q(false);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new C3013ft(11);
                tj3Var.m22131l0(objM22097O2);
            }
            e16 e16VarM17643c = nv8.m17643c(e16Var, false, (vi3) objM22097O2);
            long j2 = z ? e11Var.f36556a : e11Var.f36560e;
            if (g11Var == null) {
                tj3Var.m22111b0(330097470);
                tj3Var.m22139q(false);
                v56Var = v56Var;
                i5 = i5;
                c0817bn = null;
            } else {
                tj3Var.m22111b0(1673216291);
                int i6 = ((i5 >> 6) & 14) | ((i4 << 6) & 896);
                Object objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new SnapshotStateList();
                    tj3Var.m22131l0(objM22097O3);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) objM22097O3;
                Object objM22097O4 = tj3Var.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = AbstractC0278f.m1260j(null);
                    tj3Var.m22131l0(objM22097O4);
                }
                t66 t66Var = (t66) objM22097O4;
                boolean zM22120g = tj3Var.m22120g(v56Var);
                Object objM22097O5 = tj3Var.m22097O();
                if (zM22120g || objM22097O5 == p84Var) {
                    objM22097O5 = new ChipElevation$animateElevation$1$1(v56Var, snapshotStateList, null);
                    tj3Var.m22131l0(objM22097O5);
                }
                d32.m10047k(tj3Var, (zi3) objM22097O5, v56Var);
                q84 q84Var = (q84) u91.m22598P0(snapshotStateList);
                float f2 = (!z || (q84Var instanceof lj7) || (q84Var instanceof rv3) || (q84Var instanceof q93) || !(q84Var instanceof xk2)) ? 0.0f : g11Var.f40044a;
                Object objM22097O6 = tj3Var.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new C0059a(new xj2(f2), pk9.f56365j, null, 12);
                    tj3Var.m22131l0(objM22097O6);
                }
                C0059a c0059a2 = (C0059a) objM22097O6;
                xj2 xj2Var = new xj2(f2);
                boolean zM22124i = tj3Var.m22124i(c0059a2) | tj3Var.m22114d(f2);
                if ((((i6 & 14) ^ 6) <= 4 || !tj3Var.m22122h(z)) && (i6 & 6) != 4) {
                    z3 = false;
                }
                boolean zM22124i2 = zM22124i | z3 | tj3Var.m22124i(q84Var);
                Object objM22097O7 = tj3Var.m22097O();
                if (zM22124i2 || objM22097O7 == p84Var) {
                    c0059a = c0059a2;
                    z2 = false;
                    ChipElevation$animateElevation$2$1 chipElevation$animateElevation$2$1 = new ChipElevation$animateElevation$2$1(c0059a, f2, z, q84Var, t66Var, null);
                    tj3Var.m22131l0(chipElevation$animateElevation$2$1);
                    objM22097O7 = chipElevation$animateElevation$2$1;
                } else {
                    c0059a = c0059a2;
                    z2 = false;
                }
                d32.m10047k(tj3Var, (zi3) objM22097O7, xj2Var);
                c0817bn = c0059a.f1540c;
                tj3Var.m22139q(z2);
            }
            ho9.m13415b(ui3Var, e16VarM17643c, z, o39Var, j2, 0L, 0.0f, c0817bn != null ? ((xj2) ((xc9) c0817bn.f8704b).getValue()).f68285a : 0.0f, vf0Var, v56Var, ci8.m4703P(1333593699, new zi3() { // from class: h11
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e11 e11Var2 = e11Var;
                        boolean z4 = z;
                        AbstractC0235i.m1161d(c0282a, vx9Var, j, z4 ? e11Var2.f36558c : e11Var2.f36562g, z4 ? e11Var2.f36559d : e11Var2.f36563h, f, interfaceC3624tu, t17Var, tj3Var2, 24576);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, ((i5 >> 15) & 7168) | ((i5 >> 3) & 14) | (i5 & 896) | ((i4 << 21) & 234881024), 96);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: i11
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    AbstractC0235i.m1160c(e16Var, ui3Var, z, c0282a, vx9Var, j, o39Var, e11Var, g11Var, vf0Var, f, interfaceC3624tu, t17Var, (ye1) obj, iM19383z, iM19383z2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m1161d(final C0282a c0282a, final vx9 vx9Var, final long j, final long j2, final long j3, final float f, final InterfaceC3624tu interfaceC3624tu, final t17 t17Var, ye1 ye1Var, final int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(897958272);
        int i2 = i | (tj3Var.m22124i(c0282a) ? 4 : 2) | (tj3Var.m22120g(vx9Var) ? 32 : 16) | (tj3Var.m22118f(j) ? 256 : 128) | (tj3Var.m22124i(null) ? 2048 : 1024) | (tj3Var.m22124i(null) ? 131072 : 65536) | (tj3Var.m22118f(j2) ? 1048576 : 524288) | (tj3Var.m22118f(j3) ? 8388608 : 4194304) | (tj3Var.m22114d(f) ? 67108864 : 33554432) | (tj3Var.m22120g(interfaceC3624tu) ? 536870912 : 268435456);
        if (tj3Var.m22099R(i2 & 1, ((306783379 & i2) == 306783378 && ((tj3Var.m22120g(t17Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            pvc.m19508d(new a02[]{AbstractC3393o1.m17727b(j, sk1.f60948a), lw9.f50220a.mo1265a(vx9Var)}, ci8.m4703P(100316352, new fs0(f, t17Var, interfaceC3624tu, j2, c0282a, j3), tj3Var), tj3Var, 56);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(vx9Var, j, j2, j3, f, interfaceC3624tu, t17Var, i) { // from class: j11

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ vx9 f44877b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f44878c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f44879d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f44880e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ float f44881f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ InterfaceC3624tu f44882g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ t17 f44883h;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(24577);
                    AbstractC0235i.m1161d(this.f44876a, this.f44877b, this.f44878c, this.f44879d, this.f44880e, this.f44881f, this.f44882g, this.f44883h, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m1162e(final boolean z, final ui3 ui3Var, final C0282a c0282a, e16 e16Var, boolean z2, o39 o39Var, iu8 iu8Var, ju8 ju8Var, vf0 vf0Var, InterfaceC3624tu interfaceC3624tu, t17 t17Var, ye1 ye1Var, final int i) {
        final e16 e16Var2;
        final boolean z3;
        final o39 o39Var2;
        final iu8 iu8Var2;
        final ju8 ju8Var2;
        final vf0 vf0Var2;
        final InterfaceC3624tu interfaceC3624tu2;
        final t17 t17Var2;
        t17 t17Var3;
        InterfaceC3624tu interfaceC3624tu3;
        int i2;
        e16 e16Var3;
        boolean z4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1511159815);
        int i3 = i | (tj3Var.m22122h(z) ? 4 : 2) | (tj3Var.m22124i(ui3Var) ? 32 : 16) | 307981312;
        if (tj3Var.m22099R(i3 & 1, (306783379 & i3) != 306783378)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                float f = e43.f36690a;
                o39 o39VarM24271b = x49.m24271b(f43.f38389a, tj3Var);
                pa1 pa1Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a;
                iu8Var2 = pa1Var.f55847c0;
                if (iu8Var2 == null) {
                    long j = aa1.f411j;
                    iu8 iu8Var3 = new iu8(j, ra1.m20491d(pa1Var, f43.f38403o), ra1.m20491d(pa1Var, f43.f38407s), ra1.m20491d(pa1Var, f43.f38411w), j, aa1.m198b(f43.f38391c, ra1.m20491d(pa1Var, f43.f38390b)), aa1.m198b(f43.f38405q, ra1.m20491d(pa1Var, f43.f38404p)), aa1.m198b(f43.f38409u, ra1.m20491d(pa1Var, f43.f38408t)), ra1.m20491d(pa1Var, f43.f38397i), aa1.m198b(f43.f38394f, ra1.m20491d(pa1Var, f43.f38393e)), ra1.m20491d(pa1Var, f43.f38402n), ra1.m20491d(pa1Var, f43.f38406r), ra1.m20491d(pa1Var, f43.f38410v));
                    pa1Var.f55847c0 = iu8Var3;
                    iu8Var2 = iu8Var3;
                }
                ju8 ju8Var3 = new ju8(f43.f38398j, f43.f38392d);
                int i4 = i3 & (-2143289345);
                long jM20492e = ra1.m20492e(f43.f38399k, tj3Var);
                long j2 = aa1.f411j;
                aa1.m198b(f43.f38396h, ra1.m20492e(f43.f38395g, tj3Var));
                float f2 = f43.f38400l;
                if (z) {
                    jM20492e = j2;
                }
                if (z) {
                    f2 = 0.0f;
                }
                vf0 vf0VarM4714a = ci8.m4714a(f2, jM20492e);
                x17 x17Var = e43.f36691b;
                b16 b16Var = b16.f7762a;
                t17Var3 = x17Var;
                interfaceC3624tu3 = f3440a;
                ju8Var2 = ju8Var3;
                vf0Var2 = vf0VarM4714a;
                i2 = i4;
                e16Var3 = b16Var;
                o39Var2 = o39VarM24271b;
                z4 = true;
            } else {
                tj3Var.m22102U();
                z4 = z2;
                o39Var2 = o39Var;
                iu8Var2 = iu8Var;
                ju8Var2 = ju8Var;
                vf0Var2 = vf0Var;
                interfaceC3624tu3 = interfaceC3624tu;
                t17Var3 = t17Var;
                i2 = i3 & (-2143289345);
                e16Var3 = e16Var;
            }
            tj3Var.m22140r();
            m1163f(z, e16Var3, ui3Var, z4, c0282a, cea.m4600a(f43.f38401m, tj3Var), o39Var2, iu8Var2, ju8Var2, vf0Var2, e43.f36690a, interfaceC3624tu3, t17Var3, tj3Var, 102263808 | ((i2 << 3) & 896) | (i2 & 14) | 12582960, 1772544);
            e16Var2 = e16Var3;
            z3 = z4;
            interfaceC3624tu2 = interfaceC3624tu3;
            t17Var2 = t17Var3;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z3 = z2;
            o39Var2 = o39Var;
            iu8Var2 = iu8Var;
            ju8Var2 = ju8Var;
            vf0Var2 = vf0Var;
            interfaceC3624tu2 = interfaceC3624tu;
            t17Var2 = t17Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(z, ui3Var, c0282a, e16Var2, z3, o39Var2, iu8Var2, ju8Var2, vf0Var2, interfaceC3624tu2, t17Var2, i) { // from class: k11

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f46533a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ui3 f46534b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C0282a f46535c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ e16 f46536d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f46537e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ o39 f46538f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ iu8 f46539g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ ju8 f46540h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ vf0 f46541i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ InterfaceC3624tu f46542j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ t17 f46543k;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(385);
                    AbstractC0235i.m1162e(this.f46533a, this.f46534b, this.f46535c, this.f46536d, this.f46537e, this.f46538f, this.f46539g, this.f46540h, this.f46541i, this.f46542j, this.f46543k, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0252  */
    /* JADX INFO: renamed from: f */
    public static final void m1163f(final boolean z, final e16 e16Var, final ui3 ui3Var, final boolean z2, final C0282a c0282a, final vx9 vx9Var, final o39 o39Var, final iu8 iu8Var, final ju8 ju8Var, final vf0 vf0Var, final float f, final InterfaceC3624tu interfaceC3624tu, final t17 t17Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        int i4;
        tj3 tj3Var;
        long j;
        float f2;
        C0059a c0059a;
        boolean z3;
        C0817bn c0817bn;
        v56 v56Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(400616238);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22122h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22120g(e16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var2.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var2.m22122h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var2.m22124i(c0282a) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= tj3Var2.m22120g(vx9Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= tj3Var2.m22124i(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= tj3Var2.m22124i(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= tj3Var2.m22124i(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tj3Var2.m22120g(o39Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (tj3Var2.m22120g(iu8Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var2.m22120g(ju8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= tj3Var2.m22120g(vf0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= tj3Var2.m22114d(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= tj3Var2.m22120g(interfaceC3624tu) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= tj3Var2.m22120g(t17Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= tj3Var2.m22120g(null) ? 1048576 : 524288;
        }
        int i5 = i3;
        boolean z4 = true;
        if (tj3Var2.m22099R(i5 & 1, ((306783379 & i3) == 306783378 && (i4 & 599187) == 599186) ? false : true)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            tj3Var2.m22111b0(-955061811);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC3393o1.m17729d(tj3Var2);
            }
            v56 v56Var2 = (v56) objM22097O;
            tj3Var2.m22139q(false);
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new C3013ft(12);
                tj3Var2.m22131l0(objM22097O2);
            }
            final e16 e16VarM17643c = nv8.m17643c(e16Var, false, (vi3) objM22097O2);
            if (z2) {
                j = !z ? iu8Var.f44590a : iu8Var.f44598i;
            } else {
                j = z ? iu8Var.f44599j : iu8Var.f44594e;
            }
            if (ju8Var == null) {
                tj3Var2.m22111b0(-954746232);
                tj3Var2.m22139q(false);
                v56Var2 = v56Var2;
                p84Var = p84Var;
                j = j;
                z3 = false;
                c0817bn = null;
            } else {
                tj3Var2.m22111b0(-1554818919);
                int i6 = ((i4 << 3) & 896) | ((i5 >> 9) & 14);
                Object objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new SnapshotStateList();
                    tj3Var2.m22131l0(objM22097O3);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) objM22097O3;
                Object objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = AbstractC0278f.m1260j(null);
                    tj3Var2.m22131l0(objM22097O4);
                }
                t66 t66Var = (t66) objM22097O4;
                boolean zM22120g = tj3Var2.m22120g(v56Var2);
                Object objM22097O5 = tj3Var2.m22097O();
                if (zM22120g || objM22097O5 == p84Var) {
                    objM22097O5 = new SelectableChipElevation$animateElevation$1$1(v56Var2, snapshotStateList, null);
                    tj3Var2.m22131l0(objM22097O5);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O5, v56Var2);
                q84 q84Var = (q84) u91.m22598P0(snapshotStateList);
                if (!z2 || (q84Var instanceof lj7)) {
                    f2 = 0.0f;
                } else if (q84Var instanceof rv3) {
                    f2 = ju8Var.f46167a;
                } else if (!(q84Var instanceof q93) && (q84Var instanceof xk2)) {
                    f2 = ju8Var.f46168b;
                } else {
                    f2 = 0.0f;
                }
                Object objM22097O6 = tj3Var2.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new C0059a(new xj2(f2), pk9.f56365j, null, 12);
                    tj3Var2.m22131l0(objM22097O6);
                }
                C0059a c0059a2 = (C0059a) objM22097O6;
                xj2 xj2Var = new xj2(f2);
                boolean zM22124i = tj3Var2.m22124i(c0059a2) | tj3Var2.m22114d(f2);
                if ((((i6 & 14) ^ 6) <= 4 || !tj3Var2.m22122h(z2)) && (i6 & 6) != 4) {
                    z4 = false;
                }
                boolean zM22124i2 = zM22124i | z4 | tj3Var2.m22124i(q84Var);
                Object objM22097O7 = tj3Var2.m22097O();
                if (zM22124i2 || objM22097O7 == p84Var) {
                    c0059a = c0059a2;
                    z3 = false;
                    SelectableChipElevation$animateElevation$2$1 selectableChipElevation$animateElevation$2$1 = new SelectableChipElevation$animateElevation$2$1(c0059a, f2, z2, q84Var, t66Var, null);
                    tj3Var2.m22131l0(selectableChipElevation$animateElevation$2$1);
                    objM22097O7 = selectableChipElevation$animateElevation$2$1;
                } else {
                    c0059a = c0059a2;
                    z3 = false;
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O7, xj2Var);
                c0817bn = c0059a.f1540c;
                tj3Var2.m22139q(z3);
            }
            float f3 = c0817bn != null ? ((xj2) ((xc9) c0817bn.f8704b).getValue()).f68285a : 0.0f;
            boolean z5 = z3;
            final C0282a c0282aM4703P = ci8.m4703P(-1320468520, new zi3() { // from class: l11
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    long j2;
                    long j3;
                    long j4;
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        iu8 iu8Var2 = iu8Var;
                        boolean z6 = z2;
                        boolean z7 = z;
                        if (z6) {
                            j2 = !z7 ? iu8Var2.f44591b : iu8Var2.f44600k;
                        } else {
                            j2 = iu8Var2.f44595f;
                        }
                        long j5 = j2;
                        if (z6) {
                            j3 = !z7 ? iu8Var2.f44592c : iu8Var2.f44601l;
                        } else {
                            j3 = iu8Var2.f44596g;
                        }
                        if (z6) {
                            j4 = !z7 ? iu8Var2.f44593d : iu8Var2.f44602m;
                        } else {
                            j4 = iu8Var2.f44597h;
                        }
                        AbstractC0235i.m1158a(c0282a, vx9Var, j5, j3, j4, f, interfaceC3624tu, t17Var, ss5.m21705c0(MotionSchemeKeyTokens.SlowEffects, tj3Var3), ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var3), ss5.m21705c0(MotionSchemeKeyTokens.FastSpatial, tj3Var3), ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var3), tj3Var3, 0);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2);
            zf1 zf1Var = ho9.f42717a;
            long jM20489b = ra1.m20489b(j, tj3Var2);
            if (v56Var2 == null) {
                tj3Var2.m22111b0(1528105640);
                Object objM22097O8 = tj3Var2.m22097O();
                if (objM22097O8 == p84Var) {
                    objM22097O8 = AbstractC3393o1.m17729d(tj3Var2);
                }
                v56Var = (v56) objM22097O8;
                tj3Var2.m22139q(z5);
            } else {
                tj3Var2.m22111b0(-227801585);
                tj3Var2.m22139q(z5);
                v56Var = v56Var2;
            }
            zf1 zf1Var2 = ho9.f42717a;
            final float f4 = ((xj2) tj3Var2.m22128k(zf1Var2)).f68285a + 0.0f;
            a02[] a02VarArr = {AbstractC3393o1.m17727b(jM20489b, sk1.f60948a), zf1Var2.mo1265a(new xj2(f4))};
            final long j2 = j;
            final v56 v56Var3 = v56Var;
            tj3Var = tj3Var2;
            final float f5 = f3;
            pvc.m19508d(a02VarArr, ci8.m4703P(1508735219, new zi3() { // from class: eo9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        iv3 iv3Var = AbstractC0262s.f3627a;
                        e16 e16VarMo3161g = e16VarM17643c.mo3161g(c06.f9271b);
                        zf1 zf1Var3 = gh8.f40823a;
                        sh8 sh8Var = ((th8) tj3Var3.m22128k(zf1Var3)).f62294a;
                        e16 e16VarMo3161g2 = e16VarMo3161g.mo3161g(b16.f7762a);
                        long jM13417d = ho9.m13417d(j2, f4, tj3Var3);
                        float fMo912g0 = ((fb2) tj3Var3.m22128k(AbstractC0402n.f4816h)).mo912g0(f5);
                        o39 o39Var2 = o39Var;
                        e16 e16VarM13416c = ho9.m13416c(e16VarMo3161g2, o39Var2, jM13417d, vf0Var, fMo912g0);
                        sh8 sh8Var2 = ((th8) tj3Var3.m22128k(zf1Var3)).f62294a;
                        e16 e16VarM24777o = xwc.m24777o(pvc.m19496D(e16VarM13416c, z, v56Var3, gh8.m12656a(false, 0.0f, 0L, o39Var2, 215), z2, null, ui3Var));
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, true);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM24777o);
                        se1.f60731q.getClass();
                        ui3 ui3Var2 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var2);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                        wq1.m24128x(0, c0282aM4703P, tj3Var3, true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 56);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: m11
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    AbstractC0235i.m1163f(z, e16Var, ui3Var, z2, c0282a, vx9Var, o39Var, iu8Var, ju8Var, vf0Var, f, interfaceC3624tu, t17Var, (ye1) obj, iM19383z, iM19383z2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: g */
    public static final zi3 m1164g(long j, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22111b0(1575598419);
        tj3Var.m22139q(false);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final C0282a m1165h(long j, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22111b0(-1218883371);
        tj3Var.m22139q(false);
        return null;
    }
}
