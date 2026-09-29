package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class j65 {

    /* JADX INFO: renamed from: a */
    public final int f45114a;

    /* JADX INFO: renamed from: b */
    public final int f45115b;

    /* JADX INFO: renamed from: c */
    public final String f45116c;

    public j65(int i, String str, int i2) {
        str.getClass();
        this.f45114a = i;
        this.f45115b = i2;
        this.f45116c = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m14304a() {
        return this.f45114a;
    }

    /* JADX INFO: renamed from: b */
    public final int m14305b() {
        return this.f45115b;
    }

    /* JADX INFO: renamed from: c */
    public final String m14306c() {
        return this.f45116c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j65)) {
            return false;
        }
        j65 j65Var = (j65) obj;
        return this.f45114a == j65Var.f45114a && this.f45115b == j65Var.f45115b && fa4.m11650l(this.f45116c, j65Var.f45116c);
    }

    public final int hashCode() {
        return this.f45116c.hashCode() + wq1.m24106b(this.f45115b, Integer.hashCode(this.f45114a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22994q(this.f45114a, this.f45115b, "LessonSentenceTranslationEntity(lessonId=", ", sentenceIndex=", ", text="), this.f45116c, ")");
    }
}
