package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kyv {

    /* JADX INFO: renamed from: a */
    public final String f37747a;

    /* JADX INFO: renamed from: b */
    public final String f37748b;

    /* JADX INFO: renamed from: c */
    public final int f37749c;

    /* JADX INFO: renamed from: d */
    public final int f37750d;

    public kyv() {
    }

    public kyv(String str, String str2, int i, int i2) {
        this.f37747a = str;
        this.f37748b = str2;
        this.f37749c = i;
        this.f37750d = i2;
    }

    /* JADX INFO: renamed from: a */
    public static kyu m15073a() {
        return new kyu();
    }

    /* JADX INFO: renamed from: b */
    public static void m15074b(bfd bfdVar, String str) {
        bge bgeVar = new bge();
        bgeVar.m2405x(true);
        bfdVar.mo2293d("http://ns.google.com/photos/1.0/container/", str, null, bgeVar);
    }

    /* JADX INFO: renamed from: c */
    public static Object m15075c(Object obj) {
        return obj == null ? "0" : obj;
    }

    /* JADX INFO: renamed from: d */
    public static String m15076d(bfd bfdVar, String str, String str2) {
        bgg bggVarMo2290a = bfdVar.mo2290a("http://ns.google.com/photos/1.0/container/", str + bdy.m2260c("http://ns.google.com/photos/1.0/container/", "Item") + bdy.m2260c("http://ns.google.com/photos/1.0/container/item/", str2));
        if (bggVarMo2290a == null) {
            return null;
        }
        return ((bfq) bggVarMo2290a).f3125a.toString();
    }

    /* JADX INFO: renamed from: e */
    public static void m15077e(Object obj, String str) throws bfc {
        if (obj == null) {
            throw new bfc("Missing value for ".concat(str), 5);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m15078f(bfd bfdVar, String str, String str2, String str3) {
        bfdVar.mo2292c("http://ns.google.com/photos/1.0/container/", str.concat(bdy.m2260c("http://ns.google.com/photos/1.0/container/item/", str2)), str3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kyv) {
            kyv kyvVar = (kyv) obj;
            if (this.f37747a.equals(kyvVar.f37747a) && this.f37748b.equals(kyvVar.f37748b) && this.f37749c == kyvVar.f37749c && this.f37750d == kyvVar.f37750d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f37747a.hashCode() ^ 1000003) * 1000003) ^ this.f37748b.hashCode()) * 1000003) ^ this.f37749c) * 1000003) ^ this.f37750d;
    }

    public final String toString() {
        return "MicroVideoXmpContainerItem{mime=" + this.f37747a + ", semantic=" + this.f37748b + ", length=" + this.f37749c + ", padding=" + this.f37750d + "}";
    }
}
