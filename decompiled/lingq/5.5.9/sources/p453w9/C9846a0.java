package p453w9;

import java.io.IOException;
import p261m9.AbstractC7500a;
import p261m9.C7504e;
import p338qd.C8573r0;
import p479xa.C10130a0;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9846a0 extends AbstractC7500a {

    /* JADX INFO: renamed from: w9.a0$a */
    public static final class a implements AbstractC7500a.f {

        /* JADX INFO: renamed from: a */
        public final C10130a0 f50066a;

        /* JADX INFO: renamed from: b */
        public final C10151t f50067b = new C10151t();

        /* JADX INFO: renamed from: c */
        public final int f50068c;

        /* JADX INFO: renamed from: d */
        public final int f50069d;

        public a(int i10, C10130a0 c10130a0, int i11) {
            this.f50068c = i10;
            this.f50066a = c10130a0;
            this.f50069d = i11;
        }

        @Override // p261m9.AbstractC7500a.f
        /* JADX INFO: renamed from: a */
        public final AbstractC7500a.e mo14988a(C7504e c7504e, long j10) throws IOException {
            long j11 = c7504e.f41477d;
            int iMin = (int) Math.min(this.f50069d, c7504e.f41476c - j11);
            C10151t c10151t = this.f50067b;
            c10151t.m19121B(iMin);
            c7504e.mo14994c(c10151t.f51438a, 0, iMin, false);
            int i10 = c10151t.f51440c;
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (true) {
                int i11 = c10151t.f51440c;
                int i12 = c10151t.f51439b;
                if (i11 - i12 < 188) {
                    break;
                }
                byte[] bArr = c10151t.f51438a;
                while (i12 < i10 && bArr[i12] != 71) {
                    i12++;
                }
                int i13 = i12 + 188;
                if (i13 > i10) {
                    break;
                }
                long jM16700T0 = C8573r0.m16700T0(i12, this.f50068c, c10151t);
                if (jM16700T0 != -9223372036854775807L) {
                    long jM19004b = this.f50066a.m19004b(jM16700T0);
                    if (jM19004b > j10) {
                        return j14 == -9223372036854775807L ? new AbstractC7500a.e(-1, jM19004b, j11) : AbstractC7500a.e.m14987a(j11 + j13);
                    }
                    if (100000 + jM19004b > j10) {
                        return AbstractC7500a.e.m14987a(j11 + ((long) i12));
                    }
                    j13 = i12;
                    j14 = jM19004b;
                }
                c10151t.m19124E(i13);
                j12 = i13;
            }
            return j14 != -9223372036854775807L ? new AbstractC7500a.e(-2, j14, j11 + j12) : AbstractC7500a.e.f41457d;
        }

        @Override // p261m9.AbstractC7500a.f
        /* JADX INFO: renamed from: b */
        public final void mo14989b() {
            byte[] bArr = C10134c0.f51359f;
            C10151t c10151t = this.f50067b;
            c10151t.getClass();
            c10151t.m19122C(bArr, bArr.length);
        }
    }

    public C9846a0(C10130a0 c10130a0, long j10, long j11, int i10, int i11) {
        super(new AbstractC7500a.b(), new a(i10, c10130a0, i11), j10, j10 + 1, 0L, j11, 188L, 940);
    }
}
