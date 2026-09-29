package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ut8 {

    /* JADX INFO: renamed from: c */
    public static final ut8 f64337c = new ut8(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f64338a;

    /* JADX INFO: renamed from: b */
    public final long f64339b;

    public ut8(long j, long j2) {
        this.f64338a = j;
        this.f64339b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut8.class == obj.getClass()) {
            ut8 ut8Var = (ut8) obj;
            if (this.f64338a == ut8Var.f64338a && this.f64339b == ut8Var.f64339b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f64338a) * 31) + ((int) this.f64339b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f64338a);
        sb.append(", position=");
        return wq1.m24113i(this.f64339b, "]", sb);
    }
}
