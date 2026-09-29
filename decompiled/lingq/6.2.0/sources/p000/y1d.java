package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.stats.ActivityScore;
import com.lingq.feature.reader.R$drawable;
import com.lingq.feature.reader.R$string;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y1d {
    /* JADX INFO: renamed from: a */
    public static final void m24846a(final LanguageProgressMetric languageProgressMetric, final String str, final double d, final double d2, final ActivityScore activityScore, ye1 ye1Var, final int i) {
        long jM4213f;
        int i2;
        languageProgressMetric.getClass();
        str.getClass();
        activityScore.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(138222483);
        int i3 = i | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22112c(d) ? 256 : 128) | (tj3Var.m22112c(d2) ? 2048 : 1024) | (tj3Var.m22116e(activityScore.ordinal()) ? 16384 : 8192);
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = AbstractC2955e8.f36828a[activityScore.ordinal()];
            if (i4 == 1) {
                tj3Var.m22111b0(-312172039);
                jM4213f = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4213f();
                tj3Var.m22139q(false);
            } else if (i4 == 2) {
                tj3Var.m22111b0(-312169831);
                jM4213f = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4218k();
                tj3Var.m22139q(false);
            } else if (i4 == 3) {
                tj3Var.m22111b0(-312167495);
                jM4213f = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4218k();
                tj3Var.m22139q(false);
            } else {
                if (i4 != 4) {
                    throw ux5.m23001x(tj3Var, -312174424, false);
                }
                tj3Var.m22111b0(-312165192);
                jM4213f = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
                tj3Var.m22139q(false);
            }
            final long j = jM4213f;
            int i5 = AbstractC2955e8.f36829b[languageProgressMetric.ordinal()];
            if (i5 == 1) {
                i2 = R$drawable.ic_stats_read;
            } else if (i5 != 2) {
                i2 = i5 != 3 ? R$drawable.ic_stats_read : com.lingq.core.p012ui.R$drawable.ic_stats_lingqs;
            } else {
                i2 = R$drawable.ic_stats_listened;
            }
            final int i6 = i2;
            mn0 mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var);
            tj3Var = tj3Var;
            r46.m20381f(null, null, null, mn0VarM21999m, ci8.m4703P(-993990167, new aj3() { // from class: b8
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    double d3;
                    boolean z;
                    String strM23618Z;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var2).f38957f);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21607T);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var2, vi3Var);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        fc0 fc0Var = nj0.f52789H;
                        C3549ru c3549ru = eh0.f37236b;
                        sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var2, 48);
                        int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m2 = tj3Var2.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                        bq1.m4042R(AbstractC3423or.m18236U(i6, tj3Var2, 0), null, wq1.m24108d(tj3Var2, b16Var, 24.0f), null, null, 0.0f, null, tj3Var2, 56, 120);
                        thb.m22044c(tj3Var2, c99.m4426s(b16Var, ge9.m12515a(tj3Var2).f38952a));
                        lw9.m16554b(str, new as4(1.0f, true), p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71407k, tj3Var2, 0, 0, 131064);
                        String strM23620a0 = vz1.m23620a0(tj3Var2, AbstractC3423or.m18228M(activityScore));
                        vx9 vx9Var = p58.m18902j(tj3Var2).f71407k;
                        bc3 bc3Var = bc3.f8323i;
                        long j2 = j;
                        lw9.m16554b(strM23620a0, null, j2, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var2, 1572864, 0, 131002);
                        tj3Var2.m22139q(true);
                        thb.m22044c(tj3Var2, c99.m4414g(b16Var, ge9.m12515a(tj3Var2).f38952a));
                        sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, nj0.f52790I, tj3Var2, 48);
                        int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m3 = tj3Var2.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, b16Var);
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
                        LanguageProgressMetric languageProgressMetric2 = languageProgressMetric;
                        boolean zM21391a = shd.m21391a(languageProgressMetric2);
                        double d4 = d;
                        String strValueOf = zM21391a ? String.valueOf((int) d4) : String.valueOf(nob.m17572a(2, d4));
                        String str2 = strValueOf;
                        lw9.m16554b(str2, null, p58.m18900f(tj3Var2).f55873q, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71401e, tj3Var2, 1572864, 0, 131002);
                        boolean zM21391a2 = shd.m21391a(languageProgressMetric2);
                        double d5 = d2;
                        lw9.m16554b(AbstractC3393o1.m17734i("/", zM21391a2 ? String.valueOf((int) d5) : String.valueOf(nob.m17572a(2, d5))), AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38954c, 7), p58.m18900f(tj3Var2).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, 0, 0, 131064);
                        tj3Var2.m22139q(true);
                        e16 e16VarM4414g = c99.m4414g(ux5.m22984g(b16Var, ge9.m12515a(tj3Var2).f38952a, tj3Var2, b16Var, 1.0f), 6.0f);
                        long j3 = p58.m18900f(tj3Var2).f55823H;
                        boolean zM22112c = tj3Var2.m22112c(d4) | tj3Var2.m22112c(d5);
                        Object objM22097O = tj3Var2.m22097O();
                        if (zM22112c || objM22097O == we1.f66679a) {
                            C2918d8 c2918d8 = new C2918d8(d4, d5, 0);
                            d3 = d4;
                            tj3Var2.m22131l0(c2918d8);
                            objM22097O = c2918d8;
                        } else {
                            d3 = d4;
                        }
                        dn7.m10494c((ui3) objM22097O, e16VarM4414g, j2, j3, 1, 0.0f, null, tj3Var2, 48, 96);
                        thb.m22044c(tj3Var2, c99.m4414g(b16Var, ge9.m12515a(tj3Var2).f38952a));
                        double d6 = d5 - d3;
                        if (d6 <= 0.0d) {
                            tj3Var2.m22111b0(-58848925);
                            strM23618Z = vz1.m23620a0(tj3Var2, R$string.stats_activity_exceeded_goal);
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(-58710789);
                            int i7 = AbstractC2955e8.f36829b[languageProgressMetric2.ordinal()];
                            if (i7 == 1) {
                                z = false;
                                tj3Var2.m22111b0(-556081323);
                                strM23618Z = vz1.m23618Z(R$string.stats_activity_words_left, new Object[]{Integer.valueOf((int) d6)}, tj3Var2);
                                tj3Var2.m22139q(false);
                            } else if (i7 == 2) {
                                z = false;
                                tj3Var2.m22111b0(-556067743);
                                strM23618Z = vz1.m23618Z(R$string.stats_activity_hours_left, new Object[]{String.valueOf(nob.m17572a(2, d6))}, tj3Var2);
                                tj3Var2.m22139q(false);
                            } else if (i7 != 3) {
                                tj3Var2.m22111b0(-58046337);
                                z = false;
                                tj3Var2.m22139q(false);
                                strM23618Z = "";
                            } else {
                                z = false;
                                tj3Var2.m22111b0(-556074570);
                                strM23618Z = vz1.m23618Z(R$string.stats_activity_lingqs_left, new Object[]{Integer.valueOf((int) d6)}, tj3Var2);
                                tj3Var2.m22139q(false);
                            }
                            tj3Var2.m22139q(z);
                        }
                        lw9.m16554b(strM23618Z, null, p58.m18900f(tj3Var2).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71408l, tj3Var2, 0, 0, 131066);
                        tj3Var2.m22139q(true);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 24576, 7);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(str, d, d2, activityScore, i) { // from class: c8

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f9682b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ double f9683c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ double f9684d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ActivityScore f9685e;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(7);
                    y1d.m24846a(this.f9681a, this.f9682b, this.f9683c, this.f9684d, this.f9685e, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }
}
