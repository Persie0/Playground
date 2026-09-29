package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class g15 extends q15 {

    /* JADX INFO: renamed from: a */
    public final String f40048a;

    /* JADX INFO: renamed from: b */
    public final String f40049b;

    public g15(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f40048a = str;
        this.f40049b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g15)) {
            return false;
        }
        g15 g15Var = (g15) obj;
        return fa4.m11650l(this.f40048a, g15Var.f40048a) && fa4.m11650l(this.f40049b, g15Var.f40049b);
    }

    public final int hashCode() {
        return this.f40049b.hashCode() + (this.f40048a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("OnNoteChanged(language=", this.f40048a, ", text=", this.f40049b, ")");
    }
}
