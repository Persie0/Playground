package com.lingq.core.network.api.result;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.ri5;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultLanguageContext {
    public static final C1710p1 Companion = new C1710p1();

    /* JADX INFO: renamed from: n */
    public static final cs4[] f20872n;

    /* JADX INFO: renamed from: a */
    public final int f20873a;

    /* JADX INFO: renamed from: b */
    public final String f20874b;

    /* JADX INFO: renamed from: c */
    public final int f20875c;

    /* JADX INFO: renamed from: d */
    public final List f20876d;

    /* JADX INFO: renamed from: e */
    public final ResultLanguageContextNotification f20877e;

    /* JADX INFO: renamed from: f */
    public final ResultLanguageContextNotification f20878f;

    /* JADX INFO: renamed from: g */
    public final Boolean f20879g;

    /* JADX INFO: renamed from: h */
    public final String f20880h;

    /* JADX INFO: renamed from: i */
    public final Integer f20881i;

    /* JADX INFO: renamed from: j */
    public final List f20882j;

    /* JADX INFO: renamed from: k */
    public final ResultLanguage f20883k;

    /* JADX INFO: renamed from: l */
    public final int f20884l;

    /* JADX INFO: renamed from: m */
    public final List f20885m;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20872n = new cs4[]{null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(23)), null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(24)), null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(25))};
    }

    public /* synthetic */ ResultLanguageContext(int i, int i2, String str, int i3, List list, ResultLanguageContextNotification resultLanguageContextNotification, ResultLanguageContextNotification resultLanguageContextNotification2, Boolean bool, String str2, Integer num, List list2, ResultLanguage resultLanguage, int i4, List list3) {
        if ((i & 1) == 0) {
            this.f20873a = 0;
        } else {
            this.f20873a = i2;
        }
        if ((i & 2) == 0) {
            this.f20874b = null;
        } else {
            this.f20874b = str;
        }
        if ((i & 4) == 0) {
            this.f20875c = 0;
        } else {
            this.f20875c = i3;
        }
        if ((i & 8) == 0) {
            this.f20876d = new ArrayList();
        } else {
            this.f20876d = list;
        }
        if ((i & 16) == 0) {
            this.f20877e = null;
        } else {
            this.f20877e = resultLanguageContextNotification;
        }
        if ((i & 32) == 0) {
            this.f20878f = null;
        } else {
            this.f20878f = resultLanguageContextNotification2;
        }
        if ((i & 64) == 0) {
            this.f20879g = Boolean.FALSE;
        } else {
            this.f20879g = bool;
        }
        if ((i & 128) == 0) {
            this.f20880h = null;
        } else {
            this.f20880h = str2;
        }
        if ((i & 256) == 0) {
            this.f20881i = null;
        } else {
            this.f20881i = num;
        }
        if ((i & 512) == 0) {
            this.f20882j = new ArrayList();
        } else {
            this.f20882j = list2;
        }
        if ((i & 1024) == 0) {
            this.f20883k = null;
        } else {
            this.f20883k = resultLanguage;
        }
        if ((i & 2048) == 0) {
            this.f20884l = 0;
        } else {
            this.f20884l = i4;
        }
        this.f20885m = (i & 4096) == 0 ? EmptyList.f47638a : list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLanguageContext)) {
            return false;
        }
        ResultLanguageContext resultLanguageContext = (ResultLanguageContext) obj;
        return this.f20873a == resultLanguageContext.f20873a && fa4.m11650l(this.f20874b, resultLanguageContext.f20874b) && this.f20875c == resultLanguageContext.f20875c && fa4.m11650l(this.f20876d, resultLanguageContext.f20876d) && fa4.m11650l(this.f20877e, resultLanguageContext.f20877e) && fa4.m11650l(this.f20878f, resultLanguageContext.f20878f) && fa4.m11650l(this.f20879g, resultLanguageContext.f20879g) && fa4.m11650l(this.f20880h, resultLanguageContext.f20880h) && fa4.m11650l(this.f20881i, resultLanguageContext.f20881i) && fa4.m11650l(this.f20882j, resultLanguageContext.f20882j) && fa4.m11650l(this.f20883k, resultLanguageContext.f20883k) && this.f20884l == resultLanguageContext.f20884l && fa4.m11650l(this.f20885m, resultLanguageContext.f20885m);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20873a) * 31;
        String str = this.f20874b;
        int iM22979b = ux5.m22979b(wq1.m24106b(this.f20875c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f20876d);
        ResultLanguageContextNotification resultLanguageContextNotification = this.f20877e;
        int iHashCode2 = (iM22979b + (resultLanguageContextNotification == null ? 0 : resultLanguageContextNotification.hashCode())) * 31;
        ResultLanguageContextNotification resultLanguageContextNotification2 = this.f20878f;
        int iHashCode3 = (iHashCode2 + (resultLanguageContextNotification2 == null ? 0 : resultLanguageContextNotification2.hashCode())) * 31;
        Boolean bool = this.f20879g;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f20880h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20881i;
        int iM22979b2 = ux5.m22979b((iHashCode5 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f20882j);
        ResultLanguage resultLanguage = this.f20883k;
        int iM24106b = wq1.m24106b(this.f20884l, (iM22979b2 + (resultLanguage == null ? 0 : resultLanguage.hashCode())) * 31, 31);
        List list = this.f20885m;
        return iM24106b + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f20873a, "ResultLanguageContext(pk=", ", url=", this.f20874b, ", repetitionLingQs=");
        sbM22995r.append(this.f20875c);
        sbM22995r.append(", lotdDates=");
        sbM22995r.append(this.f20876d);
        sbM22995r.append(", emailNotifications=");
        sbM22995r.append(this.f20877e);
        sbM22995r.append(", siteNotifications=");
        sbM22995r.append(this.f20878f);
        sbM22995r.append(", isUseFeed=");
        sbM22995r.append(this.f20879g);
        sbM22995r.append(", intense=");
        sbM22995r.append(this.f20880h);
        sbM22995r.append(", streakGoal=");
        sbM22995r.append(this.f20881i);
        sbM22995r.append(", tags=");
        sbM22995r.append(this.f20882j);
        sbM22995r.append(", language=");
        sbM22995r.append(this.f20883k);
        sbM22995r.append(", streakDays=");
        sbM22995r.append(this.f20884l);
        sbM22995r.append(", feedLevels=");
        return hn1.m13356f(sbM22995r, this.f20885m, ")");
    }
}
