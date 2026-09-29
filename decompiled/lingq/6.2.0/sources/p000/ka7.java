package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ka7 implements pb7 {

    /* JADX INFO: renamed from: a */
    public final float f46946a;

    public ka7(float f) {
        this.f46946a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka7) && Float.compare(this.f46946a, ((ka7) obj).f46946a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f46946a);
    }

    public final String toString() {
        return "OnDuration(duration=" + this.f46946a + ")";
    }
}
