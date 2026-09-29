package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fd2 extends kd2 {

    /* JADX INFO: renamed from: a */
    public final String f38883a;

    /* JADX INFO: renamed from: b */
    public final long f38884b;

    public fd2(String str, long j) {
        this.f38883a = str;
        this.f38884b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd2)) {
            return false;
        }
        fd2 fd2Var = (fd2) obj;
        return this.f38883a.equals(fd2Var.f38883a) && this.f38884b == fd2Var.f38884b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38884b) + (this.f38883a.hashCode() * 31);
    }

    public final String toString() {
        return "Increment(key=" + this.f38883a + ", value=" + this.f38884b + ')';
    }
}
