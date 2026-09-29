package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kc8 {

    /* JADX INFO: renamed from: a */
    public final ad8 f47031a;

    /* JADX INFO: renamed from: b */
    public final cd8 f47032b;

    public kc8(ad8 ad8Var, cd8 cd8Var) {
        this.f47031a = ad8Var;
        this.f47032b = cd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc8)) {
            return false;
        }
        kc8 kc8Var = (kc8) obj;
        return this.f47031a.equals(kc8Var.f47031a) && this.f47032b.equals(kc8Var.f47032b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f47032b.hashCode() + (this.f47031a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ReviewCardContentResult(content=" + this.f47031a + ", controls=" + this.f47032b + ", isContentLoading=false)";
    }
}
