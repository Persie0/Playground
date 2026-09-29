package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class uk7 {

    /* JADX INFO: renamed from: a */
    public final boolean f64023a;

    public uk7(boolean z) {
        this.f64023a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uk7) && this.f64023a == ((uk7) obj).f64023a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64023a);
    }

    public final String toString() {
        return hn1.m13355e("PrivateLessonLikeDialogState(show=", ")", this.f64023a);
    }
}
