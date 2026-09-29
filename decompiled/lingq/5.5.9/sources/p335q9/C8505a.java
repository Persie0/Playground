package p335q9;

import com.google.android.exoplayer2.extractor.flv.C2407a;
import com.google.android.exoplayer2.extractor.flv.C2408b;
import java.io.IOException;
import p261m9.C7504e;
import p261m9.C7518s;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p479xa.C10129a;
import p479xa.C10151t;

/* JADX INFO: renamed from: q9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8505a implements InterfaceC7507h {

    /* JADX INFO: renamed from: f */
    public InterfaceC7509j f45759f;

    /* JADX INFO: renamed from: h */
    public boolean f45761h;

    /* JADX INFO: renamed from: i */
    public long f45762i;

    /* JADX INFO: renamed from: j */
    public int f45763j;

    /* JADX INFO: renamed from: k */
    public int f45764k;

    /* JADX INFO: renamed from: l */
    public int f45765l;

    /* JADX INFO: renamed from: m */
    public long f45766m;

    /* JADX INFO: renamed from: n */
    public boolean f45767n;

    /* JADX INFO: renamed from: o */
    public C2407a f45768o;

    /* JADX INFO: renamed from: p */
    public C2408b f45769p;

    /* JADX INFO: renamed from: a */
    public final C10151t f45754a = new C10151t(4);

    /* JADX INFO: renamed from: b */
    public final C10151t f45755b = new C10151t(9);

    /* JADX INFO: renamed from: c */
    public final C10151t f45756c = new C10151t(11);

    /* JADX INFO: renamed from: d */
    public final C10151t f45757d = new C10151t();

    /* JADX INFO: renamed from: e */
    public final C8506b f45758e = new C8506b();

    /* JADX INFO: renamed from: g */
    public int f45760g = 1;

    /* JADX INFO: renamed from: a */
    public final C10151t m16610a(C7504e c7504e) throws IOException {
        int i10 = this.f45765l;
        C10151t c10151t = this.f45757d;
        byte[] bArr = c10151t.f51438a;
        if (i10 > bArr.length) {
            c10151t.m19122C(new byte[Math.max(bArr.length * 2, i10)], 0);
        } else {
            c10151t.m19124E(0);
        }
        c10151t.m19123D(this.f45765l);
        c7504e.mo14993b(c10151t.f51438a, 0, this.f45765l, false);
        return c10151t;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        long j10;
        boolean z10;
        boolean z11;
        C10129a.m18993e(this.f45759f);
        while (true) {
            int i10 = this.f45760g;
            boolean z12 = false;
            if (i10 == 1) {
                C10151t c10151t = this.f45755b;
                if (((C7504e) interfaceC7508i).mo14993b(c10151t.f51438a, 0, 9, true)) {
                    c10151t.m19124E(0);
                    c10151t.m19125F(4);
                    int iM19145t = c10151t.m19145t();
                    boolean z13 = (iM19145t & 4) != 0;
                    z12 = (iM19145t & 1) != 0;
                    if (z13 && this.f45768o == null) {
                        this.f45768o = new C2407a(this.f45759f.mo7366q(8, 1));
                    }
                    if (z12 && this.f45769p == null) {
                        this.f45769p = new C2408b(this.f45759f.mo7366q(9, 2));
                    }
                    this.f45759f.mo7365i();
                    this.f45763j = (c10151t.m19129d() - 9) + 4;
                    this.f45760g = 2;
                    z12 = true;
                }
                if (!z12) {
                    return -1;
                }
            } else if (i10 == 2) {
                ((C7504e) interfaceC7508i).mo14998j(this.f45763j);
                this.f45763j = 0;
                this.f45760g = 3;
            } else if (i10 == 3) {
                C10151t c10151t2 = this.f45756c;
                if (((C7504e) interfaceC7508i).mo14993b(c10151t2.f51438a, 0, 11, true)) {
                    c10151t2.m19124E(0);
                    this.f45764k = c10151t2.m19145t();
                    this.f45765l = c10151t2.m19147v();
                    this.f45766m = c10151t2.m19147v();
                    this.f45766m = (((long) (c10151t2.m19145t() << 24)) | this.f45766m) * 1000;
                    c10151t2.m19125F(3);
                    this.f45760g = 4;
                    z12 = true;
                }
                if (!z12) {
                    return -1;
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                boolean z14 = this.f45761h;
                C8506b c8506b = this.f45758e;
                if (z14) {
                    j10 = this.f45762i + this.f45766m;
                } else {
                    j10 = c8506b.f45770b == -9223372036854775807L ? 0L : this.f45766m;
                }
                int i11 = this.f45764k;
                if (i11 != 8 || this.f45768o == null) {
                    if (i11 == 9 && this.f45769p != null) {
                        if (!this.f45767n) {
                            this.f45759f.mo7364c(new InterfaceC7520u.b(-9223372036854775807L));
                            this.f45767n = true;
                        }
                        C2408b c2408b = this.f45769p;
                        C10151t c10151tM16610a = m16610a((C7504e) interfaceC7508i);
                        if (c2408b.m7012a(c10151tM16610a) && c2408b.m7013b(j10, c10151tM16610a)) {
                            z10 = true;
                        }
                        z11 = true;
                    } else if (i11 != 18 || this.f45767n) {
                        ((C7504e) interfaceC7508i).mo14998j(this.f45765l);
                        z10 = false;
                        z11 = false;
                    } else {
                        C10151t c10151tM16610a2 = m16610a((C7504e) interfaceC7508i);
                        c8506b.getClass();
                        c8506b.m16614a(j10, c10151tM16610a2);
                        long j11 = c8506b.f45770b;
                        if (j11 != -9223372036854775807L) {
                            this.f45759f.mo7364c(new C7518s(j11, c8506b.f45772d, c8506b.f45771c));
                            this.f45767n = true;
                        }
                    }
                    z10 = false;
                    z11 = true;
                } else {
                    if (!this.f45767n) {
                        this.f45759f.mo7364c(new InterfaceC7520u.b(-9223372036854775807L));
                        this.f45767n = true;
                    }
                    C2407a c2407a = this.f45768o;
                    C10151t c10151tM16610a3 = m16610a((C7504e) interfaceC7508i);
                    c2407a.m7010a(c10151tM16610a3);
                    if (c2407a.m7011b(j10, c10151tM16610a3)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = true;
                }
                if (!this.f45761h && z10) {
                    this.f45761h = true;
                    this.f45762i = c8506b.f45770b == -9223372036854775807L ? -this.f45766m : 0L;
                }
                this.f45763j = 4;
                this.f45760g = 2;
                if (z11) {
                    return 0;
                }
            }
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        if (j10 == 0) {
            this.f45760g = 1;
            this.f45761h = false;
        } else {
            this.f45760g = 3;
        }
        this.f45763j = 0;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f45759f = interfaceC7509j;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        C10151t c10151t = this.f45754a;
        C7504e c7504e = (C7504e) interfaceC7508i;
        c7504e.mo14994c(c10151t.f51438a, 0, 3, false);
        c10151t.m19124E(0);
        if (c10151t.m19147v() != 4607062) {
            return false;
        }
        c7504e.mo14994c(c10151t.f51438a, 0, 2, false);
        c10151t.m19124E(0);
        if ((c10151t.m19150y() & 250) != 0) {
            return false;
        }
        c7504e.mo14994c(c10151t.f51438a, 0, 4, false);
        c10151t.m19124E(0);
        int iM19129d = c10151t.m19129d();
        c7504e.f41479f = 0;
        c7504e.m15001n(iM19129d, false);
        c7504e.mo14994c(c10151t.f51438a, 0, 4, false);
        c10151t.m19124E(0);
        return c10151t.m19129d() == 0;
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
