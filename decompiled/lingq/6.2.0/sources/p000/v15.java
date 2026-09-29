package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class v15 {

    /* JADX INFO: renamed from: a */
    public final boolean f64694a;

    /* JADX INFO: renamed from: b */
    public final int f64695b;

    /* JADX INFO: renamed from: c */
    public final boolean f64696c;

    public v15(int i, boolean z, boolean z2) {
        this.f64694a = z;
        this.f64695b = i;
        this.f64696c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v15)) {
            return false;
        }
        v15 v15Var = (v15) obj;
        return this.f64694a == v15Var.f64694a && this.f64695b == v15Var.f64695b && this.f64696c == v15Var.f64696c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64696c) + wq1.m24106b(this.f64695b, Boolean.hashCode(this.f64694a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonEditState(show=");
        sb.append(this.f64694a);
        sb.append(", sentenceIndex=");
        sb.append(this.f64695b);
        sb.append(", hasAudio=");
        return AbstractC3393o1.m17740o(sb, this.f64696c, ")");
    }
}
