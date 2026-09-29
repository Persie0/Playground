package p000;

/* JADX INFO: loaded from: classes.dex */
public final class sd2 extends td2 {

    /* JADX INFO: renamed from: a */
    public final od2 f60706a;

    public sd2(od2 od2Var) {
        this.f60706a = od2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd2) && this.f60706a.equals(((sd2) obj).f60706a);
    }

    public final int hashCode() {
        return this.f60706a.hashCode();
    }

    public final String toString() {
        return "SaveSnapshot(snapshot=" + this.f60706a + ')';
    }
}
