package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.feature.token.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t7d {
    /* JADX INFO: renamed from: a */
    public static final void m21896a(e16 e16Var, final TokenMeaning tokenMeaning, final boolean z, final boolean z2, final ui3 ui3Var, ye1 ye1Var, final int i, final int i2) {
        e16 e16Var2;
        int i3;
        final e16 e16Var3;
        String strM23620a0;
        boolean z3;
        vx9 vx9VarM23583a;
        long j;
        long jM4209b;
        tokenMeaning.getClass();
        String str = tokenMeaning.f19595b;
        int i4 = tokenMeaning.f19594a;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-990228063);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            e16Var2 = e16Var;
        } else if ((i & 6) == 0) {
            e16Var2 = e16Var;
            i3 = (tj3Var.m22120g(e16Var2) ? 4 : 2) | i;
        } else {
            e16Var2 = e16Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(tokenMeaning) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22122h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22122h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 16384 : 8192;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            b16 b16Var = b16.f7762a;
            e16 e16Var4 = i5 != 0 ? b16Var : e16Var2;
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(e16Var4, 1.0f), 15), ge9.m12515a(tj3Var).f38956e, ge9.m12515a(tj3Var).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (i4 == -1) {
                tj3Var.m22111b0(2102910657);
                strM23620a0 = vz1.m23620a0(tj3Var, R$string.loading_cwt);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2103002045);
                strM23620a0 = tokenMeaning.f19596c;
                if (strM23620a0 == null) {
                    tj3Var.m22111b0(1591859925);
                    strM23620a0 = vz1.m23620a0(tj3Var, R$string.lesson_no_translation_available);
                } else {
                    tj3Var.m22111b0(1591859429);
                }
                tj3Var.m22139q(false);
                tj3Var.m22139q(false);
            }
            e16 e16VarM21609V = AbstractC3584sr.m21609V(new as4(1.0f, true), 0.0f, ge9.m12515a(tj3Var).f38955d, 1);
            if (i4 == -1) {
                tj3Var.m22111b0(2103270009);
                vx9VarM23583a = vx9.m23583a(p58.m18902j(tj3Var).f71406j, AbstractC1899b.m8704m(tj3Var), new wb3(1), 33554414);
                z3 = false;
                tj3Var.m22139q(false);
            } else {
                z3 = false;
                tj3Var.m22111b0(1591872422);
                vx9VarM23583a = p58.m18902j(tj3Var).f71406j;
                tj3Var.m22139q(false);
            }
            vx9 vx9Var = vx9VarM23583a;
            if (i4 == -1) {
                tj3Var.m22111b0(1591875341);
                j = p58.m18900f(tj3Var).f55875s;
            } else {
                tj3Var.m22111b0(1591876870);
                j = p58.m18900f(tj3Var).f55873q;
            }
            tj3Var.m22139q(z3);
            boolean z4 = z3;
            e16 e16Var5 = e16Var4;
            lw9.m16554b(strM23620a0, e16VarM21609V, j, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, vx9Var, tj3Var, 0, 24960, 110584);
            tj3Var = tj3Var;
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38955d));
            if (m21898c(tokenMeaning)) {
                tj3Var.m22111b0(2103742945);
                ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_ai, tj3Var, z4 ? 1 : 0), vz1.m23620a0(tj3Var, R$string.token_ai_generated), AbstractC3584sr.m21611X(c99.m4422o(b16Var, 24.0f), 0.0f, 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 11), p58.m18900f(tj3Var).f55852f, tj3Var, 8, 0);
                tj3Var.m22139q(z4);
            } else {
                tj3Var.m22111b0(2104115813);
                tj3Var.m22139q(z4);
            }
            if (z2) {
                tj3Var.m22111b0(2104152827);
                boolean zM22120g = tj3Var.m22120g(str);
                Object objM22097O = tj3Var.m22097O();
                if (zM22120g || objM22097O == we1.f66679a) {
                    objM22097O = Integer.valueOf(abd.m249e(R$drawable.ic_none, context, str));
                    tj3Var.m22131l0(objM22097O);
                }
                int iIntValue = ((Number) objM22097O).intValue();
                if (iIntValue != 0) {
                    tj3Var.m22111b0(2104273603);
                    bq1.m4042R(AbstractC3423or.m18236U(iIntValue, tj3Var, z4 ? 1 : 0), tokenMeaning.f19595b, c99.m4422o(b16Var, 20.0f), null, null, 0.0f, null, tj3Var, 392, 120);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(z4);
                } else {
                    tj3Var.m22111b0(2104490789);
                    tj3Var.m22139q(z4);
                }
                tj3Var.m22139q(z4);
            } else {
                tj3Var.m22111b0(2104532515);
                y27 y27VarM18236U = AbstractC3423or.m18236U(z ? com.lingq.core.designsystem.R$drawable.ic_lingq : R$drawable.ic_plus_s, tj3Var, z4 ? 1 : 0);
                String str2 = z ? "Saved" : "Add";
                if (z) {
                    tj3Var.m22111b0(1591916994);
                    jM4209b = cx2.m9917a(tj3Var).m4212e();
                } else {
                    tj3Var.m22111b0(1591918439);
                    jM4209b = cx2.m9917a(tj3Var).m4209b();
                }
                tj3Var.m22139q(z4);
                ty3.m22352b(y27VarM18236U, str2, c99.m4422o(b16Var, 20.0f), jM4209b, tj3Var, 392, 0);
                tj3Var.m22139q(z4);
            }
            tj3Var.m22139q(true);
            e16Var3 = e16Var5;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: a51
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t7d.m21896a(e16Var3, tokenMeaning, z, z2, ui3Var, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m21897b(List list) {
        list.getClass();
        return u91.m22596N0(list, "; ", null, null, new ow8(11), 30);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m21898c(TokenMeaning tokenMeaning) {
        tokenMeaning.getClass();
        return tokenMeaning.f19594a == -33;
    }

    /* JADX INFO: renamed from: d */
    public static final String m21899d(List list) {
        list.getClass();
        return u91.m22596N0(list, " ", null, null, new ow8(12), 30);
    }
}
