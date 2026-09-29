package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ic7 implements zc7 {

    /* JADX INFO: renamed from: a */
    public final int f43934a;

    /* JADX INFO: renamed from: b */
    public final String f43935b;

    public ic7(int i, String str) {
        this.f43934a = i;
        this.f43935b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic7)) {
            return false;
        }
        ic7 ic7Var = (ic7) obj;
        return this.f43934a == ic7Var.f43934a && this.f43935b.equals(ic7Var.f43935b);
    }

    public final int hashCode() {
        return this.f43935b.hashCode() + (Integer.hashCode(this.f43934a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f43934a, "Add(lessonId=", ", url=", this.f43935b, ")");
    }
}
