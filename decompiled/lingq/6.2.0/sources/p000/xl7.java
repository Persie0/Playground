package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xl7 {

    /* JADX INFO: renamed from: a */
    public final int f68327a;

    /* JADX INFO: renamed from: b */
    public final String f68328b;

    public xl7(int i, String str) {
        str.getClass();
        this.f68327a = i;
        this.f68328b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl7)) {
            return false;
        }
        xl7 xl7Var = (xl7) obj;
        return this.f68327a == xl7Var.f68327a && fa4.m11650l(this.f68328b, xl7Var.f68328b);
    }

    public final int hashCode() {
        return this.f68328b.hashCode() + (Integer.hashCode(this.f68327a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f68327a, "ProfileIdentity(id=", ", username=", this.f68328b, ")");
    }
}
