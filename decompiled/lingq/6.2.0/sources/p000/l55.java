package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class l55 {

    /* JADX INFO: renamed from: a */
    public final ud7 f49081a;

    /* JADX INFO: renamed from: b */
    public final vd7 f49082b;

    public l55(ud7 ud7Var, vd7 vd7Var) {
        this.f49081a = ud7Var;
        this.f49082b = vd7Var;
    }

    /* JADX INFO: renamed from: a */
    public final ud7 m15819a() {
        return this.f49081a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l55)) {
            return false;
        }
        l55 l55Var = (l55) obj;
        return this.f49081a.equals(l55Var.f49081a) && fa4.m11650l(this.f49082b, l55Var.f49082b);
    }

    public final int hashCode() {
        int iHashCode = this.f49081a.hashCode() * 31;
        vd7 vd7Var = this.f49082b;
        return iHashCode + (vd7Var == null ? 0 : vd7Var.hashCode());
    }

    public final String toString() {
        return "LessonPlaylist(lesson=" + this.f49081a + ", lessonDownload=" + this.f49082b + ")";
    }
}
