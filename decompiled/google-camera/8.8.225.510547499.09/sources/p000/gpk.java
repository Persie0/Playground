package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class gpk {

    /* JADX INFO: renamed from: a */
    public final long f25951a;

    /* JADX INFO: renamed from: b */
    public final ihk f25952b;

    /* JADX INFO: renamed from: c */
    private final String f25953c;

    /* JADX INFO: renamed from: d */
    private final String f25954d;

    public gpk(ihk ihkVar, String str, String str2, long j, byte[] bArr, byte[] bArr2) {
        this.f25952b = ihkVar;
        if (str == null) {
            throw new NullPointerException("Null xmpMetadataMain");
        }
        this.f25953c = str;
        if (str2 == null) {
            throw new NullPointerException("Null xmpMetadataExtended");
        }
        this.f25954d = str2;
        this.f25951a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpk) {
            gpk gpkVar = (gpk) obj;
            if (this.f25952b.equals(gpkVar.f25952b) && this.f25953c.equals(gpkVar.f25953c) && this.f25954d.equals(gpkVar.f25954d) && this.f25951a == gpkVar.f25951a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f25952b.hashCode() ^ 1000003) * 1000003) ^ this.f25953c.hashCode()) * 1000003) ^ this.f25954d.hashCode();
        long j = this.f25951a;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "UpsampledImage{image=" + this.f25952b.toString() + ", xmpMetadataMain=" + this.f25953c + ", xmpMetadataExtended=" + this.f25954d + ", id=" + this.f25951a + "}";
    }

    public gpk() {
    }
}
