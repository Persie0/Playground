package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class g48 {

    /* JADX INFO: renamed from: a */
    public final String f40185a;

    /* JADX INFO: renamed from: b */
    public final String f40186b;

    /* JADX INFO: renamed from: c */
    public final boolean f40187c;

    public g48(String str, String str2, boolean z) {
        this.f40185a = str;
        this.f40186b = str2;
        this.f40187c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g48)) {
            return false;
        }
        g48 g48Var = (g48) obj;
        return this.f40185a.equals(g48Var.f40185a) && this.f40186b.equals(g48Var.f40186b) && this.f40187c == g48Var.f40187c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40187c) + ux5.m22980c(this.f40185a.hashCode() * 31, this.f40186b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m23000w("RegistrationResult(email=", this.f40185a, ", password=", this.f40186b, ", isSocial="), this.f40187c, ")");
    }
}
