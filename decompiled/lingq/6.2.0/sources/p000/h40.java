package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h40 extends tq1 {

    /* JADX INFO: renamed from: a */
    public final String f41764a;

    public h40(String str) {
        this.f41764a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tq1)) {
            return false;
        }
        return this.f41764a.equals(((h40) ((tq1) obj)).f41764a);
    }

    public final int hashCode() {
        return this.f41764a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(new StringBuilder("User{identifier="), this.f41764a, "}");
    }
}
