package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class it7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final boolean f44533a;

    /* JADX INFO: renamed from: b */
    public final float f44534b;

    public it7(float f, boolean z) {
        this.f44533a = z;
        this.f44534b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it7)) {
            return false;
        }
        it7 it7Var = (it7) obj;
        return this.f44533a == it7Var.f44533a && Float.compare(this.f44534b, it7Var.f44534b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f44534b) + (Boolean.hashCode(this.f44533a) * 31);
    }

    public final String toString() {
        return "VideoPlayStateChanged(isPlaying=" + this.f44533a + ", durationSeconds=" + this.f44534b + ")";
    }
}
