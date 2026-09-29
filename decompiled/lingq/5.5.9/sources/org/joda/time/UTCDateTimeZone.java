package org.joda.time;

/* JADX INFO: loaded from: classes2.dex */
final class UTCDateTimeZone extends DateTimeZone {

    /* JADX INFO: renamed from: e */
    public static final DateTimeZone f43968e = new UTCDateTimeZone();
    private static final long serialVersionUID = -3513011772763289092L;

    public UTCDateTimeZone() {
        super("UTC");
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        return obj instanceof UTCDateTimeZone;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return m16022h().hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: k */
    public final String mo16024k(long j10) {
        return "UTC";
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: n */
    public final int mo16025n(long j10) {
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: q */
    public final int mo16026q(long j10) {
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: t */
    public final int mo16028t(long j10) {
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: w */
    public final boolean mo16029w() {
        return true;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: x */
    public final long mo16030x(long j10) {
        return j10;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: z */
    public final long mo16031z(long j10) {
        return j10;
    }
}
