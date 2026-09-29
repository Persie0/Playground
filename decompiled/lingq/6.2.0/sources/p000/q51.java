package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class q51 extends b61 {

    /* JADX INFO: renamed from: a */
    public final h81 f57282a;

    public q51(h81 h81Var) {
        h81Var.getClass();
        this.f57282a = h81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q51) && fa4.m11650l(this.f57282a, ((q51) obj).f57282a);
    }

    public final int hashCode() {
        return this.f57282a.hashCode();
    }

    public final String toString() {
        return "OnLessonDownloadClicked(item=" + this.f57282a + ")";
    }
}
