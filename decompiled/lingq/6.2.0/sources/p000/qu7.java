package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class qu7 extends gv7 {

    /* JADX INFO: renamed from: a */
    public final boolean f58223a;

    public qu7(boolean z) {
        this.f58223a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu7) && this.f58223a == ((qu7) obj).f58223a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58223a);
    }

    public final String toString() {
        return hn1.m13355e("Karaoke(video=", ")", this.f58223a);
    }
}
