package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class oy9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final boolean f55310a;

    public oy9(boolean z) {
        this.f55310a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy9) && this.f55310a == ((oy9) obj).f55310a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55310a);
    }

    public final String toString() {
        return hn1.m13355e("UpdateSentenceTranslation(enabled=", ")", this.f55310a);
    }
}
