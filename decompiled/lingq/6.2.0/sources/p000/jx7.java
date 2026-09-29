package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class jx7 extends mx7 {

    /* JADX INFO: renamed from: a */
    public final String f46360a;

    public jx7(String str) {
        this.f46360a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx7) && this.f46360a.equals(((jx7) obj).f46360a);
    }

    public final int hashCode() {
        return this.f46360a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("NavigateGrammarGuide(url=", this.f46360a, ")");
    }
}
