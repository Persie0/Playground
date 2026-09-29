package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class i1b extends k1b {

    /* JADX INFO: renamed from: a */
    public final fv8 f43357a;

    public i1b(fv8 fv8Var) {
        fv8Var.getClass();
        this.f43357a = fv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1b) && fa4.m11650l(this.f43357a, ((i1b) obj).f43357a);
    }

    public final int hashCode() {
        return this.f43357a.hashCode();
    }

    public final String toString() {
        return "Content(selectionItem=" + this.f43357a + ")";
    }
}
