package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b02 {

    /* JADX INFO: renamed from: a */
    public long f7717a;

    /* JADX INFO: renamed from: b */
    public float f7718b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b02)) {
            return false;
        }
        b02 b02Var = (b02) obj;
        return this.f7717a == b02Var.f7717a && Float.compare(this.f7718b, b02Var.f7718b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7718b) + (Long.hashCode(this.f7717a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f7717a);
        sb.append(", dataPoint=");
        return AbstractC3393o1.m17737l(sb, this.f7718b, ')');
    }
}
