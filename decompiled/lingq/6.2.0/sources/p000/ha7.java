package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ha7 implements pb7 {

    /* JADX INFO: renamed from: a */
    public final float f42094a;

    public ha7(float f) {
        this.f42094a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha7) && Float.compare(this.f42094a, ((ha7) obj).f42094a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42094a);
    }

    public final String toString() {
        return "OnCurrentSecond(second=" + this.f42094a + ")";
    }
}
