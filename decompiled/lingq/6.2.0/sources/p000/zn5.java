package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zn5 implements bo5 {

    /* JADX INFO: renamed from: a */
    public final boolean f71797a;

    public zn5(boolean z) {
        this.f71797a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zn5) && this.f71797a == ((zn5) obj).f71797a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71797a);
    }

    public final String toString() {
        return hn1.m13355e("SetDataImprovementOptIn(enabled=", ")", this.f71797a);
    }
}
