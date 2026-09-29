package com.lingq.feature.onboarding.p014v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.ri5;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class OnboardingSelections {
    public static final C2213a Companion = new C2213a();

    /* JADX INFO: renamed from: r */
    public static final cs4[] f27288r;

    /* JADX INFO: renamed from: a */
    public final String f27289a;

    /* JADX INFO: renamed from: b */
    public final String f27290b;

    /* JADX INFO: renamed from: c */
    public final String f27291c;

    /* JADX INFO: renamed from: d */
    public final String f27292d;

    /* JADX INFO: renamed from: e */
    public final Set f27293e;

    /* JADX INFO: renamed from: f */
    public final String f27294f;

    /* JADX INFO: renamed from: g */
    public final Set f27295g;

    /* JADX INFO: renamed from: h */
    public final String f27296h;

    /* JADX INFO: renamed from: i */
    public final String f27297i;

    /* JADX INFO: renamed from: j */
    public final int f27298j;

    /* JADX INFO: renamed from: k */
    public final String f27299k;

    /* JADX INFO: renamed from: l */
    public final String f27300l;

    /* JADX INFO: renamed from: m */
    public final String f27301m;

    /* JADX INFO: renamed from: n */
    public final String f27302n;

    /* JADX INFO: renamed from: o */
    public final Map f27303o;

    /* JADX INFO: renamed from: p */
    public final String f27304p;

    /* JADX INFO: renamed from: q */
    public final List f27305q;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f27288r = new cs4[]{null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(7)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(8)), null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(9)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(10))};
    }

    public /* synthetic */ OnboardingSelections(int i, String str, String str2, String str3, String str4, Set set, String str5, Set set2, String str6, String str7, int i2, String str8, String str9, String str10, String str11, Map map, String str12, List list) {
        if ((i & 1) == 0) {
            this.f27289a = "";
        } else {
            this.f27289a = str;
        }
        if ((i & 2) == 0) {
            this.f27290b = "";
        } else {
            this.f27290b = str2;
        }
        if ((i & 4) == 0) {
            this.f27291c = "";
        } else {
            this.f27291c = str3;
        }
        if ((i & 8) == 0) {
            this.f27292d = "";
        } else {
            this.f27292d = str4;
        }
        int i3 = i & 16;
        EmptySet emptySet = EmptySet.f47640a;
        if (i3 == 0) {
            this.f27293e = emptySet;
        } else {
            this.f27293e = set;
        }
        if ((i & 32) == 0) {
            this.f27294f = "";
        } else {
            this.f27294f = str5;
        }
        if ((i & 64) == 0) {
            this.f27295g = emptySet;
        } else {
            this.f27295g = set2;
        }
        if ((i & 128) == 0) {
            this.f27296h = "";
        } else {
            this.f27296h = str6;
        }
        if ((i & 256) == 0) {
            this.f27297i = "";
        } else {
            this.f27297i = str7;
        }
        if ((i & 512) == 0) {
            this.f27298j = 0;
        } else {
            this.f27298j = i2;
        }
        if ((i & 1024) == 0) {
            this.f27299k = "";
        } else {
            this.f27299k = str8;
        }
        if ((i & 2048) == 0) {
            this.f27300l = "";
        } else {
            this.f27300l = str9;
        }
        if ((i & 4096) == 0) {
            this.f27301m = "";
        } else {
            this.f27301m = str10;
        }
        if ((i & 8192) == 0) {
            this.f27302n = "";
        } else {
            this.f27302n = str11;
        }
        this.f27303o = (i & 16384) == 0 ? AbstractC3194a.m15360M() : map;
        if ((32768 & i) == 0) {
            this.f27304p = "";
        } else {
            this.f27304p = str12;
        }
        this.f27305q = (i & 65536) == 0 ? EmptyList.f47638a : list;
    }

    /* JADX INFO: renamed from: a */
    public static OnboardingSelections m9151a(OnboardingSelections onboardingSelections, String str, String str2, String str3, String str4, Set set, String str5, Set set2, String str6, String str7, int i, String str8, String str9, String str10, String str11, Map map, String str12, ArrayList arrayList, int i2) {
        String str13 = (i2 & 1) != 0 ? onboardingSelections.f27289a : str;
        String str14 = (i2 & 2) != 0 ? onboardingSelections.f27290b : str2;
        String str15 = (i2 & 4) != 0 ? onboardingSelections.f27291c : str3;
        String str16 = (i2 & 8) != 0 ? onboardingSelections.f27292d : str4;
        Set set3 = (i2 & 16) != 0 ? onboardingSelections.f27293e : set;
        String str17 = (i2 & 32) != 0 ? onboardingSelections.f27294f : str5;
        Set set4 = (i2 & 64) != 0 ? onboardingSelections.f27295g : set2;
        String str18 = (i2 & 128) != 0 ? onboardingSelections.f27296h : str6;
        String str19 = (i2 & 256) != 0 ? onboardingSelections.f27297i : str7;
        int i3 = (i2 & 512) != 0 ? onboardingSelections.f27298j : i;
        String str20 = (i2 & 1024) != 0 ? onboardingSelections.f27299k : str8;
        String str21 = (i2 & 2048) != 0 ? onboardingSelections.f27300l : str9;
        String str22 = (i2 & 4096) != 0 ? onboardingSelections.f27301m : str10;
        String str23 = (i2 & 8192) != 0 ? onboardingSelections.f27302n : str11;
        String str24 = str13;
        Map map2 = (i2 & 16384) != 0 ? onboardingSelections.f27303o : map;
        String str25 = (i2 & 32768) != 0 ? onboardingSelections.f27304p : str12;
        List list = (i2 & 65536) != 0 ? onboardingSelections.f27305q : arrayList;
        onboardingSelections.getClass();
        str24.getClass();
        str14.getClass();
        str15.getClass();
        str16.getClass();
        set3.getClass();
        str17.getClass();
        set4.getClass();
        str18.getClass();
        str19.getClass();
        str20.getClass();
        str21.getClass();
        str22.getClass();
        str23.getClass();
        map2.getClass();
        str25.getClass();
        list.getClass();
        return new OnboardingSelections(str24, str14, str15, str16, set3, str17, set4, str18, str19, i3, str20, str21, str22, str23, map2, str25, list);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9152b(String str) {
        str.getClass();
        return this.f27303o.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingSelections)) {
            return false;
        }
        OnboardingSelections onboardingSelections = (OnboardingSelections) obj;
        return fa4.m11650l(this.f27289a, onboardingSelections.f27289a) && fa4.m11650l(this.f27290b, onboardingSelections.f27290b) && fa4.m11650l(this.f27291c, onboardingSelections.f27291c) && fa4.m11650l(this.f27292d, onboardingSelections.f27292d) && fa4.m11650l(this.f27293e, onboardingSelections.f27293e) && fa4.m11650l(this.f27294f, onboardingSelections.f27294f) && fa4.m11650l(this.f27295g, onboardingSelections.f27295g) && fa4.m11650l(this.f27296h, onboardingSelections.f27296h) && fa4.m11650l(this.f27297i, onboardingSelections.f27297i) && this.f27298j == onboardingSelections.f27298j && fa4.m11650l(this.f27299k, onboardingSelections.f27299k) && fa4.m11650l(this.f27300l, onboardingSelections.f27300l) && fa4.m11650l(this.f27301m, onboardingSelections.f27301m) && fa4.m11650l(this.f27302n, onboardingSelections.f27302n) && fa4.m11650l(this.f27303o, onboardingSelections.f27303o) && fa4.m11650l(this.f27304p, onboardingSelections.f27304p) && fa4.m11650l(this.f27305q, onboardingSelections.f27305q);
    }

    public final int hashCode() {
        return this.f27305q.hashCode() + ux5.m22980c(e65.m10869a(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f27298j, ux5.m22980c(ux5.m22980c((this.f27295g.hashCode() + ux5.m22980c((this.f27293e.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f27289a.hashCode() * 31, this.f27290b, 31), this.f27291c, 31), this.f27292d, 31)) * 31, this.f27294f, 31)) * 31, this.f27296h, 31), this.f27297i, 31), 31), this.f27299k, 31), this.f27300l, 31), this.f27301m, 31), this.f27302n, 31), 31, this.f27303o), this.f27304p, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("OnboardingSelections(language=", this.f27289a, ", dictionaryLocale=", this.f27290b, ", motivation=");
        AbstractC3393o1.m17725C(sbM23000w, this.f27291c, ", level=", this.f27292d, ", skillsFocus=");
        sbM23000w.append(this.f27293e);
        sbM23000w.append(", speakingConfidence=");
        sbM23000w.append(this.f27294f);
        sbM23000w.append(", topics=");
        sbM23000w.append(this.f27295g);
        sbM23000w.append(", accent=");
        sbM23000w.append(this.f27296h);
        sbM23000w.append(", learningStyle=");
        AbstractC3393o1.m17748w(this.f27298j, this.f27297i, ", timeCommitment=", ", age=", sbM23000w);
        AbstractC3393o1.m17725C(sbM23000w, this.f27299k, ", name=", this.f27300l, ", lifeEvent=");
        AbstractC3393o1.m17725C(sbM23000w, this.f27301m, ", whereUse=", this.f27302n, ", yesNoAnswers=");
        sbM23000w.append(this.f27303o);
        sbM23000w.append(", familiarity=");
        sbM23000w.append(this.f27304p);
        sbM23000w.append(", pendingMiniLessonLingqs=");
        return hn1.m13356f(sbM23000w, this.f27305q, ")");
    }

    public OnboardingSelections(String str, String str2, String str3, String str4, Set set, String str5, Set set2, String str6, String str7, int i, String str8, String str9, String str10, String str11, Map map, String str12, List list) {
        str.getClass();
        str4.getClass();
        set2.getClass();
        this.f27289a = str;
        this.f27290b = str2;
        this.f27291c = str3;
        this.f27292d = str4;
        this.f27293e = set;
        this.f27294f = str5;
        this.f27295g = set2;
        this.f27296h = str6;
        this.f27297i = str7;
        this.f27298j = i;
        this.f27299k = str8;
        this.f27300l = str9;
        this.f27301m = str10;
        this.f27302n = str11;
        this.f27303o = map;
        this.f27304p = str12;
        this.f27305q = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OnboardingSelections(String str, String str2, Set set, int i, int i2) {
        String str3 = (i2 & 1) != 0 ? "" : str;
        String str4 = (i2 & 8) != 0 ? "" : str2;
        int i3 = i2 & 64;
        EmptySet emptySet = EmptySet.f47640a;
        this(str3, "", "", str4, emptySet, "", i3 != 0 ? emptySet : set, "", "", (i2 & 512) != 0 ? 0 : i, "", "", "", "", AbstractC3194a.m15360M(), "", EmptyList.f47638a);
    }
}
