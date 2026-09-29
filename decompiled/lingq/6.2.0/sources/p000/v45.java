package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class v45 {

    /* JADX INFO: renamed from: a */
    public final String f64840a;

    /* JADX INFO: renamed from: b */
    public final String f64841b;

    /* JADX INFO: renamed from: c */
    public final int f64842c;

    public v45(String str, int i, String str2) {
        str2.getClass();
        this.f64840a = str;
        this.f64841b = str2;
        this.f64842c = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m23096a() {
        return this.f64840a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v45)) {
            return false;
        }
        v45 v45Var = (v45) obj;
        return this.f64840a.equals(v45Var.f64840a) && fa4.m11650l(this.f64841b, v45Var.f64841b) && this.f64842c == v45Var.f64842c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64842c) + ux5.m22980c(this.f64840a.hashCode() * 31, this.f64841b, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m23000w("LessonListeningSession(key=", this.f64840a, ", language=", this.f64841b, ", lessonId="), this.f64842c, ")");
    }
}
