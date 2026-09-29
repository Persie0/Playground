package org.joda.time.p308tz;

import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class CachedDateTimeZone extends DateTimeZone {

    /* JADX INFO: renamed from: f */
    public static final int f44244f;
    private static final long serialVersionUID = 5472298452022250685L;

    /* JADX INFO: renamed from: e */
    public final transient C8149a[] f44245e;
    private final DateTimeZone iZone;

    /* JADX INFO: renamed from: org.joda.time.tz.CachedDateTimeZone$a */
    public static final class C8149a {

        /* JADX INFO: renamed from: a */
        public final long f44246a;

        /* JADX INFO: renamed from: b */
        public final DateTimeZone f44247b;

        /* JADX INFO: renamed from: c */
        public C8149a f44248c;

        /* JADX INFO: renamed from: d */
        public String f44249d;

        /* JADX INFO: renamed from: e */
        public int f44250e = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: f */
        public int f44251f = Integer.MIN_VALUE;

        public C8149a(long j10, DateTimeZone dateTimeZone) {
            this.f44246a = j10;
            this.f44247b = dateTimeZone;
        }

        /* JADX INFO: renamed from: a */
        public final String m16158a(long j10) {
            C8149a c8149a = this.f44248c;
            if (c8149a != null && j10 >= c8149a.f44246a) {
                return c8149a.m16158a(j10);
            }
            if (this.f44249d == null) {
                this.f44249d = this.f44247b.mo16024k(this.f44246a);
            }
            return this.f44249d;
        }

        /* JADX INFO: renamed from: b */
        public final int m16159b(long j10) {
            C8149a c8149a = this.f44248c;
            if (c8149a != null && j10 >= c8149a.f44246a) {
                return c8149a.m16159b(j10);
            }
            if (this.f44250e == Integer.MIN_VALUE) {
                this.f44250e = this.f44247b.mo16025n(this.f44246a);
            }
            return this.f44250e;
        }

        /* JADX INFO: renamed from: c */
        public final int m16160c(long j10) {
            C8149a c8149a = this.f44248c;
            if (c8149a != null && j10 >= c8149a.f44246a) {
                return c8149a.m16160c(j10);
            }
            if (this.f44251f == Integer.MIN_VALUE) {
                this.f44251f = this.f44247b.mo16028t(this.f44246a);
            }
            return this.f44251f;
        }
    }

    static {
        Integer integer;
        int i10;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i10 = 512;
        } else {
            int i11 = 0;
            for (int iIntValue = integer.intValue() - 1; iIntValue > 0; iIntValue >>= 1) {
                i11++;
            }
            i10 = 1 << i11;
        }
        f44244f = i10 - 1;
    }

    public CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.m16022h());
        this.f44245e = new C8149a[f44244f + 1];
        this.iZone = dateTimeZone;
    }

    /* JADX INFO: renamed from: D */
    public final C8149a m16157D(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = f44244f & i10;
        C8149a[] c8149aArr = this.f44245e;
        C8149a c8149a = c8149aArr[i11];
        if (c8149a == null || ((int) (c8149a.f44246a >> 32)) != i10) {
            long j11 = j10 & (-4294967296L);
            c8149a = new C8149a(j11, this.iZone);
            long j12 = 4294967295L | j11;
            C8149a c8149a2 = c8149a;
            while (true) {
                long jMo16030x = this.iZone.mo16030x(j11);
                if (jMo16030x == j11 || jMo16030x > j12) {
                    break;
                    break;
                }
                C8149a c8149a3 = new C8149a(jMo16030x, this.iZone);
                c8149a2.f44248c = c8149a3;
                c8149a2 = c8149a3;
                j11 = jMo16030x;
            }
            c8149aArr[i11] = c8149a;
        }
        return c8149a;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: k */
    public final String mo16024k(long j10) {
        return m16157D(j10).m16158a(j10);
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: n */
    public final int mo16025n(long j10) {
        return m16157D(j10).m16159b(j10);
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: t */
    public final int mo16028t(long j10) {
        return m16157D(j10).m16160c(j10);
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: w */
    public final boolean mo16029w() {
        return this.iZone.mo16029w();
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: x */
    public final long mo16030x(long j10) {
        return this.iZone.mo16030x(j10);
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: z */
    public final long mo16031z(long j10) {
        return this.iZone.mo16031z(j10);
    }
}
