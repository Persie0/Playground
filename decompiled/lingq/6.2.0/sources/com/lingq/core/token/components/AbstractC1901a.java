package com.lingq.core.token.components;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.token.components.AbstractC1901a;
import com.lingq.feature.token.R$string;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.C3288l7;
import p000.abd;
import p000.as4;
import p000.b16;
import p000.bna;
import p000.bq1;
import p000.c99;
import p000.d32;
import p000.e16;
import p000.eh0;
import p000.eu9;
import p000.ge9;
import p000.l77;
import p000.lh7;
import p000.mkd;
import p000.nj0;
import p000.oha;
import p000.p04;
import p000.p58;
import p000.p84;
import p000.q6d;
import p000.qj8;
import p000.se1;
import p000.sj8;
import p000.ss5;
import p000.t66;
import p000.thb;
import p000.tj3;
import p000.ty3;
import p000.ui3;
import p000.vi3;
import p000.vv9;
import p000.vx9;
import p000.vz1;
import p000.we1;
import p000.ws6;
import p000.x18;
import p000.y27;
import p000.yad;
import p000.ye1;
import p000.z93;
import p000.zg0;
import p000.zi3;
import p000.zjc;

/* JADX INFO: renamed from: com.lingq.core.token.components.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1901a {
    /* JADX WARN: Code duplicated, block: B:118:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:121:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:126:0x0315  */
    /* JADX WARN: Code duplicated, block: B:127:0x0317  */
    /* JADX WARN: Code duplicated, block: B:131:0x0325  */
    /* JADX WARN: Code duplicated, block: B:133:0x034f  */
    /* JADX WARN: Code duplicated, block: B:135:0x035d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0397  */
    /* JADX WARN: Code duplicated, block: B:139:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:147:0x040a  */
    /* JADX INFO: renamed from: a */
    public static final void m8709a(final TokenMeaning tokenMeaning, final boolean z, boolean z2, boolean z3, final zi3 zi3Var, final vi3 vi3Var, final vi3 vi3Var2, ui3 ui3Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        int i5;
        tj3 tj3Var;
        final boolean z5;
        final ui3 ui3Var2;
        final boolean z6;
        ui3 ui3Var3;
        t66 t66Var;
        p84 p84Var;
        boolean z7;
        boolean z8;
        boolean zM22124i;
        Object objM22097O;
        boolean zM22120g;
        Object objM22097O2;
        int iIntValue;
        boolean z9;
        boolean zM22124i2;
        Object objM22097O3;
        String str = tokenMeaning.f19595b;
        zi3Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(294511954);
        int i6 = (tj3Var2.m22124i(tokenMeaning) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i6 |= tj3Var2.m22122h(z) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | 384;
        } else {
            i3 = i6 | (tj3Var2.m22122h(z2) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i3 | 3072;
            z4 = z3;
        } else {
            z4 = z3;
            i4 = i3 | (tj3Var2.m22122h(z4) ? 2048 : 1024);
        }
        if ((i & 24576) == 0) {
            i4 |= tj3Var2.m22124i(zi3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= tj3Var2.m22124i(vi3Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= tj3Var2.m22124i(vi3Var2) ? 1048576 : 524288;
        }
        int i9 = i2 & 128;
        if (i9 != 0) {
            i5 = i4 | 12582912;
        } else {
            i5 = i4 | (tj3Var2.m22124i(ui3Var) ? 8388608 : 4194304);
        }
        if (tj3Var2.m22099R(i5 & 1, (i5 & 4793491) != 4793490)) {
            boolean z10 = i7 != 0 ? false : z2;
            boolean z11 = i8 != 0 ? false : z4;
            p84 p84Var2 = we1.f66679a;
            if (i9 != 0) {
                Object objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == p84Var2) {
                    objM22097O4 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O4);
                }
                ui3Var3 = (ui3) objM22097O4;
            } else {
                ui3Var3 = ui3Var;
            }
            boolean zM22116e = tj3Var2.m22116e(tokenMeaning.f19594a);
            Object objM22097O5 = tj3Var2.m22097O();
            if (zM22116e || objM22097O5 == p84Var2) {
                String str2 = tokenMeaning.f19596c;
                if (str2 == null) {
                    str2 = "";
                }
                objM22097O5 = AbstractC0278f.m1260j(new vv9(str2, 6, 0L));
                tj3Var2.m22131l0(objM22097O5);
            }
            t66 t66Var2 = (t66) objM22097O5;
            InterfaceC0300b interfaceC0300b = (InterfaceC0300b) tj3Var2.m22128k(AbstractC0402n.f4817i);
            Object objM22097O6 = tj3Var2.m22097O();
            if (objM22097O6 == p84Var2) {
                objM22097O6 = new z93();
                tj3Var2.m22131l0(objM22097O6);
            }
            z93 z93Var = (z93) objM22097O6;
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            Boolean boolValueOf = Boolean.valueOf(z11);
            boolean z12 = z10;
            boolean zM22120g2 = ((i5 & 7168) == 2048) | tj3Var2.m22120g(t66Var2) | ((29360128 & i5) == 8388608);
            Object objM22097O7 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O7 == p84Var2) {
                t66Var = t66Var2;
                objM22097O7 = new SavedMeaningItemKt$SavedMeaningItem$2$1(z11, z93Var, ui3Var3, t66Var, null);
                tj3Var2.m22131l0(objM22097O7);
            } else {
                t66Var = t66Var2;
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O7, boolValueOf);
            b16 b16Var = b16.f7762a;
            boolean z13 = z11;
            int i10 = i5;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(d32.m10007D(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var2).f38965n, 0.0f, 2), p58.m18900f(tj3Var2).f55821F, ss5.f61356d), 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38952a, 0.0f, 11);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var2, 48);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
            se1.f60731q.getClass();
            ui3 ui3Var4 = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var4);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            vv9 vv9Var = (vv9) t66Var.getValue();
            e16 e16VarM3924M = bna.m3924M(new as4(1.0f, true), z93Var);
            vx9 vx9Var = p58.m18902j(tj3Var2).f71406j;
            t66 t66Var3 = t66Var;
            eu9 eu9VarM16905h = mkd.m16905h(0L, p58.m18900f(tj3Var2).f55821F, 0L, p58.m18900f(tj3Var2).f55821F, 0L, tj3Var2, 2147479519);
            boolean zM22120g3 = ((i10 & 57344) == 16384) | tj3Var2.m22120g(t66Var3) | tj3Var2.m22124i(tokenMeaning);
            Object objM22097O8 = tj3Var2.m22097O();
            if (zM22120g3) {
                p84Var = p84Var2;
            } else {
                p84Var = p84Var2;
                if (objM22097O8 == p84Var) {
                }
                q6d.m19685b(vv9Var, (vi3) objM22097O8, e16VarM3924M, false, vx9Var, zjc.f71663a, null, null, null, null, false, 5, 0, null, eu9VarM16905h, tj3Var2, 12582912, 113246208, 3800920);
                tj3Var = tj3Var2;
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38955d));
                if (z) {
                    tj3Var.m22111b0(831863565);
                    zM22120g = tj3Var.m22120g(str);
                    objM22097O2 = tj3Var.m22097O();
                    if (zM22120g || objM22097O2 == p84Var) {
                        objM22097O2 = Integer.valueOf(abd.m249e(R$drawable.ic_none, context, str));
                        tj3Var.m22131l0(objM22097O2);
                    }
                    iIntValue = ((Number) objM22097O2).intValue();
                    if (iIntValue != 0) {
                        tj3Var.m22111b0(831984341);
                        z7 = false;
                        y27 y27VarM18236U = AbstractC3423or.m18236U(iIntValue, tj3Var, 0);
                        String str3 = tokenMeaning.f19595b;
                        e16 e16VarM4422o = c99.m4422o(AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var).f38955d), 20.0f);
                        if ((i10 & 458752) == 131072) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        zM22124i2 = z9 | tj3Var.m22124i(tokenMeaning);
                        objM22097O3 = tj3Var.m22097O();
                        if (zM22124i2 || objM22097O3 == p84Var) {
                            objM22097O3 = new lh7(vi3Var, tokenMeaning, 2);
                            tj3Var.m22131l0(objM22097O3);
                        }
                        bq1.m4042R(y27VarM18236U, str3, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, e16VarM4422o, 15), null, null, 0.0f, null, tj3Var, 8, 120);
                        tj3Var = tj3Var;
                        tj3Var.m22139q(false);
                    } else {
                        z7 = false;
                        tj3Var.m22111b0(832344716);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(z7);
                } else {
                    z7 = false;
                    tj3Var.m22111b0(832385791);
                    ty3.m22352b(AbstractC3423or.m18236U(com.lingq.core.designsystem.R$drawable.ic_lingq, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.meanings_saved), c99.m4422o(AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var).f38955d), 20.0f), p58.m18900f(tj3Var).f55852f, tj3Var, 8, 0);
                    tj3Var.m22139q(false);
                }
                if (z12) {
                    tj3Var = tj3Var;
                    tj3Var.m22111b0(832790341);
                    thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                    p04 p04VarM25022a = yad.m25022a();
                    String strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_delete);
                    long j = p58.m18900f(tj3Var).f55852f;
                    e16 e16VarM4422o2 = c99.m4422o(AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var).f38955d), 24.0f);
                    if ((i10 & 3670016) == 1048576) {
                        z8 = true;
                    } else {
                        z8 = z7;
                    }
                    zM22124i = z8 | tj3Var.m22124i(tokenMeaning) | tj3Var.m22124i(interfaceC0300b);
                    objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new zg0(vi3Var2, tokenMeaning, interfaceC0300b, 29);
                        tj3Var.m22131l0(objM22097O);
                    }
                    tj3 tj3Var3 = tj3Var;
                    ty3.m22351a(p04VarM25022a, strM23620a0, AbstractC0080f.m815b(null, z7, (ui3) objM22097O, e16VarM4422o2, 15), j, tj3Var3, 0, 0);
                    tj3Var = tj3Var3;
                    tj3Var.m22139q(z7);
                } else {
                    tj3Var = tj3Var;
                    tj3Var.m22111b0(833350604);
                    tj3Var.m22139q(z7);
                }
                tj3Var.m22139q(true);
                z6 = z13;
                z5 = z12;
                ui3Var2 = ui3Var3;
            }
            objM22097O8 = new ws6(zi3Var, tokenMeaning, t66Var3, 7);
            tj3Var2.m22131l0(objM22097O8);
            q6d.m19685b(vv9Var, (vi3) objM22097O8, e16VarM3924M, false, vx9Var, zjc.f71663a, null, null, null, null, false, 5, 0, null, eu9VarM16905h, tj3Var2, 12582912, 113246208, 3800920);
            tj3Var = tj3Var2;
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38955d));
            if (z) {
                tj3Var.m22111b0(831863565);
                zM22120g = tj3Var.m22120g(str);
                objM22097O2 = tj3Var.m22097O();
                if (zM22120g) {
                    objM22097O2 = Integer.valueOf(abd.m249e(R$drawable.ic_none, context, str));
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = Integer.valueOf(abd.m249e(R$drawable.ic_none, context, str));
                    tj3Var.m22131l0(objM22097O2);
                }
                iIntValue = ((Number) objM22097O2).intValue();
                if (iIntValue != 0) {
                    tj3Var.m22111b0(831984341);
                    z7 = false;
                    y27 y27VarM18236U2 = AbstractC3423or.m18236U(iIntValue, tj3Var, 0);
                    String str4 = tokenMeaning.f19595b;
                    e16 e16VarM4422o3 = c99.m4422o(AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var).f38955d), 20.0f);
                    if ((i10 & 458752) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zM22124i2 = z9 | tj3Var.m22124i(tokenMeaning);
                    objM22097O3 = tj3Var.m22097O();
                    if (zM22124i2) {
                        objM22097O3 = new lh7(vi3Var, tokenMeaning, 2);
                        tj3Var.m22131l0(objM22097O3);
                    } else {
                        objM22097O3 = new lh7(vi3Var, tokenMeaning, 2);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    bq1.m4042R(y27VarM18236U2, str4, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, e16VarM4422o3, 15), null, null, 0.0f, null, tj3Var, 8, 120);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } else {
                    z7 = false;
                    tj3Var.m22111b0(832344716);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(z7);
            } else {
                z7 = false;
                tj3Var.m22111b0(832385791);
                ty3.m22352b(AbstractC3423or.m18236U(com.lingq.core.designsystem.R$drawable.ic_lingq, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.meanings_saved), c99.m4422o(AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var).f38955d), 20.0f), p58.m18900f(tj3Var).f55852f, tj3Var, 8, 0);
                tj3Var.m22139q(false);
            }
            if (z12) {
                tj3Var = tj3Var;
                tj3Var.m22111b0(832790341);
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                p04 p04VarM25022a2 = yad.m25022a();
                String strM23620a1 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_delete);
                long j2 = p58.m18900f(tj3Var).f55852f;
                e16 e16VarM4422o4 = c99.m4422o(AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var).f38955d), 24.0f);
                if ((i10 & 3670016) == 1048576) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                zM22124i = z8 | tj3Var.m22124i(tokenMeaning) | tj3Var.m22124i(interfaceC0300b);
                objM22097O = tj3Var.m22097O();
                if (zM22124i) {
                    objM22097O = new zg0(vi3Var2, tokenMeaning, interfaceC0300b, 29);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new zg0(vi3Var2, tokenMeaning, interfaceC0300b, 29);
                    tj3Var.m22131l0(objM22097O);
                }
                tj3 tj3Var4 = tj3Var;
                ty3.m22351a(p04VarM25022a2, strM23620a1, AbstractC0080f.m815b(null, z7, (ui3) objM22097O, e16VarM4422o4, 15), j2, tj3Var4, 0, 0);
                tj3Var = tj3Var4;
                tj3Var.m22139q(z7);
            } else {
                tj3Var = tj3Var;
                tj3Var.m22111b0(833350604);
                tj3Var.m22139q(z7);
            }
            tj3Var.m22139q(true);
            z6 = z13;
            z5 = z12;
            ui3Var2 = ui3Var3;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            z5 = z2;
            ui3Var2 = ui3Var;
            z6 = z4;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ml8
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1901a.m8709a(tokenMeaning, z, z5, z6, zi3Var, vi3Var, vi3Var2, ui3Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }
}
