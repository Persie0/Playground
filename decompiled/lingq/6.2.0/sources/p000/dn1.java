package p000;

/* JADX INFO: loaded from: classes.dex */
public final class dn1 implements nn3 {

    /* JADX INFO: renamed from: a */
    public final pg2 f35887a;

    public dn1(pg2 pg2Var) {
        this.f35887a = pg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dn1) && this.f35887a.equals(((dn1) obj).f35887a);
    }

    public final int hashCode() {
        return this.f35887a.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.f35887a + ')';
    }
}
