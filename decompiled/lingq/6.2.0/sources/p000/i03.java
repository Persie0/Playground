package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class i03 extends n03 {

    /* JADX INFO: renamed from: a */
    public final int f43276a;

    /* JADX INFO: renamed from: b */
    public final boolean f43277b;

    public i03(int i, boolean z) {
        this.f43276a = i;
        this.f43277b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i03)) {
            return false;
        }
        i03 i03Var = (i03) obj;
        return this.f43276a == i03Var.f43276a && this.f43277b == i03Var.f43277b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43277b) + (Integer.hashCode(this.f43276a) * 31);
    }

    public final String toString() {
        return "OnLessonSaveClicked(lessonId=" + this.f43276a + ", save=" + this.f43277b + ")";
    }
}
