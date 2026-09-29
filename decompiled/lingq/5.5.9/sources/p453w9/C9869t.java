package p453w9;

import android.support.v4.media.C0141b;
import com.google.android.exoplayer2.ParserException;
import p261m9.InterfaceC7509j;
import p357r6.C8739a;
import p479xa.C10129a;
import p479xa.C10130a0;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.t */
/* JADX INFO: loaded from: classes.dex */
public final class C9869t implements InterfaceC9852d0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9859j f50368a;

    /* JADX INFO: renamed from: b */
    public final C8739a f50369b = new C8739a(new byte[10], 10);

    /* JADX INFO: renamed from: c */
    public int f50370c = 0;

    /* JADX INFO: renamed from: d */
    public int f50371d;

    /* JADX INFO: renamed from: e */
    public C10130a0 f50372e;

    /* JADX INFO: renamed from: f */
    public boolean f50373f;

    /* JADX INFO: renamed from: g */
    public boolean f50374g;

    /* JADX INFO: renamed from: h */
    public boolean f50375h;

    /* JADX INFO: renamed from: i */
    public int f50376i;

    /* JADX INFO: renamed from: j */
    public int f50377j;

    /* JADX INFO: renamed from: k */
    public boolean f50378k;

    /* JADX INFO: renamed from: l */
    public long f50379l;

    public C9869t(InterfaceC9859j interfaceC9859j) {
        this.f50368a = interfaceC9859j;
    }

    @Override // p453w9.InterfaceC9852d0
    /* JADX INFO: renamed from: a */
    public final void mo18344a(int i10, C10151t c10151t) throws ParserException {
        boolean z10;
        C10129a.m18993e(this.f50372e);
        int i11 = i10 & 1;
        InterfaceC9859j interfaceC9859j = this.f50368a;
        int i12 = -1;
        int i13 = 3;
        int i14 = 2;
        if (i11 != 0) {
            int i15 = this.f50370c;
            if (i15 != 0 && i15 != 1) {
                if (i15 == 2) {
                    C10145n.m19099g("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f50377j != -1) {
                        C10145n.m19099g("PesReader", "Unexpected start indicator: expected " + this.f50377j + " more bytes");
                    }
                    interfaceC9859j.mo18338c();
                }
            }
            this.f50370c = 1;
            this.f50371d = 0;
        }
        int i16 = i10;
        while (true) {
            int i17 = c10151t.f51440c;
            int i18 = c10151t.f51439b;
            int i19 = i17 - i18;
            if (i19 <= 0) {
                return;
            }
            int i20 = this.f50370c;
            if (i20 != 0) {
                C8739a c8739a = this.f50369b;
                if (i20 != 1) {
                    if (i20 == i14) {
                        if (m18365d(Math.min(10, this.f50376i), c10151t, (byte[]) c8739a.f46335d) && m18365d(this.f50376i, c10151t, null)) {
                            c8739a.m16974k(0);
                            this.f50379l = -9223372036854775807L;
                            if (this.f50373f) {
                                c8739a.m16976m(4);
                                long jM16970g = ((long) c8739a.m16970g(i13)) << 30;
                                c8739a.m16976m(1);
                                long jM16970g2 = jM16970g | ((long) (c8739a.m16970g(15) << 15));
                                c8739a.m16976m(1);
                                long jM16970g3 = jM16970g2 | ((long) c8739a.m16970g(15));
                                c8739a.m16976m(1);
                                if (!this.f50375h && this.f50374g) {
                                    c8739a.m16976m(4);
                                    long jM16970g4 = ((long) c8739a.m16970g(3)) << 30;
                                    c8739a.m16976m(1);
                                    long jM16970g5 = ((long) (c8739a.m16970g(15) << 15)) | jM16970g4;
                                    c8739a.m16976m(1);
                                    long jM16970g6 = jM16970g5 | ((long) c8739a.m16970g(15));
                                    c8739a.m16976m(1);
                                    this.f50372e.m19004b(jM16970g6);
                                    this.f50375h = true;
                                }
                                this.f50379l = this.f50372e.m19004b(jM16970g3);
                            }
                            i16 |= this.f50378k ? 4 : 0;
                            interfaceC9859j.mo18340e(i16, this.f50379l);
                            i13 = 3;
                            this.f50370c = 3;
                            this.f50371d = 0;
                        }
                        i12 = -1;
                        i14 = 2;
                    } else {
                        if (i20 != i13) {
                            throw new IllegalStateException();
                        }
                        int i21 = this.f50377j;
                        int i22 = i21 == i12 ? 0 : i19 - i21;
                        if (i22 > 0) {
                            i19 -= i22;
                            c10151t.m19123D(i18 + i19);
                        }
                        interfaceC9859j.mo18336a(c10151t);
                        int i23 = this.f50377j;
                        if (i23 != i12) {
                            int i24 = i23 - i19;
                            this.f50377j = i24;
                            if (i24 == 0) {
                                interfaceC9859j.mo18338c();
                                this.f50370c = 1;
                                this.f50371d = 0;
                            }
                        }
                    }
                } else if (m18365d(9, c10151t, (byte[]) c8739a.f46335d)) {
                    c8739a.m16974k(0);
                    int iM16970g = c8739a.m16970g(24);
                    if (iM16970g != 1) {
                        C0141b.m620p("Unexpected start code prefix: ", iM16970g, "PesReader");
                        i12 = -1;
                        this.f50377j = -1;
                        i14 = 2;
                        z10 = false;
                    } else {
                        c8739a.m16976m(8);
                        int iM16970g2 = c8739a.m16970g(16);
                        c8739a.m16976m(5);
                        this.f50378k = c8739a.m16969f();
                        c8739a.m16976m(2);
                        this.f50373f = c8739a.m16969f();
                        this.f50374g = c8739a.m16969f();
                        c8739a.m16976m(6);
                        int iM16970g3 = c8739a.m16970g(8);
                        this.f50376i = iM16970g3;
                        if (iM16970g2 == 0) {
                            i12 = -1;
                            this.f50377j = -1;
                        } else {
                            int i25 = ((iM16970g2 + 6) - 9) - iM16970g3;
                            this.f50377j = i25;
                            if (i25 < 0) {
                                C10145n.m19099g("PesReader", "Found negative packet payload size: " + this.f50377j);
                                i12 = -1;
                                this.f50377j = -1;
                            } else {
                                i12 = -1;
                            }
                        }
                        i14 = 2;
                        z10 = true;
                    }
                    this.f50370c = z10 ? i14 : 0;
                    this.f50371d = 0;
                } else {
                    i12 = -1;
                    i14 = 2;
                }
            } else {
                c10151t.m19125F(i19);
            }
        }
    }

    @Override // p453w9.InterfaceC9852d0
    /* JADX INFO: renamed from: b */
    public final void mo18345b() {
        this.f50370c = 0;
        this.f50371d = 0;
        this.f50375h = false;
        this.f50368a.mo18337b();
    }

    @Override // p453w9.InterfaceC9852d0
    /* JADX INFO: renamed from: c */
    public final void mo18346c(C10130a0 c10130a0, InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        this.f50372e = c10130a0;
        this.f50368a.mo18339d(interfaceC7509j, dVar);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18365d(int i10, C10151t c10151t, byte[] bArr) {
        int iMin = Math.min(c10151t.f51440c - c10151t.f51439b, i10 - this.f50371d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c10151t.m19125F(iMin);
        } else {
            c10151t.m19127b(bArr, this.f50371d, iMin);
        }
        int i11 = this.f50371d + iMin;
        this.f50371d = i11;
        return i11 == i10;
    }
}
