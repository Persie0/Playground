package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class s1b extends v1b {

    /* JADX INFO: renamed from: a */
    public final w65 f60163a;

    public s1b(w65 w65Var) {
        w65Var.getClass();
        this.f60163a = w65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1b) && fa4.m11650l(this.f60163a, ((s1b) obj).f60163a);
    }

    public final int hashCode() {
        return this.f60163a.hashCode();
    }

    public final String toString() {
        return "PlayTts(token=" + this.f60163a + ")";
    }
}
