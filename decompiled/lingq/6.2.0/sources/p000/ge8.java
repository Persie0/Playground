package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ge8 {

    /* JADX INFO: renamed from: a */
    public final ad8 f40635a;

    /* JADX INFO: renamed from: b */
    public final cd8 f40636b;

    public ge8(ad8 ad8Var, cd8 cd8Var) {
        this.f40635a = ad8Var;
        this.f40636b = cd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge8)) {
            return false;
        }
        ge8 ge8Var = (ge8) obj;
        return this.f40635a.equals(ge8Var.f40635a) && this.f40636b.equals(ge8Var.f40636b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f40636b.hashCode() + (this.f40635a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ReviewSentenceContentResult(content=" + this.f40635a + ", controls=" + this.f40636b + ", isContentLoading=false)";
    }
}
