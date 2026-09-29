package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class c65 {

    /* JADX INFO: renamed from: a */
    public final String f9631a;

    /* JADX INFO: renamed from: b */
    public final int f9632b;

    /* JADX INFO: renamed from: c */
    public final int f9633c;

    public c65(String str, int i, int i2) {
        this.f9631a = str;
        this.f9632b = i;
        this.f9633c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c65)) {
            return false;
        }
        c65 c65Var = (c65) obj;
        return this.f9631a.equals(c65Var.f9631a) && this.f9632b == c65Var.f9632b && this.f9633c == c65Var.f9633c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9633c) + wq1.m24106b(this.f9632b, this.f9631a.hashCode() * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(AbstractC3393o1.m17741p(this.f9632b, "LessonReadingUnit(key=", this.f9631a, ", wordCount=", ", totalWordCount="), this.f9633c, ")");
    }
}
