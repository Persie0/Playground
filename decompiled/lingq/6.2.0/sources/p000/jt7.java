package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class jt7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final float f46129a;

    public jt7(float f) {
        this.f46129a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt7) && Float.compare(this.f46129a, ((jt7) obj).f46129a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f46129a);
    }

    public final String toString() {
        return "VideoProgressChanged(positionSeconds=" + this.f46129a + ")";
    }
}
