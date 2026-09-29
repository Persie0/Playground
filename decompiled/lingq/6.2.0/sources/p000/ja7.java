package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ja7 extends ob7 {

    /* JADX INFO: renamed from: a */
    public final float f45351a;

    public ja7(float f) {
        this.f45351a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja7) && Float.compare(this.f45351a, ((ja7) obj).f45351a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f45351a);
    }

    public final String toString() {
        return "OnCurrentSecond(second=" + this.f45351a + ")";
    }
}
