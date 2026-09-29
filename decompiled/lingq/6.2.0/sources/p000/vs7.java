package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class vs7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final float f65862a;

    public vs7(float f) {
        this.f65862a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vs7) && Float.compare(this.f65862a, ((vs7) obj).f65862a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65862a);
    }

    public final String toString() {
        return "SetSentencePlaybackSpeed(speed=" + this.f65862a + ")";
    }
}
