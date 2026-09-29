package p000;

/* JADX INFO: loaded from: classes.dex */
public final class de5 extends fe5 {

    /* JADX INFO: renamed from: a */
    public final String f35498a;

    /* JADX INFO: renamed from: b */
    public final ww9 f35499b;

    /* JADX INFO: renamed from: c */
    public final ge5 f35500c;

    public de5(String str, ww9 ww9Var, ge5 ge5Var) {
        this.f35498a = str;
        this.f35499b = ww9Var;
        this.f35500c = ge5Var;
    }

    @Override // p000.fe5
    /* JADX INFO: renamed from: a */
    public final ge5 mo10311a() {
        return this.f35500c;
    }

    @Override // p000.fe5
    /* JADX INFO: renamed from: b */
    public final ww9 mo10312b() {
        return this.f35499b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de5)) {
            return false;
        }
        de5 de5Var = (de5) obj;
        return fa4.m11650l(this.f35498a, de5Var.f35498a) && fa4.m11650l(this.f35499b, de5Var.f35499b) && fa4.m11650l(this.f35500c, de5Var.f35500c);
    }

    public final int hashCode() {
        int iHashCode = this.f35498a.hashCode() * 31;
        ww9 ww9Var = this.f35499b;
        int iHashCode2 = (iHashCode + (ww9Var != null ? ww9Var.hashCode() : 0)) * 31;
        ge5 ge5Var = this.f35500c;
        return iHashCode2 + (ge5Var != null ? ge5Var.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f35498a, ')');
    }
}
