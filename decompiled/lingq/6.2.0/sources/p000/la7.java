package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class la7 extends j2c {

    /* JADX INFO: renamed from: e */
    public final float f49369e;

    public la7(float f) {
        this.f49369e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la7) && Float.compare(this.f49369e, ((la7) obj).f49369e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f49369e);
    }

    public final String toString() {
        return "OnDuration(duration=" + this.f49369e + ")";
    }
}
