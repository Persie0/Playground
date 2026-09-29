package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import com.google.common.primitives.AbstractC1110a;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class an2 implements yo2 {

    /* JADX INFO: renamed from: a */
    public final k47 f858a;

    /* JADX INFO: renamed from: c */
    public final String f860c;

    /* JADX INFO: renamed from: d */
    public final int f861d;

    /* JADX INFO: renamed from: f */
    public String f863f;

    /* JADX INFO: renamed from: g */
    public n8a f864g;

    /* JADX INFO: renamed from: i */
    public int f866i;

    /* JADX INFO: renamed from: j */
    public int f867j;

    /* JADX INFO: renamed from: k */
    public long f868k;

    /* JADX INFO: renamed from: l */
    public C0713b f869l;

    /* JADX INFO: renamed from: m */
    public int f870m;

    /* JADX INFO: renamed from: n */
    public int f871n;

    /* JADX INFO: renamed from: h */
    public int f865h = 0;

    /* JADX INFO: renamed from: q */
    public long f874q = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f859b = new AtomicInteger();

    /* JADX INFO: renamed from: o */
    public int f872o = -1;

    /* JADX INFO: renamed from: p */
    public int f873p = -1;

    /* JADX INFO: renamed from: e */
    public final String f862e = "video/mp2t";

    public an2(String str, int i, int i2) {
        this.f858a = new k47(new byte[i2]);
        this.f860c = str;
        this.f861d = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m608a(k47 k47Var, byte[] bArr, int i) {
        int iMin = Math.min(k47Var.m14820a(), i - this.f866i);
        k47Var.m14827k(bArr, this.f866i, iMin);
        int i2 = this.f866i + iMin;
        this.f866i = i2;
        return i2 == i;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final void mo609b(k47 k47Var) throws ParserException {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int iM21503g;
        int iM21503g2;
        int iM21503g3;
        int i5;
        long jM22803H;
        int i6;
        long jM22803H2;
        int i7;
        int i8;
        int i9;
        int i10;
        this.f864g.getClass();
        while (k47Var.m14820a() > 0) {
            int i11 = this.f865h;
            k47 k47Var2 = this.f858a;
            switch (i11) {
                case 0:
                    while (k47Var.m14820a() > 0) {
                        int i12 = this.f867j << 8;
                        this.f867j = i12;
                        int iM14842z = i12 | k47Var.m14842z();
                        this.f867j = iM14842z;
                        int iM3074b = auc.m3074b(iM14842z);
                        this.f871n = iM3074b;
                        if (iM3074b != 0) {
                            byte[] bArr = k47Var2.f46700a;
                            int i13 = this.f867j;
                            bArr[0] = (byte) ((i13 >> 24) & 255);
                            bArr[1] = (byte) ((i13 >> 16) & 255);
                            bArr[2] = (byte) ((i13 >> 8) & 255);
                            bArr[3] = (byte) (i13 & 255);
                            this.f866i = 4;
                            this.f867j = 0;
                            if (iM3074b != 3 && iM3074b != 4) {
                                if (iM3074b == 1) {
                                    this.f865h = 1;
                                } else {
                                    this.f865h = 2;
                                }
                            }
                            this.f865h = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (m608a(k47Var, k47Var2.f46700a, 18)) {
                        byte[] bArr2 = k47Var2.f46700a;
                        if (this.f869l == null) {
                            String str = this.f863f;
                            so0 so0VarM3075c = auc.m3075c(bArr2);
                            so0VarM3075c.m21511o(60);
                            int i14 = auc.f7531a[so0VarM3075c.m21503g(6)];
                            int i15 = auc.f7532b[so0VarM3075c.m21503g(4)];
                            int iM21503g4 = so0VarM3075c.m21503g(5);
                            int i16 = iM21503g4 >= 29 ? -1 : (auc.f7533c[iM21503g4] * DescriptorProtos.Edition.EDITION_2023_VALUE) / 2;
                            so0VarM3075c.m21511o(10);
                            int i17 = i14 + (so0VarM3075c.m21503g(2) > 0 ? 1 : 0);
                            lc3 lc3Var = new lc3();
                            lc3Var.f49440a = str;
                            lc3Var.f49452m = ez5.m11402l(this.f862e);
                            lc3Var.f49453n = ez5.m11402l("audio/vnd.dts");
                            lc3Var.f49447h = i16;
                            lc3Var.f49430F = i17;
                            lc3Var.f49431G = i15;
                            lc3Var.f49457r = null;
                            lc3Var.f49443d = this.f860c;
                            lc3Var.f49445f = this.f861d;
                            C0713b c0713b = new C0713b(lc3Var);
                            this.f869l = c0713b;
                            this.f864g.mo2537g(c0713b);
                        }
                        this.f870m = auc.m3073a(bArr2);
                        byte b3 = bArr2[0];
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b3 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.f868k = AbstractC1110a.m6362b(uma.m22801F(this.f869l.f6382H, (((i2 >> 2) | i) + 1) * 32));
                            k47Var2.m14818M(0);
                            this.f864g.mo2535e(18, k47Var2);
                            this.f865h = 6;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.f868k = AbstractC1110a.m6362b(uma.m22801F(this.f869l.f6382H, (((i2 >> 2) | i) + 1) * 32));
                        k47Var2.m14818M(0);
                        this.f864g.mo2535e(18, k47Var2);
                        this.f865h = 6;
                        break;
                    }
                    break;
                case 2:
                    if (m608a(k47Var, k47Var2.f46700a, 7)) {
                        so0 so0VarM3075c2 = auc.m3075c(k47Var2.f46700a);
                        so0VarM3075c2.m21511o(42);
                        this.f872o = so0VarM3075c2.m21503g(so0VarM3075c2.m21502f() ? 12 : 8) + 1;
                        this.f865h = 3;
                    }
                    break;
                case 3:
                    int i18 = 8;
                    if (m608a(k47Var, k47Var2.f46700a, this.f872o)) {
                        so0 so0VarM3075c3 = auc.m3075c(k47Var2.f46700a);
                        so0VarM3075c3.m21511o(40);
                        int iM21503g5 = so0VarM3075c3.m21503g(2);
                        if (so0VarM3075c3.m21502f()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        so0VarM3075c3.m21511o(i4);
                        int iM21503g6 = so0VarM3075c3.m21503g(i3) + 1;
                        boolean zM21502f = so0VarM3075c3.m21502f();
                        if (zM21502f) {
                            iM21503g = so0VarM3075c3.m21503g(2);
                            iM21503g2 = (so0VarM3075c3.m21503g(3) + 1) * 512;
                            if (so0VarM3075c3.m21502f()) {
                                so0VarM3075c3.m21511o(36);
                            }
                            int iM21503g7 = so0VarM3075c3.m21503g(3) + 1;
                            int iM21503g8 = so0VarM3075c3.m21503g(3) + 1;
                            if (iM21503g7 != 1 || iM21503g8 != 1) {
                                throw ParserException.m2517b("Multiple audio presentations or assets not supported");
                            }
                            int i19 = iM21503g5 + 1;
                            int iM21503g9 = so0VarM3075c3.m21503g(i19);
                            int i20 = 0;
                            while (i20 < i19) {
                                if (((iM21503g9 >> i20) & 1) == 1) {
                                    so0VarM3075c3.m21511o(i18);
                                }
                                i20++;
                                i18 = 8;
                            }
                            if (so0VarM3075c3.m21502f()) {
                                so0VarM3075c3.m21511o(2);
                                int iM21503g10 = (so0VarM3075c3.m21503g(2) + 1) << 2;
                                int iM21503g11 = so0VarM3075c3.m21503g(2) + 1;
                                for (int i21 = 0; i21 < iM21503g11; i21++) {
                                    so0VarM3075c3.m21511o(iM21503g10);
                                }
                            }
                        } else {
                            iM21503g = -1;
                            iM21503g2 = 0;
                        }
                        so0VarM3075c3.m21511o(i3);
                        so0VarM3075c3.m21511o(12);
                        if (zM21502f) {
                            if (so0VarM3075c3.m21502f()) {
                                so0VarM3075c3.m21511o(4);
                            }
                            if (so0VarM3075c3.m21502f()) {
                                so0VarM3075c3.m21511o(24);
                            }
                            if (so0VarM3075c3.m21502f()) {
                                so0VarM3075c3.m21512p(so0VarM3075c3.m21503g(10) + 1);
                            }
                            so0VarM3075c3.m21511o(5);
                            i5 = auc.f7534d[so0VarM3075c3.m21503g(4)];
                            iM21503g3 = so0VarM3075c3.m21503g(8) + 1;
                        } else {
                            iM21503g3 = -1;
                            i5 = -2147483647;
                        }
                        if (zM21502f) {
                            if (iM21503g == 0) {
                                i6 = 32000;
                            } else if (iM21503g == 1) {
                                i6 = 44100;
                            } else {
                                if (iM21503g != 2) {
                                    throw ParserException.m2516a(null, "Unsupported reference clock code in DTS HD header: " + iM21503g);
                                }
                                i6 = 48000;
                            }
                            String str2 = uma.f64080a;
                            jM22803H = uma.m22803H(iM21503g2, 1000000L, i6, RoundingMode.DOWN);
                        } else {
                            jM22803H = -9223372036854775807L;
                        }
                        m610c(new C3354n("audio/vnd.dts.hd;profile=lbr", iM21503g3, i5, iM21503g6, jM22803H));
                        this.f870m = iM21503g6;
                        this.f868k = jM22803H == -9223372036854775807L ? 0L : jM22803H;
                        k47Var2.m14818M(0);
                        this.f864g.mo2535e(this.f872o, k47Var2);
                        this.f865h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (m608a(k47Var, k47Var2.f46700a, 6)) {
                        so0 so0VarM3075c4 = auc.m3075c(k47Var2.f46700a);
                        so0VarM3075c4.m21511o(32);
                        int iM3077e = auc.m3077e(so0VarM3075c4, auc.f7539i) + 1;
                        this.f873p = iM3077e;
                        int i22 = this.f866i;
                        if (i22 > iM3077e) {
                            int i23 = i22 - iM3077e;
                            this.f866i = i22 - i23;
                            k47Var.m14818M(k47Var.f46701b - i23);
                        }
                        this.f865h = 5;
                    }
                    break;
                case 5:
                    if (m608a(k47Var, k47Var2.f46700a, this.f873p)) {
                        byte[] bArr3 = k47Var2.f46700a;
                        so0 so0VarM3075c5 = auc.m3075c(bArr3);
                        int i24 = so0VarM3075c5.m21503g(32) == 1078008818 ? 1 : 0;
                        int iM3077e2 = auc.m3077e(so0VarM3075c5, auc.f7535e);
                        int i25 = iM3077e2 + 1;
                        if (i24 == 0) {
                            jM22803H2 = -9223372036854775807L;
                            i7 = -2147483647;
                        } else {
                            if (!so0VarM3075c5.m21502f()) {
                                throw ParserException.m2517b("Only supports full channel mask-based audio presentation");
                            }
                            int i26 = iM3077e2 - 1;
                            int i27 = ((bArr3[i26] << 8) & 65535) | (bArr3[iM3077e2] & 255);
                            String str3 = uma.f64080a;
                            int i28 = 65535;
                            for (int i29 = 0; i29 < i26; i29++) {
                                byte b4 = bArr3[i29];
                                int[] iArr = uma.f64087h;
                                int i30 = (iArr[(((b4 & 255) >> 4) ^ ((i28 >> 12) & 255)) & 255] ^ ((i28 << 4) & 65535)) & 65535;
                                i28 = (iArr[((b4 & 15) ^ ((i30 >> 12) & 255)) & 255] ^ ((i30 << 4) & 65535)) & 65535;
                            }
                            if (i27 != i28) {
                                throw ParserException.m2516a(null, "CRC check failed");
                            }
                            int iM21503g12 = so0VarM3075c5.m21503g(2);
                            if (iM21503g12 != 0) {
                                if (iM21503g12 == 1) {
                                    i9 = 480;
                                } else {
                                    if (iM21503g12 != 2) {
                                        throw ParserException.m2516a(null, "Unsupported base duration index in DTS UHD header: " + iM21503g12);
                                    }
                                    i9 = 384;
                                }
                                i8 = 3;
                            } else {
                                i8 = 3;
                                i9 = 512;
                            }
                            int iM21503g13 = (so0VarM3075c5.m21503g(i8) + 1) * i9;
                            int iM21503g14 = so0VarM3075c5.m21503g(2);
                            if (iM21503g14 == 0) {
                                i10 = 32000;
                            } else if (iM21503g14 == 1) {
                                i10 = 44100;
                            } else {
                                if (iM21503g14 != 2) {
                                    throw ParserException.m2516a(null, "Unsupported clock rate index in DTS UHD header: " + iM21503g14);
                                }
                                i10 = 48000;
                            }
                            if (so0VarM3075c5.m21502f()) {
                                so0VarM3075c5.m21511o(36);
                            }
                            int iM21503g15 = i10 * (1 << so0VarM3075c5.m21503g(2));
                            jM22803H2 = uma.m22803H(iM21503g13, 1000000L, i10, RoundingMode.DOWN);
                            i7 = iM21503g15;
                        }
                        int iM3077e3 = 0;
                        for (int i31 = 0; i31 < i24; i31++) {
                            iM3077e3 += auc.m3077e(so0VarM3075c5, auc.f7536f);
                        }
                        AtomicInteger atomicInteger = this.f859b;
                        if (i24 != 0) {
                            atomicInteger.set(auc.m3077e(so0VarM3075c5, auc.f7537g));
                        }
                        int iM3077e4 = iM3077e3 + (atomicInteger.get() != 0 ? auc.m3077e(so0VarM3075c5, auc.f7538h) : 0) + i25;
                        C3354n c3354n = new C3354n("audio/vnd.dts.uhd;profile=p2", 2, i7, iM3077e4, jM22803H2);
                        if (this.f871n == 3) {
                            m610c(c3354n);
                        }
                        this.f870m = iM3077e4;
                        this.f868k = jM22803H2 == -9223372036854775807L ? 0L : jM22803H2;
                        k47Var2.m14818M(0);
                        this.f864g.mo2535e(this.f873p, k47Var2);
                        this.f865h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(k47Var.m14820a(), this.f870m - this.f866i);
                    this.f864g.mo2535e(iMin, k47Var);
                    int i32 = this.f866i + iMin;
                    this.f866i = i32;
                    if (i32 == this.f870m) {
                        bna.m3987z(this.f874q != -9223372036854775807L);
                        this.f864g.mo2531a(this.f874q, this.f871n == 4 ? 0 : 1, this.f870m, 0, null);
                        this.f874q += this.f868k;
                        this.f865h = 0;
                    }
                    break;
                default:
                    uk9.m22770c();
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m610c(C3354n c3354n) {
        int i = c3354n.f52093b;
        String str = c3354n.f52092a;
        int i2 = c3354n.f52094c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        C0713b c0713b = this.f869l;
        if (c0713b != null && i2 == c0713b.f6381G && i == c0713b.f6382H && str.equals(c0713b.f6406o)) {
            return;
        }
        C0713b c0713b2 = this.f869l;
        lc3 lc3Var = c0713b2 == null ? new lc3() : c0713b2.m2520a();
        lc3Var.f49440a = this.f863f;
        lc3Var.f49452m = ez5.m11402l(this.f862e);
        lc3Var.f49453n = ez5.m11402l(str);
        lc3Var.f49430F = i2;
        lc3Var.f49431G = i;
        lc3Var.f49443d = this.f860c;
        lc3Var.f49445f = this.f861d;
        C0713b c0713b3 = new C0713b(lc3Var);
        this.f869l = c0713b3;
        this.f864g.mo2537g(c0713b3);
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final void mo611d() {
        this.f865h = 0;
        this.f866i = 0;
        this.f867j = 0;
        this.f874q = -9223372036854775807L;
        this.f859b.set(0);
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final void mo612e(boolean z) {
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final void mo613f(int i, long j) {
        this.f874q = j;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: g */
    public final void mo614g(jy2 jy2Var, mca mcaVar) {
        mcaVar.m16767a();
        mcaVar.m16768b();
        this.f863f = mcaVar.f51087e;
        mcaVar.m16768b();
        this.f864g = jy2Var.mo2555n(mcaVar.f51086d, 1);
    }
}
