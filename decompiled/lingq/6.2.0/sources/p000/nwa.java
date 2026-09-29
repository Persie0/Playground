package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nwa {

    /* JADX INFO: renamed from: a */
    public final Map f53336a;

    /* JADX INFO: renamed from: b */
    public final Map f53337b;

    /* JADX INFO: renamed from: c */
    public final Map f53338c;

    /* JADX INFO: renamed from: d */
    public final boolean f53339d;

    /* JADX INFO: renamed from: e */
    public final String f53340e;

    /* JADX INFO: renamed from: f */
    public final Map f53341f;

    public nwa(Map map, Map map2, Map map3, boolean z, String str, Map map4) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        str.getClass();
        map4.getClass();
        this.f53336a = map;
        this.f53337b = map2;
        this.f53338c = map3;
        this.f53339d = z;
        this.f53340e = str;
        this.f53341f = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwa)) {
            return false;
        }
        nwa nwaVar = (nwa) obj;
        return fa4.m11650l(this.f53336a, nwaVar.f53336a) && fa4.m11650l(this.f53337b, nwaVar.f53337b) && fa4.m11650l(this.f53338c, nwaVar.f53338c) && this.f53339d == nwaVar.f53339d && fa4.m11650l(this.f53340e, nwaVar.f53340e) && fa4.m11650l(this.f53341f, nwaVar.f53341f);
    }

    public final int hashCode() {
        return this.f53341f.hashCode() + ux5.m22980c(g9a.m12428e(e65.m10869a(e65.m10869a(this.f53336a.hashCode() * 31, 31, this.f53337b), 31, this.f53338c), 31, this.f53339d), this.f53340e, 31);
    }

    public final String toString() {
        return "VocabSnapshot(cards=" + this.f53336a + ", words=" + this.f53337b + ", phrases=" + this.f53338c + ", cwtEnabled=" + this.f53339d + ", activeLocale=" + this.f53340e + ", cwtByPosition=" + this.f53341f + ")";
    }
}
