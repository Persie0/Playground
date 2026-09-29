package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class sd7 implements td7 {

    /* JADX INFO: renamed from: a */
    public final l55 f60709a;

    public sd7(l55 l55Var) {
        this.f60709a = l55Var;
    }

    /* JADX INFO: renamed from: a */
    public final l55 m21252a() {
        return this.f60709a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd7) && this.f60709a.equals(((sd7) obj).f60709a);
    }

    public final int hashCode() {
        return this.f60709a.hashCode();
    }

    public final String toString() {
        return "Lesson(lessonPlaylist=" + this.f60709a + ")";
    }
}
