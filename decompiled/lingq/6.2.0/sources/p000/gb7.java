package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class gb7 extends ob7 {

    /* JADX INFO: renamed from: a */
    public final float f40501a;

    public gb7(float f) {
        this.f40501a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb7) && Float.compare(this.f40501a, ((gb7) obj).f40501a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f40501a);
    }

    public final String toString() {
        return "OnSeek(value=" + this.f40501a + ")";
    }
}
