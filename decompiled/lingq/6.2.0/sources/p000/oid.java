package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.premium.R$drawable;
import com.lingq.core.premium.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oid {
    /* JADX WARN: Code duplicated, block: B:43:0x0167  */
    /* JADX WARN: Code duplicated, block: B:44:0x016b  */
    /* JADX INFO: renamed from: a */
    public static final void m18036a(UpgradeReason upgradeReason, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        uw4 uw4Var;
        uw4 uw4Var2;
        ui3 ui3Var2;
        upgradeReason.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1792358991);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22116e(upgradeReason.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        int i3 = i & 384;
        b16 b16Var = b16.f7762a;
        if (i3 == 0) {
            i2 |= tj3Var.m22120g(b16Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.upgrade_go_premium);
            String strM23620a1 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.upgrade_go_premium_now);
            switch (bx4.f9132a[upgradeReason.ordinal()]) {
                case 1:
                    tj3Var.m22111b0(330498628);
                    uw4Var = new uw4(strM23620a0, vz1.m23620a0(tj3Var, R$string.upgrade_to_complete_challenges), strM23620a1);
                    tj3Var.m22139q(false);
                    uw4Var2 = uw4Var;
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    ec0 ec0Var = nj0.f52792K;
                    zf1 zf1Var = ge9.f40637a;
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), ec0Var, tj3Var, 48);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
                    se1.f60731q.getClass();
                    ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_upgrade_crown, tj3Var, 0), null, AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 7), aa1.f412k, tj3Var, 3128, 0);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(uw4Var2.f64464a, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 0, 0, 130046);
                    lw9.m16554b(uw4Var2.f64465b, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 0, 0, 130046);
                    tj3Var = tj3Var;
                    ss5.m21710f(AbstractC3584sr.m21611X(b16Var, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 0.0f, 0.0f, 13), null, null, false, ui3Var, ci8.m4703P(977778043, new se0(uw4Var2, 16), tj3Var), tj3Var, ((i2 << 9) & 57344) | 196608, 14);
                    tj3Var.m22139q(true);
                    break;
                case 2:
                    tj3Var.m22111b0(330504480);
                    uw4Var = new uw4(strM23620a0, vz1.m23620a0(tj3Var, R$string.upgrade_multiple_playlists), strM23620a1);
                    tj3Var.m22139q(false);
                    uw4Var2 = uw4Var;
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    ec0 ec0Var2 = nj0.f52792K;
                    zf1 zf1Var2 = ge9.f40637a;
                    bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var2)).f38952a, true, new gm5(28)), ec0Var2, tj3Var, 48);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
                    se1.f60731q.getClass();
                    ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a2);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_upgrade_crown, tj3Var, 0), null, AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var2)).f38952a, 7), aa1.f412k, tj3Var, 3128, 0);
                    vh9 vh9Var2 = ps5.f56764b;
                    lw9.m16554b(uw4Var2.f64464a, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var2)).f51800b.f71404h, tj3Var, 0, 0, 130046);
                    lw9.m16554b(uw4Var2.f64465b, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var2)).f51800b.f71407k, tj3Var, 0, 0, 130046);
                    tj3Var = tj3Var;
                    ss5.m21710f(AbstractC3584sr.m21611X(b16Var, 0.0f, ((fe9) tj3Var.m22128k(zf1Var2)).f38952a, 0.0f, 0.0f, 13), null, null, false, ui3Var, ci8.m4703P(977778043, new se0(uw4Var2, 16), tj3Var), tj3Var, ((i2 << 9) & 57344) | 196608, 14);
                    tj3Var.m22139q(true);
                    break;
                case 3:
                    tj3Var.m22111b0(330510298);
                    uw4Var = new uw4(strM23620a0, vz1.m23620a0(tj3Var, R$string.upgrade_generate_tts), strM23620a1);
                    tj3Var.m22139q(false);
                    uw4Var2 = uw4Var;
                    e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                    ec0 ec0Var3 = nj0.f52792K;
                    zf1 zf1Var3 = ge9.f40637a;
                    bb1 bb1VarM230a3 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var3)).f38952a, true, new gm5(28)), ec0Var3, tj3Var, 48);
                    int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m3 = tj3Var.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e3);
                    se1.f60731q.getClass();
                    ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a3);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c3);
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_upgrade_crown, tj3Var, 0), null, AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var3)).f38952a, 7), aa1.f412k, tj3Var, 3128, 0);
                    vh9 vh9Var3 = ps5.f56764b;
                    lw9.m16554b(uw4Var2.f64464a, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var3)).f51800b.f71404h, tj3Var, 0, 0, 130046);
                    lw9.m16554b(uw4Var2.f64465b, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var3)).f51800b.f71407k, tj3Var, 0, 0, 130046);
                    tj3Var = tj3Var;
                    ss5.m21710f(AbstractC3584sr.m21611X(b16Var, 0.0f, ((fe9) tj3Var.m22128k(zf1Var3)).f38952a, 0.0f, 0.0f, 13), null, null, false, ui3Var, ci8.m4703P(977778043, new se0(uw4Var2, 16), tj3Var), tj3Var, ((i2 << 9) & 57344) | 196608, 14);
                    tj3Var.m22139q(true);
                    break;
                case 4:
                    tj3Var.m22111b0(330515785);
                    uw4Var = new uw4(strM23620a0, vz1.m23620a0(tj3Var, R$string.upgrade_reason_explain_premium_desc), strM23620a1);
                    tj3Var.m22139q(false);
                    uw4Var2 = uw4Var;
                    e16 e16VarM4412e4 = c99.m4412e(b16Var, 1.0f);
                    ec0 ec0Var4 = nj0.f52792K;
                    zf1 zf1Var4 = ge9.f40637a;
                    bb1 bb1VarM230a4 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var4)).f38952a, true, new gm5(28)), ec0Var4, tj3Var, 48);
                    int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m4 = tj3Var.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e4);
                    se1.f60731q.getClass();
                    ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a4);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m4);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode4));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c4);
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_upgrade_crown, tj3Var, 0), null, AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var4)).f38952a, 7), aa1.f412k, tj3Var, 3128, 0);
                    vh9 vh9Var4 = ps5.f56764b;
                    lw9.m16554b(uw4Var2.f64464a, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var4)).f51800b.f71404h, tj3Var, 0, 0, 130046);
                    lw9.m16554b(uw4Var2.f64465b, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var4)).f51800b.f71407k, tj3Var, 0, 0, 130046);
                    tj3Var = tj3Var;
                    ss5.m21710f(AbstractC3584sr.m21611X(b16Var, 0.0f, ((fe9) tj3Var.m22128k(zf1Var4)).f38952a, 0.0f, 0.0f, 13), null, null, false, ui3Var, ci8.m4703P(977778043, new se0(uw4Var2, 16), tj3Var), tj3Var, ((i2 << 9) & 57344) | 196608, 14);
                    tj3Var.m22139q(true);
                    break;
                case 5:
                    tj3Var.m22111b0(330521736);
                    uw4Var2 = new uw4(vz1.m23620a0(tj3Var, R$string.upgrade_reason_voices_title), vz1.m23620a0(tj3Var, R$string.upgrade_reason_voices_desc), strM23620a1);
                    tj3Var.m22139q(false);
                    e16 e16VarM4412e5 = c99.m4412e(b16Var, 1.0f);
                    ec0 ec0Var5 = nj0.f52792K;
                    zf1 zf1Var5 = ge9.f40637a;
                    bb1 bb1VarM230a5 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var5)).f38952a, true, new gm5(28)), ec0Var5, tj3Var, 48);
                    int iHashCode5 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m5 = tj3Var.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e5);
                    se1.f60731q.getClass();
                    ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a5);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m5);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode5));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c5);
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_upgrade_crown, tj3Var, 0), null, AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var5)).f38952a, 7), aa1.f412k, tj3Var, 3128, 0);
                    vh9 vh9Var5 = ps5.f56764b;
                    lw9.m16554b(uw4Var2.f64464a, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var5)).f51800b.f71404h, tj3Var, 0, 0, 130046);
                    lw9.m16554b(uw4Var2.f64465b, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var5)).f51800b.f71407k, tj3Var, 0, 0, 130046);
                    tj3Var = tj3Var;
                    ss5.m21710f(AbstractC3584sr.m21611X(b16Var, 0.0f, ((fe9) tj3Var.m22128k(zf1Var5)).f38952a, 0.0f, 0.0f, 13), null, null, false, ui3Var, ci8.m4703P(977778043, new se0(uw4Var2, 16), tj3Var), tj3Var, ((i2 << 9) & 57344) | 196608, 14);
                    tj3Var.m22139q(true);
                    break;
                case 6:
                    tj3Var.m22111b0(330528920);
                    uw4Var2 = new uw4(vz1.m23620a0(tj3Var, R$string.upgrade_reason_voices_premium_title), vz1.m23620a0(tj3Var, R$string.upgrade_reason_voices_premium_desc), strM23620a1);
                    tj3Var.m22139q(false);
                    e16 e16VarM4412e6 = c99.m4412e(b16Var, 1.0f);
                    ec0 ec0Var6 = nj0.f52792K;
                    zf1 zf1Var6 = ge9.f40637a;
                    bb1 bb1VarM230a6 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var6)).f38952a, true, new gm5(28)), ec0Var6, tj3Var, 48);
                    int iHashCode6 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m6 = tj3Var.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e6);
                    se1.f60731q.getClass();
                    ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a6);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m6);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode6));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c6);
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_upgrade_crown, tj3Var, 0), null, AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var6)).f38952a, 7), aa1.f412k, tj3Var, 3128, 0);
                    vh9 vh9Var6 = ps5.f56764b;
                    lw9.m16554b(uw4Var2.f64464a, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var6)).f51800b.f71404h, tj3Var, 0, 0, 130046);
                    lw9.m16554b(uw4Var2.f64465b, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var6)).f51800b.f71407k, tj3Var, 0, 0, 130046);
                    tj3Var = tj3Var;
                    ss5.m21710f(AbstractC3584sr.m21611X(b16Var, 0.0f, ((fe9) tj3Var.m22128k(zf1Var6)).f38952a, 0.0f, 0.0f, 13), null, null, false, ui3Var, ci8.m4703P(977778043, new se0(uw4Var2, 16), tj3Var), tj3Var, ((i2 << 9) & 57344) | 196608, 14);
                    tj3Var.m22139q(true);
                    break;
                default:
                    tj3Var.m22111b0(330535715);
                    tj3Var.m22139q(false);
                    throw new IllegalStateException(("Reason " + upgradeReason + " has a redesigned prompt; it must not render the legacy card").toString());
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(upgradeReason, ui3Var, i);
        }
    }
}
