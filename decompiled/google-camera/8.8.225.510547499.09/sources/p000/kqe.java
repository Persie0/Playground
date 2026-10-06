package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqe {

    /* JADX INFO: renamed from: a */
    public final long f36834a;

    /* JADX INFO: renamed from: b */
    public final long f36835b;

    /* JADX INFO: renamed from: c */
    public final String f36836c;

    /* JADX INFO: renamed from: d */
    public final krp f36837d;

    /* JADX INFO: renamed from: e */
    public final krl f36838e;

    public kqe() {
    }

    public kqe(long j, long j2, String str, krp krpVar, krl krlVar) {
        this.f36834a = j;
        this.f36835b = j2;
        this.f36836c = str;
        this.f36837d = krpVar;
        this.f36838e = krlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kqe) {
            kqe kqeVar = (kqe) obj;
            if (this.f36834a == kqeVar.f36834a && this.f36835b == kqeVar.f36835b && this.f36836c.equals(kqeVar.f36836c) && this.f36837d.equals(kqeVar.f36837d) && this.f36838e.equals(kqeVar.f36838e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f36834a;
        long j2 = this.f36835b;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f36836c.hashCode()) * 1000003) ^ this.f36837d.hashCode()) * 1000003) ^ this.f36838e.hashCode();
    }

    public final String toString() {
        return "MediaFileInfo{timestampNs=" + this.f36834a + ", utcTimestampMs=" + this.f36835b + ", tag=" + this.f36836c + ", metadata=" + String.valueOf(this.f36837d) + ", fileObject=" + String.valueOf(this.f36838e) + "}";
    }
}
