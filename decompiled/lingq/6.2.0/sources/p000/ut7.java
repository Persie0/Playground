package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ut7 extends zic {

    /* JADX INFO: renamed from: c */
    public final int f64335c;

    /* JADX INFO: renamed from: d */
    public final boolean f64336d;

    public ut7(int i, boolean z) {
        this.f64335c = i;
        this.f64336d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut7)) {
            return false;
        }
        ut7 ut7Var = (ut7) obj;
        return this.f64335c == ut7Var.f64335c && this.f64336d == ut7Var.f64336d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64336d) + (Integer.hashCode(this.f64335c) * 31);
    }

    public final String toString() {
        return "PageAdvanced(lessonId=" + this.f64335c + ", isSentenceMode=" + this.f64336d + ")";
    }
}
