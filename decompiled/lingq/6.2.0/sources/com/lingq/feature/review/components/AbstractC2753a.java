package com.lingq.feature.review.components;

import android.content.Context;
import android.speech.SpeechRecognizer;
import androidx.compose.animation.core.C0059a;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.viewinterop.AbstractC0443c;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.feature.review.R$string;
import com.lingq.feature.review.data.ReviewCardLayoutStyle;
import kotlin.Pair;
import p000.AbstractC3393o1;
import p000.AbstractC3489q9;
import p000.AbstractC3584sr;
import p000.C3065h7;
import p000.C3537ri;
import p000.C3661uu;
import p000.aa1;
import p000.ab1;
import p000.b16;
import p000.bb1;
import p000.bq1;
import p000.c99;
import p000.cg7;
import p000.ci8;
import p000.cx2;
import p000.d32;
import p000.e16;
import p000.eh0;
import p000.fa4;
import p000.fb2;
import p000.fe9;
import p000.fg8;
import p000.ge9;
import p000.gjc;
import p000.gm5;
import p000.go5;
import p000.hp5;
import p000.ks9;
import p000.l77;
import p000.lc8;
import p000.lda;
import p000.ln0;
import p000.lo6;
import p000.lw9;
import p000.mc8;
import p000.nj0;
import p000.oha;
import p000.omd;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.pc8;
import p000.qc8;
import p000.qj8;
import p000.se1;
import p000.sj8;
import p000.sx7;
import p000.sy7;
import p000.t66;
import p000.te1;
import p000.thb;
import p000.tj3;
import p000.ui3;
import p000.ui8;
import p000.ux5;
import p000.v56;
import p000.vi3;
import p000.vk9;
import p000.vz1;
import p000.wb3;
import p000.we1;
import p000.ws6;
import p000.x18;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.review.components.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2753a {
    /* JADX WARN: Code duplicated, block: B:38:0x01ac  */
    /* JADX INFO: renamed from: a */
    public static final void m9587a(qc8 qc8Var, vi3 vi3Var, boolean z, ye1 ye1Var, int i) {
        b16 b16Var;
        int i2;
        boolean z2;
        String str;
        Pair pair;
        Pair pair2;
        String str2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1516030352);
        int i3 = i | (tj3Var.m22124i(qc8Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var2, 1.0f), ge9.m12515a(tj3Var).f38956e, 0.0f, 2);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (qc8Var.f57579m) {
                tj3Var.m22111b0(1807076245);
                int i4 = pc8.f55950b[qc8Var.f57580n.ordinal()];
                if (i4 == 1) {
                    tj3Var.m22111b0(1807156101);
                    pair = new Pair(vz1.m23620a0(tj3Var, R$string.activities_correct), new aa1(cx2.m9917a(tj3Var).m4212e()));
                    tj3Var.m22139q(false);
                } else if (i4 != 2) {
                    if (i4 == 3) {
                        tj3Var.m22111b0(1807516011);
                        pair = new Pair(vz1.m23620a0(tj3Var, R$string.activities_almost), new aa1(p58.m18900f(tj3Var).f55860j));
                        tj3Var.m22139q(false);
                    } else {
                        if (i4 != 4) {
                            throw ux5.m23001x(tj3Var, -1050085039, false);
                        }
                        tj3Var.m22111b0(-1050066298);
                        tj3Var.m22139q(false);
                        pair2 = new Pair(null, null);
                    }
                    str2 = (String) pair2.f47623a;
                    aa1 aa1Var = (aa1) pair2.f47624b;
                    if (str2 != null || aa1Var == null) {
                        b16Var = b16Var2;
                        i2 = 3;
                        z2 = false;
                        str = null;
                        tj3Var.m22111b0(1807945640);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1807779914);
                        str = null;
                        i2 = 3;
                        z2 = false;
                        b16Var = b16Var2;
                        lw9.m16554b(str2, null, aa1Var.f414a, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 131066);
                        tj3Var = tj3Var;
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(z2);
                } else {
                    tj3Var.m22111b0(1807337637);
                    pair = new Pair(vz1.m23620a0(tj3Var, R$string.activities_incorrect), new aa1(cx2.m9917a(tj3Var).m4215h()));
                    tj3Var.m22139q(false);
                }
                pair2 = pair;
                str2 = (String) pair2.f47623a;
                aa1 aa1Var2 = (aa1) pair2.f47624b;
                if (str2 != null) {
                    b16Var = b16Var2;
                    i2 = 3;
                    z2 = false;
                    str = null;
                    tj3Var.m22111b0(1807945640);
                    tj3Var.m22139q(false);
                } else {
                    b16Var = b16Var2;
                    i2 = 3;
                    z2 = false;
                    str = null;
                    tj3Var.m22111b0(1807945640);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(z2);
            } else {
                i3 = i3;
                b16Var = b16Var2;
                i2 = 3;
                z2 = false;
                str = null;
                tj3Var.m22111b0(1807955560);
                tj3Var.m22139q(false);
            }
            String str3 = qc8Var.f57581o;
            if (str3 == null || vk9.m23391n0(str3)) {
                str3 = str;
            }
            if (str3 == null) {
                tj3Var.m22111b0(1808020008);
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(1808020009);
                tj3 tj3Var2 = tj3Var;
                lw9.m16554b(AbstractC3393o1.m17735j(vz1.m23620a0(tj3Var, R$string.activities_you_answered), ": ", str3), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var2, 0, 0, 131070);
                tj3Var = tj3Var2;
                tj3Var.m22139q(z2);
            }
            String str4 = qc8Var.f57569c;
            String str5 = !vk9.m23391n0(str4) ? str4 : str;
            if (str5 == null) {
                tj3Var.m22111b0(1808292808);
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(1808292809);
                tj3 tj3Var3 = tj3Var;
                lw9.m16554b(str5, c99.m4412e(b16Var, 1.0f), 0L, null, 0L, null, null, 0L, null, new ks9(z ? i2 : 5), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71401e, tj3Var3, 48, 0, 130044);
                tj3Var = tj3Var3;
                tj3Var.m22139q(z2);
            }
            String str6 = qc8Var.f57570d;
            String str7 = (str6 == null || vk9.m23391n0(str6)) ? str : str6;
            if (str7 == null) {
                tj3Var.m22111b0(1808631483);
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(1808631484);
                tj3 tj3Var4 = tj3Var;
                lw9.m16554b(str7, null, p58.m18900f(tj3Var).f55875s, null, 0L, new wb3(1), null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var4, 0, 0, 131034);
                tj3Var = tj3Var4;
                tj3Var.m22139q(z2);
            }
            if (qc8Var.f57574h.isEmpty()) {
                tj3Var.m22111b0(1809406856);
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(1808942693);
                C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(28));
                boolean zM22124i = tj3Var.m22124i(qc8Var) | ((i3 & 112) == 32 ? true : z2);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == we1.f66679a) {
                    objM22097O = new sx7(8, qc8Var, vi3Var);
                    tj3Var.m22131l0(objM22097O);
                }
                fa4.m11643d(null, null, null, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 495);
                tj3Var.m22139q(z2);
            }
            String str8 = qc8Var.f57571e;
            String str9 = (str8 == null || vk9.m23391n0(str8)) ? str : str8;
            if (str9 == null) {
                tj3Var.m22111b0(1809470343);
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(1809470344);
                tj3 tj3Var5 = tj3Var;
                lw9.m16554b(str9, null, cx2.m9917a(tj3Var).m4212e(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71403g, tj3Var5, 0, 0, 131066);
                tj3Var = tj3Var5;
                tj3Var.m22139q(z2);
            }
            String str10 = qc8Var.f57572f;
            String str11 = (str10 == null || vk9.m23391n0(str10)) ? str : str10;
            if (str11 == null) {
                tj3Var.m22111b0(1809745313);
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(1809745314);
                tj3 tj3Var6 = tj3Var;
                lw9.m16554b(str11, null, p58.m18900f(tj3Var).f55875s, null, 0L, new wb3(1), null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var6, 0, 0, 131034);
                tj3Var = tj3Var6;
                tj3Var.m22139q(z2);
            }
            String str12 = qc8Var.f57573g;
            String str13 = (str12 == null || vk9.m23391n0(str12)) ? str : str12;
            if (str13 == null) {
                tj3Var.m22111b0(1810052244);
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(1810052245);
                tj3 tj3Var7 = tj3Var;
                lw9.m16554b(str13, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71409m, tj3Var7, 0, 0, 131070);
                tj3Var = tj3Var7;
                tj3Var.m22139q(z2);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ln0(qc8Var, vi3Var, z, i, 7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9588b(qc8 qc8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        qc8Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1329651531);
        int i2 = (tj3Var.m22124i(qc8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            int i3 = pc8.f55949a[qc8Var.f57567a.ordinal()];
            if (i3 == 1 || i3 == 2) {
                tj3Var.m22111b0(-2105125880);
                m9590d(qc8Var, vi3Var, tj3Var, i2 & 126);
                tj3Var.m22139q(false);
            } else if (i3 == 3) {
                tj3Var.m22111b0(-2105121365);
                m9591e(qc8Var, vi3Var, tj3Var, i2 & 126);
                tj3Var.m22139q(false);
            } else {
                if (i3 != 4) {
                    throw ux5.m23001x(tj3Var, -2105129310, false);
                }
                tj3Var.m22111b0(-2105116823);
                m9592f(qc8Var, vi3Var, tj3Var, i2 & 126);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lc8(qc8Var, vi3Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9589c(boolean z, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        ui3 ui3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1149616654);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, 0.0f, 2);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37237c, nj0.f52817l, tj3Var, 6);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
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
            if (z) {
                tj3Var.m22111b0(-1070467487);
                ui3Var2 = ui3Var;
                omd.m18141c(ui3Var2, null, false, null, null, gjc.f40889d, tj3Var, ((i2 >> 3) & 14) | 1572864, 62);
                tj3Var.m22139q(false);
            } else {
                ui3Var2 = ui3Var;
                tj3Var.m22111b0(-1070191463);
                thb.m22044c(tj3Var, c99.m4422o(b16Var, 48.0f));
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new go5(z, ui3Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9590d(qc8 qc8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1142204057);
        int i2 = (tj3Var.m22124i(qc8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC3489q9.m19771a(0.0f);
                tj3Var.m22131l0(objM22097O);
            }
            C0059a c0059a = (C0059a) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(qc8Var.f57567a);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var = (t66) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC3393o1.m17729d(tj3Var);
            }
            v56 v56Var = (v56) objM22097O3;
            ReviewCardLayoutStyle reviewCardLayoutStyle = qc8Var.f57567a;
            boolean zM22124i = tj3Var.m22124i(qc8Var) | tj3Var.m22124i(c0059a);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i || objM22097O4 == p84Var) {
                objM22097O4 = new ReviewCardSectionsKt$ReviewFlashcardSection$1$1(qc8Var, c0059a, t66Var, null);
                tj3Var.m22131l0(objM22097O4);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O4, reviewCardLayoutStyle);
            e16 e16VarM4410c = c99.m4410c(c99.m4412e(b16.f7762a, 1.0f), 1.0f);
            boolean zM22124i2 = tj3Var.m22124i(c0059a) | tj3Var.m22120g(fb2Var);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O5 == p84Var) {
                objM22097O5 = new sx7(7, c0059a, fb2Var);
                tj3Var.m22131l0(objM22097O5);
            }
            e16 e16VarM19045o = pb1.m19045o(AbstractC0309d.m1406a(e16VarM4410c, (vi3) objM22097O5), ui8.m22753b(20.0f));
            boolean z = qc8Var.f57567a == ReviewCardLayoutStyle.FlashcardFront;
            boolean z2 = (i2 & 112) == 32;
            Object objM22097O6 = tj3Var.m22097O();
            if (z2 || objM22097O6 == p84Var) {
                objM22097O6 = new sy7(vi3Var, 29);
                tj3Var.m22131l0(objM22097O6);
            }
            bq1.m4039O(AbstractC0080f.m814a(e16VarM19045o, v56Var, null, z, null, (ui3) objM22097O6, 24), ui8.m22753b(20.0f), null, te1.m22000n(62, 6.0f), null, ci8.m4703P(-840613707, new mc8(qc8Var, vi3Var, 0), tj3Var), tj3Var, 196608, 20);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lc8(qc8Var, vi3Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9591e(qc8 qc8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1949674336);
        int i2 = (tj3Var.m22124i(qc8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            bq1.m4039O(c99.m4410c(c99.m4412e(b16.f7762a, 1.0f), 1.0f), ui8.m22753b(20.0f), null, te1.m22000n(62, 6.0f), null, ci8.m4703P(1556207954, new mc8(qc8Var, vi3Var, 2), tj3Var), tj3Var, 196614, 20);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lc8(qc8Var, vi3Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9592f(qc8 qc8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1803947593);
        int i2 = (tj3Var.m22124i(qc8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            bq1.m4039O(c99.m4410c(c99.m4412e(b16.f7762a, 1.0f), 1.0f), ui8.m22753b(20.0f), null, te1.m22000n(62, 6.0f), null, ci8.m4703P(-1731653445, new mc8(qc8Var, vi3Var, 1), tj3Var), tj3Var, 196614, 20);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lc8(qc8Var, vi3Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m9593g(fg8 fg8Var, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1290489095);
        int i2 = i | (tj3Var2.m22124i(fg8Var) ? 4 : 2) | (tj3Var2.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            boolean zM22120g = tj3Var2.m22120g(context);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = SpeechRecognizer.createSpeechRecognizer(context);
                tj3Var2.m22131l0(objM22097O);
            }
            SpeechRecognizer speechRecognizer = (SpeechRecognizer) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O2);
            }
            t66 t66Var = (t66) objM22097O2;
            Object objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O3);
            }
            t66 t66Var2 = (t66) objM22097O3;
            C3065h7 c3065h7 = new C3065h7();
            int i3 = i2 & 112;
            boolean zM22124i = (i3 == 32) | tj3Var2.m22124i(context);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22124i || objM22097O4 == p84Var) {
                objM22097O4 = new ws6(vi3Var, context, t66Var, 6);
                tj3Var2.m22131l0(objM22097O4);
            }
            hp5 hp5VarM16109I = lda.m16109I(c3065h7, (vi3) objM22097O4, tj3Var2);
            boolean zM22124i2 = tj3Var2.m22124i(speechRecognizer) | (i3 == 32);
            Object objM22097O5 = tj3Var2.m22097O();
            if (zM22124i2 || objM22097O5 == p84Var) {
                objM22097O5 = new sx7(15, speechRecognizer, vi3Var);
                tj3Var2.m22131l0(objM22097O5);
            }
            d32.m10043i(speechRecognizer, vi3Var, (vi3) objM22097O5, tj3Var2);
            Boolean bool = (Boolean) t66Var.getValue();
            bool.booleanValue();
            String str = fg8Var.f39077a.f68136c;
            String str2 = fg8Var.f39079c;
            boolean zM22124i3 = tj3Var2.m22124i(fg8Var) | tj3Var2.m22124i(speechRecognizer);
            Object objM22097O6 = tj3Var2.m22097O();
            if (zM22124i3 || objM22097O6 == p84Var) {
                objM22097O6 = new ReviewSpeakingSectionKt$ReviewSpeakingSection$2$1(speechRecognizer, t66Var, fg8Var, null);
                tj3Var2.m22131l0(objM22097O6);
            }
            d32.m10051m(bool, str, str2, (zi3) objM22097O6, tj3Var2);
            boolean zM22124i4 = tj3Var2.m22124i(context) | (i3 == 32) | tj3Var2.m22124i(hp5VarM16109I);
            Object objM22097O7 = tj3Var2.m22097O();
            if (zM22124i4 || objM22097O7 == p84Var) {
                C3537ri c3537ri = new C3537ri(7, vi3Var, t66Var2, context, hp5VarM16109I, t66Var);
                tj3Var2.m22131l0(c3537ri);
                objM22097O7 = c3537ri;
            }
            vi3 vi3Var2 = (vi3) objM22097O7;
            boolean zM22124i5 = tj3Var2.m22124i(fg8Var);
            Object objM22097O8 = tj3Var2.m22097O();
            if (zM22124i5 || objM22097O8 == p84Var) {
                objM22097O8 = new cg7(fg8Var, 11);
                tj3Var2.m22131l0(objM22097O8);
            }
            tj3Var = tj3Var2;
            AbstractC0443c.m1891b(vi3Var2, e16Var, (vi3) objM22097O8, tj3Var, 48, 0);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 14, fg8Var, vi3Var, e16Var);
        }
    }
}
