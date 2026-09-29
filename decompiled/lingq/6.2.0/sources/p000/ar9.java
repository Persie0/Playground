package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ar9 {

    /* JADX INFO: renamed from: a */
    public final String f7405a;

    /* JADX INFO: renamed from: b */
    public final boolean f7406b;

    public ar9(String str, boolean z) {
        str.getClass();
        this.f7405a = str;
        this.f7406b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar9)) {
            return false;
        }
        ar9 ar9Var = (ar9) obj;
        return fa4.m11650l(this.f7405a, ar9Var.f7405a) && this.f7406b == ar9Var.f7406b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7406b) + (this.f7405a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(tag=" + this.f7405a + ", isGrammarTag=" + this.f7406b + ")";
    }
}
