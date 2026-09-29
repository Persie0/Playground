package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class dia {

    /* JADX INFO: renamed from: a */
    public final boolean f35692a;

    /* JADX INFO: renamed from: b */
    public final String f35693b;

    public dia(boolean z, String str) {
        this.f35692a = z;
        this.f35693b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m10405a() {
        return this.f35693b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10406b() {
        return this.f35692a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dia)) {
            return false;
        }
        dia diaVar = (dia) obj;
        return this.f35692a == diaVar.f35692a && fa4.m11650l(this.f35693b, diaVar.f35693b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f35692a) * 31;
        String str = this.f35693b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "UpgradePresentation(showFreeTrial=" + this.f35692a + ", offer=" + this.f35693b + ")";
    }
}
