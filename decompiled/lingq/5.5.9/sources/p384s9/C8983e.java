package p384s9;

import java.io.IOException;
import p261m9.C7504e;
import p479xa.C10151t;

/* JADX INFO: renamed from: s9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8983e {

    /* JADX INFO: renamed from: a */
    public final C10151t f47156a = new C10151t(8);

    /* JADX INFO: renamed from: b */
    public int f47157b;

    /* JADX INFO: renamed from: a */
    public final long m17228a(C7504e c7504e) throws IOException {
        C10151t c10151t = this.f47156a;
        int i10 = 0;
        c7504e.mo14994c(c10151t.f51438a, 0, 1, false);
        int i11 = c10151t.f51438a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        c7504e.mo14994c(c10151t.f51438a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (c10151t.f51438a[i10] & 255) + (i14 << 8);
        }
        this.f47157b = i13 + 1 + this.f47157b;
        return i14;
    }
}
