package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class oo8 extends zyc {

    /* JADX INFO: renamed from: a */
    public final int f54655a;

    /* JADX INFO: renamed from: b */
    public final String f54656b;

    public oo8(int i, String str) {
        this.f54655a = i;
        this.f54656b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo8)) {
            return false;
        }
        oo8 oo8Var = (oo8) obj;
        return this.f54655a == oo8Var.f54655a && this.f54656b.equals(oo8Var.f54656b);
    }

    public final int hashCode() {
        return this.f54656b.hashCode() + (Integer.hashCode(this.f54655a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f54655a, "BlacklistCourse(coursePk=", ", name=", this.f54656b, ")");
    }
}
