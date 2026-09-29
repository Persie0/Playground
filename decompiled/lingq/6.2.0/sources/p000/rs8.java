package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class rs8 extends ws8 {

    /* JADX INFO: renamed from: a */
    public final uq8 f59765a;

    /* JADX INFO: renamed from: b */
    public final boolean f59766b;

    public rs8(uq8 uq8Var, boolean z) {
        this.f59765a = uq8Var;
        this.f59766b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs8)) {
            return false;
        }
        rs8 rs8Var = (rs8) obj;
        return this.f59765a.equals(rs8Var.f59765a) && this.f59766b == rs8Var.f59766b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59766b) + (this.f59765a.hashCode() * 31);
    }

    public final String toString() {
        return "OnOpenLesson(item=" + this.f59765a + ", forceOpen=" + this.f59766b + ")";
    }
}
