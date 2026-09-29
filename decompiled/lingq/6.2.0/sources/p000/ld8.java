package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ld8 {

    /* JADX INFO: renamed from: a */
    public final wc8 f49506a;

    /* JADX INFO: renamed from: b */
    public final cd8 f49507b;

    public ld8(wc8 wc8Var, cd8 cd8Var) {
        this.f49506a = wc8Var;
        this.f49507b = cd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld8)) {
            return false;
        }
        ld8 ld8Var = (ld8) obj;
        return this.f49506a.equals(ld8Var.f49506a) && this.f49507b.equals(ld8Var.f49507b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f49507b.hashCode() + (this.f49506a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ReviewMatchingContentResult(content=" + this.f49506a + ", controls=" + this.f49507b + ", isContentLoading=false)";
    }
}
