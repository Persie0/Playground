package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import p000.ey8;
import p000.fa4;
import p000.mi5;
import p000.qi5;

/* JADX INFO: loaded from: classes3.dex */
@ey8(with = qi5.class)
public final class LocalTime implements Comparable<LocalTime>, Serializable {
    public static final mi5 Companion = new mi5();

    /* JADX INFO: renamed from: a */
    public final java.time.LocalTime f48190a;

    static {
        java.time.LocalTime localTime = java.time.LocalTime.MIN;
        localTime.getClass();
        new LocalTime(localTime);
        java.time.LocalTime localTime2 = java.time.LocalTime.MAX;
        localTime2.getClass();
        new LocalTime(localTime2);
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        try {
            java.time.LocalTime localTimeOf = java.time.LocalTime.of(i, i2, i3, i4);
            localTimeOf.getClass();
            this.f48190a = localTimeOf;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(3, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(LocalTime localTime) {
        LocalTime localTime2 = localTime;
        localTime2.getClass();
        return this.f48190a.compareTo(localTime2.f48190a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            return fa4.m11650l(this.f48190a, ((LocalTime) obj).f48190a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f48190a.hashCode();
    }

    public final String toString() {
        String string = this.f48190a.toString();
        string.getClass();
        return string;
    }

    public LocalTime(java.time.LocalTime localTime) {
        localTime.getClass();
        this.f48190a = localTime;
    }
}
