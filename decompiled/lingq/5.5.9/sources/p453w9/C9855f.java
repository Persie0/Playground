package p453w9;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.kochava.tracker.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import p195j9.C6424a;
import p261m9.C7506g;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p357r6.C8739a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9855f implements InterfaceC9859j {

    /* JADX INFO: renamed from: v */
    public static final byte[] f50156v = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f50157a;

    /* JADX INFO: renamed from: d */
    public final String f50160d;

    /* JADX INFO: renamed from: e */
    public String f50161e;

    /* JADX INFO: renamed from: f */
    public InterfaceC7522w f50162f;

    /* JADX INFO: renamed from: g */
    public InterfaceC7522w f50163g;

    /* JADX INFO: renamed from: k */
    public boolean f50167k;

    /* JADX INFO: renamed from: l */
    public boolean f50168l;

    /* JADX INFO: renamed from: o */
    public int f50171o;

    /* JADX INFO: renamed from: p */
    public boolean f50172p;

    /* JADX INFO: renamed from: r */
    public int f50174r;

    /* JADX INFO: renamed from: t */
    public InterfaceC7522w f50176t;

    /* JADX INFO: renamed from: u */
    public long f50177u;

    /* JADX INFO: renamed from: b */
    public final C8739a f50158b = new C8739a(new byte[7], 7);

    /* JADX INFO: renamed from: c */
    public final C10151t f50159c = new C10151t(Arrays.copyOf(f50156v, 10));

    /* JADX INFO: renamed from: h */
    public int f50164h = 0;

    /* JADX INFO: renamed from: i */
    public int f50165i = 0;

    /* JADX INFO: renamed from: j */
    public int f50166j = 256;

    /* JADX INFO: renamed from: m */
    public int f50169m = -1;

    /* JADX INFO: renamed from: n */
    public int f50170n = -1;

    /* JADX INFO: renamed from: q */
    public long f50173q = -9223372036854775807L;

    /* JADX INFO: renamed from: s */
    public long f50175s = -9223372036854775807L;

    public C9855f(String str, boolean z10) {
        this.f50157a = z10;
        this.f50160d = str;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0256  */
    /* JADX WARN: Code duplicated, block: B:102:0x0263  */
    /* JADX WARN: Code duplicated, block: B:103:0x0265  */
    /* JADX WARN: Code duplicated, block: B:108:0x0270  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:141:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:146:0x02df  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:149:0x0301  */
    /* JADX WARN: Code duplicated, block: B:150:0x0310  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01de  */
    /* JADX WARN: Code duplicated, block: B:85:0x0228  */
    /* JADX WARN: Code duplicated, block: B:86:0x022a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0230  */
    /* JADX WARN: Code duplicated, block: B:89:0x0232  */
    /* JADX WARN: Code duplicated, block: B:92:0x0244  */
    /* JADX WARN: Code duplicated, block: B:95:0x024c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0251  */
    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: a */
    public final void mo18336a(C10151t c10151t) throws ParserException {
        int i10;
        int i11;
        int i12;
        char c10;
        boolean z10;
        byte[] bArr;
        boolean z11;
        int iM16970g;
        byte[] bArr2;
        int i13;
        int i14;
        byte b10;
        int i15;
        int i16;
        int i17;
        byte b11;
        boolean z12;
        boolean z13;
        boolean z14;
        this.f50162f.getClass();
        int i18 = C10134c0.f51354a;
        while (true) {
            int i19 = c10151t.f51440c;
            int i20 = c10151t.f51439b;
            int i21 = i19 - i20;
            if (i21 <= 0) {
                return;
            }
            int i22 = this.f50164h;
            int i23 = 4;
            int i24 = 2;
            C10151t c10151t2 = this.f50159c;
            C8739a c8739a = this.f50158b;
            if (i22 == 0) {
                byte[] bArr3 = c10151t.f51438a;
                while (true) {
                    if (i20 < i19) {
                        int i25 = i20 + 1;
                        int i26 = bArr3[i20] & 255;
                        if (this.f50166j != 512) {
                            i10 = this.f50166j;
                            i11 = i26 | i10;
                            if (i11 != 329) {
                                i12 = 2;
                                c10 = 3;
                                this.f50166j = 768;
                            } else if (i11 != 511) {
                                i12 = 2;
                                c10 = 3;
                                this.f50166j = 512;
                            } else if (i11 != 836) {
                                i12 = 2;
                                c10 = 3;
                                this.f50166j = 1024;
                            } else if (i11 != 1075) {
                                if (i10 != 256) {
                                    this.f50166j = 256;
                                    i20 = i25 - 1;
                                    i12 = 2;
                                    c10 = 3;
                                } else {
                                    i12 = 2;
                                    c10 = 3;
                                }
                                i24 = i12;
                                i23 = 4;
                            } else {
                                this.f50164h = 2;
                                this.f50165i = 3;
                                this.f50174r = 0;
                                c10151t2.m19124E(0);
                                c10151t.m19124E(i25);
                            }
                            i20 = i25;
                            i24 = i12;
                            i23 = 4;
                        } else {
                            if ((((((byte) i26) & 255) | 65280) & 65526) == 65520) {
                                if (!this.f50168l) {
                                    int i27 = i25 - 2;
                                    c10151t.m19124E(i27 + 1);
                                    byte[] bArr4 = (byte[]) c8739a.f46335d;
                                    if (c10151t.f51440c - c10151t.f51439b < 1) {
                                        z10 = false;
                                    } else {
                                        c10151t.m19127b(bArr4, 0, 1);
                                        z10 = true;
                                    }
                                    if (z10) {
                                        c8739a.m16974k(i23);
                                        int iM16970g2 = c8739a.m16970g(1);
                                        int i28 = this.f50169m;
                                        if (i28 != -1 && iM16970g2 != i28) {
                                            z13 = false;
                                        } else if (this.f50170n != -1) {
                                            byte[] bArr5 = (byte[]) c8739a.f46335d;
                                            if (c10151t.f51440c - c10151t.f51439b < 1) {
                                                z14 = false;
                                            } else {
                                                c10151t.m19127b(bArr5, 0, 1);
                                                z14 = true;
                                            }
                                            if (z14) {
                                                c8739a.m16974k(i24);
                                                if (c8739a.m16970g(4) == this.f50170n) {
                                                    c10151t.m19124E(i27 + 2);
                                                    bArr = (byte[]) c8739a.f46335d;
                                                    if (c10151t.f51440c - c10151t.f51439b < 4) {
                                                        z11 = false;
                                                    } else {
                                                        c10151t.m19127b(bArr, 0, 4);
                                                        z11 = true;
                                                    }
                                                    if (!z11) {
                                                        c8739a.m16974k(14);
                                                        iM16970g = c8739a.m16970g(13);
                                                        if (iM16970g < 7) {
                                                            bArr2 = c10151t.f51438a;
                                                            i13 = c10151t.f51440c;
                                                            i14 = i27 + iM16970g;
                                                            if (i14 >= i13) {
                                                                b10 = bArr2[i14];
                                                                if (b10 == -1) {
                                                                    i17 = i14 + 1;
                                                                    if (i17 != i13) {
                                                                        b11 = bArr2[i17];
                                                                        if ((((b11 & 255) | 65280) & 65526) == 65520) {
                                                                            z12 = true;
                                                                        } else {
                                                                            z12 = false;
                                                                        }
                                                                        if (z12 || ((b11 & 8) >> 3) != iM16970g2) {
                                                                        }
                                                                    }
                                                                } else if (b10 == 73 && ((i15 = i14 + 1) == i13 || (bArr2[i15] == 68 && ((i16 = i14 + 2) == i13 || bArr2[i16] == 51)))) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z13 = true;
                                                }
                                                z13 = false;
                                            }
                                            z13 = true;
                                        } else {
                                            bArr = (byte[]) c8739a.f46335d;
                                            if (c10151t.f51440c - c10151t.f51439b < 4) {
                                                z11 = false;
                                            } else {
                                                c10151t.m19127b(bArr, 0, 4);
                                                z11 = true;
                                            }
                                            if (!z11) {
                                                c8739a.m16974k(14);
                                                iM16970g = c8739a.m16970g(13);
                                                if (iM16970g < 7) {
                                                    bArr2 = c10151t.f51438a;
                                                    i13 = c10151t.f51440c;
                                                    i14 = i27 + iM16970g;
                                                    if (i14 >= i13) {
                                                        b10 = bArr2[i14];
                                                        if (b10 == -1) {
                                                            i17 = i14 + 1;
                                                            if (i17 != i13) {
                                                                b11 = bArr2[i17];
                                                                if ((((b11 & 255) | 65280) & 65526) == 65520) {
                                                                    z12 = true;
                                                                } else {
                                                                    z12 = false;
                                                                }
                                                                if (z12) {
                                                                }
                                                            }
                                                        } else if (b10 == 73) {
                                                        }
                                                    }
                                                }
                                                z13 = false;
                                            }
                                            z13 = true;
                                        }
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                    }
                                }
                                this.f50171o = (i26 & 8) >> 3;
                                this.f50167k = (i26 & 1) == 0;
                                if (this.f50168l) {
                                    this.f50164h = 3;
                                    this.f50165i = 0;
                                } else {
                                    this.f50164h = 1;
                                    this.f50165i = 0;
                                }
                                c10151t.m19124E(i25);
                            }
                            i10 = this.f50166j;
                            i11 = i26 | i10;
                            if (i11 != 329) {
                                i12 = 2;
                                c10 = 3;
                                this.f50166j = 768;
                            } else if (i11 != 511) {
                                i12 = 2;
                                c10 = 3;
                                this.f50166j = 512;
                            } else if (i11 != 836) {
                                i12 = 2;
                                c10 = 3;
                                this.f50166j = 1024;
                            } else if (i11 != 1075) {
                                if (i10 != 256) {
                                    this.f50166j = 256;
                                    i20 = i25 - 1;
                                    i12 = 2;
                                    c10 = 3;
                                } else {
                                    i12 = 2;
                                    c10 = 3;
                                }
                                i24 = i12;
                                i23 = 4;
                            } else {
                                this.f50164h = 2;
                                this.f50165i = 3;
                                this.f50174r = 0;
                                c10151t2.m19124E(0);
                                c10151t.m19124E(i25);
                            }
                            i20 = i25;
                            i24 = i12;
                            i23 = 4;
                        }
                    } else {
                        c10151t.m19124E(i20);
                    }
                }
            } else if (i22 != 1) {
                if (i22 != 2) {
                    if (i22 == 3) {
                        if (m18353f(this.f50167k ? 7 : 5, c10151t, (byte[]) c8739a.f46335d)) {
                            c8739a.m16974k(0);
                            if (this.f50172p) {
                                c8739a.m16976m(10);
                            } else {
                                int iM16970g3 = c8739a.m16970g(2) + 1;
                                if (iM16970g3 != 2) {
                                    C10145n.m19099g("AdtsReader", "Detected audio object type: " + iM16970g3 + ", but assuming AAC LC.");
                                    iM16970g3 = 2;
                                }
                                c8739a.m16976m(5);
                                int iM16970g4 = c8739a.m16970g(3);
                                int i29 = this.f50170n;
                                byte[] bArr6 = {(byte) (((iM16970g3 << 3) & 248) | ((i29 >> 1) & 7)), (byte) (((i29 << 7) & BuildConfig.SDK_TRUNCATE_LENGTH) | ((iM16970g4 << 3) & 120))};
                                C6424a.a aVarM13046b = C6424a.m13046b(new C8739a(bArr6, 2), false);
                                C2416m.a aVar = new C2416m.a();
                                aVar.f12491a = this.f50161e;
                                aVar.f12501k = "audio/mp4a-latm";
                                aVar.f12498h = aVarM13046b.f36905c;
                                aVar.f12514x = aVarM13046b.f36904b;
                                aVar.f12515y = aVarM13046b.f36903a;
                                aVar.f12503m = Collections.singletonList(bArr6);
                                aVar.f12493c = this.f50160d;
                                C2416m c2416m = new C2416m(aVar);
                                this.f50173q = 1024000000 / ((long) c2416m.f12464U);
                                this.f50162f.mo7388f(c2416m);
                                this.f50172p = true;
                            }
                            c8739a.m16976m(4);
                            int iM16970g5 = (c8739a.m16970g(13) - 2) - 5;
                            if (this.f50167k) {
                                iM16970g5 -= 2;
                            }
                            InterfaceC7522w interfaceC7522w = this.f50162f;
                            long j10 = this.f50173q;
                            this.f50164h = 4;
                            this.f50165i = 0;
                            this.f50176t = interfaceC7522w;
                            this.f50177u = j10;
                            this.f50174r = iM16970g5;
                        }
                    } else {
                        if (i22 != 4) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(i21, this.f50174r - this.f50165i);
                        this.f50176t.m15021c(iMin, c10151t);
                        int i30 = this.f50165i + iMin;
                        this.f50165i = i30;
                        int i31 = this.f50174r;
                        if (i30 == i31) {
                            long j11 = this.f50175s;
                            if (j11 != -9223372036854775807L) {
                                this.f50176t.mo7387e(j11, 1, i31, 0, null);
                                this.f50175s += this.f50177u;
                            }
                            this.f50164h = 0;
                            this.f50165i = 0;
                            this.f50166j = 256;
                        }
                    }
                } else if (m18353f(10, c10151t, c10151t2.f51438a)) {
                    this.f50163g.m15021c(10, c10151t2);
                    c10151t2.m19124E(6);
                    InterfaceC7522w interfaceC7522w2 = this.f50163g;
                    int iM19144s = c10151t2.m19144s() + 10;
                    this.f50164h = 4;
                    this.f50165i = 10;
                    this.f50176t = interfaceC7522w2;
                    this.f50177u = 0L;
                    this.f50174r = iM19144s;
                }
            } else if (i21 != 0) {
                ((byte[]) c8739a.f46335d)[0] = c10151t.f51438a[i20];
                c8739a.m16974k(2);
                int iM16970g6 = c8739a.m16970g(4);
                int i32 = this.f50170n;
                if (i32 == -1 || iM16970g6 == i32) {
                    if (!this.f50168l) {
                        this.f50168l = true;
                        this.f50169m = this.f50171o;
                        this.f50170n = iM16970g6;
                    }
                    this.f50164h = 3;
                    this.f50165i = 0;
                } else {
                    this.f50168l = false;
                    this.f50164h = 0;
                    this.f50165i = 0;
                    this.f50166j = 256;
                }
            }
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: b */
    public final void mo18337b() {
        this.f50175s = -9223372036854775807L;
        this.f50168l = false;
        this.f50164h = 0;
        this.f50165i = 0;
        this.f50166j = 256;
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
        this.f50161e = dVar.f50141e;
        dVar.m18349b();
        InterfaceC7522w interfaceC7522wMo7366q = interfaceC7509j.mo7366q(dVar.f50140d, 1);
        this.f50162f = interfaceC7522wMo7366q;
        this.f50176t = interfaceC7522wMo7366q;
        if (!this.f50157a) {
            this.f50163g = new C7506g();
            return;
        }
        dVar.m18348a();
        dVar.m18349b();
        InterfaceC7522w interfaceC7522wMo7366q2 = interfaceC7509j.mo7366q(dVar.f50140d, 5);
        this.f50163g = interfaceC7522wMo7366q2;
        C2416m.a aVar = new C2416m.a();
        dVar.m18349b();
        aVar.f12491a = dVar.f50141e;
        aVar.f12501k = "application/id3";
        interfaceC7522wMo7366q2.mo7388f(new C2416m(aVar));
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: e */
    public final void mo18340e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50175s = j10;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18353f(int i10, C10151t c10151t, byte[] bArr) {
        int iMin = Math.min(c10151t.f51440c - c10151t.f51439b, i10 - this.f50165i);
        c10151t.m19127b(bArr, this.f50165i, iMin);
        int i11 = this.f50165i + iMin;
        this.f50165i = i11;
        return i11 == i10;
    }
}
