package org.joda.time.p022tz;

import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class FixedDateTimeZone extends DateTimeZone {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String iNameKey;
    private final int iStandardOffset;
    private final int iWallOffset;

    public FixedDateTimeZone(String str, int i, int i2, String str2) {
        super(str);
        this.iNameKey = str2;
        this.iWallOffset = i;
        this.iStandardOffset = i2;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FixedDateTimeZone) {
            FixedDateTimeZone fixedDateTimeZone = (FixedDateTimeZone) obj;
            if (m18348g().equals(fixedDateTimeZone.m18348g()) && this.iStandardOffset == fixedDateTimeZone.iStandardOffset && this.iWallOffset == fixedDateTimeZone.iWallOffset) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return (this.iWallOffset * 31) + (this.iStandardOffset * 37) + m18348g().hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: i */
    public final String mo18350i(long j) {
        return this.iNameKey;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: k */
    public final int mo18351k(long j) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: l */
    public final int mo18352l(long j) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: o */
    public final int mo18354o(long j) {
        return this.iStandardOffset;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: p */
    public final boolean mo18355p() {
        return true;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: q */
    public final long mo18356q(long j) {
        return j;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: s */
    public final long mo18357s(long j) {
        return j;
    }
}
