package p000;

/* JADX INFO: loaded from: classes3.dex */
@ey8(with = l0a.class)
public final class q22 extends r22 {
    public static final p22 Companion = new p22();

    /* JADX INFO: renamed from: d */
    public final long f57155d;

    /* JADX INFO: renamed from: e */
    public final String f57156e;

    /* JADX INFO: renamed from: f */
    public final long f57157f;

    public q22(long j) {
        this.f57155d = j;
        if (j <= 0) {
            C3386nv.m17628o("Unit duration must be positive, but was ", j, " ns.");
            throw null;
        }
        if (j % 3600000000000L == 0) {
            this.f57156e = "HOUR";
            this.f57157f = j / 3600000000000L;
            return;
        }
        if (j % 60000000000L == 0) {
            this.f57156e = "MINUTE";
            this.f57157f = j / 60000000000L;
            return;
        }
        if (j % 1000000000 == 0) {
            this.f57156e = "SECOND";
            this.f57157f = j / 1000000000;
        } else if (j % 1000000 == 0) {
            this.f57156e = "MILLISECOND";
            this.f57157f = j / 1000000;
        } else if (j % 1000 == 0) {
            this.f57156e = "MICROSECOND";
            this.f57157f = j / 1000;
        } else {
            this.f57156e = "NANOSECOND";
            this.f57157f = j;
        }
    }

    /* JADX INFO: renamed from: b */
    public final q22 m19615b(int i) {
        return new q22(Math.multiplyExact(this.f57155d, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q22) {
            return this.f57155d == ((q22) obj).f57155d;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f57155d;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public final String toString() {
        String str = this.f57156e;
        str.getClass();
        long j = this.f57157f;
        if (j == 1) {
            return str;
        }
        return j + '-' + str;
    }
}
