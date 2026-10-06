package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class med extends kxk {

    /* JADX INFO: renamed from: a */
    public final long f40167a;

    public med(long j) {
        super((char[]) null);
        this.f40167a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof med) && this.f40167a == ((med) obj).f40167a;
    }

    public final int hashCode() {
        long j = this.f40167a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "UploadProgress(bytesUploaded=" + this.f40167a + ")";
    }
}
