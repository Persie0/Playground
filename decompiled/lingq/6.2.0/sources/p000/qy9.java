package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class qy9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final boolean f58394a;

    public qy9(boolean z) {
        this.f58394a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy9) && this.f58394a == ((qy9) obj).f58394a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58394a);
    }

    public final String toString() {
        return hn1.m13355e("UpdateShowVocabulary(enabled=", ")", this.f58394a);
    }
}
