package com.lingq.core.domain.model.lesson;

import com.lingq.core.domain.model.status.CardStatus;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.w65;
import p000.wf1;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonCard implements w65 {

    /* JADX INFO: renamed from: C */
    public static final cs4[] f19175C;
    public static final C1438c Companion = new C1438c();

    /* JADX INFO: renamed from: A */
    public final String f19176A;

    /* JADX INFO: renamed from: B */
    public final String f19177B;

    /* JADX INFO: renamed from: a */
    public final String f19178a;

    /* JADX INFO: renamed from: b */
    public final List f19179b;

    /* JADX INFO: renamed from: c */
    public final List f19180c;

    /* JADX INFO: renamed from: d */
    public final String f19181d;

    /* JADX INFO: renamed from: e */
    public final boolean f19182e;

    /* JADX INFO: renamed from: f */
    public final List f19183f;

    /* JADX INFO: renamed from: g */
    public final int f19184g;

    /* JADX INFO: renamed from: h */
    public final String f19185h;

    /* JADX INFO: renamed from: i */
    public final int f19186i;

    /* JADX INFO: renamed from: j */
    public final String f19187j;

    /* JADX INFO: renamed from: k */
    public final int f19188k;

    /* JADX INFO: renamed from: l */
    public final Integer f19189l;

    /* JADX INFO: renamed from: m */
    public final String f19190m;

    /* JADX INFO: renamed from: n */
    public final String f19191n;

    /* JADX INFO: renamed from: o */
    public final String f19192o;

    /* JADX INFO: renamed from: p */
    public final String f19193p;

    /* JADX INFO: renamed from: q */
    public final String f19194q;

    /* JADX INFO: renamed from: r */
    public final List f19195r;

    /* JADX INFO: renamed from: s */
    public final String f19196s;

    /* JADX INFO: renamed from: t */
    public final String f19197t;

    /* JADX INFO: renamed from: u */
    public final String f19198u;

    /* JADX INFO: renamed from: v */
    public final String f19199v;

    /* JADX INFO: renamed from: w */
    public final String f19200w;

    /* JADX INFO: renamed from: x */
    public final String f19201x;

    /* JADX INFO: renamed from: y */
    public final String f19202y;

    /* JADX INFO: renamed from: z */
    public final String f19203z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f19175C = new cs4[]{null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(24)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(25)), null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(26)), null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(27)), null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ LessonCard(int i, int i2, int i3, int i4, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List list, List list2, List list3, List list4, boolean z) {
        if (1041 != (i & 1041)) {
            n3c.m17204b(i, 1041, LessonCard$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19178a = str;
        int i5 = i & 2;
        EmptyList emptyList = EmptyList.f47638a;
        if (i5 == 0) {
            this.f19179b = emptyList;
        } else {
            this.f19179b = list;
        }
        if ((i & 4) == 0) {
            this.f19180c = emptyList;
        } else {
            this.f19180c = list2;
        }
        if ((i & 8) == 0) {
            this.f19181d = "";
        } else {
            this.f19181d = str2;
        }
        this.f19182e = z;
        if ((i & 32) == 0) {
            this.f19183f = emptyList;
        } else {
            this.f19183f = list3;
        }
        if ((i & 64) == 0) {
            this.f19184g = 0;
        } else {
            this.f19184g = i2;
        }
        if ((i & 128) == 0) {
            this.f19185h = "";
        } else {
            this.f19185h = str3;
        }
        if ((i & 256) == 0) {
            this.f19186i = 0;
        } else {
            this.f19186i = i3;
        }
        if ((i & 512) == 0) {
            this.f19187j = null;
        } else {
            this.f19187j = str4;
        }
        this.f19188k = i4;
        if ((i & 2048) == 0) {
            this.f19189l = -1;
        } else {
            this.f19189l = num;
        }
        if ((i & 4096) == 0) {
            this.f19190m = null;
        } else {
            this.f19190m = str5;
        }
        if ((i & 8192) == 0) {
            this.f19191n = "";
        } else {
            this.f19191n = str6;
        }
        if ((i & 16384) == 0) {
            this.f19192o = "";
        } else {
            this.f19192o = str7;
        }
        if ((32768 & i) == 0) {
            this.f19193p = null;
        } else {
            this.f19193p = str8;
        }
        if ((65536 & i) == 0) {
            this.f19194q = null;
        } else {
            this.f19194q = str9;
        }
        if ((131072 & i) == 0) {
            this.f19195r = emptyList;
        } else {
            this.f19195r = list4;
        }
        if ((262144 & i) == 0) {
            this.f19196s = null;
        } else {
            this.f19196s = str10;
        }
        if ((524288 & i) == 0) {
            this.f19197t = null;
        } else {
            this.f19197t = str11;
        }
        if ((1048576 & i) == 0) {
            this.f19198u = null;
        } else {
            this.f19198u = str12;
        }
        if ((2097152 & i) == 0) {
            this.f19199v = null;
        } else {
            this.f19199v = str13;
        }
        if ((4194304 & i) == 0) {
            this.f19200w = null;
        } else {
            this.f19200w = str14;
        }
        if ((8388608 & i) == 0) {
            this.f19201x = null;
        } else {
            this.f19201x = str15;
        }
        if ((16777216 & i) == 0) {
            this.f19202y = null;
        } else {
            this.f19202y = str16;
        }
        if ((33554432 & i) == 0) {
            this.f19203z = null;
        } else {
            this.f19203z = str17;
        }
        if ((67108864 & i) == 0) {
            this.f19176A = null;
        } else {
            this.f19176A = str18;
        }
        if ((i & 134217728) == 0) {
            this.f19177B = null;
        } else {
            this.f19177B = str19;
        }
    }

    /* JADX INFO: renamed from: g */
    public static LessonCard m8033g(LessonCard lessonCard, List list) {
        String str = lessonCard.f19178a;
        List list2 = lessonCard.f19179b;
        List list3 = lessonCard.f19180c;
        String str2 = lessonCard.f19181d;
        boolean z = lessonCard.f19182e;
        int i = lessonCard.f19184g;
        String str3 = lessonCard.f19185h;
        int i2 = lessonCard.f19186i;
        String str4 = lessonCard.f19187j;
        int i3 = lessonCard.f19188k;
        Integer num = lessonCard.f19189l;
        String str5 = lessonCard.f19190m;
        String str6 = lessonCard.f19191n;
        String str7 = lessonCard.f19192o;
        String str8 = lessonCard.f19193p;
        String str9 = lessonCard.f19194q;
        List list4 = lessonCard.f19195r;
        String str10 = lessonCard.f19196s;
        String str11 = lessonCard.f19197t;
        String str12 = lessonCard.f19198u;
        String str13 = lessonCard.f19199v;
        String str14 = lessonCard.f19200w;
        String str15 = lessonCard.f19201x;
        String str16 = lessonCard.f19202y;
        String str17 = lessonCard.f19203z;
        String str18 = lessonCard.f19176A;
        String str19 = lessonCard.f19177B;
        str.getClass();
        list2.getClass();
        list3.getClass();
        str2.getClass();
        return new LessonCard(i, i2, i3, num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, list2, list3, list, list4, z);
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: a */
    public final List mo8034a() {
        return this.f19183f;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: b */
    public final String mo8035b() {
        return this.f19181d;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: c */
    public final List mo8036c() {
        return this.f19179b;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: d */
    public final String mo8037d() {
        return this.f19178a;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: e */
    public final int mo8038e() {
        return this.f19184g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonCard)) {
            return false;
        }
        LessonCard lessonCard = (LessonCard) obj;
        return fa4.m11650l(this.f19178a, lessonCard.f19178a) && fa4.m11650l(this.f19179b, lessonCard.f19179b) && fa4.m11650l(this.f19180c, lessonCard.f19180c) && fa4.m11650l(this.f19181d, lessonCard.f19181d) && this.f19182e == lessonCard.f19182e && fa4.m11650l(this.f19183f, lessonCard.f19183f) && this.f19184g == lessonCard.f19184g && fa4.m11650l(this.f19185h, lessonCard.f19185h) && this.f19186i == lessonCard.f19186i && fa4.m11650l(this.f19187j, lessonCard.f19187j) && this.f19188k == lessonCard.f19188k && fa4.m11650l(this.f19189l, lessonCard.f19189l) && fa4.m11650l(this.f19190m, lessonCard.f19190m) && fa4.m11650l(this.f19191n, lessonCard.f19191n) && fa4.m11650l(this.f19192o, lessonCard.f19192o) && fa4.m11650l(this.f19193p, lessonCard.f19193p) && fa4.m11650l(this.f19194q, lessonCard.f19194q) && fa4.m11650l(this.f19195r, lessonCard.f19195r) && fa4.m11650l(this.f19196s, lessonCard.f19196s) && fa4.m11650l(this.f19197t, lessonCard.f19197t) && fa4.m11650l(this.f19198u, lessonCard.f19198u) && fa4.m11650l(this.f19199v, lessonCard.f19199v) && fa4.m11650l(this.f19200w, lessonCard.f19200w) && fa4.m11650l(this.f19201x, lessonCard.f19201x) && fa4.m11650l(this.f19202y, lessonCard.f19202y) && fa4.m11650l(this.f19203z, lessonCard.f19203z) && fa4.m11650l(this.f19176A, lessonCard.f19176A) && fa4.m11650l(this.f19177B, lessonCard.f19177B);
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: f */
    public final List mo8039f() {
        return this.f19180c;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m8040h() {
        int value = CardStatus.New.getValue();
        int value2 = CardStatus.Learned.getValue();
        int i = this.f19188k;
        return value <= i && i < value2;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f19184g, ux5.m22979b(g9a.m12428e(ux5.m22980c(ux5.m22979b(ux5.m22979b(this.f19178a.hashCode() * 31, 31, this.f19179b), 31, this.f19180c), this.f19181d, 31), 31, this.f19182e), 31, this.f19183f), 31);
        String str = this.f19185h;
        int iM24106b2 = wq1.m24106b(this.f19186i, (iM24106b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f19187j;
        int iM24106b3 = wq1.m24106b(this.f19188k, (iM24106b2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.f19189l;
        int iHashCode = (iM24106b3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f19190m;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19191n;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19192o;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f19193p;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f19194q;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list = this.f19195r;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.f19196s;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f19197t;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f19198u;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f19199v;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f19200w;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f19201x;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f19202y;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f19203z;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f19176A;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f19177B;
        return iHashCode16 + (str17 != null ? str17.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final LessonTransliteration m8041i() {
        String str = this.f19202y;
        String str2 = this.f19196s;
        if (str2 == null && this.f19197t == null && this.f19198u == null && this.f19199v == null && this.f19200w == null && this.f19201x == null && str == null && this.f19176A == null) {
            return null;
        }
        String str3 = this.f19203z;
        return new LessonTransliteration(str2, this.f19197t, this.f19198u, this.f19199v, this.f19200w, this.f19201x, (str == null && str3 == null) ? null : new LessonFurigana(str, str3), this.f19176A);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8042j() {
        int value = CardStatus.Ignored.getValue() + 1;
        int value2 = CardStatus.Learned.getValue();
        int i = this.f19188k;
        return value <= i && i < value2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonCard(term=");
        sb.append(this.f19178a);
        sb.append(", tags=");
        sb.append(this.f19179b);
        sb.append(", gTags=");
        wq1.m24130z(", termWithLanguage=", this.f19181d, ", isPhrase=", sb, this.f19180c);
        sb.append(this.f19182e);
        sb.append(", meanings=");
        sb.append(this.f19183f);
        sb.append(", importance=");
        hn1.m13361k(this.f19184g, ", fragment=", this.f19185h, ", id=", sb);
        hn1.m13361k(this.f19186i, ", url=", this.f19187j, ", status=", sb);
        sb.append(this.f19188k);
        sb.append(", extendedStatus=");
        sb.append(this.f19189l);
        sb.append(", lastReviewedCorrect=");
        AbstractC3393o1.m17725C(sb, this.f19190m, ", srsDueDate=", this.f19191n, ", notes=");
        AbstractC3393o1.m17725C(sb, this.f19192o, ", audio=", this.f19193p, ", meaningTerms=");
        hn1.m13366p(this.f19194q, ", words=", ", hiragana=", sb, this.f19195r);
        AbstractC3393o1.m17725C(sb, this.f19196s, ", romaji=", this.f19197t, ", pinyin=");
        AbstractC3393o1.m17725C(sb, this.f19198u, ", hant=", this.f19199v, ", hans=");
        AbstractC3393o1.m17725C(sb, this.f19200w, ", jyutping=", this.f19201x, ", chunk=");
        AbstractC3393o1.m17725C(sb, this.f19202y, ", furigana=", this.f19203z, ", latin=");
        return wq1.m24125u(sb, this.f19176A, ", creationDate=", this.f19177B, ")");
    }

    public LessonCard(int i, int i2, int i3, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List list, List list2, List list3, List list4, boolean z) {
        str.getClass();
        list.getClass();
        list2.getClass();
        str2.getClass();
        list3.getClass();
        this.f19178a = str;
        this.f19179b = list;
        this.f19180c = list2;
        this.f19181d = str2;
        this.f19182e = z;
        this.f19183f = list3;
        this.f19184g = i;
        this.f19185h = str3;
        this.f19186i = i2;
        this.f19187j = str4;
        this.f19188k = i3;
        this.f19189l = num;
        this.f19190m = str5;
        this.f19191n = str6;
        this.f19192o = str7;
        this.f19193p = str8;
        this.f19194q = str9;
        this.f19195r = list4;
        this.f19196s = str10;
        this.f19197t = str11;
        this.f19198u = str12;
        this.f19199v = str13;
        this.f19200w = str14;
        this.f19201x = str15;
        this.f19202y = str16;
        this.f19203z = str17;
        this.f19176A = str18;
        this.f19177B = str19;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LessonCard(String str, String str2, boolean z, List list, String str3, int i, int i2, Integer num, int i3) {
        String str4 = (i3 & 8) != 0 ? "" : str2;
        int i4 = i3 & 32;
        EmptyList emptyList = EmptyList.f47638a;
        List list2 = i4 != 0 ? emptyList : list;
        this(0, (i3 & 256) != 0 ? 0 : i, i2, (i3 & 2048) != 0 ? -1 : num, str, str4, (i3 & 128) != 0 ? "" : str3, null, null, "", "", null, null, null, null, null, null, null, null, null, null, null, null, emptyList, emptyList, list2, emptyList, z);
    }
}
