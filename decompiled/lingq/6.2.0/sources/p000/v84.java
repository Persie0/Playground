package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v84 {

    /* JADX INFO: renamed from: a */
    public final iq7 f65012a;

    /* JADX INFO: renamed from: b */
    public final z22 f65013b;

    public v84() {
        iq7 iq7Var = new iq7();
        z22 z22Var = new z22();
        this.f65012a = iq7Var;
        this.f65013b = z22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v84)) {
            return false;
        }
        v84 v84Var = (v84) obj;
        return this.f65012a.equals(v84Var.f65012a) && this.f65013b.equals(v84Var.f65013b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "InteractionsOptions(rageClick=" + this.f65012a + ", deadClick=" + this.f65013b + ')';
    }
}
