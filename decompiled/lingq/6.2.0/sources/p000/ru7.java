package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ru7 extends gv7 {

    /* JADX INFO: renamed from: a */
    public final int f59832a;

    /* JADX INFO: renamed from: b */
    public final int f59833b;

    /* JADX INFO: renamed from: c */
    public final boolean f59834c;

    public ru7(int i, int i2, boolean z) {
        this.f59832a = i;
        this.f59833b = i2;
        this.f59834c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru7)) {
            return false;
        }
        ru7 ru7Var = (ru7) obj;
        return this.f59832a == ru7Var.f59832a && this.f59833b == ru7Var.f59833b && this.f59834c == ru7Var.f59834c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59834c) + wq1.m24106b(this.f59833b, Integer.hashCode(this.f59832a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m22994q(this.f59832a, this.f59833b, "LessonEdit(lessonId=", ", sentenceIndex=", ", hasAudio="), this.f59834c, ")");
    }
}
