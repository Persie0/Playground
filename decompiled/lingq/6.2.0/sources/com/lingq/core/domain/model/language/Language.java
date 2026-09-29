package com.lingq.core.domain.model.language;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.uf4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class Language {
    public static final C1425e Companion = new C1425e();

    /* JADX INFO: renamed from: u */
    public static final cs4[] f19023u;

    /* JADX INFO: renamed from: a */
    public final String f19024a;

    /* JADX INFO: renamed from: b */
    public final int f19025b;

    /* JADX INFO: renamed from: c */
    public final String f19026c;

    /* JADX INFO: renamed from: d */
    public final List f19027d;

    /* JADX INFO: renamed from: e */
    public final boolean f19028e;

    /* JADX INFO: renamed from: f */
    public final String f19029f;

    /* JADX INFO: renamed from: g */
    public final String f19030g;

    /* JADX INFO: renamed from: h */
    public final int f19031h;

    /* JADX INFO: renamed from: i */
    public final String f19032i;

    /* JADX INFO: renamed from: j */
    public final String f19033j;

    /* JADX INFO: renamed from: k */
    public final LanguageStudyStats f19034k;

    /* JADX INFO: renamed from: l */
    public final String f19035l;

    /* JADX INFO: renamed from: m */
    public final Integer f19036m;

    /* JADX INFO: renamed from: n */
    public final int f19037n;

    /* JADX INFO: renamed from: o */
    public final int f19038o;

    /* JADX INFO: renamed from: p */
    public final String f19039p;

    /* JADX INFO: renamed from: q */
    public final String f19040q;

    /* JADX INFO: renamed from: r */
    public final List f19041r;

    /* JADX INFO: renamed from: s */
    public final List f19042s;

    /* JADX INFO: renamed from: t */
    public final Boolean f19043t;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f19023u = new cs4[]{null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(4)), null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(5)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(6)), null};
    }

    public /* synthetic */ Language(int i, String str, int i2, String str2, List list, boolean z, String str3, String str4, int i3, String str5, String str6, LanguageStudyStats languageStudyStats, String str7, Integer num, int i4, int i5, String str8, String str9, List list2, List list3, Boolean bool) {
        if (3072 != (i & 3072)) {
            n3c.m17204b(i, 3072, Language$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f19024a = "";
        } else {
            this.f19024a = str;
        }
        if ((i & 2) == 0) {
            this.f19025b = 0;
        } else {
            this.f19025b = i2;
        }
        if ((i & 4) == 0) {
            this.f19026c = "";
        } else {
            this.f19026c = str2;
        }
        if ((i & 8) == 0) {
            this.f19027d = new ArrayList();
        } else {
            this.f19027d = list;
        }
        if ((i & 16) == 0) {
            this.f19028e = true;
        } else {
            this.f19028e = z;
        }
        if ((i & 32) == 0) {
            this.f19029f = "";
        } else {
            this.f19029f = str3;
        }
        if ((i & 64) == 0) {
            this.f19030g = "";
        } else {
            this.f19030g = str4;
        }
        if ((i & 128) == 0) {
            this.f19031h = 0;
        } else {
            this.f19031h = i3;
        }
        if ((i & 256) == 0) {
            this.f19032i = "";
        } else {
            this.f19032i = str5;
        }
        if ((i & 512) == 0) {
            this.f19033j = "";
        } else {
            this.f19033j = str6;
        }
        this.f19034k = languageStudyStats;
        this.f19035l = str7;
        if ((i & 4096) == 0) {
            this.f19036m = null;
        } else {
            this.f19036m = num;
        }
        if ((i & 8192) == 0) {
            this.f19037n = 0;
        } else {
            this.f19037n = i4;
        }
        if ((i & 16384) == 0) {
            this.f19038o = 0;
        } else {
            this.f19038o = i5;
        }
        if ((32768 & i) == 0) {
            this.f19039p = "";
        } else {
            this.f19039p = str8;
        }
        if ((65536 & i) == 0) {
            this.f19040q = "";
        } else {
            this.f19040q = str9;
        }
        this.f19041r = (131072 & i) == 0 ? new ArrayList() : list2;
        this.f19042s = (262144 & i) == 0 ? new ArrayList() : list3;
        this.f19043t = (i & 524288) == 0 ? Boolean.FALSE : bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Language)) {
            return false;
        }
        Language language = (Language) obj;
        return fa4.m11650l(this.f19024a, language.f19024a) && fa4.m11650l(this.f19035l, language.f19035l) && fa4.m11650l(this.f19036m, language.f19036m) && this.f19038o == language.f19038o && fa4.m11650l(this.f19039p, language.f19039p) && fa4.m11650l(this.f19040q, language.f19040q) && fa4.m11650l(this.f19041r, language.f19041r);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(g9a.m12428e(this.f19024a.hashCode() * 31, 31, this.f19028e), this.f19029f, 31);
        String str = this.f19030g;
        int iHashCode = (((iM22980c + (str != null ? str.hashCode() : 0)) * 31) + this.f19031h) * 31;
        String str2 = this.f19032i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19033j;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f19025b, "Language(code=", this.f19024a, ", pk=", ", url=");
        hn1.m13366p(this.f19026c, ", tags=", ", supported=", sbM17741p, this.f19027d);
        hn1.m13367q(", title=", this.f19029f, ", lastUsed=", sbM17741p, this.f19028e);
        AbstractC3393o1.m17748w(this.f19031h, this.f19030g, ", knownWords=", ", dictionaryLocaleActive=", sbM17741p);
        AbstractC3393o1.m17725C(sbM17741p, this.f19032i, ", grammarResourceSlug=", this.f19033j, ", studyStats=");
        sbM17741p.append(this.f19034k);
        sbM17741p.append(", intense=");
        sbM17741p.append(this.f19035l);
        sbM17741p.append(", streakGoal=");
        sbM17741p.append(this.f19036m);
        sbM17741p.append(", streakDays=");
        sbM17741p.append(this.f19037n);
        sbM17741p.append(", repetitionLingQs=");
        hn1.m13361k(this.f19038o, ", emailLotd=", this.f19039p, ", siteLotd=", sbM17741p);
        hn1.m13366p(this.f19040q, ", feedLevels=", ", lotdDates=", sbM17741p, this.f19041r);
        sbM17741p.append(this.f19042s);
        sbM17741p.append(", scheduledForDeletion=");
        sbM17741p.append(this.f19043t);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }

    public Language(String str, int i, String str2, List list, boolean z, String str3, String str4, int i2, String str5, String str6, Integer num, int i3, int i4, String str7, String str8, List list2, List list3, Boolean bool) {
        str.getClass();
        list.getClass();
        list3.getClass();
        this.f19024a = str;
        this.f19025b = i;
        this.f19026c = str2;
        this.f19027d = list;
        this.f19028e = z;
        this.f19029f = str3;
        this.f19030g = str4;
        this.f19031h = i2;
        this.f19032i = "";
        this.f19033j = str5;
        this.f19034k = null;
        this.f19035l = str6;
        this.f19036m = num;
        this.f19037n = i3;
        this.f19038o = i4;
        this.f19039p = str7;
        this.f19040q = str8;
        this.f19041r = list2;
        this.f19042s = list3;
        this.f19043t = bool;
    }
}
