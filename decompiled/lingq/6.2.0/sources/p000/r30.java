package p000;

/* JADX INFO: loaded from: classes.dex */
public final class r30 extends gq1 {

    /* JADX INFO: renamed from: a */
    public final String f58542a;

    /* JADX INFO: renamed from: b */
    public final String f58543b;

    /* JADX INFO: renamed from: c */
    public final long f58544c;

    public r30(long j, String str, String str2) {
        this.f58542a = str;
        this.f58543b = str2;
        this.f58544c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gq1) {
            r30 r30Var = (r30) ((gq1) obj);
            if (this.f58542a.equals(r30Var.f58542a) && this.f58543b.equals(r30Var.f58543b) && this.f58544c == r30Var.f58544c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f58542a.hashCode() ^ 1000003) * 1000003) ^ this.f58543b.hashCode()) * 1000003;
        long j = this.f58544c;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f58542a);
        sb.append(", code=");
        sb.append(this.f58543b);
        sb.append(", address=");
        return wq1.m24113i(this.f58544c, "}", sb);
    }
}
