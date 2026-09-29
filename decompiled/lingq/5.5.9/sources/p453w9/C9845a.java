package p453w9;

import java.io.IOException;
import p195j9.C6425b;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9845a implements InterfaceC7507h {

    /* JADX INFO: renamed from: a */
    public final C9847b f50063a = new C9847b(null);

    /* JADX INFO: renamed from: b */
    public final C10151t f50064b = new C10151t(2786);

    /* JADX INFO: renamed from: c */
    public boolean f50065c;

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        C10151t c10151t = this.f50064b;
        int i10 = ((C7504e) interfaceC7508i).read(c10151t.f51438a, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        c10151t.m19124E(0);
        c10151t.m19123D(i10);
        boolean z10 = this.f50065c;
        C9847b c9847b = this.f50063a;
        if (!z10) {
            c9847b.mo18340e(4, 0L);
            this.f50065c = true;
        }
        c9847b.mo18336a(c10151t);
        return 0;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        this.f50065c = false;
        this.f50063a.mo18337b();
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f50063a.mo18339d(interfaceC7509j, new InterfaceC9852d0.d(0, 1));
        interfaceC7509j.mo7365i();
        interfaceC7509j.mo7364c(new InterfaceC7520u.b(-9223372036854775807L));
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        C7504e c7504e;
        int iM13047a;
        C10151t c10151t = new C10151t(10);
        int i10 = 0;
        while (true) {
            c7504e = (C7504e) interfaceC7508i;
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
        int i11 = 0;
        int i12 = i10;
        while (true) {
            c7504e.mo14994c(c10151t.f51438a, 0, 6, false);
            c10151t.m19124E(0);
            if (c10151t.m19150y() != 2935) {
                c7504e.f41479f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                c7504e.m15001n(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = c10151t.f51438a;
                if (bArr.length < 6) {
                    iM13047a = -1;
                } else {
                    if (((bArr[5] & 248) >> 3) > 10) {
                        iM13047a = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                    } else {
                        byte b10 = bArr[4];
                        iM13047a = C6425b.m13047a((b10 & 192) >> 6, b10 & 63);
                    }
                }
                if (iM13047a == -1) {
                    return false;
                }
                c7504e.m15001n(iM13047a - 6, false);
            }
        }
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
