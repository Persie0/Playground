package p000;

import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.layout.AbstractC0337d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.challenge.ChallengeStatus;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a6d {
    /* JADX INFO: renamed from: a */
    public static final void m143a(final float f, float f2, final int i, final int i2, final long j, long j2, ye1 ye1Var, zi3 zi3Var, aj3 aj3Var, e16 e16Var, yn8 yn8Var, final C0282a c0282a) {
        final float f3;
        final zi3 zi3Var2;
        final aj3 aj3VarM4703P;
        final e16 e16Var2;
        final yn8 yn8Var2;
        final long j3;
        int i3;
        float f4;
        long j4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(450849184);
        int i4 = i2 | (tj3Var.m22116e(i) ? 4 : 2) | 8368 | (tj3Var.m22114d(f) ? 131072 : 65536) | 114819072;
        if (tj3Var.m22099R(i4 & 1, (306783379 & i4) != 306783378)) {
            tj3Var.m22104W();
            if ((i2 & 1) == 0 || tj3Var.m22084B()) {
                yn8 yn8VarM3972r0 = bna.m3972r0(tj3Var);
                long jM20492e = ra1.m20492e(tj7.f62419e, tj3Var);
                i3 = i4 & (-58241);
                yn8Var2 = yn8VarM3972r0;
                aj3VarM4703P = ci8.m4703P(835301263, new pe0(i, 6), tj3Var);
                e16Var2 = b16.f7762a;
                f4 = 90.0f;
                zi3Var2 = ppc.f56642c;
                j4 = jM20492e;
            } else {
                tj3Var.m22102U();
                i3 = i4 & (-58241);
                f4 = f2;
                j4 = j2;
                zi3Var2 = zi3Var;
                aj3VarM4703P = aj3Var;
                e16Var2 = e16Var;
                yn8Var2 = yn8Var;
            }
            tj3Var.m22140r();
            m145c(f, f4, i, 918749184 | ((i3 >> 3) & 57344) | (i3 & 126) | 384, j, j4, tj3Var, zi3Var2, aj3VarM4703P, e16Var2, yn8Var2, c0282a);
            f3 = f4;
            j3 = j4;
        } else {
            tj3Var.m22102U();
            f3 = f2;
            zi3Var2 = zi3Var;
            aj3VarM4703P = aj3Var;
            e16Var2 = e16Var;
            yn8Var2 = yn8Var;
            j3 = j2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(f, f3, i, i2, j, j3, zi3Var2, aj3VarM4703P, e16Var2, yn8Var2, c0282a) { // from class: pq9

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f56688a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ e16 f56689b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ yn8 f56690c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f56691d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f56692e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ float f56693f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ aj3 f56694g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ zi3 f56695h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ float f56696i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ C0282a f56697j;

                {
                    this.f56689b = e16Var2;
                    this.f56690c = yn8Var2;
                    this.f56691d = j;
                    this.f56692e = j3;
                    this.f56694g = aj3VarM4703P;
                    this.f56695h = zi3Var2;
                    this.f56697j = c0282a;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(805309441);
                    a6d.m143a(this.f56693f, this.f56696i, this.f56688a, iM19383z, this.f56691d, this.f56692e, (ye1) obj, this.f56695h, this.f56694g, this.f56689b, this.f56690c, this.f56697j);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m144b(final int i, e16 e16Var, final long j, long j2, aj3 aj3Var, zi3 zi3Var, final C0282a c0282a, ye1 ye1Var, final int i2) {
        int i3;
        final e16 e16Var2;
        final long jM20492e;
        final aj3 aj3Var2;
        final zi3 zi3Var2;
        int i4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1012974221);
        if ((i2 & 6) == 0) {
            i3 = i2 | (tj3Var.m22116e(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48 | (tj3Var.m22118f(j) ? 256 : 128) | 222208;
        if (tj3Var.m22099R(i5 & 1, (599187 & i5) != 599186)) {
            tj3Var.m22104W();
            if ((i2 & 1) == 0 || tj3Var.m22084B()) {
                jM20492e = ra1.m20492e(tj7.f62419e, tj3Var);
                i4 = i5 & (-7169);
                C0282a c0282aM4703P = ci8.m4703P(1338273762, new pe0(i, 5), tj3Var);
                b16 b16Var = b16.f7762a;
                zi3Var2 = ppc.f56640a;
                aj3Var2 = c0282aM4703P;
                e16Var2 = b16Var;
            } else {
                tj3Var.m22102U();
                i4 = i5 & (-7169);
                e16Var2 = e16Var;
                jM20492e = j2;
                aj3Var2 = aj3Var;
                zi3Var2 = zi3Var;
            }
            tj3Var.m22140r();
            m147e(e16Var2, j, jM20492e, aj3Var2, zi3Var2, c0282a, tj3Var, (i4 >> 3) & 524286);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            jM20492e = j2;
            aj3Var2 = aj3Var;
            zi3Var2 = zi3Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: oq9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a6d.m144b(i, e16Var2, j, jM20492e, aj3Var2, zi3Var2, c0282a, (ye1) obj, pk9.m19383z(i2 | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m145c(final float f, final float f2, final int i, final int i2, final long j, final long j2, ye1 ye1Var, final zi3 zi3Var, final aj3 aj3Var, final e16 e16Var, final yn8 yn8Var, final C0282a c0282a) {
        int i3;
        float f3;
        final zi3 zi3Var2;
        final C0282a c0282a2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(414860860);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var.m22116e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22118f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= tj3Var.m22118f(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= tj3Var.m22114d(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            f3 = f2;
            i3 |= tj3Var.m22114d(f3) ? 131072 : 65536;
        } else {
            f3 = f2;
        }
        if ((1572864 & i2) == 0) {
            i3 |= tj3Var.m22120g(yn8Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= tj3Var.m22124i(aj3Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            zi3Var2 = zi3Var;
            i3 |= tj3Var.m22124i(zi3Var2) ? 67108864 : 33554432;
        } else {
            zi3Var2 = zi3Var;
        }
        if ((805306368 & i2) == 0) {
            c0282a2 = c0282a;
            i3 |= tj3Var.m22124i(c0282a2) ? 536870912 : 268435456;
        } else {
            c0282a2 = c0282a;
        }
        if (tj3Var.m22099R(i3 & 1, (306783379 & i3) != 306783378)) {
            final float f4 = f3;
            ho9.m13414a(e16Var, null, j, j2, 0.0f, 0.0f, null, ci8.m4703P(1878374785, new zi3() { // from class: lq9
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
                    Object qq9Var;
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objM22097O = tj3Var2.m22097O();
                        p84 p84Var = we1.f66679a;
                        if (objM22097O == p84Var) {
                            objM22097O = d32.m10013K(tj3Var2);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        un1 un1Var = (un1) objM22097O;
                        MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
                        l43 l43VarM21705c0 = ss5.m21705c0(motionSchemeKeyTokens, tj3Var2);
                        l43 l43VarM21705c1 = ss5.m21705c0(motionSchemeKeyTokens, tj3Var2);
                        yn8 yn8Var2 = yn8Var;
                        boolean zM22120g = tj3Var2.m22120g(yn8Var2) | tj3Var2.m22120g(un1Var);
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g || objM22097O2 == p84Var) {
                            objM22097O2 = new eo8(yn8Var2, un1Var, l43VarM21705c0);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        eo8 eo8Var = (eo8) objM22097O2;
                        Object objM22097O3 = tj3Var2.m22097O();
                        if (objM22097O3 == p84Var) {
                            objM22097O3 = new rq9(l43VarM21705c1);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        rq9 rq9Var = (rq9) objM22097O3;
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52814i, false);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        zi3 zi3Var3 = C0352b.f4303f;
                        oha.m18001g(tj3Var2, zi3Var3, ht5VarM19966d);
                        zi3 zi3Var4 = C0352b.f4302e;
                        oha.m18001g(tj3Var2, zi3Var4, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var5 = C0352b.f4304g;
                        oha.m18001g(tj3Var2, zi3Var5, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var2, vi3Var);
                        zi3 zi3Var6 = C0352b.f4301d;
                        oha.m18001g(tj3Var2, zi3Var6, e16VarM1322c);
                        zi3Var2.invoke(tj3Var2, 0);
                        List listM23605K = vz1.m23605K(c0282a2, ci8.m4703P(509386037, new eq8(16, aj3Var, rq9Var), tj3Var2));
                        e16 e16VarM19046p = pb1.m19046p(nv8.m17643c(bna.m3974s0(c99.m4430w(c99.m4412e(b16Var, 1.0f), nj0.f52811f, 2), yn8Var2, true, false), false, new zl8(29)));
                        float f5 = f;
                        boolean zM22114d = tj3Var2.m22114d(f5);
                        float f6 = f4;
                        boolean zM22114d2 = zM22114d | tj3Var2.m22114d(f6);
                        int i4 = i;
                        boolean zM22116e = zM22114d2 | tj3Var2.m22116e(i4) | tj3Var2.m22124i(eo8Var);
                        Object objM22097O4 = tj3Var2.m22097O();
                        if (zM22116e || objM22097O4 == p84Var) {
                            qq9Var = new qq9(f5, f6, rq9Var, i4, eo8Var);
                            tj3Var2.m22131l0(qq9Var);
                        } else {
                            qq9Var = objM22097O4;
                        }
                        p46 p46Var = (p46) qq9Var;
                        C0282a c0282aM1488c = AbstractC0337d.m1488c(listM23605K);
                        boolean zM22120g2 = tj3Var2.m22120g(p46Var);
                        Object objM22097O5 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O5 == p84Var) {
                            objM22097O5 = new q46(p46Var);
                            tj3Var2.m22131l0(objM22097O5);
                        }
                        ht5 ht5Var = (ht5) objM22097O5;
                        int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m2 = tj3Var2.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM19046p);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var3, ht5Var);
                        oha.m18001g(tj3Var2, zi3Var4, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var5, tj3Var2, vi3Var);
                        oha.m18001g(tj3Var2, zi3Var6, e16VarM1322c2);
                        c0282aM1488c.invoke(tj3Var2, 0);
                        tj3Var2.m22139q(true);
                        tj3Var2.m22139q(true);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, ((i3 >> 3) & 14) | 12582912 | (i3 & 896) | (i3 & 7168), 114);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: mq9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i2 | 1);
                    a6d.m145c(f, f2, i, iM19383z, j, j2, (ye1) obj, zi3Var, aj3Var, e16Var, yn8Var, c0282a);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m146d(int i, e16 e16Var, long j, long j2, aj3 aj3Var, zi3 zi3Var, C0282a c0282a, ye1 ye1Var, int i2) {
        long jM20492e;
        long jM20492e2;
        aj3 aj3VarM4703P;
        zi3 zi3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(563434725);
        int i3 = 4;
        int i4 = i2 | (tj3Var.m22116e(i) ? 4 : 2) | 222336;
        if (tj3Var.m22099R(i4 & 1, (599187 & i4) != 599186)) {
            tj3Var.m22104W();
            if ((i2 & 1) == 0 || tj3Var.m22084B()) {
                jM20492e = ra1.m20492e(mt8.f51830b, tj3Var);
                jM20492e2 = ra1.m20492e(mt8.f51829a, tj3Var);
                aj3VarM4703P = ci8.m4703P(959948692, new pe0(i, i3), tj3Var);
                zi3Var2 = ppc.f56641b;
            } else {
                tj3Var.m22102U();
                jM20492e = j;
                jM20492e2 = j2;
                aj3VarM4703P = aj3Var;
                zi3Var2 = zi3Var;
            }
            tj3Var.m22140r();
            m147e(e16Var, jM20492e, jM20492e2, aj3VarM4703P, zi3Var2, c0282a, tj3Var, 224262);
        } else {
            tj3Var.m22102U();
            jM20492e = j;
            jM20492e2 = j2;
            aj3VarM4703P = aj3Var;
            zi3Var2 = zi3Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nq9(i, e16Var, jM20492e, jM20492e2, aj3VarM4703P, zi3Var2, c0282a, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m147e(e16 e16Var, long j, long j2, aj3 aj3Var, zi3 zi3Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1955286154);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22118f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22118f(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(aj3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(zi3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22124i(c0282a) ? 131072 : 65536;
        }
        if (tj3Var2.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 << 3;
            tj3Var = tj3Var2;
            ho9.m13414a(nv8.m17643c(e16Var, false, new zl8(29)), null, j, j2, 0.0f, 0.0f, null, ci8.m4703P(830280655, new g39(c0282a, zi3Var, aj3Var, 8), tj3Var2), tj3Var, (i3 & 896) | 12582912 | (i3 & 7168), 114);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nq9(e16Var, j, j2, aj3Var, zi3Var, c0282a, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final ChallengeStatus m148f(Challenge challenge) {
        challenge.getClass();
        String str = challenge.f18867o;
        String str2 = "Unsuccessful";
        if (str != null) {
            if (vk9.m23391n0(str)) {
                str = "Unsuccessful";
            }
            str2 = str;
        }
        return ChallengeStatus.valueOf(str2);
    }
}
