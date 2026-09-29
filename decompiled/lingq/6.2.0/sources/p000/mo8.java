package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mo8 {

    /* JADX INFO: renamed from: a */
    public final String f51647a;

    /* JADX INFO: renamed from: b */
    public final hs8 f51648b;

    public mo8(String str, hs8 hs8Var) {
        this.f51647a = str;
        this.f51648b = hs8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo8)) {
            return false;
        }
        mo8 mo8Var = (mo8) obj;
        return this.f51647a.equals(mo8Var.f51647a) && this.f51648b.equals(mo8Var.f51648b);
    }

    public final int hashCode() {
        return this.f51648b.hashCode() + (this.f51647a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchBlacklistItemState(title=" + this.f51647a + ", undoAction=" + this.f51648b + ")";
    }
}
