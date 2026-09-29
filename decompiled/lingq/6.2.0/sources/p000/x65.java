package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x65 {

    /* JADX INFO: renamed from: a */
    public final String f67819a;

    /* JADX INFO: renamed from: b */
    public final int f67820b;

    /* JADX INFO: renamed from: c */
    public final String f67821c;

    /* JADX INFO: renamed from: d */
    public final String f67822d;

    /* JADX INFO: renamed from: e */
    public final List f67823e;

    /* JADX INFO: renamed from: f */
    public final String f67824f;

    /* JADX INFO: renamed from: g */
    public final String f67825g;

    /* JADX INFO: renamed from: h */
    public final int f67826h;

    /* JADX INFO: renamed from: i */
    public final String f67827i;

    /* JADX INFO: renamed from: j */
    public final String f67828j;

    /* JADX INFO: renamed from: k */
    public final boolean f67829k;

    public x65(String str, int i, String str2, String str3, List list, String str4, String str5, int i2, String str6, String str7, boolean z) {
        str2.getClass();
        this.f67819a = str;
        this.f67820b = i;
        this.f67821c = str2;
        this.f67822d = str3;
        this.f67823e = list;
        this.f67824f = str4;
        this.f67825g = str5;
        this.f67826h = i2;
        this.f67827i = str6;
        this.f67828j = str7;
        this.f67829k = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m24293a() {
        return this.f67826h;
    }

    /* JADX INFO: renamed from: b */
    public final String m24294b() {
        return this.f67825g;
    }

    /* JADX INFO: renamed from: c */
    public final int m24295c() {
        return this.f67820b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m24296d() {
        return this.f67829k;
    }

    /* JADX INFO: renamed from: e */
    public final String m24297e() {
        return this.f67828j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x65)) {
            return false;
        }
        x65 x65Var = (x65) obj;
        return this.f67819a.equals(x65Var.f67819a) && this.f67820b == x65Var.f67820b && fa4.m11650l(this.f67821c, x65Var.f67821c) && fa4.m11650l(this.f67822d, x65Var.f67822d) && fa4.m11650l(this.f67823e, x65Var.f67823e) && fa4.m11650l(this.f67824f, x65Var.f67824f) && fa4.m11650l(this.f67825g, x65Var.f67825g) && this.f67826h == x65Var.f67826h && fa4.m11650l(this.f67827i, x65Var.f67827i) && fa4.m11650l(this.f67828j, x65Var.f67828j) && this.f67829k == x65Var.f67829k;
    }

    /* JADX INFO: renamed from: f */
    public final String m24298f() {
        return this.f67827i;
    }

    /* JADX INFO: renamed from: g */
    public final String m24299g() {
        return this.f67819a;
    }

    /* JADX INFO: renamed from: h */
    public final String m24300h() {
        return this.f67822d;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f67820b, this.f67819a.hashCode() * 31, 31), this.f67821c, 31);
        String str = this.f67822d;
        int iHashCode = (iM22980c + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f67823e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f67824f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f67825g;
        int iM24106b = wq1.m24106b(this.f67826h, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f67827i;
        int iHashCode4 = (iM24106b + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f67828j;
        return Boolean.hashCode(this.f67829k) + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m24301i() {
        return this.f67824f;
    }

    /* JADX INFO: renamed from: j */
    public final List m24302j() {
        return this.f67823e;
    }

    /* JADX INFO: renamed from: k */
    public final String m24303k() {
        return this.f67821c;
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f67820b, "LessonTrackingData(language=", this.f67819a, ", id=", ", title=");
        AbstractC3393o1.m17725C(sbM17741p, this.f67821c, ", level=", this.f67822d, ", tags=");
        wq1.m24130z(", sharedByName=", this.f67824f, ", collectionTitle=", sbM17741p, this.f67823e);
        AbstractC3393o1.m17748w(this.f67826h, this.f67825g, ", collectionId=", ", importMethod=", sbM17741p);
        AbstractC3393o1.m17725C(sbM17741p, this.f67827i, ", importLesson=", this.f67828j, ", importByUser=");
        return AbstractC3393o1.m17740o(sbM17741p, this.f67829k, ")");
    }
}
