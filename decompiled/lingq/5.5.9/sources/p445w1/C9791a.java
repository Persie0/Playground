package p445w1;

/* JADX INFO: renamed from: w1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9791a {

    /* JADX INFO: renamed from: a */
    public final float f49900a;

    public final boolean equals(Object obj) {
        if (obj instanceof C9791a) {
            return Float.compare(this.f49900a, ((C9791a) obj).f49900a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f49900a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f49900a + ')';
    }
}
