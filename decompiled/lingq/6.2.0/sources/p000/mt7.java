package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class mt7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final w65 f51828a;

    public mt7(w65 w65Var) {
        w65Var.getClass();
        this.f51828a = w65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt7) && fa4.m11650l(this.f51828a, ((mt7) obj).f51828a);
    }

    public final int hashCode() {
        return this.f51828a.hashCode();
    }

    public final String toString() {
        return "VocabularyTokenClick(token=" + this.f51828a + ")";
    }
}
