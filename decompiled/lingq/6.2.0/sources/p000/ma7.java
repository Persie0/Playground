package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ma7 extends ob7 {

    /* JADX INFO: renamed from: a */
    public final float f50841a;

    public ma7(float f) {
        this.f50841a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma7) && Float.compare(this.f50841a, ((ma7) obj).f50841a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f50841a);
    }

    public final String toString() {
        return "OnDuration(duration=" + this.f50841a + ")";
    }
}
