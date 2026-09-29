package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class nw0 {

    /* JADX INFO: renamed from: a */
    public final int f53305a;

    /* JADX INFO: renamed from: b */
    public final String f53306b;

    /* JADX INFO: renamed from: c */
    public final String f53307c;

    /* JADX INFO: renamed from: d */
    public final String f53308d;

    public nw0(String str, int i, String str2, String str3) {
        str.getClass();
        this.f53305a = i;
        this.f53306b = str;
        this.f53307c = str2;
        this.f53308d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw0)) {
            return false;
        }
        nw0 nw0Var = (nw0) obj;
        return this.f53305a == nw0Var.f53305a && fa4.m11650l(this.f53306b, nw0Var.f53306b) && fa4.m11650l(this.f53307c, nw0Var.f53307c) && fa4.m11650l(this.f53308d, nw0Var.f53308d);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f53305a) * 31, this.f53306b, 31);
        String str = this.f53307c;
        int iHashCode = (iM22980c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53308d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m22995r(this.f53305a, "ChatLessonSuggestion(id=", ", title=", this.f53306b, ", imageUrl="), this.f53307c, ", collectionTitle=", this.f53308d, ")");
    }
}
