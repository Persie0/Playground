package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class sxa {

    /* JADX INFO: renamed from: a */
    public final int f61562a;

    /* JADX INFO: renamed from: b */
    public final String f61563b;

    /* JADX INFO: renamed from: c */
    public final String f61564c;

    /* JADX INFO: renamed from: d */
    public final String f61565d;

    /* JADX INFO: renamed from: e */
    public final boolean f61566e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f61567f;

    /* JADX INFO: renamed from: g */
    public final int f61568g;

    /* JADX INFO: renamed from: h */
    public final Integer f61569h;

    /* JADX INFO: renamed from: i */
    public final vs3 f61570i;

    public sxa(int i, String str, String str2, String str3, boolean z, ArrayList arrayList, int i2, Integer num, vs3 vs3Var) {
        str.getClass();
        vs3Var.getClass();
        this.f61562a = i;
        this.f61563b = str;
        this.f61564c = str2;
        this.f61565d = str3;
        this.f61566e = z;
        this.f61567f = arrayList;
        this.f61568g = i2;
        this.f61569h = num;
        this.f61570i = vs3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxa)) {
            return false;
        }
        sxa sxaVar = (sxa) obj;
        return this.f61562a == sxaVar.f61562a && fa4.m11650l(this.f61563b, sxaVar.f61563b) && this.f61564c.equals(sxaVar.f61564c) && this.f61565d.equals(sxaVar.f61565d) && this.f61566e == sxaVar.f61566e && this.f61567f.equals(sxaVar.f61567f) && this.f61568g == sxaVar.f61568g && this.f61569h.equals(sxaVar.f61569h) && fa4.m11650l(this.f61570i, sxaVar.f61570i);
    }

    public final int hashCode() {
        return this.f61570i.hashCode() + ((this.f61569h.hashCode() + wq1.m24106b(this.f61568g, (this.f61567f.hashCode() + g9a.m12428e(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f61562a) * 31, this.f61563b, 31), this.f61564c, 31), this.f61565d, 31), 31, this.f61566e)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f61562a, "VocabularyCardState(id=", ", term=", this.f61563b, ", displayTerm=");
        AbstractC3393o1.m17725C(sbM22995r, this.f61564c, ", meaning=", this.f61565d, ", isPhrase=");
        sbM22995r.append(this.f61566e);
        sbM22995r.append(", tags=");
        sbM22995r.append(this.f61567f);
        sbM22995r.append(", status=");
        sbM22995r.append(this.f61568g);
        sbM22995r.append(", extendedStatus=");
        sbM22995r.append(this.f61569h);
        sbM22995r.append(", colorScheme=");
        sbM22995r.append(this.f61570i);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
