package p338qd;

/* JADX INFO: renamed from: qd.y */
/* JADX INFO: loaded from: classes.dex */
public final class C8592y extends AbstractC8521a {

    /* JADX INFO: renamed from: a */
    public final int f46042a;

    /* JADX INFO: renamed from: b */
    public final String f46043b;

    /* JADX INFO: renamed from: c */
    public final String f46044c;

    public C8592y(String str, int i10, String str2) {
        this.f46042a = i10;
        this.f46043b = str;
        this.f46044c = str2;
    }

    @Override // p338qd.AbstractC8521a
    /* JADX INFO: renamed from: a */
    public final String mo16626a() {
        return this.f46044c;
    }

    @Override // p338qd.AbstractC8521a
    /* JADX INFO: renamed from: b */
    public final int mo16627b() {
        return this.f46042a;
    }

    @Override // p338qd.AbstractC8521a
    /* JADX INFO: renamed from: c */
    public final String mo16628c() {
        return this.f46043b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8521a) {
            AbstractC8521a abstractC8521a = (AbstractC8521a) obj;
            if (this.f46042a == abstractC8521a.mo16627b() && ((str = this.f46043b) != null ? str.equals(abstractC8521a.mo16628c()) : abstractC8521a.mo16628c() == null)) {
                String str2 = this.f46044c;
                if (str2 == null) {
                    if (abstractC8521a.mo16626a() == null) {
                        return true;
                    }
                } else if (str2.equals(abstractC8521a.mo16626a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f46042a ^ 1000003) * 1000003;
        int iHashCode = 0;
        String str = this.f46043b;
        int iHashCode2 = (i10 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f46044c;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return iHashCode2 ^ iHashCode;
    }

    public final String toString() {
        String str = this.f46043b;
        int length = String.valueOf(str).length();
        String str2 = this.f46044c;
        StringBuilder sb2 = new StringBuilder(length + 68 + String.valueOf(str2).length());
        sb2.append("AssetPackLocation{packStorageMethod=");
        sb2.append(this.f46042a);
        sb2.append(", path=");
        sb2.append(str);
        sb2.append(", assetsPath=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
