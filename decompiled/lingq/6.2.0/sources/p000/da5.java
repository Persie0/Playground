package p000;

/* JADX INFO: loaded from: classes.dex */
public final class da5 {

    /* JADX INFO: renamed from: a */
    public final String f35291a;

    /* JADX INFO: renamed from: b */
    public final int f35292b;

    /* JADX INFO: renamed from: c */
    public final String f35293c;

    /* JADX INFO: renamed from: d */
    public final int f35294d;

    /* JADX INFO: renamed from: e */
    public final String f35295e;

    public da5(int i, int i2, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f35291a = str;
        this.f35292b = i;
        this.f35293c = str2;
        this.f35294d = i2;
        this.f35295e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da5)) {
            return false;
        }
        da5 da5Var = (da5) obj;
        return this.f35291a.equals(da5Var.f35291a) && this.f35292b == da5Var.f35292b && fa4.m11650l(this.f35293c, da5Var.f35293c) && this.f35294d == da5Var.f35294d && fa4.m11650l(this.f35295e, da5Var.f35295e);
    }

    public final int hashCode() {
        return this.f35295e.hashCode() + wq1.m24106b(this.f35294d, ux5.m22980c(wq1.m24106b(this.f35292b, this.f35291a.hashCode() * 31, 31), this.f35293c, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f35292b, "LibraryShelfAndContentJoin(codeWithLanguage=", this.f35291a, ", id=", ", type=");
        AbstractC3393o1.m17748w(this.f35294d, this.f35293c, ", order=", ", ofQuery=", sbM17741p);
        return AbstractC3393o1.m17738m(sbM17741p, this.f35295e, ")");
    }
}
