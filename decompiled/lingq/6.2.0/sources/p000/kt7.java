package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kt7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final String f48414a;

    /* JADX INFO: renamed from: b */
    public final String f48415b;

    public kt7(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f48414a = str;
        this.f48415b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt7)) {
            return false;
        }
        kt7 kt7Var = (kt7) obj;
        return fa4.m11650l(this.f48414a, kt7Var.f48414a) && fa4.m11650l(this.f48415b, kt7Var.f48415b);
    }

    public final int hashCode() {
        return this.f48415b.hashCode() + (this.f48414a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("VocabularyMoveKnownIgnored(term=", this.f48414a, ", action=", this.f48415b, ")");
    }
}
