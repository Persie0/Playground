package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class kn7 {

    /* JADX INFO: renamed from: a */
    public final int f47555a;

    /* JADX INFO: renamed from: b */
    public final boolean f47556b;

    public kn7(int i, boolean z) {
        this.f47555a = i;
        this.f47556b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kn7.class != obj.getClass()) {
            return false;
        }
        kn7 kn7Var = (kn7) obj;
        return this.f47555a == kn7Var.f47555a && this.f47556b == kn7Var.f47556b;
    }

    public final int hashCode() {
        return (this.f47555a * 31) + (this.f47556b ? 1 : 0);
    }
}
