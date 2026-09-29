package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class qc7 implements ad7 {

    /* JADX INFO: renamed from: a */
    public final boolean f57566a;

    public qc7(boolean z) {
        this.f57566a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc7) && this.f57566a == ((qc7) obj).f57566a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57566a);
    }

    public final String toString() {
        return hn1.m13355e("OnDragging(isDragging=", ")", this.f57566a);
    }
}
