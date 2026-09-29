package com.lingq.core.database.entity;

import com.lingq.core.domain.model.language.LanguageContextNotification;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.uf4;
import p000.wl4;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LanguageContextEntity {
    public static final C1346l Companion = new C1346l();

    /* JADX INFO: renamed from: t */
    public static final cs4[] f17148t;

    /* JADX INFO: renamed from: a */
    public final String f17149a;

    /* JADX INFO: renamed from: b */
    public final int f17150b;

    /* JADX INFO: renamed from: c */
    public final String f17151c;

    /* JADX INFO: renamed from: d */
    public final int f17152d;

    /* JADX INFO: renamed from: e */
    public final List f17153e;

    /* JADX INFO: renamed from: f */
    public final LanguageContextNotification f17154f;

    /* JADX INFO: renamed from: g */
    public final LanguageContextNotification f17155g;

    /* JADX INFO: renamed from: h */
    public final Boolean f17156h;

    /* JADX INFO: renamed from: i */
    public final String f17157i;

    /* JADX INFO: renamed from: j */
    public final Integer f17158j;

    /* JADX INFO: renamed from: k */
    public final int f17159k;

    /* JADX INFO: renamed from: l */
    public final List f17160l;

    /* JADX INFO: renamed from: m */
    public final Boolean f17161m;

    /* JADX INFO: renamed from: n */
    public final String f17162n;

    /* JADX INFO: renamed from: o */
    public final String f17163o;

    /* JADX INFO: renamed from: p */
    public final Integer f17164p;

    /* JADX INFO: renamed from: q */
    public final String f17165q;

    /* JADX INFO: renamed from: r */
    public final List f17166r;

    /* JADX INFO: renamed from: s */
    public final Boolean f17167s;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f17148t = new cs4[]{null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(7)), null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(8)), null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(9)), null};
    }

    public /* synthetic */ LanguageContextEntity(int i, String str, int i2, String str2, int i3, List list, LanguageContextNotification languageContextNotification, LanguageContextNotification languageContextNotification2, Boolean bool, String str3, Integer num, int i4, List list2, Boolean bool2, String str4, String str5, Integer num2, String str6, List list3, Boolean bool3) {
        if (128356 != (i & 128356)) {
            n3c.m17204b(i, 128356, LanguageContextEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17149a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f17150b = 0;
        } else {
            this.f17150b = i2;
        }
        this.f17151c = str2;
        if ((i & 8) == 0) {
            this.f17152d = 0;
        } else {
            this.f17152d = i3;
        }
        if ((i & 16) == 0) {
            this.f17153e = new ArrayList();
        } else {
            this.f17153e = list;
        }
        this.f17154f = languageContextNotification;
        this.f17155g = languageContextNotification2;
        if ((i & 128) == 0) {
            this.f17156h = Boolean.FALSE;
        } else {
            this.f17156h = bool;
        }
        this.f17157i = str3;
        if ((i & 512) == 0) {
            this.f17158j = null;
        } else {
            this.f17158j = num;
        }
        this.f17159k = i4;
        this.f17160l = (i & 2048) == 0 ? new ArrayList() : list2;
        this.f17161m = bool2;
        this.f17162n = str4;
        this.f17163o = str5;
        this.f17164p = num2;
        this.f17165q = str6;
        this.f17166r = (131072 & i) == 0 ? new ArrayList() : list3;
        if ((i & 262144) == 0) {
            this.f17167s = null;
        } else {
            this.f17167s = bool3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static LanguageContextEntity m7595a(LanguageContextEntity languageContextEntity, int i, LanguageContextNotification languageContextNotification, LanguageContextNotification languageContextNotification2, String str, List list, int i2) {
        String str2 = languageContextEntity.f17149a;
        int i3 = languageContextEntity.f17150b;
        String str3 = languageContextEntity.f17151c;
        int i4 = (i2 & 8) != 0 ? languageContextEntity.f17152d : i;
        List list2 = languageContextEntity.f17153e;
        LanguageContextNotification languageContextNotification3 = (i2 & 32) != 0 ? languageContextEntity.f17154f : languageContextNotification;
        LanguageContextNotification languageContextNotification4 = (i2 & 64) != 0 ? languageContextEntity.f17155g : languageContextNotification2;
        Boolean bool = languageContextEntity.f17156h;
        String str4 = (i2 & 256) != 0 ? languageContextEntity.f17157i : str;
        Integer num = languageContextEntity.f17158j;
        int i5 = i4;
        LanguageContextNotification languageContextNotification5 = languageContextNotification3;
        LanguageContextNotification languageContextNotification6 = languageContextNotification4;
        String str5 = str4;
        int i6 = languageContextEntity.f17159k;
        List list3 = languageContextEntity.f17160l;
        Boolean bool2 = languageContextEntity.f17161m;
        String str6 = languageContextEntity.f17162n;
        String str7 = languageContextEntity.f17163o;
        Integer num2 = languageContextEntity.f17164p;
        String str8 = languageContextEntity.f17165q;
        List list4 = (i2 & 131072) != 0 ? languageContextEntity.f17166r : list;
        Boolean bool3 = languageContextEntity.f17167s;
        str2.getClass();
        list2.getClass();
        list3.getClass();
        return new LanguageContextEntity(str2, i3, str3, i5, list2, languageContextNotification5, languageContextNotification6, bool, str5, num, i6, list3, bool2, str6, str7, num2, str8, list4, bool3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wl4) {
            return fa4.m11650l(this.f17149a, ((wl4) obj).f66998a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f17149a.hashCode() * 31;
        Boolean bool = this.f17161m;
        int iHashCode2 = (iHashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 31;
        String str = this.f17162n;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17163o;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f17164p;
        int iIntValue = (iHashCode4 + (num != null ? num.intValue() : 0)) * 31;
        String str3 = this.f17165q;
        return iIntValue + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f17150b, "LanguageContextEntity(code=", this.f17149a, ", pk=", ", url=");
        AbstractC3393o1.m17748w(this.f17152d, this.f17151c, ", repetitionLingQs=", ", lotdDates=", sbM17741p);
        sbM17741p.append(this.f17153e);
        sbM17741p.append(", emailNotifications=");
        sbM17741p.append(this.f17154f);
        sbM17741p.append(", siteNotifications=");
        sbM17741p.append(this.f17155g);
        sbM17741p.append(", isUseFeed=");
        sbM17741p.append(this.f17156h);
        sbM17741p.append(", intense=");
        hn1.m13371u(sbM17741p, this.f17157i, ", streakGoal=", this.f17158j, ", streakDays=");
        sbM17741p.append(this.f17159k);
        sbM17741p.append(", tags=");
        sbM17741p.append(this.f17160l);
        sbM17741p.append(", supported=");
        sbM17741p.append(this.f17161m);
        sbM17741p.append(", title=");
        sbM17741p.append(this.f17162n);
        sbM17741p.append(", lastUsed=");
        hn1.m13371u(sbM17741p, this.f17163o, ", knownWords=", this.f17164p, ", grammarResourceSlug=");
        hn1.m13366p(this.f17165q, ", feedLevels=", ", scheduledForDeletion=", sbM17741p, this.f17166r);
        sbM17741p.append(this.f17167s);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }

    public LanguageContextEntity(String str, int i, String str2, int i2, List list, LanguageContextNotification languageContextNotification, LanguageContextNotification languageContextNotification2, Boolean bool, String str3, Integer num, int i3, List list2, Boolean bool2, String str4, String str5, Integer num2, String str6, List list3, Boolean bool3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f17149a = str;
        this.f17150b = i;
        this.f17151c = str2;
        this.f17152d = i2;
        this.f17153e = list;
        this.f17154f = languageContextNotification;
        this.f17155g = languageContextNotification2;
        this.f17156h = bool;
        this.f17157i = str3;
        this.f17158j = num;
        this.f17159k = i3;
        this.f17160l = list2;
        this.f17161m = bool2;
        this.f17162n = str4;
        this.f17163o = str5;
        this.f17164p = num2;
        this.f17165q = str6;
        this.f17166r = list3;
        this.f17167s = bool3;
    }
}
