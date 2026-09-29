package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ps9 {

    /* JADX INFO: renamed from: a */
    public final C3419on f56767a;

    /* JADX INFO: renamed from: b */
    public C3419on f56768b;

    /* JADX INFO: renamed from: c */
    public boolean f56769c = false;

    /* JADX INFO: renamed from: d */
    public z46 f56770d = null;

    public ps9(C3419on c3419on, C3419on c3419on2) {
        this.f56767a = c3419on;
        this.f56768b = c3419on2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps9)) {
            return false;
        }
        ps9 ps9Var = (ps9) obj;
        return fa4.m11650l(this.f56767a, ps9Var.f56767a) && fa4.m11650l(this.f56768b, ps9Var.f56768b) && this.f56769c == ps9Var.f56769c && fa4.m11650l(this.f56770d, ps9Var.f56770d);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e((this.f56768b.hashCode() + (this.f56767a.hashCode() * 31)) * 31, 31, this.f56769c);
        z46 z46Var = this.f56770d;
        return iM12428e + (z46Var == null ? 0 : z46Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f56767a) + ", substitution=" + ((Object) this.f56768b) + ", isShowingSubstitution=" + this.f56769c + ", layoutCache=" + this.f56770d + ')';
    }
}
