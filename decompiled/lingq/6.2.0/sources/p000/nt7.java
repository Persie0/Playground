package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class nt7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final w65 f53240a;

    public nt7(w65 w65Var) {
        w65Var.getClass();
        this.f53240a = w65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt7) && fa4.m11650l(this.f53240a, ((nt7) obj).f53240a);
    }

    public final int hashCode() {
        return this.f53240a.hashCode();
    }

    public final String toString() {
        return "VocabularyTtsClick(token=" + this.f53240a + ")";
    }
}
