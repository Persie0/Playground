package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wx6 {

    /* JADX INFO: renamed from: a */
    public final String f67485a;

    public wx6(String str) {
        this.f67485a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wx6) && this.f67485a.equals(((wx6) obj).f67485a);
    }

    public final int hashCode() {
        return this.f67485a.hashCode();
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("OpaqueKey(key="), this.f67485a, ')');
    }
}
