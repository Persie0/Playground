package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hq8 {

    /* JADX INFO: renamed from: a */
    public final String f42788a;

    /* JADX INFO: renamed from: b */
    public final String f42789b;

    /* JADX INFO: renamed from: c */
    public final String f42790c;

    /* JADX INFO: renamed from: d */
    public final boolean f42791d;

    public hq8(String str, String str2, String str3, boolean z) {
        str.getClass();
        this.f42788a = str;
        this.f42789b = str2;
        this.f42790c = str3;
        this.f42791d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq8)) {
            return false;
        }
        hq8 hq8Var = (hq8) obj;
        return fa4.m11650l(this.f42788a, hq8Var.f42788a) && fa4.m11650l(this.f42789b, hq8Var.f42789b) && fa4.m11650l(this.f42790c, hq8Var.f42790c) && this.f42791d == hq8Var.f42791d;
    }

    public final int hashCode() {
        int iHashCode = this.f42788a.hashCode() * 31;
        String str = this.f42789b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42790c;
        return Boolean.hashCode(this.f42791d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("SearchFilterSelectionUserState(name=", this.f42788a, ", photo=", this.f42789b, ", role=");
        sbM23000w.append(this.f42790c);
        sbM23000w.append(", isSelected=");
        sbM23000w.append(this.f42791d);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
