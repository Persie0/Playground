package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class e3a implements j3a {

    /* JADX INFO: renamed from: a */
    public final String f36662a;

    public e3a(String str) {
        str.getClass();
        this.f36662a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3a) && fa4.m11650l(this.f36662a, ((e3a) obj).f36662a);
    }

    public final int hashCode() {
        return this.f36662a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ToggleTagSelection(tag=", this.f36662a, ")");
    }
}
