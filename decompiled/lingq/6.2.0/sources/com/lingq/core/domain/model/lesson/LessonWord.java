package com.lingq.core.domain.model.lesson;

import com.lingq.core.domain.model.token.TokenReadings;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.b25;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.w65;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonWord implements w65 {
    public static final C1455t Companion = new C1455t();

    /* JADX INFO: renamed from: p */
    public static final cs4[] f19313p;

    /* JADX INFO: renamed from: a */
    public final String f19314a;

    /* JADX INFO: renamed from: b */
    public final boolean f19315b;

    /* JADX INFO: renamed from: c */
    public final List f19316c;

    /* JADX INFO: renamed from: d */
    public final List f19317d;

    /* JADX INFO: renamed from: e */
    public final String f19318e;

    /* JADX INFO: renamed from: f */
    public final List f19319f;

    /* JADX INFO: renamed from: g */
    public final int f19320g;

    /* JADX INFO: renamed from: h */
    public final int f19321h;

    /* JADX INFO: renamed from: i */
    public final String f19322i;

    /* JADX INFO: renamed from: j */
    public final List f19323j;

    /* JADX INFO: renamed from: k */
    public final List f19324k;

    /* JADX INFO: renamed from: l */
    public final List f19325l;

    /* JADX INFO: renamed from: m */
    public final List f19326m;

    /* JADX INFO: renamed from: n */
    public final List f19327n;

    /* JADX INFO: renamed from: o */
    public final List f19328o;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f19313p = new cs4[]{null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(14)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(15)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(16)), null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(17)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(18)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(19)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(20)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(21)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new b25(22))};
    }

    public /* synthetic */ LessonWord(int i, int i2, int i3, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, boolean z) {
        if (257 != (i & 257)) {
            n3c.m17204b(i, 257, LessonWord$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19314a = str;
        if ((i & 2) == 0) {
            this.f19315b = false;
        } else {
            this.f19315b = z;
        }
        int i4 = i & 4;
        EmptyList emptyList = EmptyList.f47638a;
        if (i4 == 0) {
            this.f19316c = emptyList;
        } else {
            this.f19316c = list;
        }
        if ((i & 8) == 0) {
            this.f19317d = emptyList;
        } else {
            this.f19317d = list2;
        }
        if ((i & 16) == 0) {
            this.f19318e = "";
        } else {
            this.f19318e = str2;
        }
        if ((i & 32) == 0) {
            this.f19319f = emptyList;
        } else {
            this.f19319f = list3;
        }
        if ((i & 64) == 0) {
            this.f19320g = 0;
        } else {
            this.f19320g = i2;
        }
        if ((i & 128) == 0) {
            this.f19321h = 0;
        } else {
            this.f19321h = i3;
        }
        this.f19322i = str3;
        if ((i & 512) == 0) {
            this.f19323j = emptyList;
        } else {
            this.f19323j = list4;
        }
        if ((i & 1024) == 0) {
            this.f19324k = emptyList;
        } else {
            this.f19324k = list5;
        }
        if ((i & 2048) == 0) {
            this.f19325l = emptyList;
        } else {
            this.f19325l = list6;
        }
        if ((i & 4096) == 0) {
            this.f19326m = emptyList;
        } else {
            this.f19326m = list7;
        }
        if ((i & 8192) == 0) {
            this.f19327n = emptyList;
        } else {
            this.f19327n = list8;
        }
        if ((i & 16384) == 0) {
            this.f19328o = emptyList;
        } else {
            this.f19328o = list9;
        }
    }

    /* JADX INFO: renamed from: g */
    public static LessonWord m8073g(LessonWord lessonWord, List list) {
        String str = lessonWord.f19314a;
        boolean z = lessonWord.f19315b;
        List list2 = lessonWord.f19316c;
        List list3 = lessonWord.f19317d;
        String str2 = lessonWord.f19318e;
        int i = lessonWord.f19320g;
        int i2 = lessonWord.f19321h;
        String str3 = lessonWord.f19322i;
        List list4 = lessonWord.f19323j;
        List list5 = lessonWord.f19324k;
        List list6 = lessonWord.f19325l;
        List list7 = lessonWord.f19326m;
        List list8 = lessonWord.f19327n;
        List list9 = lessonWord.f19328o;
        str.getClass();
        list2.getClass();
        list3.getClass();
        str2.getClass();
        str3.getClass();
        return new LessonWord(str, z, list2, list3, str2, list, i, i2, str3, list4, list5, list6, list7, list8, list9);
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: a */
    public final List mo8034a() {
        return this.f19319f;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: b */
    public final String mo8035b() {
        return this.f19318e;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: c */
    public final List mo8036c() {
        return this.f19316c;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: d */
    public final String mo8037d() {
        return this.f19314a;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: e */
    public final int mo8038e() {
        return this.f19320g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonWord)) {
            return false;
        }
        LessonWord lessonWord = (LessonWord) obj;
        return fa4.m11650l(this.f19314a, lessonWord.f19314a) && this.f19315b == lessonWord.f19315b && fa4.m11650l(this.f19316c, lessonWord.f19316c) && fa4.m11650l(this.f19317d, lessonWord.f19317d) && fa4.m11650l(this.f19318e, lessonWord.f19318e) && fa4.m11650l(this.f19319f, lessonWord.f19319f) && this.f19320g == lessonWord.f19320g && this.f19321h == lessonWord.f19321h && fa4.m11650l(this.f19322i, lessonWord.f19322i) && fa4.m11650l(this.f19323j, lessonWord.f19323j) && fa4.m11650l(this.f19324k, lessonWord.f19324k) && fa4.m11650l(this.f19325l, lessonWord.f19325l) && fa4.m11650l(this.f19326m, lessonWord.f19326m) && fa4.m11650l(this.f19327n, lessonWord.f19327n) && fa4.m11650l(this.f19328o, lessonWord.f19328o);
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: f */
    public final List mo8039f() {
        return this.f19317d;
    }

    /* JADX INFO: renamed from: h */
    public final TokenReadings m8074h() {
        if (this.f19323j == null && this.f19324k == null && this.f19325l == null && this.f19326m == null && this.f19327n == null && this.f19328o == null) {
            return null;
        }
        return new TokenReadings(this.f19323j, this.f19324k, this.f19325l, this.f19326m, this.f19327n, this.f19328o);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f19321h, wq1.m24106b(this.f19320g, ux5.m22979b(ux5.m22980c(ux5.m22979b(ux5.m22979b(g9a.m12428e(this.f19314a.hashCode() * 31, 31, this.f19315b), 31, this.f19316c), 31, this.f19317d), this.f19318e, 31), 31, this.f19319f), 31), 31), this.f19322i, 31);
        List list = this.f19323j;
        int iHashCode = (iM22980c + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f19324k;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f19325l;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f19326m;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f19327n;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f19328o;
        return iHashCode5 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonWord(term=");
        sb.append(this.f19314a);
        sb.append(", isPhrase=");
        sb.append(this.f19315b);
        sb.append(", tags=");
        hn1.m13372v(sb, this.f19316c, ", gTags=", this.f19317d, ", termWithLanguage=");
        hn1.m13366p(this.f19318e, ", meanings=", ", importance=", sb, this.f19319f);
        hn1.m13360j(this.f19320g, this.f19321h, ", id=", ", status=", sb);
        hn1.m13366p(this.f19322i, ", romaji=", ", hiragana=", sb, this.f19323j);
        hn1.m13372v(sb, this.f19324k, ", pinyin=", this.f19325l, ", hant=");
        hn1.m13372v(sb, this.f19326m, ", hans=", this.f19327n, ", jyutping=");
        return hn1.m13356f(sb, this.f19328o, ")");
    }

    public LessonWord(String str, boolean z, List list, List list2, String str2, List list3, int i, int i2, String str3, List list4, List list5, List list6, List list7, List list8, List list9) {
        str.getClass();
        list.getClass();
        list2.getClass();
        str2.getClass();
        list3.getClass();
        str3.getClass();
        this.f19314a = str;
        this.f19315b = z;
        this.f19316c = list;
        this.f19317d = list2;
        this.f19318e = str2;
        this.f19319f = list3;
        this.f19320g = i;
        this.f19321h = i2;
        this.f19322i = str3;
        this.f19323j = list4;
        this.f19324k = list5;
        this.f19325l = list6;
        this.f19326m = list7;
        this.f19327n = list8;
        this.f19328o = list9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LessonWord(String str, boolean z, List list, List list2, List list3, int i, String str2, List list4, List list5, List list6, List list7, List list8, List list9, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        int i3 = i2 & 4;
        EmptyList emptyList = EmptyList.f47638a;
        this(str, z2, i3 != 0 ? emptyList : list, (i2 & 8) != 0 ? emptyList : list2, "", (i2 & 32) != 0 ? emptyList : list3, (i2 & 64) == 0 ? 1 : 0, i, str2, (i2 & 512) != 0 ? emptyList : list4, (i2 & 1024) != 0 ? emptyList : list5, (i2 & 2048) != 0 ? emptyList : list6, (i2 & 4096) != 0 ? emptyList : list7, (i2 & 8192) != 0 ? emptyList : list8, (i2 & 16384) != 0 ? emptyList : list9);
    }
}
