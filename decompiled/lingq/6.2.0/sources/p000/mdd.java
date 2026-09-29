package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.reader.R$string;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mdd {
    /* JADX INFO: renamed from: a */
    public static final void m16791a(boolean z, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1747525310);
        int i2 = (tj3Var2.m22122h(z) ? 4 : 2) | i | (tj3Var2.m22124i(ui3Var) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        if (!tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        } else {
            if (!z) {
                x18 x18VarM22143u = tj3Var2.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new y53(z, ui3Var, i, i3);
                    return;
                }
                return;
            }
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c(ui3Var, null, AbstractC0231g.m1154g(true, tj3Var2, 6, 2), 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(1743206048, new ze2(i4, ui3Var), tj3Var2), tj3Var, (i2 >> 3) & 14, 3072, 8186);
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            x18VarM22143u2.f67642d = new y53(z, ui3Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m16792b(int i, ye1 ye1Var, ui3 ui3Var) {
        long j;
        ui3 ui3Var2 = ui3Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-868867339);
        char c = 2;
        int i2 = i | (tj3Var.m22124i(ui3Var2) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            vh9 vh9Var = cx2.f34676a;
            long jM4209b = ((bx2) tj3Var.m22128k(vh9Var)).m4209b();
            long jM4218k = ((bx2) tj3Var.m22128k(vh9Var)).m4218k();
            b16 b16Var = b16.f7762a;
            e16 e16VarM22066y = thb.m22066y(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38960i, 0.0f, 2));
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM22066y);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.tooltips_first_lingq_congrats);
            long j2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55852f;
            C3341mn c3341mn = new C3341mn();
            while (true) {
                if (!vk9.m23380c0(strM23620a0, "**", false)) {
                    c3341mn.m16929d(strM23620a0);
                    break;
                }
                int iM23389l0 = vk9.m23389l0(strM23620a0, "**", 0, false, 6);
                char c2 = c;
                c3341mn.m16929d(strM23620a0.substring(0, iM23389l0));
                String strSubstring = strM23620a0.substring(iM23389l0 + 2);
                int iM23389l1 = vk9.m23389l0(strSubstring, "**", 0, false, 6);
                if (iM23389l1 < 0) {
                    c3341mn.m16929d(strSubstring);
                    break;
                }
                long j3 = j2;
                int iM16932g = c3341mn.m16932g(new he9(j3, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
                try {
                    c3341mn.m16929d(strSubstring.substring(0, iM23389l1));
                    c3341mn.m16931f(iM16932g);
                    strM23620a0 = strSubstring.substring(iM23389l1 + 2);
                    c = c2;
                    j2 = j3;
                } catch (Throwable th) {
                    c3341mn.m16931f(iM16932g);
                    throw th;
                }
            }
            lw9.m16555c(c3341mn.m16933h(), c99.m4412e(b16Var, 1.0f), 0L, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71402f, tj3Var, 48, 0, 261116);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f));
            String strM23620a1 = vz1.m23620a0(tj3Var, R$string.tooltips_first_lingq_blue);
            C3341mn c3341mn2 = new C3341mn();
            int i3 = 0;
            while (i3 < strM23620a1.length()) {
                if (cl9.m4841X(strM23620a1, i3, "**", false)) {
                    int i4 = i3 + 2;
                    int iM23389l2 = vk9.m23389l0(strM23620a1, "**", i4, false, 4);
                    if (iM23389l2 < 0) {
                        c3341mn2.m16929d(strM23620a1.substring(i3));
                        break;
                    }
                    j = jM4218k;
                    int iM16932g2 = c3341mn2.m16932g(new he9(jM4218k, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
                    try {
                        c3341mn2.m16929d(strM23620a1.substring(i4, iM23389l2));
                        c3341mn2.m16931f(iM16932g2);
                        i3 = iM23389l2 + 2;
                        jM4218k = j;
                    } catch (Throwable th2) {
                        c3341mn2.m16931f(iM16932g2);
                        throw th2;
                    }
                } else {
                    j = jM4218k;
                    if (strM23620a1.charAt(i3) == '*') {
                        int i5 = i3 + 1;
                        int iM23388k0 = vk9.m23388k0(strM23620a1, '*', i5, 4);
                        if (iM23388k0 < 0) {
                            c3341mn2.m16929d(strM23620a1.substring(i3));
                            break;
                        }
                        int iM16932g3 = c3341mn2.m16932g(new he9(jM4209b, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
                        try {
                            c3341mn2.m16929d(strM23620a1.substring(i5, iM23388k0));
                            c3341mn2.m16931f(iM16932g3);
                            i3 = iM23388k0 + 1;
                        } catch (Throwable th3) {
                            c3341mn2.m16931f(iM16932g3);
                            throw th3;
                        }
                    } else {
                        int iM23388k1 = vk9.m23388k0(strM23620a1, '*', i3, 4);
                        Integer numValueOf = Integer.valueOf(iM23388k1);
                        if (iM23388k1 < 0) {
                            numValueOf = null;
                        }
                        int iIntValue = numValueOf != null ? numValueOf.intValue() : strM23620a1.length();
                        c3341mn2.m16929d(strM23620a1.substring(i3, iIntValue));
                        i3 = iIntValue;
                    }
                    jM4218k = j;
                }
            }
            lw9.m16555c(c3341mn2.m16933h(), AbstractC3584sr.m21609V(b16Var, 0.0f, ge9.m12515a(tj3Var).f38952a, 1), 0L, null, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 262140);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.tooltips_first_lingq_means), AbstractC3584sr.m21609V(b16Var, 0.0f, ge9.m12515a(tj3Var).f38952a, 1), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 131068);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.tooltips_first_lingq_encounter), AbstractC3584sr.m21609V(b16Var, 0.0f, ge9.m12515a(tj3Var).f38952a, 1), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 131068);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.tooltips_first_lingq_reading), AbstractC3584sr.m21609V(b16Var, 0.0f, ge9.m12515a(tj3Var).f38952a, 1), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 131068);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.tooltips_first_lingq_highlight), AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var).f38957f, 1), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 130044);
            ui3Var2 = ui3Var;
            tj3Var = tj3Var;
            AbstractC0231g.m1148a(ui3Var2, AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), false, null, null, null, null, null, cqb.f34394a, tj3Var, (i2 & 14) | 805306368, 508);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C0839c9(i, 8, ui3Var2);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo4332c(Exception exc);
}
