package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p454wa.C9884i;
import p454wa.C9893r;
import p454wa.InterfaceC9882g;
import p454wa.InterfaceC9894s;
import p479xa.C10129a;
import p479xa.C10151t;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2477e implements InterfaceC9882g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9882g f13098a;

    /* JADX INFO: renamed from: b */
    public final int f13099b;

    /* JADX INFO: renamed from: c */
    public final a f13100c;

    /* JADX INFO: renamed from: d */
    public final byte[] f13101d;

    /* JADX INFO: renamed from: e */
    public int f13102e;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.e$a */
    public interface a {
    }

    public C2477e(C9893r c9893r, int i10, a aVar) {
        C10129a.m18990b(i10 > 0);
        this.f13098a = c9893r;
        this.f13099b = i10;
        this.f13100c = aVar;
        this.f13101d = new byte[1];
        this.f13102e = i10;
    }

    @Override // p454wa.InterfaceC9882g
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: e */
    public final long mo7273e(C9884i c9884i) {
        throw new UnsupportedOperationException();
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: g */
    public final void mo7274g(InterfaceC9894s interfaceC9894s) {
        interfaceC9894s.getClass();
        this.f13098a.mo7274g(interfaceC9894s);
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: h */
    public final Map<String, List<String>> mo7275h() {
        return this.f13098a.mo7275h();
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: k */
    public final Uri mo7276k() {
        return this.f13098a.mo7276k();
    }

    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long jMax;
        int i12 = this.f13102e;
        InterfaceC9882g interfaceC9882g = this.f13098a;
        if (i12 == 0) {
            byte[] bArr2 = this.f13101d;
            boolean z10 = false;
            if (interfaceC9882g.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 == 0) {
                    z10 = true;
                    break;
                }
                byte[] bArr3 = new byte[i13];
                int i14 = i13;
                int i15 = 0;
                while (true) {
                    if (i14 <= 0) {
                        while (i13 > 0) {
                            int i16 = i13 - 1;
                            if (bArr3[i16] != 0) {
                                break;
                            }
                            i13 = i16;
                        }
                        if (i13 > 0) {
                            C10151t c10151t = new C10151t(bArr3, i13);
                            C2496m.a aVar = (C2496m.a) this.f13100c;
                            if (aVar.f13363m) {
                                Map<String, String> map = C2496m.f13311h0;
                                jMax = Math.max(C2496m.this.m7370w(true), aVar.f13360j);
                            } else {
                                jMax = aVar.f13360j;
                            }
                            int i17 = c10151t.f51440c - c10151t.f51439b;
                            C2499p c2499p = aVar.f13362l;
                            c2499p.getClass();
                            c2499p.mo7386b(i17, c10151t);
                            c2499p.mo7387e(jMax, 1, i17, 0, null);
                            aVar.f13363m = true;
                        }
                        z10 = true;
                        break;
                    }
                    int i18 = interfaceC9882g.read(bArr3, i15, i14);
                    if (i18 == -1) {
                        break;
                    }
                    i15 += i18;
                    i14 -= i18;
                }
            }
            if (!z10) {
                return -1;
            }
            this.f13102e = this.f13099b;
        }
        int i19 = interfaceC9882g.read(bArr, i10, Math.min(this.f13102e, i11));
        if (i19 != -1) {
            this.f13102e -= i19;
        }
        return i19;
    }
}
