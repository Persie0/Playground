package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import p000.ey8;
import p000.fa4;
import p000.hab;
import p000.mab;
import p000.nab;

/* JADX INFO: loaded from: classes3.dex */
@ey8(with = nab.class)
public final class YearMonth implements Comparable<YearMonth>, Serializable {
    public static final hab Companion = new hab();

    /* JADX INFO: renamed from: a */
    public final java.time.YearMonth f48195a;

    public YearMonth(int i, int i2) {
        try {
            java.time.YearMonth yearMonthOf = java.time.YearMonth.of(i, i2);
            yearMonthOf.getClass();
            this.f48195a = yearMonthOf;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.YearMonth must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(11, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        yearMonth2.getClass();
        return this.f48195a.compareTo(yearMonth2.f48195a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            return fa4.m11650l(this.f48195a, ((YearMonth) obj).f48195a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f48195a.hashCode();
    }

    public final String toString() {
        String str = ((DateTimeFormatter) mab.f50857a.getValue()).format(this.f48195a);
        str.getClass();
        return str;
    }

    public YearMonth(java.time.YearMonth yearMonth) {
        yearMonth.getClass();
        this.f48195a = yearMonth;
    }
}
