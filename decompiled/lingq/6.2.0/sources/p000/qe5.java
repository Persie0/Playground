package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class qe5 {

    /* JADX INFO: renamed from: a */
    public final boolean f57649a;

    /* JADX INFO: renamed from: b */
    public final float f57650b;

    public qe5(float f, boolean z) {
        this.f57649a = z;
        this.f57650b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe5)) {
            return false;
        }
        qe5 qe5Var = (qe5) obj;
        return this.f57649a == qe5Var.f57649a && Float.compare(this.f57650b, qe5Var.f57650b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57650b) + (Boolean.hashCode(this.f57649a) * 31);
    }

    public final String toString() {
        return "LippPopupState(show=" + this.f57649a + ", progress=" + this.f57650b + ")";
    }
}
