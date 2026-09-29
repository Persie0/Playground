package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class uc8 implements ad8 {

    /* JADX INFO: renamed from: a */
    public final qc8 f63720a;

    public uc8(qc8 qc8Var) {
        qc8Var.getClass();
        this.f63720a = qc8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc8) && fa4.m11650l(this.f63720a, ((uc8) obj).f63720a);
    }

    public final int hashCode() {
        return this.f63720a.hashCode();
    }

    public final String toString() {
        return "CardResult(state=" + this.f63720a + ")";
    }
}
