package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.player.video.AbstractC1824e;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xfd {
    /* JADX INFO: renamed from: a */
    public static final void m24488a(final String str, final String str2, final boolean z, final ac7 ac7Var, final pbb pbbVar, final ui3 ui3Var, final vi3 vi3Var, final vi3 vi3Var2, final vi3 vi3Var3, final ui3 ui3Var2, final ui3 ui3Var3, final List list, final vi3 vi3Var4, final ui3 ui3Var4, final e16 e16Var, ye1 ye1Var, final int i) {
        ac7 ac7Var2;
        boolean z2;
        vi3 vi3Var5;
        zi3 zi3Var;
        x18 x18Var;
        qc9 qc9Var;
        t66 t66Var;
        str2.getClass();
        ac7Var.getClass();
        ui3Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        vi3Var3.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        list.getClass();
        vi3Var4.getClass();
        ui3Var4.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(207888031);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22120g(ac7Var) ? 2048 : 1024) | (tj3Var.m22120g(pbbVar) ? 16384 : 8192) | (tj3Var.m22124i(vi3Var) ? 1048576 : 524288) | (tj3Var.m22124i(vi3Var2) ? 8388608 : 4194304) | (tj3Var.m22124i(vi3Var3) ? 67108864 : 33554432) | (tj3Var.m22124i(ui3Var2) ? 536870912 : 268435456);
        int i3 = 6 | (tj3Var.m22124i(list) ? 32 : 16) | (tj3Var.m22124i(vi3Var4) ? 256 : 128) | (tj3Var.m22124i(ui3Var4) ? 2048 : 1024) | (tj3Var.m22120g(e16Var) ? 16384 : 8192);
        if (tj3Var.m22099R(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 9363) == 9362) ? false : true)) {
            boolean z3 = (i2 & 14) == 4;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z3 || objM22097O == p84Var) {
                objM22097O = AbstractC3352my.m17131l0(str);
                tj3Var.m22131l0(objM22097O);
            }
            String str3 = (String) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O3);
            }
            t66 t66Var3 = (t66) objM22097O3;
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1256f(0.0f);
                tj3Var.m22131l0(objM22097O4);
            }
            qc9 qc9Var2 = (qc9) objM22097O4;
            if (str3.length() == 0) {
                x18 x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u == null) {
                    return;
                }
                final int i4 = 0;
                zi3Var = new zi3(str, str2, z, ac7Var, pbbVar, ui3Var, vi3Var, vi3Var2, vi3Var3, ui3Var2, ui3Var3, list, vi3Var4, ui3Var4, e16Var, i, i4) { // from class: r54

                    /* JADX INFO: renamed from: H */
                    public final /* synthetic */ List f58745H;

                    /* JADX INFO: renamed from: I */
                    public final /* synthetic */ vi3 f58746I;

                    /* JADX INFO: renamed from: J */
                    public final /* synthetic */ ui3 f58747J;

                    /* JADX INFO: renamed from: K */
                    public final /* synthetic */ e16 f58748K;

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f58749a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ String f58750b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ String f58751c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ boolean f58752d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ ac7 f58753e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ pbb f58754f;

                    /* JADX INFO: renamed from: g */
                    public final /* synthetic */ ui3 f58755g;

                    /* JADX INFO: renamed from: h */
                    public final /* synthetic */ vi3 f58756h;

                    /* JADX INFO: renamed from: i */
                    public final /* synthetic */ vi3 f58757i;

                    /* JADX INFO: renamed from: j */
                    public final /* synthetic */ vi3 f58758j;

                    /* JADX INFO: renamed from: k */
                    public final /* synthetic */ ui3 f58759k;

                    /* JADX INFO: renamed from: l */
                    public final /* synthetic */ ui3 f58760l;

                    {
                        this.f58749a = i4;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = this.f58749a;
                        xfa xfaVar = xfa.f68157a;
                        switch (i5) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(196609);
                                xfd.m24488a(this.f58750b, this.f58751c, this.f58752d, this.f58753e, this.f58754f, this.f58755g, this.f58756h, this.f58757i, this.f58758j, this.f58759k, this.f58760l, this.f58745H, this.f58746I, this.f58747J, this.f58748K, (ye1) obj, iM19383z);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM19383z2 = pk9.m19383z(196609);
                                xfd.m24488a(this.f58750b, this.f58751c, this.f58752d, this.f58753e, this.f58754f, this.f58755g, this.f58756h, this.f58757i, this.f58758j, this.f58759k, this.f58760l, this.f58745H, this.f58746I, this.f58747J, this.f58748K, (ye1) obj, iM19383z2);
                                break;
                        }
                        return xfaVar;
                    }
                };
                x18Var = x18VarM22143u;
            } else {
                e16 e16VarM10007D = d32.m10007D(pb1.m19045o(c99.m4412e(e16Var, 1.0f), ui8.m22753b(12.0f)), aa1.f403b, ss5.f61356d);
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
                se1.f60731q.getClass();
                ui3 ui3Var5 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var5);
                } else {
                    tj3Var.m22137o0();
                }
                zi3 zi3Var2 = C0352b.f4303f;
                oha.m18001g(tj3Var, zi3Var2, bb1VarM230a);
                zi3 zi3Var3 = C0352b.f4302e;
                oha.m18001g(tj3Var, zi3Var3, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                zi3 zi3Var4 = C0352b.f4304g;
                oha.m18001g(tj3Var, zi3Var4, numValueOf);
                vi3 vi3Var6 = C0352b.f4305h;
                oha.m18000f(tj3Var, vi3Var6);
                zi3 zi3Var5 = C0352b.f4301d;
                oha.m18001g(tj3Var, zi3Var5, e16VarM1322c);
                b16 b16Var = b16.f7762a;
                e16 e16VarM21995i = te1.m21995i(1.7777778f, c99.m4412e(b16Var, 1.0f), false);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21995i);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var5);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var2, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var3, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var4, tj3Var, vi3Var6);
                oha.m18001g(tj3Var, zi3Var5, e16VarM1322c2);
                e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                Object objM22097O5 = tj3Var.m22097O();
                if (objM22097O5 == p84Var) {
                    objM22097O5 = new C0023al(15, t66Var2);
                    tj3Var.m22131l0(objM22097O5);
                }
                e16 e16VarM1406a = AbstractC0309d.m1406a(e16VarM4411d, (vi3) objM22097O5);
                boolean z4 = ((i2 & 3670016) == 1048576) | ((i2 & 29360128) == 8388608);
                Object objM22097O6 = tj3Var.m22097O();
                int i5 = 18;
                if (z4 || objM22097O6 == p84Var) {
                    qc9Var = qc9Var2;
                    objM22097O6 = new C3485q5(vi3Var, vi3Var2, qc9Var, i5);
                    tj3Var.m22131l0(objM22097O6);
                } else {
                    qc9Var = qc9Var2;
                }
                vi3 vi3Var7 = (vi3) objM22097O6;
                boolean z5 = (i2 & 234881024) == 67108864;
                Object objM22097O7 = tj3Var.m22097O();
                if (z5 || objM22097O7 == p84Var) {
                    objM22097O7 = new s54(0, vi3Var3, qc9Var);
                    tj3Var.m22131l0(objM22097O7);
                }
                vi3 vi3Var8 = (vi3) objM22097O7;
                Object objM22097O8 = tj3Var.m22097O();
                if (objM22097O8 == p84Var) {
                    objM22097O8 = new C3799yk(19, t66Var2);
                    tj3Var.m22131l0(objM22097O8);
                }
                AbstractC1824e.m8502a(e16VarM1406a, str3, pbbVar, ac7Var, 0.0f, false, true, str2, ui3Var, vi3Var7, vi3Var2, vi3Var8, (ui3) objM22097O8, tj3Var, (i2 & 7168) | ((i2 >> 6) & 896) | 1794054 | ((i2 << 18) & 29360128) | 100663296, ((i2 >> 21) & 14) | 384, 0);
                ac7Var2 = ac7Var;
                tj3Var = tj3Var;
                int i6 = 1;
                tj3Var.m22139q(true);
                e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), 4.0f, 2.0f);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37241g, nj0.f52789H, tj3Var, 54);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var5);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var2, sj8VarM20003a);
                oha.m18001g(tj3Var, zi3Var3, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var4, tj3Var, vi3Var6);
                oha.m18001g(tj3Var, zi3Var5, e16VarM1322c3);
                e16 e16VarM4422o = c99.m4422o(b16Var, 36.0f);
                Object objM22097O9 = tj3Var.m22097O();
                if (objM22097O9 == p84Var) {
                    t66Var = t66Var3;
                    objM22097O9 = new C3799yk(20, t66Var);
                    tj3Var.m22131l0(objM22097O9);
                } else {
                    t66Var = t66Var3;
                }
                omd.m18141c((ui3) objM22097O9, e16VarM4422o, false, null, null, ci8.m4703P(-116328681, new qi3(ac7Var2, i6), tj3Var), tj3Var, 1572918, 60);
                z2 = z;
                omd.m18141c(z2 ? ui3Var3 : ui3Var2, c99.m4422o(b16Var, 36.0f), false, null, null, ci8.m4703P(-1926729330, new c81(5, z2), tj3Var), tj3Var, 1572912, 60);
                omd.m18141c(ui3Var4, c99.m4422o(b16Var, 36.0f), false, null, null, tqb.f62743a, tj3Var, ((i3 >> 9) & 14) | 1572912, 60);
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
                if (((Boolean) t66Var.getValue()).booleanValue()) {
                    tj3Var.m22111b0(-146196465);
                    float f = ac7Var2.f486a;
                    boolean z6 = (i3 & 896) == 256;
                    Object objM22097O10 = tj3Var.m22097O();
                    if (z6 || objM22097O10 == p84Var) {
                        vi3Var5 = vi3Var4;
                        objM22097O10 = new ix0(vi3Var5, t66Var, 7);
                        tj3Var.m22131l0(objM22097O10);
                    } else {
                        vi3Var5 = vi3Var4;
                    }
                    vi3 vi3Var9 = (vi3) objM22097O10;
                    Object objM22097O11 = tj3Var.m22097O();
                    if (objM22097O11 == p84Var) {
                        objM22097O11 = new C3799yk(18, t66Var);
                        tj3Var.m22131l0(objM22097O11);
                    }
                    d4d.m10095a(f, list, vi3Var9, (ui3) objM22097O11, tj3Var, (i3 & 112) | 3072);
                    tj3Var.m22139q(false);
                } else {
                    vi3Var5 = vi3Var4;
                    tj3Var.m22111b0(-145900477);
                    tj3Var.m22139q(false);
                }
            }
            x18Var.f67642d = zi3Var;
        }
        ac7Var2 = ac7Var;
        z2 = z;
        vi3Var5 = vi3Var4;
        tj3Var.m22102U();
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            final int i7 = 1;
            final vi3 vi3Var10 = vi3Var5;
            final ac7 ac7Var3 = ac7Var2;
            final boolean z7 = z2;
            zi3Var = new zi3(str, str2, z7, ac7Var3, pbbVar, ui3Var, vi3Var, vi3Var2, vi3Var3, ui3Var2, ui3Var3, list, vi3Var10, ui3Var4, e16Var, i, i7) { // from class: r54

                /* JADX INFO: renamed from: H */
                public final /* synthetic */ List f58745H;

                /* JADX INFO: renamed from: I */
                public final /* synthetic */ vi3 f58746I;

                /* JADX INFO: renamed from: J */
                public final /* synthetic */ ui3 f58747J;

                /* JADX INFO: renamed from: K */
                public final /* synthetic */ e16 f58748K;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f58749a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f58750b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f58751c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f58752d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ac7 f58753e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ pbb f58754f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ ui3 f58755g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ vi3 f58756h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ vi3 f58757i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ vi3 f58758j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ ui3 f58759k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ ui3 f58760l;

                {
                    this.f58749a = i7;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = this.f58749a;
                    xfa xfaVar = xfa.f68157a;
                    switch (i8) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(196609);
                            xfd.m24488a(this.f58750b, this.f58751c, this.f58752d, this.f58753e, this.f58754f, this.f58755g, this.f58756h, this.f58757i, this.f58758j, this.f58759k, this.f58760l, this.f58745H, this.f58746I, this.f58747J, this.f58748K, (ye1) obj, iM19383z);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM19383z2 = pk9.m19383z(196609);
                            xfd.m24488a(this.f58750b, this.f58751c, this.f58752d, this.f58753e, this.f58754f, this.f58755g, this.f58756h, this.f58757i, this.f58758j, this.f58759k, this.f58760l, this.f58745H, this.f58746I, this.f58747J, this.f58748K, (ye1) obj, iM19383z2);
                            break;
                    }
                    return xfaVar;
                }
            };
            x18Var = x18VarM22143u2;
            x18Var.f67642d = zi3Var;
        }
    }
}
