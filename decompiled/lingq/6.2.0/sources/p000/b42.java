package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class b42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f7907a;

    /* JADX INFO: renamed from: b */
    public final int f7908b;

    public b42(String str, int i) {
        this.f7907a = str;
        this.f7908b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b42)) {
            return false;
        }
        b42 b42Var = (b42) obj;
        return fa4.m11650l(this.f7907a, b42Var.f7907a) && this.f7908b == b42Var.f7908b;
    }

    public final int hashCode() {
        String str = this.f7907a;
        return Integer.hashCode(this.f7908b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "GuidedCourse(language=" + this.f7907a + ", level=" + this.f7908b + ")";
    }
}
