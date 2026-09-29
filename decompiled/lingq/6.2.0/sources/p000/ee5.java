package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ee5 extends fe5 {

    /* JADX INFO: renamed from: a */
    public final String f37108a;

    /* JADX INFO: renamed from: b */
    public final ww9 f37109b;

    /* JADX INFO: renamed from: c */
    public final ge5 f37110c;

    public ee5(String str, ww9 ww9Var, ge5 ge5Var) {
        this.f37108a = str;
        this.f37109b = ww9Var;
        this.f37110c = ge5Var;
    }

    @Override // p000.fe5
    /* JADX INFO: renamed from: a */
    public final ge5 mo10311a() {
        return this.f37110c;
    }

    @Override // p000.fe5
    /* JADX INFO: renamed from: b */
    public final ww9 mo10312b() {
        return this.f37109b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee5)) {
            return false;
        }
        ee5 ee5Var = (ee5) obj;
        return fa4.m11650l(this.f37108a, ee5Var.f37108a) && fa4.m11650l(this.f37109b, ee5Var.f37109b) && fa4.m11650l(this.f37110c, ee5Var.f37110c);
    }

    public final int hashCode() {
        int iHashCode = this.f37108a.hashCode() * 31;
        ww9 ww9Var = this.f37109b;
        int iHashCode2 = (iHashCode + (ww9Var != null ? ww9Var.hashCode() : 0)) * 31;
        ge5 ge5Var = this.f37110c;
        return iHashCode2 + (ge5Var != null ? ge5Var.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("LinkAnnotation.Url(url="), this.f37108a, ')');
    }
}
