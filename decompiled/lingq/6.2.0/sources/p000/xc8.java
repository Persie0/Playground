package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xc8 implements ad8 {

    /* JADX INFO: renamed from: a */
    public final ze8 f68066a;

    public xc8(ze8 ze8Var) {
        this.f68066a = ze8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc8) && this.f68066a.equals(((xc8) obj).f68066a);
    }

    public final int hashCode() {
        return this.f68066a.hashCode();
    }

    public final String toString() {
        return "SessionComplete(state=" + this.f68066a + ")";
    }
}
