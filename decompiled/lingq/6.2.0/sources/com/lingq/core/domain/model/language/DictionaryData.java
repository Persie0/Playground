package com.lingq.core.domain.model.language;

import p000.AbstractC3393o1;
import p000.cl9;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.vk9;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class DictionaryData {
    public static final C1423c Companion = new C1423c();

    /* JADX INFO: renamed from: a */
    public final int f19008a;

    /* JADX INFO: renamed from: b */
    public final String f19009b;

    /* JADX INFO: renamed from: c */
    public final int f19010c;

    /* JADX INFO: renamed from: d */
    public final String f19011d;

    /* JADX INFO: renamed from: e */
    public final String f19012e;

    /* JADX INFO: renamed from: f */
    public final boolean f19013f;

    /* JADX INFO: renamed from: g */
    public final String f19014g;

    /* JADX INFO: renamed from: h */
    public final String f19015h;

    /* JADX INFO: renamed from: i */
    public final String f19016i;

    /* JADX INFO: renamed from: j */
    public final String f19017j;

    /* JADX INFO: renamed from: k */
    public final String f19018k;

    /* JADX INFO: renamed from: l */
    public final String f19019l;

    /* JADX INFO: renamed from: m */
    public final String f19020m;

    public /* synthetic */ DictionaryData(int i, int i2, String str, int i3, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, DictionaryData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19008a = i2;
        if ((i & 2) == 0) {
            this.f19009b = "";
        } else {
            this.f19009b = str;
        }
        if ((i & 4) == 0) {
            this.f19010c = -1;
        } else {
            this.f19010c = i3;
        }
        if ((i & 8) == 0) {
            this.f19011d = "";
        } else {
            this.f19011d = str2;
        }
        if ((i & 16) == 0) {
            this.f19012e = "";
        } else {
            this.f19012e = str3;
        }
        if ((i & 32) == 0) {
            this.f19013f = false;
        } else {
            this.f19013f = z;
        }
        if ((i & 64) == 0) {
            this.f19014g = "";
        } else {
            this.f19014g = str4;
        }
        if ((i & 128) == 0) {
            this.f19015h = "";
        } else {
            this.f19015h = str5;
        }
        if ((i & 256) == 0) {
            this.f19016i = "";
        } else {
            this.f19016i = str6;
        }
        if ((i & 512) == 0) {
            this.f19017j = "";
        } else {
            this.f19017j = str7;
        }
        if ((i & 1024) == 0) {
            this.f19018k = "";
        } else {
            this.f19018k = str8;
        }
        if ((i & 2048) == 0) {
            this.f19019l = "";
        } else {
            this.f19019l = str9;
        }
        if ((i & 4096) == 0) {
            this.f19020m = "";
        } else {
            this.f19020m = str10;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8022a() {
        return cl9.m4839V(cl9.m4839V(this.f19009b, "(popup)", ""), "(Popup)", "");
    }

    /* JADX INFO: renamed from: b */
    public final String m8023b(String str) {
        str.getClass();
        String str2 = this.f19020m;
        boolean zM23391n0 = vk9.m23391n0(str2);
        String str3 = this.f19019l;
        String str4 = this.f19018k;
        String str5 = this.f19017j;
        String str6 = this.f19016i;
        String str7 = this.f19015h;
        return !zM23391n0 ? cl9.m4839V(cl9.m4839V(cl9.m4839V(cl9.m4839V(cl9.m4839V(cl9.m4839V(str2, "%(term)s", str), "%(var1)s", str7), "%(var2)s", str6), "%(var3)s", str5), "%(var4)s", str4), "%(var5)s", str3) : cl9.m4839V(cl9.m4839V(cl9.m4839V(cl9.m4839V(cl9.m4839V(cl9.m4839V(this.f19011d, "%(term)s", str), "%(var1)s", str7), "%(var2)s", str6), "%(var3)s", str5), "%(var4)s", str4), "%(var5)s", str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionaryData)) {
            return false;
        }
        DictionaryData dictionaryData = (DictionaryData) obj;
        return this.f19008a == dictionaryData.f19008a && fa4.m11650l(this.f19009b, dictionaryData.f19009b) && this.f19010c == dictionaryData.f19010c && fa4.m11650l(this.f19011d, dictionaryData.f19011d) && fa4.m11650l(this.f19012e, dictionaryData.f19012e) && this.f19013f == dictionaryData.f19013f && fa4.m11650l(this.f19014g, dictionaryData.f19014g) && fa4.m11650l(this.f19015h, dictionaryData.f19015h) && fa4.m11650l(this.f19016i, dictionaryData.f19016i) && fa4.m11650l(this.f19017j, dictionaryData.f19017j) && fa4.m11650l(this.f19018k, dictionaryData.f19018k) && fa4.m11650l(this.f19019l, dictionaryData.f19019l) && fa4.m11650l(this.f19020m, dictionaryData.f19020m);
    }

    public final int hashCode() {
        return this.f19020m.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(g9a.m12428e(ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f19010c, ux5.m22980c(Integer.hashCode(this.f19008a) * 31, this.f19009b, 31), 31), this.f19011d, 31), this.f19012e, 31), 31, this.f19013f), this.f19014g, 31), this.f19015h, 31), this.f19016i, 31), this.f19017j, 31), this.f19018k, 31), this.f19019l, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f19008a, "DictionaryData(id=", ", name=", this.f19009b, ", order=");
        hn1.m13361k(this.f19010c, ", urlToTransform=", this.f19011d, ", urlDefinition=", sbM22995r);
        ux5.m22976C(this.f19012e, ", isPopUpWindow=", ", languageTo=", sbM22995r, this.f19013f);
        AbstractC3393o1.m17725C(sbM22995r, this.f19014g, ", urlVar1=", this.f19015h, ", urlVar2=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19016i, ", urlVar3=", this.f19017j, ", urlVar4=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19018k, ", urlVar5=", this.f19019l, ", overrideUrl=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f19020m, ")");
    }

    public DictionaryData(int i, String str, int i2, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        ux5.m22975B(str, str2, str3, str4, str5);
        ux5.m22975B(str6, str7, str8, str9, str10);
        this.f19008a = i;
        this.f19009b = str;
        this.f19010c = i2;
        this.f19011d = str2;
        this.f19012e = str3;
        this.f19013f = z;
        this.f19014g = str4;
        this.f19015h = str5;
        this.f19016i = str6;
        this.f19017j = str7;
        this.f19018k = str8;
        this.f19019l = str9;
        this.f19020m = str10;
    }

    public /* synthetic */ DictionaryData(String str, int i, String str2) {
        this(i, str, -1, "", "", false, str2, "", "", "", "", "", "");
    }
}
