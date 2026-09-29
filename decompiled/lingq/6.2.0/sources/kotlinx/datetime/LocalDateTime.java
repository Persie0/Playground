package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.chrono.ChronoLocalDateTime;
import p000.ei5;
import p000.ey8;
import p000.fa4;
import p000.zh5;

/* JADX INFO: loaded from: classes3.dex */
@ey8(with = ei5.class)
public final class LocalDateTime implements Comparable<LocalDateTime>, Serializable {
    public static final zh5 Companion = new zh5();

    /* JADX INFO: renamed from: a */
    public final java.time.LocalDateTime f48189a;

    static {
        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.MIN;
        localDateTime.getClass();
        new LocalDateTime(localDateTime);
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        localDateTime2.getClass();
        new LocalDateTime(localDateTime2);
    }

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        java.time.LocalDateTime localDateTimeOf = java.time.LocalDateTime.of(localDate.f48188a, localTime.f48190a);
        localDateTimeOf.getClass();
        this.f48189a = localDateTimeOf;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalDateTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(4, this);
    }

    /* JADX INFO: renamed from: a */
    public final LocalDate m15603a() {
        java.time.LocalDate localDate = this.f48189a.toLocalDate();
        localDate.getClass();
        return new LocalDate(localDate);
    }

    @Override // java.lang.Comparable
    public final int compareTo(LocalDateTime localDateTime) {
        LocalDateTime localDateTime2 = localDateTime;
        localDateTime2.getClass();
        return this.f48189a.compareTo((ChronoLocalDateTime<?>) localDateTime2.f48189a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            return fa4.m11650l(this.f48189a, ((LocalDateTime) obj).f48189a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f48189a.hashCode();
    }

    public final String toString() {
        String string = this.f48189a.toString();
        string.getClass();
        return string;
    }

    public LocalDateTime(java.time.LocalDateTime localDateTime) {
        localDateTime.getClass();
        this.f48189a = localDateTime;
    }
}
