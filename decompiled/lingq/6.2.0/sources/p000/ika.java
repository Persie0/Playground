package p000;

import com.lingq.feature.imports.data.UserImportDefaults;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class ika {

    /* JADX INFO: renamed from: a */
    public String f44237a;

    /* JADX INFO: renamed from: b */
    public String f44238b;

    /* JADX INFO: renamed from: c */
    public String f44239c;

    /* JADX INFO: renamed from: d */
    public String f44240d;

    /* JADX INFO: renamed from: e */
    public String f44241e;

    /* JADX INFO: renamed from: f */
    public String f44242f;

    /* JADX INFO: renamed from: g */
    public String f44243g;

    /* JADX INFO: renamed from: h */
    public final String f44244h;

    /* JADX INFO: renamed from: i */
    public List f44245i;

    /* JADX INFO: renamed from: j */
    public final boolean f44246j;

    public /* synthetic */ ika(int i) {
        this((i & 1) != 0 ? "" : "En", "", "", "", UserImportDefaults.Source.getDefault(), "", "", null, EmptyList.f47638a, false);
    }

    /* JADX INFO: renamed from: a */
    public static ika m13999a(ika ikaVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i) {
        if ((i & 1) != 0) {
            str = ikaVar.f44237a;
        }
        String str9 = str;
        if ((i & 2) != 0) {
            str2 = ikaVar.f44238b;
        }
        String str10 = str2;
        if ((i & 4) != 0) {
            str3 = ikaVar.f44239c;
        }
        String str11 = str3;
        if ((i & 8) != 0) {
            str4 = ikaVar.f44240d;
        }
        String str12 = str4;
        String str13 = (i & 16) != 0 ? ikaVar.f44241e : str5;
        String str14 = (i & 32) != 0 ? ikaVar.f44242f : str6;
        String str15 = (i & 64) != 0 ? ikaVar.f44243g : str7;
        String str16 = (i & 128) != 0 ? ikaVar.f44244h : str8;
        List list2 = (i & 256) != 0 ? ikaVar.f44245i : list;
        boolean z = (i & 512) != 0 ? ikaVar.f44246j : true;
        ikaVar.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        str14.getClass();
        str15.getClass();
        list2.getClass();
        return new ika(str9, str10, str11, str12, str13, str14, str15, str16, list2, z);
    }

    /* JADX INFO: renamed from: b */
    public final String m14000b() {
        return this.f44244h;
    }

    /* JADX INFO: renamed from: c */
    public final String m14001c() {
        return this.f44237a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ika)) {
            return false;
        }
        ika ikaVar = (ika) obj;
        return fa4.m11650l(this.f44237a, ikaVar.f44237a) && fa4.m11650l(this.f44238b, ikaVar.f44238b) && fa4.m11650l(this.f44239c, ikaVar.f44239c) && fa4.m11650l(this.f44240d, ikaVar.f44240d) && fa4.m11650l(this.f44241e, ikaVar.f44241e) && fa4.m11650l(this.f44242f, ikaVar.f44242f) && fa4.m11650l(this.f44243g, ikaVar.f44243g) && fa4.m11650l(this.f44244h, ikaVar.f44244h) && fa4.m11650l(this.f44245i, ikaVar.f44245i) && this.f44246j == ikaVar.f44246j;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f44237a.hashCode() * 31, this.f44238b, 31), this.f44239c, 31), this.f44240d, 31), this.f44241e, 31), this.f44242f, 31), this.f44243g, 31);
        String str = this.f44244h;
        return Boolean.hashCode(this.f44246j) + ux5.m22979b((iM22980c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f44245i);
    }

    public final String toString() {
        String str = this.f44237a;
        String str2 = this.f44238b;
        String str3 = this.f44239c;
        String str4 = this.f44240d;
        String str5 = this.f44241e;
        String str6 = this.f44242f;
        String str7 = this.f44243g;
        List list = this.f44245i;
        StringBuilder sbM23000w = ux5.m23000w("UserImportData(languageCode=", str, ", title=", str2, ", courseTitle=");
        AbstractC3393o1.m17725C(sbM23000w, str3, ", level=", str4, ", source=");
        AbstractC3393o1.m17725C(sbM23000w, str5, ", content=", str6, ", text=");
        AbstractC3393o1.m17725C(sbM23000w, str7, ", fileName=", this.f44244h, ", tags=");
        sbM23000w.append(list);
        sbM23000w.append(", defaultsLoaded=");
        sbM23000w.append(this.f44246j);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public ika(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z) {
        str.getClass();
        str5.getClass();
        this.f44237a = str;
        this.f44238b = str2;
        this.f44239c = str3;
        this.f44240d = str4;
        this.f44241e = str5;
        this.f44242f = str6;
        this.f44243g = str7;
        this.f44244h = str8;
        this.f44245i = list;
        this.f44246j = z;
    }
}
