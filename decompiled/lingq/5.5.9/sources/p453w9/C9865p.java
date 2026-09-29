package p453w9;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import p195j9.C6424a;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p357r6.C8739a;
import p479xa.C10129a;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9865p implements InterfaceC9859j {

    /* JADX INFO: renamed from: a */
    public final String f50327a;

    /* JADX INFO: renamed from: b */
    public final C10151t f50328b;

    /* JADX INFO: renamed from: c */
    public final C8739a f50329c;

    /* JADX INFO: renamed from: d */
    public InterfaceC7522w f50330d;

    /* JADX INFO: renamed from: e */
    public String f50331e;

    /* JADX INFO: renamed from: f */
    public C2416m f50332f;

    /* JADX INFO: renamed from: g */
    public int f50333g;

    /* JADX INFO: renamed from: h */
    public int f50334h;

    /* JADX INFO: renamed from: i */
    public int f50335i;

    /* JADX INFO: renamed from: j */
    public int f50336j;

    /* JADX INFO: renamed from: k */
    public long f50337k;

    /* JADX INFO: renamed from: l */
    public boolean f50338l;

    /* JADX INFO: renamed from: m */
    public int f50339m;

    /* JADX INFO: renamed from: n */
    public int f50340n;

    /* JADX INFO: renamed from: o */
    public int f50341o;

    /* JADX INFO: renamed from: p */
    public boolean f50342p;

    /* JADX INFO: renamed from: q */
    public long f50343q;

    /* JADX INFO: renamed from: r */
    public int f50344r;

    /* JADX INFO: renamed from: s */
    public long f50345s;

    /* JADX INFO: renamed from: t */
    public int f50346t;

    /* JADX INFO: renamed from: u */
    public String f50347u;

    public C9865p(String str) {
        this.f50327a = str;
        C10151t c10151t = new C10151t(1024);
        this.f50328b = c10151t;
        byte[] bArr = c10151t.f51438a;
        this.f50329c = new C8739a(bArr, bArr.length);
        this.f50337k = -9223372036854775807L;
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: a */
    public final void mo18336a(C10151t c10151t) throws ParserException {
        int iM16970g;
        boolean zM16969f;
        C10129a.m18993e(this.f50330d);
        while (true) {
            int i10 = c10151t.f51440c - c10151t.f51439b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f50333g;
            if (i11 != 0) {
                if (i11 != 1) {
                    C10151t c10151t2 = this.f50328b;
                    C8739a c8739a = this.f50329c;
                    if (i11 == 2) {
                        int iM19145t = ((this.f50336j & (-225)) << 8) | c10151t.m19145t();
                        this.f50335i = iM19145t;
                        if (iM19145t > c10151t2.f51438a.length) {
                            c10151t2.m19121B(iM19145t);
                            byte[] bArr = c10151t2.f51438a;
                            c8739a.getClass();
                            c8739a.m16973j(bArr, bArr.length);
                        }
                        this.f50334h = 0;
                        this.f50333g = 3;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(i10, this.f50335i - this.f50334h);
                        c10151t.m19127b((byte[]) c8739a.f46335d, this.f50334h, iMin);
                        int i12 = this.f50334h + iMin;
                        this.f50334h = i12;
                        if (i12 == this.f50335i) {
                            c8739a.m16974k(0);
                            if (c8739a.m16969f()) {
                                if (this.f50338l) {
                                }
                                this.f50333g = 0;
                            } else {
                                this.f50338l = true;
                                int iM16970g2 = c8739a.m16970g(1);
                                int iM16970g3 = iM16970g2 == 1 ? c8739a.m16970g(1) : 0;
                                this.f50339m = iM16970g3;
                                if (iM16970g3 != 0) {
                                    throw ParserException.m6770a(null, null);
                                }
                                if (iM16970g2 == 1) {
                                    c8739a.m16970g((c8739a.m16970g(2) + 1) * 8);
                                }
                                if (!c8739a.m16969f()) {
                                    throw ParserException.m6770a(null, null);
                                }
                                this.f50340n = c8739a.m16970g(6);
                                int iM16970g4 = c8739a.m16970g(4);
                                int iM16970g5 = c8739a.m16970g(3);
                                if (iM16970g4 != 0 || iM16970g5 != 0) {
                                    throw ParserException.m6770a(null, null);
                                }
                                if (iM16970g2 == 0) {
                                    int iM16968e = c8739a.m16968e();
                                    int iM16965b = c8739a.m16965b();
                                    C6424a.a aVarM13046b = C6424a.m13046b(c8739a, true);
                                    this.f50347u = aVarM13046b.f36905c;
                                    this.f50344r = aVarM13046b.f36903a;
                                    this.f50346t = aVarM13046b.f36904b;
                                    int iM16965b2 = iM16965b - c8739a.m16965b();
                                    c8739a.m16974k(iM16968e);
                                    byte[] bArr2 = new byte[(iM16965b2 + 7) / 8];
                                    c8739a.m16971h(bArr2, iM16965b2);
                                    C2416m.a aVar = new C2416m.a();
                                    aVar.f12491a = this.f50331e;
                                    aVar.f12501k = "audio/mp4a-latm";
                                    aVar.f12498h = this.f50347u;
                                    aVar.f12514x = this.f50346t;
                                    aVar.f12515y = this.f50344r;
                                    aVar.f12503m = Collections.singletonList(bArr2);
                                    aVar.f12493c = this.f50327a;
                                    C2416m c2416m = new C2416m(aVar);
                                    if (!c2416m.equals(this.f50332f)) {
                                        this.f50332f = c2416m;
                                        this.f50345s = 1024000000 / ((long) c2416m.f12464U);
                                        this.f50330d.mo7388f(c2416m);
                                    }
                                } else {
                                    int iM16970g6 = c8739a.m16970g((c8739a.m16970g(2) + 1) * 8);
                                    int iM16965b3 = c8739a.m16965b();
                                    C6424a.a aVarM13046b2 = C6424a.m13046b(c8739a, true);
                                    this.f50347u = aVarM13046b2.f36905c;
                                    this.f50344r = aVarM13046b2.f36903a;
                                    this.f50346t = aVarM13046b2.f36904b;
                                    c8739a.m16976m(iM16970g6 - (iM16965b3 - c8739a.m16965b()));
                                }
                                int iM16970g7 = c8739a.m16970g(3);
                                this.f50341o = iM16970g7;
                                if (iM16970g7 == 0) {
                                    c8739a.m16976m(8);
                                } else if (iM16970g7 == 1) {
                                    c8739a.m16976m(9);
                                } else if (iM16970g7 == 3 || iM16970g7 == 4 || iM16970g7 == 5) {
                                    c8739a.m16976m(6);
                                } else {
                                    if (iM16970g7 != 6 && iM16970g7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c8739a.m16976m(1);
                                }
                                boolean zM16969f2 = c8739a.m16969f();
                                this.f50342p = zM16969f2;
                                this.f50343q = 0L;
                                if (zM16969f2) {
                                    if (iM16970g2 == 1) {
                                        this.f50343q = c8739a.m16970g((c8739a.m16970g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zM16969f = c8739a.m16969f();
                                            this.f50343q = (this.f50343q << 8) + ((long) c8739a.m16970g(8));
                                        } while (zM16969f);
                                    }
                                }
                                if (c8739a.m16969f()) {
                                    c8739a.m16976m(8);
                                }
                            }
                            if (this.f50339m != 0) {
                                throw ParserException.m6770a(null, null);
                            }
                            if (this.f50340n != 0) {
                                throw ParserException.m6770a(null, null);
                            }
                            if (this.f50341o != 0) {
                                throw ParserException.m6770a(null, null);
                            }
                            int i13 = 0;
                            do {
                                iM16970g = c8739a.m16970g(8);
                                i13 += iM16970g;
                            } while (iM16970g == 255);
                            int iM16968e2 = c8739a.m16968e();
                            if ((iM16968e2 & 7) == 0) {
                                c10151t2.m19124E(iM16968e2 >> 3);
                            } else {
                                c8739a.m16971h(c10151t2.f51438a, i13 * 8);
                                c10151t2.m19124E(0);
                            }
                            this.f50330d.m15021c(i13, c10151t2);
                            long j10 = this.f50337k;
                            if (j10 != -9223372036854775807L) {
                                this.f50330d.mo7387e(j10, 1, i13, 0, null);
                                this.f50337k += this.f50345s;
                            }
                            if (this.f50342p) {
                                c8739a.m16976m((int) this.f50343q);
                            }
                            this.f50333g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iM19145t2 = c10151t.m19145t();
                    if ((iM19145t2 & 224) == 224) {
                        this.f50336j = iM19145t2;
                        this.f50333g = 2;
                    } else if (iM19145t2 != 86) {
                        this.f50333g = 0;
                    }
                }
            } else if (c10151t.m19145t() == 86) {
                this.f50333g = 1;
            }
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: b */
    public final void mo18337b() {
        this.f50333g = 0;
        this.f50337k = -9223372036854775807L;
        this.f50338l = false;
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
        this.f50330d = interfaceC7509j.mo7366q(dVar.f50140d, 1);
        dVar.m18349b();
        this.f50331e = dVar.f50141e;
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: e */
    public final void mo18340e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50337k = j10;
        }
    }
}
