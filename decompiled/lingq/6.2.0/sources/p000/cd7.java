package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class cd7 {

    /* JADX INFO: renamed from: a */
    public final int f9933a;

    /* JADX INFO: renamed from: b */
    public final String f9934b;

    /* JADX INFO: renamed from: c */
    public final int f9935c;

    public cd7(int i, String str, int i2) {
        str.getClass();
        this.f9933a = i;
        this.f9934b = str;
        this.f9935c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd7)) {
            return false;
        }
        cd7 cd7Var = (cd7) obj;
        return this.f9933a == cd7Var.f9933a && fa4.m11650l(this.f9934b, cd7Var.f9934b) && this.f9935c == cd7Var.f9935c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9935c) + ux5.m22980c(Integer.hashCode(this.f9933a) * 31, this.f9934b, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m22995r(this.f9933a, "PlaylistCourse(id=", ", title=", this.f9934b, ", order="), this.f9935c, ")");
    }
}
