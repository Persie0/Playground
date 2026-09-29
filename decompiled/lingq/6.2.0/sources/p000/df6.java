package p000;

/* JADX INFO: loaded from: classes.dex */
public final class df6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f35565a;

    public df6(String str) {
        this.f35565a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df6) && fa4.m11650l(this.f35565a, ((df6) obj).f35565a);
    }

    public final int hashCode() {
        String str = this.f35565a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Upgrade(offer=", this.f35565a, ")");
    }
}
