package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class i41 {

    /* JADX INFO: renamed from: a */
    public final String f43474a;

    /* JADX INFO: renamed from: b */
    public final boolean f43475b;

    public i41(String str, boolean z) {
        this.f43474a = str;
        this.f43475b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i41)) {
            return false;
        }
        i41 i41Var = (i41) obj;
        return this.f43474a.equals(i41Var.f43474a) && this.f43475b == i41Var.f43475b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43475b) + (this.f43474a.hashCode() * 31);
    }

    public final String toString() {
        return "ClozeFragment(text=" + this.f43474a + ", isOccurrence=" + this.f43475b + ")";
    }
}
