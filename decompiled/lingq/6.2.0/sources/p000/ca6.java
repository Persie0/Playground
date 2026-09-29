package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ca6 extends tqb {

    /* JADX INFO: renamed from: b */
    public final int f9789b;

    /* JADX INFO: renamed from: c */
    public final int f9790c;

    /* JADX INFO: renamed from: d */
    public final boolean f9791d;

    public ca6(int i, int i2, boolean z) {
        this.f9789b = i;
        this.f9790c = i2;
        this.f9791d = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4471a() {
        return this.f9791d;
    }

    /* JADX INFO: renamed from: b */
    public final int m4472b() {
        return this.f9789b;
    }

    /* JADX INFO: renamed from: c */
    public final int m4473c() {
        return this.f9790c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca6)) {
            return false;
        }
        ca6 ca6Var = (ca6) obj;
        return this.f9789b == ca6Var.f9789b && this.f9790c == ca6Var.f9790c && this.f9791d == ca6Var.f9791d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9791d) + wq1.m24106b(this.f9790c, Integer.hashCode(this.f9789b) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m22994q(this.f9789b, this.f9790c, "LessonEdit(lessonId=", ", sentenceIndex=", ", hasAudio="), this.f9791d, ")");
    }
}
