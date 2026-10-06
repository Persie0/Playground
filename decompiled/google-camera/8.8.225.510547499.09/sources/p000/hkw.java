package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hkw {

    /* JADX INFO: renamed from: a */
    public final String f28222a;

    /* JADX INFO: renamed from: b */
    public final int f28223b;

    /* JADX INFO: renamed from: c */
    public final long f28224c;

    public hkw(String str, int i, long j) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f28222a = str;
        this.f28223b = i;
        this.f28224c = j;
    }

    /* JADX INFO: renamed from: a */
    public static hkw m10427a(String str, int i, long j) {
        return new hkw(str, i, j);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hkw) {
            hkw hkwVar = (hkw) obj;
            if (this.f28222a.equals(hkwVar.f28222a) && this.f28223b == hkwVar.f28223b && this.f28224c == hkwVar.f28224c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f28222a.hashCode() ^ 1000003) * 1000003) ^ this.f28223b;
        long j = this.f28224c;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "RecordedCheckpoint{name=" + this.f28222a + ", ordinal=" + this.f28223b + ", timingNanos=" + this.f28224c + "}";
    }

    public hkw() {
    }
}
