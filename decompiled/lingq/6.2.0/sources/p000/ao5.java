package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ao5 implements bo5 {

    /* JADX INFO: renamed from: a */
    public final boolean f7290a;

    public ao5(boolean z) {
        this.f7290a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao5) && this.f7290a == ((ao5) obj).f7290a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7290a);
    }

    public final String toString() {
        return hn1.m13355e("SetMemoryEnabled(enabled=", ")", this.f7290a);
    }
}
