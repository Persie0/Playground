package p000;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class h50 {

    /* JADX INFO: renamed from: a */
    public final HashSet f41797a;

    public h50(HashSet hashSet) {
        this.f41797a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h50) {
            return this.f41797a.equals(((h50) obj).f41797a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41797a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f41797a + "}";
    }
}
