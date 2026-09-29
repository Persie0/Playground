package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class o15 extends q15 {

    /* JADX INFO: renamed from: a */
    public final String f53587a;

    /* JADX INFO: renamed from: b */
    public final String f53588b;

    public o15(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f53587a = str;
        this.f53588b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o15)) {
            return false;
        }
        o15 o15Var = (o15) obj;
        return fa4.m11650l(this.f53587a, o15Var.f53587a) && fa4.m11650l(this.f53588b, o15Var.f53588b);
    }

    public final int hashCode() {
        return this.f53588b.hashCode() + (this.f53587a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("OnTranslationChanged(language=", this.f53587a, ", text=", this.f53588b, ")");
    }
}
