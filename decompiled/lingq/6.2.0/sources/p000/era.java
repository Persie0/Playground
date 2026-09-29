package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class era extends qra {

    /* JADX INFO: renamed from: a */
    public final float f37760a;

    public era(float f) {
        this.f37760a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof era) && Float.compare(this.f37760a, ((era) obj).f37760a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37760a);
    }

    public final String toString() {
        return "SetPlaybackSpeed(speed=" + this.f37760a + ")";
    }
}
