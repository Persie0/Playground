package p453w9;

import java.io.IOException;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9849c implements InterfaceC7507h {

    /* JADX INFO: renamed from: a */
    public final C9851d f50091a = new C9851d(null);

    /* JADX INFO: renamed from: b */
    public final C10151t f50092b = new C10151t(16384);

    /* JADX INFO: renamed from: c */
    public boolean f50093c;

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        C10151t c10151t = this.f50092b;
        int i10 = ((C7504e) interfaceC7508i).read(c10151t.f51438a, 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        c10151t.m19124E(0);
        c10151t.m19123D(i10);
        boolean z10 = this.f50093c;
        C9851d c9851d = this.f50091a;
        if (!z10) {
            c9851d.mo18340e(4, 0L);
            this.f50093c = true;
        }
        c9851d.mo18336a(c10151t);
        return 0;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        this.f50093c = false;
        this.f50091a.mo18337b();
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f50091a.mo18339d(interfaceC7509j, new InterfaceC9852d0.d(0, 1));
        interfaceC7509j.mo7365i();
        interfaceC7509j.mo7364c(new InterfaceC7520u.b(-9223372036854775807L));
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        C7504e c7504e;
        int i10;
        C10151t c10151t = new C10151t(10);
        int i11 = 0;
        while (true) {
            c7504e = (C7504e) interfaceC7508i;
            c7504e.mo14994c(c10151t.f51438a, 0, 10, false);
            c10151t.m19124E(0);
            if (c10151t.m19147v() != 4801587) {
                break;
            }
            c10151t.m19125F(3);
            int iM19144s = c10151t.m19144s();
            i11 += iM19144s + 10;
            c7504e.m15001n(iM19144s, false);
        }
        c7504e.f41479f = 0;
        c7504e.m15001n(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            c7504e.mo14994c(c10151t.f51438a, 0, 7, false);
            c10151t.m19124E(0);
            int iM19150y = c10151t.m19150y();
            if (iM19150y == 44096 || iM19150y == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = c10151t.f51438a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iM19150y == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                c7504e.m15001n(i10 - 7, false);
            } else {
                c7504e.f41479f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                c7504e.m15001n(i13, false);
                i12 = 0;
            }
        }
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
