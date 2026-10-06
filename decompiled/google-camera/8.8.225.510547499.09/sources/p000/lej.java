package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lej {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f38032a;

    /* JADX INFO: renamed from: b */
    public final int f38033b;

    /* JADX INFO: renamed from: c */
    public final long f38034c;

    public lej() {
    }

    /* JADX INFO: renamed from: a */
    public static lej m15248a(ByteBuffer byteBuffer, int i, long j) {
        return new lej(byteBuffer, i, j);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lej) {
            lej lejVar = (lej) obj;
            if (this.f38032a.equals(lejVar.f38032a) && this.f38033b == lejVar.f38033b && this.f38034c == lejVar.f38034c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f38032a.hashCode() ^ 1000003) * 1000003) ^ this.f38033b;
        long j = this.f38034c;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AudioPacket{buffer=" + this.f38032a.toString() + ", size=" + this.f38033b + ", timestampNs=" + this.f38034c + "}";
    }

    public lej(ByteBuffer byteBuffer, int i, long j) {
        if (byteBuffer == null) {
            throw new NullPointerException("Null buffer");
        }
        this.f38032a = byteBuffer;
        this.f38033b = i;
        this.f38034c = j;
    }
}
