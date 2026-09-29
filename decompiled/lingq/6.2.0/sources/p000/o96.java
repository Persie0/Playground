package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class o96 extends tqb {

    /* JADX INFO: renamed from: b */
    public final boolean f54081b;

    /* JADX INFO: renamed from: c */
    public final boolean f54082c;

    /* JADX INFO: renamed from: d */
    public final int f54083d;

    public o96(int i, boolean z, boolean z2) {
        this.f54081b = z;
        this.f54082c = z2;
        this.f54083d = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17874a() {
        return this.f54082c;
    }

    /* JADX INFO: renamed from: b */
    public final int m17875b() {
        return this.f54083d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17876c() {
        return this.f54081b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o96)) {
            return false;
        }
        o96 o96Var = (o96) obj;
        return this.f54081b == o96Var.f54081b && this.f54082c == o96Var.f54082c && this.f54083d == o96Var.f54083d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54083d) + g9a.m12428e(Boolean.hashCode(this.f54081b) * 31, 31, this.f54082c);
    }

    public final String toString() {
        return wq1.m24123s(hn1.m13357g("BookChallengeChooser(isJoined=", ", multiBookEnabled=", ", replaceBookId=", this.f54081b, this.f54082c), this.f54083d, ")");
    }

    public /* synthetic */ o96(boolean z) {
        this(-1, z, false);
    }
}
