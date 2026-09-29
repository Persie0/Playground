package p000;

import android.R;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.review.R$string;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ywc {

    /* JADX INFO: renamed from: a */
    public static final int[] f70603a = {R.attr.targetClass, R.attr.targetId, R.attr.excludeId, R.attr.excludeClass, R.attr.targetName, R.attr.excludeName};

    /* JADX INFO: renamed from: b */
    public static final int[] f70604b = {R.attr.interpolator, R.attr.duration, R.attr.startDelay, R.attr.matchOrder};

    /* JADX INFO: renamed from: c */
    public static final int[] f70605c = {R.attr.resizeClip};

    /* JADX INFO: renamed from: d */
    public static final int[] f70606d = {R.attr.transitionVisibilityMode};

    /* JADX INFO: renamed from: e */
    public static final int[] f70607e = {R.attr.fadingMode};

    /* JADX INFO: renamed from: f */
    public static final int[] f70608f = {R.attr.reparent, R.attr.reparentWithOverlay};

    /* JADX INFO: renamed from: g */
    public static final int[] f70609g = {R.attr.slideEdge};

    /* JADX INFO: renamed from: h */
    public static final int[] f70610h = {R.attr.transitionOrdering};

    /* JADX INFO: renamed from: i */
    public static final int[] f70611i = {R.attr.minimumHorizontalAngle, R.attr.minimumVerticalAngle, R.attr.maximumAngle};

    /* JADX INFO: renamed from: j */
    public static final int[] f70612j = {R.attr.patternPathData};

    /* JADX INFO: renamed from: a */
    public static final void m25368a(final int i, final int i2, final long j, final long j2, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2120066914);
        int i3 = (tj3Var.m22116e(i) ? 4 : 2) | i2 | (tj3Var.m22118f(j) ? 32 : 16) | (tj3Var.m22118f(j2) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 << 3;
            ho9.m13414a(null, ui8.f63972a, j, j2, 0.0f, 0.0f, null, ci8.m4703P(-1281583065, new ex0(i, 15), tj3Var), tj3Var, (i4 & 896) | 12582912 | (i4 & 7168), 113);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(i, i2, j, j2) { // from class: ye8

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f69748a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f69749b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f69750c;

                {
                    this.f69749b = j;
                    this.f69750c = j2;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    ywc.m25368a(this.f69748a, iM19383z, this.f69749b, this.f69750c, (ye1) obj);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m25369b(final we8 we8Var, final vi3 vi3Var, ye1 ye1Var, int i) {
        final vi3 vi3Var2;
        final we8 we8Var2;
        int i2;
        zi3 zi3Var;
        zi3 zi3Var2;
        p84 p84Var;
        vi3 vi3Var3;
        float f;
        boolean z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(804925142);
        int i3 = i | (tj3Var.m22124i(we8Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        final int i4 = 0;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            int i5 = i3 & 112;
            boolean zM22124i = (i5 == 32) | tj3Var.m22124i(we8Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (zM22124i || objM22097O == p84Var2) {
                objM22097O = new ui3() { // from class: xe8
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i6 = i4;
                        xfa xfaVar = xfa.f68157a;
                        we8 we8Var3 = we8Var;
                        vi3 vi3Var4 = vi3Var;
                        switch (i6) {
                            case 0:
                                vi3Var4.invoke(new la8(we8Var3.f66727a));
                                break;
                            case 1:
                                vi3Var4.invoke(new na8(we8Var3.f66727a));
                                break;
                            default:
                                vi3Var4.invoke(new la8(we8Var3.f66727a));
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM4412e, 15), ge9.m12515a(tj3Var).f38956e, ge9.m12515a(tj3Var).f38956e);
            int i6 = 28;
            C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(i6));
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3661uu, ec0Var, tj3Var, 0);
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
            zi3 zi3Var3 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var3, bb1VarM230a);
            zi3 zi3Var4 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var5 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var5, numValueOf);
            vi3 vi3Var4 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var4);
            zi3 zi3Var6 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(i6)), fc0Var, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var5, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c2);
            if (we8Var.f66734h) {
                tj3Var.m22111b0(574592448);
                boolean zM22124i2 = (i5 == 32) | tj3Var.m22124i(we8Var);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22124i2 || objM22097O2 == p84Var2) {
                    final int i7 = 1;
                    objM22097O2 = new ui3() { // from class: xe8
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i8 = i7;
                            xfa xfaVar = xfa.f68157a;
                            we8 we8Var3 = we8Var;
                            vi3 vi3Var5 = vi3Var;
                            switch (i8) {
                                case 0:
                                    vi3Var5.invoke(new la8(we8Var3.f66727a));
                                    break;
                                case 1:
                                    vi3Var5.invoke(new na8(we8Var3.f66727a));
                                    break;
                                default:
                                    vi3Var5.invoke(new la8(we8Var3.f66727a));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O2);
                }
                p84Var = p84Var2;
                i2 = i5;
                vi3Var3 = vi3Var4;
                zi3Var = zi3Var6;
                zi3Var2 = zi3Var4;
                f = 1.0f;
                omd.m18141c((ui3) objM22097O2, null, false, null, null, qjc.f57860a, tj3Var, 1572864, 62);
                z = false;
                tj3Var.m22139q(false);
            } else {
                i2 = i5;
                zi3Var = zi3Var6;
                zi3Var2 = zi3Var4;
                p84Var = p84Var2;
                vi3Var3 = vi3Var4;
                f = 1.0f;
                z = false;
                tj3Var.m22111b0(575028742);
                tj3Var.m22139q(false);
            }
            as4 as4Var = new as4(f, true);
            bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(2.0f, true, new gm5(28)), ec0Var, tj3Var, 6);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, as4Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var5, tj3Var, vi3Var3);
            zi3 zi3Var7 = zi3Var;
            oha.m18001g(tj3Var, zi3Var7, e16VarM1322c3);
            we8Var2 = we8Var;
            zi3 zi3Var8 = zi3Var2;
            boolean z2 = z;
            lw9.m16554b(we8Var2.f66727a, null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 1572864, 0, 131006);
            lw9.m16554b(we8Var2.f66728b, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131066);
            tj3Var.m22139q(true);
            sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(4.0f, true, new gm5(28)), fc0Var, tj3Var, 54);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var8, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var5, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var7, e16VarM1322c4);
            m25368a(we8Var2.f66729c, 0, aa1.m198b(0.14f, cx2.m9917a(tj3Var).m4212e()), cx2.m9917a(tj3Var).m4212e(), tj3Var);
            m25368a(we8Var2.f66730d, 0, aa1.m198b(0.14f, cx2.m9917a(tj3Var).m4215h()), cx2.m9917a(tj3Var).m4215h(), tj3Var);
            int i8 = i2;
            boolean zM22124i3 = tj3Var.m22124i(we8Var2) | (i8 == 32 ? true : z2);
            Object objM22097O3 = tj3Var.m22097O();
            p84 p84Var3 = p84Var;
            if (zM22124i3 || objM22097O3 == p84Var3) {
                vi3Var2 = vi3Var;
                final int i9 = 2;
                objM22097O3 = new ui3() { // from class: xe8
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i10 = i9;
                        xfa xfaVar = xfa.f68157a;
                        we8 we8Var3 = we8Var2;
                        vi3 vi3Var5 = vi3Var2;
                        switch (i10) {
                            case 0:
                                vi3Var5.invoke(new la8(we8Var3.f66727a));
                                break;
                            case 1:
                                vi3Var5.invoke(new na8(we8Var3.f66727a));
                                break;
                            default:
                                vi3Var5.invoke(new la8(we8Var3.f66727a));
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O3);
            } else {
                vi3Var2 = vi3Var;
            }
            omd.m18141c((ui3) objM22097O3, null, false, null, null, qjc.f57861b, tj3Var, 1572864, 62);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            vs3 vs3Var = we8Var2.f66733g;
            int i10 = we8Var2.f66731e;
            Integer num = we8Var2.f66732f;
            if (i8 == 32) {
                z2 = true;
            }
            boolean zM22124i4 = z2 | tj3Var.m22124i(we8Var2);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i4 || objM22097O4 == p84Var3) {
                objM22097O4 = new sx7(12, vi3Var2, we8Var2);
                tj3Var.m22131l0(objM22097O4);
            }
            ewc.m11372a(vs3Var, i10, num, (vi3) objM22097O4, null, tj3Var, 0);
            pb1.m19031a(0.0f, 0, 7, 0L, tj3Var, null);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            vi3Var2 = vi3Var;
            we8Var2 = we8Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(we8Var2, i, 24, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m25370c(ze8 ze8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        ze8 ze8Var2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-710896311);
        int i3 = i | (tj3Var.m22124i(ze8Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
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
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            si8 si8VarM22753b = ui8.m22753b(20.0f);
            vh9 vh9Var = ps5.f56764b;
            bq1.m4039O(e16VarM4412e, si8VarM22753b, te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r, 0L, tj3Var), null, null, ci8.m4703P(1136105265, new se0(ze8Var, 29), tj3Var), tj3Var, 196614, 24);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.activities_terms_studied), null, 0L, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 1572864, 0, 131006);
            tj3Var = tj3Var;
            ze8Var2 = ze8Var;
            bq1.m4039O(AbstractC3393o1.m17728c(1.0f, c99.m4412e(b16Var, 1.0f), true), ui8.m22753b(20.0f), null, null, null, ci8.m4703P(1661091752, new iz4(11, ze8Var2, vi3Var), tj3Var), tj3Var, 196608, 28);
            i2 = 1;
            tj3Var.m22139q(true);
        } else {
            i2 = 1;
            ze8Var2 = ze8Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ee8(ze8Var2, vi3Var, i, i2);
        }
    }
}
