package com.lingq.core.domain.model.user;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.ri5;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class Profile {
    public static final C1506h Companion = new C1506h();

    /* JADX INFO: renamed from: z */
    public static final cs4[] f19651z = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new ri5(14)), null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final int f19652a;

    /* JADX INFO: renamed from: b */
    public final String f19653b;

    /* JADX INFO: renamed from: c */
    public final String f19654c;

    /* JADX INFO: renamed from: d */
    public final String f19655d;

    /* JADX INFO: renamed from: e */
    public final String f19656e;

    /* JADX INFO: renamed from: f */
    public final String f19657f;

    /* JADX INFO: renamed from: g */
    public final String f19658g;

    /* JADX INFO: renamed from: h */
    public final String f19659h;

    /* JADX INFO: renamed from: i */
    public final String f19660i;

    /* JADX INFO: renamed from: j */
    public final String f19661j;

    /* JADX INFO: renamed from: k */
    public String f19662k;

    /* JADX INFO: renamed from: l */
    public final String f19663l;

    /* JADX INFO: renamed from: m */
    public final String f19664m;

    /* JADX INFO: renamed from: n */
    public String f19665n;

    /* JADX INFO: renamed from: o */
    public String f19666o;

    /* JADX INFO: renamed from: p */
    public String f19667p;

    /* JADX INFO: renamed from: q */
    public final String f19668q;

    /* JADX INFO: renamed from: r */
    public List f19669r;

    /* JADX INFO: renamed from: s */
    public final ProfileSetting f19670s;

    /* JADX INFO: renamed from: t */
    public int f19671t;

    /* JADX INFO: renamed from: u */
    public final String f19672u;

    /* JADX INFO: renamed from: v */
    public final int f19673v;

    /* JADX INFO: renamed from: w */
    public final int f19674w;

    /* JADX INFO: renamed from: x */
    public final Boolean f19675x;

    /* JADX INFO: renamed from: y */
    public final Boolean f19676y;

    public /* synthetic */ Profile(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list, ProfileSetting profileSetting, int i3, String str17, int i4, int i5, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.f19652a = 0;
        } else {
            this.f19652a = i2;
        }
        if ((i & 2) == 0) {
            this.f19653b = "";
        } else {
            this.f19653b = str;
        }
        if ((i & 4) == 0) {
            this.f19654c = "";
        } else {
            this.f19654c = str2;
        }
        if ((i & 8) == 0) {
            this.f19655d = null;
        } else {
            this.f19655d = str3;
        }
        if ((i & 16) == 0) {
            this.f19656e = "";
        } else {
            this.f19656e = str4;
        }
        if ((i & 32) == 0) {
            this.f19657f = "";
        } else {
            this.f19657f = str5;
        }
        if ((i & 64) == 0) {
            this.f19658g = "";
        } else {
            this.f19658g = str6;
        }
        if ((i & 128) == 0) {
            this.f19659h = "";
        } else {
            this.f19659h = str7;
        }
        if ((i & 256) == 0) {
            this.f19660i = "";
        } else {
            this.f19660i = str8;
        }
        if ((i & 512) == 0) {
            this.f19661j = "";
        } else {
            this.f19661j = str9;
        }
        if ((i & 1024) == 0) {
            this.f19662k = "";
        } else {
            this.f19662k = str10;
        }
        if ((i & 2048) == 0) {
            this.f19663l = null;
        } else {
            this.f19663l = str11;
        }
        if ((i & 4096) == 0) {
            this.f19664m = "";
        } else {
            this.f19664m = str12;
        }
        if ((i & 8192) == 0) {
            this.f19665n = "";
        } else {
            this.f19665n = str13;
        }
        if ((i & 16384) == 0) {
            this.f19666o = "";
        } else {
            this.f19666o = str14;
        }
        if ((32768 & i) == 0) {
            this.f19667p = "";
        } else {
            this.f19667p = str15;
        }
        if ((65536 & i) == 0) {
            this.f19668q = "";
        } else {
            this.f19668q = str16;
        }
        this.f19669r = (131072 & i) == 0 ? EmptyList.f47638a : list;
        if ((262144 & i) == 0) {
            this.f19670s = null;
        } else {
            this.f19670s = profileSetting;
        }
        if ((524288 & i) == 0) {
            this.f19671t = 0;
        } else {
            this.f19671t = i3;
        }
        if ((1048576 & i) == 0) {
            this.f19672u = "";
        } else {
            this.f19672u = str17;
        }
        if ((2097152 & i) == 0) {
            this.f19673v = 0;
        } else {
            this.f19673v = i4;
        }
        if ((4194304 & i) == 0) {
            this.f19674w = 0;
        } else {
            this.f19674w = i5;
        }
        this.f19675x = (8388608 & i) == 0 ? Boolean.FALSE : bool;
        this.f19676y = (i & 16777216) == 0 ? Boolean.FALSE : bool2;
    }

    /* JADX INFO: renamed from: a */
    public final int m8137a() {
        return this.f19652a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return this.f19652a == profile.f19652a && fa4.m11650l(this.f19653b, profile.f19653b) && fa4.m11650l(this.f19654c, profile.f19654c) && fa4.m11650l(this.f19655d, profile.f19655d) && fa4.m11650l(this.f19656e, profile.f19656e) && fa4.m11650l(this.f19657f, profile.f19657f) && fa4.m11650l(this.f19658g, profile.f19658g) && fa4.m11650l(this.f19659h, profile.f19659h) && fa4.m11650l(this.f19660i, profile.f19660i) && fa4.m11650l(this.f19661j, profile.f19661j) && fa4.m11650l(this.f19662k, profile.f19662k) && fa4.m11650l(this.f19663l, profile.f19663l) && fa4.m11650l(this.f19664m, profile.f19664m) && fa4.m11650l(this.f19665n, profile.f19665n) && fa4.m11650l(this.f19666o, profile.f19666o) && fa4.m11650l(this.f19667p, profile.f19667p) && fa4.m11650l(this.f19668q, profile.f19668q) && fa4.m11650l(this.f19669r, profile.f19669r) && fa4.m11650l(this.f19670s, profile.f19670s) && this.f19671t == profile.f19671t && fa4.m11650l(this.f19672u, profile.f19672u) && this.f19673v == profile.f19673v && this.f19674w == profile.f19674w && fa4.m11650l(this.f19675x, profile.f19675x) && fa4.m11650l(this.f19676y, profile.f19676y);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f19652a) * 31, this.f19653b, 31), this.f19654c, 31);
        String str = this.f19655d;
        int iM22980c2 = ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c((iM22980c + (str == null ? 0 : str.hashCode())) * 31, this.f19656e, 31), this.f19657f, 31), this.f19658g, 31), this.f19659h, 31), this.f19660i, 31), this.f19661j, 31), this.f19662k, 31);
        String str2 = this.f19663l;
        int iM22979b = ux5.m22979b(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c((iM22980c2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.f19664m, 31), this.f19665n, 31), this.f19666o, 31), this.f19667p, 31), this.f19668q, 31), 31, this.f19669r);
        ProfileSetting profileSetting = this.f19670s;
        int iM24106b = wq1.m24106b(this.f19671t, (iM22979b + (profileSetting == null ? 0 : profileSetting.hashCode())) * 31, 31);
        String str3 = this.f19672u;
        int iM24106b2 = wq1.m24106b(this.f19674w, wq1.m24106b(this.f19673v, (iM24106b + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        Boolean bool = this.f19675x;
        int iHashCode = (iM24106b2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f19676y;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f19662k;
        String str2 = this.f19665n;
        String str3 = this.f19666o;
        String str4 = this.f19667p;
        List list = this.f19669r;
        int i = this.f19671t;
        StringBuilder sbM22995r = ux5.m22995r(this.f19652a, "Profile(id=", ", url=", this.f19653b, ", username=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19654c, ", role=", this.f19655d, ", firstName=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19656e, ", lastName=", this.f19657f, ", email=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19658g, ", country=", this.f19659h, ", skypeName=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19660i, ", province=", this.f19661j, ", timezone=");
        AbstractC3393o1.m17725C(sbM22995r, str, ", photo=", this.f19663l, ", description=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19664m, ", locale=", str2, ", activeLanguage=");
        AbstractC3393o1.m17725C(sbM22995r, str3, ", dictionaryLocale=", str4, ", nativeLanguage=");
        hn1.m13366p(this.f19668q, ", dictionaryLanguages=", ", setting=", sbM22995r, list);
        sbM22995r.append(this.f19670s);
        sbM22995r.append(", balance=");
        sbM22995r.append(i);
        sbM22995r.append(", transcriptionsDate=");
        AbstractC3393o1.m17748w(this.f19673v, this.f19672u, ", transcriptionsLimit=", ", transcriptionsBalance=", sbM22995r);
        sbM22995r.append(this.f19674w);
        sbM22995r.append(", isBetaTester=");
        sbM22995r.append(this.f19675x);
        sbM22995r.append(", isStaff=");
        sbM22995r.append(this.f19676y);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public Profile(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list, ProfileSetting profileSetting, int i2, String str17, int i3, int i4, Boolean bool, Boolean bool2) {
        ux5.m22975B(str, str2, str4, str5, str6);
        ux5.m22975B(str7, str8, str9, str10, str12);
        str13.getClass();
        str14.getClass();
        str15.getClass();
        str16.getClass();
        list.getClass();
        this.f19652a = i;
        this.f19653b = str;
        this.f19654c = str2;
        this.f19655d = str3;
        this.f19656e = str4;
        this.f19657f = str5;
        this.f19658g = str6;
        this.f19659h = str7;
        this.f19660i = str8;
        this.f19661j = str9;
        this.f19662k = str10;
        this.f19663l = str11;
        this.f19664m = str12;
        this.f19665n = str13;
        this.f19666o = str14;
        this.f19667p = str15;
        this.f19668q = str16;
        this.f19669r = list;
        this.f19670s = profileSetting;
        this.f19671t = i2;
        this.f19672u = str17;
        this.f19673v = i3;
        this.f19674w = i4;
        this.f19675x = bool;
        this.f19676y = bool2;
    }
}
