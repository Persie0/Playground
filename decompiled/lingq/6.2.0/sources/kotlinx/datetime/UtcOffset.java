package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.ZoneOffset;
import p000.ey8;
import p000.fa4;
import p000.gma;
import p000.oma;

/* JADX INFO: loaded from: classes3.dex */
@ey8(with = oma.class)
public final class UtcOffset implements Serializable {
    public static final gma Companion = new gma();

    /* JADX INFO: renamed from: b */
    public static final UtcOffset f48193b;

    /* JADX INFO: renamed from: a */
    public final ZoneOffset f48194a;

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        f48193b = new UtcOffset(zoneOffset);
    }

    public UtcOffset(ZoneOffset zoneOffset) {
        zoneOffset.getClass();
        this.f48194a = zoneOffset;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.UtcOffset must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(10, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UtcOffset) {
            return fa4.m11650l(this.f48194a, ((UtcOffset) obj).f48194a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f48194a.hashCode();
    }

    public final String toString() {
        String string = this.f48194a.toString();
        string.getClass();
        return string;
    }
}
