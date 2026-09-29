package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vf7 {

    /* JADX INFO: renamed from: a */
    public final int f65316a;

    /* JADX INFO: renamed from: b */
    public final String f65317b;

    /* JADX INFO: renamed from: c */
    public final boolean f65318c;

    /* JADX INFO: renamed from: d */
    public final boolean f65319d;

    public vf7(String str, int i, boolean z, boolean z2) {
        str.getClass();
        this.f65316a = i;
        this.f65317b = str;
        this.f65318c = z;
        this.f65319d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf7)) {
            return false;
        }
        vf7 vf7Var = (vf7) obj;
        return this.f65316a == vf7Var.f65316a && fa4.m11650l(this.f65317b, vf7Var.f65317b) && this.f65318c == vf7Var.f65318c && this.f65319d == vf7Var.f65319d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65319d) + g9a.m12428e(ux5.m22980c(Integer.hashCode(this.f65316a) * 31, this.f65317b, 31), 31, this.f65318c);
    }

    public final String toString() {
        return e65.m10875g(ux5.m22995r(this.f65316a, "PlaylistsSheetParams(itemId=", ", itemUrl=", this.f65317b, ", isCourse="), this.f65318c, ", isRemoveFromPlaylist=", this.f65319d, ")");
    }
}
