package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class nb7 extends n2c {

    /* JADX INFO: renamed from: d */
    public final double f52570d;

    public nb7(double d) {
        this.f52570d = d;
    }

    /* JADX INFO: renamed from: a */
    public final double m17316a() {
        return this.f52570d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nb7) && Double.compare(this.f52570d, ((nb7) obj).f52570d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f52570d);
    }

    public final String toString() {
        return "SelectProgress(progress=" + this.f52570d + ")";
    }
}
