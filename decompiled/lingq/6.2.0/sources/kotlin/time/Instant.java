package kotlin.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p000.C3386nv;
import p000.b41;
import p000.fa4;
import p000.g74;
import p000.kuc;

/* JADX INFO: loaded from: classes.dex */
public final class Instant implements Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c */
    public static final Instant f47731c = new Instant(0, -31557014167219200L);

    /* JADX INFO: renamed from: d */
    public static final Instant f47732d = new Instant(999999999, 31556889864403199L);

    /* JADX INFO: renamed from: a */
    public final long f47733a;

    /* JADX INFO: renamed from: b */
    public final int f47734b;

    public Instant(int i, long j) {
        this.f47733a = j;
        this.f47734b = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            C3386nv.m17626m("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        b41 b41Var = g74.f40314a;
        return new InstantSerialized(this.f47734b, this.f47733a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        instant2.getClass();
        int iM11652n = fa4.m11652n(this.f47733a, instant2.f47733a);
        return iM11652n != 0 ? iM11652n : fa4.m11651m(this.f47734b, instant2.f47734b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f47733a == instant.f47733a && this.f47734b == instant.f47734b;
    }

    public final int hashCode() {
        return (this.f47734b * 51) + Long.hashCode(this.f47733a);
    }

    public final String toString() {
        return kuc.m15695a(this);
    }
}
