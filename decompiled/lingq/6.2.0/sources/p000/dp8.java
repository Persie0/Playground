package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dp8 extends zyc {

    /* JADX INFO: renamed from: a */
    public final String f36008a;

    public dp8(String str) {
        this.f36008a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dp8) && this.f36008a.equals(((dp8) obj).f36008a);
    }

    public final int hashCode() {
        return this.f36008a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("RemoveBlacklistSource(source=", this.f36008a, ")");
    }
}
