package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class o35 implements r35 {

    /* JADX INFO: renamed from: a */
    public final c55 f53769a;

    public o35(c55 c55Var) {
        this.f53769a = c55Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o35) && this.f53769a.equals(((o35) obj).f53769a);
    }

    public final int hashCode() {
        return this.f53769a.hashCode();
    }

    public final String toString() {
        return "OpenLesson(data=" + this.f53769a + ")";
    }
}
