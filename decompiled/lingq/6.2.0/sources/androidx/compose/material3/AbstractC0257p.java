package androidx.compose.material3;

import androidx.compose.material3.AbstractC0257p;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import kotlin.collections.AbstractC3194a;
import p000.AbstractC3393o1;
import p000.C2951e4;
import p000.b16;
import p000.c81;
import p000.cea;
import p000.ci8;
import p000.d32;
import p000.dx2;
import p000.e16;
import p000.ex2;
import p000.fx2;
import p000.ho9;
import p000.ky2;
import p000.ly2;
import p000.nv8;
import p000.o39;
import p000.p73;
import p000.p84;
import p000.ra1;
import p000.tj3;
import p000.ui3;
import p000.v56;
import p000.vi3;
import p000.vx9;
import p000.w73;
import p000.we1;
import p000.wfb;
import p000.x18;
import p000.x49;
import p000.xc9;
import p000.xj2;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.material3.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0257p {

    /* JADX INFO: renamed from: a */
    public static final float f3568a;

    /* JADX INFO: renamed from: b */
    public static final float f3569b;

    /* JADX INFO: renamed from: c */
    public static final float f3570c;

    /* JADX INFO: renamed from: d */
    public static final float f3571d;

    /* JADX INFO: renamed from: e */
    public static final float f3572e;

    /* JADX INFO: renamed from: f */
    public static final TypographyKeyTokens f3573f;

    /* JADX INFO: renamed from: g */
    public static final float f3574g;

    /* JADX INFO: renamed from: h */
    public static final float f3575h;

    /* JADX INFO: renamed from: i */
    public static final float f3576i;

    /* JADX INFO: renamed from: j */
    public static final float f3577j;

    static {
        ShapeKeyTokens shapeKeyTokens = fx2.f39845a;
        f3568a = 56.0f;
        f3569b = 56.0f;
        f3570c = fx2.f39847c;
        f3571d = fx2.f39848d;
        f3572e = fx2.f39846b;
        f3573f = TypographyKeyTokens.TitleMedium;
        int i = dx2.f36358a;
        f3574g = 16.0f;
        f3575h = 12.0f;
        f3576i = 20.0f;
        f3577j = 80.0f;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1186a(final ui3 ui3Var, final e16 e16Var, boolean z, o39 o39Var, long j, long j2, p73 p73Var, ye1 ye1Var, final int i) {
        final boolean z2;
        final o39 o39Var2;
        final long j3;
        final long j4;
        final p73 p73Var2;
        int i2;
        o39 o39Var3;
        boolean z3;
        long j5;
        long jM20489b;
        p73 p73Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1161000600);
        int i3 = i | (tj3Var.m22124i(ui3Var) ? 256 : 128) | 843669504;
        if (tj3Var.m22099R(i3 & 1, (306783379 & i3) != 306783378)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                o39 o39VarM24271b = x49.m24271b(ex2.m11373a(), tj3Var);
                long jM20492e = ra1.m20492e(ly2.f50297a, tj3Var);
                i2 = i3 & (-268369921);
                o39Var3 = o39VarM24271b;
                z3 = true;
                j5 = jM20492e;
                jM20489b = ra1.m20489b(jM20492e, tj3Var);
                p73Var3 = new p73(ly2.f50298b, ly2.f50301e, ly2.f50299c, ly2.f50300d);
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-268369921);
                z3 = z;
                o39Var3 = o39Var;
                j5 = j;
                jM20489b = j2;
                p73Var3 = p73Var;
            }
            tj3Var.m22140r();
            m1188c(ui3Var, e16Var, o39Var3, j5, jM20489b, p73Var3, ci8.m4703P(632971498, new c81(2, z3), tj3Var), tj3Var, ((i2 >> 6) & 14) | 14155824);
            o39Var2 = o39Var3;
            j3 = j5;
            j4 = jM20489b;
            p73Var2 = p73Var3;
            z2 = z3;
        } else {
            tj3Var.m22102U();
            z2 = z;
            o39Var2 = o39Var;
            j3 = j;
            j4 = j2;
            p73Var2 = p73Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(e16Var, z2, o39Var2, j3, j4, p73Var2, i) { // from class: v73

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ e16 f64962b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f64963c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ o39 f64964d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f64965e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ long f64966f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ p73 f64967g;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(3127);
                    AbstractC0257p.m1186a(this.f64961a, this.f64962b, this.f64963c, this.f64964d, this.f64965e, this.f64966f, this.f64967g, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1187b(final ui3 ui3Var, final vx9 vx9Var, final float f, final float f2, final float f3, final float f4, final float f5, final e16 e16Var, final boolean z, final o39 o39Var, final long j, final long j2, final p73 p73Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        vx9 vx9Var2;
        float f6;
        int i4;
        p73 p73Var2;
        tj3 tj3Var;
        C0282a c0282a = wfb.f66767c;
        C0282a c0282a2 = wfb.f66768d;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(193103278);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22124i(c0282a) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22124i(c0282a2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var2.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            vx9Var2 = vx9Var;
            i3 |= tj3Var2.m22120g(vx9Var2) ? 2048 : 1024;
        } else {
            vx9Var2 = vx9Var;
        }
        if ((i & 24576) == 0) {
            f6 = f;
            i3 |= tj3Var2.m22114d(f6) ? 16384 : 8192;
        } else {
            f6 = f;
        }
        if ((i & 196608) == 0) {
            i3 |= tj3Var2.m22114d(f2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= tj3Var2.m22114d(f3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= tj3Var2.m22114d(f4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= tj3Var2.m22114d(f5) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tj3Var2.m22120g(e16Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (tj3Var2.m22122h(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var2.m22120g(o39Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= tj3Var2.m22118f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= tj3Var2.m22118f(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            p73Var2 = p73Var;
            i4 |= tj3Var2.m22120g(p73Var2) ? 16384 : 8192;
        } else {
            p73Var2 = p73Var;
        }
        if ((i2 & 196608) == 0) {
            i4 |= tj3Var2.m22120g(null) ? 131072 : 65536;
        }
        int i5 = i4;
        if (tj3Var2.m22099R(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 74899) == 74898) ? false : true)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            final float f7 = f6;
            int i6 = i3 >> 6;
            int i7 = i5 << 12;
            tj3Var = tj3Var2;
            m1189d(ui3Var, vx9Var2, Float.NaN, Float.NaN, e16Var, o39Var, j, j2, p73Var2, ci8.m4703P(-827388388, new zi3() { // from class: q73
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    Object objM24111g;
                    Object objM24111g2;
                    boolean z2;
                    C0282a c0282a3 = wfb.f66768d;
                    C0282a c0282a4 = wfb.f66767c;
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        faa faaVarM15046h = kaa.m15046h(Float.valueOf(z ? 1.0f : 0.0f), "expanded state", tj3Var3, 48, 0);
                        l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.FastSpatial, tj3Var3);
                        l43 l43VarM21705c1 = ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var3);
                        jda jdaVar = pk9.f56363h;
                        boolean zM11673g = faaVarM15046h.m11673g();
                        p84 p84Var = we1.f66679a;
                        if (zM11673g) {
                            objM24111g = wq1.m24111g(tj3Var3, 1666827533, false, faaVarM15046h);
                        } else {
                            tj3Var3.m22111b0(1666573488);
                            boolean zM22120g = tj3Var3.m22120g(faaVarM15046h);
                            objM24111g = tj3Var3.m22097O();
                            if (zM22120g || objM24111g == p84Var) {
                                jc9 jc9VarM16139y = lda.m16139y();
                                vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                                jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                                try {
                                    Object objM11669c = faaVarM15046h.m11669c();
                                    lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                                    tj3Var3.m22131l0(objM11669c);
                                    objM24111g = objM11669c;
                                } catch (Throwable th) {
                                    lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                                    throw th;
                                }
                            }
                            tj3Var3.m22139q(false);
                        }
                        float fFloatValue = ((Number) objM24111g).floatValue();
                        tj3Var3.m22111b0(-157343033);
                        tj3Var3.m22139q(false);
                        Float fValueOf = Float.valueOf(fFloatValue);
                        boolean zM22120g2 = tj3Var3.m22120g(faaVarM15046h);
                        Object objM22097O = tj3Var3.m22097O();
                        if (zM22120g2 || objM22097O == p84Var) {
                            objM22097O = AbstractC0278f.m1254d(new m01(faaVarM15046h, 6));
                            tj3Var3.m22131l0(objM22097O);
                        }
                        float fFloatValue2 = ((Number) ((dh9) objM22097O).getValue()).floatValue();
                        tj3Var3.m22111b0(-157343033);
                        tj3Var3.m22139q(false);
                        Float fValueOf2 = Float.valueOf(fFloatValue2);
                        boolean zM22120g3 = tj3Var3.m22120g(faaVarM15046h);
                        Object objM22097O2 = tj3Var3.m22097O();
                        if (zM22120g3 || objM22097O2 == p84Var) {
                            objM22097O2 = AbstractC0278f.m1254d(new m01(faaVarM15046h, 7));
                            tj3Var3.m22131l0(objM22097O2);
                        }
                        tj3Var3.m22111b0(-1114419602);
                        tj3Var3.m22139q(false);
                        final baa baaVarM15041c = kaa.m15041c(faaVarM15046h, fValueOf, fValueOf2, l43VarM21705c0, jdaVar, tj3Var3, 0);
                        if (faaVarM15046h.m11673g()) {
                            objM24111g2 = wq1.m24111g(tj3Var3, 1666827533, false, faaVarM15046h);
                        } else {
                            tj3Var3.m22111b0(1666573488);
                            boolean zM22120g4 = tj3Var3.m22120g(faaVarM15046h);
                            objM24111g2 = tj3Var3.m22097O();
                            if (zM22120g4 || objM24111g2 == p84Var) {
                                jc9 jc9VarM16139y2 = lda.m16139y();
                                vi3 vi3VarMo3163e2 = jc9VarM16139y2 != null ? jc9VarM16139y2.mo3163e() : null;
                                jc9 jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                                try {
                                    Object objM11669c2 = faaVarM15046h.m11669c();
                                    lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                                    tj3Var3.m22131l0(objM11669c2);
                                    objM24111g2 = objM11669c2;
                                } catch (Throwable th2) {
                                    lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                                    throw th2;
                                }
                            }
                            tj3Var3.m22139q(false);
                        }
                        float fFloatValue3 = ((Number) objM24111g2).floatValue();
                        tj3Var3.m22111b0(175363167);
                        tj3Var3.m22139q(false);
                        Float fValueOf3 = Float.valueOf(fFloatValue3);
                        boolean zM22120g5 = tj3Var3.m22120g(faaVarM15046h);
                        Object objM22097O3 = tj3Var3.m22097O();
                        if (zM22120g5 || objM22097O3 == p84Var) {
                            objM22097O3 = AbstractC0278f.m1254d(new m01(faaVarM15046h, 8));
                            tj3Var3.m22131l0(objM22097O3);
                        }
                        float fFloatValue4 = ((Number) ((dh9) objM22097O3).getValue()).floatValue();
                        tj3Var3.m22111b0(175363167);
                        tj3Var3.m22139q(false);
                        Float fValueOf4 = Float.valueOf(fFloatValue4);
                        boolean zM22120g6 = tj3Var3.m22120g(faaVarM15046h);
                        Object objM22097O4 = tj3Var3.m22097O();
                        if (zM22120g6 || objM22097O4 == p84Var) {
                            objM22097O4 = AbstractC0278f.m1254d(new m01(faaVarM15046h, 9));
                            tj3Var3.m22131l0(objM22097O4);
                        }
                        tj3Var3.m22111b0(-781713402);
                        tj3Var3.m22139q(false);
                        baa baaVarM15041c2 = kaa.m15041c(faaVarM15046h, fValueOf3, fValueOf4, l43VarM21705c1, jdaVar, tj3Var3, 0);
                        final float f8 = f7;
                        boolean zM22114d = tj3Var3.m22114d(f8) | tj3Var3.m22120g(baaVarM15041c);
                        Object objM22097O5 = tj3Var3.m22097O();
                        if (zM22114d || objM22097O5 == p84Var) {
                            objM22097O5 = new aj3() { // from class: t73
                                @Override // p000.aj3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    jt5 jt5Var = (jt5) obj3;
                                    ct5 ct5Var = (ct5) obj4;
                                    bk1 bk1Var = (bk1) obj5;
                                    int iM18233R = AbstractC3423or.m18233R(jt5Var.mo916w0(f8), ((Number) baaVarM15041c.getValue()).floatValue(), ct5Var.mo1513p(bk1.m3800h(bk1Var.f8631a)));
                                    l87 l87VarMo1514r = ct5Var.mo1514r(bk1Var.f8631a);
                                    return jt5Var.mo9895M0(iM18233R, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 5));
                                }
                            };
                            tj3Var3.m22131l0(objM22097O5);
                        }
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4425r(te1.m21968A(b16Var, (aj3) objM22097O5), f8, f2, 0.0f, 12), f3, 0.0f, f4, 0.0f, 10);
                        fc0 fc0Var = nj0.f52789H;
                        C3549ru c3549ru = eh0.f37236b;
                        sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var3, 48);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21611X);
                        se1.f60731q.getClass();
                        ui3 ui3Var2 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var2);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var3, vi3Var);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
                        c0282a3.invoke(tj3Var3, 0);
                        boolean zM22120g7 = tj3Var3.m22120g(faaVarM15046h);
                        Object objM22097O6 = tj3Var3.m22097O();
                        if (zM22120g7 || objM22097O6 == p84Var) {
                            objM22097O6 = AbstractC0278f.m1254d(new u73(faaVarM15046h, 0));
                            tj3Var3.m22131l0(objM22097O6);
                        }
                        if (((Boolean) ((dh9) objM22097O6).getValue()).booleanValue()) {
                            z2 = true;
                            tj3Var3.m22111b0(65953058);
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(65675329);
                            Object objM22097O7 = tj3Var3.m22097O();
                            if (objM22097O7 == p84Var) {
                                objM22097O7 = new C2951e4(24);
                                tj3Var3.m22131l0(objM22097O7);
                            }
                            e16 e16VarM17642b = nv8.m17642b(b16Var, (vi3) objM22097O7);
                            boolean zM22120g8 = tj3Var3.m22120g(baaVarM15041c2);
                            Object objM22097O8 = tj3Var3.m22097O();
                            if (zM22120g8 || objM22097O8 == p84Var) {
                                objM22097O8 = new z72(baaVarM15041c2, 1);
                                tj3Var3.m22131l0(objM22097O8);
                            }
                            e16 e16VarM1406a = AbstractC0309d.m1406a(e16VarM17642b, (vi3) objM22097O8);
                            sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, nj0.f52817l, tj3Var3, 0);
                            int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                            l77 l77VarM22132m2 = tj3Var3.m22132m();
                            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM1406a);
                            tj3Var3.m22119f0();
                            if (tj3Var3.f62384S) {
                                tj3Var3.m22130l(ui3Var2);
                            } else {
                                tj3Var3.m22137o0();
                            }
                            oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a2);
                            oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                            AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                            oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                            thb.m22044c(tj3Var3, c99.m4426s(b16Var, f5));
                            c0282a4.invoke(tj3Var3, 0);
                            z2 = true;
                            tj3Var3.m22139q(true);
                            tj3Var3.m22139q(false);
                        }
                        tj3Var3.m22139q(z2);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, (i6 & 112) | (i6 & 14) | 3456 | ((i3 >> 15) & 57344) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), 6);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: r73
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    AbstractC0257p.m1187b(ui3Var, vx9Var, f, f2, f3, f4, f5, e16Var, z, o39Var, j, j2, p73Var, (ye1) obj, iM19383z, iM19383z2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m1188c(ui3 ui3Var, e16 e16Var, o39 o39Var, long j, long j2, p73 p73Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(748201188);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22120g(e16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(o39Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22118f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22118f(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22120g(p73Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var2.m22120g(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= tj3Var2.m22124i(c0282a) ? 8388608 : 4194304;
        }
        if (tj3Var2.m22099R(i2 & 1, (4793491 & i2) != 4793490)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            int i3 = i2 << 9;
            tj3Var = tj3Var2;
            m1189d(ui3Var, cea.m4600a(ex2.m11374b(), tj3Var2), ky2.m15731a(), 56.0f, e16Var, o39Var, j, j2, p73Var, c0282a, tj3Var, (i2 & 14) | 3456 | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), (i2 >> 21) & 14);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new w73(ui3Var, e16Var, o39Var, j, j2, p73Var, c0282a, i, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m1189d(final ui3 ui3Var, final vx9 vx9Var, final float f, final float f2, final e16 e16Var, final o39 o39Var, final long j, final long j2, final p73 p73Var, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        int i3;
        float f3;
        o39 o39Var2;
        C0282a c0282a2;
        int i4;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(121669932);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22120g(vx9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var2.m22114d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            f3 = f2;
            i3 |= tj3Var2.m22114d(f3) ? 2048 : 1024;
        } else {
            f3 = f2;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var2.m22120g(e16Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            o39Var2 = o39Var;
            i3 |= tj3Var2.m22120g(o39Var2) ? 131072 : 65536;
        } else {
            o39Var2 = o39Var;
        }
        if ((1572864 & i) == 0) {
            i3 |= tj3Var2.m22118f(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= tj3Var2.m22118f(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= tj3Var2.m22120g(p73Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= tj3Var2.m22120g(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            c0282a2 = c0282a;
            i4 = i2 | (tj3Var2.m22124i(c0282a2) ? 4 : 2);
        } else {
            c0282a2 = c0282a;
            i4 = i2;
        }
        boolean z = true;
        if (tj3Var2.m22099R(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            tj3Var2.m22111b0(-282853233);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC3393o1.m17729d(tj3Var2);
            }
            v56 v56Var = (v56) objM22097O;
            tj3Var2.m22139q(false);
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new C2951e4(25);
                tj3Var2.m22131l0(objM22097O2);
            }
            e16 e16VarM17643c = nv8.m17643c(e16Var, false, (vi3) objM22097O2);
            float f4 = p73Var.f55689a;
            int i5 = i3 >> 21;
            int i6 = i5 & 112;
            boolean zM22120g = tj3Var2.m22120g(v56Var);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                objM22097O3 = new C0256o(p73Var.f55689a, p73Var.f55690b, p73Var.f55692d, p73Var.f55691c);
                tj3Var2.m22131l0(objM22097O3);
            }
            C0256o c0256o = (C0256o) objM22097O3;
            boolean zM22124i = tj3Var2.m22124i(c0256o);
            if (((i6 ^ 48) <= 32 || !tj3Var2.m22120g(p73Var)) && (i5 & 48) != 32) {
                z = false;
            }
            boolean z2 = zM22124i | z;
            Object objM22097O4 = tj3Var2.m22097O();
            if (z2 || objM22097O4 == p84Var) {
                objM22097O4 = new FloatingActionButtonElevation$animateElevation$1$1(c0256o, p73Var, null);
                tj3Var2.m22131l0(objM22097O4);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O4, p73Var);
            boolean zM22120g2 = tj3Var2.m22120g(v56Var) | tj3Var2.m22124i(c0256o);
            Object objM22097O5 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O5 == p84Var) {
                objM22097O5 = new FloatingActionButtonElevation$animateElevation$2$1(v56Var, c0256o, null);
                tj3Var2.m22131l0(objM22097O5);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O5, v56Var);
            final float f5 = f3;
            final C0282a c0282a3 = c0282a2;
            int i7 = i3 & 14;
            int i8 = i3 >> 6;
            tj3Var = tj3Var2;
            ho9.m13415b(ui3Var, e16VarM17643c, false, o39Var2, j, j2, f4, ((xj2) ((xc9) c0256o.f3565e.f1540c.f8704b).getValue()).f68285a, null, v56Var, ci8.m4703P(-1779603465, new zi3() { // from class: y73
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final float f6 = f;
                        final float f7 = f5;
                        final C0282a c0282a4 = c0282a3;
                        AbstractC3489q9.m19773c(j2, vx9Var, ci8.m4703P(-1767363041, new zi3() { // from class: s73
                            @Override // p000.zi3
                            public final Object invoke(Object obj3, Object obj4) {
                                ye1 ye1Var3 = (ye1) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                tj3 tj3Var4 = (tj3) ye1Var3;
                                if (tj3Var4.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    e16 e16VarM4408a = c99.m4408a(b16.f7762a, f6, f7);
                                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                                    int iHashCode = Long.hashCode(tj3Var4.f62385T);
                                    l77 l77VarM22132m = tj3Var4.m22132m();
                                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var4, e16VarM4408a);
                                    se1.f60731q.getClass();
                                    ui3 ui3Var2 = C0352b.f4299b;
                                    tj3Var4.m22119f0();
                                    if (tj3Var4.f62384S) {
                                        tj3Var4.m22130l(ui3Var2);
                                    } else {
                                        tj3Var4.m22137o0();
                                    }
                                    oha.m18001g(tj3Var4, C0352b.f4303f, ht5VarM19966d);
                                    oha.m18001g(tj3Var4, C0352b.f4302e, l77VarM22132m);
                                    oha.m18001g(tj3Var4, C0352b.f4304g, Integer.valueOf(iHashCode));
                                    oha.m18000f(tj3Var4, C0352b.f4305h);
                                    oha.m18001g(tj3Var4, C0352b.f4301d, e16VarM1322c);
                                    wq1.m24128x(0, c0282a4, tj3Var4, true);
                                } else {
                                    tj3Var4.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var3), tj3Var3, 384);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, i7 | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 260);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: z73
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    AbstractC0257p.m1189d(ui3Var, vx9Var, f, f2, e16Var, o39Var, j, j2, p73Var, c0282a, (ye1) obj, iM19383z, iM19383z2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m1190e(final ui3 ui3Var, e16 e16Var, boolean z, o39 o39Var, long j, long j2, p73 p73Var, ye1 ye1Var, final int i) {
        final e16 e16Var2;
        final boolean z2;
        final o39 o39Var2;
        final long j3;
        final long j4;
        final p73 p73Var2;
        int i2;
        o39 o39Var3;
        long j5;
        p73 p73Var3;
        long j6;
        e16 e16Var3;
        boolean z3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1146347203);
        int i3 = i | (tj3Var.m22124i(ui3Var) ? 256 : 128) | 843672576;
        if (tj3Var.m22099R(i3 & 1, (306783379 & i3) != 306783378)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                o39 o39VarM24271b = x49.m24271b(fx2.f39845a, tj3Var);
                long jM20492e = ra1.m20492e(ly2.f50297a, tj3Var);
                long jM20489b = ra1.m20489b(jM20492e, tj3Var);
                i2 = i3 & (-268369921);
                o39Var3 = o39VarM24271b;
                j5 = jM20492e;
                p73Var3 = new p73(ly2.f50298b, ly2.f50301e, ly2.f50299c, ly2.f50300d);
                j6 = jM20489b;
                e16Var3 = b16.f7762a;
                z3 = true;
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-268369921);
                e16Var3 = e16Var;
                z3 = z;
                o39Var3 = o39Var;
                j5 = j;
                j6 = j2;
                p73Var3 = p73Var;
            }
            tj3Var.m22140r();
            m1187b(ui3Var, cea.m4600a(f3573f, tj3Var), f3568a, f3569b, f3570c, f3571d, f3572e, e16Var3, z3, o39Var3, j5, j6, p73Var3, tj3Var, (i2 & 896) | 920346678, 196614);
            e16Var2 = e16Var3;
            z2 = z3;
            o39Var2 = o39Var3;
            j3 = j5;
            j4 = j6;
            p73Var2 = p73Var3;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z2 = z;
            o39Var2 = o39Var;
            j3 = j;
            j4 = j2;
            p73Var2 = p73Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(e16Var2, z2, o39Var2, j3, j4, p73Var2, i) { // from class: x73

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ e16 f67872b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f67873c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ o39 f67874d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f67875e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ long f67876f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ p73 f67877g;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(55);
                    AbstractC0257p.m1190e(this.f67871a, this.f67872b, this.f67873c, this.f67874d, this.f67875e, this.f67876f, this.f67877g, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }
}
