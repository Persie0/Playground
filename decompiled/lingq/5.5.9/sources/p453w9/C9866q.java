package p453w9;

import com.google.android.exoplayer2.C2416m;
import p195j9.C6436m;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.q */
/* JADX INFO: loaded from: classes.dex */
public final class C9866q implements InterfaceC9859j {

    /* JADX INFO: renamed from: a */
    public final C10151t f50348a;

    /* JADX INFO: renamed from: b */
    public final C6436m.a f50349b;

    /* JADX INFO: renamed from: c */
    public final String f50350c;

    /* JADX INFO: renamed from: d */
    public InterfaceC7522w f50351d;

    /* JADX INFO: renamed from: e */
    public String f50352e;

    /* JADX INFO: renamed from: f */
    public int f50353f = 0;

    /* JADX INFO: renamed from: g */
    public int f50354g;

    /* JADX INFO: renamed from: h */
    public boolean f50355h;

    /* JADX INFO: renamed from: i */
    public boolean f50356i;

    /* JADX INFO: renamed from: j */
    public long f50357j;

    /* JADX INFO: renamed from: k */
    public int f50358k;

    /* JADX INFO: renamed from: l */
    public long f50359l;

    public C9866q(String str) {
        C10151t c10151t = new C10151t(4);
        this.f50348a = c10151t;
        c10151t.f51438a[0] = -1;
        this.f50349b = new C6436m.a();
        this.f50359l = -9223372036854775807L;
        this.f50350c = str;
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: a */
    public final void mo18336a(C10151t c10151t) {
        C10129a.m18993e(this.f50351d);
        while (true) {
            int i10 = c10151t.f51440c;
            int i11 = c10151t.f51439b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f50353f;
            C10151t c10151t2 = this.f50348a;
            if (i13 == 0) {
                byte[] bArr = c10151t.f51438a;
                while (true) {
                    if (i11 >= i10) {
                        c10151t.m19124E(i10);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f50356i && (b10 & 224) == 224;
                    this.f50356i = z10;
                    if (z11) {
                        c10151t.m19124E(i11 + 1);
                        this.f50356i = false;
                        c10151t2.f51438a[1] = bArr[i11];
                        this.f50354g = 2;
                        this.f50353f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i13 == 1) {
                int iMin = Math.min(i12, 4 - this.f50354g);
                c10151t.m19127b(c10151t2.f51438a, this.f50354g, iMin);
                int i14 = this.f50354g + iMin;
                this.f50354g = i14;
                if (i14 >= 4) {
                    c10151t2.m19124E(0);
                    int iM19129d = c10151t2.m19129d();
                    C6436m.a aVar = this.f50349b;
                    if (aVar.m13060a(iM19129d)) {
                        this.f50358k = aVar.f36960c;
                        if (!this.f50355h) {
                            long j10 = ((long) aVar.f36964g) * 1000000;
                            int i15 = aVar.f36961d;
                            this.f50357j = j10 / ((long) i15);
                            C2416m.a aVar2 = new C2416m.a();
                            aVar2.f12491a = this.f50352e;
                            aVar2.f12501k = aVar.f36959b;
                            aVar2.f12502l = 4096;
                            aVar2.f12514x = aVar.f36962e;
                            aVar2.f12515y = i15;
                            aVar2.f12493c = this.f50350c;
                            this.f50351d.mo7388f(new C2416m(aVar2));
                            this.f50355h = true;
                        }
                        c10151t2.m19124E(0);
                        this.f50351d.m15021c(4, c10151t2);
                        this.f50353f = 2;
                    } else {
                        this.f50354g = 0;
                        this.f50353f = 1;
                    }
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(i12, this.f50358k - this.f50354g);
                this.f50351d.m15021c(iMin2, c10151t);
                int i16 = this.f50354g + iMin2;
                this.f50354g = i16;
                int i17 = this.f50358k;
                if (i16 >= i17) {
                    long j11 = this.f50359l;
                    if (j11 != -9223372036854775807L) {
                        this.f50351d.mo7387e(j11, 1, i17, 0, null);
                        this.f50359l += this.f50357j;
                    }
                    this.f50354g = 0;
                    this.f50353f = 0;
                }
            }
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: b */
    public final void mo18337b() {
        this.f50353f = 0;
        this.f50354g = 0;
        this.f50356i = false;
        this.f50359l = -9223372036854775807L;
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
        this.f50352e = dVar.f50141e;
        dVar.m18349b();
        this.f50351d = interfaceC7509j.mo7366q(dVar.f50140d, 1);
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: e */
    public final void mo18340e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50359l = j10;
        }
    }
}
