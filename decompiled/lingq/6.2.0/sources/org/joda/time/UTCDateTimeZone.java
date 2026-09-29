package org.joda.time;

/* JADX INFO: loaded from: classes.dex */
final class UTCDateTimeZone extends DateTimeZone {

    /* JADX INFO: renamed from: e */
    public static final DateTimeZone f54846e = new UTCDateTimeZone("UTC");
    private static final long serialVersionUID = -3513011772763289092L;

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        return obj instanceof UTCDateTimeZone;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return m18348g().hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: i */
    public final String mo18350i(long j) {
        return "UTC";
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: k */
    public final int mo18351k(long j) {
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: l */
    public final int mo18352l(long j) {
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: o */
    public final int mo18354o(long j) {
        return 0;
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
