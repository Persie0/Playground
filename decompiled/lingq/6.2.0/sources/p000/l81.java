package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class l81 extends v81 {

    /* JADX INFO: renamed from: a */
    public final h81 f49289a;

    public l81(h81 h81Var) {
        h81Var.getClass();
        this.f49289a = h81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l81) && fa4.m11650l(this.f49289a, ((l81) obj).f49289a);
    }

    public final int hashCode() {
        return this.f49289a.hashCode();
    }

    public final String toString() {
        return "OnAddLessonToPlaylist(item=" + this.f49289a + ")";
    }
}
