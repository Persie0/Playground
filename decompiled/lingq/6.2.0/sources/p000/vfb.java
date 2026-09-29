package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vfb {

    /* JADX INFO: renamed from: a */
    public final rgb f65326a = rgb.f59244b;

    /* JADX INFO: renamed from: b */
    public final String f65327b;

    public vfb(String str) {
        this.f65327b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vfb)) {
            return false;
        }
        vfb vfbVar = (vfb) obj;
        return this.f65326a.equals(vfbVar.f65326a) && this.f65327b.equals(vfbVar.f65327b);
    }

    public final int hashCode() {
        return this.f65327b.hashCode() ^ this.f65326a.hashCode();
    }
}
