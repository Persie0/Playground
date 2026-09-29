package p453w9;

import java.io.IOException;
import p261m9.AbstractC7500a;
import p261m9.C7504e;
import p479xa.C10130a0;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.u */
/* JADX INFO: loaded from: classes.dex */
public final class C9870u extends AbstractC7500a {

    /* JADX INFO: renamed from: w9.u$a */
    public static final class a implements AbstractC7500a.f {

        /* JADX INFO: renamed from: a */
        public final C10130a0 f50380a;

        /* JADX INFO: renamed from: b */
        public final C10151t f50381b = new C10151t();

        public a(C10130a0 c10130a0) {
            this.f50380a = c10130a0;
        }

        @Override // p261m9.AbstractC7500a.f
        /* JADX INFO: renamed from: a */
        public final AbstractC7500a.e mo14988a(C7504e c7504e, long j10) throws IOException {
            int i10;
            int i11;
            int iM18366d;
            long j11 = c7504e.f41477d;
            int iMin = (int) Math.min(20000L, c7504e.f41476c - j11);
            C10151t c10151t = this.f50381b;
            c10151t.m19121B(iMin);
            c7504e.mo14994c(c10151t.f51438a, 0, iMin, false);
            int i12 = -1;
            int i13 = -1;
            long j12 = -9223372036854775807L;
            while (true) {
                int i14 = c10151t.f51440c;
                int i15 = c10151t.f51439b;
                if (i14 - i15 < 4) {
                    return j12 != -9223372036854775807L ? new AbstractC7500a.e(-2, j12, j11 + ((long) i12)) : AbstractC7500a.e.f41457d;
                }
                if (C9870u.m18366d(c10151t.f51438a, i15) != 442) {
                    c10151t.m19125F(1);
                } else {
                    c10151t.m19125F(4);
                    long jM18368c = C9871v.m18368c(c10151t);
                    if (jM18368c != -9223372036854775807L) {
                        long jM19004b = this.f50380a.m19004b(jM18368c);
                        if (jM19004b > j10) {
                            return j12 == -9223372036854775807L ? new AbstractC7500a.e(-1, jM19004b, j11) : AbstractC7500a.e.m14987a(j11 + ((long) i13));
                        }
                        if (100000 + jM19004b > j10) {
                            return AbstractC7500a.e.m14987a(j11 + ((long) c10151t.f51439b));
                        }
                        i13 = c10151t.f51439b;
                        j12 = jM19004b;
                    }
                    int i16 = c10151t.f51440c;
                    if (i16 - c10151t.f51439b < 10) {
                        c10151t.m19124E(i16);
                    } else {
                        c10151t.m19125F(9);
                        int iM19145t = c10151t.m19145t() & 7;
                        if (c10151t.f51440c - c10151t.f51439b < iM19145t) {
                            c10151t.m19124E(i16);
                        } else {
                            c10151t.m19125F(iM19145t);
                            int i17 = c10151t.f51440c;
                            int i18 = c10151t.f51439b;
                            if (i17 - i18 < 4) {
                                c10151t.m19124E(i16);
                            } else if (C9870u.m18366d(c10151t.f51438a, i18) == 443) {
                                c10151t.m19125F(4);
                                int iM19150y = c10151t.m19150y();
                                if (c10151t.f51440c - c10151t.f51439b < iM19150y) {
                                    c10151t.m19124E(i16);
                                } else {
                                    c10151t.m19125F(iM19150y);
                                    while (true) {
                                        i10 = c10151t.f51440c;
                                        i11 = c10151t.f51439b;
                                        if (i10 - i11 < 4 || (iM18366d = C9870u.m18366d(c10151t.f51438a, i11)) == 442 || iM18366d == 441 || (iM18366d >>> 8) != 1) {
                                            break;
                                        }
                                        c10151t.m19125F(4);
                                        if (c10151t.f51440c - c10151t.f51439b < 2) {
                                            c10151t.m19124E(i16);
                                            break;
                                        }
                                        c10151t.m19124E(Math.min(c10151t.f51440c, c10151t.f51439b + c10151t.m19150y()));
                                    }
                                }
                            } else {
                                while (true) {
                                    i10 = c10151t.f51440c;
                                    i11 = c10151t.f51439b;
                                    if (i10 - i11 < 4) {
                                        break;
                                    }
                                    break;
                                    c10151t.m19124E(Math.min(c10151t.f51440c, c10151t.f51439b + c10151t.m19150y()));
                                }
                            }
                        }
                    }
                    i12 = c10151t.f51439b;
                }
            }
        }

        @Override // p261m9.AbstractC7500a.f
        /* JADX INFO: renamed from: b */
        public final void mo14989b() {
            byte[] bArr = C10134c0.f51359f;
            C10151t c10151t = this.f50381b;
            c10151t.getClass();
            c10151t.m19122C(bArr, bArr.length);
        }
    }

    public C9870u(C10130a0 c10130a0, long j10, long j11) {
        super(new AbstractC7500a.b(), new a(c10130a0), j10, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: renamed from: d */
    public static int m18366d(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
