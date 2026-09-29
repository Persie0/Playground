package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dm4 extends em4 {

    /* JADX INFO: renamed from: a */
    public final il4 f35823a;

    public dm4(il4 il4Var) {
        this.f35823a = il4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm4) && this.f35823a.equals(((dm4) obj).f35823a);
    }

    public final int hashCode() {
        return this.f35823a.hashCode();
    }

    public final String toString() {
        return "Item(item=" + this.f35823a + ")";
    }
}
