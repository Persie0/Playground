package p453w9;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import p261m9.C7503d;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p357r6.C8739a;
import p479xa.C10129a;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9853e implements InterfaceC7507h {

    /* JADX INFO: renamed from: a */
    public final int f50142a;

    /* JADX INFO: renamed from: b */
    public final C9855f f50143b;

    /* JADX INFO: renamed from: c */
    public final C10151t f50144c;

    /* JADX INFO: renamed from: d */
    public final C10151t f50145d;

    /* JADX INFO: renamed from: e */
    public final C8739a f50146e;

    /* JADX INFO: renamed from: f */
    public InterfaceC7509j f50147f;

    /* JADX INFO: renamed from: g */
    public long f50148g;

    /* JADX INFO: renamed from: h */
    public long f50149h;

    /* JADX INFO: renamed from: i */
    public int f50150i;

    /* JADX INFO: renamed from: j */
    public boolean f50151j;

    /* JADX INFO: renamed from: k */
    public boolean f50152k;

    /* JADX INFO: renamed from: l */
    public boolean f50153l;

    public C9853e(int i10) {
        this.f50142a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f50143b = new C9855f(null, true);
        this.f50144c = new C10151t(2048);
        this.f50150i = -1;
        this.f50149h = -1L;
        C10151t c10151t = new C10151t(10);
        this.f50145d = c10151t;
        byte[] bArr = c10151t.f51438a;
        this.f50146e = new C8739a(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public final int m18350a(C7504e c7504e) throws IOException {
        int i10 = 0;
        while (true) {
            C10151t c10151t = this.f50145d;
            c7504e.mo14994c(c10151t.f51438a, 0, 10, false);
            c10151t.m19124E(0);
            if (c10151t.m19147v() != 4801587) {
                break;
            }
            c10151t.m19125F(3);
            int iM19144s = c10151t.m19144s();
            i10 += iM19144s + 10;
            c7504e.m15001n(iM19144s, false);
        }
        c7504e.f41479f = 0;
        c7504e.m15001n(i10, false);
        if (this.f50149h == -1) {
            this.f50149h = i10;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x011b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        int i10;
        boolean z10;
        C10129a.m18993e(this.f50147f);
        C7504e c7504e = (C7504e) interfaceC7508i;
        long j10 = c7504e.f41476c;
        int i11 = this.f50142a;
        int i12 = i11 & 2;
        int i13 = 0;
        boolean z11 = true;
        if ((i12 == 0 && ((i11 & 1) == 0 || j10 == -1)) ? false : true) {
            C8739a c8739a = this.f50146e;
            C10151t c10151t = this.f50145d;
            if (this.f50151j) {
                i10 = -1;
            } else {
                this.f50150i = -1;
                c7504e.f41479f = 0;
                long j11 = 0;
                if (c7504e.f41477d == 0) {
                    m18350a(c7504e);
                }
                int i14 = 0;
                while (true) {
                    try {
                        C7504e c7504e2 = (C7504e) interfaceC7508i;
                        if (!c7504e2.mo14994c(c10151t.f51438a, i13, 2, z11)) {
                            break;
                        }
                        c10151t.m19124E(i13);
                        if (((c10151t.m19150y() & 65526) == 65520 ? z11 : i13) == 0) {
                            i14 = i13;
                            break;
                        }
                        if (!c7504e2.mo14994c(c10151t.f51438a, i13, 4, z11)) {
                            break;
                        }
                        c8739a.m16974k(14);
                        int iM16970g = c8739a.m16970g(13);
                        if (iM16970g <= 6) {
                            this.f50151j = z11;
                            throw ParserException.m6770a("Malformed ADTS stream", null);
                        }
                        j11 += (long) iM16970g;
                        i14++;
                        if (i14 == 1000 || !c7504e2.m15001n(iM16970g - 6, true)) {
                            break;
                            break;
                        }
                        z11 = true;
                        i13 = 0;
                    } catch (EOFException unused) {
                    }
                }
                c7504e.f41479f = 0;
                if (i14 > 0) {
                    this.f50150i = (int) (j11 / ((long) i14));
                    i10 = -1;
                } else {
                    i10 = -1;
                    this.f50150i = -1;
                }
                this.f50151j = true;
            }
        } else {
            i10 = -1;
        }
        C10151t c10151t2 = this.f50144c;
        int i15 = c7504e.read(c10151t2.f51438a, 0, 2048);
        boolean z12 = i15 == i10;
        boolean z13 = this.f50153l;
        C9855f c9855f = this.f50143b;
        if (z13) {
            z10 = true;
        } else {
            boolean z14 = (i11 & 1) != 0 && this.f50150i > 0;
            if (z14 && c9855f.f50173q == -9223372036854775807L && !z12) {
                z10 = true;
            } else {
                if (z14) {
                    long j12 = c9855f.f50173q;
                    if (j12 != -9223372036854775807L) {
                        InterfaceC7509j interfaceC7509j = this.f50147f;
                        boolean z15 = i12 != 0;
                        int i16 = this.f50150i;
                        interfaceC7509j.mo7364c(new C7503d((int) (((((long) i16) * 8) * 1000000) / j12), i16, j10, this.f50149h, z15));
                    } else {
                        this.f50147f.mo7364c(new InterfaceC7520u.b(-9223372036854775807L));
                    }
                } else {
                    this.f50147f.mo7364c(new InterfaceC7520u.b(-9223372036854775807L));
                }
                z10 = true;
                this.f50153l = true;
            }
        }
        if (z12) {
            return -1;
        }
        c10151t2.m19124E(0);
        c10151t2.m19123D(i15);
        if (!this.f50152k) {
            c9855f.mo18340e(4, this.f50148g);
            this.f50152k = z10;
        }
        c9855f.mo18336a(c10151t2);
        return 0;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        this.f50152k = false;
        this.f50143b.mo18337b();
        this.f50148g = j11;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f50147f = interfaceC7509j;
        this.f50143b.mo18339d(interfaceC7509j, new InterfaceC9852d0.d(0, 1));
        interfaceC7509j.mo7365i();
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        C7504e c7504e = (C7504e) interfaceC7508i;
        int iM18350a = m18350a(c7504e);
        int i10 = iM18350a;
        int i11 = 0;
        int i12 = 0;
        do {
            C10151t c10151t = this.f50145d;
            c7504e.mo14994c(c10151t.f51438a, 0, 2, false);
            c10151t.m19124E(0);
            if ((c10151t.m19150y() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                c7504e.mo14994c(c10151t.f51438a, 0, 4, false);
                C8739a c8739a = this.f50146e;
                c8739a.m16974k(14);
                int iM16970g = c8739a.m16970g(13);
                if (iM16970g <= 6) {
                    i10++;
                    c7504e.f41479f = 0;
                    c7504e.m15001n(i10, false);
                } else {
                    c7504e.m15001n(iM16970g - 6, false);
                    i12 += iM16970g;
                }
            } else {
                i10++;
                c7504e.f41479f = 0;
                c7504e.m15001n(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iM18350a < 8192);
        return false;
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
