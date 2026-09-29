package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class r42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f58597a;

    /* JADX INFO: renamed from: b */
    public final String f58598b;

    public r42(String str, String str2) {
        this.f58597a = str;
        this.f58598b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r42)) {
            return false;
        }
        r42 r42Var = (r42) obj;
        return this.f58597a.equals(r42Var.f58597a) && fa4.m11650l(this.f58598b, r42Var.f58598b);
    }

    public final int hashCode() {
        int iHashCode = this.f58597a.hashCode() * 31;
        String str = this.f58598b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ux5.m22991n("Vocabulary(language=", this.f58597a, ", filter=", this.f58598b, ")");
    }
}
