package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class s59 extends x59 {

    /* JADX INFO: renamed from: a */
    public final int f60387a;

    /* JADX INFO: renamed from: b */
    public final String f60388b;

    /* JADX INFO: renamed from: c */
    public final String f60389c;

    public s59(String str, int i, String str2) {
        this.f60387a = i;
        this.f60388b = str;
        this.f60389c = str2;
    }

    @Override // p000.x59
    /* JADX INFO: renamed from: a */
    public final String mo19662a() {
        return this.f60389c;
    }

    /* JADX INFO: renamed from: b */
    public final int m21124b() {
        return this.f60387a;
    }

    /* JADX INFO: renamed from: c */
    public final String m21125c() {
        return this.f60388b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s59)) {
            return false;
        }
        s59 s59Var = (s59) obj;
        return this.f60387a == s59Var.f60387a && this.f60388b.equals(s59Var.f60388b) && this.f60389c.equals(s59Var.f60389c);
    }

    public final int hashCode() {
        return this.f60389c.hashCode() + ux5.m22980c(Integer.hashCode(this.f60387a) * 31, this.f60388b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22995r(this.f60387a, "CourseBlacklist(sourceId=", ", sourceName=", this.f60388b, ", key="), this.f60389c, ")");
    }
}
