package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class wn5 implements bo5 {

    /* JADX INFO: renamed from: a */
    public final boolean f67093a;

    public wn5(boolean z) {
        this.f67093a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn5) && this.f67093a == ((wn5) obj).f67093a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67093a);
    }

    public final String toString() {
        return hn1.m13355e("SetAutoOpenTranslation(enabled=", ")", this.f67093a);
    }
}
