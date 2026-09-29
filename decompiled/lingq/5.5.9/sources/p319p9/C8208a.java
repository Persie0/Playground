package p319p9;

import java.io.IOException;
import java.util.Objects;
import p261m9.AbstractC7500a;
import p261m9.C7504e;
import p261m9.C7512m;
import p261m9.C7515p;
import p402u0.C9370m;
import p479xa.C10151t;

/* JADX INFO: renamed from: p9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8208a extends AbstractC7500a {

    /* JADX INFO: renamed from: p9.a$a */
    public static final class a implements AbstractC7500a.f {

        /* JADX INFO: renamed from: a */
        public final C7515p f44416a;

        /* JADX INFO: renamed from: b */
        public final int f44417b;

        /* JADX INFO: renamed from: c */
        public final C7512m.a f44418c = new C7512m.a();

        public a(C7515p c7515p, int i10) {
            this.f44416a = c7515p;
            this.f44417b = i10;
        }

        @Override // p261m9.AbstractC7500a.f
        /* JADX INFO: renamed from: a */
        public final AbstractC7500a.e mo14988a(C7504e c7504e, long j10) throws IOException {
            long j11 = c7504e.f41477d;
            long jM16352c = m16352c(c7504e);
            long jMo14995d = c7504e.mo14995d();
            c7504e.m15001n(Math.max(6, this.f44416a.f41496c), false);
            long jM16352c2 = m16352c(c7504e);
            long jMo14995d2 = c7504e.mo14995d();
            if (jM16352c > j10 || jM16352c2 <= j10) {
                return jM16352c2 <= j10 ? new AbstractC7500a.e(-2, jM16352c2, jMo14995d2) : new AbstractC7500a.e(-1, jM16352c, j11);
            }
            return AbstractC7500a.e.m14987a(jMo14995d);
        }

        /* JADX INFO: renamed from: c */
        public final long m16352c(C7504e c7504e) throws IOException {
            long j10;
            C7512m.a aVar;
            C7515p c7515p;
            boolean zM15011a;
            int iM15003p;
            while (true) {
                long jMo14995d = c7504e.mo14995d();
                j10 = c7504e.f41476c;
                long j11 = j10 - 6;
                aVar = this.f44418c;
                c7515p = this.f44416a;
                if (jMo14995d >= j11) {
                    break;
                }
                long jMo14995d2 = c7504e.mo14995d();
                byte[] bArr = new byte[2];
                c7504e.mo14994c(bArr, 0, 2, false);
                int i10 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                int i11 = this.f44417b;
                if (i10 != i11) {
                    c7504e.f41479f = 0;
                    c7504e.m15001n((int) (jMo14995d2 - c7504e.f41477d), false);
                    zM15011a = false;
                } else {
                    C10151t c10151t = new C10151t(16);
                    System.arraycopy(bArr, 0, c10151t.f51438a, 0, 2);
                    byte[] bArr2 = c10151t.f51438a;
                    int i12 = 0;
                    for (int i13 = 2; i12 < 14 && (iM15003p = c7504e.m15003p(bArr2, i13 + i12, 14 - i12)) != -1; i13 = 2) {
                        i12 += iM15003p;
                    }
                    c10151t.m19123D(i12);
                    c7504e.f41479f = 0;
                    c7504e.m15001n((int) (jMo14995d2 - c7504e.f41477d), false);
                    zM15011a = C7512m.m15011a(c10151t, c7515p, i11, aVar);
                }
                if (zM15011a) {
                    break;
                }
                c7504e.m15001n(1, false);
            }
            if (c7504e.mo14995d() < j10 - 6) {
                return aVar.f41491a;
            }
            c7504e.m15001n((int) (j10 - c7504e.mo14995d()), false);
            return c7515p.f41503j;
        }
    }

    public C8208a(C7515p c7515p, int i10, long j10, long j11) {
        long j12;
        long j13;
        Objects.requireNonNull(c7515p);
        C9370m c9370m = new C9370m(8, c7515p);
        a aVar = new a(c7515p, i10);
        long jM15016b = c7515p.m15016b();
        long j14 = c7515p.f41503j;
        int i11 = c7515p.f41496c;
        int i12 = c7515p.f41497d;
        if (i12 > 0) {
            j12 = (((long) i12) + ((long) i11)) / 2;
            j13 = 1;
        } else {
            int i13 = c7515p.f41495b;
            int i14 = c7515p.f41494a;
            j12 = ((((i14 != i13 || i14 <= 0) ? 4096L : i14) * ((long) c7515p.f41500g)) * ((long) c7515p.f41501h)) / 8;
            j13 = 64;
        }
        super(c9370m, aVar, jM15016b, j14, j10, j11, j12 + j13, Math.max(6, i11));
    }
}
