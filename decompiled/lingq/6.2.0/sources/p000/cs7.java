package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class cs7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final String f34493a;

    /* JADX INFO: renamed from: b */
    public final e28 f34494b;

    public cs7(String str, e28 e28Var) {
        str.getClass();
        e28Var.getClass();
        this.f34493a = str;
        this.f34494b = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs7)) {
            return false;
        }
        cs7 cs7Var = (cs7) obj;
        return fa4.m11650l(this.f34493a, cs7Var.f34493a) && fa4.m11650l(this.f34494b, cs7Var.f34494b);
    }

    public final int hashCode() {
        return this.f34494b.hashCode() + (this.f34493a.hashCode() * 31);
    }

    public final String toString() {
        return "InvalidTextSelected(selectedText=" + this.f34493a + ", anchorRect=" + this.f34494b + ")";
    }
}
