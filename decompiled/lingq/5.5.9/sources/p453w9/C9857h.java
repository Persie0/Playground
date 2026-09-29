package p453w9;

import com.google.android.exoplayer2.C2416m;
import java.util.Arrays;
import p195j9.C6435l;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p357r6.C8739a;
import p479xa.C10129a;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9857h implements InterfaceC9859j {

    /* JADX INFO: renamed from: b */
    public final String f50181b;

    /* JADX INFO: renamed from: c */
    public String f50182c;

    /* JADX INFO: renamed from: d */
    public InterfaceC7522w f50183d;

    /* JADX INFO: renamed from: f */
    public int f50185f;

    /* JADX INFO: renamed from: g */
    public int f50186g;

    /* JADX INFO: renamed from: h */
    public long f50187h;

    /* JADX INFO: renamed from: i */
    public C2416m f50188i;

    /* JADX INFO: renamed from: j */
    public int f50189j;

    /* JADX INFO: renamed from: a */
    public final C10151t f50180a = new C10151t(new byte[18]);

    /* JADX INFO: renamed from: e */
    public int f50184e = 0;

    /* JADX INFO: renamed from: k */
    public long f50190k = -9223372036854775807L;

    public C9857h(String str) {
        this.f50181b = str;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0236  */
    /* JADX WARN: Code duplicated, block: B:74:0x023f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0243  */
    /* JADX WARN: Code duplicated, block: B:78:0x0247  */
    /* JADX WARN: Code duplicated, block: B:79:0x0252  */
    /* JADX WARN: Code duplicated, block: B:80:0x025d  */
    /* JADX WARN: Code duplicated, block: B:82:0x026c  */
    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: a */
    public final void mo18336a(C10151t c10151t) {
        char c10;
        int i10;
        int i11;
        byte b10;
        boolean z10;
        int i12;
        int i13;
        byte b11;
        int i14;
        byte b12;
        int i15;
        byte b13;
        C8739a c8739a;
        int i16;
        int i17;
        boolean z11;
        C10129a.m18993e(this.f50183d);
        while (true) {
            int i18 = c10151t.f51440c - c10151t.f51439b;
            if (i18 <= 0) {
                return;
            }
            int i19 = this.f50184e;
            int i20 = 8;
            int i21 = 2;
            C10151t c10151t2 = this.f50180a;
            if (i19 == 0) {
                while (true) {
                    if (c10151t.f51440c - c10151t.f51439b <= 0) {
                        z11 = false;
                        break;
                    }
                    int i22 = this.f50186g << 8;
                    this.f50186g = i22;
                    int iM19145t = i22 | c10151t.m19145t();
                    this.f50186g = iM19145t;
                    if (iM19145t == 2147385345 || iM19145t == -25230976 || iM19145t == 536864768 || iM19145t == -14745368) {
                        byte[] bArr = c10151t2.f51438a;
                        bArr[0] = (byte) ((iM19145t >> 24) & 255);
                        bArr[1] = (byte) ((iM19145t >> 16) & 255);
                        bArr[2] = (byte) ((iM19145t >> 8) & 255);
                        bArr[3] = (byte) (iM19145t & 255);
                        this.f50185f = 4;
                        this.f50186g = 0;
                        z11 = true;
                        break;
                    }
                }
                if (z11) {
                    this.f50184e = 1;
                }
            } else if (i19 == 1) {
                byte[] bArr2 = c10151t2.f51438a;
                int iMin = Math.min(i18, 18 - this.f50185f);
                c10151t.m19127b(bArr2, this.f50185f, iMin);
                int i23 = this.f50185f + iMin;
                this.f50185f = i23;
                if (i23 == 18) {
                    byte[] bArr3 = c10151t2.f51438a;
                    if (this.f50188i == null) {
                        String str = this.f50182c;
                        if (bArr3[0] == 127) {
                            c8739a = new C8739a(bArr3, bArr3.length);
                        } else {
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b14 = bArrCopyOf[0];
                            if (b14 == -2 || b14 == -1) {
                                for (int i24 = 0; i24 < bArrCopyOf.length - 1; i24 += 2) {
                                    byte b15 = bArrCopyOf[i24];
                                    int i25 = i24 + 1;
                                    bArrCopyOf[i24] = bArrCopyOf[i25];
                                    bArrCopyOf[i25] = b15;
                                }
                            }
                            C8739a c8739a2 = new C8739a(bArrCopyOf, bArrCopyOf.length);
                            if (bArrCopyOf[0] == 31) {
                                C8739a c8739a3 = new C8739a(bArrCopyOf, bArrCopyOf.length);
                                while (c8739a3.m16965b() >= 16) {
                                    c8739a3.m16976m(i21);
                                    int iM16970g = c8739a3.m16970g(14) & 16383;
                                    int iMin2 = Math.min(8 - c8739a2.f46333b, 14);
                                    int i26 = c8739a2.f46333b;
                                    int i27 = (8 - i26) - iMin2;
                                    byte[] bArr4 = (byte[]) c8739a2.f46335d;
                                    int i28 = c8739a2.f46332a;
                                    byte b16 = (byte) (((65280 >> i26) | ((1 << i27) - 1)) & bArr4[i28]);
                                    bArr4[i28] = b16;
                                    int i29 = 14 - iMin2;
                                    bArr4[i28] = (byte) (b16 | ((iM16970g >>> i29) << i27));
                                    int i30 = i28 + 1;
                                    while (i29 > i20) {
                                        i29 -= 8;
                                        ((byte[]) c8739a2.f46335d)[i30] = (byte) (iM16970g >>> i29);
                                        i30++;
                                        i20 = 8;
                                    }
                                    int i31 = 8 - i29;
                                    byte[] bArr5 = (byte[]) c8739a2.f46335d;
                                    byte b17 = (byte) (bArr5[i30] & ((1 << i31) - 1));
                                    bArr5[i30] = b17;
                                    bArr5[i30] = (byte) (((iM16970g & ((1 << i29) - 1)) << i31) | b17);
                                    c8739a2.m16976m(14);
                                    c8739a2.m16964a();
                                    i20 = 8;
                                    i21 = 2;
                                }
                            }
                            c8739a2.m16973j(bArrCopyOf, bArrCopyOf.length);
                            c8739a = c8739a2;
                        }
                        c8739a.m16976m(60);
                        int i32 = C6435l.f36948a[c8739a.m16970g(6)];
                        int i33 = C6435l.f36949b[c8739a.m16970g(4)];
                        int iM16970g2 = c8739a.m16970g(5);
                        if (iM16970g2 >= 29) {
                            i17 = -1;
                            i16 = 2;
                        } else {
                            int i34 = C6435l.f36950c[iM16970g2] * 1000;
                            i16 = 2;
                            i17 = i34 / 2;
                        }
                        c8739a.m16976m(10);
                        int i35 = i32 + (c8739a.m16970g(i16) > 0 ? 1 : 0);
                        C2416m.a aVar = new C2416m.a();
                        aVar.f12491a = str;
                        aVar.f12501k = "audio/vnd.dts";
                        aVar.f12496f = i17;
                        aVar.f12514x = i35;
                        aVar.f12515y = i33;
                        aVar.f12504n = null;
                        aVar.f12493c = this.f50181b;
                        C2416m c2416m = new C2416m(aVar);
                        this.f50188i = c2416m;
                        this.f50183d.mo7388f(c2416m);
                        c10 = 0;
                    } else {
                        c10 = 0;
                    }
                    byte b18 = bArr3[c10];
                    if (b18 != -2) {
                        if (b18 == -1) {
                            i15 = ((3 & bArr3[7]) << 12) | ((bArr3[6] & 255) << 4);
                            b13 = bArr3[9];
                        } else if (b18 != 31) {
                            i10 = 4;
                            i11 = ((3 & bArr3[5]) << 12) | ((bArr3[6] & 255) << 4);
                            b10 = bArr3[7];
                        } else {
                            i15 = ((3 & bArr3[6]) << 12) | ((bArr3[7] & 255) << 4);
                            b13 = bArr3[8];
                        }
                        i12 = (i15 | ((b13 & 60) >> 2)) + 1;
                        z10 = true;
                        if (z10) {
                            i12 = (i12 * 16) / 14;
                        }
                        this.f50189j = i12;
                        if (b18 != -2) {
                            if (b18 != -1) {
                                int i36 = (bArr3[4] & 7) << 4;
                                b12 = bArr3[7];
                                i13 = i36;
                            } else if (b18 != 31) {
                                i13 = (bArr3[4] & 1) << 6;
                                b11 = bArr3[5];
                            } else {
                                i13 = (7 & bArr3[5]) << 4;
                                b12 = bArr3[6];
                            }
                            i14 = b12 & 60;
                            this.f50187h = (int) ((((long) ((((i14 >> 2) | i13) + 1) * 32)) * 1000000) / ((long) this.f50188i.f12464U));
                            c10151t2.m19124E(0);
                            this.f50183d.m15021c(18, c10151t2);
                            this.f50184e = 2;
                        } else {
                            i13 = (bArr3[5] & 1) << 6;
                            b11 = bArr3[4];
                        }
                        i14 = b11 & 252;
                        this.f50187h = (int) ((((long) ((((i14 >> 2) | i13) + 1) * 32)) * 1000000) / ((long) this.f50188i.f12464U));
                        c10151t2.m19124E(0);
                        this.f50183d.m15021c(18, c10151t2);
                        this.f50184e = 2;
                    } else {
                        i10 = 4;
                        i11 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        b10 = bArr3[6];
                    }
                    i12 = (i11 | ((b10 & 240) >> i10)) + 1;
                    z10 = false;
                    if (z10) {
                        i12 = (i12 * 16) / 14;
                    }
                    this.f50189j = i12;
                    if (b18 != -2) {
                        if (b18 != -1) {
                            int i37 = (bArr3[4] & 7) << 4;
                            b12 = bArr3[7];
                            i13 = i37;
                        } else if (b18 != 31) {
                            i13 = (bArr3[4] & 1) << 6;
                            b11 = bArr3[5];
                        } else {
                            i13 = (7 & bArr3[5]) << 4;
                            b12 = bArr3[6];
                        }
                        i14 = b12 & 60;
                        this.f50187h = (int) ((((long) ((((i14 >> 2) | i13) + 1) * 32)) * 1000000) / ((long) this.f50188i.f12464U));
                        c10151t2.m19124E(0);
                        this.f50183d.m15021c(18, c10151t2);
                        this.f50184e = 2;
                    } else {
                        i13 = (bArr3[5] & 1) << 6;
                        b11 = bArr3[4];
                    }
                    i14 = b11 & 252;
                    this.f50187h = (int) ((((long) ((((i14 >> 2) | i13) + 1) * 32)) * 1000000) / ((long) this.f50188i.f12464U));
                    c10151t2.m19124E(0);
                    this.f50183d.m15021c(18, c10151t2);
                    this.f50184e = 2;
                }
            } else {
                if (i19 != 2) {
                    throw new IllegalStateException();
                }
                int iMin3 = Math.min(i18, this.f50189j - this.f50185f);
                this.f50183d.m15021c(iMin3, c10151t);
                int i38 = this.f50185f + iMin3;
                this.f50185f = i38;
                int i39 = this.f50189j;
                if (i38 == i39) {
                    long j10 = this.f50190k;
                    if (j10 != -9223372036854775807L) {
                        this.f50183d.mo7387e(j10, 1, i39, 0, null);
                        this.f50190k += this.f50187h;
                    }
                    this.f50184e = 0;
                }
            }
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: b */
    public final void mo18337b() {
        this.f50184e = 0;
        this.f50185f = 0;
        this.f50186g = 0;
        this.f50190k = -9223372036854775807L;
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: c */
    public final void mo18338c() {
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: d */
    public final void mo18339d(InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        dVar.m18348a();
        dVar.m18349b();
        this.f50182c = dVar.f50141e;
        dVar.m18349b();
        this.f50183d = interfaceC7509j.mo7366q(dVar.f50140d, 1);
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: e */
    public final void mo18340e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50190k = j10;
        }
    }
}
