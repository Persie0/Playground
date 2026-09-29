package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.ParserException;
import com.lingq.core.premium.R$string;
import com.lingq.core.premium.upgrade.UpgradeBadgeTier;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wx1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f67467a = {2002, 2000, 1920, 1601, 1600, 1001, DescriptorProtos.Edition.EDITION_2023_VALUE, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: a */
    public static final void m24192a(List list, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        ui3 ui3Var2;
        list.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1529345205);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(list) ? 4 : 2) | i;
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
            int i4 = i2 << 6;
            ui3Var2 = ui3Var;
            s9d.m21184c(UpgradeBadgeTier.Premium, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lingq_limit_title), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lingq_limit_button), ui3Var2, b16Var, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lingq_limit_subtitle), false, false, ci8.m4703P(-1633437336, new eq0(7, list), tj3Var), tj3Var, (i4 & 7168) | 100663302 | (i4 & 57344), 192);
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(list, ui3Var2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m24193b(String str, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(2139056165);
        int i2 = i | (tj3Var2.m22120g(str) ? 4 : 2);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 3) != 2)) {
            si8 si8VarM22753b = ui8.m22753b(ge9.m12515a(tj3Var2).f38952a);
            tj3Var = tj3Var2;
            lw9.m16554b(str, AbstractC3584sr.m21608U(r46.m20387m(d32.m10007D(pb1.m19045o(b16.f7762a, si8VarM22753b), aa1.m198b(0.12f, cx2.m9917a(tj3Var2).m4212e()), ss5.f61356d), 1.0f, cx2.m9917a(tj3Var2).m4212e(), si8VarM22753b), ge9.m12515a(tj3Var2).f38952a, ge9.m12515a(tj3Var2).f38955d), p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, p58.m18902j(tj3Var2).f71407k, tj3Var, i2 & 14, 24576, 114680);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3441oz(str, i, 20);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m24194c(List list, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2053644446);
        int i2 = (tj3Var.m22124i(list) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            long j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55825J;
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
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
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            AbstractC3423or.m18244b(e16VarM4412e2, new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new C3487q7(nj0.f52792K, 3)), new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28)), null, 0, 0, ci8.m4703P(-667556471, new eq0(6, list), tj3Var), tj3Var, 1572870, 56);
            e16 e16VarM4674b = ci0.f10109a.m4674b(b16Var);
            ui0 ui0Var = vi0.Companion;
            Float fValueOf = Float.valueOf(0.0f);
            long j2 = aa1.f411j;
            qh0.m19963a(d32.m10006C(e16VarM4674b, ui0.m22750f(ui0Var, new Pair[]{new Pair(fValueOf, new aa1(j2)), new Pair(Float.valueOf(0.5f), new aa1(j2)), new Pair(Float.valueOf(1.0f), new aa1(j))})), tj3Var, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g61(i, 4, list);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m24195d(int i, k47 k47Var) {
        k47Var.m14815J(7);
        byte[] bArr = k47Var.f46700a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: e */
    public static int m24196e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return m24197f(new so0(16, bArr)).f48910c;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX INFO: renamed from: f */
    public static C3283l2 m24197f(so0 so0Var) {
        int i;
        int i2;
        int iM21503g = so0Var.m21503g(16);
        int iM21503g2 = so0Var.m21503g(16);
        if (iM21503g2 == 65535) {
            iM21503g2 = so0Var.m21503g(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iM21503g2 + i;
        if (iM21503g == 44097) {
            i3 += 2;
        }
        if (so0Var.m21503g(2) == 3) {
            do {
                so0Var.m21503g(2);
            } while (so0Var.m21502f());
        }
        int iM21503g3 = so0Var.m21503g(10);
        if (so0Var.m21502f() && so0Var.m21503g(3) > 0) {
            so0Var.m21511o(2);
        }
        int i4 = so0Var.m21502f() ? 48000 : 44100;
        int iM21503g4 = so0Var.m21503g(4);
        int[] iArr = f67467a;
        if (i4 == 44100 && iM21503g4 == 13) {
            i2 = iArr[iM21503g4];
        } else if (i4 != 48000 || iM21503g4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iM21503g4];
            int i6 = iM21503g3 % 5;
            if (i6 == 1) {
                if (iM21503g4 != 3 || iM21503g4 == 8) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (iM21503g4 != 3) {
                    }
                    i2 = i5 + 1;
                } else if (i6 == 4 && (iM21503g4 == 3 || iM21503g4 == 8 || iM21503g4 == 11)) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (iM21503g4 == 8 || iM21503g4 == 11) {
                i2 = i5 + 1;
            } else {
                i2 = i5;
            }
        }
        return new C3283l2(i4, i3, i2);
    }

    /* JADX INFO: renamed from: g */
    public static void m24198g(so0 so0Var, C3169k2 c3169k2) throws ParserException {
        int iM21503g = so0Var.m21503g(5);
        so0Var.m21511o(2);
        if (so0Var.m21502f()) {
            so0Var.m21511o(5);
        }
        if (iM21503g >= 7 && iM21503g <= 10) {
            so0Var.m21510n();
        }
        if (so0Var.m21502f()) {
            int iM21503g2 = so0Var.m21503g(3);
            if (c3169k2.f46566b == -1 && iM21503g >= 0 && iM21503g <= 15 && (iM21503g2 == 0 || iM21503g2 == 1)) {
                c3169k2.f46566b = iM21503g;
            }
            if (so0Var.m21502f()) {
                m24200i(so0Var);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m24199h(so0 so0Var, C3169k2 c3169k2) throws ParserException {
        so0Var.m21511o(2);
        boolean zM21502f = so0Var.m21502f();
        int iM21503g = so0Var.m21503g(8);
        for (int i = 0; i < iM21503g; i++) {
            so0Var.m21511o(2);
            if (so0Var.m21502f()) {
                so0Var.m21511o(5);
            }
            if (zM21502f) {
                so0Var.m21511o(24);
            } else {
                if (so0Var.m21502f()) {
                    if (!so0Var.m21502f()) {
                        so0Var.m21511o(4);
                    }
                    c3169k2.f46567c = so0Var.m21503g(6) + 1;
                }
                so0Var.m21511o(4);
            }
        }
        if (so0Var.m21502f()) {
            so0Var.m21511o(3);
            if (so0Var.m21502f()) {
                m24200i(so0Var);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m24200i(so0 so0Var) throws ParserException {
        int iM21503g = so0Var.m21503g(6);
        if (iM21503g < 2 || iM21503g > 42) {
            throw ParserException.m2517b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iM21503g)));
        }
        so0Var.m21511o(iM21503g * 8);
    }
}
