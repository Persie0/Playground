package p261m9;

import java.io.IOException;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: m9.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7500a {

    /* JADX INFO: renamed from: a */
    public final a f41438a;

    /* JADX INFO: renamed from: b */
    public final f f41439b;

    /* JADX INFO: renamed from: c */
    public c f41440c;

    /* JADX INFO: renamed from: d */
    public final int f41441d;

    /* JADX INFO: renamed from: m9.a$a */
    public static class a implements InterfaceC7520u {

        /* JADX INFO: renamed from: a */
        public final d f41442a;

        /* JADX INFO: renamed from: b */
        public final long f41443b;

        /* JADX INFO: renamed from: c */
        public final long f41444c = 0;

        /* JADX INFO: renamed from: d */
        public final long f41445d;

        /* JADX INFO: renamed from: e */
        public final long f41446e;

        /* JADX INFO: renamed from: f */
        public final long f41447f;

        /* JADX INFO: renamed from: g */
        public final long f41448g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14) {
            this.f41442a = dVar;
            this.f41443b = j10;
            this.f41445d = j11;
            this.f41446e = j12;
            this.f41447f = j13;
            this.f41448g = j14;
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: b */
        public final boolean mo14982b() {
            return true;
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: h */
        public final InterfaceC7520u.a mo14983h(long j10) {
            C7521v c7521v = new C7521v(j10, c.m14986a(this.f41442a.mo14985b(j10), this.f41444c, this.f41445d, this.f41446e, this.f41447f, this.f41448g));
            return new InterfaceC7520u.a(c7521v, c7521v);
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: i */
        public final long mo14984i() {
            return this.f41443b;
        }
    }

    /* JADX INFO: renamed from: m9.a$b */
    public static final class b implements d {
        @Override // p261m9.AbstractC7500a.d
        /* JADX INFO: renamed from: b */
        public final long mo14985b(long j10) {
            return j10;
        }
    }

    /* JADX INFO: renamed from: m9.a$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final long f41449a;

        /* JADX INFO: renamed from: b */
        public final long f41450b;

        /* JADX INFO: renamed from: c */
        public final long f41451c;

        /* JADX INFO: renamed from: d */
        public long f41452d;

        /* JADX INFO: renamed from: e */
        public long f41453e;

        /* JADX INFO: renamed from: f */
        public long f41454f;

        /* JADX INFO: renamed from: g */
        public long f41455g;

        /* JADX INFO: renamed from: h */
        public long f41456h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f41449a = j10;
            this.f41450b = j11;
            this.f41452d = j12;
            this.f41453e = j13;
            this.f41454f = j14;
            this.f41455g = j15;
            this.f41451c = j16;
            this.f41456h = m14986a(j11, j12, j13, j14, j15, j16);
        }

        /* JADX INFO: renamed from: a */
        public static long m14986a(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return C10134c0.m19042i(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }
    }

    /* JADX INFO: renamed from: m9.a$d */
    public interface d {
        /* JADX INFO: renamed from: b */
        long mo14985b(long j10);
    }

    /* JADX INFO: renamed from: m9.a$e */
    public static final class e {

        /* JADX INFO: renamed from: d */
        public static final e f41457d = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a */
        public final int f41458a;

        /* JADX INFO: renamed from: b */
        public final long f41459b;

        /* JADX INFO: renamed from: c */
        public final long f41460c;

        public e(int i10, long j10, long j11) {
            this.f41458a = i10;
            this.f41459b = j10;
            this.f41460c = j11;
        }

        /* JADX INFO: renamed from: a */
        public static e m14987a(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }
    }

    /* JADX INFO: renamed from: m9.a$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        e mo14988a(C7504e c7504e, long j10) throws IOException;

        /* JADX INFO: renamed from: b */
        default void mo14989b() {
        }
    }

    public AbstractC7500a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f41439b = fVar;
        this.f41441d = i10;
        this.f41438a = new a(dVar, j10, j11, j12, j13, j14);
    }

    /* JADX INFO: renamed from: b */
    public static int m14979b(C7504e c7504e, long j10, C7519t c7519t) {
        if (j10 == c7504e.f41477d) {
            return 0;
        }
        c7519t.f41516a = j10;
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m14980a(C7504e c7504e, C7519t c7519t) throws IOException {
        boolean z10;
        while (true) {
            c cVar = this.f41440c;
            C10129a.m18993e(cVar);
            long j10 = cVar.f41454f;
            long j11 = cVar.f41455g;
            long j12 = cVar.f41456h;
            long j13 = j11 - j10;
            long j14 = this.f41441d;
            f fVar = this.f41439b;
            if (j13 <= j14) {
                this.f41440c = null;
                fVar.mo14989b();
                return m14979b(c7504e, j10, c7519t);
            }
            long j15 = j12 - c7504e.f41477d;
            if (j15 < 0 || j15 > 262144) {
                z10 = false;
            } else {
                c7504e.mo14998j((int) j15);
                z10 = true;
            }
            if (!z10) {
                return m14979b(c7504e, j12, c7519t);
            }
            c7504e.f41479f = 0;
            e eVarMo14988a = fVar.mo14988a(c7504e, cVar.f41450b);
            int i10 = eVarMo14988a.f41458a;
            if (i10 == -3) {
                this.f41440c = null;
                fVar.mo14989b();
                return m14979b(c7504e, j12, c7519t);
            }
            long j16 = eVarMo14988a.f41459b;
            long j17 = eVarMo14988a.f41460c;
            if (i10 == -2) {
                cVar.f41452d = j16;
                cVar.f41454f = j17;
                cVar.f41456h = c.m14986a(cVar.f41450b, j16, cVar.f41453e, j17, cVar.f41455g, cVar.f41451c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j18 = j17 - c7504e.f41477d;
                    if (j18 >= 0 && j18 <= 262144) {
                        c7504e.mo14998j((int) j18);
                    }
                    this.f41440c = null;
                    fVar.mo14989b();
                    return m14979b(c7504e, j17, c7519t);
                }
                cVar.f41453e = j16;
                cVar.f41455g = j17;
                cVar.f41456h = c.m14986a(cVar.f41450b, cVar.f41452d, j16, cVar.f41454f, j17, cVar.f41451c);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14981c(long j10) {
        c cVar = this.f41440c;
        if (cVar == null || cVar.f41449a != j10) {
            a aVar = this.f41438a;
            this.f41440c = new c(j10, aVar.f41442a.mo14985b(j10), aVar.f41444c, aVar.f41445d, aVar.f41446e, aVar.f41447f, aVar.f41448g);
        }
    }
}
