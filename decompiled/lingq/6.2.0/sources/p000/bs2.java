package p000;

/* JADX INFO: loaded from: classes.dex */
public final class bs2 {

    /* JADX INFO: renamed from: a */
    public final String f8931a;

    public bs2(String str) {
        if (str != null) {
            this.f8931a = str;
        } else {
            C3386nv.m17635v("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs2)) {
            return false;
        }
        return this.f8931a.equals(((bs2) obj).f8931a);
    }

    public final int hashCode() {
        return this.f8931a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(new StringBuilder("Encoding{name=\""), this.f8931a, "\"}");
    }
}
