package p000;

/* JADX INFO: loaded from: classes.dex */
public final class cv9 {

    /* JADX INFO: renamed from: a */
    public final ec0 f34614a;

    /* JADX INFO: renamed from: b */
    public final ec0 f34615b;

    public cv9() {
        ec0 ec0Var = nj0.f52791J;
        this.f34614a = ec0Var;
        this.f34615b = ec0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv9)) {
            return false;
        }
        cv9 cv9Var = (cv9) obj;
        return fa4.m11650l(this.f34614a, cv9Var.f34614a) && fa4.m11650l(this.f34615b, cv9Var.f34615b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f34615b.f36988a) + wq1.m24105a(Boolean.hashCode(false) * 31, this.f34614a.f36988a, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.f34614a + ", expandedAlignment=" + this.f34615b + ')';
    }
}
