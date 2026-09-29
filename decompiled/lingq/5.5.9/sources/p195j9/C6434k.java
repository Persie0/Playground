package p195j9;

/* JADX INFO: renamed from: j9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6434k {

    /* JADX INFO: renamed from: a */
    public final int f36946a = 0;

    /* JADX INFO: renamed from: b */
    public final float f36947b = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6434k.class != obj.getClass()) {
            return false;
        }
        C6434k c6434k = (C6434k) obj;
        return this.f36946a == c6434k.f36946a && Float.compare(c6434k.f36947b, this.f36947b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36947b) + ((527 + this.f36946a) * 31);
    }
}
