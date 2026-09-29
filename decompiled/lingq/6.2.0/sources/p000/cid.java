package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.gestures.C0100h;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.language.LanguageStatValue;
import com.lingq.core.domain.model.language.LanguageStats;
import com.lingq.core.domain.stats.ActivityScore;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.p012ui.sheet.LanguageProgressInputType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cid {
    /* JADX INFO: renamed from: a */
    public static final void m4750a(final LanguageProgressMetric languageProgressMetric, final String str, final double d, final double d2, final ActivityScore activityScore, final zi3 zi3Var, ye1 ye1Var, final int i) {
        languageProgressMetric.getClass();
        str.getClass();
        activityScore.getClass();
        zi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1037973381);
        int i2 = i | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22112c(d) ? 256 : 128) | (tj3Var.m22112c(d2) ? 2048 : 1024) | (tj3Var.m22116e(activityScore.ordinal()) ? 16384 : 8192) | (tj3Var.m22124i(zi3Var) ? 131072 : 65536);
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            r46.m20381f(null, null, null, null, ci8.m4703P(-391657381, new aj3() { // from class: ep4
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long jM4213f;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4429v(b16Var), 0.0f, ge9.m12515a(tj3Var2).f38955d, 1);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        zi3 zi3Var2 = C0352b.f4303f;
                        oha.m18001g(tj3Var2, zi3Var2, bb1VarM230a);
                        zi3 zi3Var3 = C0352b.f4302e;
                        oha.m18001g(tj3Var2, zi3Var3, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var4 = C0352b.f4304g;
                        oha.m18001g(tj3Var2, zi3Var4, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var2, vi3Var);
                        zi3 zi3Var5 = C0352b.f4301d;
                        oha.m18001g(tj3Var2, zi3Var5, e16VarM1322c);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var2, 54);
                        int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m2 = tj3Var2.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var2, sj8VarM20003a);
                        oha.m18001g(tj3Var2, zi3Var3, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var4, tj3Var2, vi3Var);
                        oha.m18001g(tj3Var2, zi3Var5, e16VarM1322c2);
                        e16 e16VarM21609V2 = AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var2).f38957f, 0.0f, 2);
                        LanguageProgressMetric languageProgressMetric2 = languageProgressMetric;
                        boolean zM21391a = shd.m21391a(languageProgressMetric2);
                        double d3 = d;
                        lw9.m16554b(zM21391a ? String.valueOf((int) d3) : String.valueOf(nob.m17572a(2, d3)), e16VarM21609V2, p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71402f, tj3Var2, 0, 0, 131064);
                        zi3 zi3Var6 = zi3Var;
                        boolean zM22120g = tj3Var2.m22120g(zi3Var6) | tj3Var2.m22116e(languageProgressMetric2.ordinal());
                        Object objM22097O = tj3Var2.m22097O();
                        p84 p84Var = we1.f66679a;
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new C3577sk(26, zi3Var6, languageProgressMetric2);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        float f = ge9.m12515a(tj3Var2).f38952a;
                        x17 x17Var = new x17(f, f, f, f);
                        ActivityScore activityScore2 = activityScore;
                        AbstractC0231g.m1153f(805306368, 382, null, tj3Var2, (ui3) objM22097O, ci8.m4703P(1299845938, new se0(activityScore2, 14), tj3Var2), null, x17Var, null, false);
                        tj3Var2.m22139q(true);
                        lw9.m16554b(str, AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var2).f38957f, 0.0f, 2), p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, 0, 0, 131064);
                        e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4415h(ux5.m22984g(b16Var, ge9.m12515a(tj3Var2).f38952a, tj3Var2, b16Var, 1.0f), 32.0f, 64.0f), ge9.m12515a(tj3Var2).f38957f, ge9.m12515a(tj3Var2).f38956e);
                        float f2 = ge9.m12515a(tj3Var2).f38955d;
                        int i3 = hp4.f42734a[activityScore2.ordinal()];
                        if (i3 == 1) {
                            tj3Var2.m22111b0(-1493124137);
                            jM4213f = cx2.m9917a(tj3Var2).m4213f();
                            tj3Var2.m22139q(false);
                        } else if (i3 == 2) {
                            tj3Var2.m22111b0(-1493121545);
                            jM4213f = cx2.m9917a(tj3Var2).m4218k();
                            tj3Var2.m22139q(false);
                        } else if (i3 == 3) {
                            tj3Var2.m22111b0(-1493118825);
                            jM4213f = cx2.m9917a(tj3Var2).m4218k();
                            tj3Var2.m22139q(false);
                        } else {
                            if (i3 != 4) {
                                throw ux5.m23001x(tj3Var2, -1493126846, false);
                            }
                            tj3Var2.m22111b0(-1493116138);
                            jM4213f = cx2.m9917a(tj3Var2).m4212e();
                            tj3Var2.m22139q(false);
                        }
                        boolean zM22112c = tj3Var2.m22112c(d3);
                        double d4 = d2;
                        boolean zM22112c2 = tj3Var2.m22112c(d4) | zM22112c;
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22112c2 || objM22097O2 == p84Var) {
                            C2918d8 c2918d8 = new C2918d8(d3, d4, 1);
                            tj3Var2.m22131l0(c2918d8);
                            objM22097O2 = c2918d8;
                        }
                        dn7.m10494c((ui3) objM22097O2, e16VarM21608U, jM4213f, 0L, 0, f2, null, tj3Var2, 0, 88);
                        tj3Var2.m22139q(true);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 24576, 15);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(str, d, d2, activityScore, zi3Var, i) { // from class: fp4

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f39415b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ double f39416c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ double f39417d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ActivityScore f39418e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ zi3 f39419f;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(7);
                    cid.m4750a(this.f39414a, this.f39415b, this.f39416c, this.f39417d, this.f39418e, this.f39419f, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4751b(e16 e16Var, z41 z41Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        z41Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2137250249);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | (tj3Var.m22120g(z41Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            e16Var2 = e16Var;
            r46.m20381f(e16Var2, null, null, null, ci8.m4703P(-1076079713, new se0(z41Var, 15), tj3Var), tj3Var, (i2 & 14) | 24576, 14);
        } else {
            e16Var2 = e16Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(e16Var2, i, 20, z41Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4752c(g80 g80Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1907006564);
        int i2 = (tj3Var.m22120g(g80Var) ? 4 : 2) | i;
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            r46.m20381f(null, null, null, null, ci8.m4703P(1798181106, new on4(g80Var, i3), tj3Var), tj3Var, 24576, 15);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wz2(g80Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m4753d(final String str, final qj9 qj9Var, final d4b d4bVar, final z41 z41Var, final uj9 uj9Var, final InterfaceC3066h8 interfaceC3066h8, final a85 a85Var, final dt0 dt0Var, final g80 g80Var, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, ui3 ui3Var4, zi3 zi3Var, vi3 vi3Var, zi3 zi3Var2, zi3 zi3Var3, vi3 vi3Var2, ws1 ws1Var, ui3 ui3Var5, zi3 zi3Var4, ui3 ui3Var6, final ui3 ui3Var7, ye1 ye1Var, final int i, final int i2, final int i3) {
        int i4;
        ui3 ui3Var8;
        int i5;
        char c;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final ui3 ui3Var9;
        final ui3 ui3Var10;
        final ui3 ui3Var11;
        final vi3 vi3Var3;
        final zi3 zi3Var5;
        final vi3 vi3Var4;
        final ws1 ws1Var2;
        final ui3 ui3Var12;
        final zi3 zi3Var6;
        final ui3 ui3Var13;
        final ui3 ui3Var14;
        tj3 tj3Var;
        final zi3 zi3Var7;
        final zi3 zi3Var8;
        ui3 ui3Var15;
        ui3 ui3Var16;
        final ui3 ui3Var17;
        int i17;
        final ui3 ui3Var18;
        int i18;
        final zi3 zi3Var9;
        int i19;
        final vi3 vi3Var5;
        int i20;
        final zi3 zi3Var10;
        int i21;
        final zi3 zi3Var11;
        int i22;
        final vi3 vi3Var6;
        final ui3 ui3Var19;
        int i23;
        final zi3 zi3Var12;
        final ui3 ui3Var20;
        qj9Var.getClass();
        d4bVar.getClass();
        z41Var.getClass();
        uj9Var.getClass();
        interfaceC3066h8.getClass();
        a85Var.getClass();
        dt0Var.getClass();
        g80Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1475475372);
        if ((i & 6) == 0) {
            i4 = (tj3Var2.m22120g(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i24 = i4 | (tj3Var2.m22124i(qj9Var) ? 32 : 16) | (tj3Var2.m22124i(d4bVar) ? 256 : 128);
        if ((i & 3072) == 0) {
            i24 |= tj3Var2.m22120g(z41Var) ? 2048 : 1024;
        }
        int i25 = i24 | (tj3Var2.m22124i(uj9Var) ? 16384 : 8192) | (tj3Var2.m22124i(interfaceC3066h8) ? 131072 : 65536) | (tj3Var2.m22124i(a85Var) ? 1048576 : 524288);
        if ((i & 12582912) == 0) {
            i25 |= tj3Var2.m22120g(dt0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i25 |= tj3Var2.m22120g(g80Var) ? 67108864 : 33554432;
        }
        int i26 = i3 & 512;
        if (i26 != 0) {
            i5 = i25 | 805306368;
            ui3Var8 = ui3Var;
        } else {
            ui3Var8 = ui3Var;
            i5 = i25 | (tj3Var2.m22124i(ui3Var8) ? 536870912 : 268435456);
        }
        int i27 = i3 & 1024;
        if (i27 != 0) {
            c = 6;
        } else {
            c = tj3Var2.m22124i(ui3Var2) ? (char) 4 : (char) 2;
        }
        int i28 = i3 & 2048;
        if (i28 != 0) {
            i6 = c | '0';
        } else {
            i6 = c | (tj3Var2.m22124i(ui3Var3) ? ' ' : (char) 16);
        }
        int i29 = i6;
        int i30 = i5;
        int i31 = i3 & 4096;
        if (i31 != 0) {
            i7 = i29 | 384;
        } else {
            i7 = i29 | (tj3Var2.m22124i(ui3Var4) ? 256 : 128);
        }
        int i32 = i3 & 8192;
        if (i32 != 0) {
            i8 = i7 | 3072;
        } else {
            i8 = i7 | (tj3Var2.m22124i(zi3Var) ? 2048 : 1024);
        }
        int i33 = i3 & 16384;
        if (i33 != 0) {
            i9 = i8 | 24576;
        } else {
            i9 = i8 | (tj3Var2.m22124i(vi3Var) ? (char) 16384 : (char) 8192);
        }
        int i34 = i3 & 32768;
        if (i34 != 0) {
            i10 = i9 | 196608;
        } else {
            i10 = i9 | (tj3Var2.m22124i(zi3Var2) ? 131072 : 65536);
        }
        int i35 = i3 & 65536;
        if (i35 != 0) {
            i11 = i10 | 1572864;
        } else {
            i11 = i10 | (tj3Var2.m22124i(zi3Var3) ? 1048576 : 524288);
        }
        int i36 = i3 & 131072;
        if (i36 != 0) {
            i12 = i11 | 12582912;
        } else {
            i12 = i11 | (tj3Var2.m22124i(vi3Var2) ? (char) 0 : (char) 0);
        }
        int i37 = i3 & 262144;
        if (i37 != 0) {
            i13 = i12 | 100663296;
        } else {
            i13 = i12 | (tj3Var2.m22124i(ws1Var) ? (char) 0 : (char) 0);
        }
        int i38 = i3 & 524288;
        if (i38 != 0) {
            i14 = i13 | 805306368;
        } else {
            i14 = i13 | (tj3Var2.m22124i(ui3Var5) ? (char) 0 : (char) 0);
        }
        int i39 = i3 & 1048576;
        if (i39 != 0) {
            i15 = i2 | 6;
        } else {
            i15 = i2 | (tj3Var2.m22124i(zi3Var4) ? 4 : 2);
        }
        int i40 = i3 & 2097152;
        if (i40 != 0) {
            i16 = i15 | 48;
        } else {
            i16 = i15 | (tj3Var2.m22124i(ui3Var6) ? 32 : 16);
        }
        if ((i2 & 384) == 0) {
            i16 |= tj3Var2.m22124i(ui3Var7) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i30 & 1, ((i30 & 306783379) == 306783378 && (i14 & 306783379) == 306783378 && (i16 & 147) == 146) ? false : true)) {
            p84 p84Var = we1.f66679a;
            if (i26 != 0) {
                Object objM22097O = tj3Var2.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O);
                }
                ui3Var15 = (ui3) objM22097O;
            } else {
                ui3Var15 = ui3Var8;
            }
            if (i27 != 0) {
                Object objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O2);
                }
                ui3Var16 = (ui3) objM22097O2;
            } else {
                ui3Var16 = ui3Var2;
            }
            if (i28 != 0) {
                Object objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O3);
                }
                ui3Var17 = (ui3) objM22097O3;
            } else {
                ui3Var17 = ui3Var3;
            }
            if (i31 != 0) {
                Object objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O4);
                }
                ui3Var18 = (ui3) objM22097O4;
                i17 = i34;
            } else {
                i17 = i34;
                ui3Var18 = ui3Var4;
            }
            if (i32 != 0) {
                Object objM22097O5 = tj3Var2.m22097O();
                if (objM22097O5 == p84Var) {
                    objM22097O5 = new je1(25);
                    tj3Var2.m22131l0(objM22097O5);
                }
                zi3Var9 = (zi3) objM22097O5;
                i18 = i35;
            } else {
                i18 = i35;
                zi3Var9 = zi3Var;
            }
            if (i33 != 0) {
                Object objM22097O6 = tj3Var2.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new qy3(22);
                    tj3Var2.m22131l0(objM22097O6);
                }
                vi3Var5 = (vi3) objM22097O6;
                i19 = i36;
            } else {
                i19 = i36;
                vi3Var5 = vi3Var;
            }
            if (i17 != 0) {
                Object objM22097O7 = tj3Var2.m22097O();
                if (objM22097O7 == p84Var) {
                    objM22097O7 = new je1(26);
                    tj3Var2.m22131l0(objM22097O7);
                }
                zi3Var10 = (zi3) objM22097O7;
                i20 = i37;
            } else {
                i20 = i37;
                zi3Var10 = zi3Var2;
            }
            if (i18 != 0) {
                Object objM22097O8 = tj3Var2.m22097O();
                if (objM22097O8 == p84Var) {
                    objM22097O8 = new je1(27);
                    tj3Var2.m22131l0(objM22097O8);
                }
                zi3Var11 = (zi3) objM22097O8;
                i21 = i38;
            } else {
                i21 = i38;
                zi3Var11 = zi3Var3;
            }
            if (i19 != 0) {
                Object objM22097O9 = tj3Var2.m22097O();
                if (objM22097O9 == p84Var) {
                    objM22097O9 = new qy3(23);
                    tj3Var2.m22131l0(objM22097O9);
                }
                vi3Var6 = (vi3) objM22097O9;
                i22 = i39;
            } else {
                i22 = i39;
                vi3Var6 = vi3Var2;
            }
            final ws1 ws1Var3 = i20 != 0 ? null : ws1Var;
            if (i21 != 0) {
                Object objM22097O10 = tj3Var2.m22097O();
                if (objM22097O10 == p84Var) {
                    objM22097O10 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O10);
                }
                ui3Var19 = (ui3) objM22097O10;
            } else {
                ui3Var19 = ui3Var5;
            }
            if (i22 != 0) {
                Object objM22097O11 = tj3Var2.m22097O();
                if (objM22097O11 == p84Var) {
                    objM22097O11 = new je1(24);
                    tj3Var2.m22131l0(objM22097O11);
                }
                zi3Var12 = (zi3) objM22097O11;
                i23 = i40;
            } else {
                i23 = i40;
                zi3Var12 = zi3Var4;
            }
            if (i23 != 0) {
                Object objM22097O12 = tj3Var2.m22097O();
                if (objM22097O12 == p84Var) {
                    objM22097O12 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O12);
                }
                ui3Var20 = (ui3) objM22097O12;
            } else {
                ui3Var20 = ui3Var6;
            }
            x17 x17Var = h7a.f41916a;
            rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var2), tj3Var2);
            e16 e16VarM1450a = AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null);
            C0282a c0282aM4703P = ci8.m4703P(-1595816848, new C2919d9(rv2VarM13115b, str, ui3Var15, ui3Var16), tj3Var2);
            aj3 aj3Var = new aj3() { // from class: yo4
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    t17 t17Var = (t17) obj;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t17Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                    }
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        rn4 rn4Var = new rn4(qj9Var, z41Var, d4bVar, uj9Var, interfaceC3066h8, a85Var, dt0Var, g80Var, ws1Var3);
                        Object objM22097O13 = tj3Var3.m22097O();
                        if (objM22097O13 == we1.f66679a) {
                            objM22097O13 = new qy3(24);
                            tj3Var3.m22131l0(objM22097O13);
                        }
                        cid.m4754e(t17Var, rn4Var, new qn4(ui3Var17, ui3Var18, zi3Var9, vi3Var5, zi3Var10, zi3Var11, vi3Var6, ui3Var19, zi3Var12, ui3Var20, (vi3) objM22097O13, ui3Var7), null, tj3Var3, iIntValue & 14);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            };
            zi3 zi3Var13 = zi3Var12;
            ui3 ui3Var21 = ui3Var20;
            ws1 ws1Var4 = ws1Var3;
            ui3 ui3Var22 = ui3Var19;
            b34.m3232b(e16VarM1450a, c0282aM4703P, null, null, null, 0, 0L, 0L, null, ci8.m4703P(-445362885, aj3Var, tj3Var2), tj3Var2, 805306416, 508);
            ui3Var9 = ui3Var16;
            ui3Var14 = ui3Var15;
            tj3Var = tj3Var2;
            ui3Var10 = ui3Var17;
            ui3Var11 = ui3Var18;
            zi3Var7 = zi3Var9;
            vi3Var3 = vi3Var5;
            zi3Var8 = zi3Var10;
            zi3Var5 = zi3Var11;
            vi3Var4 = vi3Var6;
            ws1Var2 = ws1Var4;
            ui3Var12 = ui3Var22;
            zi3Var6 = zi3Var13;
            ui3Var13 = ui3Var21;
        } else {
            tj3Var2.m22102U();
            ui3Var9 = ui3Var2;
            ui3Var10 = ui3Var3;
            ui3Var11 = ui3Var4;
            vi3Var3 = vi3Var;
            zi3Var5 = zi3Var3;
            vi3Var4 = vi3Var2;
            ws1Var2 = ws1Var;
            ui3Var12 = ui3Var5;
            zi3Var6 = zi3Var4;
            ui3Var13 = ui3Var6;
            ui3Var14 = ui3Var8;
            tj3Var = tj3Var2;
            zi3Var7 = zi3Var;
            zi3Var8 = zi3Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: zo4
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    cid.m4753d(str, qj9Var, d4bVar, z41Var, uj9Var, interfaceC3066h8, a85Var, dt0Var, g80Var, ui3Var14, ui3Var9, ui3Var10, ui3Var11, zi3Var7, vi3Var3, zi3Var8, zi3Var5, vi3Var4, ws1Var2, ui3Var12, zi3Var6, ui3Var13, ui3Var7, (ye1) obj, iM19383z, iM19383z2, i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m4754e(t17 t17Var, rn4 rn4Var, qn4 qn4Var, n4b n4bVar, ye1 ye1Var, int i) {
        t17 t17Var2;
        int i2;
        tj3 tj3Var;
        n4b n4bVarM21912b;
        int i3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(764111914);
        if ((i & 6) == 0) {
            t17Var2 = t17Var;
            i2 = (tj3Var2.m22120g(t17Var2) ? 4 : 2) | i;
        } else {
            t17Var2 = t17Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(rn4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(qn4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                i3 = i2 & (-7169);
                n4bVarM21912b = t9a.m21912b(tj3Var2);
            } else {
                tj3Var2.m22102U();
                i3 = i2 & (-7169);
                n4bVarM21912b = n4bVar;
            }
            tj3Var2.m22140r();
            C0144d c0144dM19027O = pb1.m19027O(tj3Var2);
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21610W = AbstractC3584sr.m21610W(e16VarM4411d, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, t17Var2.mo14021d(), ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, t17Var2.mo14018a());
            kg9 kg9Var = new kg9(400.0f);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38962k, true, new gm5(28));
            f32 f32VarM21341a = sf9.m21341a(tj3Var2);
            boolean zM22120g = tj3Var2.m22120g(f32VarM21341a);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new C0100h(f32VarM21341a);
                tj3Var2.m22131l0(objM22097O);
            }
            C0100h c0100h = (C0100h) objM22097O;
            boolean zM22120g2 = tj3Var2.m22120g(n4bVarM21912b) | tj3Var2.m22124i(rn4Var) | ((i3 & 896) == 256);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var) {
                objM22097O2 = new C3485q5(rn4Var, qn4Var, n4bVarM21912b, 22);
                tj3Var2.m22131l0(objM22097O2);
            }
            tj3Var = tj3Var2;
            xwc.m24758c(kg9Var, e16VarM21610W, c0144dM19027O, null, 0.0f, c3661uu, c0100h, false, null, (vi3) objM22097O2, tj3Var, 0, 824);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            n4bVarM21912b = n4bVar;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(t17Var2, rn4Var, qn4Var, n4bVarM21912b, i, 11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m4755f(final InterfaceC3066h8 interfaceC3066h8, final int i, final zi3 zi3Var, final vi3 vi3Var, final zi3 zi3Var2, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-97795972);
        int i3 = i2 | (tj3Var.m22124i(interfaceC3066h8) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22124i(zi3Var) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024) | (tj3Var.m22124i(zi3Var2) ? 16384 : 8192);
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            final int i4 = interfaceC3066h8.mo11591a() == LanguageProgressPeriod.Today ? 0 : 1;
            r46.m20381f(null, null, null, null, ci8.m4703P(1240191206, new aj3() { // from class: gp4
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tj3 tj3Var2;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    final int i5 = 1;
                    final int i6 = 0;
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4429v(c99.m4412e(b16Var, 1.0f)), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38956e, 7);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21611X);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        int i7 = i4;
                        a6d.m146d(i7, e16VarM4412e, 0L, 0L, null, null, ci8.m4703P(1181809032, new n14(i7, vi3Var, i5), tj3Var3), tj3Var3, 1572912);
                        InterfaceC3066h8 interfaceC3066h9 = interfaceC3066h8;
                        if (interfaceC3066h9 instanceof C3029g8) {
                            tj3Var3.m22111b0(-471920045);
                            LanguageStats languageStats = ((C3029g8) interfaceC3066h9).f40370b;
                            final LanguageProgressPeriod languageProgressPeriod = i7 == 0 ? LanguageProgressPeriod.Today : LanguageProgressPeriod.AllTime;
                            LanguageProgressMetric languageProgressMetric = LanguageProgressMetric.CoinsEarned;
                            String strM23620a0 = vz1.m23620a0(tj3Var3, R$string.stats_coins_earned);
                            LanguageStatValue languageStatValue = languageStats.f19094p;
                            final zi3 zi3Var3 = zi3Var;
                            boolean zM22120g = tj3Var3.m22120g(zi3Var3) | tj3Var3.m22116e(languageProgressPeriod.ordinal());
                            Object objM22097O = tj3Var3.m22097O();
                            p84 p84Var = we1.f66679a;
                            if (zM22120g || objM22097O == p84Var) {
                                objM22097O = new ui3() { // from class: xo4
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i8 = i6;
                                        xfa xfaVar = xfa.f68157a;
                                        LanguageProgressPeriod languageProgressPeriod2 = languageProgressPeriod;
                                        zi3 zi3Var4 = zi3Var3;
                                        switch (i8) {
                                            case 0:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.CoinsEarned);
                                                break;
                                            case 1:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.WordsOfReading);
                                                break;
                                            case 2:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.ListeningHours);
                                                break;
                                            case 3:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.LingQsCreated);
                                                break;
                                            case 4:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.LearnedLingQs);
                                                break;
                                            default:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.KnownWords);
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O);
                            }
                            cid.m4756g(languageProgressMetric, strM23620a0, languageProgressPeriod, languageStatValue, false, true, i, AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), null, tj3Var3, 221190, 256);
                            LanguageProgressMetric languageProgressMetric2 = LanguageProgressMetric.WordsOfReading;
                            String strM23620a1 = vz1.m23620a0(tj3Var3, R$string.stats_reading_words);
                            LanguageStatValue languageStatValue2 = languageStats.f19103y;
                            boolean zM22120g2 = tj3Var3.m22120g(zi3Var3) | tj3Var3.m22116e(languageProgressPeriod.ordinal());
                            Object objM22097O2 = tj3Var3.m22097O();
                            if (zM22120g2 || objM22097O2 == p84Var) {
                                objM22097O2 = new ui3() { // from class: xo4
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i8 = i5;
                                        xfa xfaVar = xfa.f68157a;
                                        LanguageProgressPeriod languageProgressPeriod2 = languageProgressPeriod;
                                        zi3 zi3Var4 = zi3Var3;
                                        switch (i8) {
                                            case 0:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.CoinsEarned);
                                                break;
                                            case 1:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.WordsOfReading);
                                                break;
                                            case 2:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.ListeningHours);
                                                break;
                                            case 3:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.LingQsCreated);
                                                break;
                                            case 4:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.LearnedLingQs);
                                                break;
                                            default:
                                                zi3Var4.invoke(languageProgressPeriod2, LanguageProgressMetric.KnownWords);
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O2);
                            }
                            e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15);
                            zi3 zi3Var4 = zi3Var2;
                            boolean zM22120g3 = tj3Var3.m22120g(zi3Var4);
                            Object objM22097O3 = tj3Var3.m22097O();
                            if (zM22120g3 || objM22097O3 == p84Var) {
                                objM22097O3 = new C0844ce(zi3Var4, 3, (byte) 0);
                                tj3Var3.m22131l0(objM22097O3);
                            }
                            cid.m4756g(languageProgressMetric2, strM23620a1, languageProgressPeriod, languageStatValue2, true, false, 0, e16VarM815b, (zi3) objM22097O3, tj3Var3, 24582, 96);
                            LanguageProgressMetric languageProgressMetric3 = LanguageProgressMetric.ListeningHours;
                            String strM23620a2 = vz1.m23620a0(tj3Var3, R$string.stats_listening_hours);
                            LanguageStatValue languageStatValue3 = languageStats.f19093o;
                            boolean zM22120g4 = tj3Var3.m22120g(zi3Var3) | tj3Var3.m22116e(languageProgressPeriod.ordinal());
                            Object objM22097O4 = tj3Var3.m22097O();
                            if (zM22120g4 || objM22097O4 == p84Var) {
                                final int i8 = 2;
                                objM22097O4 = new ui3() { // from class: xo4
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i9 = i8;
                                        xfa xfaVar = xfa.f68157a;
                                        LanguageProgressPeriod languageProgressPeriod2 = languageProgressPeriod;
                                        zi3 zi3Var5 = zi3Var3;
                                        switch (i9) {
                                            case 0:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.CoinsEarned);
                                                break;
                                            case 1:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.WordsOfReading);
                                                break;
                                            case 2:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.ListeningHours);
                                                break;
                                            case 3:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.LingQsCreated);
                                                break;
                                            case 4:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.LearnedLingQs);
                                                break;
                                            default:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.KnownWords);
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O4);
                            }
                            e16 e16VarM815b2 = AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15);
                            boolean zM22120g5 = tj3Var3.m22120g(zi3Var4);
                            Object objM22097O5 = tj3Var3.m22097O();
                            final int i9 = 4;
                            if (zM22120g5 || objM22097O5 == p84Var) {
                                objM22097O5 = new C0844ce(zi3Var4, 4, (byte) 0);
                                tj3Var3.m22131l0(objM22097O5);
                            }
                            cid.m4756g(languageProgressMetric3, strM23620a2, languageProgressPeriod, languageStatValue3, true, false, 0, e16VarM815b2, (zi3) objM22097O5, tj3Var3, 24582, 96);
                            LanguageProgressMetric languageProgressMetric4 = LanguageProgressMetric.LingQsCreated;
                            String strM23620a3 = vz1.m23620a0(tj3Var3, R$string.complete_lingqs_created);
                            LanguageStatValue languageStatValue4 = languageStats.f19099u;
                            boolean zM22120g6 = tj3Var3.m22120g(zi3Var3) | tj3Var3.m22116e(languageProgressPeriod.ordinal());
                            Object objM22097O6 = tj3Var3.m22097O();
                            if (zM22120g6 || objM22097O6 == p84Var) {
                                final int i10 = 3;
                                objM22097O6 = new ui3() { // from class: xo4
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i11 = i10;
                                        xfa xfaVar = xfa.f68157a;
                                        LanguageProgressPeriod languageProgressPeriod2 = languageProgressPeriod;
                                        zi3 zi3Var5 = zi3Var3;
                                        switch (i11) {
                                            case 0:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.CoinsEarned);
                                                break;
                                            case 1:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.WordsOfReading);
                                                break;
                                            case 2:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.ListeningHours);
                                                break;
                                            case 3:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.LingQsCreated);
                                                break;
                                            case 4:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.LearnedLingQs);
                                                break;
                                            default:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.KnownWords);
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O6);
                            }
                            cid.m4756g(languageProgressMetric4, strM23620a3, languageProgressPeriod, languageStatValue4, false, false, 0, AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15), null, tj3Var3, 6, 368);
                            LanguageProgressMetric languageProgressMetric5 = LanguageProgressMetric.LearnedLingQs;
                            String strM23620a4 = vz1.m23620a0(tj3Var3, R$string.stats_learned_lingqs);
                            LanguageStatValue languageStatValue5 = languageStats.f19091m;
                            boolean zM22120g7 = tj3Var3.m22120g(zi3Var3) | tj3Var3.m22116e(languageProgressPeriod.ordinal());
                            Object objM22097O7 = tj3Var3.m22097O();
                            if (zM22120g7 || objM22097O7 == p84Var) {
                                objM22097O7 = new ui3() { // from class: xo4
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i11 = i9;
                                        xfa xfaVar = xfa.f68157a;
                                        LanguageProgressPeriod languageProgressPeriod2 = languageProgressPeriod;
                                        zi3 zi3Var5 = zi3Var3;
                                        switch (i11) {
                                            case 0:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.CoinsEarned);
                                                break;
                                            case 1:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.WordsOfReading);
                                                break;
                                            case 2:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.ListeningHours);
                                                break;
                                            case 3:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.LingQsCreated);
                                                break;
                                            case 4:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.LearnedLingQs);
                                                break;
                                            default:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.KnownWords);
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O7);
                            }
                            cid.m4756g(languageProgressMetric5, strM23620a4, languageProgressPeriod, languageStatValue5, false, false, 0, AbstractC0080f.m815b(null, false, (ui3) objM22097O7, b16Var, 15), null, tj3Var3, 6, 368);
                            LanguageProgressMetric languageProgressMetric6 = LanguageProgressMetric.KnownWords;
                            String strM23620a5 = vz1.m23620a0(tj3Var3, R$string.stats_known_words);
                            LanguageStatValue languageStatValue6 = languageStats.f19100v;
                            boolean zM22120g8 = tj3Var3.m22120g(zi3Var3) | tj3Var3.m22116e(languageProgressPeriod.ordinal());
                            Object objM22097O8 = tj3Var3.m22097O();
                            if (zM22120g8 || objM22097O8 == p84Var) {
                                final int i11 = 5;
                                objM22097O8 = new ui3() { // from class: xo4
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i12 = i11;
                                        xfa xfaVar = xfa.f68157a;
                                        LanguageProgressPeriod languageProgressPeriod2 = languageProgressPeriod;
                                        zi3 zi3Var5 = zi3Var3;
                                        switch (i12) {
                                            case 0:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.CoinsEarned);
                                                break;
                                            case 1:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.WordsOfReading);
                                                break;
                                            case 2:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.ListeningHours);
                                                break;
                                            case 3:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.LingQsCreated);
                                                break;
                                            case 4:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.LearnedLingQs);
                                                break;
                                            default:
                                                zi3Var5.invoke(languageProgressPeriod2, LanguageProgressMetric.KnownWords);
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O8);
                            }
                            cid.m4756g(languageProgressMetric6, strM23620a5, languageProgressPeriod, languageStatValue6, false, false, 0, AbstractC0080f.m815b(null, false, (ui3) objM22097O8, b16Var, 15), null, tj3Var3, 6, 368);
                            tj3Var2 = tj3Var3;
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2 = tj3Var3;
                            tj3Var2.m22111b0(-468007907);
                            cid.m4761l(tj3Var2, 0);
                            tj3Var2.m22139q(false);
                        }
                        tj3Var2.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 24576, 15);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(interfaceC3066h8, i, zi3Var, vi3Var, zi3Var2, i2, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029c  */
    /* JADX WARN: Code duplicated, block: B:102:0x02af  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:108:0x0311  */
    /* JADX WARN: Code duplicated, block: B:111:0x034f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0353  */
    /* JADX WARN: Code duplicated, block: B:115:0x0367  */
    /* JADX WARN: Code duplicated, block: B:117:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:119:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:121:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:123:0x0418  */
    /* JADX WARN: Code duplicated, block: B:126:0x0435  */
    /* JADX WARN: Code duplicated, block: B:128:0x0449  */
    /* JADX WARN: Code duplicated, block: B:130:0x044c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x044e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0453  */
    /* JADX WARN: Code duplicated, block: B:134:0x045c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0465  */
    /* JADX WARN: Code duplicated, block: B:136:0x046e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0483  */
    /* JADX WARN: Code duplicated, block: B:141:0x0486 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0493 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:147:0x0496  */
    /* JADX WARN: Code duplicated, block: B:150:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:153:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:154:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:157:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:163:0x04df  */
    /* JADX WARN: Code duplicated, block: B:166:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:169:0x0509  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00de  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0163  */
    /* JADX WARN: Code duplicated, block: B:84:0x0167  */
    /* JADX WARN: Code duplicated, block: B:87:0x0204  */
    /* JADX WARN: Code duplicated, block: B:88:0x020a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0262  */
    /* JADX WARN: Code duplicated, block: B:93:0x0274  */
    /* JADX WARN: Code duplicated, block: B:94:0x0279  */
    /* JADX WARN: Code duplicated, block: B:97:0x0281  */
    /* JADX WARN: Code duplicated, block: B:98:0x0287  */
    /* JADX INFO: renamed from: g */
    public static final void m4756g(LanguageProgressMetric languageProgressMetric, String str, LanguageProgressPeriod languageProgressPeriod, LanguageStatValue languageStatValue, boolean z, boolean z2, int i, e16 e16Var, zi3 zi3Var, ye1 ye1Var, int i2, int i3) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z4;
        tj3 tj3Var;
        boolean z5;
        int i16;
        zi3 zi3Var2;
        boolean z6;
        x18 x18VarM22143u;
        boolean z7;
        int i17;
        p84 p84Var;
        zi3 zi3Var3;
        Context context;
        Object objM22097O;
        t66 t66Var;
        int i18;
        boolean z8;
        ui3 ui3Var;
        vj8 vj8Var;
        b16 b16Var;
        zi3 zi3Var4;
        boolean zM21391a;
        double d;
        String strValueOf;
        String string;
        float f;
        boolean z9;
        int i19;
        p84 p84Var2;
        Object objM22097O2;
        zi3 zi3Var5;
        int i20;
        int i21;
        LanguageProgressInputType languageProgressInputType;
        Object objM22097O3;
        boolean z10;
        Object objM22097O4;
        String str2;
        String strValueOf2;
        long jM4215h;
        Object objM22097O5;
        languageProgressMetric.getClass();
        str.getClass();
        languageProgressPeriod.getClass();
        languageStatValue.getClass();
        double d2 = languageStatValue.f19077b;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-700467143);
        int i22 = (tj3Var2.m22120g(str) ? 32 : 16) | i2 | (tj3Var2.m22116e(languageProgressPeriod.ordinal()) ? 256 : 128) | (tj3Var2.m22124i(languageStatValue) ? 2048 : 1024);
        int i23 = i3 & 16;
        if (i23 == 0) {
            if ((i2 & 24576) == 0) {
                i22 |= tj3Var2.m22122h(z) ? 16384 : 8192;
            }
            i4 = i3 & 32;
            if (i4 != 0) {
                if ((196608 & i2) == 0) {
                    z3 = z2;
                    if (tj3Var2.m22122h(z3)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i22 |= i5;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i9 = i22 | 1572864;
                    i7 = i;
                } else {
                    i7 = i;
                    if (tj3Var2.m22116e(i7)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i9 = i22 | i8;
                }
                if (tj3Var2.m22120g(e16Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i11 = i9 | i10;
                i12 = i3 & 256;
                if (i12 != 0) {
                    i14 = i11 | 100663296;
                } else {
                    if (tj3Var2.m22124i(zi3Var)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i14 = i11 | i13;
                }
                i15 = i14;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (tj3Var2.m22099R(i15 & 1, z4)) {
                    if (i23 != 0) {
                        z7 = false;
                    } else {
                        z7 = z;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        i17 = 0;
                    } else {
                        i17 = i7;
                    }
                    p84Var = we1.f66679a;
                    if (i12 != 0) {
                        objM22097O5 = tj3Var2.m22097O();
                        if (objM22097O5 == p84Var) {
                            objM22097O5 = new je1(23);
                            tj3Var2.m22131l0(objM22097O5);
                        }
                        zi3Var3 = (zi3) objM22097O5;
                    } else {
                        zi3Var3 = zi3Var;
                    }
                    context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
                    objM22097O = tj3Var2.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    t66Var = (t66) objM22097O;
                    z = z7;
                    e16 e16VarM4429v = c99.m4429v(c99.m4412e(AbstractC3584sr.m21608U(e16Var, ge9.m12515a(tj3Var2).f38957f, ge9.m12515a(tj3Var2).f38956e), 1.0f));
                    i18 = i17;
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var2, 54);
                    z8 = z3;
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4429v);
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    zi3 zi3Var6 = C0352b.f4303f;
                    oha.m18001g(tj3Var2, zi3Var6, sj8VarM20003a);
                    zi3 zi3Var7 = C0352b.f4302e;
                    oha.m18001g(tj3Var2, zi3Var7, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var8 = C0352b.f4304g;
                    oha.m18001g(tj3Var2, zi3Var8, numValueOf);
                    vi3 vi3Var = C0352b.f4305h;
                    oha.m18000f(tj3Var2, vi3Var);
                    zi3 zi3Var9 = C0352b.f4301d;
                    oha.m18001g(tj3Var2, zi3Var9, e16VarM1322c);
                    vj8Var = vj8.f65508a;
                    b16Var = b16.f7762a;
                    zi3Var4 = zi3Var3;
                    lw9.m16554b(str, vj8Var.mo12420a(0.5f, b16Var, true), p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, (i15 >> 3) & 14, 24960, 110584);
                    e16 e16VarMo12420a = vj8Var.mo12420a(0.2f, b16Var, true);
                    zM21391a = shd.m21391a(languageProgressMetric);
                    d = languageStatValue.f19076a;
                    if (zM21391a) {
                        strValueOf = String.valueOf((int) d);
                    } else {
                        strValueOf = String.valueOf(nob.m17572a(2, d));
                    }
                    lw9.m16554b(strValueOf, e16VarMo12420a, p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, 0, 0, 130040);
                    tj3Var = tj3Var2;
                    string = "";
                    if (languageProgressPeriod == LanguageProgressPeriod.Today) {
                        tj3Var.m22111b0(-616243512);
                        e16 e16VarMo12420a2 = vj8Var.mo12420a(0.15f, b16Var, true);
                        if (d2 > 0.0d) {
                            str2 = "+";
                        } else {
                            str2 = "";
                        }
                        if (shd.m21391a(languageProgressMetric)) {
                            strValueOf2 = String.valueOf((int) d2);
                        } else {
                            strValueOf2 = String.valueOf(nob.m17572a(2, d2));
                        }
                        String strM22990m = ux5.m22990m(str2, strValueOf2);
                        vx9 vx9Var = p58.m18902j(tj3Var).f71410n;
                        if (d2 > 0.0d) {
                            tj3Var.m22111b0(-615744970);
                            jM4215h = cx2.m9917a(tj3Var).m4212e();
                            tj3Var.m22139q(false);
                        } else if (d2 < 0.0d) {
                            tj3Var.m22111b0(-615626984);
                            jM4215h = cx2.m9917a(tj3Var).m4215h();
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(-615544710);
                            jM4215h = p58.m18900f(tj3Var).f55873q;
                            tj3Var.m22139q(false);
                        }
                        f = 0.15f;
                        lw9.m16554b(strM22990m, e16VarMo12420a2, jM4215h, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 130040);
                        z9 = false;
                        tj3Var.m22139q(false);
                    } else {
                        f = 0.15f;
                        z9 = false;
                        tj3Var.m22111b0(-615406171);
                        tj3Var.m22139q(false);
                    }
                    e16 e16VarMo12420a3 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(tj3Var).getClass();
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4416i(e16VarMo12420a3, 32.0f, 0.0f, 2), 0.0f);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52813h, z9);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var6, ht5VarM19966d);
                    oha.m18001g(tj3Var, zi3Var7, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var8, tj3Var, vi3Var);
                    oha.m18001g(tj3Var, zi3Var9, e16VarM1322c2);
                    if (z8) {
                        tj3Var.m22111b0(2098163025);
                        ge9.m12515a(tj3Var).getClass();
                        m1d.m16596a(te1.m21995i(1.0f, c99.m4422o(b16Var, 32.0f), false), 100, 100, i18, false, false, tj3Var, ((i15 >> 9) & 7168) | 221616, 0);
                        i19 = i18;
                        tj3Var.m22139q(false);
                        p84Var2 = p84Var;
                    } else {
                        i19 = i18;
                        if (z) {
                            tj3Var.m22111b0(2098590856);
                            objM22097O2 = tj3Var.m22097O();
                            p84Var2 = p84Var;
                            if (objM22097O2 == p84Var2) {
                                objM22097O2 = new do4(3, t66Var);
                                tj3Var.m22131l0(objM22097O2);
                            }
                            ui3 ui3Var2 = (ui3) objM22097O2;
                            e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 0.0f, 14);
                            ge9.m12515a(tj3Var).getClass();
                            omd.m18141c(ui3Var2, AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(te1.m21995i(1.0f, c99.m4422o(e16VarM21611X, 32.0f), false), p58.m18901i(tj3Var).f64859e), p58.m18900f(tj3Var).f55874r, ss5.f61356d), 0.0f), false, null, null, nsb.f53223i, tj3Var, 1572870, 60);
                            tj3Var.m22139q(false);
                        } else {
                            p84Var2 = p84Var;
                            tj3Var.m22111b0(2099474015);
                            tj3Var.m22139q(false);
                        }
                    }
                    tj3Var.m22139q(true);
                    if (((Boolean) t66Var.getValue()).booleanValue()) {
                        tj3Var.m22111b0(-613740076);
                        int[] iArr = hp4.f42735b;
                        i20 = iArr[languageProgressMetric.ordinal()];
                        if (i20 != 1) {
                            string = context.getString(R$string.stats_add_listening);
                        } else if (i20 != 2) {
                            string = context.getString(R$string.stats_add_reading);
                        } else if (i20 != 3) {
                            string = context.getString(com.lingq.feature.statistics.R$string.stats_add_writing);
                        } else if (i20 == 4) {
                            string = context.getString(com.lingq.feature.statistics.R$string.stats_add_speaking);
                        }
                        String str3 = string;
                        str3.getClass();
                        i21 = iArr[languageProgressMetric.ordinal()];
                        if (i21 == 1) {
                            languageProgressInputType = (i21 == 2 && i21 != 3 && i21 == 4) ? LanguageProgressInputType.HoursMinutes : LanguageProgressInputType.WordCount;
                        } else {
                            languageProgressInputType = LanguageProgressInputType.HoursMinutes;
                        }
                        jm4 jm4Var = new jm4(str3, languageProgressInputType);
                        objM22097O3 = tj3Var.m22097O();
                        if (objM22097O3 == p84Var2) {
                            objM22097O3 = new do4(4, t66Var);
                            tj3Var.m22131l0(objM22097O3);
                        }
                        ui3 ui3Var3 = (ui3) objM22097O3;
                        if ((i15 & 234881024) == 67108864) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objM22097O4 = tj3Var.m22097O();
                        if (!z10 || objM22097O4 == p84Var2) {
                            zi3Var5 = zi3Var4;
                            objM22097O4 = new C3485q5(zi3Var5, languageProgressMetric, t66Var, 21);
                            tj3Var.m22131l0(objM22097O4);
                        } else {
                            zi3Var5 = zi3Var4;
                        }
                        vhd.m23289a(jm4Var, ui3Var3, (vi3) objM22097O4, tj3Var, 48);
                        tj3Var.m22139q(false);
                    } else {
                        zi3Var5 = zi3Var4;
                        tj3Var.m22111b0(-612370651);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(true);
                    i16 = i19;
                    zi3Var2 = zi3Var5;
                    z5 = z8;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    z5 = z3;
                    i16 = i7;
                    zi3Var2 = zi3Var;
                }
                z6 = z;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new oy0(languageProgressMetric, str, languageProgressPeriod, languageStatValue, z6, z5, i16, e16Var, zi3Var2, i2, i3);
                }
            }
            i22 |= 196608;
            z3 = z2;
            i6 = i3 & 64;
            if (i6 != 0) {
                i9 = i22 | 1572864;
                i7 = i;
            } else {
                i7 = i;
                if (tj3Var2.m22116e(i7)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i9 = i22 | i8;
            }
            if (tj3Var2.m22120g(e16Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i11 = i9 | i10;
            i12 = i3 & 256;
            if (i12 != 0) {
                i14 = i11 | 100663296;
            } else {
                if (tj3Var2.m22124i(zi3Var)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i14 = i11 | i13;
            }
            i15 = i14;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var2.m22099R(i15 & 1, z4)) {
                if (i23 != 0) {
                    z7 = false;
                } else {
                    z7 = z;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    i17 = 0;
                } else {
                    i17 = i7;
                }
                p84Var = we1.f66679a;
                if (i12 != 0) {
                    objM22097O5 = tj3Var2.m22097O();
                    if (objM22097O5 == p84Var) {
                        objM22097O5 = new je1(23);
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    zi3Var3 = (zi3) objM22097O5;
                } else {
                    zi3Var3 = zi3Var;
                }
                context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
                objM22097O = tj3Var2.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var2.m22131l0(objM22097O);
                }
                t66Var = (t66) objM22097O;
                z = z7;
                e16 e16VarM4429v2 = c99.m4429v(c99.m4412e(AbstractC3584sr.m21608U(e16Var, ge9.m12515a(tj3Var2).f38957f, ge9.m12515a(tj3Var2).f38956e), 1.0f));
                i18 = i17;
                sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var2, 54);
                z8 = z3;
                int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m3 = tj3Var2.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM4429v2);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                zi3 zi3Var10 = C0352b.f4303f;
                oha.m18001g(tj3Var2, zi3Var10, sj8VarM20003a2);
                zi3 zi3Var11 = C0352b.f4302e;
                oha.m18001g(tj3Var2, zi3Var11, l77VarM22132m3);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                zi3 zi3Var12 = C0352b.f4304g;
                oha.m18001g(tj3Var2, zi3Var12, numValueOf2);
                vi3 vi3Var2 = C0352b.f4305h;
                oha.m18000f(tj3Var2, vi3Var2);
                zi3 zi3Var13 = C0352b.f4301d;
                oha.m18001g(tj3Var2, zi3Var13, e16VarM1322c3);
                vj8Var = vj8.f65508a;
                b16Var = b16.f7762a;
                zi3Var4 = zi3Var3;
                lw9.m16554b(str, vj8Var.mo12420a(0.5f, b16Var, true), p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, (i15 >> 3) & 14, 24960, 110584);
                e16 e16VarMo12420a4 = vj8Var.mo12420a(0.2f, b16Var, true);
                zM21391a = shd.m21391a(languageProgressMetric);
                d = languageStatValue.f19076a;
                if (zM21391a) {
                    strValueOf = String.valueOf((int) d);
                } else {
                    strValueOf = String.valueOf(nob.m17572a(2, d));
                }
                lw9.m16554b(strValueOf, e16VarMo12420a4, p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, 0, 0, 130040);
                tj3Var = tj3Var2;
                string = "";
                if (languageProgressPeriod == LanguageProgressPeriod.Today) {
                    tj3Var.m22111b0(-616243512);
                    e16 e16VarMo12420a5 = vj8Var.mo12420a(0.15f, b16Var, true);
                    if (d2 > 0.0d) {
                        str2 = "+";
                    } else {
                        str2 = "";
                    }
                    if (shd.m21391a(languageProgressMetric)) {
                        strValueOf2 = String.valueOf((int) d2);
                    } else {
                        strValueOf2 = String.valueOf(nob.m17572a(2, d2));
                    }
                    String strM22990m2 = ux5.m22990m(str2, strValueOf2);
                    vx9 vx9Var2 = p58.m18902j(tj3Var).f71410n;
                    if (d2 > 0.0d) {
                        tj3Var.m22111b0(-615744970);
                        jM4215h = cx2.m9917a(tj3Var).m4212e();
                        tj3Var.m22139q(false);
                    } else if (d2 < 0.0d) {
                        tj3Var.m22111b0(-615626984);
                        jM4215h = cx2.m9917a(tj3Var).m4215h();
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-615544710);
                        jM4215h = p58.m18900f(tj3Var).f55873q;
                        tj3Var.m22139q(false);
                    }
                    f = 0.15f;
                    lw9.m16554b(strM22990m2, e16VarMo12420a5, jM4215h, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, vx9Var2, tj3Var, 0, 0, 130040);
                    z9 = false;
                    tj3Var.m22139q(false);
                } else {
                    f = 0.15f;
                    z9 = false;
                    tj3Var.m22111b0(-615406171);
                    tj3Var.m22139q(false);
                }
                e16 e16VarMo12420a6 = vj8Var.mo12420a(f, b16Var, true);
                ge9.m12515a(tj3Var).getClass();
                e16 e16VarM21607T2 = AbstractC3584sr.m21607T(c99.m4416i(e16VarMo12420a6, 32.0f, 0.0f, 2), 0.0f);
                ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52813h, z9);
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var10, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var11, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var12, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var13, e16VarM1322c4);
                if (z8) {
                    tj3Var.m22111b0(2098163025);
                    ge9.m12515a(tj3Var).getClass();
                    m1d.m16596a(te1.m21995i(1.0f, c99.m4422o(b16Var, 32.0f), false), 100, 100, i18, false, false, tj3Var, ((i15 >> 9) & 7168) | 221616, 0);
                    i19 = i18;
                    tj3Var.m22139q(false);
                    p84Var2 = p84Var;
                } else {
                    i19 = i18;
                    if (z) {
                        tj3Var.m22111b0(2098590856);
                        objM22097O2 = tj3Var.m22097O();
                        p84Var2 = p84Var;
                        if (objM22097O2 == p84Var2) {
                            objM22097O2 = new do4(3, t66Var);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        ui3 ui3Var4 = (ui3) objM22097O2;
                        e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 0.0f, 14);
                        ge9.m12515a(tj3Var).getClass();
                        omd.m18141c(ui3Var4, AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(te1.m21995i(1.0f, c99.m4422o(e16VarM21611X2, 32.0f), false), p58.m18901i(tj3Var).f64859e), p58.m18900f(tj3Var).f55874r, ss5.f61356d), 0.0f), false, null, null, nsb.f53223i, tj3Var, 1572870, 60);
                        tj3Var.m22139q(false);
                    } else {
                        p84Var2 = p84Var;
                        tj3Var.m22111b0(2099474015);
                        tj3Var.m22139q(false);
                    }
                }
                tj3Var.m22139q(true);
                if (((Boolean) t66Var.getValue()).booleanValue()) {
                    tj3Var.m22111b0(-613740076);
                    int[] iArr2 = hp4.f42735b;
                    i20 = iArr2[languageProgressMetric.ordinal()];
                    if (i20 != 1) {
                        string = context.getString(R$string.stats_add_listening);
                    } else if (i20 != 2) {
                        string = context.getString(R$string.stats_add_reading);
                    } else if (i20 != 3) {
                        string = context.getString(com.lingq.feature.statistics.R$string.stats_add_writing);
                    } else if (i20 == 4) {
                        string = context.getString(com.lingq.feature.statistics.R$string.stats_add_speaking);
                    }
                    String str4 = string;
                    str4.getClass();
                    i21 = iArr2[languageProgressMetric.ordinal()];
                    if (i21 == 1) {
                        languageProgressInputType = LanguageProgressInputType.HoursMinutes;
                    } else if (i21 == 2) {
                        languageProgressInputType = LanguageProgressInputType.WordCount;
                    } else {
                        languageProgressInputType = LanguageProgressInputType.WordCount;
                    }
                    jm4 jm4Var2 = new jm4(str4, languageProgressInputType);
                    objM22097O3 = tj3Var.m22097O();
                    if (objM22097O3 == p84Var2) {
                        objM22097O3 = new do4(4, t66Var);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    ui3 ui3Var5 = (ui3) objM22097O3;
                    if ((i15 & 234881024) == 67108864) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objM22097O4 = tj3Var.m22097O();
                    if (z10) {
                        zi3Var5 = zi3Var4;
                        objM22097O4 = new C3485q5(zi3Var5, languageProgressMetric, t66Var, 21);
                        tj3Var.m22131l0(objM22097O4);
                    } else {
                        zi3Var5 = zi3Var4;
                        objM22097O4 = new C3485q5(zi3Var5, languageProgressMetric, t66Var, 21);
                        tj3Var.m22131l0(objM22097O4);
                    }
                    vhd.m23289a(jm4Var2, ui3Var5, (vi3) objM22097O4, tj3Var, 48);
                    tj3Var.m22139q(false);
                } else {
                    zi3Var5 = zi3Var4;
                    tj3Var.m22111b0(-612370651);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(true);
                i16 = i19;
                zi3Var2 = zi3Var5;
                z5 = z8;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                z5 = z3;
                i16 = i7;
                zi3Var2 = zi3Var;
            }
            z6 = z;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new oy0(languageProgressMetric, str, languageProgressPeriod, languageStatValue, z6, z5, i16, e16Var, zi3Var2, i2, i3);
            }
        }
        i22 |= 24576;
        i4 = i3 & 32;
        if (i4 != 0) {
            if ((196608 & i2) == 0) {
                z3 = z2;
                if (tj3Var2.m22122h(z3)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i22 |= i5;
            }
            i6 = i3 & 64;
            if (i6 != 0) {
                i9 = i22 | 1572864;
                i7 = i;
            } else {
                i7 = i;
                if (tj3Var2.m22116e(i7)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i9 = i22 | i8;
            }
            if (tj3Var2.m22120g(e16Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i11 = i9 | i10;
            i12 = i3 & 256;
            if (i12 != 0) {
                i14 = i11 | 100663296;
            } else {
                if (tj3Var2.m22124i(zi3Var)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i14 = i11 | i13;
            }
            i15 = i14;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var2.m22099R(i15 & 1, z4)) {
                if (i23 != 0) {
                    z7 = false;
                } else {
                    z7 = z;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    i17 = 0;
                } else {
                    i17 = i7;
                }
                p84Var = we1.f66679a;
                if (i12 != 0) {
                    objM22097O5 = tj3Var2.m22097O();
                    if (objM22097O5 == p84Var) {
                        objM22097O5 = new je1(23);
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    zi3Var3 = (zi3) objM22097O5;
                } else {
                    zi3Var3 = zi3Var;
                }
                context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
                objM22097O = tj3Var2.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var2.m22131l0(objM22097O);
                }
                t66Var = (t66) objM22097O;
                z = z7;
                e16 e16VarM4429v3 = c99.m4429v(c99.m4412e(AbstractC3584sr.m21608U(e16Var, ge9.m12515a(tj3Var2).f38957f, ge9.m12515a(tj3Var2).f38956e), 1.0f));
                i18 = i17;
                sj8 sj8VarM20003a3 = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var2, 54);
                z8 = z3;
                int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m5 = tj3Var2.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, e16VarM4429v3);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                zi3 zi3Var14 = C0352b.f4303f;
                oha.m18001g(tj3Var2, zi3Var14, sj8VarM20003a3);
                zi3 zi3Var15 = C0352b.f4302e;
                oha.m18001g(tj3Var2, zi3Var15, l77VarM22132m5);
                Integer numValueOf3 = Integer.valueOf(iHashCode5);
                zi3 zi3Var16 = C0352b.f4304g;
                oha.m18001g(tj3Var2, zi3Var16, numValueOf3);
                vi3 vi3Var3 = C0352b.f4305h;
                oha.m18000f(tj3Var2, vi3Var3);
                zi3 zi3Var17 = C0352b.f4301d;
                oha.m18001g(tj3Var2, zi3Var17, e16VarM1322c5);
                vj8Var = vj8.f65508a;
                b16Var = b16.f7762a;
                zi3Var4 = zi3Var3;
                lw9.m16554b(str, vj8Var.mo12420a(0.5f, b16Var, true), p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, (i15 >> 3) & 14, 24960, 110584);
                e16 e16VarMo12420a7 = vj8Var.mo12420a(0.2f, b16Var, true);
                zM21391a = shd.m21391a(languageProgressMetric);
                d = languageStatValue.f19076a;
                if (zM21391a) {
                    strValueOf = String.valueOf((int) d);
                } else {
                    strValueOf = String.valueOf(nob.m17572a(2, d));
                }
                lw9.m16554b(strValueOf, e16VarMo12420a7, p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, 0, 0, 130040);
                tj3Var = tj3Var2;
                string = "";
                if (languageProgressPeriod == LanguageProgressPeriod.Today) {
                    tj3Var.m22111b0(-616243512);
                    e16 e16VarMo12420a8 = vj8Var.mo12420a(0.15f, b16Var, true);
                    if (d2 > 0.0d) {
                        str2 = "+";
                    } else {
                        str2 = "";
                    }
                    if (shd.m21391a(languageProgressMetric)) {
                        strValueOf2 = String.valueOf((int) d2);
                    } else {
                        strValueOf2 = String.valueOf(nob.m17572a(2, d2));
                    }
                    String strM22990m3 = ux5.m22990m(str2, strValueOf2);
                    vx9 vx9Var3 = p58.m18902j(tj3Var).f71410n;
                    if (d2 > 0.0d) {
                        tj3Var.m22111b0(-615744970);
                        jM4215h = cx2.m9917a(tj3Var).m4212e();
                        tj3Var.m22139q(false);
                    } else if (d2 < 0.0d) {
                        tj3Var.m22111b0(-615626984);
                        jM4215h = cx2.m9917a(tj3Var).m4215h();
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-615544710);
                        jM4215h = p58.m18900f(tj3Var).f55873q;
                        tj3Var.m22139q(false);
                    }
                    f = 0.15f;
                    lw9.m16554b(strM22990m3, e16VarMo12420a8, jM4215h, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, vx9Var3, tj3Var, 0, 0, 130040);
                    z9 = false;
                    tj3Var.m22139q(false);
                } else {
                    f = 0.15f;
                    z9 = false;
                    tj3Var.m22111b0(-615406171);
                    tj3Var.m22139q(false);
                }
                e16 e16VarMo12420a9 = vj8Var.mo12420a(f, b16Var, true);
                ge9.m12515a(tj3Var).getClass();
                e16 e16VarM21607T3 = AbstractC3584sr.m21607T(c99.m4416i(e16VarMo12420a9, 32.0f, 0.0f, 2), 0.0f);
                ht5 ht5VarM19966d3 = qh0.m19966d(nj0.f52813h, z9);
                int iHashCode6 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m6 = tj3Var.m22132m();
                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T3);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var14, ht5VarM19966d3);
                oha.m18001g(tj3Var, zi3Var15, l77VarM22132m6);
                AbstractC3393o1.m17747v(iHashCode6, tj3Var, zi3Var16, tj3Var, vi3Var3);
                oha.m18001g(tj3Var, zi3Var17, e16VarM1322c6);
                if (z8) {
                    tj3Var.m22111b0(2098163025);
                    ge9.m12515a(tj3Var).getClass();
                    m1d.m16596a(te1.m21995i(1.0f, c99.m4422o(b16Var, 32.0f), false), 100, 100, i18, false, false, tj3Var, ((i15 >> 9) & 7168) | 221616, 0);
                    i19 = i18;
                    tj3Var.m22139q(false);
                    p84Var2 = p84Var;
                } else {
                    i19 = i18;
                    if (z) {
                        tj3Var.m22111b0(2098590856);
                        objM22097O2 = tj3Var.m22097O();
                        p84Var2 = p84Var;
                        if (objM22097O2 == p84Var2) {
                            objM22097O2 = new do4(3, t66Var);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        ui3 ui3Var6 = (ui3) objM22097O2;
                        e16 e16VarM21611X3 = AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 0.0f, 14);
                        ge9.m12515a(tj3Var).getClass();
                        omd.m18141c(ui3Var6, AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(te1.m21995i(1.0f, c99.m4422o(e16VarM21611X3, 32.0f), false), p58.m18901i(tj3Var).f64859e), p58.m18900f(tj3Var).f55874r, ss5.f61356d), 0.0f), false, null, null, nsb.f53223i, tj3Var, 1572870, 60);
                        tj3Var.m22139q(false);
                    } else {
                        p84Var2 = p84Var;
                        tj3Var.m22111b0(2099474015);
                        tj3Var.m22139q(false);
                    }
                }
                tj3Var.m22139q(true);
                if (((Boolean) t66Var.getValue()).booleanValue()) {
                    tj3Var.m22111b0(-613740076);
                    int[] iArr3 = hp4.f42735b;
                    i20 = iArr3[languageProgressMetric.ordinal()];
                    if (i20 != 1) {
                        string = context.getString(R$string.stats_add_listening);
                    } else if (i20 != 2) {
                        string = context.getString(R$string.stats_add_reading);
                    } else if (i20 != 3) {
                        string = context.getString(com.lingq.feature.statistics.R$string.stats_add_writing);
                    } else if (i20 == 4) {
                        string = context.getString(com.lingq.feature.statistics.R$string.stats_add_speaking);
                    }
                    String str5 = string;
                    str5.getClass();
                    i21 = iArr3[languageProgressMetric.ordinal()];
                    if (i21 == 1) {
                        languageProgressInputType = LanguageProgressInputType.HoursMinutes;
                    } else if (i21 == 2) {
                        languageProgressInputType = LanguageProgressInputType.WordCount;
                    } else {
                        languageProgressInputType = LanguageProgressInputType.WordCount;
                    }
                    jm4 jm4Var3 = new jm4(str5, languageProgressInputType);
                    objM22097O3 = tj3Var.m22097O();
                    if (objM22097O3 == p84Var2) {
                        objM22097O3 = new do4(4, t66Var);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    ui3 ui3Var7 = (ui3) objM22097O3;
                    if ((i15 & 234881024) == 67108864) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objM22097O4 = tj3Var.m22097O();
                    if (z10) {
                        zi3Var5 = zi3Var4;
                        objM22097O4 = new C3485q5(zi3Var5, languageProgressMetric, t66Var, 21);
                        tj3Var.m22131l0(objM22097O4);
                    } else {
                        zi3Var5 = zi3Var4;
                        objM22097O4 = new C3485q5(zi3Var5, languageProgressMetric, t66Var, 21);
                        tj3Var.m22131l0(objM22097O4);
                    }
                    vhd.m23289a(jm4Var3, ui3Var7, (vi3) objM22097O4, tj3Var, 48);
                    tj3Var.m22139q(false);
                } else {
                    zi3Var5 = zi3Var4;
                    tj3Var.m22111b0(-612370651);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(true);
                i16 = i19;
                zi3Var2 = zi3Var5;
                z5 = z8;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                z5 = z3;
                i16 = i7;
                zi3Var2 = zi3Var;
            }
            z6 = z;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new oy0(languageProgressMetric, str, languageProgressPeriod, languageStatValue, z6, z5, i16, e16Var, zi3Var2, i2, i3);
            }
        }
        i22 |= 196608;
        z3 = z2;
        i6 = i3 & 64;
        if (i6 != 0) {
            i9 = i22 | 1572864;
            i7 = i;
        } else {
            i7 = i;
            if (tj3Var2.m22116e(i7)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i9 = i22 | i8;
        }
        if (tj3Var2.m22120g(e16Var)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        i11 = i9 | i10;
        i12 = i3 & 256;
        if (i12 != 0) {
            i14 = i11 | 100663296;
        } else {
            if (tj3Var2.m22124i(zi3Var)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i14 = i11 | i13;
        }
        i15 = i14;
        if ((i15 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (tj3Var2.m22099R(i15 & 1, z4)) {
            if (i23 != 0) {
                z7 = false;
            } else {
                z7 = z;
            }
            if (i4 != 0) {
                z3 = false;
            }
            if (i6 != 0) {
                i17 = 0;
            } else {
                i17 = i7;
            }
            p84Var = we1.f66679a;
            if (i12 != 0) {
                objM22097O5 = tj3Var2.m22097O();
                if (objM22097O5 == p84Var) {
                    objM22097O5 = new je1(23);
                    tj3Var2.m22131l0(objM22097O5);
                }
                zi3Var3 = (zi3) objM22097O5;
            } else {
                zi3Var3 = zi3Var;
            }
            context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            objM22097O = tj3Var2.m22097O();
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O);
            }
            t66Var = (t66) objM22097O;
            z = z7;
            e16 e16VarM4429v4 = c99.m4429v(c99.m4412e(AbstractC3584sr.m21608U(e16Var, ge9.m12515a(tj3Var2).f38957f, ge9.m12515a(tj3Var2).f38956e), 1.0f));
            i18 = i17;
            sj8 sj8VarM20003a4 = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var2, 54);
            z8 = z3;
            int iHashCode7 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m7 = tj3Var2.m22132m();
            e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var2, e16VarM4429v4);
            se1.f60731q.getClass();
            ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            zi3 zi3Var18 = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var18, sj8VarM20003a4);
            zi3 zi3Var19 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var19, l77VarM22132m7);
            Integer numValueOf4 = Integer.valueOf(iHashCode7);
            zi3 zi3Var110 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var110, numValueOf4);
            vi3 vi3Var4 = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var4);
            zi3 zi3Var111 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var111, e16VarM1322c7);
            vj8Var = vj8.f65508a;
            b16Var = b16.f7762a;
            zi3Var4 = zi3Var3;
            lw9.m16554b(str, vj8Var.mo12420a(0.5f, b16Var, true), p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, (i15 >> 3) & 14, 24960, 110584);
            e16 e16VarMo12420a10 = vj8Var.mo12420a(0.2f, b16Var, true);
            zM21391a = shd.m21391a(languageProgressMetric);
            d = languageStatValue.f19076a;
            if (zM21391a) {
                strValueOf = String.valueOf((int) d);
            } else {
                strValueOf = String.valueOf(nob.m17572a(2, d));
            }
            lw9.m16554b(strValueOf, e16VarMo12420a10, p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, 0, 0, 130040);
            tj3Var = tj3Var2;
            string = "";
            if (languageProgressPeriod == LanguageProgressPeriod.Today) {
                tj3Var.m22111b0(-616243512);
                e16 e16VarMo12420a11 = vj8Var.mo12420a(0.15f, b16Var, true);
                if (d2 > 0.0d) {
                    str2 = "+";
                } else {
                    str2 = "";
                }
                if (shd.m21391a(languageProgressMetric)) {
                    strValueOf2 = String.valueOf((int) d2);
                } else {
                    strValueOf2 = String.valueOf(nob.m17572a(2, d2));
                }
                String strM22990m4 = ux5.m22990m(str2, strValueOf2);
                vx9 vx9Var4 = p58.m18902j(tj3Var).f71410n;
                if (d2 > 0.0d) {
                    tj3Var.m22111b0(-615744970);
                    jM4215h = cx2.m9917a(tj3Var).m4212e();
                    tj3Var.m22139q(false);
                } else if (d2 < 0.0d) {
                    tj3Var.m22111b0(-615626984);
                    jM4215h = cx2.m9917a(tj3Var).m4215h();
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-615544710);
                    jM4215h = p58.m18900f(tj3Var).f55873q;
                    tj3Var.m22139q(false);
                }
                f = 0.15f;
                lw9.m16554b(strM22990m4, e16VarMo12420a11, jM4215h, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, vx9Var4, tj3Var, 0, 0, 130040);
                z9 = false;
                tj3Var.m22139q(false);
            } else {
                f = 0.15f;
                z9 = false;
                tj3Var.m22111b0(-615406171);
                tj3Var.m22139q(false);
            }
            e16 e16VarMo12420a12 = vj8Var.mo12420a(f, b16Var, true);
            ge9.m12515a(tj3Var).getClass();
            e16 e16VarM21607T4 = AbstractC3584sr.m21607T(c99.m4416i(e16VarMo12420a12, 32.0f, 0.0f, 2), 0.0f);
            ht5 ht5VarM19966d4 = qh0.m19966d(nj0.f52813h, z9);
            int iHashCode8 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m8 = tj3Var.m22132m();
            e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T4);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var18, ht5VarM19966d4);
            oha.m18001g(tj3Var, zi3Var19, l77VarM22132m8);
            AbstractC3393o1.m17747v(iHashCode8, tj3Var, zi3Var110, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var111, e16VarM1322c8);
            if (z8) {
                tj3Var.m22111b0(2098163025);
                ge9.m12515a(tj3Var).getClass();
                m1d.m16596a(te1.m21995i(1.0f, c99.m4422o(b16Var, 32.0f), false), 100, 100, i18, false, false, tj3Var, ((i15 >> 9) & 7168) | 221616, 0);
                i19 = i18;
                tj3Var.m22139q(false);
                p84Var2 = p84Var;
            } else {
                i19 = i18;
                if (z) {
                    tj3Var.m22111b0(2098590856);
                    objM22097O2 = tj3Var.m22097O();
                    p84Var2 = p84Var;
                    if (objM22097O2 == p84Var2) {
                        objM22097O2 = new do4(3, t66Var);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    ui3 ui3Var8 = (ui3) objM22097O2;
                    e16 e16VarM21611X4 = AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 0.0f, 14);
                    ge9.m12515a(tj3Var).getClass();
                    omd.m18141c(ui3Var8, AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(te1.m21995i(1.0f, c99.m4422o(e16VarM21611X4, 32.0f), false), p58.m18901i(tj3Var).f64859e), p58.m18900f(tj3Var).f55874r, ss5.f61356d), 0.0f), false, null, null, nsb.f53223i, tj3Var, 1572870, 60);
                    tj3Var.m22139q(false);
                } else {
                    p84Var2 = p84Var;
                    tj3Var.m22111b0(2099474015);
                    tj3Var.m22139q(false);
                }
            }
            tj3Var.m22139q(true);
            if (((Boolean) t66Var.getValue()).booleanValue()) {
                tj3Var.m22111b0(-613740076);
                int[] iArr4 = hp4.f42735b;
                i20 = iArr4[languageProgressMetric.ordinal()];
                if (i20 != 1) {
                    string = context.getString(R$string.stats_add_listening);
                } else if (i20 != 2) {
                    string = context.getString(R$string.stats_add_reading);
                } else if (i20 != 3) {
                    string = context.getString(com.lingq.feature.statistics.R$string.stats_add_writing);
                } else if (i20 == 4) {
                    string = context.getString(com.lingq.feature.statistics.R$string.stats_add_speaking);
                }
                String str6 = string;
                str6.getClass();
                i21 = iArr4[languageProgressMetric.ordinal()];
                if (i21 == 1) {
                    languageProgressInputType = LanguageProgressInputType.HoursMinutes;
                } else if (i21 == 2) {
                    languageProgressInputType = LanguageProgressInputType.WordCount;
                } else {
                    languageProgressInputType = LanguageProgressInputType.WordCount;
                }
                jm4 jm4Var4 = new jm4(str6, languageProgressInputType);
                objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var2) {
                    objM22097O3 = new do4(4, t66Var);
                    tj3Var.m22131l0(objM22097O3);
                }
                ui3 ui3Var9 = (ui3) objM22097O3;
                if ((i15 & 234881024) == 67108864) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM22097O4 = tj3Var.m22097O();
                if (z10) {
                    zi3Var5 = zi3Var4;
                    objM22097O4 = new C3485q5(zi3Var5, languageProgressMetric, t66Var, 21);
                    tj3Var.m22131l0(objM22097O4);
                } else {
                    zi3Var5 = zi3Var4;
                    objM22097O4 = new C3485q5(zi3Var5, languageProgressMetric, t66Var, 21);
                    tj3Var.m22131l0(objM22097O4);
                }
                vhd.m23289a(jm4Var4, ui3Var9, (vi3) objM22097O4, tj3Var, 48);
                tj3Var.m22139q(false);
            } else {
                zi3Var5 = zi3Var4;
                tj3Var.m22111b0(-612370651);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            i16 = i19;
            zi3Var2 = zi3Var5;
            z5 = z8;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            z5 = z3;
            i16 = i7;
            zi3Var2 = zi3Var;
        }
        z6 = z;
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new oy0(languageProgressMetric, str, languageProgressPeriod, languageStatValue, z6, z5, i16, e16Var, zi3Var2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m4757h(dt0 dt0Var, zi3 zi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(503986782);
        int i2 = (tj3Var.m22120g(dt0Var) ? 4 : 2) | i | (tj3Var.m22124i(zi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            r46.m20381f(null, null, null, null, ci8.m4703P(721626056, new C3180kd(26, dt0Var, zi3Var), tj3Var), tj3Var, 24576, 15);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(dt0Var, i, 21, zi3Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m4758i(String str, String str2, ui3 ui3Var, ye1 ye1Var, int i) {
        str.getClass();
        str2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1869092265);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4429v = c99.m4429v(c99.m4412e(b16Var, 1.0f));
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4429v);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            gc0 gc0Var = nj0.f52811f;
            ci0 ci0Var = ci0.f10109a;
            lw9.m16554b(str, ci0Var.mo3727a(b16Var, gc0Var), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, i2 & 14, 0, 131068);
            tj3Var = tj3Var;
            boolean z = (i2 & 896) == 256;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new xa0(7, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0231g.m1153f(817889280, 380, null, tj3Var, (ui3) objM22097O, ci8.m4703P(-921353620, new iq0(str2, 3), tj3Var), ci0Var.mo3727a(b16Var, nj0.f52816k), new x17(0.0f, 0.0f, 0.0f, 0.0f), null, false);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dp4(str, str2, ui3Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m4759j(String str, ye1 ye1Var, int i) {
        str.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1348135428);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4429v = c99.m4429v(c99.m4412e(b16Var, 1.0f));
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4429v, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38957f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 5);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
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
            e16 e16VarMo3727a = ci0.f10109a.mo3727a(b16Var, nj0.f52811f);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(str, e16VarMo3727a, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, i2 & 14, 0, 131064);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3441oz(str, i, 16);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m4760k(a85 a85Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(735670600);
        int i2 = (tj3Var.m22124i(a85Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            r46.m20381f(null, null, null, null, ci8.m4703P(775009202, new C3180kd(27, a85Var, (Context) tj3Var.m22128k(AbstractC0394f.f4761b)), tj3Var), tj3Var, 24576, 15);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wz2(a85Var, i, 10);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m4761l(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-441435691);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4429v = c99.m4429v(c99.m4412e(b16Var, 1.0f));
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4429v, ((fe9) tj3Var.m22128k(zf1Var)).f38957f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
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
            e16 e16VarM4414g = c99.m4414g(c99.m4426s(b16Var, 120.0f), 24.0f);
            vh9 vh9Var = ps5.f56764b;
            qh0.m19963a(x74.m24341H(pb1.m19045o(e16VarM4414g, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d)), tj3Var, 0);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38956e));
            qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 190.0f), 24.0f), ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d)), tj3Var, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new je1(i, 28);
        }
    }
}
