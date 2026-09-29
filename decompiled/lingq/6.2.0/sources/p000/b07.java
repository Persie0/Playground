package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b07 extends pk9 {

    /* JADX INFO: renamed from: A */
    public final e28 f7728A;

    public b07(e28 e28Var) {
        this.f7728A = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b07) {
            return this.f7728A.equals(((b07) obj).f7728A);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7728A.hashCode();
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: o */
    public final e28 mo19o() {
        return this.f7728A;
    }
}
