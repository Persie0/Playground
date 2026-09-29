package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class tc8 implements ad8 {

    /* JADX INFO: renamed from: a */
    public final qc8 f62154a;

    public tc8(qc8 qc8Var) {
        qc8Var.getClass();
        this.f62154a = qc8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc8) && fa4.m11650l(this.f62154a, ((tc8) obj).f62154a);
    }

    public final int hashCode() {
        return this.f62154a.hashCode();
    }

    public final String toString() {
        return "CardQuestion(state=" + this.f62154a + ")";
    }
}
