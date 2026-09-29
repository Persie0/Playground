package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z30 extends nq1 {

    /* JADX INFO: renamed from: a */
    public final String f70816a;

    public z30(String str) {
        this.f70816a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nq1)) {
            return false;
        }
        return this.f70816a.equals(((z30) ((nq1) obj)).f70816a);
    }

    public final int hashCode() {
        return this.f70816a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(new StringBuilder("Log{content="), this.f70816a, "}");
    }
}
