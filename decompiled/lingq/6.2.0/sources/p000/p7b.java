package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p7b {

    /* JADX INFO: renamed from: a */
    public final String f55707a;

    /* JADX INFO: renamed from: b */
    public final String f55708b;

    /* JADX INFO: renamed from: c */
    public final int f55709c;

    /* JADX INFO: renamed from: d */
    public final int f55710d;

    /* JADX INFO: renamed from: e */
    public String f55711e;

    /* JADX INFO: renamed from: f */
    public final List f55712f;

    /* JADX INFO: renamed from: g */
    public List f55713g;

    public p7b(String str, String str2, int i, int i2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list2.getClass();
        this.f55707a = str;
        this.f55708b = str2;
        this.f55709c = i;
        this.f55710d = i2;
        this.f55711e = str3;
        this.f55712f = list;
        this.f55713g = list2;
    }

    /* JADX INFO: renamed from: a */
    public final int m18938a() {
        return this.f55709c;
    }

    /* JADX INFO: renamed from: b */
    public final int m18939b() {
        return this.f55710d;
    }

    /* JADX INFO: renamed from: c */
    public final List m18940c() {
        return this.f55713g;
    }

    /* JADX INFO: renamed from: d */
    public final String m18941d() {
        return this.f55711e;
    }

    /* JADX INFO: renamed from: e */
    public final List m18942e() {
        return this.f55712f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7b)) {
            return false;
        }
        p7b p7bVar = (p7b) obj;
        return fa4.m11650l(this.f55707a, p7bVar.f55707a) && fa4.m11650l(this.f55708b, p7bVar.f55708b) && this.f55709c == p7bVar.f55709c && this.f55710d == p7bVar.f55710d && fa4.m11650l(this.f55711e, p7bVar.f55711e) && this.f55712f.equals(p7bVar.f55712f) && fa4.m11650l(this.f55713g, p7bVar.f55713g);
    }

    /* JADX INFO: renamed from: f */
    public final String m18943f() {
        return this.f55707a;
    }

    /* JADX INFO: renamed from: g */
    public final String m18944g() {
        return this.f55708b;
    }

    /* JADX INFO: renamed from: h */
    public final void m18945h(List list) {
        list.getClass();
        this.f55713g = list;
    }

    public final int hashCode() {
        return this.f55713g.hashCode() + ux5.m22979b(ux5.m22980c(wq1.m24106b(this.f55710d, wq1.m24106b(this.f55709c, ux5.m22980c(this.f55707a.hashCode() * 31, this.f55708b, 31), 31), 31), this.f55711e, 31), 31, this.f55712f);
    }

    /* JADX INFO: renamed from: i */
    public final void m18946i(String str) {
        str.getClass();
        this.f55711e = str;
    }

    public final String toString() {
        String str = this.f55711e;
        List list = this.f55713g;
        StringBuilder sbM23000w = ux5.m23000w("WordEntityUpdate(term=", this.f55707a, ", termWithLanguage=", this.f55708b, ", id=");
        hn1.m13360j(this.f55709c, this.f55710d, ", importance=", ", status=", sbM23000w);
        hn1.m13366p(str, ", tags=", ", meanings=", sbM23000w, this.f55712f);
        return hn1.m13356f(sbM23000w, list, ")");
    }
}
