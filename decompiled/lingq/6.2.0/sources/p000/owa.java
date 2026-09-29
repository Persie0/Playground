package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class owa extends fxa {

    /* JADX INFO: renamed from: a */
    public final String f55112a;

    public owa(String str) {
        str.getClass();
        this.f55112a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof owa) && fa4.m11650l(this.f55112a, ((owa) obj).f55112a);
    }

    public final int hashCode() {
        return this.f55112a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnAddTermSubmitted(term=", this.f55112a, ")");
    }
}
