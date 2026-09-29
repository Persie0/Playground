package p453w9;

import com.google.android.exoplayer2.C2416m;
import p195j9.C6426c;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p357r6.C8739a;
import p479xa.C10129a;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9851d implements InterfaceC9859j {

    /* JADX INFO: renamed from: a */
    public final C8739a f50119a;

    /* JADX INFO: renamed from: b */
    public final C10151t f50120b;

    /* JADX INFO: renamed from: c */
    public final String f50121c;

    /* JADX INFO: renamed from: d */
    public String f50122d;

    /* JADX INFO: renamed from: e */
    public InterfaceC7522w f50123e;

    /* JADX INFO: renamed from: f */
    public int f50124f;

    /* JADX INFO: renamed from: g */
    public int f50125g;

    /* JADX INFO: renamed from: h */
    public boolean f50126h;

    /* JADX INFO: renamed from: i */
    public boolean f50127i;

    /* JADX INFO: renamed from: j */
    public long f50128j;

    /* JADX INFO: renamed from: k */
    public C2416m f50129k;

    /* JADX INFO: renamed from: l */
    public int f50130l;

    /* JADX INFO: renamed from: m */
    public long f50131m;

    public C9851d(String str) {
        C8739a c8739a = new C8739a(new byte[16], 16);
        this.f50119a = c8739a;
        this.f50120b = new C10151t((byte[]) c8739a.f46335d);
        this.f50124f = 0;
        this.f50125g = 0;
        this.f50126h = false;
        this.f50127i = false;
        this.f50131m = -9223372036854775807L;
        this.f50121c = str;
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: a */
    public final void mo18336a(C10151t c10151t) {
        int i10;
        boolean z10;
        C10129a.m18993e(this.f50123e);
        while (true) {
            while (true) {
                int i11 = c10151t.f51440c - c10151t.f51439b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = this.f50124f;
                C10151t c10151t2 = this.f50120b;
                boolean z11 = true;
                if (i12 == 0) {
                    while (true) {
                        while (true) {
                            i10 = 65;
                            if (c10151t.f51440c - c10151t.f51439b <= 0) {
                                z10 = false;
                                break;
                            } else if (!this.f50126h) {
                                this.f50126h = c10151t.m19145t() == 172;
                            }
                        }
                        int iM19145t = c10151t.m19145t();
                        this.f50126h = iM19145t == 172;
                        if (iM19145t == 64 || iM19145t == 65) {
                            this.f50127i = iM19145t == 65;
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        break;
                    }
                    this.f50124f = 1;
                    byte[] bArr = c10151t2.f51438a;
                    bArr[0] = -84;
                    if (!this.f50127i) {
                        i10 = 64;
                    }
                    bArr[1] = (byte) i10;
                    this.f50125g = 2;
                } else if (i12 == 1) {
                    byte[] bArr2 = c10151t2.f51438a;
                    int iMin = Math.min(i11, 16 - this.f50125g);
                    c10151t.m19127b(bArr2, this.f50125g, iMin);
                    int i13 = this.f50125g + iMin;
                    this.f50125g = i13;
                    if (i13 != 16) {
                        z11 = false;
                    }
                    if (!z11) {
                        break;
                    }
                    C8739a c8739a = this.f50119a;
                    c8739a.m16974k(0);
                    C6426c.a aVarM13049b = C6426c.m13049b(c8739a);
                    C2416m c2416m = this.f50129k;
                    int i14 = aVarM13049b.f36913a;
                    if (c2416m == null || 2 != c2416m.f12463T || i14 != c2416m.f12464U || !"audio/ac4".equals(c2416m.f12484l)) {
                        C2416m.a aVar = new C2416m.a();
                        aVar.f12491a = this.f50122d;
                        aVar.f12501k = "audio/ac4";
                        aVar.f12514x = 2;
                        aVar.f12515y = i14;
                        aVar.f12493c = this.f50121c;
                        C2416m c2416m2 = new C2416m(aVar);
                        this.f50129k = c2416m2;
                        this.f50123e.mo7388f(c2416m2);
                    }
                    this.f50130l = aVarM13049b.f36914b;
                    this.f50128j = (((long) aVarM13049b.f36915c) * 1000000) / ((long) this.f50129k.f12464U);
                    c10151t2.m19124E(0);
                    this.f50123e.m15021c(16, c10151t2);
                    this.f50124f = 2;
                } else if (i12 == 2) {
                    int iMin2 = Math.min(i11, this.f50130l - this.f50125g);
                    this.f50123e.m15021c(iMin2, c10151t);
                    int i15 = this.f50125g + iMin2;
                    this.f50125g = i15;
                    int i16 = this.f50130l;
                    if (i15 != i16) {
                        break;
                    }
                    long j10 = this.f50131m;
                    if (j10 != -9223372036854775807L) {
                        this.f50123e.mo7387e(j10, 1, i16, 0, null);
                        this.f50131m += this.f50128j;
                    }
                    this.f50124f = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: b */
    public final void mo18337b() {
        this.f50124f = 0;
        this.f50125g = 0;
        this.f50126h = false;
        this.f50127i = false;
        this.f50131m = -9223372036854775807L;
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
        this.f50122d = dVar.f50141e;
        dVar.m18349b();
        this.f50123e = interfaceC7509j.mo7366q(dVar.f50140d, 1);
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: e */
    public final void mo18340e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50131m = j10;
        }
    }
}
