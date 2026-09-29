package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class hla extends ila {

    /* JADX INFO: renamed from: a */
    public final fv8 f42587a;

    public hla(fv8 fv8Var) {
        fv8Var.getClass();
        this.f42587a = fv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hla) && fa4.m11650l(this.f42587a, ((hla) obj).f42587a);
    }

    public final int hashCode() {
        return this.f42587a.hashCode();
    }

    public final String toString() {
        return "Selection(selectionItem=" + this.f42587a + ")";
    }
}
