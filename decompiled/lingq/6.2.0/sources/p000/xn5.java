package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class xn5 implements bo5 {

    /* JADX INFO: renamed from: a */
    public final boolean f68396a;

    public xn5(boolean z) {
        this.f68396a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn5) && this.f68396a == ((xn5) obj).f68396a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68396a);
    }

    public final String toString() {
        return hn1.m13355e("SetAutoplayTts(enabled=", ")", this.f68396a);
    }
}
