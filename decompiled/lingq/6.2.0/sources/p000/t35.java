package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class t35 {

    /* JADX INFO: renamed from: a */
    public final String f61793a;

    /* JADX INFO: renamed from: b */
    public final boolean f61794b;

    public t35(String str, boolean z) {
        this.f61793a = str;
        this.f61794b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t35)) {
            return false;
        }
        t35 t35Var = (t35) obj;
        return this.f61793a.equals(t35Var.f61793a) && this.f61794b == t35Var.f61794b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61794b) + (this.f61793a.hashCode() * 31);
    }

    public final String toString() {
        return "LessonInfoPreview(text=" + this.f61793a + ", isLoading=" + this.f61794b + ")";
    }
}
