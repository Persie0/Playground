package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class knd implements cnd {

    /* JADX INFO: renamed from: a */
    public final cnd f47571a;

    /* JADX INFO: renamed from: b */
    public final Object f47572b;

    public knd(cnd cndVar, Object obj) {
        this.f47571a = cndVar;
        dja.m10418b(obj, "log site qualifier");
        this.f47572b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static knd m15341a(cnd cndVar, Object obj) {
        return new knd(cndVar, obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof knd)) {
            return false;
        }
        knd kndVar = (knd) obj;
        return this.f47571a.equals(kndVar.f47571a) && this.f47572b.equals(kndVar.f47572b);
    }

    public final int hashCode() {
        return this.f47572b.hashCode() ^ this.f47571a.hashCode();
    }

    public final String toString() {
        String string = this.f47571a.toString();
        int length = string.length();
        String string2 = this.f47572b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 3);
        AbstractC3393o1.m17725C(sb, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
        sb.append("' }");
        return sb.toString();
    }
}
