package org.joda.time.p308tz;

import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class FixedDateTimeZone extends DateTimeZone {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String iNameKey;
    private final int iStandardOffset;
    private final int iWallOffset;

    public FixedDateTimeZone(String str, int i10, int i11, String str2) {
        super(str);
        this.iNameKey = str2;
        this.iWallOffset = i10;
        this.iStandardOffset = i11;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDateTimeZone)) {
            return false;
        }
        FixedDateTimeZone fixedDateTimeZone = (FixedDateTimeZone) obj;
        return m16022h().equals(fixedDateTimeZone.m16022h()) && this.iStandardOffset == fixedDateTimeZone.iStandardOffset && this.iWallOffset == fixedDateTimeZone.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return (this.iWallOffset * 31) + (this.iStandardOffset * 37) + m16022h().hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: k */
    public final String mo16024k(long j10) {
        return this.iNameKey;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: n */
    public final int mo16025n(long j10) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: q */
    public final int mo16026q(long j10) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: t */
    public final int mo16028t(long j10) {
        return this.iStandardOffset;
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
