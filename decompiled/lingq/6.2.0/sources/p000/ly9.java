package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ly9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final vs3 f50317a;

    public ly9(vs3 vs3Var) {
        vs3Var.getClass();
        this.f50317a = vs3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ly9) && fa4.m11650l(this.f50317a, ((ly9) obj).f50317a);
    }

    public final int hashCode() {
        return this.f50317a.hashCode();
    }

    public final String toString() {
        return "UpdateHighlightColor(highlightColorScheme=" + this.f50317a + ")";
    }
}
