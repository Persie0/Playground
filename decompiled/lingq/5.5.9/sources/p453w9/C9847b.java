package p453w9;

import com.google.android.exoplayer2.C2416m;
import com.kochava.tracker.BuildConfig;
import p195j9.C6425b;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p357r6.C8739a;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9847b implements InterfaceC9859j {

    /* JADX INFO: renamed from: a */
    public final C8739a f50070a;

    /* JADX INFO: renamed from: b */
    public final C10151t f50071b;

    /* JADX INFO: renamed from: c */
    public final String f50072c;

    /* JADX INFO: renamed from: d */
    public String f50073d;

    /* JADX INFO: renamed from: e */
    public InterfaceC7522w f50074e;

    /* JADX INFO: renamed from: f */
    public int f50075f;

    /* JADX INFO: renamed from: g */
    public int f50076g;

    /* JADX INFO: renamed from: h */
    public boolean f50077h;

    /* JADX INFO: renamed from: i */
    public long f50078i;

    /* JADX INFO: renamed from: j */
    public C2416m f50079j;

    /* JADX INFO: renamed from: k */
    public int f50080k;

    /* JADX INFO: renamed from: l */
    public long f50081l;

    public C9847b(String str) {
        C8739a c8739a = new C8739a(new byte[BuildConfig.SDK_TRUNCATE_LENGTH], BuildConfig.SDK_TRUNCATE_LENGTH);
        this.f50070a = c8739a;
        this.f50071b = new C10151t((byte[]) c8739a.f46335d);
        this.f50075f = 0;
        this.f50081l = -9223372036854775807L;
        this.f50072c = str;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0223  */
    /* JADX WARN: Code duplicated, block: B:149:0x026c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: a */
    public final void mo18336a(C10151t c10151t) {
        int i10;
        int iM13047a;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        byte b10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        char c10;
        boolean z10;
        C10129a.m18993e(this.f50074e);
        while (true) {
            int i26 = c10151t.f51440c - c10151t.f51439b;
            if (i26 <= 0) {
                return;
            }
            int i27 = this.f50075f;
            C10151t c10151t2 = this.f50071b;
            if (i27 == 0) {
                while (true) {
                    if (c10151t.f51440c - c10151t.f51439b <= 0) {
                        c10 = 0;
                        z10 = false;
                        break;
                    } else if (this.f50077h) {
                        int iM19145t = c10151t.m19145t();
                        if (iM19145t == 119) {
                            c10 = 0;
                            this.f50077h = false;
                            z10 = true;
                            break;
                        }
                        this.f50077h = iM19145t == 11;
                    } else {
                        this.f50077h = c10151t.m19145t() == 11;
                    }
                }
                if (z10) {
                    this.f50075f = 1;
                    byte[] bArr = c10151t2.f51438a;
                    bArr[c10] = 11;
                    bArr[1] = 119;
                    this.f50076g = 2;
                }
            } else if (i27 == 1) {
                byte[] bArr2 = c10151t2.f51438a;
                int iMin = Math.min(i26, 128 - this.f50076g);
                c10151t.m19127b(bArr2, this.f50076g, iMin);
                int i28 = this.f50076g + iMin;
                this.f50076g = i28;
                if ((i28 == 128) != false) {
                    C8739a c8739a = this.f50070a;
                    c8739a.m16974k(0);
                    int iM16968e = c8739a.m16968e();
                    c8739a.m16976m(40);
                    Object[] objArr = c8739a.m16970g(5) > 10;
                    c8739a.m16974k(iM16968e);
                    int[] iArr = C6425b.f36909d;
                    int[] iArr2 = C6425b.f36907b;
                    if (objArr == true) {
                        c8739a.m16976m(16);
                        int iM16970g = c8739a.m16970g(2);
                        if (iM16970g == 0) {
                            b10 = 0;
                        } else if (iM16970g != 1) {
                            b10 = iM16970g != 2 ? (byte) -1 : (byte) 2;
                        } else {
                            b10 = 1;
                        }
                        c8739a.m16976m(3);
                        iM13047a = (c8739a.m16970g(11) + 1) * 2;
                        int iM16970g2 = c8739a.m16970g(2);
                        if (iM16970g2 == 3) {
                            i13 = C6425b.f36908c[c8739a.m16970g(2)];
                            i15 = 3;
                            i16 = 6;
                        } else {
                            int iM16970g3 = c8739a.m16970g(2);
                            int i29 = C6425b.f36906a[iM16970g3];
                            i13 = iArr2[iM16970g2];
                            i15 = iM16970g3;
                            i16 = i29;
                        }
                        i14 = i16 * 256;
                        int i30 = (iM13047a * i13) / (i16 * 32);
                        int iM16970g4 = c8739a.m16970g(3);
                        boolean zM16969f = c8739a.m16969f();
                        i12 = iArr[iM16970g4] + (zM16969f ? 1 : 0);
                        c8739a.m16976m(10);
                        if (c8739a.m16969f()) {
                            c8739a.m16976m(8);
                        }
                        if (iM16970g4 == 0) {
                            c8739a.m16976m(5);
                            if (c8739a.m16969f()) {
                                c8739a.m16976m(8);
                            }
                        }
                        if (b10 == 1 && c8739a.m16969f()) {
                            c8739a.m16976m(16);
                        }
                        if (c8739a.m16969f()) {
                            if (iM16970g4 > 2) {
                                c8739a.m16976m(2);
                            }
                            if ((iM16970g4 & 1) == 0 || iM16970g4 <= 2) {
                                i21 = 6;
                            } else {
                                i21 = 6;
                                c8739a.m16976m(6);
                            }
                            if ((iM16970g4 & 4) != 0) {
                                c8739a.m16976m(i21);
                            }
                            if (zM16969f && c8739a.m16969f()) {
                                c8739a.m16976m(5);
                            }
                            if (b10 != 0) {
                                i17 = i15;
                            } else {
                                if (c8739a.m16969f()) {
                                    i22 = 6;
                                    c8739a.m16976m(6);
                                } else {
                                    i22 = 6;
                                }
                                if (iM16970g4 == 0 && c8739a.m16969f()) {
                                    c8739a.m16976m(i22);
                                }
                                if (c8739a.m16969f()) {
                                    c8739a.m16976m(i22);
                                }
                                int iM16970g5 = c8739a.m16970g(2);
                                if (iM16970g5 == 1) {
                                    c8739a.m16976m(5);
                                    i24 = 2;
                                } else {
                                    if (iM16970g5 == 2) {
                                        c8739a.m16976m(12);
                                    } else if (iM16970g5 == 3) {
                                        int iM16970g6 = c8739a.m16970g(5);
                                        if (c8739a.m16969f()) {
                                            c8739a.m16976m(5);
                                            if (c8739a.m16969f()) {
                                                i25 = 4;
                                                c8739a.m16976m(4);
                                            } else {
                                                i25 = 4;
                                            }
                                            if (c8739a.m16969f()) {
                                                c8739a.m16976m(i25);
                                            }
                                            if (c8739a.m16969f()) {
                                                c8739a.m16976m(i25);
                                            }
                                            if (c8739a.m16969f()) {
                                                c8739a.m16976m(i25);
                                            }
                                            if (c8739a.m16969f()) {
                                                c8739a.m16976m(i25);
                                            }
                                            if (c8739a.m16969f()) {
                                                c8739a.m16976m(i25);
                                            }
                                            if (c8739a.m16969f()) {
                                                c8739a.m16976m(i25);
                                            }
                                            if (c8739a.m16969f()) {
                                                if (c8739a.m16969f()) {
                                                    c8739a.m16976m(i25);
                                                }
                                                if (c8739a.m16969f()) {
                                                    c8739a.m16976m(i25);
                                                }
                                            }
                                        }
                                        if (c8739a.m16969f()) {
                                            c8739a.m16976m(5);
                                            if (c8739a.m16969f()) {
                                                c8739a.m16976m(7);
                                                if (c8739a.m16969f()) {
                                                    i23 = 8;
                                                    c8739a.m16976m(8);
                                                } else {
                                                    i23 = 8;
                                                }
                                            } else {
                                                i23 = 8;
                                            }
                                        } else {
                                            i23 = 8;
                                        }
                                        i24 = 2;
                                        c8739a.m16976m((iM16970g6 + 2) * i23);
                                        c8739a.m16966c();
                                    }
                                    i24 = 2;
                                }
                                if (iM16970g4 < i24) {
                                    if (c8739a.m16969f()) {
                                        c8739a.m16976m(14);
                                    }
                                    if (iM16970g4 == 0 && c8739a.m16969f()) {
                                        c8739a.m16976m(14);
                                    }
                                }
                                if (c8739a.m16969f()) {
                                    i17 = i15;
                                    if (i17 == 0) {
                                        c8739a.m16976m(5);
                                    } else {
                                        int i31 = 5;
                                        int i32 = 0;
                                        while (i32 < i16) {
                                            if (c8739a.m16969f()) {
                                                c8739a.m16976m(i31);
                                            }
                                            i32++;
                                            i31 = 5;
                                        }
                                    }
                                } else {
                                    i17 = i15;
                                }
                            }
                        } else {
                            i17 = i15;
                        }
                        if (c8739a.m16969f()) {
                            c8739a.m16976m(5);
                            if (iM16970g4 == 2) {
                                c8739a.m16976m(4);
                            }
                            if (iM16970g4 >= 6) {
                                c8739a.m16976m(2);
                            }
                            if (c8739a.m16969f()) {
                                i20 = 8;
                                c8739a.m16976m(8);
                            } else {
                                i20 = 8;
                            }
                            if (iM16970g4 == 0 && c8739a.m16969f()) {
                                c8739a.m16976m(i20);
                            }
                            i18 = 3;
                            if (iM16970g2 < 3) {
                                c8739a.m16975l();
                            }
                        } else {
                            i18 = 3;
                        }
                        if (b10 == 0 && i17 != i18) {
                            c8739a.m16975l();
                        }
                        if (b10 == 2 && (i17 == i18 || c8739a.m16969f())) {
                            i19 = 6;
                            c8739a.m16976m(6);
                        } else {
                            i19 = 6;
                        }
                        str = (c8739a.m16969f() && c8739a.m16970g(i19) == 1 && c8739a.m16970g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i10 = i30;
                    } else {
                        c8739a.m16976m(32);
                        int iM16970g7 = c8739a.m16970g(2);
                        String str2 = iM16970g7 == 3 ? null : "audio/ac3";
                        int iM16970g8 = c8739a.m16970g(6);
                        i10 = C6425b.f36910e[iM16970g8 / 2] * 1000;
                        iM13047a = C6425b.m13047a(iM16970g7, iM16970g8);
                        c8739a.m16976m(8);
                        int iM16970g9 = c8739a.m16970g(3);
                        if ((iM16970g9 & 1) == 0 || iM16970g9 == 1) {
                            i11 = 2;
                        } else {
                            i11 = 2;
                            c8739a.m16976m(2);
                        }
                        if ((iM16970g9 & 4) != 0) {
                            c8739a.m16976m(i11);
                        }
                        if (iM16970g9 == i11) {
                            c8739a.m16976m(i11);
                        }
                        int i33 = iM16970g7 < 3 ? iArr2[iM16970g7] : -1;
                        i12 = iArr[iM16970g9] + (c8739a.m16969f() ? 1 : 0);
                        i13 = i33;
                        String str3 = str2;
                        i14 = 1536;
                        str = str3;
                    }
                    C2416m c2416m = this.f50079j;
                    if (c2416m == null || i12 != c2416m.f12463T || i13 != c2416m.f12464U || !C10134c0.m19034a(str, c2416m.f12484l)) {
                        C2416m.a aVar = new C2416m.a();
                        aVar.f12491a = this.f50073d;
                        aVar.f12501k = str;
                        aVar.f12514x = i12;
                        aVar.f12515y = i13;
                        aVar.f12493c = this.f50072c;
                        aVar.f12497g = i10;
                        if ("audio/ac3".equals(str)) {
                            aVar.f12496f = i10;
                        }
                        C2416m c2416m2 = new C2416m(aVar);
                        this.f50079j = c2416m2;
                        this.f50074e.mo7388f(c2416m2);
                    }
                    this.f50080k = iM13047a;
                    this.f50078i = (((long) i14) * 1000000) / ((long) this.f50079j.f12464U);
                    c10151t2.m19124E(0);
                    this.f50074e.m15021c(BuildConfig.SDK_TRUNCATE_LENGTH, c10151t2);
                    this.f50075f = 2;
                }
            } else if (i27 == 2) {
                int iMin2 = Math.min(i26, this.f50080k - this.f50076g);
                this.f50074e.m15021c(iMin2, c10151t);
                int i34 = this.f50076g + iMin2;
                this.f50076g = i34;
                int i35 = this.f50080k;
                if (i34 == i35) {
                    long j10 = this.f50081l;
                    if (j10 != -9223372036854775807L) {
                        this.f50074e.mo7387e(j10, 1, i35, 0, null);
                        this.f50081l += this.f50078i;
                    }
                    this.f50075f = 0;
                }
            }
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: b */
    public final void mo18337b() {
        this.f50075f = 0;
        this.f50076g = 0;
        this.f50077h = false;
        this.f50081l = -9223372036854775807L;
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
        this.f50073d = dVar.f50141e;
        dVar.m18349b();
        this.f50074e = interfaceC7509j.mo7366q(dVar.f50140d, 1);
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: e */
    public final void mo18340e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50081l = j10;
        }
    }
}
