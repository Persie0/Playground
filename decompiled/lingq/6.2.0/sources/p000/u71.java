package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class u71 extends a81 {

    /* JADX INFO: renamed from: a */
    public final boolean f63503a;

    public u71(boolean z) {
        this.f63503a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u71) && this.f63503a == ((u71) obj).f63503a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63503a);
    }

    public final String toString() {
        return hn1.m13355e("OnOpen(forceOpen=", ")", this.f63503a);
    }
}
