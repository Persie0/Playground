package com.lingq.feature.review;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.token.C1909e;
import com.lingq.feature.review.AbstractC2752c;
import com.lingq.feature.review.components.AbstractC2753a;
import com.lingq.feature.review.data.ReviewCardLayoutStyle;
import com.lingq.feature.review.views.result.ReviewResultType;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3288l7;
import p000.C3386nv;
import p000.C3661uu;
import p000.ab1;
import p000.ad8;
import p000.aj3;
import p000.as4;
import p000.b16;
import p000.b34;
import p000.bb1;
import p000.be8;
import p000.c81;
import p000.c99;
import p000.ce8;
import p000.ci0;
import p000.ci8;
import p000.cx7;
import p000.d32;
import p000.de8;
import p000.dn7;
import p000.dua;
import p000.e16;
import p000.ed8;
import p000.ee8;
import p000.f5a;
import p000.fa4;
import p000.fd8;
import p000.fe9;
import p000.fs0;
import p000.gd8;
import p000.ge9;
import p000.gm5;
import p000.gr3;
import p000.h61;
import p000.hg8;
import p000.ht5;
import p000.jk0;
import p000.jxc;
import p000.ks3;
import p000.l77;
import p000.lc8;
import p000.lo6;
import p000.mjc;
import p000.nc8;
import p000.nj0;
import p000.oha;
import p000.or1;
import p000.ox1;
import p000.p84;
import p000.pfa;
import p000.pwc;
import p000.pxc;
import p000.q2d;
import p000.qc8;
import p000.qh0;
import p000.qv7;
import p000.rg8;
import p000.se1;
import p000.si5;
import p000.ss5;
import p000.t66;
import p000.tc8;
import p000.tj3;
import p000.uc8;
import p000.ui3;
import p000.ux5;
import p000.vc8;
import p000.vi3;
import p000.wa5;
import p000.wc8;
import p000.we1;
import p000.x18;
import p000.xb8;
import p000.xc8;
import p000.xd8;
import p000.y38;
import p000.yc8;
import p000.ye1;
import p000.ywc;
import p000.zc8;
import p000.ze8;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.review.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2752c {
    /* JADX INFO: renamed from: a */
    public static final void m9578a(ad8 ad8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-278014423);
        int i2 = (tj3Var.m22120g(ad8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (!tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22102U();
        } else if (fa4.m11650l(ad8Var, vc8.f65195a)) {
            tj3Var.m22111b0(-883882977);
            m9581d(tj3Var, 0);
            tj3Var.m22139q(false);
        } else if (ad8Var instanceof tc8) {
            tj3Var.m22111b0(-883880663);
            m9579b(((tc8) ad8Var).f62154a, vi3Var, tj3Var, i2 & 112);
            tj3Var.m22139q(false);
        } else if (ad8Var instanceof uc8) {
            tj3Var.m22111b0(-883876119);
            m9579b(((uc8) ad8Var).f63720a, vi3Var, tj3Var, i2 & 112);
            tj3Var.m22139q(false);
        } else {
            boolean z = ad8Var instanceof wc8;
            b16 b16Var = b16.f7762a;
            if (z) {
                tj3Var.m22111b0(-883871588);
                pwc.m19556a(((wc8) ad8Var).f66619a, vi3Var, c99.m4411d(b16Var, 1.0f), tj3Var, (i2 & 112) | 384);
                tj3Var.m22139q(false);
            } else if (ad8Var instanceof yc8) {
                tj3Var.m22111b0(-883865476);
                AbstractC2753a.m9593g(((yc8) ad8Var).f69637a, vi3Var, c99.m4411d(b16Var, 1.0f), tj3Var, (i2 & 112) | 384);
                tj3Var.m22139q(false);
            } else if (ad8Var instanceof zc8) {
                tj3Var.m22111b0(-883859298);
                pxc.m19566a(((zc8) ad8Var).f71366a, vi3Var, c99.m4411d(b16Var, 1.0f), tj3Var, (i2 & 112) | 384);
                tj3Var.m22139q(false);
            } else {
                if (!(ad8Var instanceof xc8)) {
                    throw ux5.m23001x(tj3Var, -883883655, false);
                }
                tj3Var.m22111b0(-883852940);
                m9586i(((xc8) ad8Var).f68066a, vi3Var, tj3Var, i2 & 112);
                tj3Var.m22139q(false);
            }
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(ad8Var, i, 23, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9579b(qc8 qc8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-417229683);
        int i2 = (tj3Var.m22124i(qc8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4411d(b16.f7762a, 1.0f), 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 1);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
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
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            AbstractC2753a.m9588b(qc8Var, vi3Var, tj3Var, i2 & 126);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lc8(qc8Var, vi3Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9580c(gd8 gd8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-668331238);
        int i2 = i | (tj3Var.m22120g(gd8Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            boolean zM11650l = fa4.m11650l(gd8Var, ed8.f37069a);
            p84 p84Var = we1.f66679a;
            if (zM11650l) {
                tj3Var.m22111b0(1212649049);
                boolean z = (i2 & 112) == 32;
                Object objM22097O = tj3Var.m22097O();
                if (z || objM22097O == p84Var) {
                    objM22097O = new nc8(vi3Var, 9);
                    tj3Var.m22131l0(objM22097O);
                }
                q2d.m19625a((ui3) objM22097O, ci8.m4703P(1193859914, new ks3(vi3Var, 26), tj3Var), null, ci8.m4703P(1869020040, new ks3(vi3Var, 27), tj3Var), null, mjc.f51421h, mjc.f51422i, null, 0L, 0L, 0L, 0L, null, tj3Var, 1772592, 16276);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                if (!fa4.m11650l(gd8Var, fd8.f38913a)) {
                    throw ux5.m23001x(tj3Var, 1978779208, false);
                }
                tj3Var.m22111b0(1213520304);
                boolean z2 = (i2 & 112) == 32;
                Object objM22097O2 = tj3Var.m22097O();
                if (z2 || objM22097O2 == p84Var) {
                    objM22097O2 = new nc8(vi3Var, 10);
                    tj3Var.m22131l0(objM22097O2);
                }
                q2d.m19625a((ui3) objM22097O2, ci8.m4703P(1290655859, new ks3(vi3Var, 24), tj3Var), null, null, null, mjc.f51424k, mjc.f51425l, null, 0L, 0L, 0L, 0L, null, tj3Var, 1769520, 16284);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(gd8Var, i, 22, vi3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9581d(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(157663577);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
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
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            dn7.m10492a(ci0.f10109a.mo3727a(b16Var, nj0.f52812g), 0L, 0.0f, 0L, 0, 0.0f, tj3Var, 0, 62);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cx7(i, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9582e(boolean z, ye1 ye1Var, int i) {
        boolean z2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1170783236);
        int i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            z2 = z;
            AbstractC0054a.m729d(z2, null, AbstractC0070i.m772g(ss5.m21703b0(120, 0, null, 6), 0.0f, 2), AbstractC0070i.m773h(ss5.m21703b0(120, 0, null, 6), 2), null, mjc.f51418e, tj3Var, (i2 & 14) | 200064, 18);
        } else {
            z2 = z;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new c81(i, 12, z2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9583f(vi3 vi3Var, C2751b c2751b, C1909e c1909e, ye1 ye1Var, int i) {
        C2751b c2751b2;
        C1909e c1909e2;
        int i2;
        C1909e c1909e3;
        Object reviewRouteKt$ReviewRoute$1$1;
        t66 t66Var;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1783066457);
        int i3 = (tj3Var.m22124i(vi3Var) ? 4 : 2) | i | 144;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                C2751b c2751b3 = (C2751b) pfa.m19114d(y38.m24933a(C2751b.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                dua duaVarM21396a2 = si5.m21396a(tj3Var);
                if (duaVarM21396a2 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i3 & (-1009);
                    c1909e3 = (C1909e) pfa.m19114d(y38.m24933a(C1909e.class), duaVarM21396a2, null, AbstractC3584sr.m21591B(duaVarM21396a2, tj3Var), duaVarM21396a2 instanceof gr3 ? ((gr3) duaVarM21396a2).mo2103e() : or1.f54780b, tj3Var);
                    c2751b2 = c2751b3;
                }
            } else {
                tj3Var.m22102U();
                c2751b2 = c2751b;
                i2 = i3 & (-1009);
                c1909e3 = c1909e;
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2751b2.f32406n, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c1909e3.f23886X, tj3Var);
            xd8 xd8Var = ((hg8) t66VarM2513c.getValue()).f42332g;
            boolean zM22120g = ((i2 & 14) == 4) | tj3Var.m22120g(t66VarM2513c) | tj3Var.m22124i(c1909e3) | tj3Var.m22124i(c2751b2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                c1909e2 = c1909e3;
                t66Var = t66VarM2513c;
                reviewRouteKt$ReviewRoute$1$1 = new ReviewRouteKt$ReviewRoute$1$1(c1909e2, vi3Var, c2751b2, t66Var, null);
                tj3Var.m22131l0(reviewRouteKt$ReviewRoute$1$1);
            } else {
                c1909e2 = c1909e3;
                reviewRouteKt$ReviewRoute$1$1 = objM22097O;
                t66Var = t66VarM2513c;
            }
            d32.m10047k(tj3Var, (zi3) reviewRouteKt$ReviewRoute$1$1, xd8Var);
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
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
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            hg8 hg8Var = (hg8) t66Var.getValue();
            boolean zM22124i = tj3Var.m22124i(c2751b2);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                ReviewRouteKt$ReviewRoute$2$1$1 reviewRouteKt$ReviewRoute$2$1$1 = new ReviewRouteKt$ReviewRoute$2$1$1(1, c2751b2, C2751b.class, "handleAction", "handleAction(Lcom/lingq/feature/review/data/ReviewAction;)V", 0);
                tj3Var.m22131l0(reviewRouteKt$ReviewRoute$2$1$1);
                objM22097O2 = reviewRouteKt$ReviewRoute$2$1$1;
            }
            m9585h(hg8Var, (vi3) ((FunctionReference) objM22097O2), tj3Var, 0);
            f5a f5aVar = (f5a) t66VarM2513c2.getValue();
            boolean zM22124i2 = tj3Var.m22124i(c1909e2);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O3 == p84Var) {
                ReviewRouteKt$ReviewRoute$2$2$1 reviewRouteKt$ReviewRoute$2$2$1 = new ReviewRouteKt$ReviewRoute$2$2$1(1, c1909e2, C1909e.class, "handleAction", "handleAction(Lcom/lingq/core/token/TokenAction;)V", 0);
                tj3Var.m22131l0(reviewRouteKt$ReviewRoute$2$2$1);
                objM22097O3 = reviewRouteKt$ReviewRoute$2$2$1;
            }
            AbstractC1899b.m8698g(f5aVar, (vi3) ((FunctionReference) objM22097O3), tj3Var, 8);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            c2751b2 = c2751b;
            c1909e2 = c1909e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(vi3Var, c2751b2, c1909e2, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: g */
    public static final void m9584g(hg8 hg8Var, float f, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        hg8 hg8Var2;
        vi3 vi3Var2;
        tj3 tj3Var;
        zi3 zi3Var;
        p84 p84Var;
        zi3 zi3Var2;
        boolean z;
        ui3 ui3Var;
        ?? r0;
        tj3 tj3Var2;
        ReviewAnimationType reviewAnimationType;
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(1583434631);
        int i2 = i | (tj3Var3.m22120g(hg8Var) ? 4 : 2) | (tj3Var3.m22114d(f) ? 32 : 16) | (tj3Var3.m22124i(vi3Var) ? 256 : 128) | (tj3Var3.m22120g(e16Var) ? 2048 : 1024);
        if (tj3Var3.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            e16 e16VarM4411d = c99.m4411d(e16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var3.m22128k(zf1Var)).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var3, 0);
            int iHashCode = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m = tj3Var3.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM4411d);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var2);
            } else {
                tj3Var3.m22137o0();
            }
            zi3 zi3Var3 = C0352b.f4303f;
            oha.m18001g(tj3Var3, zi3Var3, bb1VarM230a);
            zi3 zi3Var4 = C0352b.f4302e;
            oha.m18001g(tj3Var3, zi3Var4, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var5 = C0352b.f4304g;
            oha.m18001g(tj3Var3, zi3Var5, numValueOf);
            vi3 vi3Var3 = C0352b.f4305h;
            oha.m18000f(tj3Var3, vi3Var3);
            zi3 zi3Var6 = C0352b.f4301d;
            oha.m18001g(tj3Var3, zi3Var6, e16VarM1322c);
            int i3 = hg8Var.f42327b.f8438b;
            b16 b16Var = b16.f7762a;
            p84 p84Var2 = we1.f66679a;
            if (i3 > 0) {
                tj3Var3.m22111b0(-1176617115);
                boolean z2 = (i2 & 112) == 32;
                Object objM22097O = tj3Var3.m22097O();
                if (z2 || objM22097O == p84Var2) {
                    objM22097O = new h61(2, f);
                    tj3Var3.m22131l0(objM22097O);
                }
                tj3Var2 = tj3Var3;
                zi3Var = zi3Var4;
                zi3Var2 = zi3Var3;
                p84Var = p84Var2;
                ui3Var = ui3Var2;
                r0 = 0;
                z = true;
                dn7.m10494c((ui3) objM22097O, c99.m4412e(b16Var, 1.0f), 0L, 0L, 0, 0.0f, null, tj3Var2, 48, 124);
                tj3Var2.m22139q(false);
            } else {
                zi3Var = zi3Var4;
                p84Var = p84Var2;
                zi3Var2 = zi3Var3;
                z = true;
                ui3Var = ui3Var2;
                r0 = 0;
                tj3Var2 = tj3Var3;
                tj3Var2.m22111b0(-1176451823);
                tj3Var2.m22139q(false);
            }
            e16 e16VarM4412e = c99.m4412e(new as4(1.0f, z), 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52809d, r0);
            int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m2 = tj3Var2.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var2, ht5VarM19966d);
            oha.m18001g(tj3Var2, zi3Var, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var5, tj3Var2, vi3Var3);
            oha.m18001g(tj3Var2, zi3Var6, e16VarM1322c2);
            e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(ox1.m18559e(b16Var), 1.0f), ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i);
            ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, r0);
            int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m3 = tj3Var2.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM21608U);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var2, ht5VarM19966d2);
            oha.m18001g(tj3Var2, zi3Var, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var5, tj3Var2, vi3Var3);
            oha.m18001g(tj3Var2, zi3Var6, e16VarM1322c3);
            hg8Var2 = hg8Var;
            int i4 = hg8Var2.f42327b.f8437a;
            ad8 ad8Var = hg8Var2.f42329d;
            if (fa4.m11650l(ad8Var, vc8.f65195a)) {
                reviewAnimationType = ReviewAnimationType.Loading;
            } else if (ad8Var instanceof tc8) {
                reviewAnimationType = ((tc8) ad8Var).f62154a.f57567a == ReviewCardLayoutStyle.FlashcardFront ? ReviewAnimationType.Flashcard : ReviewAnimationType.QuizQuestion;
            } else if (ad8Var instanceof uc8) {
                reviewAnimationType = ((uc8) ad8Var).f63720a.f57567a == ReviewCardLayoutStyle.FlashcardBack ? ReviewAnimationType.Flashcard : ReviewAnimationType.QuizResult;
            } else if (ad8Var instanceof wc8) {
                reviewAnimationType = ReviewAnimationType.Matching;
            } else if (ad8Var instanceof yc8) {
                reviewAnimationType = ReviewAnimationType.Speaking;
            } else if (ad8Var instanceof zc8) {
                reviewAnimationType = ReviewAnimationType.Unscramble;
            } else {
                if (!(ad8Var instanceof xc8)) {
                    gm5.m12750e();
                    return;
                }
                reviewAnimationType = ReviewAnimationType.SessionComplete;
            }
            C2636a c2636a = new C2636a(i4, reviewAnimationType);
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new qv7(12);
                tj3Var2.m22131l0(objM22097O2);
            }
            vi3Var2 = vi3Var;
            tj3 tj3Var4 = tj3Var2;
            AbstractC0054a.m727b(c2636a, null, (vi3) objM22097O2, null, "ReviewContent", null, ci8.m4703P(906840185, new jk0(4, hg8Var2, vi3Var2), tj3Var2), tj3Var4, 1597824, 42);
            tj3Var = tj3Var4;
            m9582e(hg8Var2.f42330e, tj3Var, r0);
            tj3Var.m22139q(z);
            tj3Var.m22139q(z);
            tj3Var.m22139q(z);
        } else {
            hg8Var2 = hg8Var;
            vi3Var2 = vi3Var;
            tj3Var = tj3Var3;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fs0(hg8Var2, f, vi3Var2, e16Var, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m9585h(final hg8 hg8Var, final vi3 vi3Var, ye1 ye1Var, int i) {
        hg8Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(320924814);
        int i2 = i | (tj3Var.m22120g(hg8Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            be8 be8Var = hg8Var.f42327b;
            int i3 = be8Var.f8438b;
            final float f = i3 == 0 ? 0.0f : be8Var.f8437a / (i3 < 1 ? 1 : i3);
            boolean z = true;
            b34.m3232b(null, ci8.m4703P(-821537966, new de8(vi3Var, hg8Var), tj3Var), ci8.m4703P(-1340830253, new de8(hg8Var, vi3Var), tj3Var), null, null, 0, 0L, 0L, null, ci8.m4703P(-683918435, new aj3() { // from class: fe8
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    t17 t17Var = (t17) obj;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t17Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                    }
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        AbstractC2752c.m9584g(hg8Var, f, vi3Var, AbstractC3584sr.m21606S(b16.f7762a, t17Var), tj3Var2, 0);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 805306800, 505);
            ce8 ce8Var = hg8Var.f42333h;
            if (ce8Var == null) {
                ce8Var = null;
            }
            p84 p84Var = we1.f66679a;
            if (ce8Var == null) {
                tj3Var.m22111b0(75607847);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(75607848);
                String str = ce8Var.f9987a;
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new C3288l7(7);
                    tj3Var.m22131l0(objM22097O);
                }
                xb8.m24440a(str, (ui3) objM22097O, tj3Var, 3072);
                tj3Var.m22139q(false);
            }
            rg8 rg8Var = hg8Var.f42334i;
            rg8 rg8Var2 = rg8Var != null ? rg8Var : null;
            if (rg8Var2 == null) {
                tj3Var.m22111b0(75868092);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(75868093);
                ReviewResultType reviewResultType = rg8Var2.f59238a;
                String str2 = rg8Var2.f59239b;
                String str3 = rg8Var2.f59240c;
                String str4 = rg8Var2.f59241d;
                int i4 = i2 & 112;
                boolean z2 = i4 == 32;
                Object objM22097O2 = tj3Var.m22097O();
                if (z2 || objM22097O2 == p84Var) {
                    objM22097O2 = new nc8(vi3Var, 7);
                    tj3Var.m22131l0(objM22097O2);
                }
                ui3 ui3Var = (ui3) objM22097O2;
                if (i4 != 32) {
                    z = false;
                }
                Object objM22097O3 = tj3Var.m22097O();
                if (z || objM22097O3 == p84Var) {
                    objM22097O3 = new nc8(vi3Var, 8);
                    tj3Var.m22131l0(objM22097O3);
                }
                jxc.m14740a(reviewResultType, str2, str3, str4, ui3Var, (ui3) objM22097O3, tj3Var, 196608);
                tj3Var.m22139q(false);
            }
            gd8 gd8Var = hg8Var.f42331f;
            if (gd8Var == null) {
                tj3Var.m22111b0(76313345);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(76313346);
                m9580c(gd8Var, vi3Var, tj3Var, i2 & 112);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new de8(hg8Var, vi3Var, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m9586i(ze8 ze8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(190356703);
        int i2 = (tj3Var.m22124i(ze8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4411d(b16.f7762a, 1.0f), 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 1);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
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
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            ywc.m25370c(ze8Var, vi3Var, tj3Var, i2 & 126);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ee8(ze8Var, vi3Var, i, 0);
        }
    }
}
