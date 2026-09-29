package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e40 extends qq1 {

    /* JADX INFO: renamed from: a */
    public final List f36669a;

    public e40(List list) {
        this.f36669a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qq1)) {
            return false;
        }
        return this.f36669a.equals(((e40) ((qq1) obj)).f36669a);
    }

    public final int hashCode() {
        return this.f36669a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return hn1.m13356f(new StringBuilder("RolloutsState{rolloutAssignments="), this.f36669a, "}");
    }
}
