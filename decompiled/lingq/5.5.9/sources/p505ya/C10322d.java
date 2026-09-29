package p505ya;

import java.util.Arrays;

/* JADX INFO: renamed from: ya.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10322d {

    /* JADX INFO: renamed from: c */
    public boolean f51904c;

    /* JADX INFO: renamed from: e */
    public int f51906e;

    /* JADX INFO: renamed from: a */
    public a f51902a = new a();

    /* JADX INFO: renamed from: b */
    public a f51903b = new a();

    /* JADX INFO: renamed from: d */
    public long f51905d = -9223372036854775807L;

    /* JADX INFO: renamed from: ya.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public long f51907a;

        /* JADX INFO: renamed from: b */
        public long f51908b;

        /* JADX INFO: renamed from: c */
        public long f51909c;

        /* JADX INFO: renamed from: d */
        public long f51910d;

        /* JADX INFO: renamed from: e */
        public long f51911e;

        /* JADX INFO: renamed from: f */
        public long f51912f;

        /* JADX INFO: renamed from: g */
        public final boolean[] f51913g = new boolean[15];

        /* JADX INFO: renamed from: h */
        public int f51914h;

        /* JADX INFO: renamed from: a */
        public final boolean m19322a() {
            return this.f51910d > 15 && this.f51914h == 0;
        }

        /* JADX INFO: renamed from: b */
        public final void m19323b(long j10) {
            long j11 = this.f51910d;
            if (j11 == 0) {
                this.f51907a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f51907a;
                this.f51908b = j12;
                this.f51912f = j12;
                this.f51911e = 1L;
            } else {
                long j13 = j10 - this.f51909c;
                int i10 = (int) (j11 % 15);
                long jAbs = Math.abs(j13 - this.f51908b);
                boolean[] zArr = this.f51913g;
                if (jAbs <= 1000000) {
                    this.f51911e++;
                    this.f51912f += j13;
                    if (zArr[i10]) {
                        zArr[i10] = false;
                        this.f51914h--;
                    }
                } else if (!zArr[i10]) {
                    zArr[i10] = true;
                    this.f51914h++;
                }
            }
            this.f51910d++;
            this.f51909c = j10;
        }

        /* JADX INFO: renamed from: c */
        public final void m19324c() {
            this.f51910d = 0L;
            this.f51911e = 0L;
            this.f51912f = 0L;
            this.f51914h = 0;
            Arrays.fill(this.f51913g, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19321a() {
        return this.f51902a.m19322a();
    }
}
