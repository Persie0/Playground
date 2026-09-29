package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.m78;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCard {
    public static final C1744v Companion = new C1744v();

    /* JADX INFO: renamed from: q */
    public static final cs4[] f20619q;

    /* JADX INFO: renamed from: a */
    public final String f20620a;

    /* JADX INFO: renamed from: b */
    public final int f20621b;

    /* JADX INFO: renamed from: c */
    public final String f20622c;

    /* JADX INFO: renamed from: d */
    public final String f20623d;

    /* JADX INFO: renamed from: e */
    public final int f20624e;

    /* JADX INFO: renamed from: f */
    public final Integer f20625f;

    /* JADX INFO: renamed from: g */
    public final String f20626g;

    /* JADX INFO: renamed from: h */
    public final String f20627h;

    /* JADX INFO: renamed from: i */
    public final String f20628i;

    /* JADX INFO: renamed from: j */
    public final String f20629j;

    /* JADX INFO: renamed from: k */
    public final int f20630k;

    /* JADX INFO: renamed from: l */
    public final List f20631l;

    /* JADX INFO: renamed from: m */
    public final List f20632m;

    /* JADX INFO: renamed from: n */
    public final List f20633n;

    /* JADX INFO: renamed from: o */
    public final List f20634o;

    /* JADX INFO: renamed from: p */
    public final ResultLessonTransliteration f20635p;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20619q = new cs4[]{null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(13)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(14)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(15)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(16)), null};
    }

    public /* synthetic */ ResultCard(int i, String str, int i2, String str2, String str3, int i3, Integer num, String str4, String str5, String str6, String str7, int i4, List list, List list2, List list3, List list4, ResultLessonTransliteration resultLessonTransliteration) {
        this.f20620a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f20621b = 0;
        } else {
            this.f20621b = i2;
        }
        if ((i & 4) == 0) {
            this.f20622c = null;
        } else {
            this.f20622c = str2;
        }
        if ((i & 8) == 0) {
            this.f20623d = null;
        } else {
            this.f20623d = str3;
        }
        if ((i & 16) == 0) {
            this.f20624e = 0;
        } else {
            this.f20624e = i3;
        }
        if ((i & 32) == 0) {
            this.f20625f = null;
        } else {
            this.f20625f = num;
        }
        if ((i & 64) == 0) {
            this.f20626g = null;
        } else {
            this.f20626g = str4;
        }
        if ((i & 128) == 0) {
            this.f20627h = null;
        } else {
            this.f20627h = str5;
        }
        if ((i & 256) == 0) {
            this.f20628i = null;
        } else {
            this.f20628i = str6;
        }
        if ((i & 512) == 0) {
            this.f20629j = null;
        } else {
            this.f20629j = str7;
        }
        if ((i & 1024) == 0) {
            this.f20630k = 0;
        } else {
            this.f20630k = i4;
        }
        int i5 = i & 2048;
        EmptyList emptyList = EmptyList.f47638a;
        if (i5 == 0) {
            this.f20631l = emptyList;
        } else {
            this.f20631l = list;
        }
        if ((i & 4096) == 0) {
            this.f20632m = emptyList;
        } else {
            this.f20632m = list2;
        }
        if ((i & 8192) == 0) {
            this.f20633n = emptyList;
        } else {
            this.f20633n = list3;
        }
        if ((i & 16384) == 0) {
            this.f20634o = emptyList;
        } else {
            this.f20634o = list4;
        }
        if ((i & 32768) == 0) {
            this.f20635p = null;
        } else {
            this.f20635p = resultLessonTransliteration;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCard)) {
            return false;
        }
        ResultCard resultCard = (ResultCard) obj;
        return fa4.m11650l(this.f20620a, resultCard.f20620a) && this.f20621b == resultCard.f20621b && fa4.m11650l(this.f20622c, resultCard.f20622c) && fa4.m11650l(this.f20623d, resultCard.f20623d) && this.f20624e == resultCard.f20624e && fa4.m11650l(this.f20625f, resultCard.f20625f) && fa4.m11650l(this.f20626g, resultCard.f20626g) && fa4.m11650l(this.f20627h, resultCard.f20627h) && fa4.m11650l(this.f20628i, resultCard.f20628i) && fa4.m11650l(this.f20629j, resultCard.f20629j) && this.f20630k == resultCard.f20630k && fa4.m11650l(this.f20631l, resultCard.f20631l) && fa4.m11650l(this.f20632m, resultCard.f20632m) && fa4.m11650l(this.f20633n, resultCard.f20633n) && fa4.m11650l(this.f20634o, resultCard.f20634o) && fa4.m11650l(this.f20635p, resultCard.f20635p);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f20621b, this.f20620a.hashCode() * 31, 31);
        String str = this.f20622c;
        int iHashCode = (iM24106b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20623d;
        int iM24106b2 = wq1.m24106b(this.f20624e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.f20625f;
        int iHashCode2 = (iM24106b2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f20626g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20627h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20628i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20629j;
        int iM22979b = ux5.m22979b(ux5.m22979b(ux5.m22979b(ux5.m22979b(wq1.m24106b(this.f20630k, (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31, this.f20631l), 31, this.f20632m), 31, this.f20633n), 31, this.f20634o);
        ResultLessonTransliteration resultLessonTransliteration = this.f20635p;
        return iM22979b + (resultLessonTransliteration != null ? resultLessonTransliteration.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f20621b, "ResultCard(term=", this.f20620a, ", id=", ", url=");
        AbstractC3393o1.m17725C(sbM17741p, this.f20622c, ", fragment=", this.f20623d, ", status=");
        sbM17741p.append(this.f20624e);
        sbM17741p.append(", extendedStatus=");
        sbM17741p.append(this.f20625f);
        sbM17741p.append(", lastReviewedCorrect=");
        AbstractC3393o1.m17725C(sbM17741p, this.f20626g, ", srsDueDate=", this.f20627h, ", notes=");
        AbstractC3393o1.m17725C(sbM17741p, this.f20628i, ", audio=", this.f20629j, ", importance=");
        sbM17741p.append(this.f20630k);
        sbM17741p.append(", meanings=");
        sbM17741p.append(this.f20631l);
        sbM17741p.append(", tags=");
        hn1.m13372v(sbM17741p, this.f20632m, ", gTags=", this.f20633n, ", words=");
        sbM17741p.append(this.f20634o);
        sbM17741p.append(", transliteration=");
        sbM17741p.append(this.f20635p);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }

    public ResultCard(String str, int i, String str2, String str3, int i2, Integer num, String str4, String str5, String str6, String str7, int i3, List list, List list2, List list3, List list4, ResultLessonTransliteration resultLessonTransliteration) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.f20620a = str;
        this.f20621b = i;
        this.f20622c = str2;
        this.f20623d = str3;
        this.f20624e = i2;
        this.f20625f = num;
        this.f20626g = str4;
        this.f20627h = str5;
        this.f20628i = str6;
        this.f20629j = str7;
        this.f20630k = i3;
        this.f20631l = list;
        this.f20632m = list2;
        this.f20633n = list3;
        this.f20634o = list4;
        this.f20635p = resultLessonTransliteration;
    }
}
