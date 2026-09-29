package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class eb7 implements pb7 {

    /* JADX INFO: renamed from: a */
    public final float f36980a;

    public eb7(float f) {
        this.f36980a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb7) && Float.compare(this.f36980a, ((eb7) obj).f36980a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f36980a);
    }

    public final String toString() {
        return "OnSeek(value=" + this.f36980a + ")";
    }
}
