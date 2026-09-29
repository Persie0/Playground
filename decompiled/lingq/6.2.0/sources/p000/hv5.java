package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hv5 {

    /* JADX INFO: renamed from: a */
    public iv5 f42992a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hv5) {
            return this.f42992a.equals(((hv5) obj).f42992a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42992a.hashCode();
    }
}
