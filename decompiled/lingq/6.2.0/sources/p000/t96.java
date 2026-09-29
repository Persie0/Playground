package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class t96 extends tqb {

    /* JADX INFO: renamed from: b */
    public final int f62012b;

    /* JADX INFO: renamed from: c */
    public final String f62013c;

    /* JADX INFO: renamed from: d */
    public final String f62014d;

    public t96(String str, int i, String str2) {
        this.f62012b = i;
        this.f62013c = str;
        this.f62014d = str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m21904a() {
        return this.f62012b;
    }

    /* JADX INFO: renamed from: b */
    public final String m21905b() {
        return this.f62013c;
    }

    /* JADX INFO: renamed from: c */
    public final String m21906c() {
        return this.f62014d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t96)) {
            return false;
        }
        t96 t96Var = (t96) obj;
        return this.f62012b == t96Var.f62012b && this.f62013c.equals(t96Var.f62013c) && this.f62014d.equals(t96Var.f62014d);
    }

    public final int hashCode() {
        return this.f62014d.hashCode() + ux5.m22980c(Integer.hashCode(this.f62012b) * 31, this.f62013c, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22995r(this.f62012b, "CollectionPlaylist(collectionId=", ", collectionTitle=", this.f62013c, ", shelfCode="), this.f62014d, ")");
    }
}
