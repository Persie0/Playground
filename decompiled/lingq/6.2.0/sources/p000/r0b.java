package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class r0b {

    /* JADX INFO: renamed from: a */
    public final int f58465a;

    /* JADX INFO: renamed from: b */
    public final int f58466b;

    /* JADX INFO: renamed from: c */
    public final String f58467c;

    /* JADX INFO: renamed from: d */
    public final boolean f58468d;

    /* JADX INFO: renamed from: e */
    public final boolean f58469e;

    public r0b(int i, int i2, String str, boolean z, boolean z2) {
        str.getClass();
        this.f58465a = i;
        this.f58466b = i2;
        this.f58467c = str;
        this.f58468d = z;
        this.f58469e = z2;
    }

    /* JADX INFO: renamed from: a */
    public static r0b m20229a(r0b r0bVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = r0bVar.f58465a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            i2 = r0bVar.f58466b;
        }
        String str = r0bVar.f58467c;
        boolean z = r0bVar.f58468d;
        boolean z2 = r0bVar.f58469e;
        r0bVar.getClass();
        str.getClass();
        return new r0b(i4, i2, str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0b)) {
            return false;
        }
        r0b r0bVar = (r0b) obj;
        return this.f58465a == r0bVar.f58465a && this.f58466b == r0bVar.f58466b && fa4.m11650l(this.f58467c, r0bVar.f58467c) && this.f58468d == r0bVar.f58468d && this.f58469e == r0bVar.f58469e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58469e) + g9a.m12428e(ux5.m22980c(wq1.m24106b(this.f58466b, Integer.hashCode(this.f58465a) * 31, 31), this.f58467c, 31), 31, this.f58468d);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f58465a, this.f58466b, "VocabularyPageState(currentPage=", ", totalPages=", ", label=");
        ux5.m22976C(this.f58467c, ", canGoPrevious=", ", canGoNext=", sbM22994q, this.f58468d);
        return AbstractC3393o1.m17740o(sbM22994q, this.f58469e, ")");
    }

    public /* synthetic */ r0b() {
        this(1, 1, "1/1", false, false);
    }
}
