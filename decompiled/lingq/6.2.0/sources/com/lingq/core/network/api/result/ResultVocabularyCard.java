package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g98;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultVocabularyCard {
    public static final C1782x4 Companion = new C1782x4();

    /* JADX INFO: renamed from: r */
    public static final cs4[] f21674r;

    /* JADX INFO: renamed from: a */
    public final String f21675a;

    /* JADX INFO: renamed from: b */
    public final int f21676b;

    /* JADX INFO: renamed from: c */
    public final String f21677c;

    /* JADX INFO: renamed from: d */
    public final String f21678d;

    /* JADX INFO: renamed from: e */
    public final int f21679e;

    /* JADX INFO: renamed from: f */
    public final Integer f21680f;

    /* JADX INFO: renamed from: g */
    public final String f21681g;

    /* JADX INFO: renamed from: h */
    public final String f21682h;

    /* JADX INFO: renamed from: i */
    public final String f21683i;

    /* JADX INFO: renamed from: j */
    public final String f21684j;

    /* JADX INFO: renamed from: k */
    public final int f21685k;

    /* JADX INFO: renamed from: l */
    public List f21686l;

    /* JADX INFO: renamed from: m */
    public final List f21687m;

    /* JADX INFO: renamed from: n */
    public final List f21688n;

    /* JADX INFO: renamed from: o */
    public final List f21689o;

    /* JADX INFO: renamed from: p */
    public final CardLessonTransliteration f21690p;

    /* JADX INFO: renamed from: q */
    public final String f21691q;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f21674r = new cs4[]{null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(19)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(20)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(21)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(22)), null, null};
    }

    public /* synthetic */ ResultVocabularyCard(int i, String str, int i2, String str2, String str3, int i3, Integer num, String str4, String str5, String str6, String str7, int i4, List list, List list2, List list3, List list4, CardLessonTransliteration cardLessonTransliteration, String str8) {
        this.f21675a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f21676b = 0;
        } else {
            this.f21676b = i2;
        }
        if ((i & 4) == 0) {
            this.f21677c = null;
        } else {
            this.f21677c = str2;
        }
        if ((i & 8) == 0) {
            this.f21678d = null;
        } else {
            this.f21678d = str3;
        }
        if ((i & 16) == 0) {
            this.f21679e = 0;
        } else {
            this.f21679e = i3;
        }
        if ((i & 32) == 0) {
            this.f21680f = null;
        } else {
            this.f21680f = num;
        }
        if ((i & 64) == 0) {
            this.f21681g = null;
        } else {
            this.f21681g = str4;
        }
        if ((i & 128) == 0) {
            this.f21682h = null;
        } else {
            this.f21682h = str5;
        }
        if ((i & 256) == 0) {
            this.f21683i = null;
        } else {
            this.f21683i = str6;
        }
        if ((i & 512) == 0) {
            this.f21684j = null;
        } else {
            this.f21684j = str7;
        }
        if ((i & 1024) == 0) {
            this.f21685k = 0;
        } else {
            this.f21685k = i4;
        }
        int i5 = i & 2048;
        EmptyList emptyList = EmptyList.f47638a;
        if (i5 == 0) {
            this.f21686l = emptyList;
        } else {
            this.f21686l = list;
        }
        if ((i & 4096) == 0) {
            this.f21687m = emptyList;
        } else {
            this.f21687m = list2;
        }
        if ((i & 8192) == 0) {
            this.f21688n = emptyList;
        } else {
            this.f21688n = list3;
        }
        if ((i & 16384) == 0) {
            this.f21689o = emptyList;
        } else {
            this.f21689o = list4;
        }
        if ((32768 & i) == 0) {
            this.f21690p = null;
        } else {
            this.f21690p = cardLessonTransliteration;
        }
        if ((i & 65536) == 0) {
            this.f21691q = null;
        } else {
            this.f21691q = str8;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8396a() {
        return this.f21685k;
    }

    /* JADX INFO: renamed from: b */
    public final List m8397b() {
        return this.f21686l;
    }

    /* JADX INFO: renamed from: c */
    public final String m8398c() {
        return this.f21675a;
    }

    /* JADX INFO: renamed from: d */
    public final void m8399d(List list) {
        this.f21686l = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultVocabularyCard)) {
            return false;
        }
        ResultVocabularyCard resultVocabularyCard = (ResultVocabularyCard) obj;
        return fa4.m11650l(this.f21675a, resultVocabularyCard.f21675a) && this.f21676b == resultVocabularyCard.f21676b && fa4.m11650l(this.f21677c, resultVocabularyCard.f21677c) && fa4.m11650l(this.f21678d, resultVocabularyCard.f21678d) && this.f21679e == resultVocabularyCard.f21679e && fa4.m11650l(this.f21680f, resultVocabularyCard.f21680f) && fa4.m11650l(this.f21681g, resultVocabularyCard.f21681g) && fa4.m11650l(this.f21682h, resultVocabularyCard.f21682h) && fa4.m11650l(this.f21683i, resultVocabularyCard.f21683i) && fa4.m11650l(this.f21684j, resultVocabularyCard.f21684j) && this.f21685k == resultVocabularyCard.f21685k && fa4.m11650l(this.f21686l, resultVocabularyCard.f21686l) && fa4.m11650l(this.f21687m, resultVocabularyCard.f21687m) && fa4.m11650l(this.f21688n, resultVocabularyCard.f21688n) && fa4.m11650l(this.f21689o, resultVocabularyCard.f21689o) && fa4.m11650l(this.f21690p, resultVocabularyCard.f21690p) && fa4.m11650l(this.f21691q, resultVocabularyCard.f21691q);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f21676b, this.f21675a.hashCode() * 31, 31);
        String str = this.f21677c;
        int iHashCode = (iM24106b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21678d;
        int iM24106b2 = wq1.m24106b(this.f21679e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.f21680f;
        int iHashCode2 = (iM24106b2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f21681g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21682h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21683i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21684j;
        int iM22979b = ux5.m22979b(ux5.m22979b(ux5.m22979b(ux5.m22979b(wq1.m24106b(this.f21685k, (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31, this.f21686l), 31, this.f21687m), 31, this.f21688n), 31, this.f21689o);
        CardLessonTransliteration cardLessonTransliteration = this.f21690p;
        int iHashCode6 = (iM22979b + (cardLessonTransliteration == null ? 0 : cardLessonTransliteration.hashCode())) * 31;
        String str7 = this.f21691q;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        List list = this.f21686l;
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f21676b, "ResultVocabularyCard(term=", this.f21675a, ", id=", ", url=");
        AbstractC3393o1.m17725C(sbM17741p, this.f21677c, ", fragment=", this.f21678d, ", status=");
        sbM17741p.append(this.f21679e);
        sbM17741p.append(", extendedStatus=");
        sbM17741p.append(this.f21680f);
        sbM17741p.append(", lastReviewedCorrect=");
        AbstractC3393o1.m17725C(sbM17741p, this.f21681g, ", srsDueDate=", this.f21682h, ", notes=");
        AbstractC3393o1.m17725C(sbM17741p, this.f21683i, ", audio=", this.f21684j, ", importance=");
        sbM17741p.append(this.f21685k);
        sbM17741p.append(", meanings=");
        sbM17741p.append(list);
        sbM17741p.append(", tags=");
        hn1.m13372v(sbM17741p, this.f21687m, ", gTags=", this.f21688n, ", words=");
        sbM17741p.append(this.f21689o);
        sbM17741p.append(", transliteration=");
        sbM17741p.append(this.f21690p);
        sbM17741p.append(", creationDate=");
        return AbstractC3393o1.m17738m(sbM17741p, this.f21691q, ")");
    }
}
