package p000;

import android.graphics.Color;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.C0233h;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l4d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [e16] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v25, types: [b16] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [e16] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX INFO: renamed from: a */
    public static final void m15801a(e16 e16Var, final String str, final zi3 zi3Var, final p04 p04Var, boolean z, boolean z2, final ui3 ui3Var, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        boolean z3;
        int i3;
        final ?? r8;
        final boolean z4;
        final boolean z5;
        boolean z6;
        ?? r15;
        float f;
        long j;
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-156467434);
        int i4 = i | 6 | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22120g(p04Var) ? 2048 : 1024);
        int i5 = i4 | 24576;
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i4 | 221184;
            z3 = z2;
        } else {
            z3 = z2;
            i3 = i5 | (tj3Var.m22122h(z3) ? 131072 : 65536);
        }
        int i7 = i3 | (tj3Var.m22124i(ui3Var) ? 1048576 : 524288);
        if (tj3Var.m22099R(i7 & 1, (4793491 & i7) != 4793490)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                b16 b16Var = b16.f7762a;
                z5 = i6 != 0 ? false : z3;
                z6 = true;
                r15 = b16Var;
            } else {
                tj3Var.m22102U();
                r15 = e16Var;
                z6 = z;
                z5 = z3;
            }
            tj3Var.m22140r();
            e16 e16VarM4412e = c99.m4412e(r15, 1.0f);
            if (z6) {
                tj3Var.m22111b0(-41334752);
                f = ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-41334184);
                tj3Var.m22139q(false);
                f = 0.0f;
            }
            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4412e, f);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d;
            C0233h c0233hM22000n = te1.m22000n(62, z6 ? 12.0f : 0.0f);
            if (z6) {
                tj3Var.m22111b0(-1281134456);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55868n;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1281061637);
                tj3Var.m22139q(false);
                j = aa1.f411j;
            }
            bq1.m4039O(e16VarM21607T, si8Var, te1.m21999m(0, 14, j, 0L, tj3Var), c0233hM22000n, null, ci8.m4703P(1659732872, new va0(z6, zi3Var, ui3Var, p04Var, str, z5, c0282a), tj3Var), tj3Var, 196608, 16);
            z4 = z6;
            r8 = r15;
        } else {
            tj3Var.m22102U();
            r8 = e16Var;
            z4 = z;
            z5 = z3;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(str, zi3Var, p04Var, z4, z5, ui3Var, c0282a, i, i2) { // from class: wa0

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f66551b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ zi3 f66552c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ p04 f66553d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f66554e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ boolean f66555f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ ui3 f66556g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C0282a f66557h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ int f66558i;

                {
                    this.f66558i = i2;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(12583297);
                    l4d.m15801a(this.f66550a, this.f66551b, this.f66552c, this.f66553d, this.f66554e, this.f66555f, this.f66556g, this.f66557h, (ye1) obj, iM19383z, this.f66558i);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:112:0x031f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0323  */
    /* JADX WARN: Code duplicated, block: B:116:0x0339  */
    /* JADX WARN: Code duplicated, block: B:118:0x0376  */
    /* JADX WARN: Code duplicated, block: B:121:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0107  */
    /* JADX WARN: Code duplicated, block: B:70:0x010b  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:87:0x0229  */
    /* JADX INFO: renamed from: b */
    public static final void m15802b(e16 e16Var, TokenStatus tokenStatus, yd5 yd5Var, boolean z, ui3 ui3Var, ye1 ye1Var, int i, int i2) {
        e16 e16Var2;
        int i3;
        boolean z2;
        boolean z3;
        e16 e16Var3;
        boolean z4;
        x18 x18VarM22143u;
        b16 b16Var;
        e16 e16Var4;
        boolean z5;
        boolean z6;
        Object objM22097O;
        gc0 gc0Var;
        ui3 ui3Var2;
        zi3 zi3Var;
        zi3 zi3Var2;
        zi3 zi3Var3;
        vi3 vi3Var;
        zi3 zi3Var4;
        float f;
        long j;
        e16 e16VarM10007D;
        long jM10035e;
        TokenStatus tokenStatus2;
        ci0 ci0Var;
        boolean z7;
        boolean z8;
        int i4;
        TokenStatus tokenStatus3 = tokenStatus;
        gc0 gc0Var2 = nj0.f52812g;
        tokenStatus3.getClass();
        yd5Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1525022570);
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
            i3 |= tj3Var.m22116e(tokenStatus3.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22124i(yd5Var) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= tj3Var.m22122h(z2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (tj3Var.m22124i(ui3Var)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i3 & 1, z3)) {
                b16Var = b16.f7762a;
                if (i5 != 0) {
                    e16Var4 = b16Var;
                } else {
                    e16Var4 = e16Var2;
                }
                if (i6 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((57344 & i3) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM22097O = tj3Var.m22097O();
                if (z6 || objM22097O == we1.f66679a) {
                    objM22097O = new zy7(10, ui3Var);
                    tj3Var.m22131l0(objM22097O);
                }
                e16 e16VarM10007D2 = d32.m10007D(c99.m4430w(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16Var4, 15), null, 3), cx2.m9917a(tj3Var).m4216i(), p58.m18901i(tj3Var).f64859e);
                gc0Var = nj0.f52808c;
                ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10007D2);
                se1.f60731q.getClass();
                ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                zi3Var = C0352b.f4303f;
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                zi3Var2 = C0352b.f4302e;
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var, zi3Var3, numValueOf);
                vi3Var = C0352b.f4305h;
                oha.m18000f(tj3Var, vi3Var);
                zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
                if (z5) {
                    f = 2.0f;
                } else {
                    f = 1.0f;
                }
                if (z5) {
                    tj3Var.m22111b0(-386791021);
                    long jM4212e = cx2.m9917a(tj3Var).m4212e();
                    tj3Var.m22139q(false);
                    j = jM4212e;
                } else {
                    tj3Var.m22111b0(-386722542);
                    j = p58.m18900f(tj3Var).f55817B;
                    tj3Var.m22139q(false);
                }
                e16 e16VarM24108d = wq1.m24108d(tj3Var, b16Var, 32.0f);
                vf0 vf0VarM4714a = ci8.m4714a(f, j);
                e16VarM10007D = d32.m10007D(r46.m20388n(e16VarM24108d, vf0VarM4714a.f65300a, vf0VarM4714a.f65301b, p58.m18901i(tj3Var).f64859e), cx2.m9917a(tj3Var).m4216i(), p58.m18901i(tj3Var).f64859e);
                e16 e16VarM24108d2 = wq1.m24108d(tj3Var, b16Var, 32.0f);
                vf0 vf0VarM4714a2 = ci8.m4714a(f, j);
                e16 e16VarM20388n = r46.m20388n(e16VarM24108d2, vf0VarM4714a2.f65300a, vf0VarM4714a2.f65301b, p58.m18901i(tj3Var).f64859e);
                switch (ni9.f52774a[tokenStatus3.ordinal()]) {
                    case 1:
                        tj3Var.m22111b0(818840729);
                        tj3Var.m22139q(false);
                        jM10035e = d32.m10035e(Color.parseColor(yd5Var.f69687a.f67242a));
                        break;
                    case 2:
                        tj3Var.m22111b0(818843449);
                        tj3Var.m22139q(false);
                        jM10035e = d32.m10035e(Color.parseColor(yd5Var.f69688b.f67242a));
                        break;
                    case 3:
                        tj3Var.m22111b0(818846041);
                        tj3Var.m22139q(false);
                        jM10035e = d32.m10035e(Color.parseColor(yd5Var.f69689c.f67242a));
                        break;
                    case 4:
                        tj3Var.m22111b0(818848569);
                        tj3Var.m22139q(false);
                        jM10035e = d32.m10035e(Color.parseColor(yd5Var.f69691e.f67242a));
                        break;
                    case 5:
                        tj3Var.m22111b0(818851355);
                        jM10035e = cx2.m9917a(tj3Var).m4216i();
                        tj3Var.m22139q(false);
                        break;
                    case 6:
                        tj3Var.m22111b0(818853817);
                        tj3Var.m22139q(false);
                        jM10035e = d32.m10035e(Color.parseColor(yd5Var.f69690d.f67242a));
                        break;
                    default:
                        throw ux5.m23001x(tj3Var, 818838769, false);
                }
                e16 e16VarM10007D3 = d32.m10007D(e16VarM20388n, jM10035e, p58.m18901i(tj3Var).f64859e);
                tokenStatus2 = TokenStatus.Ignored;
                ci0Var = ci0.f10109a;
                if (tokenStatus3 != tokenStatus2 || tokenStatus3 == TokenStatus.Known) {
                    tj3Var.m22111b0(-384511901);
                    ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                    tokenStatus3 = tokenStatus;
                    if (tokenStatus3 == TokenStatus.Known) {
                        tj3Var.m22111b0(-933218869);
                        bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_check_thick, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.ui_lingq_is_known), ci0Var.mo3727a(c99.m4422o(b16Var, ge9.m12515a(tj3Var).f38957f), gc0Var2), null, null, 0.0f, new qd0(5, p58.m18900f(tj3Var).f55875s), tj3Var, 8, 56);
                        tj3Var.m22139q(false);
                        z7 = false;
                    } else {
                        tj3Var.m22111b0(-932700177);
                        bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_trash, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.ui_lingq_is_ignored), ci0Var.mo3727a(c99.m4422o(b16Var, ge9.m12515a(tj3Var).f38957f), gc0Var2), null, null, 0.0f, new qd0(5, p58.m18900f(tj3Var).f55875s), tj3Var, 8, 56);
                        z7 = false;
                        tj3Var.m22139q(false);
                    }
                    z8 = true;
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(z7);
                } else {
                    tj3Var.m22111b0(-385144115);
                    if (tokenStatus3 != TokenStatus.Learned) {
                        e16VarM10007D = e16VarM10007D3;
                    }
                    ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, false);
                    int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m3 = tj3Var.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, ht5VarM19966d3);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                    AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                    e16 e16VarMo3727a = ci0Var.mo3727a(b16Var, gc0Var2);
                    vx9 vx9Var = p58.m18902j(tj3Var).f71406j;
                    String str = "";
                    switch (oi9.f54381a[tokenStatus3.ordinal()]) {
                        case 1:
                        case 6:
                            lw9.m16554b(str, e16VarMo3727a, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(4), 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 130040);
                            tj3Var = tj3Var;
                            tj3Var.m22139q(true);
                            tj3Var.m22139q(false);
                            z8 = true;
                            break;
                        case 2:
                            str = "1";
                            lw9.m16554b(str, e16VarMo3727a, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(4), 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 130040);
                            tj3Var = tj3Var;
                            tj3Var.m22139q(true);
                            tj3Var.m22139q(false);
                            z8 = true;
                            break;
                        case 3:
                            str = "2";
                            lw9.m16554b(str, e16VarMo3727a, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(4), 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 130040);
                            tj3Var = tj3Var;
                            tj3Var.m22139q(true);
                            tj3Var.m22139q(false);
                            z8 = true;
                            break;
                        case 4:
                            str = "3";
                            lw9.m16554b(str, e16VarMo3727a, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(4), 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 130040);
                            tj3Var = tj3Var;
                            tj3Var.m22139q(true);
                            tj3Var.m22139q(false);
                            z8 = true;
                            break;
                        case 5:
                            str = "4";
                            lw9.m16554b(str, e16VarMo3727a, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(4), 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 130040);
                            tj3Var = tj3Var;
                            tj3Var.m22139q(true);
                            tj3Var.m22139q(false);
                            z8 = true;
                            break;
                        default:
                            gm5.m12750e();
                            return;
                    }
                }
                tj3Var.m22139q(z8);
                e16Var3 = e16Var4;
                z4 = z5;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                z4 = z2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new b65(e16Var3, tokenStatus3, yd5Var, z4, ui3Var, i, i2);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if (tj3Var.m22124i(ui3Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var.m22099R(i3 & 1, z3)) {
            b16Var = b16.f7762a;
            if (i5 != 0) {
                e16Var4 = b16Var;
            } else {
                e16Var4 = e16Var2;
            }
            if (i6 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if ((57344 & i3) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM22097O = tj3Var.m22097O();
            if (z6) {
                objM22097O = new zy7(10, ui3Var);
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = new zy7(10, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM10007D4 = d32.m10007D(c99.m4430w(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16Var4, 15), null, 3), cx2.m9917a(tj3Var).m4216i(), p58.m18901i(tj3Var).f64859e);
            gc0Var = nj0.f52808c;
            ht5 ht5VarM19966d4 = qh0.m19966d(gc0Var, false);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM10007D4);
            se1.f60731q.getClass();
            ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d4);
            zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf2);
            vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
            if (z5) {
                f = 2.0f;
            } else {
                f = 1.0f;
            }
            if (z5) {
                tj3Var.m22111b0(-386791021);
                long jM4212e2 = cx2.m9917a(tj3Var).m4212e();
                tj3Var.m22139q(false);
                j = jM4212e2;
            } else {
                tj3Var.m22111b0(-386722542);
                j = p58.m18900f(tj3Var).f55817B;
                tj3Var.m22139q(false);
            }
            e16 e16VarM24108d3 = wq1.m24108d(tj3Var, b16Var, 32.0f);
            vf0 vf0VarM4714a3 = ci8.m4714a(f, j);
            e16VarM10007D = d32.m10007D(r46.m20388n(e16VarM24108d3, vf0VarM4714a3.f65300a, vf0VarM4714a3.f65301b, p58.m18901i(tj3Var).f64859e), cx2.m9917a(tj3Var).m4216i(), p58.m18901i(tj3Var).f64859e);
            e16 e16VarM24108d4 = wq1.m24108d(tj3Var, b16Var, 32.0f);
            vf0 vf0VarM4714a4 = ci8.m4714a(f, j);
            e16 e16VarM20388n2 = r46.m20388n(e16VarM24108d4, vf0VarM4714a4.f65300a, vf0VarM4714a4.f65301b, p58.m18901i(tj3Var).f64859e);
            switch (ni9.f52774a[tokenStatus3.ordinal()]) {
                case 1:
                    tj3Var.m22111b0(818840729);
                    tj3Var.m22139q(false);
                    jM10035e = d32.m10035e(Color.parseColor(yd5Var.f69687a.f67242a));
                    break;
                case 2:
                    tj3Var.m22111b0(818843449);
                    tj3Var.m22139q(false);
                    jM10035e = d32.m10035e(Color.parseColor(yd5Var.f69688b.f67242a));
                    break;
                case 3:
                    tj3Var.m22111b0(818846041);
                    tj3Var.m22139q(false);
                    jM10035e = d32.m10035e(Color.parseColor(yd5Var.f69689c.f67242a));
                    break;
                case 4:
                    tj3Var.m22111b0(818848569);
                    tj3Var.m22139q(false);
                    jM10035e = d32.m10035e(Color.parseColor(yd5Var.f69691e.f67242a));
                    break;
                case 5:
                    tj3Var.m22111b0(818851355);
                    jM10035e = cx2.m9917a(tj3Var).m4216i();
                    tj3Var.m22139q(false);
                    break;
                case 6:
                    tj3Var.m22111b0(818853817);
                    tj3Var.m22139q(false);
                    jM10035e = d32.m10035e(Color.parseColor(yd5Var.f69690d.f67242a));
                    break;
                default:
                    throw ux5.m23001x(tj3Var, 818838769, false);
            }
            e16 e16VarM10007D5 = d32.m10007D(e16VarM20388n2, jM10035e, p58.m18901i(tj3Var).f64859e);
            tokenStatus2 = TokenStatus.Ignored;
            ci0Var = ci0.f10109a;
            if (tokenStatus3 != tokenStatus2) {
                tj3Var.m22111b0(-384511901);
                ht5 ht5VarM19966d5 = qh0.m19966d(gc0Var, false);
                int iHashCode5 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m5 = tj3Var.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d5);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c5);
                tokenStatus3 = tokenStatus;
                if (tokenStatus3 == TokenStatus.Known) {
                    tj3Var.m22111b0(-933218869);
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_check_thick, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.ui_lingq_is_known), ci0Var.mo3727a(c99.m4422o(b16Var, ge9.m12515a(tj3Var).f38957f), gc0Var2), null, null, 0.0f, new qd0(5, p58.m18900f(tj3Var).f55875s), tj3Var, 8, 56);
                    tj3Var.m22139q(false);
                    z7 = false;
                } else {
                    tj3Var.m22111b0(-932700177);
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_trash, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.ui_lingq_is_ignored), ci0Var.mo3727a(c99.m4422o(b16Var, ge9.m12515a(tj3Var).f38957f), gc0Var2), null, null, 0.0f, new qd0(5, p58.m18900f(tj3Var).f55875s), tj3Var, 8, 56);
                    z7 = false;
                    tj3Var.m22139q(false);
                }
                z8 = true;
                tj3Var.m22139q(true);
                tj3Var.m22139q(z7);
            } else {
                tj3Var.m22111b0(-384511901);
                ht5 ht5VarM19966d6 = qh0.m19966d(gc0Var, false);
                int iHashCode6 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m6 = tj3Var.m22132m();
                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d6);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m6);
                AbstractC3393o1.m17747v(iHashCode6, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c6);
                tokenStatus3 = tokenStatus;
                if (tokenStatus3 == TokenStatus.Known) {
                    tj3Var.m22111b0(-933218869);
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_check_thick, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.ui_lingq_is_known), ci0Var.mo3727a(c99.m4422o(b16Var, ge9.m12515a(tj3Var).f38957f), gc0Var2), null, null, 0.0f, new qd0(5, p58.m18900f(tj3Var).f55875s), tj3Var, 8, 56);
                    tj3Var.m22139q(false);
                    z7 = false;
                } else {
                    tj3Var.m22111b0(-932700177);
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_trash, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.ui_lingq_is_ignored), ci0Var.mo3727a(c99.m4422o(b16Var, ge9.m12515a(tj3Var).f38957f), gc0Var2), null, null, 0.0f, new qd0(5, p58.m18900f(tj3Var).f55875s), tj3Var, 8, 56);
                    z7 = false;
                    tj3Var.m22139q(false);
                }
                z8 = true;
                tj3Var.m22139q(true);
                tj3Var.m22139q(z7);
            }
            tj3Var.m22139q(z8);
            e16Var3 = e16Var4;
            z4 = z5;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            z4 = z2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new b65(e16Var3, tokenStatus3, yd5Var, z4, ui3Var, i, i2);
        }
    }
}
