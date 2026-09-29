package p000;

/* JADX INFO: loaded from: classes.dex */
public final class lja implements InterfaceC3190kn {

    /* JADX INFO: renamed from: a */
    public final String f49749a;

    public lja(String str) {
        this.f49749a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lja) {
            return this.f49749a.equals(((lja) obj).f49749a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49749a.hashCode();
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("UrlAnnotation(url="), this.f49749a, ')');
    }
}
