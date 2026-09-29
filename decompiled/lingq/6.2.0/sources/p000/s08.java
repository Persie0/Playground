package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class s08 {

    /* JADX INFO: renamed from: a */
    public final boolean f60141a;

    /* JADX INFO: renamed from: b */
    public final float f60142b;

    public s08(float f, boolean z) {
        this.f60141a = z;
        this.f60142b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s08)) {
            return false;
        }
        s08 s08Var = (s08) obj;
        return this.f60141a == s08Var.f60141a && Float.compare(this.f60142b, s08Var.f60142b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f60142b) + (Boolean.hashCode(this.f60141a) * 31);
    }

    public final String toString() {
        return "LippPopupState(show=" + this.f60141a + ", progress=" + this.f60142b + ")";
    }
}
