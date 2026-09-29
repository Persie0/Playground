package p000;

/* JADX INFO: loaded from: classes.dex */
public final class lv8 implements nn3 {

    /* JADX INFO: renamed from: a */
    public final jv8 f50195a;

    public lv8(jv8 jv8Var) {
        this.f50195a = jv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv8) && this.f50195a == ((lv8) obj).f50195a;
    }

    public final int hashCode() {
        return this.f50195a.hashCode();
    }

    public final String toString() {
        return "SemanticsModifier(configuration=" + this.f50195a + ')';
    }
}
