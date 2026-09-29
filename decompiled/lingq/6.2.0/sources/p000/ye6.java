package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ye6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final int f69729a;

    public ye6(int i) {
        this.f69729a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye6) && this.f69729a == ((ye6) obj).f69729a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69729a);
    }

    public final String toString() {
        return ux5.m22989l("PlaylistFolder(folderId=", this.f69729a, ")");
    }
}
