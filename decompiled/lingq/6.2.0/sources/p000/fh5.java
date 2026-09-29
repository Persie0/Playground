package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fh5 extends xa3 {

    /* JADX INFO: renamed from: c */
    public final m58 f39107c;

    public fh5(m58 m58Var) {
        this.f39107c = m58Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fh5) {
            return this.f39107c == ((fh5) obj).f39107c;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39107c.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f39107c + ')';
    }
}
