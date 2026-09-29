package kotlin.uuid;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p000.yu0;

/* JADX INFO: loaded from: classes.dex */
public final class Uuid implements Comparable<Uuid>, Serializable {

    /* JADX INFO: renamed from: c */
    public static final Uuid f47741c = new Uuid(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f47742a;

    /* JADX INFO: renamed from: b */
    public final long f47743b;

    public Uuid(long j, long j2) {
        this.f47742a = j;
        this.f47743b = j2;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return AbstractC3207a.m15431b(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Uuid uuid) {
        Uuid uuid2 = uuid;
        uuid2.getClass();
        long j = uuid2.f47742a;
        long j2 = this.f47742a;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.f47743b, uuid2.f47743b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.f47742a == uuid.f47742a && this.f47743b == uuid.f47743b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47742a ^ this.f47743b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC3207a.m15430a(this.f47742a, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC3207a.m15430a(this.f47742a, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC3207a.m15430a(this.f47742a, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC3207a.m15430a(this.f47743b, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC3207a.m15430a(this.f47743b, bArr, 24, 2, 8);
        return new String(bArr, yu0.f70463a);
    }
}
