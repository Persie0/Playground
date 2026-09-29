package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y85 {

    /* JADX INFO: renamed from: a */
    public final boolean f69470a;

    /* JADX INFO: renamed from: b */
    public final String f69471b;

    /* JADX INFO: renamed from: c */
    public final String f69472c;

    /* JADX INFO: renamed from: d */
    public final boolean f69473d;

    /* JADX INFO: renamed from: e */
    public final boolean f69474e;

    /* JADX INFO: renamed from: f */
    public final int f69475f;

    public y85(int i, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f69470a = z;
        this.f69471b = str;
        this.f69472c = str2;
        this.f69473d = z2;
        this.f69474e = z3;
        this.f69475f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y85)) {
            return false;
        }
        y85 y85Var = (y85) obj;
        return this.f69470a == y85Var.f69470a && this.f69471b.equals(y85Var.f69471b) && this.f69472c.equals(y85Var.f69472c) && this.f69473d == y85Var.f69473d && this.f69474e == y85Var.f69474e && this.f69475f == y85Var.f69475f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69475f) + g9a.m12428e(g9a.m12428e(ux5.m22980c(ux5.m22980c(Boolean.hashCode(this.f69470a) * 31, this.f69471b, 31), this.f69472c, 31), 31, this.f69473d), 31, this.f69474e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryImportData(needsImport=");
        sb.append(this.f69470a);
        sb.append(", sourceUrl=");
        sb.append(this.f69471b);
        sb.append(", sourceName=");
        ux5.m22976C(this.f69472c, ", isVirtual=", ", hasAudio=", sb, this.f69473d);
        sb.append(this.f69474e);
        sb.append(", duration=");
        sb.append(this.f69475f);
        sb.append(")");
        return sb.toString();
    }
}
