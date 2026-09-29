package com.lingq.core.network.api.requests;

import com.lingq.core.domain.model.user.ProfileSetting;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.m78;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestUserUpdate {
    public static final C1566d1 Companion = new C1566d1();

    /* JADX INFO: renamed from: l */
    public static final cs4[] f20476l;

    /* JADX INFO: renamed from: a */
    public final Integer f20477a;

    /* JADX INFO: renamed from: b */
    public final String f20478b;

    /* JADX INFO: renamed from: c */
    public final String f20479c;

    /* JADX INFO: renamed from: d */
    public final String f20480d;

    /* JADX INFO: renamed from: e */
    public final String f20481e;

    /* JADX INFO: renamed from: f */
    public final String f20482f;

    /* JADX INFO: renamed from: g */
    public final String f20483g;

    /* JADX INFO: renamed from: h */
    public final List f20484h;

    /* JADX INFO: renamed from: i */
    public final String f20485i;

    /* JADX INFO: renamed from: j */
    public final ProfileSetting f20486j;

    /* JADX INFO: renamed from: k */
    public final String f20487k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20476l = new cs4[]{null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(10)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(11)), null};
    }

    public /* synthetic */ RequestUserUpdate(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, ProfileSetting profileSetting, String str8) {
        if ((i & 1) == 0) {
            this.f20477a = null;
        } else {
            this.f20477a = num;
        }
        if ((i & 2) == 0) {
            this.f20478b = null;
        } else {
            this.f20478b = str;
        }
        if ((i & 4) == 0) {
            this.f20479c = null;
        } else {
            this.f20479c = str2;
        }
        if ((i & 8) == 0) {
            this.f20480d = null;
        } else {
            this.f20480d = str3;
        }
        if ((i & 16) == 0) {
            this.f20481e = null;
        } else {
            this.f20481e = str4;
        }
        if ((i & 32) == 0) {
            this.f20482f = null;
        } else {
            this.f20482f = str5;
        }
        if ((i & 64) == 0) {
            this.f20483g = null;
        } else {
            this.f20483g = str6;
        }
        if ((i & 128) == 0) {
            this.f20484h = null;
        } else {
            this.f20484h = list;
        }
        if ((i & 256) == 0) {
            this.f20485i = null;
        } else {
            this.f20485i = str7;
        }
        if ((i & 512) == 0) {
            this.f20486j = null;
        } else {
            this.f20486j = profileSetting;
        }
        if ((i & 1024) == 0) {
            this.f20487k = null;
        } else {
            this.f20487k = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestUserUpdate)) {
            return false;
        }
        RequestUserUpdate requestUserUpdate = (RequestUserUpdate) obj;
        return fa4.m11650l(this.f20477a, requestUserUpdate.f20477a) && fa4.m11650l(this.f20478b, requestUserUpdate.f20478b) && fa4.m11650l(this.f20479c, requestUserUpdate.f20479c) && fa4.m11650l(this.f20480d, requestUserUpdate.f20480d) && fa4.m11650l(this.f20481e, requestUserUpdate.f20481e) && fa4.m11650l(this.f20482f, requestUserUpdate.f20482f) && fa4.m11650l(this.f20483g, requestUserUpdate.f20483g) && fa4.m11650l(this.f20484h, requestUserUpdate.f20484h) && fa4.m11650l(this.f20485i, requestUserUpdate.f20485i) && fa4.m11650l(this.f20486j, requestUserUpdate.f20486j) && fa4.m11650l(this.f20487k, requestUserUpdate.f20487k);
    }

    public final int hashCode() {
        Integer num = this.f20477a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f20478b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20479c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20480d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20481e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20482f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20483g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.f20484h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.f20485i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ProfileSetting profileSetting = this.f20486j;
        int iHashCode10 = (iHashCode9 + (profileSetting == null ? 0 : profileSetting.hashCode())) * 31;
        String str8 = this.f20487k;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestUserUpdate(id=");
        sb.append(this.f20477a);
        sb.append(", activeLanguage=");
        sb.append(this.f20478b);
        sb.append(", username=");
        AbstractC3393o1.m17725C(sb, this.f20479c, ", email=", this.f20480d, ", name=");
        AbstractC3393o1.m17725C(sb, this.f20481e, ", password=", this.f20482f, ", dictionaryLocale=");
        hn1.m13366p(this.f20483g, ", dictionaryLanguages=", ", locale=", sb, this.f20484h);
        sb.append(this.f20485i);
        sb.append(", setting=");
        sb.append(this.f20486j);
        sb.append(", timezone=");
        return AbstractC3393o1.m17738m(sb, this.f20487k, ")");
    }

    public RequestUserUpdate(String str, String str2, List list, String str3, ProfileSetting profileSetting, String str4, int i) {
        str2 = (i & 64) != 0 ? null : str2;
        list = (i & 128) != 0 ? null : list;
        str3 = (i & 256) != 0 ? null : str3;
        profileSetting = (i & 512) != 0 ? null : profileSetting;
        str4 = (i & 1024) != 0 ? null : str4;
        this.f20477a = null;
        this.f20478b = str;
        this.f20479c = null;
        this.f20480d = null;
        this.f20481e = null;
        this.f20482f = null;
        this.f20483g = str2;
        this.f20484h = list;
        this.f20485i = str3;
        this.f20486j = profileSetting;
        this.f20487k = str4;
    }
}
