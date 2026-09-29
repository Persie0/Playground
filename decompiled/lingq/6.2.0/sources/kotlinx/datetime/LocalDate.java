package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.chrono.ChronoLocalDate;
import p000.ey8;
import p000.fa4;
import p000.sh5;
import p000.yh5;

/* JADX INFO: loaded from: classes3.dex */
@ey8(with = yh5.class)
public final class LocalDate implements Comparable<LocalDate>, Serializable {
    public static final sh5 Companion = new sh5();

    /* JADX INFO: renamed from: a */
    public final java.time.LocalDate f48188a;

    static {
        java.time.LocalDate localDate = java.time.LocalDate.MIN;
        localDate.getClass();
        new LocalDate(localDate);
        java.time.LocalDate localDate2 = java.time.LocalDate.MAX;
        localDate2.getClass();
        new LocalDate(localDate2);
    }

    public LocalDate(int i, int i2, int i3) {
        try {
            java.time.LocalDate localDateOf = java.time.LocalDate.of(i, i2, i3);
            localDateOf.getClass();
            this.f48188a = localDateOf;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalDate must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(2, this);
    }

    /* JADX INFO: renamed from: a */
    public final Month m15602a() {
        java.time.Month month = this.f48188a.getMonth();
        month.getClass();
        return (Month) Month.getEntries().get(month.getValue() - 1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(LocalDate localDate) {
        LocalDate localDate2 = localDate;
        localDate2.getClass();
        return this.f48188a.compareTo((ChronoLocalDate) localDate2.f48188a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            return fa4.m11650l(this.f48188a, ((LocalDate) obj).f48188a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f48188a.hashCode();
    }

    public final String toString() {
        String string = this.f48188a.toString();
        string.getClass();
        return string;
    }

    public LocalDate(java.time.LocalDate localDate) {
        localDate.getClass();
        this.f48188a = localDate;
    }
}
