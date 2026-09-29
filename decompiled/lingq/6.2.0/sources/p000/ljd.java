package p000;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ljd {
    /* JADX INFO: renamed from: a */
    public static final void m16308a(final s65 s65Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i, int i2) {
        vi3 vi3Var3;
        int i3;
        vi3 vi3Var4;
        int i4;
        vi3 vi3Var5;
        vi3 vi3Var6;
        vi3 vi3Var7;
        vi3 vi3Var8;
        s65Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1556360542);
        int i5 = i | (tj3Var.m22124i(s65Var) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            vi3Var3 = vi3Var;
        } else {
            vi3Var3 = vi3Var;
            i3 = i5 | (tj3Var.m22124i(vi3Var3) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
            vi3Var4 = vi3Var2;
        } else {
            vi3Var4 = vi3Var2;
            i4 = i3 | (tj3Var.m22124i(vi3Var4) ? 256 : 128);
        }
        if (tj3Var.m22099R(i4 & 1, (i4 & 147) != 146)) {
            p84 p84Var = we1.f66679a;
            if (i6 != 0) {
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new qy3(10);
                    tj3Var.m22131l0(objM22097O);
                }
                vi3Var7 = (vi3) objM22097O;
            } else {
                vi3Var7 = vi3Var3;
            }
            if (i7 != 0) {
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new qy3(10);
                    tj3Var.m22131l0(objM22097O2);
                }
                vi3Var8 = (vi3) objM22097O2;
            } else {
                vi3Var8 = vi3Var4;
            }
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
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
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var9 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var9);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
            e16 e16VarM18285y = AbstractC3423or.m18285y(e16VarM4412e2, intrinsicSize);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28));
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var, tj3Var, 48);
            final vi3 vi3Var10 = vi3Var7;
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM18285y);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var9);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            vj8 vj8Var = vj8.f65508a;
            final int i8 = 0;
            final vi3 vi3Var11 = vi3Var8;
            m16309b(c99.m4410c(vj8Var.mo12420a(1.0f, b16Var, true), 1.0f), R$drawable.ic_stats_lingqs, vz1.m23620a0(tj3Var, R$string.complete_lingqs_created), null, ci8.m4703P(-1182535341, new zi3() { // from class: n65
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i8;
                    b16 b16Var2 = b16.f7762a;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    xfa xfaVar = xfa.f68157a;
                    s65 s65Var2 = s65Var;
                    switch (i9) {
                        case 0:
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var2.m22102U();
                            } else {
                                Integer num = s65Var2.f60412f;
                                if (num == null) {
                                    tj3Var2.m22111b0(-1588212262);
                                    ljd.m16311d(null, tj3Var2, 0);
                                    tj3Var2.m22139q(false);
                                } else {
                                    tj3Var2.m22111b0(-1588440484);
                                    lw9.m16554b(String.valueOf(num.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var2, 1572864, 0, 131006);
                                    tj3Var2.m22139q(false);
                                }
                            }
                            break;
                        case 1:
                            ye1 ye1Var3 = (ye1) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            tj3 tj3Var3 = (tj3) ye1Var3;
                            if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                tj3Var3.m22102U();
                            } else {
                                Integer num2 = s65Var2.f60413g;
                                if (num2 == null) {
                                    tj3Var3.m22111b0(-385178543);
                                    ljd.m16311d(null, tj3Var3, 0);
                                    tj3Var3.m22139q(false);
                                } else {
                                    tj3Var3.m22111b0(-385403882);
                                    lw9.m16554b(String.valueOf(num2.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var3, 1572864, 0, 131006);
                                    tj3Var3.m22139q(false);
                                }
                            }
                            break;
                        case 2:
                            ye1 ye1Var4 = (ye1) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            tj3 tj3Var4 = (tj3) ye1Var4;
                            if (!tj3Var4.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                tj3Var4.m22102U();
                            } else {
                                Double d = s65Var2.f60416j;
                                if (d == null) {
                                    tj3Var4.m22111b0(-139515343);
                                    ljd.m16311d(null, tj3Var4, 0);
                                    tj3Var4.m22139q(false);
                                } else {
                                    tj3Var4.m22111b0(-139928480);
                                    long jDoubleValue = ((long) d.doubleValue()) / 60;
                                    long jDoubleValue2 = ((long) d.doubleValue()) - timeUnit.toSeconds(jDoubleValue);
                                    ljd.m16312e(String.valueOf(jDoubleValue), "m", tj3Var4, 48);
                                    thb.m22044c(tj3Var4, c99.m4426s(b16Var2, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38955d));
                                    ljd.m16312e(String.valueOf(jDoubleValue2), "s", tj3Var4, 48);
                                    tj3Var4.m22139q(false);
                                }
                            }
                            break;
                        case 3:
                            ye1 ye1Var5 = (ye1) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            tj3 tj3Var5 = (tj3) ye1Var5;
                            if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                tj3Var5.m22102U();
                            } else {
                                Double d2 = s65Var2.f60417k;
                                if (d2 == null) {
                                    tj3Var5.m22111b0(640856904);
                                    ljd.m16311d(null, tj3Var5, 0);
                                    tj3Var5.m22139q(false);
                                } else {
                                    tj3Var5.m22111b0(640686900);
                                    ljd.m16312e(String.valueOf((int) d2.doubleValue()), "wpm", tj3Var5, 48);
                                    tj3Var5.m22139q(false);
                                }
                            }
                            break;
                        case 4:
                            ye1 ye1Var6 = (ye1) obj;
                            int iIntValue5 = ((Integer) obj2).intValue();
                            tj3 tj3Var6 = (tj3) ye1Var6;
                            if (!tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                tj3Var6.m22102U();
                            } else {
                                long j = (long) s65Var2.f60410d;
                                long j2 = j / 60;
                                long seconds = j - timeUnit.toSeconds(j2);
                                zf1 zf1Var2 = AbstractC0402n.f4824p;
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)), "m", tj3Var6, 48);
                                thb.m22044c(tj3Var6, c99.m4426s(b16Var2, ((fe9) tj3Var6.m22128k(ge9.f40637a)).f38955d));
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1)), "s", tj3Var6, 48);
                            }
                            break;
                        default:
                            ye1 ye1Var7 = (ye1) obj;
                            int iIntValue6 = ((Integer) obj2).intValue();
                            tj3 tj3Var7 = (tj3) ye1Var7;
                            if (!tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                tj3Var7.m22102U();
                            } else {
                                ljd.m16312e(String.valueOf((int) s65Var2.f60408b), "w", tj3Var7, 48);
                            }
                            break;
                    }
                    return xfaVar;
                }
            }, tj3Var), tj3Var, 24576, 8);
            final int i9 = 1;
            m16309b(c99.m4410c(vj8Var.mo12420a(1.0f, b16Var, true), 1.0f), com.lingq.feature.reader.R$drawable.ic_stats_known_words, vz1.m23620a0(tj3Var, R$string.stats_known_words), null, ci8.m4703P(1326639036, new zi3() { // from class: n65
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i10 = i9;
                    b16 b16Var2 = b16.f7762a;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    xfa xfaVar = xfa.f68157a;
                    s65 s65Var2 = s65Var;
                    switch (i10) {
                        case 0:
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var2.m22102U();
                            } else {
                                Integer num = s65Var2.f60412f;
                                if (num == null) {
                                    tj3Var2.m22111b0(-1588212262);
                                    ljd.m16311d(null, tj3Var2, 0);
                                    tj3Var2.m22139q(false);
                                } else {
                                    tj3Var2.m22111b0(-1588440484);
                                    lw9.m16554b(String.valueOf(num.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var2, 1572864, 0, 131006);
                                    tj3Var2.m22139q(false);
                                }
                            }
                            break;
                        case 1:
                            ye1 ye1Var3 = (ye1) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            tj3 tj3Var3 = (tj3) ye1Var3;
                            if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                tj3Var3.m22102U();
                            } else {
                                Integer num2 = s65Var2.f60413g;
                                if (num2 == null) {
                                    tj3Var3.m22111b0(-385178543);
                                    ljd.m16311d(null, tj3Var3, 0);
                                    tj3Var3.m22139q(false);
                                } else {
                                    tj3Var3.m22111b0(-385403882);
                                    lw9.m16554b(String.valueOf(num2.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var3, 1572864, 0, 131006);
                                    tj3Var3.m22139q(false);
                                }
                            }
                            break;
                        case 2:
                            ye1 ye1Var4 = (ye1) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            tj3 tj3Var4 = (tj3) ye1Var4;
                            if (!tj3Var4.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                tj3Var4.m22102U();
                            } else {
                                Double d = s65Var2.f60416j;
                                if (d == null) {
                                    tj3Var4.m22111b0(-139515343);
                                    ljd.m16311d(null, tj3Var4, 0);
                                    tj3Var4.m22139q(false);
                                } else {
                                    tj3Var4.m22111b0(-139928480);
                                    long jDoubleValue = ((long) d.doubleValue()) / 60;
                                    long jDoubleValue2 = ((long) d.doubleValue()) - timeUnit.toSeconds(jDoubleValue);
                                    ljd.m16312e(String.valueOf(jDoubleValue), "m", tj3Var4, 48);
                                    thb.m22044c(tj3Var4, c99.m4426s(b16Var2, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38955d));
                                    ljd.m16312e(String.valueOf(jDoubleValue2), "s", tj3Var4, 48);
                                    tj3Var4.m22139q(false);
                                }
                            }
                            break;
                        case 3:
                            ye1 ye1Var5 = (ye1) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            tj3 tj3Var5 = (tj3) ye1Var5;
                            if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                tj3Var5.m22102U();
                            } else {
                                Double d2 = s65Var2.f60417k;
                                if (d2 == null) {
                                    tj3Var5.m22111b0(640856904);
                                    ljd.m16311d(null, tj3Var5, 0);
                                    tj3Var5.m22139q(false);
                                } else {
                                    tj3Var5.m22111b0(640686900);
                                    ljd.m16312e(String.valueOf((int) d2.doubleValue()), "wpm", tj3Var5, 48);
                                    tj3Var5.m22139q(false);
                                }
                            }
                            break;
                        case 4:
                            ye1 ye1Var6 = (ye1) obj;
                            int iIntValue5 = ((Integer) obj2).intValue();
                            tj3 tj3Var6 = (tj3) ye1Var6;
                            if (!tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                tj3Var6.m22102U();
                            } else {
                                long j = (long) s65Var2.f60410d;
                                long j2 = j / 60;
                                long seconds = j - timeUnit.toSeconds(j2);
                                zf1 zf1Var2 = AbstractC0402n.f4824p;
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)), "m", tj3Var6, 48);
                                thb.m22044c(tj3Var6, c99.m4426s(b16Var2, ((fe9) tj3Var6.m22128k(ge9.f40637a)).f38955d));
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1)), "s", tj3Var6, 48);
                            }
                            break;
                        default:
                            ye1 ye1Var7 = (ye1) obj;
                            int iIntValue6 = ((Integer) obj2).intValue();
                            tj3 tj3Var7 = (tj3) ye1Var7;
                            if (!tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                tj3Var7.m22102U();
                            } else {
                                ljd.m16312e(String.valueOf((int) s65Var2.f60408b), "w", tj3Var7, 48);
                            }
                            break;
                    }
                    return xfaVar;
                }
            }, tj3Var), tj3Var, 24576, 8);
            tj3Var.m22139q(true);
            e16 e16VarM18285y2 = AbstractC3423or.m18285y(c99.m4412e(b16Var, 1.0f), intrinsicSize);
            sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28)), fc0Var, tj3Var, 48);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM18285y2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var9);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            final int i10 = 2;
            m16309b(c99.m4410c(vj8Var.mo12420a(1.0f, b16Var, true), 1.0f), com.lingq.feature.reader.R$drawable.ic_stats_study_time, vz1.m23620a0(tj3Var, R$string.stats_study_time), null, ci8.m4703P(487145596, new zi3() { // from class: n65
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i11 = i10;
                    b16 b16Var2 = b16.f7762a;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    xfa xfaVar = xfa.f68157a;
                    s65 s65Var2 = s65Var;
                    switch (i11) {
                        case 0:
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var2.m22102U();
                            } else {
                                Integer num = s65Var2.f60412f;
                                if (num == null) {
                                    tj3Var2.m22111b0(-1588212262);
                                    ljd.m16311d(null, tj3Var2, 0);
                                    tj3Var2.m22139q(false);
                                } else {
                                    tj3Var2.m22111b0(-1588440484);
                                    lw9.m16554b(String.valueOf(num.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var2, 1572864, 0, 131006);
                                    tj3Var2.m22139q(false);
                                }
                            }
                            break;
                        case 1:
                            ye1 ye1Var3 = (ye1) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            tj3 tj3Var3 = (tj3) ye1Var3;
                            if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                tj3Var3.m22102U();
                            } else {
                                Integer num2 = s65Var2.f60413g;
                                if (num2 == null) {
                                    tj3Var3.m22111b0(-385178543);
                                    ljd.m16311d(null, tj3Var3, 0);
                                    tj3Var3.m22139q(false);
                                } else {
                                    tj3Var3.m22111b0(-385403882);
                                    lw9.m16554b(String.valueOf(num2.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var3, 1572864, 0, 131006);
                                    tj3Var3.m22139q(false);
                                }
                            }
                            break;
                        case 2:
                            ye1 ye1Var4 = (ye1) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            tj3 tj3Var4 = (tj3) ye1Var4;
                            if (!tj3Var4.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                tj3Var4.m22102U();
                            } else {
                                Double d = s65Var2.f60416j;
                                if (d == null) {
                                    tj3Var4.m22111b0(-139515343);
                                    ljd.m16311d(null, tj3Var4, 0);
                                    tj3Var4.m22139q(false);
                                } else {
                                    tj3Var4.m22111b0(-139928480);
                                    long jDoubleValue = ((long) d.doubleValue()) / 60;
                                    long jDoubleValue2 = ((long) d.doubleValue()) - timeUnit.toSeconds(jDoubleValue);
                                    ljd.m16312e(String.valueOf(jDoubleValue), "m", tj3Var4, 48);
                                    thb.m22044c(tj3Var4, c99.m4426s(b16Var2, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38955d));
                                    ljd.m16312e(String.valueOf(jDoubleValue2), "s", tj3Var4, 48);
                                    tj3Var4.m22139q(false);
                                }
                            }
                            break;
                        case 3:
                            ye1 ye1Var5 = (ye1) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            tj3 tj3Var5 = (tj3) ye1Var5;
                            if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                tj3Var5.m22102U();
                            } else {
                                Double d2 = s65Var2.f60417k;
                                if (d2 == null) {
                                    tj3Var5.m22111b0(640856904);
                                    ljd.m16311d(null, tj3Var5, 0);
                                    tj3Var5.m22139q(false);
                                } else {
                                    tj3Var5.m22111b0(640686900);
                                    ljd.m16312e(String.valueOf((int) d2.doubleValue()), "wpm", tj3Var5, 48);
                                    tj3Var5.m22139q(false);
                                }
                            }
                            break;
                        case 4:
                            ye1 ye1Var6 = (ye1) obj;
                            int iIntValue5 = ((Integer) obj2).intValue();
                            tj3 tj3Var6 = (tj3) ye1Var6;
                            if (!tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                tj3Var6.m22102U();
                            } else {
                                long j = (long) s65Var2.f60410d;
                                long j2 = j / 60;
                                long seconds = j - timeUnit.toSeconds(j2);
                                zf1 zf1Var2 = AbstractC0402n.f4824p;
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)), "m", tj3Var6, 48);
                                thb.m22044c(tj3Var6, c99.m4426s(b16Var2, ((fe9) tj3Var6.m22128k(ge9.f40637a)).f38955d));
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1)), "s", tj3Var6, 48);
                            }
                            break;
                        default:
                            ye1 ye1Var7 = (ye1) obj;
                            int iIntValue6 = ((Integer) obj2).intValue();
                            tj3 tj3Var7 = (tj3) ye1Var7;
                            if (!tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                tj3Var7.m22102U();
                            } else {
                                ljd.m16312e(String.valueOf((int) s65Var2.f60408b), "w", tj3Var7, 48);
                            }
                            break;
                    }
                    return xfaVar;
                }
            }, tj3Var), tj3Var, 24576, 8);
            final int i11 = 3;
            m16309b(c99.m4410c(vj8Var.mo12420a(1.0f, b16Var, true), 1.0f), com.lingq.feature.reader.R$drawable.ic_stats_reading_speed, vz1.m23620a0(tj3Var, R$string.stats_reading_speed), null, ci8.m4703P(-1967898459, new zi3() { // from class: n65
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i12 = i11;
                    b16 b16Var2 = b16.f7762a;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    xfa xfaVar = xfa.f68157a;
                    s65 s65Var2 = s65Var;
                    switch (i12) {
                        case 0:
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var2.m22102U();
                            } else {
                                Integer num = s65Var2.f60412f;
                                if (num == null) {
                                    tj3Var2.m22111b0(-1588212262);
                                    ljd.m16311d(null, tj3Var2, 0);
                                    tj3Var2.m22139q(false);
                                } else {
                                    tj3Var2.m22111b0(-1588440484);
                                    lw9.m16554b(String.valueOf(num.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var2, 1572864, 0, 131006);
                                    tj3Var2.m22139q(false);
                                }
                            }
                            break;
                        case 1:
                            ye1 ye1Var3 = (ye1) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            tj3 tj3Var3 = (tj3) ye1Var3;
                            if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                tj3Var3.m22102U();
                            } else {
                                Integer num2 = s65Var2.f60413g;
                                if (num2 == null) {
                                    tj3Var3.m22111b0(-385178543);
                                    ljd.m16311d(null, tj3Var3, 0);
                                    tj3Var3.m22139q(false);
                                } else {
                                    tj3Var3.m22111b0(-385403882);
                                    lw9.m16554b(String.valueOf(num2.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var3, 1572864, 0, 131006);
                                    tj3Var3.m22139q(false);
                                }
                            }
                            break;
                        case 2:
                            ye1 ye1Var4 = (ye1) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            tj3 tj3Var4 = (tj3) ye1Var4;
                            if (!tj3Var4.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                tj3Var4.m22102U();
                            } else {
                                Double d = s65Var2.f60416j;
                                if (d == null) {
                                    tj3Var4.m22111b0(-139515343);
                                    ljd.m16311d(null, tj3Var4, 0);
                                    tj3Var4.m22139q(false);
                                } else {
                                    tj3Var4.m22111b0(-139928480);
                                    long jDoubleValue = ((long) d.doubleValue()) / 60;
                                    long jDoubleValue2 = ((long) d.doubleValue()) - timeUnit.toSeconds(jDoubleValue);
                                    ljd.m16312e(String.valueOf(jDoubleValue), "m", tj3Var4, 48);
                                    thb.m22044c(tj3Var4, c99.m4426s(b16Var2, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38955d));
                                    ljd.m16312e(String.valueOf(jDoubleValue2), "s", tj3Var4, 48);
                                    tj3Var4.m22139q(false);
                                }
                            }
                            break;
                        case 3:
                            ye1 ye1Var5 = (ye1) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            tj3 tj3Var5 = (tj3) ye1Var5;
                            if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                tj3Var5.m22102U();
                            } else {
                                Double d2 = s65Var2.f60417k;
                                if (d2 == null) {
                                    tj3Var5.m22111b0(640856904);
                                    ljd.m16311d(null, tj3Var5, 0);
                                    tj3Var5.m22139q(false);
                                } else {
                                    tj3Var5.m22111b0(640686900);
                                    ljd.m16312e(String.valueOf((int) d2.doubleValue()), "wpm", tj3Var5, 48);
                                    tj3Var5.m22139q(false);
                                }
                            }
                            break;
                        case 4:
                            ye1 ye1Var6 = (ye1) obj;
                            int iIntValue5 = ((Integer) obj2).intValue();
                            tj3 tj3Var6 = (tj3) ye1Var6;
                            if (!tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                tj3Var6.m22102U();
                            } else {
                                long j = (long) s65Var2.f60410d;
                                long j2 = j / 60;
                                long seconds = j - timeUnit.toSeconds(j2);
                                zf1 zf1Var2 = AbstractC0402n.f4824p;
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)), "m", tj3Var6, 48);
                                thb.m22044c(tj3Var6, c99.m4426s(b16Var2, ((fe9) tj3Var6.m22128k(ge9.f40637a)).f38955d));
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1)), "s", tj3Var6, 48);
                            }
                            break;
                        default:
                            ye1 ye1Var7 = (ye1) obj;
                            int iIntValue6 = ((Integer) obj2).intValue();
                            tj3 tj3Var7 = (tj3) ye1Var7;
                            if (!tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                tj3Var7.m22102U();
                            } else {
                                ljd.m16312e(String.valueOf((int) s65Var2.f60408b), "w", tj3Var7, 48);
                            }
                            break;
                    }
                    return xfaVar;
                }
            }, tj3Var), tj3Var, 24576, 8);
            tj3Var.m22139q(true);
            e16 e16VarM18285y3 = AbstractC3423or.m18285y(c99.m4412e(b16Var, 1.0f), intrinsicSize);
            sj8 sj8VarM20003a3 = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28)), fc0Var, tj3Var, 48);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM18285y3);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a3);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var9);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
            final int i12 = 0;
            final int i13 = 4;
            m16309b(vj8Var.mo12420a(1.0f, b16Var, true), com.lingq.feature.reader.R$drawable.ic_stats_listened, vz1.m23620a0(tj3Var, com.lingq.feature.reader.R$string.stats_time_listened), ci8.m4703P(-16081732, new zi3() { // from class: o65
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i14 = i12;
                    xfa xfaVar = xfa.f68157a;
                    p84 p84Var2 = we1.f66679a;
                    vi3 vi3Var12 = vi3Var10;
                    s65 s65Var2 = s65Var;
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i14) {
                        case 0:
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var2.m22102U();
                            } else {
                                String str = nob.m17572a(1, s65Var2.f60411e) + "x";
                                boolean zM22120g = tj3Var2.m22120g(vi3Var12);
                                Object objM22097O3 = tj3Var2.m22097O();
                                if (zM22120g || objM22097O3 == p84Var2) {
                                    objM22097O3 = new fl4(vi3Var12, 29);
                                    tj3Var2.m22131l0(objM22097O3);
                                }
                                ui3 ui3Var2 = (ui3) objM22097O3;
                                boolean zM22120g2 = tj3Var2.m22120g(vi3Var12);
                                Object objM22097O4 = tj3Var2.m22097O();
                                if (zM22120g2 || objM22097O4 == p84Var2) {
                                    objM22097O4 = new q65(vi3Var12, 0);
                                    tj3Var2.m22131l0(objM22097O4);
                                }
                                ljd.m16310c(str, ui3Var2, (ui3) objM22097O4, tj3Var2, 0);
                            }
                            break;
                        default:
                            tj3 tj3Var3 = (tj3) ye1Var2;
                            if (!tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var3.m22102U();
                            } else {
                                String str2 = nob.m17572a(1, s65Var2.f60409c) + "x";
                                boolean zM22120g3 = tj3Var3.m22120g(vi3Var12);
                                Object objM22097O5 = tj3Var3.m22097O();
                                if (zM22120g3 || objM22097O5 == p84Var2) {
                                    objM22097O5 = new q65(vi3Var12, 1);
                                    tj3Var3.m22131l0(objM22097O5);
                                }
                                ui3 ui3Var3 = (ui3) objM22097O5;
                                boolean zM22120g4 = tj3Var3.m22120g(vi3Var12);
                                Object objM22097O6 = tj3Var3.m22097O();
                                if (zM22120g4 || objM22097O6 == p84Var2) {
                                    objM22097O6 = new q65(vi3Var12, 2);
                                    tj3Var3.m22131l0(objM22097O6);
                                }
                                ljd.m16310c(str2, ui3Var3, (ui3) objM22097O6, tj3Var3, 0);
                            }
                            break;
                    }
                    return xfaVar;
                }
            }, tj3Var), ci8.m4703P(-186921189, new zi3() { // from class: n65
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i14 = i13;
                    b16 b16Var2 = b16.f7762a;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    xfa xfaVar = xfa.f68157a;
                    s65 s65Var2 = s65Var;
                    switch (i14) {
                        case 0:
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var2.m22102U();
                            } else {
                                Integer num = s65Var2.f60412f;
                                if (num == null) {
                                    tj3Var2.m22111b0(-1588212262);
                                    ljd.m16311d(null, tj3Var2, 0);
                                    tj3Var2.m22139q(false);
                                } else {
                                    tj3Var2.m22111b0(-1588440484);
                                    lw9.m16554b(String.valueOf(num.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var2, 1572864, 0, 131006);
                                    tj3Var2.m22139q(false);
                                }
                            }
                            break;
                        case 1:
                            ye1 ye1Var3 = (ye1) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            tj3 tj3Var3 = (tj3) ye1Var3;
                            if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                tj3Var3.m22102U();
                            } else {
                                Integer num2 = s65Var2.f60413g;
                                if (num2 == null) {
                                    tj3Var3.m22111b0(-385178543);
                                    ljd.m16311d(null, tj3Var3, 0);
                                    tj3Var3.m22139q(false);
                                } else {
                                    tj3Var3.m22111b0(-385403882);
                                    lw9.m16554b(String.valueOf(num2.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var3, 1572864, 0, 131006);
                                    tj3Var3.m22139q(false);
                                }
                            }
                            break;
                        case 2:
                            ye1 ye1Var4 = (ye1) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            tj3 tj3Var4 = (tj3) ye1Var4;
                            if (!tj3Var4.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                tj3Var4.m22102U();
                            } else {
                                Double d = s65Var2.f60416j;
                                if (d == null) {
                                    tj3Var4.m22111b0(-139515343);
                                    ljd.m16311d(null, tj3Var4, 0);
                                    tj3Var4.m22139q(false);
                                } else {
                                    tj3Var4.m22111b0(-139928480);
                                    long jDoubleValue = ((long) d.doubleValue()) / 60;
                                    long jDoubleValue2 = ((long) d.doubleValue()) - timeUnit.toSeconds(jDoubleValue);
                                    ljd.m16312e(String.valueOf(jDoubleValue), "m", tj3Var4, 48);
                                    thb.m22044c(tj3Var4, c99.m4426s(b16Var2, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38955d));
                                    ljd.m16312e(String.valueOf(jDoubleValue2), "s", tj3Var4, 48);
                                    tj3Var4.m22139q(false);
                                }
                            }
                            break;
                        case 3:
                            ye1 ye1Var5 = (ye1) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            tj3 tj3Var5 = (tj3) ye1Var5;
                            if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                tj3Var5.m22102U();
                            } else {
                                Double d2 = s65Var2.f60417k;
                                if (d2 == null) {
                                    tj3Var5.m22111b0(640856904);
                                    ljd.m16311d(null, tj3Var5, 0);
                                    tj3Var5.m22139q(false);
                                } else {
                                    tj3Var5.m22111b0(640686900);
                                    ljd.m16312e(String.valueOf((int) d2.doubleValue()), "wpm", tj3Var5, 48);
                                    tj3Var5.m22139q(false);
                                }
                            }
                            break;
                        case 4:
                            ye1 ye1Var6 = (ye1) obj;
                            int iIntValue5 = ((Integer) obj2).intValue();
                            tj3 tj3Var6 = (tj3) ye1Var6;
                            if (!tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                tj3Var6.m22102U();
                            } else {
                                long j = (long) s65Var2.f60410d;
                                long j2 = j / 60;
                                long seconds = j - timeUnit.toSeconds(j2);
                                zf1 zf1Var2 = AbstractC0402n.f4824p;
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)), "m", tj3Var6, 48);
                                thb.m22044c(tj3Var6, c99.m4426s(b16Var2, ((fe9) tj3Var6.m22128k(ge9.f40637a)).f38955d));
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1)), "s", tj3Var6, 48);
                            }
                            break;
                        default:
                            ye1 ye1Var7 = (ye1) obj;
                            int iIntValue6 = ((Integer) obj2).intValue();
                            tj3 tj3Var7 = (tj3) ye1Var7;
                            if (!tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                tj3Var7.m22102U();
                            } else {
                                ljd.m16312e(String.valueOf((int) s65Var2.f60408b), "w", tj3Var7, 48);
                            }
                            break;
                    }
                    return xfaVar;
                }
            }, tj3Var), tj3Var, 27648, 0);
            final int i14 = 1;
            final int i15 = 5;
            m16309b(vj8Var.mo12420a(1.0f, b16Var, true), com.lingq.feature.reader.R$drawable.ic_stats_read, vz1.m23620a0(tj3Var, R$string.language_stats_words_read), ci8.m4703P(-1674004315, new zi3() { // from class: o65
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = i14;
                    xfa xfaVar = xfa.f68157a;
                    p84 p84Var2 = we1.f66679a;
                    vi3 vi3Var12 = vi3Var11;
                    s65 s65Var2 = s65Var;
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i16) {
                        case 0:
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var2.m22102U();
                            } else {
                                String str = nob.m17572a(1, s65Var2.f60411e) + "x";
                                boolean zM22120g = tj3Var2.m22120g(vi3Var12);
                                Object objM22097O3 = tj3Var2.m22097O();
                                if (zM22120g || objM22097O3 == p84Var2) {
                                    objM22097O3 = new fl4(vi3Var12, 29);
                                    tj3Var2.m22131l0(objM22097O3);
                                }
                                ui3 ui3Var2 = (ui3) objM22097O3;
                                boolean zM22120g2 = tj3Var2.m22120g(vi3Var12);
                                Object objM22097O4 = tj3Var2.m22097O();
                                if (zM22120g2 || objM22097O4 == p84Var2) {
                                    objM22097O4 = new q65(vi3Var12, 0);
                                    tj3Var2.m22131l0(objM22097O4);
                                }
                                ljd.m16310c(str, ui3Var2, (ui3) objM22097O4, tj3Var2, 0);
                            }
                            break;
                        default:
                            tj3 tj3Var3 = (tj3) ye1Var2;
                            if (!tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var3.m22102U();
                            } else {
                                String str2 = nob.m17572a(1, s65Var2.f60409c) + "x";
                                boolean zM22120g3 = tj3Var3.m22120g(vi3Var12);
                                Object objM22097O5 = tj3Var3.m22097O();
                                if (zM22120g3 || objM22097O5 == p84Var2) {
                                    objM22097O5 = new q65(vi3Var12, 1);
                                    tj3Var3.m22131l0(objM22097O5);
                                }
                                ui3 ui3Var3 = (ui3) objM22097O5;
                                boolean zM22120g4 = tj3Var3.m22120g(vi3Var12);
                                Object objM22097O6 = tj3Var3.m22097O();
                                if (zM22120g4 || objM22097O6 == p84Var2) {
                                    objM22097O6 = new q65(vi3Var12, 2);
                                    tj3Var3.m22131l0(objM22097O6);
                                }
                                ljd.m16310c(str2, ui3Var3, (ui3) objM22097O6, tj3Var3, 0);
                            }
                            break;
                    }
                    return xfaVar;
                }
            }, tj3Var), ci8.m4703P(1653002052, new zi3() { // from class: n65
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = i15;
                    b16 b16Var2 = b16.f7762a;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    xfa xfaVar = xfa.f68157a;
                    s65 s65Var2 = s65Var;
                    switch (i16) {
                        case 0:
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                tj3Var2.m22102U();
                            } else {
                                Integer num = s65Var2.f60412f;
                                if (num == null) {
                                    tj3Var2.m22111b0(-1588212262);
                                    ljd.m16311d(null, tj3Var2, 0);
                                    tj3Var2.m22139q(false);
                                } else {
                                    tj3Var2.m22111b0(-1588440484);
                                    lw9.m16554b(String.valueOf(num.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var2, 1572864, 0, 131006);
                                    tj3Var2.m22139q(false);
                                }
                            }
                            break;
                        case 1:
                            ye1 ye1Var3 = (ye1) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            tj3 tj3Var3 = (tj3) ye1Var3;
                            if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                tj3Var3.m22102U();
                            } else {
                                Integer num2 = s65Var2.f60413g;
                                if (num2 == null) {
                                    tj3Var3.m22111b0(-385178543);
                                    ljd.m16311d(null, tj3Var3, 0);
                                    tj3Var3.m22139q(false);
                                } else {
                                    tj3Var3.m22111b0(-385403882);
                                    lw9.m16554b(String.valueOf(num2.intValue()), null, 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var3, 1572864, 0, 131006);
                                    tj3Var3.m22139q(false);
                                }
                            }
                            break;
                        case 2:
                            ye1 ye1Var4 = (ye1) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            tj3 tj3Var4 = (tj3) ye1Var4;
                            if (!tj3Var4.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                tj3Var4.m22102U();
                            } else {
                                Double d = s65Var2.f60416j;
                                if (d == null) {
                                    tj3Var4.m22111b0(-139515343);
                                    ljd.m16311d(null, tj3Var4, 0);
                                    tj3Var4.m22139q(false);
                                } else {
                                    tj3Var4.m22111b0(-139928480);
                                    long jDoubleValue = ((long) d.doubleValue()) / 60;
                                    long jDoubleValue2 = ((long) d.doubleValue()) - timeUnit.toSeconds(jDoubleValue);
                                    ljd.m16312e(String.valueOf(jDoubleValue), "m", tj3Var4, 48);
                                    thb.m22044c(tj3Var4, c99.m4426s(b16Var2, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38955d));
                                    ljd.m16312e(String.valueOf(jDoubleValue2), "s", tj3Var4, 48);
                                    tj3Var4.m22139q(false);
                                }
                            }
                            break;
                        case 3:
                            ye1 ye1Var5 = (ye1) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            tj3 tj3Var5 = (tj3) ye1Var5;
                            if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                tj3Var5.m22102U();
                            } else {
                                Double d2 = s65Var2.f60417k;
                                if (d2 == null) {
                                    tj3Var5.m22111b0(640856904);
                                    ljd.m16311d(null, tj3Var5, 0);
                                    tj3Var5.m22139q(false);
                                } else {
                                    tj3Var5.m22111b0(640686900);
                                    ljd.m16312e(String.valueOf((int) d2.doubleValue()), "wpm", tj3Var5, 48);
                                    tj3Var5.m22139q(false);
                                }
                            }
                            break;
                        case 4:
                            ye1 ye1Var6 = (ye1) obj;
                            int iIntValue5 = ((Integer) obj2).intValue();
                            tj3 tj3Var6 = (tj3) ye1Var6;
                            if (!tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                tj3Var6.m22102U();
                            } else {
                                long j = (long) s65Var2.f60410d;
                                long j2 = j / 60;
                                long seconds = j - timeUnit.toSeconds(j2);
                                zf1 zf1Var2 = AbstractC0402n.f4824p;
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)), "m", tj3Var6, 48);
                                thb.m22044c(tj3Var6, c99.m4426s(b16Var2, ((fe9) tj3Var6.m22128k(ge9.f40637a)).f38955d));
                                ljd.m16312e(String.format(((ti5) tj3Var6.m22128k(zf1Var2)).f62341a, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1)), "s", tj3Var6, 48);
                            }
                            break;
                        default:
                            ye1 ye1Var7 = (ye1) obj;
                            int iIntValue6 = ((Integer) obj2).intValue();
                            tj3 tj3Var7 = (tj3) ye1Var7;
                            if (!tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                tj3Var7.m22102U();
                            } else {
                                ljd.m16312e(String.valueOf((int) s65Var2.f60408b), "w", tj3Var7, 48);
                            }
                            break;
                    }
                    return xfaVar;
                }
            }, tj3Var), tj3Var, 27648, 0);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            vi3Var5 = vi3Var10;
            vi3Var6 = vi3Var11;
        } else {
            tj3Var.m22102U();
            vi3Var5 = vi3Var3;
            vi3Var6 = vi3Var4;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(s65Var, vi3Var5, vi3Var6, i, i2, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m16309b(final e16 e16Var, final int i, final String str, zi3 zi3Var, C0282a c0282a, ye1 ye1Var, final int i2, final int i3) {
        zi3 zi3Var2;
        boolean z;
        C0282a c0282a2;
        tj3 tj3Var;
        final zi3 zi3Var3;
        x18 x18VarM22143u;
        str.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1076026770);
        int i4 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i2 | (tj3Var2.m22116e(i) ? 32 : 16) | (tj3Var2.m22120g(str) ? 256 : 128);
        int i5 = i3 & 8;
        if (i5 == 0) {
            if ((i2 & 3072) == 0) {
                zi3Var2 = zi3Var;
                i4 |= tj3Var2.m22124i(zi3Var2) ? 2048 : 1024;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var2.m22099R(i4 & 1, z)) {
                if (i5 != 0) {
                    zi3Var3 = null;
                } else {
                    zi3Var3 = zi3Var2;
                }
                c0282a2 = c0282a;
                r46.m20381f(e16Var, null, null, te1.m21999m(0, 14, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var2), ci8.m4703P(534429784, new m65(zi3Var3, str, i, c0282a2), tj3Var2), tj3Var2, (i4 & 14) | 24576, 6);
                tj3Var = tj3Var2;
            } else {
                c0282a2 = c0282a;
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                zi3Var3 = zi3Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                final C0282a c0282a3 = c0282a2;
                x18VarM22143u.f67642d = new zi3() { // from class: p65
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ljd.m16309b(e16Var, i, str, zi3Var3, c0282a3, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 3072;
        zi3Var2 = zi3Var;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var2.m22099R(i4 & 1, z)) {
            if (i5 != 0) {
                zi3Var3 = null;
            } else {
                zi3Var3 = zi3Var2;
            }
            c0282a2 = c0282a;
            r46.m20381f(e16Var, null, null, te1.m21999m(0, 14, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var2), ci8.m4703P(534429784, new m65(zi3Var3, str, i, c0282a2), tj3Var2), tj3Var2, (i4 & 14) | 24576, 6);
            tj3Var = tj3Var2;
        } else {
            c0282a2 = c0282a;
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            zi3Var3 = zi3Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final C0282a c0282a4 = c0282a2;
            x18VarM22143u.f67642d = new zi3() { // from class: p65
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ljd.m16309b(e16Var, i, str, zi3Var3, c0282a4, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m16310c(String str, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-25908037);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22124i(ui3Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var2) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            ge9.m12515a(tj3Var).getClass();
            e16 e16VarM4422o = c99.m4422o(b16Var, 32.0f);
            int i3 = my3.f52030a;
            omd.m18141c(ui3Var, e16VarM4422o, false, my3.m17149b(p58.m18900f(tj3Var).f55874r, p58.m18900f(tj3Var).f55875s, tj3Var, 12), null, oxb.f55157a, tj3Var, ((i2 >> 3) & 14) | 1572864, 52);
            lw9.m16554b(str, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, i2 & 14, 0, 131066);
            omd.m18141c(ui3Var2, wq1.m24108d(tj3Var, b16Var, 32.0f), false, my3.m17149b(p58.m18900f(tj3Var).f55874r, p58.m18900f(tj3Var).f55875s, tj3Var, 12), null, oxb.f55158b, tj3Var, ((i2 >> 6) & 14) | 1572864, 52);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3478pz(str, ui3Var, ui3Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m16311d(e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(617101672);
        int i2 = i | 6;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            float f = ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a;
            b16 b16Var = b16.f7762a;
            qh0.m19963a(x74.m24341H(c99.m4414g(c99.m4426s(pb1.m19045o(AbstractC3584sr.m21611X(b16Var, f, 0.0f, 0.0f, 0.0f, 14), ui8.f63972a), 48.0f), 12.0f)), tj3Var, 0);
            e16Var = b16Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, 11, e16Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m16312e(String str, String str2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        str.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1990640876);
        int i2 = (tj3Var2.m22120g(str) ? 4 : 2) | i;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var2.m22111b0(-1745432428);
            C3341mn c3341mn = new C3341mn();
            c3341mn.m16929d(str);
            bc3 bc3Var = bc3.f8321g;
            vh9 vh9Var = ps5.f56764b;
            int iM16932g = c3341mn.m16932g(new he9(0L, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71406j.f66065a.f42265b, bc3Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65529));
            try {
                c3341mn.m16929d(str2);
                c3341mn.m16931f(iM16932g);
                C3419on c3419onM16933h = c3341mn.m16933h();
                tj3Var2.m22139q(false);
                tj3Var = tj3Var2;
                lw9.m16555c(c3419onM16933h, null, 0L, null, 0L, null, bc3.f8322h, 0L, null, 0L, 0, false, 0, 0, null, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71402f, tj3Var, 1572864, 0, 262078);
            } catch (Throwable th) {
                c3341mn.m16931f(iM16932g);
                throw th;
            }
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new r65(str, i, 0, str2);
        }
    }
}
