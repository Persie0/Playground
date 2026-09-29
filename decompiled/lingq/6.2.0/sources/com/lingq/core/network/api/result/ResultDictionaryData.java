package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultDictionaryData {
    public static final C1644e1 Companion = new C1644e1();

    /* JADX INFO: renamed from: a */
    public final int f20825a;

    /* JADX INFO: renamed from: b */
    public final String f20826b;

    /* JADX INFO: renamed from: c */
    public final int f20827c;

    /* JADX INFO: renamed from: d */
    public final String f20828d;

    /* JADX INFO: renamed from: e */
    public final String f20829e;

    /* JADX INFO: renamed from: f */
    public final boolean f20830f;

    /* JADX INFO: renamed from: g */
    public final String f20831g;

    /* JADX INFO: renamed from: h */
    public final String f20832h;

    /* JADX INFO: renamed from: i */
    public final String f20833i;

    /* JADX INFO: renamed from: j */
    public final String f20834j;

    /* JADX INFO: renamed from: k */
    public final String f20835k;

    /* JADX INFO: renamed from: l */
    public final String f20836l;

    /* JADX INFO: renamed from: m */
    public final String f20837m;

    public /* synthetic */ ResultDictionaryData(int i, int i2, String str, int i3, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if ((i & 1) == 0) {
            this.f20825a = 0;
        } else {
            this.f20825a = i2;
        }
        if ((i & 2) == 0) {
            this.f20826b = null;
        } else {
            this.f20826b = str;
        }
        if ((i & 4) == 0) {
            this.f20827c = -1;
        } else {
            this.f20827c = i3;
        }
        if ((i & 8) == 0) {
            this.f20828d = null;
        } else {
            this.f20828d = str2;
        }
        if ((i & 16) == 0) {
            this.f20829e = null;
        } else {
            this.f20829e = str3;
        }
        if ((i & 32) == 0) {
            this.f20830f = false;
        } else {
            this.f20830f = z;
        }
        if ((i & 64) == 0) {
            this.f20831g = null;
        } else {
            this.f20831g = str4;
        }
        if ((i & 128) == 0) {
            this.f20832h = null;
        } else {
            this.f20832h = str5;
        }
        if ((i & 256) == 0) {
            this.f20833i = null;
        } else {
            this.f20833i = str6;
        }
        if ((i & 512) == 0) {
            this.f20834j = null;
        } else {
            this.f20834j = str7;
        }
        if ((i & 1024) == 0) {
            this.f20835k = null;
        } else {
            this.f20835k = str8;
        }
        if ((i & 2048) == 0) {
            this.f20836l = null;
        } else {
            this.f20836l = str9;
        }
        if ((i & 4096) == 0) {
            this.f20837m = null;
        } else {
            this.f20837m = str10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultDictionaryData)) {
            return false;
        }
        ResultDictionaryData resultDictionaryData = (ResultDictionaryData) obj;
        return this.f20825a == resultDictionaryData.f20825a && fa4.m11650l(this.f20826b, resultDictionaryData.f20826b) && this.f20827c == resultDictionaryData.f20827c && fa4.m11650l(this.f20828d, resultDictionaryData.f20828d) && fa4.m11650l(this.f20829e, resultDictionaryData.f20829e) && this.f20830f == resultDictionaryData.f20830f && fa4.m11650l(this.f20831g, resultDictionaryData.f20831g) && fa4.m11650l(this.f20832h, resultDictionaryData.f20832h) && fa4.m11650l(this.f20833i, resultDictionaryData.f20833i) && fa4.m11650l(this.f20834j, resultDictionaryData.f20834j) && fa4.m11650l(this.f20835k, resultDictionaryData.f20835k) && fa4.m11650l(this.f20836l, resultDictionaryData.f20836l) && fa4.m11650l(this.f20837m, resultDictionaryData.f20837m);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20825a) * 31;
        String str = this.f20826b;
        int iM24106b = wq1.m24106b(this.f20827c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f20828d;
        int iHashCode2 = (iM24106b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20829e;
        int iM12428e = g9a.m12428e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f20830f);
        String str4 = this.f20831g;
        int iHashCode3 = (iM12428e + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20832h;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20833i;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f20834j;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20835k;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f20836l;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f20837m;
        return iHashCode8 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f20825a, "ResultDictionaryData(id=", ", name=", this.f20826b, ", order=");
        hn1.m13361k(this.f20827c, ", urlToTransform=", this.f20828d, ", urlDefinition=", sbM22995r);
        ux5.m22976C(this.f20829e, ", isPopUpWindow=", ", languageTo=", sbM22995r, this.f20830f);
        AbstractC3393o1.m17725C(sbM22995r, this.f20831g, ", urlVar1=", this.f20832h, ", urlVar2=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20833i, ", urlVar3=", this.f20834j, ", urlVar4=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20835k, ", urlVar5=", this.f20836l, ", overrideUrl=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f20837m, ")");
    }
}
