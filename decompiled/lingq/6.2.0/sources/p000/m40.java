package p000;

/* JADX INFO: loaded from: classes.dex */
public final class m40 {

    /* JADX INFO: renamed from: f */
    public static final m40 f50553f = new m40(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a */
    public final long f50554a;

    /* JADX INFO: renamed from: b */
    public final int f50555b;

    /* JADX INFO: renamed from: c */
    public final int f50556c;

    /* JADX INFO: renamed from: d */
    public final long f50557d;

    /* JADX INFO: renamed from: e */
    public final int f50558e;

    public m40(long j, int i, int i2, long j2, int i3) {
        this.f50554a = j;
        this.f50555b = i;
        this.f50556c = i2;
        this.f50557d = j2;
        this.f50558e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m40) {
            m40 m40Var = (m40) obj;
            if (this.f50554a == m40Var.f50554a && this.f50555b == m40Var.f50555b && this.f50556c == m40Var.f50556c && this.f50557d == m40Var.f50557d && this.f50558e == m40Var.f50558e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f50554a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f50555b) * 1000003) ^ this.f50556c) * 1000003;
        long j2 = this.f50557d;
        return this.f50558e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f50554a);
        sb.append(", loadBatchSize=");
        sb.append(this.f50555b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f50556c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f50557d);
        sb.append(", maxBlobByteSizePerRow=");
        return wq1.m24123s(sb, this.f50558e, "}");
    }
}
