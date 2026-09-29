package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class aa6 extends tqb {

    /* JADX INFO: renamed from: b */
    public final int f422b;

    /* JADX INFO: renamed from: c */
    public final boolean f423c;

    /* JADX INFO: renamed from: d */
    public final boolean f424d;

    public aa6(int i, boolean z, boolean z2) {
        this.f422b = i;
        this.f423c = z;
        this.f424d = z2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m212a() {
        return this.f423c;
    }

    /* JADX INFO: renamed from: b */
    public final int m213b() {
        return this.f422b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m214c() {
        return this.f424d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa6)) {
            return false;
        }
        aa6 aa6Var = (aa6) obj;
        return this.f422b == aa6Var.f422b && this.f423c == aa6Var.f423c && this.f424d == aa6Var.f424d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f424d) + g9a.m12428e(Integer.hashCode(this.f422b) * 31, 31, this.f423c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Karaoke(lessonId=");
        sb.append(this.f422b);
        sb.append(", fromLesson=");
        sb.append(this.f423c);
        sb.append(", video=");
        return AbstractC3393o1.m17740o(sb, this.f424d, ")");
    }
}
