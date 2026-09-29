package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ia7 extends j2c {

    /* JADX INFO: renamed from: e */
    public final float f43861e;

    public ia7(float f) {
        this.f43861e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia7) && Float.compare(this.f43861e, ((ia7) obj).f43861e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43861e);
    }

    public final String toString() {
        return "OnCurrentSecond(second=" + this.f43861e + ")";
    }
}
