package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j50 {

    /* JADX INFO: renamed from: a */
    public final long f45058a;

    /* JADX INFO: renamed from: b */
    public final long f45059b;

    /* JADX INFO: renamed from: c */
    public final Set f45060c;

    public j50(long j, long j2, Set set) {
        this.f45058a = j;
        this.f45059b = j2;
        this.f45060c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j50) {
            j50 j50Var = (j50) obj;
            if (this.f45058a == j50Var.f45058a && this.f45059b == j50Var.f45059b && this.f45060c.equals(j50Var.f45060c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f45058a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f45059b;
        return this.f45060c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f45058a + ", maxAllowedDelay=" + this.f45059b + ", flags=" + this.f45060c + "}";
    }
}
