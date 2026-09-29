package p432v8;

/* JADX INFO: renamed from: v8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9673f extends AbstractC9677j {

    /* JADX INFO: renamed from: a */
    public final long f49541a;

    public C9673f(long j10) {
        this.f49541a = j10;
    }

    @Override // p432v8.AbstractC9677j
    /* JADX INFO: renamed from: b */
    public final long mo18183b() {
        return this.f49541a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC9677j) && this.f49541a == ((AbstractC9677j) obj).mo18183b();
    }

    public final int hashCode() {
        long j10 = this.f49541a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f49541a + "}";
    }
}
