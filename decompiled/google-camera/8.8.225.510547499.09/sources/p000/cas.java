package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cas implements bqn {

    /* JADX INFO: renamed from: b */
    private final String f4926b;

    /* JADX INFO: renamed from: c */
    private final long f4927c;

    /* JADX INFO: renamed from: d */
    private final int f4928d;

    public cas(String str, long j, int i) {
        this.f4926b = str;
        this.f4927c = j;
        this.f4928d = i;
    }

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f4927c).putInt(this.f4928d).array());
        messageDigest.update(this.f4926b.getBytes(f4192a));
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cas casVar = (cas) obj;
        return this.f4927c == casVar.f4927c && this.f4928d == casVar.f4928d && this.f4926b.equals(casVar.f4926b);
    }

    @Override // p000.bqn
    public final int hashCode() {
        int iHashCode = this.f4926b.hashCode() * 31;
        long j = this.f4927c;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f4928d;
    }
}
