package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ji6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final int f45580a;

    /* JADX INFO: renamed from: b */
    public final boolean f45581b;

    public ji6(int i, boolean z) {
        this.f45580a = i;
        this.f45581b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji6)) {
            return false;
        }
        ji6 ji6Var = (ji6) obj;
        return this.f45580a == ji6Var.f45580a && this.f45581b == ji6Var.f45581b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45581b) + g9a.m12428e(Integer.hashCode(this.f45580a) * 31, 31, false);
    }

    public final String toString() {
        return "Karaoke(lessonId=" + this.f45580a + ", fromLesson=false, video=" + this.f45581b + ")";
    }
}
