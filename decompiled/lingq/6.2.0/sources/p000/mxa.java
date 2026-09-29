package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mxa {

    /* JADX INFO: renamed from: a */
    public final int f52003a;

    /* JADX INFO: renamed from: b */
    public final String f52004b;

    /* JADX INFO: renamed from: c */
    public final int f52005c;

    /* JADX INFO: renamed from: d */
    public final int f52006d;

    /* JADX INFO: renamed from: e */
    public final boolean f52007e;

    /* JADX INFO: renamed from: f */
    public final List f52008f;

    /* JADX INFO: renamed from: g */
    public final List f52009g;

    /* JADX INFO: renamed from: h */
    public final List f52010h;

    /* JADX INFO: renamed from: i */
    public final String f52011i;

    public mxa(int i, String str, int i2, int i3, boolean z, List list, List list2, List list3, String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.f52003a = i;
        this.f52004b = str;
        this.f52005c = i2;
        this.f52006d = i3;
        this.f52007e = z;
        this.f52008f = list;
        this.f52009g = list2;
        this.f52010h = list3;
        this.f52011i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxa)) {
            return false;
        }
        mxa mxaVar = (mxa) obj;
        return this.f52003a == mxaVar.f52003a && fa4.m11650l(this.f52004b, mxaVar.f52004b) && this.f52005c == mxaVar.f52005c && this.f52006d == mxaVar.f52006d && this.f52007e == mxaVar.f52007e && fa4.m11650l(this.f52008f, mxaVar.f52008f) && this.f52009g.equals(mxaVar.f52009g) && this.f52010h.equals(mxaVar.f52010h) && fa4.m11650l(this.f52011i, mxaVar.f52011i);
    }

    public final int hashCode() {
        return this.f52011i.hashCode() + ux5.m22979b(ux5.m22979b(ux5.m22979b(g9a.m12428e(wq1.m24106b(this.f52006d, wq1.m24106b(this.f52005c, ux5.m22980c(Integer.hashCode(this.f52003a) * 31, this.f52004b, 31), 31), 31), 31, this.f52007e), 31, this.f52008f), 31, this.f52009g), 31, this.f52010h);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f52003a, "VocabularyCard(id=", ", term=", this.f52004b, ", status=");
        hn1.m13360j(this.f52005c, this.f52006d, ", extendedStatus=", ", isPhrase=", sbM22995r);
        sbM22995r.append(this.f52007e);
        sbM22995r.append(", meanings=");
        sbM22995r.append(this.f52008f);
        sbM22995r.append(", tags=");
        hn1.m13372v(sbM22995r, this.f52009g, ", gTags=", this.f52010h, ", termWithLanguage=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f52011i, ")");
    }
}
