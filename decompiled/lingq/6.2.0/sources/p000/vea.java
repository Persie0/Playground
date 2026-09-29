package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vea implements Comparable {

    /* JADX INFO: renamed from: a */
    public final short f65284a;

    public /* synthetic */ vea(short s) {
        this.f65284a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return fa4.m11651m(this.f65284a & 65535, ((vea) obj).f65284a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vea) {
            return this.f65284a == ((vea) obj).f65284a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f65284a);
    }

    public final String toString() {
        return String.valueOf(this.f65284a & 65535);
    }
}
