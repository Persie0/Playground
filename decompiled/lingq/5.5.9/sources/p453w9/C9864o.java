package p453w9;

import com.google.android.exoplayer2.C2416m;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9864o implements InterfaceC9859j {

    /* JADX INFO: renamed from: b */
    public InterfaceC7522w f50322b;

    /* JADX INFO: renamed from: c */
    public boolean f50323c;

    /* JADX INFO: renamed from: e */
    public int f50325e;

    /* JADX INFO: renamed from: f */
    public int f50326f;

    /* JADX INFO: renamed from: a */
    public final C10151t f50321a = new C10151t(10);

    /* JADX INFO: renamed from: d */
    public long f50324d = -9223372036854775807L;

    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: a */
    public final void mo18336a(C10151t c10151t) {
        C10129a.m18993e(this.f50322b);
        if (this.f50323c) {
            int i10 = c10151t.f51440c - c10151t.f51439b;
            int i11 = this.f50326f;
            if (i11 < 10) {
                int iMin = Math.min(i10, 10 - i11);
                byte[] bArr = c10151t.f51438a;
                int i12 = c10151t.f51439b;
                C10151t c10151t2 = this.f50321a;
                System.arraycopy(bArr, i12, c10151t2.f51438a, this.f50326f, iMin);
                if (this.f50326f + iMin == 10) {
                    c10151t2.m19124E(0);
                    if (73 == c10151t2.m19145t() && 68 == c10151t2.m19145t()) {
                        if (51 == c10151t2.m19145t()) {
                            c10151t2.m19125F(3);
                            this.f50325e = c10151t2.m19144s() + 10;
                        }
                    }
                    C10145n.m19099g("Id3Reader", "Discarding invalid ID3 tag");
                    this.f50323c = false;
                    return;
                }
            }
            int iMin2 = Math.min(i10, this.f50325e - this.f50326f);
            this.f50322b.m15021c(iMin2, c10151t);
            this.f50326f += iMin2;
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: b */
    public final void mo18337b() {
        this.f50323c = false;
        this.f50324d = -9223372036854775807L;
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: c */
    public final void mo18338c() {
        int i10;
        C10129a.m18993e(this.f50322b);
        if (this.f50323c && (i10 = this.f50325e) != 0 && this.f50326f == i10) {
            long j10 = this.f50324d;
            if (j10 != -9223372036854775807L) {
                this.f50322b.mo7387e(j10, 1, i10, 0, null);
            }
            this.f50323c = false;
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: d */
    public final void mo18339d(InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        dVar.m18348a();
        dVar.m18349b();
        InterfaceC7522w interfaceC7522wMo7366q = interfaceC7509j.mo7366q(dVar.f50140d, 5);
        this.f50322b = interfaceC7522wMo7366q;
        C2416m.a aVar = new C2416m.a();
        dVar.m18349b();
        aVar.f12491a = dVar.f50141e;
        aVar.f12501k = "application/id3";
        interfaceC7522wMo7366q.mo7388f(new C2416m(aVar));
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: e */
    public final void mo18340e(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f50323c = true;
        if (j10 != -9223372036854775807L) {
            this.f50324d = j10;
        }
        this.f50325e = 0;
        this.f50326f = 0;
    }
}
