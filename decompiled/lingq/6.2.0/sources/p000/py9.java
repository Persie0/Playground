package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class py9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final boolean f57000a;

    public py9(boolean z) {
        this.f57000a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof py9) && this.f57000a == ((py9) obj).f57000a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57000a);
    }

    public final String toString() {
        return hn1.m13355e("UpdateShowSpacesBetweenWords(enabled=", ")", this.f57000a);
    }
}
