package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ws7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final float f67257a;

    public ws7(float f) {
        this.f67257a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ws7) && Float.compare(this.f67257a, ((ws7) obj).f67257a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f67257a);
    }

    public final String toString() {
        return "SetVideoPlaybackSpeed(speed=" + this.f67257a + ")";
    }
}
