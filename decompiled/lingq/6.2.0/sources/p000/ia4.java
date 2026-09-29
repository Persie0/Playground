package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ia4 {

    /* JADX INFO: renamed from: a */
    public final String f43855a;

    /* JADX INFO: renamed from: b */
    public final e28 f43856b;

    public ia4(String str, e28 e28Var) {
        str.getClass();
        e28Var.getClass();
        this.f43855a = str;
        this.f43856b = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia4)) {
            return false;
        }
        ia4 ia4Var = (ia4) obj;
        return fa4.m11650l(this.f43855a, ia4Var.f43855a) && fa4.m11650l(this.f43856b, ia4Var.f43856b);
    }

    public final int hashCode() {
        return this.f43856b.hashCode() + (this.f43855a.hashCode() * 31);
    }

    public final String toString() {
        return "InvalidSelectionInfo(selectedText=" + this.f43855a + ", anchorRect=" + this.f43856b + ")";
    }

    public /* synthetic */ ia4() {
        this("", e28.f36619e);
    }
}
