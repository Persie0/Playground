package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class po8 extends zyc {

    /* JADX INFO: renamed from: a */
    public final String f56595a;

    public po8(String str) {
        str.getClass();
        this.f56595a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof po8) && fa4.m11650l(this.f56595a, ((po8) obj).f56595a);
    }

    public final int hashCode() {
        return this.f56595a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("BlacklistSource(source=", this.f56595a, ")");
    }
}
