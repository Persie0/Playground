package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oa0 {

    /* JADX INFO: renamed from: a */
    public final float f54096a;

    public final boolean equals(Object obj) {
        if (obj instanceof oa0) {
            return Float.compare(this.f54096a, ((oa0) obj).f54096a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f54096a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f54096a + ')';
    }
}
